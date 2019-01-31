package org.inayat.novo.ringelweb.dao;

import org.inayat.novo.ringelweb.model.CelebrationModel;
import org.inayat.novo.ringelweb.model.HelpTextModel;
import org.inayat.novo.ringelweb.model.ReportUserModel;

public interface UtilityDao {
	
public HelpTextModel getHelpText();

public CelebrationModel getCelebrationDetails(String string) ;


public ReportUserModel reportByRegisteredUser(ReportUserModel model);

public ReportUserModel reportByUnregisteredUser(ReportUserModel model);

}
