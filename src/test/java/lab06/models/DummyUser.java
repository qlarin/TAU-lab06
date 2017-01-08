package lab06.models;

import java.util.UUID;

public class DummyUser {

    private String firstname;
    private String lastname;
    private String phone;
    private String username;
    private String email;
    private String password;
    private String uuid;

    public DummyUser() {
        uuid = generateUUID();
        firstname = "test firstname";
		lastname = "test lastname";
		phone = "48999888777";
		username = "test" + uuid;
		email = "test" + uuid + "@test.pl";
		password = "test1234";
    }

    public String getFirstName() {
        return firstname;
    }

    public String getLastName() {
        return lastname;
    }

    public String getPhone() {
        return phone;
    }

    public String getUserName() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    private String generateUUID() {
        return UUID.randomUUID().toString().substring(0, 8);
    } 
}