package com.alejandroaraya.ds.chicagoanalysis;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.alejandroaraya.ds.chicagoanalysis.models.ElasticWorkerArray;
import com.alejandroaraya.ds.chicagoanalysis.models.Worker;


public class CSVReader {

    /**
     *
     * @param args
     */
   public static void main(String[] args){

       String dataCsvFileLocation = "C:\\Users\\aleja\\OneDrive\\Desktop\\Progra project\\data.csv";
       String csvSeparator = ",";
       String line = "";

       ElasticWorkerArray workers = new ElasticWorkerArray();

       try(BufferedReader bufferedReader = new BufferedReader(new FileReader(dataCsvFileLocation))){
        //Here it is the code which read the file
        while ((line = bufferedReader.readLine()) != null){
            line += " ";
            String[] person = line.split(csvSeparator);
            Worker personObj = new Worker(
                    person[1], person[0], person[2], person[3], person[4],
                    person[5], person[6], person[7], person[8]
            );
            workers.addWorker(personObj);
        }//while

           Facts fact = new Facts(workers.getWorkerArray());

       } catch(FileNotFoundException fileNotFoundException){
           System.out.println("The file provided is not valid");
       } catch (IOException ioException){
           //Here goes the code which execute if the file reader fail
        ioException.printStackTrace();
       } //catch ends


       System.out.println();


   }//Main Method ends ------------------------------------------------------


}// Class CSVReader Ends ------------------------
