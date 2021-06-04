package tests;

import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InformacoesUsuarioTest {
    @Test
    public void testAdicionarUmaInformacaoAdicionalDoUsuario() {
        //Abrindo o navegador
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\90\\chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().window().maximize();

        //Navegando para a página do Taskit!
        navegador.get("http://www.juliodelima.com.br/taskit");

        //Clicar no link que possui o texto "Sign in"

        //Clicar no campo com name "login" que está dentro do formulário de id "signinbox"

        //Digitar no campo com name "login" que está dentro do formulário de id "signinbox" o texto "natalia@teste.com"

        //Clicar no campo com name "password" que está dentro do formulário de id "signinbox"

        //Digitar no campo com name "password" que está dentro do formulário de id "signinbox" o texto "natalia"

        //Clicar no link com o texto "SIGN IN"

        //Validar que dentro do elemento com class "me" está o texto "Hi, Natália"

        //Fechar o navegador

        //Validação
        assertEquals(1,1);
    }
}
