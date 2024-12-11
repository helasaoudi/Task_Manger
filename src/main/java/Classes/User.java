package Classes;

public class User {
    private int id;
    private String name;
    private String email;
    private String Password ;

    
    public User(int id, String name, String email, String password ) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.Password=password ;
    }


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}
	
    

}
