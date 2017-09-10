package com.apex.bank.registration.bo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apex.bank.registration.dao.BankDAOImpl;
import com.apex.bank.registration.vo.BankVO;

@Service
public class BankServiceImpl implements BankService {
	
	@Autowired
	private BankDAOImpl bankDAO = null;
	
	@Override
	public void addBankInfo(BankVO bvo) throws Exception {
		System.out.println("BankServiceImpl:addBankInfo(bvo)----start");
		try {
			bankDAO.addBankInfo(bvo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("BankServiceImpl:addBankInfo(bvo)---- end");
		
	}

	@Override
	public List<BankVO> getAllBankInfo() {
		System.out.println("BankServiceImpl:getAllBankInfo()----start");
		
		return bankDAO.getAllBankInfo();
	}

	@Override
	public ArrayList<BankVO> editBankInfo(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteBankInfo(String firstName) {
		// TODO Auto-generated method stub
		return 0;
	}

}
