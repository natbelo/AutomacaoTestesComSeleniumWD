package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class InformacoesUsuarioTest {
    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario() {
        //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\90\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();
        navegador.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        //Navegando para a página do Taskit!
        navegador.get("http://www.juliodelima.com.br/taskit");

        //Clicar no link que possui o texto "Sign in"
        navegador.findElement(By.linkText("Sign in")).click();

        //Identificando o formulário de Login
        WebElement formularioSignInBox = navegador.findElement(By.id("signinbox"));

        //Digitar no campo com name "login" que está dentro do formulário de id "signinbox" o texto "natalia@teste.com"
        formularioSignInBox.findElement(By.name("login")).sendKeys("natalia@teste.com");

        //Digitar no campo com name "password" que está dentro do formulário de id "signinbox" o texto "natalia"
        formularioSignInBox.findElement(By.name("password")).sendKeys("natalia");

        //Clicar no link com o texto "SIGN IN"
        navegador.findElement(By.linkText("SIGN IN")).click();

        //Validar que dentro do elemento com class "me" está o texto "Hi, Natália"
        WebElement me = navegador.findElement(By.className("me"));
        String textoNoElementoMe = me.getText();
        assertEquals("Hi, Natália", textoNoElementoMe);

        //Fechar o navegador
        navegador.quit();

    }
}
