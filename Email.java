//5th Question
public class Email{
    static boolean isValid(String email){
        String regex="^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(regex);
    }
    public static void main(String args[]){
        String email="test01*gmail.com";
        System.out.println(isValid(email));
    }
}