package co.justhype.qa.testcases;

import co.justhype.qa.base.TestBase;
import co.justhype.qa.pages.LoginPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {



        public static Logger log = LogManager.getLogger(LoginPageTest.class.getName());
        public LoginPage loginpage;


        public LoginPageTest(){
            super();

        }

        @BeforeTest
        public void setup(){
            intialization();
            loginpage = new LoginPage();
            log.info("Driver is initialized");


        }

        @Test
        public void LoginPageTitle(){
            log.info("Validating the Login Page title here");
            String Title = loginpage.validateLoginPageTitle();
            Assert.assertEquals(Title,"HYPE® - The Official HYPE® Website | Justhype ltd");

        }





        @Test
        public void SignInUsingemail(){
            loginpage.validateLoginFunctionality() ;



        }


        @Test
        public void ValidateAddAddressFunctionality(){
            loginpage.addNewAddress();

        }
        @AfterTest

        public void TearDown(){

            driver.quit();
        }
    }


