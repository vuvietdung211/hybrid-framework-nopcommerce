package javaOOP;

public class Topic_06_Getter_Setter {
	private String personName;
	private String personAge;
	private int personPhone;
	

	private String personBankAccountAmount;
	
	public void getPersonName(String personName) {
		if (personName==null || personName.isEmpty() || personName.isBlank()) {
			throw new IllegalArgumentException("Ten khong hop le");
		} else {
			this.personName = personName;
		}
	}
	
	private int getPersonPhone() {
		return personPhone;
	}

	private void setPersonPhone(int personPhone) {
		if (String.valueOf(personPhone).startsWith("0")) {
			throw new IllegalArgumentException("SDT phải bắt đầu bằng số 0");
		} else if (personPhone < 10 || personPhone >11) {
			throw new IllegalArgumentException("SDT phải từ 10 - 11 số");
		} else {
			this.personPhone = personPhone;
		}
	}


}
