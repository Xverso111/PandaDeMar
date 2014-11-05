package com.pco.signature.timer;

import org.junit.Test;

import com.pco.signature.Signer;

import static org.mockito.Mockito.*;

public class SignerTimerTaskTest {
	
	SignerTimerTask signerTask= new SignerTimerTask();
	
	@Test
	public void shouldGenerateErrorOnInvalidDir(){
		signerTask.setSourceDir(Constants.NO_DIRECTORY);
		signerTask.run();
	}
	
	@Test
	public void shouldValidateDirectory(){
		signerTask.setSourceDir("sourceDirectory");
		signerTask.setFileBlock(10);
		signerTask.setTargetDir("signedDirectory");
		Signer signer = new Signer();
		signer.inicializar("certificateDir//prueba.p12", "JdsAcR321");
		signerTask.setSignature(signer);
		signerTask.run();
	}
}
