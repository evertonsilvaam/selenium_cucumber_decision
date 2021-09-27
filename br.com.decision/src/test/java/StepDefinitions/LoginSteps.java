package StepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class LoginSteps {
	static ChromeDriver driver;
	
	@Dado("o usuario acessa o menu dados do veiculo")
	public void o_usuario_acessa_o_menu_dados_do_veiculo() {
//		String projectPath = System.getProperty("user.dir");
//		System.setProperty("webdriver.chrome.driver", projectPath+"/src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://sampleapp.tricentis.com/101/app.php");
		
	}

	@Quando("o usuario preenche todos os dados do veiculo")
	public void o_usuario_preenche_todos_os_dados_do_veiculo() {
		WebElement selectElementMake = driver.findElement(By.id("make"));
        Select selectObject1 = new Select(selectElementMake);
        selectObject1.selectByVisibleText("Nissan");
        WebElement selectElementModel = driver.findElement(By.id("model"));
        Select selectObject2 = new Select(selectElementModel);
        selectObject2.selectByVisibleText("Scooter");
        driver.findElement(By.id("entervehicledata")).click();
        driver.findElement(By.id("cylindercapacity")).sendKeys("100");
        driver.findElement(By.id("engineperformance")).sendKeys("100");
        driver.findElement(By.id("dateofmanufacture")).sendKeys("01/01/2021");
        WebElement selectElementSeats = driver.findElement(By.id("numberofseats"));
        Select selectObject3 = new Select(selectElementSeats);
        selectObject3.selectByVisibleText("3");
        driver.findElement(By.xpath("//div[7]/p/label[1]//span")).click();
        if (!driver.findElement(By.xpath("//div[7]/p/label[1]//span")).isSelected()) {
            driver.findElement(By.xpath("//div[7]/p/label[1]//span")).click();
        }
        WebElement selectElementNumMot = driver.findElement(By.id("numberofseatsmotorcycle"));
        Select selectObject4 = new Select(selectElementNumMot);
        selectObject4.selectByVisibleText("3");
        WebElement selectElementFuel = driver.findElement(By.id("fuel"));
        Select selectObject5 = new Select(selectElementFuel);
        selectObject5.selectByVisibleText("Diesel");
        driver.findElement(By.id("payload")).sendKeys("100");
        driver.findElement(By.id("totalweight")).sendKeys("100");
        driver.findElement(By.id("listprice")).sendKeys("1000");
        driver.findElement(By.id("licenseplatenumber")).sendKeys("100");
        driver.findElement(By.id("annualmileage")).sendKeys("100");
        driver.findElement(By.id("nextenterinsurantdata")).click();
	}

	@Entao("o menu Enter Ensurance Data deve ser exibido")
	public void o_menu_enter_ensurance_data_deve_ser_exibido() {
		System.out.println("Menu Enter Ensurance Data Exibido");
	
	}

	@Dado("o usuario acessa o menu de informações do cliente")
	public void o_usuario_acessa_o_menu_de_informações_do_cliente() {
		System.out.print("Menu Enter Assurance");
	
	}

	@Quando("o usuario preenche todos os dados do cliente")
	public void o_usuario_preenche_todos_os_dados_do_cliente() {
		driver.findElement(By.id("firstname")).sendKeys("firstname");
        driver.findElement(By.id("lastname")).sendKeys("lastname");
        driver.findElement(By.id("birthdate")).sendKeys("01/01/1990");
        driver.findElement(By.id("streetaddress")).sendKeys("12 Street");
        driver.findElement(By.xpath("//div[4]/p/label[1]/span")).click();
        if (!driver.findElement(By.xpath("//div[4]/p/label[1]/span")).isSelected()) {
            driver.findElement(By.xpath("//div[4]/p/label[1]/span")).click();
        }
        WebElement selectElementCountry = driver.findElement(By.id("country"));
        Select selectObject6 = new Select(selectElementCountry);
        selectObject6.selectByVisibleText("Brazil");
        driver.findElement(By.id("zipcode")).sendKeys("69000100");
        driver.findElement(By.id("city")).sendKeys("Manaus");
        WebElement selectElementOccupation = driver.findElement(By.id("occupation"));
        Select selectObject7 = new Select(selectElementOccupation);
        selectObject7.selectByVisibleText("Farmer");
        WebElement checkbox = driver.findElement(By.xpath("//div[10]/p/label[2]/span"));
        checkbox.click();
        driver.findElement(By.id("website")).sendKeys("www.google.com");
        driver.findElement(By.id("nextenterproductdata")).click();
	}

	@Entao("o menu Enter Product Data deve ser exibido")
	public void o_menu_enter_product_data_deve_ser_exibido() {
		System.out.println("O Menu Dados do Produto Exibido");
	}

	@Dado("o usuario acessa o menu dados do produto")
	public void o_usuario_acessa_o_menu_dados_do_produto() {
		System.out.println("Menu Dados do Produto Exibido");
	
	}

	@Quando("o usuario preenche todos os dados do produto")
	public void o_usuario_preenche_todos_os_dados_do_produto() {
		WebDriverWait wait = new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("startdate")));
		
		WebElement href = driver.findElement(By.id("startdate"));
		wait.until(ExpectedConditions.elementToBeClickable(href));
		href.click();
		
		driver.findElement(By.id("startdate")).sendKeys("01/01/2025");
        Select oSelect = new Select(driver.findElement(By.id("insurancesum")));
        oSelect.selectByValue("7000000");
        WebElement selectElementMeritrating = driver.findElement(By.id("meritrating"));
        Select selectObject8 = new Select(selectElementMeritrating);
        selectObject8.selectByVisibleText("Bonus 5");
        WebElement selectElementDamageinsurance = driver.findElement(By.id("damageinsurance"));
        Select selectObject9 = new Select(selectElementDamageinsurance);
        selectObject9.selectByVisibleText("No Coverage");
        WebElement checkbox1 = driver.findElement(By.xpath("//div[5]/p/label[1]/span"));
        checkbox1.click();
        WebElement selectElementCourtesycar = driver.findElement(By.id("courtesycar"));
        Select selectObject10 = new Select(selectElementCourtesycar);
        selectObject10.selectByVisibleText("No");
        driver.findElement(By.id("nextselectpriceoption")).click();
		
	}

	@Entao("o menu Select Price Option deve ser exibido")
	public void o_menu_select_price_option_deve_ser_exibido() {
		System.out.println("Menu Select Price Exibido");

	}

	@Dado("o usuario acessa o menu Opcoes de Preco")
	public void o_usuario_acessa_o_menu_opcoes_de_preco() {
		System.out.println("Menu Select Price Exibido");
	
	}

	@Quando("o usuario seleciona o preco")
	public void o_usuario_seleciona_o_preco() {
		driver.findElement(By.xpath("//th[2]/label[2]/span")).click();
        driver.findElementById("nextsendquote").click();
        
        WebElement nextBtn = driver.findElement(By.id("nextsendquote"));
        Actions actionProvider = new Actions(driver);
        actionProvider.doubleClick(nextBtn).build().perform();
        
	}

	@Entao("o menu Send Quote deve ser exibido")
	public void o_menu_send_quote_deve_ser_exibido() {
		System.out.println("Menu Send Quote");
		
	}

	@Dado("o usuario acessa o menu Enviar Contacao")
	public void o_usuario_acessa_o_menu_enviar_contacao() {
		System.out.println("Menu Send Quote");
		
	}

	@Quando("o usuario preenche todos os dados de contato do cliente")
	public void o_usuario_preenche_todos_os_dados_de_contato_do_cliente() {
		driver.findElement(By.id("email")).sendKeys("usuario@gmail.com");
        driver.findElement(By.id("phone")).sendKeys("559944446666");
        driver.findElement(By.id("username")).sendKeys("username");
        driver.findElement(By.id("password")).sendKeys("Password@12345");
        driver.findElement(By.id("confirmpassword")).sendKeys("Password@12345");
        driver.findElement(By.id("Comments")).sendKeys("no comments");
        driver.findElement(By.id("sendemail")).click();
	
	}

	@Entao("uma mensagem de e-mail enviado com sucesso")
	public void uma_mensagem_de_e_mail_enviado_com_sucesso() {
		try {
			Thread.sleep(15000);
			System.out.println("Thread 2");
			String parentWindowHandler = driver.getWindowHandle();
			String subWindowHandler = null;

			Set<String> handles = driver.getWindowHandles();
			Iterator<String> iterator = handles.iterator();
			while (iterator.hasNext()){
			    subWindowHandler = iterator.next();
			}
			driver.switchTo().window(subWindowHandler);	
	    	driver.findElementById("site-content");
	    	assertEquals("Sending e-mail success!", driver.findElements(By.tagName("h2")).get(0).getText());
	    	System.out.println(driver.findElements(By.tagName("h2")).get(0).getText());
	    	System.out.println("Final");
	    	driver.switchTo().window(parentWindowHandler);
	    	driver.close();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	
	}
	
	
	
	
}
