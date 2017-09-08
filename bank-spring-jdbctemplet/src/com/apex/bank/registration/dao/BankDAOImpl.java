package com.apex.bank.registration.dao;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.apex.bank.registration.vo.BankVO;

@Repository
public class BankDAOImpl implements BankDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplet;

	public JdbcTemplate getJdbcTemplet() {
		return jdbcTemplet;
	}
	
	@Override
	public void addBankInfo(BankVO bvo) throws Exception {
		String sql = "insert into user (id,firstName, middleName, lastName, gender, address, city, state, country, phone, bankName, accountNumber, ssn)values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
		int i = getJdbcTemplet().update(sql, new Object[]{bvo.getId(), bvo.getFirstName(), bvo.getMiddleName(), bvo.getLastName(), bvo.getGender(),
				bvo.getAddress(), bvo.getCity(), bvo.getState(), bvo.getCountry(), bvo.getPhone(),
				bvo.getBankName(), bvo.getAccountNumber(), bvo.getSsn()});
		
	}

	@Override
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public List<BankVO> getAllBankInfo() {
		String sql = "select * from user";
		List<BankVO> bvo = getJdbcTemplet().query(sql, new BeanPropertyRowMapper(BankVO.class));
		return bvo;
	}

	/*@Override
	public ArrayList<BankVO> editBankInfo(String firstName) {
		ArrayList<BankVO> list = new ArrayList<BankVO>();
		try{
			Connection con = getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from user where firstName = '" + firstName + "' ");
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()){
				BankVO bvo = new BankVO();
				
				bvo.setFirstName(rs.getString("firstName"));
				bvo.setMiddleName(rs.getString("middleNname"));
				bvo.setLastName(rs.getString("lastName"));
				bvo.setGender(rs.getString("gender"));
				bvo.setAddress(rs.getString("address"));
				bvo.setCity(rs.getString("city"));
				bvo.setState(rs.getString("state"));
				bvo.setCountry(rs.getString("country"));
				bvo.setPhone(rs.getString("phone"));
				bvo.setBankName(rs.getString("bankName"));
				bvo.setAccountNumber(rs.getString("accountNumber"));
				bvo.setSsn(rs.getString("ssn"));
				
				
				list.add(bvo);
			}
		}catch (Exception e) {
				System.out.println(e);
		}
		return list;
	}

	@Override
	public int deleteBankInfo(String firstName) {
		int i = 0;
		try{
			Connection con = getConnection();
			
			PreparedStatement pstmt = con.prepareStatement("delete from user where firstName = '" + firstName + "' ");
			i = pstmt.executeUpdate();
			
			con.close();
		}catch (Exception e){
			System.out.println(e);
		}
		return i;
	}*/

}
