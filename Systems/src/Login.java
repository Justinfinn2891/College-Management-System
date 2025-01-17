public class Login {
    // BARE MINIMUM
    // ADD USE OF DATABASE (NOT SURE YET)
    // ADD SECURITY (HASHING PATTERNS AND SALT)
    // ADD SPECIFIC SPECIFICATIONS AND FIRST FAIL ATTEMPT
    
    private static boolean CredentialChecker(String userName, String passwordString){

        // SQL CODE ENTER HERE 
        if(userName == "Jack" && passwordString == "123")
            return true;
        else{
            return false; 
        }

    }

    public static void login(){

        String userName = "Jack", passwordString = "123";

        boolean checker = CredentialChecker(userName, passwordString);

        if(checker){
            System.out.println("You are logged in!");
        }
        else{
            System.out.println("Try Again!");
        }

    }
}
