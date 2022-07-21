package com.account;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {
	Account account =new Account();
	@Test
	void testdebit() {
		assertEquals(1900.0,account.debit(200, 2100.0f));
	}

}
