package pages;

import control.Button;
import control.CheckBox;
import control.TextBox;
import org.openqa.selenium.By;

/**
 * @autor : eynar.pari
 * @date : 02/10/2020.
 **/
public class LoginPage {

    public TextBox emailTextBox= new TextBox(By.xpath("//*[@id=\"email\"]"),"[email] textbox on Login Modal Page");
    public TextBox passwordTextBox= new TextBox(By.xpath("//*[@id=\"password\"]"),"[password] textbox on Login Modal Page");
    public Button signupButton= new Button(By.xpath("//*[@id=\"login_form\"]/button"),"[signup] button on Login Modal Page");

    public LoginPage(){}

}

