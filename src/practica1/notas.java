
package practica1;
import java.util.Scanner;
/**
 * Esta clase nos permite ver que parametros vamos a utilizar 
 * @author Dani
 *
 */


public class notas {
	
	//declaramos la variables que nos hacen falta
	
	/**
	 *@param uf1 - valor nota 1
	 *@param uf2 - valor nota 2
	 *@param uf3 - valor nota 3
	 *@param acu1 - valor acumulado 1
	 *@param acu2 - valor acumulado 2
	 *@param acu3 - valor acumulado 3
	 *@param def - valor de acu1,acu2,acu3
	 */
	double nota1, nota2, nota3;
	double acu1, acu2, acu3, def;
	//utilizames scaner para poder introducir datos
	Scanner entrada = new Scanner(System.in);
	
	///vamos ca crear un metodo para ingresar 
	

	
	/**
	 * Metodo que permite ingresar los parametros mediante la entrada del usuario 
	 */
	public void IngresaNotas() {
		
		//cuando ejeuctamos este metodo lo primnero que queremos es que nos pida notas
		System.out.println("ingrese las notas del estudiante");
		
		System.out.print("ingrese nota 1: ");
		
		nota1= entrada.nextDouble();

		
		
		System.out.print("ingrese nota 2: ");
		
		nota2= entrada.nextDouble();
		System.out.print("ingrese nota 3: ");
		
		nota3= entrada.nextDouble();
		
	
	}
	
	// metodo para comprobar bien entroduccion de notas
	
	
	/**
	 *  Metodo para comprobar que la nota ingresa es menor a 10 o si es mayor
	 */
	public void comprobarcion(){
		
		if (nota1>10) {
			System.out.println(" nota1 mal introducida");
			
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (nota2>10) {
			System.out.println(" nota2 mal introducida");
			
		}else {
			System.out.println(" nota2 correcta");
		}
		if (nota3>10) {
			System.out.println(" nota3 mal introducida");
			
		}else {
			System.out.println(" nota3 correcta");
		}
		
			
		
		
	}
	// metodo para calcular nota
	
	/**
	 * Metodo que calcula las notas y las guarda en otros parametros @acu1 , @acu2 , @acu3
	 * Tambien guarda las 3 en un parametro @def
	 */
	public void Calculonotas() {
		acu1= nota1*0.35;
		acu2 = nota2 * 0.35;
		acu3 = nota3 * 0.30;
		
		def = acu1 + acu2+ acu3;
		
		//hasta aqui la tenemos calculada pero no la mostramos
	}
	/**
	 * Metodo por el cual mostramos las notas introducidas como las acumuladas y la definitiva
	 */
	public void Mostrar() {
		//print ln lo que hace es que al terminar el print baja la linea
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + nota1);
		System.out.println(" nota2 = " + nota2);
		System.out.println(" nota3 = " + nota3);
		
		System.out.println(" acumuado 1 = "+ acu1);
		System.out.println(" acumuado 2 = "+ acu2);
		System.out.println(" acumuado 3 = "+ acu3);
		
		System.out.println(" nota definitiva es = "+ def);
		
	}

	/**
	 * Metodo por el cual comprobamos si el resultado de @def es suspenso o aprobado
	 */
	public void aprobado() {
			
			if(def<5 && def>=0) {
				System.out.println("suspendido");
			}else {
				if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
				}else {
					System.out.println(" error en la notas");
				}
			}
		}
		
		
/**
 * Esta clase es la clase principal del sistema donde se ejecutaran los metodos
 * @author Dani
 *
 */

	
	public static void main(String[] args) {
		// creamos mecanimos para llamar a cualquier metodo fuero de la clase
		notas fc= new notas();
		
		fc.IngresaNotas();
		
		fc.comprobarcion();
		

		fc.Calculonotas();
		
		fc.Mostrar();
		
		fc.aprobado();
		
	}

}
