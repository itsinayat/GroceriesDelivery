package org.inayat.novo.ringelweb.service;

import java.text.ParseException;
import java.util.Date;

import org.inayat.novo.ringelweb.model.CelebrationModel;
import org.inayat.novo.ringelweb.model.HelpTextModel;
import org.inayat.novo.ringelweb.model.ReportUserModel;

public interface UtilityService {
	public HelpTextModel getHelpText();

	public ReportUserModel reportUser(ReportUserModel model);

	public CelebrationModel getCelebration() throws ParseException;

	public String parseDate(Date date);

}
