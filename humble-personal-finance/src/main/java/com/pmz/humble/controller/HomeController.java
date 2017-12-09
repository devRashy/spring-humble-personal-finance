package com.pmz.humble.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.pmz.humble.dao.TransactionDAO;
import com.pmz.humble.dao.UserDAO;
import com.pmz.humble.model.Transaction;

/**
 * @author pasko
 *
 */
@Controller
public class HomeController {
	
	private static final Logger LOG = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private TransactionDAO transactionDAO;
	
	@Autowired
	private UserDAO userDAO;
	
	@GetMapping(value= {"/","/home"})
	public String getIndex() {
		List<Transaction> transactions = transactionDAO.getAllTransactionsOfUserForYesterday(7);
		
		for(Transaction transaction:transactions) {
			LOG.info("Transaction: {}", transaction.toString());
		}
		
		return "home";
	}
		
}
