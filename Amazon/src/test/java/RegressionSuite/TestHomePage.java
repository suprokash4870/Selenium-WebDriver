package RegressionSuite;

import Regression.HomePage;
import org.testng.annotations.Test;

public class TestHomePage extends HomePage {

    @Test
    public void SignInWithValidCredentials()  {

        clickAccount();
        SignIn();
        WriteValidUserName("");
        WriteValidPassword("");
    }
}
