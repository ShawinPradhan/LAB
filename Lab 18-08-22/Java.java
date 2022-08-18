package batchapplication;

public class Java {
	private int stdId;
	private String stdName;
	private int phno;
	private String email;
	
	
	public int getStdId() {
		return stdId;
	}


	public void setStdId(int stdId) {
		this.stdId = stdId;
	}


	public String getStdName() {
		return stdName;
	}


	public void setStdName(String stdName) {
		this.stdName = stdName;
	}


	public int getPhno() {
		return phno;
	}


	public void setPhno(int phno) {
		this.phno = phno;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Java(int stdId, String stdName, int phno, String email) {
		super();
		this.stdId = stdId;
		this.stdName = stdName;
		this.phno = phno;
		this.email = email;
	}


	@Override
	public String toString() {
		return "Java [stdId=" + stdId + ", stdName=" + stdName + ", phno=" + phno + ", email=" + email + "]";
	}


	public static void main(String[] args) {
		
	}

}
