package travelaround.Project.AmazingBank;

public class User {
    public String useName;
    public String password;
    public String userAdreess;

    public User(String useName, String password) {
        this.useName = useName;
        this.password = password;
        this.userAdreess = "124 North Kent Stree Tempe AZ 98702";
    }

    public String getPassword() {
        return password;
    }

    public String getUseName() {
        return useName;
    }
}
