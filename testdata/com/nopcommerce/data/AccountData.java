package com.nopcommerce.data;

import java.io.File;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

import commons.GlobalConstants;

public class AccountData {

	public static AccountData getAccountData() {
		try {
			ObjectMapper mapper = new ObjectMapper();
			mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
			return mapper.readValue(new File(GlobalConstants.DATA_PATH + "Account.json"), AccountData.class);
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

	static class Login {
		@JsonProperty("emailAddress")
		private String emailAddress;

		@JsonProperty("webEmail")
		private String webEmailServer;

		@JsonProperty("password")
		private String password;

		@JsonProperty("firstname")
		private String firstName;

		@JsonProperty("lastname")
		private String lastName;
	}

	@JsonProperty("Login")
	private Login login;

	@JsonProperty("address")
	private String address;

	@JsonProperty("city")
	private String city;

	public String getEmailAddress() {
		return login.emailAddress;
	}

	public String getWebEmail() {
		return login.webEmailServer;
	}

	public String getpassword() {
		return login.password;
	}

	public String getFirstname() {
		return login.firstName;
	}

	public String getLastName() {
		return login.lastName;
	}

	public String getCity() {
		return city;
	}

	public String getAddress() {
		return address;
	}

	public String getFullName() {
		return login.firstName + " " + login.lastName;
	}
}
