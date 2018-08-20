package Tarea;

import java.util.Scanner;

public class Tarea3_200715051 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner entrada = new Scanner(System.in);
		
		Scanner nomUsu = new Scanner(System.in);
		
		Scanner entrada2 = new Scanner(System.in);
		
		Scanner entrada3 = new Scanner(System.in);
		
		Scanner entra1 = new Scanner(System.in);
		
		Scanner entra2 = new Scanner(System.in);
		
		int opcion,opcionUsu,OpcionCont,opcionProm,opcionCal,contador,numbuscar,num1,num2,num3;
		
		opcion=0;
		opcionUsu=0;
		opcionCal=0;
		OpcionCont=0;
		opcionProm=0;
		
		num1=0;
		num2=0;
		num3=0;
		
		System.out.println("IPC1_200715051");
		System.out.println();
		
		do {//MENU PRINCIPAL--------------------------------------------------------------------------------------------------------
			
		System.out.println("1. Usuarios.");
		System.out.println("2. Contador de numeros repetido.");
		System.out.println("3. Tres numeros de mayor a menor.");
		System.out.println("4. Calcular promedio.");
		System.out.println("5. Salir");
		
		
		opcion = entrada.nextInt();
			
		switch(opcion) {
		
		case 1:// MENU USUARIOS-------------------------------------------------------------------------------------------------------
			
			opcionUsu=0;
			
			String [] usuario = new String [5];	
			
			do {
			
			System.out.println(
					  "1. Ingresar Usuario: \n"
					+ "2. Mostrar Usuarios Ascendente: \n"
					+ "3. Mostrar Usuarios Descendete: \n"
					+ "4. Regresar al Menu Pricipal"
					);
			
			opcionUsu = entrada.nextInt();
			
			switch(opcionUsu) {
			
			case 1:
				
				System.out.println("Ingrese 5 usuarios");
				
			for(int i = 0; i<5; i++) {
				
				usuario[i]=nomUsu.nextLine();
				
				if(i==1) {
					
					if(usuario[1].equals(usuario[0])==true) {
						
					System.out.println("Error");
					usuario[i]=nomUsu.nextLine();
					}
				}

				if(i==2) {	
					
					if(usuario[2].equals(usuario[1])==true || usuario[2].equals(usuario[0])==true) {
					
					System.out.println("Error");
					usuario[i]=nomUsu.nextLine();
					}
				}
				
				
				if(i==3){
					
					if(usuario[3].equals(usuario[2])==true || usuario[3].equals(usuario[1])==true
					|| usuario[3].equals(usuario[0])==true ) {
					
					System.out.println("Error");
					usuario[i]=nomUsu.nextLine();
					}
				}
				
				if(i==4) {
					
					if(usuario[4].equals(usuario[3])==true || usuario[4].equals(usuario[2])==true
					|| usuario[4].equals(usuario[1])==true || usuario[4].equals(usuario[0])==true ) {
					
					System.out.println("Error");
					usuario[i]=nomUsu.nextLine();
					}
				}
			}
			
			break;
				
			case 2:
			
			for(String imprimir:usuario) {
					
					System.out.println(imprimir);
				}
			
			System.out.println();
			
			break;	
			
			case 3:
				
				for(int j = 4; j>=0;j--) {
					
					System.out.println(usuario[j]);
				}
				
				System.out.println();
			}
			
			}while(opcionUsu!=4);
			
			
		break;//FIN MENU USUARIOS
			
		case 2://MENU CONTADOR--------------------------------------------------------------------------------------------------------------
			
			numbuscar=0;
			contador=0;
			
			String numRegis=" ";
			
		do {
			
		System.out.println(
				  "1. Ingresar Numero: \n"
				+ "2. Ingreasar numero a buscar: \n"
				+ "3. Mostrar cantidad de digitos: \n"
				+ "4. Regresar al Menu Pricipal"
						);

		
		opcionCal=entrada2.nextInt();
		
		switch(opcionCal) {
		
		case 1:
			
			System.out.println("Ingrese numero");
			
			numRegis=entrada3.nextLine();
			
			break;
			
		case 2:
			
			System.out.println("Ingrese el digito que desea buscar:");
			
			numbuscar= entrada2.nextInt()-1;
			
			System.out.println("El digito es: " + numRegis.charAt(numbuscar));
			
			break;
			
		case 3:
			
			for(int k = 0 ;k< numRegis.length();k++) {
				
				contador++;
			}
			
			System.out.println("El numero tiene " + contador + " digitos.");
			
			break;
			
		case 4:
			
			break;
			
		default:
			
			System.out.println("Error.");
			break;
		
		
		}
		}while(opcionCal!=4);	
		
		break;// FIN MENU CONTADOR
			
		case 3://MENU ORDEN NUMEROS------------------------------------------------------------------------------------------------------------
			
			do {
				
				System.out.println(
						
						  "1. Ingresar numero: \n"
						+ "2. Mostrar orden: \n"
						+ "3. Regresar al Menu Pricipal"
								);
				
				OpcionCont=entra1.nextInt();
				
				switch(OpcionCont) {
				
				case 1:
					
					System.out.println("Ingrese tres numeros diferentes:");
					
					num1=entra1.nextInt();
					
					num2=entra1.nextInt();
					
					num3=entra1.nextInt();
					
					System.out.println("Los numeros han sido ingresados de forma exitosa.");
					
					System.out.println();
					
					break;
					
				case 2:
					
					if(num1>num2 && num1>num3) {
						
						if(num2<num3) {
							
							System.out.println(num1 + "\n" + num3 + "\n" +num2);
						}
						
						else if(num3<num2) {
							
							System.out.println(num1 +"\n" + num2 +"\n" + num3);
							
						}
					}
					
					else if(num2>num1 && num2>num3) {
						
						if(num1<num3) {
							
							System.out.println(num2 +"\n"+ num3 +"\n"+num1);
						}
						
						else if(num3<num1) {
							
							System.out.println(num2 +"\n" + num1 +"\n" + num3);
							
						}
						
					}
					
					else if(num3>num1 && num3>num2) {
						
						if(num1<num2) {
							
							System.out.println(num3 +"\n"+ num2 +"\n"+num1);
						}
						
						else if(num2<num1) {
							
							System.out.println(num3 +"\n" + num1 +"\n" + num2);
							
						}
					}
					
					System.out.println();
					break;
					
					
				case 3: 
					
					break;
				default:
					
					System.out.println("Opcion invalida");
					
					break;
					
				}
				
				
				
				}while(OpcionCont!=3);
			
			break;// FIN MENU ORDEN NUMEROS
			
		case 4://PROMEDIOS---------------------------------------------------------------------------------------------------------------
			
				
			do {
			
			System.out.println(
					  "1. Calcular Promedio: \n"
					+ "2.Menu Principal."	
							);
			
			opcionProm=entrada.nextInt();
							
			int[][] matrix = new int[6][6];
			
			if(opcionProm==1) {
			System.out.println("Ingrese las notas que desea promediar:");
			
			for(int m = 0; m<6; m++) {
				
				matrix[m][0]= m+1;
				
				for(int n = 1;n<5;n++) {
					
					matrix[m][n]=entra2.nextInt();
								
					}
					
				matrix[m][5] =((matrix[m][1]+matrix[m][2]+matrix[m][3]+matrix[m][4])/4);;
					
				//System.out.println("el promedio es "+ matrix[m][5]);
					
				}			
				
			
			for(int [] promedio:matrix) {
				
				for(int imprime: promedio) {
					
					System.out.print(imprime + " ");
					
				}
				System.out.println();
			}
			
			System.out.println();
			
			}
			

			else if(opcionProm!=1 && opcionProm!=2){
				
				System.out.println("Opcion invalida.");
			}
			
			}while(opcionProm!=2);
				
			
				break;
			
		case 5:
			
			break;
			
		default:
			
			System.out.println("Opcion invalida.");
			
			break;//FIN PROMEDIOS---------------------------------------------------------------------------------------------------------
			
			}
		}while(opcion!=5);
		
		
		System.exit(0);
	}

}
