package org.inayat.novo.ringelweb.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import org.inayat.novo.ringelweb.dao.UserDao;
import org.inayat.novo.ringelweb.model.FaqModel;
import org.inayat.novo.ringelweb.model.GfBfDataModel;
import org.inayat.novo.ringelweb.model.MessageModel;
import org.inayat.novo.ringelweb.model.UserModel;

public class UserDaoImpl implements UserDao {

	// login
	@Override
	public UserModel doAuthenticate(UserModel userModel) {
		SessionFactory factory = new Configuration().configure().addAnnotatedClass(UserModel.class)
				.buildSessionFactory();
		Session session = factory.openSession();

		try {
			session.beginTransaction();
			String hql = "select user.id from user_table user where user.username=:username or user.email=:email or user.mobile=:mobile and user.password=:password";
			System.out.println(hql);
			Query query = session.createQuery(hql);
			query.setParameter("username", userModel.getUsername());
			query.setParameter("email", userModel.getEmail());
			query.setParameter("mobile", userModel.getMobile());
			query.setParameter("password", userModel.getPassword());
			List result = query.list();
			System.out.println("resultset:" + result);

			if (result.size() > 0) {
				int id = (int) result.get(0);
				userModel = getUserDataByUserId(id);
				userModel.setSuccess(true);
				userModel.setReturnedMsg("Logged in successfully");
				userModel.setException("No exception");
				return userModel;
			}
		} catch (Exception e) {
			if (session.getTransaction() != null) {
				session.getTransaction().rollback();
				userModel.setException(e.toString());
				return userModel;
			}
		} finally {
			session.close();
		}
		userModel.setReturnedMsg("wrong username/password");
		userModel.setSuccess(false);

		return userModel;
	}

	// registration
	public UserModel doSave(UserModel model) {
		System.out.println("Entered in userDaoImpl:doSave.");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();

		try {
			if (model.getId() > 0) {
				System.out.println("Entered in userDaoImpl:doSave|saveOrUpdate");
				session.saveOrUpdate(model);
			} else {
				System.out.println("Entered in userDaoImpl:doSave|save");
			Integer	generatedId =(Integer) session.save(model);
				model.setId(generatedId);
			}
			

			session.getTransaction().commit();
			model.setSuccess(true);
		} catch (Exception e) {
			model.setSuccess(false);
			model.setException(e.toString());
			model.setReturnedMsg("Error Saving Data");
		} finally {
			session.close();
			factory.close();
		}
		return model;

	}

	@Override
	public UserModel getUserDataByUserId(int id) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		UserModel model = new UserModel();
		try {
			session.beginTransaction();

			String hql = "from user_table where id = :id";
			System.out.println(hql);
			Query query = session.createQuery(hql);
			query.setParameter("id", id);
			// List result = query.list();
			List<UserModel> list = query.list();
			return list.get(0);

		} catch (Exception e) {
			if (session.getTransaction() != null) {
				session.getTransaction().rollback();
				model.setException(e.toString());
				model.setReturnedMsg("Error getting result");
				return model;
			}
		} finally {
			session.close();
		}
		return model;
	}

	@Override
	public String getPasswod(String username, String secretans) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		String password = null;
		try {
			session.beginTransaction();

			String hql = "select password from user_table where username = :username OR mobile = :username OR email = :username and secretans = :secretans";
			System.out.println(hql);
			Query query = session.createQuery(hql);
			query.setParameter("username", username);
			query.setParameter("secretans", secretans);
			List<String> list = query.list();
			if(list.size()>0) {
			password = list.get(0);
			}else password= "User '"+username+"' Not Found!";  
		} catch (HibernateException e) {
			if (session.getTransaction() != null) {
				session.getTransaction().rollback();
			}
		} finally {
			session.close();
		}
		return password;
	}

	@Override
	public GfBfDataModel saveGfBfData(GfBfDataModel gfBfDataModel) {
		System.out.println("Entered in userDaoImpl:saveGfBfData.");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
 
		try {
			if (gfBfDataModel.getId() 	> 0) {
				System.out.println("Entered in userDaoImpl:doSavegfbfdata|saveOrUpdate");
				session.saveOrUpdate(gfBfDataModel);
			} else {
				System.out.println("Entered in userDaoImpl:doSavegfbfdata|save");
				Integer	generatedId = (Integer) session.save(gfBfDataModel);
				gfBfDataModel.setId(generatedId);
			}

			session.getTransaction().commit();
			gfBfDataModel.setSuccess(true);

		} catch (Exception e) {
			gfBfDataModel.setSuccess(false);
			gfBfDataModel.setException(e.toString());
			gfBfDataModel.setReturnedmsg("caught exception-" + e.toString());
		} finally {
			session.close();
			factory.close();
		}
		return gfBfDataModel;

	}

	@Override
	public List<FaqModel> getFaq() {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		UserModel model = new UserModel();
		List<FaqModel> list=null;
		try {
			session.beginTransaction();

			String hql = "from faq_table";
			System.out.println(hql);
			Query query = session.createQuery(hql);
			list = query.list();
			return list;

		} catch (Exception e) {
			if (session.getTransaction() != null) {
				session.getTransaction().rollback();
				model.setException(e.toString());
				model.setReturnedMsg("Error getting result");
				return list;
			}
		} finally {
			session.close();
		}
		return list;
	
	}

	@Override
	public MessageModel sendMessage(MessageModel message) {

		System.out.println("Entered in userDaoImpl:send Message.");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();

		try {
			Integer	generatedId =(Integer) session.save(message);
			message.setMsgid(generatedId);
			session.getTransaction().commit();
			message.setSuccess(true);
			message.setReturnedMsg("Message Sent Successfully!");
		} catch (Exception e) {
			message.setSuccess(false);
			message.setException(e.toString());
			message.setReturnedMsg("Error sending message:cause-exception");
		} finally {
			session.close();
			factory.close();
		}
		return message;

	
	}

}
