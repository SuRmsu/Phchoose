package com.surm.phchoose;

import com.surm.phchoose.entity.Phone;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest()
class PhChooseApplicationTests {

	@Autowired
	private Phone phone;
	@Test
	void testGetId() {
		phone.setId("surm");
		System.out.println(phone.getId());
	}

}
