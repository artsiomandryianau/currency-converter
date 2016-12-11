package test;

import static org.junit.Assert.*;

import java.math.BigDecimal;


import org.junit.Before;
import org.junit.Test;

import model.Curency;
import service.CurencyRatesDownloader;

public class CurencyRatesDownloaderTest {

	private CurencyRatesDownloader classUnderTest;

	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		classUnderTest = new CurencyRatesDownloader();
	}

	@Test
	public void testDownload() throws Exception {
		BigDecimal rate = classUnderTest.downloadRate(Curency.USD, Curency.PLN);
		
		assertNotNull(rate);
		
		
	}
}