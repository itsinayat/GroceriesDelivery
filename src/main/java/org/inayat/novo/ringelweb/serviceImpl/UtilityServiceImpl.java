package org.inayat.novo.ringelweb.serviceImpl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.inayat.novo.ringelweb.dao.UserDao;
import org.inayat.novo.ringelweb.dao.UtilityDao;
import org.inayat.novo.ringelweb.daoImpl.UserDaoImpl;
import org.inayat.novo.ringelweb.daoImpl.UtilityDaoImpl;
import org.inayat.novo.ringelweb.model.CelebrationModel;
import org.inayat.novo.ringelweb.model.HelpTextModel;
import org.inayat.novo.ringelweb.model.ReportUserModel;
import org.inayat.novo.ringelweb.service.UtilityService;

public class UtilityServiceImpl implements UtilityService {

	@Override
	public HelpTextModel getHelpText() {
		UtilityDao dao = new UtilityDaoImpl();
		HelpTextModel helptext = dao.getHelpText();
		return helptext;
	}

	@Override
	public CelebrationModel getCelebration() throws ParseException {
		UtilityDao dao = new UtilityDaoImpl();
		CelebrationModel model = dao.getCelebrationDetails(parseDate(new Date()));
		return model;
	}

	@Override
	public String parseDate(Date date) {

		String dateStr = date.toString();
		DateFormat readFormat = new SimpleDateFormat("E MMM dd HH:mm:ss Z yyyy");
		DateFormat writeFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = null;
		try {
			date1 = readFormat.parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		String formattedDate = "";
		if (date1 != null) {
			formattedDate = writeFormat.format(date1);
		}

		return formattedDate;
	}

	@Override
	public ReportUserModel reportUser(ReportUserModel model) {
		System.out.println("Entered in UtilityServiceImpl.report user.");
		UtilityDao dao = new UtilityDaoImpl();
		model.setCreatedon(new Date());
		if(model.getReportFrom()>0) {
		model.setIsExistingUser(true);
		model = dao.reportByRegisteredUser(model);
		}else {
			model.setIsExistingUser(false);
			model=dao.reportByUnregisteredUser(model);
		}
		
		return model;
	}

}
