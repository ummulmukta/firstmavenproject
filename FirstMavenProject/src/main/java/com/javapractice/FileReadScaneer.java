package com.javapractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

public class FileReadScaneer {

	public static void main(String[] args) throws Throwable, Throwable {
		 PDDocument document = PDDocument.load(new File("./TextFile/Interview Questions - Selenium (1)3.pdf"));

	            document.getClass();

	            if (!document.isEncrypted()) {
				
	                PDFTextStripperByArea stripper = new PDFTextStripperByArea();
	                stripper.setSortByPosition(true);

	                PDFTextStripper tStripper = new PDFTextStripper();

	                String pdfFileInText = tStripper.getText(document);
	                //System.out.println("Text:" + st);

					// split by whitespace
	                String lines[] = pdfFileInText.split("\\r?\\n");
	                for (String line : lines) {
	                    System.out.println(line);
	                }
		String s ="driver";
	//FileInputStream fis=new FileInputStream (document);
Scanner sc=new Scanner((Readable) document);
int c=0;


while(sc.hasNextLine()) {
	Pattern p=Pattern.compile(s);
	Matcher m=p.matcher(sc.nextLine());
	while(m.find()) {
		System.out.println(m.group().trim());
		c=c+1;
	}
	//System.out.println(m.group().trim());
}
	System.out.println("times "+c);
}

	

}}
