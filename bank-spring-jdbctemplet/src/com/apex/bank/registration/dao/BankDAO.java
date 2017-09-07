package com.apex.bank.registration.dao;

import java.util.ArrayList;
import java.util.List;

import com.apex.bank.registration.vo.BankVO;


public interface BankDAO {
	public void addBankInfo(BankVO bvo)throws Exception;
	public List<BankVO> getAllBankInfo();
	//public ArrayList<BankVO> editBankInfo(String firstName);
	//public int deleteBankInfo (String firstName);
}
