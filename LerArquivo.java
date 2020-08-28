package lerarquivo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import java.util.Scanner;

public class LerArquivo {

	public static void leitor(String path) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(path));
		String linha = "";
	   FileWriter arq = new FileWriter("C:\\Users\\userid\\Desktop\\teste.dsv");
      PrintWriter file = new PrintWriter(arq);
      int i =0;
		while (true) {
			if (linha != null) {
            file.printf(linha+"%n");
            if(i==10000){
               file.printf("commit; %n");
               i=0;
              
            }

				//System.out.println(linha);
            i++;

			} else
				break;
			linha = buffRead.readLine();
		}
	   file.printf("commit; %n");
		buffRead.close();
      file. close();
	}

	public static void escritor(String path) throws IOException {
		BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		String linha = "";
		Scanner in = new Scanner(System.in);
		System.out.println("Escreva algo: ");
		linha = in.nextLine();
		buffWrite.append(linha + "\n");
		buffWrite.close();
	}
   
   public static void main(String args[])

{
      try
      {
         LerArquivo.leitor("C:\\Users\\userid\\Desktop\\catcod_Normal.dsv");
      }
      catch (IOException e)
      {
         // TODO
      }
   }
}
