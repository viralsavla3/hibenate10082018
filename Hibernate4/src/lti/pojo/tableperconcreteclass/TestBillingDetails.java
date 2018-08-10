package lti.pojo.tableperconcreteclass;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import lti.pojo.BankAccount;
import lti.pojo.CreditCard;
import lti.util.HibernateUtil;

public class TestBillingDetails {

	@Test
	public void testCase1() {
		Session session = HibernateUtil.getSession();
		Transaction tx = session.beginTransaction();

		BankAccount bankAcc = new BankAccount();
		bankAcc.setOwner("Polo");
		bankAcc.setNumber("92345");
		bankAcc.setBankName("ICICI Bank");

		CreditCard creditCard = new CreditCard();
		creditCard.setOwner("Polo");
		creditCard.setNumber("999934567890");
		creditCard.setType("VISA");
		creditCard.setExpiryMonth("12");
		creditCard.setExpiryYear("2099");
		
		session.save(bankAcc);
		session.save(creditCard);
		
		tx.commit();
	}
}
