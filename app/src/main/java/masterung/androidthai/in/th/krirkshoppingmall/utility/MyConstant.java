package masterung.androidthai.in.th.krirkshoppingmall.utility;

public class MyConstant {

    //    About URL
    private String urlAddUserString = "http://androidthai.in.th/kir/addDataUng.php";
    private String urlGetAllUserString = "http://androidthai.in.th/kir/getAllUserUng.php";


    //    Abour Array
    private String[] columnUser = new String[]{"id", "Name", "User", "Password", "Mode"};


    public String[] getColumnUser() {
        return columnUser;
    }

    public String getUrlGetAllUserString() {
        return urlGetAllUserString;
    }

    public String getUrlAddUserString() {
        return urlAddUserString;
    }
}   // Main Class
