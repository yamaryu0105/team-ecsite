package jp.co.internous.sunflower.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import jp.co.internous.sunflower.model.domain.dto.PurchaseHistoryDto;
import jp.co.internous.sunflower.model.mapper.TblPurchaseHistoryMapper;
import jp.co.internous.sunflower.model.session.LoginSession;

@Controller
@RequestMapping("/sunflower/history")
public class PurchaseHistoryController {
	
	@Autowired
	private LoginSession loginSession;
	
	@Autowired
	private TblPurchaseHistoryMapper tblPurchaseHistoryMapper;

	@RequestMapping("/")
	public String index(Model m) {
		long userId = loginSession.getUserId();
		List<PurchaseHistoryDto> historyList = tblPurchaseHistoryMapper.findHistory(userId);
		
		m.addAttribute("historyList", historyList);
		
		m.addAttribute("loginSession",loginSession);
		
		return "purchase_history";
	
	}
	
	
	@RequestMapping("/delete")
	@ResponseBody
	public boolean delete() {
		long userId = loginSession.getUserId();
		long result = tblPurchaseHistoryMapper.logicalDeleteHistory(userId);
		
		return result > 0;
		
	}
	
}
