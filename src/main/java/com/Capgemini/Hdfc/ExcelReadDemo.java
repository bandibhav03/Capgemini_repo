package com.Capgemini.Hdfc;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

 

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

 

public class ExcelReadDemo {

              public static void main(String[] args) throws IOException {

                             File f;

                             FileInputStream fis;

                             XSSFWorkbook wb;

                             XSSFSheet sh;

                            

                             try {

                                           f = new File("C:\\Users\\banbhask\\eclipse-workspace\\Hdfc2\\Book1.xlsx");
                                           

                                           fis = new FileInputStream(f);

                                           wb = new XSSFWorkbook(fis);

                                           sh = wb.getSheetAt(0);

//                                        String value = sh.getRow(2).getCell(1).getStringCellValue();

//                                        System.out.println(value);

                                          

                                           System.out.println("Row count : " + sh.getLastRowNum());

                                           System.out.println("Column count : " +sh.getRow(0).getLastCellNum());

                                          

                                           for(int r=0; r<=sh.getLastRowNum(); r++) {

                                                          for(int c=0; c<sh.getRow(0).getLastCellNum(); c++) {

                                                                   System.out.print(sh.getRow(r).getCell(c).getStringCellValue() + " ");

                                                          }

                                                          System.out.println();

                                           }
                             } catch (IOException e) {

                                           e.printStackTrace();
                             }
              }
}