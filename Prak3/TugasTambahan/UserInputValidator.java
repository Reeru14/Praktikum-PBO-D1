public class UserInputValidator {
    
    public static void validateUsername(String username) {
        assert username.length() >= 5 && username.length() <= 20 : "Panjang Username antara 5 sampai 20 karakter";
        assert username.matches("[a-zA-Z][a-zA-Z0-9_]+") : "Username tidak valid";
    }
  
    public static void validateEmail(String email) {
        assert email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$") : "Email tidak valid";
    }
  
    public static void validateAge(int age) {
        assert (age < 100 && age > 16) : "Umur harus lebih dari 17 tahun dan kurang dari 100 tahun"; 
    }
}
