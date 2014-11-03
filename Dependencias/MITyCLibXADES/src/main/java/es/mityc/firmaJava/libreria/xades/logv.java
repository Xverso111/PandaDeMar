/**
 * Copyright 2013 Ministerio de Industria, Energía y Turismo
 *
 * Este fichero es parte de "Componentes de Firma XAdES".
 *
 * Licencia con arreglo a la EUPL, Versión 1.1 o –en cuanto sean aprobadas por la Comisión Europea– versiones posteriores de la EUPL (la Licencia);
 * Solo podrá usarse esta obra si se respeta la Licencia.
 *
 * Puede obtenerse una copia de la Licencia en:
 *
 * http://joinup.ec.europa.eu/software/page/eupl/licence-eupl
 *
 * Salvo cuando lo exija la legislación aplicable o se acuerde por escrito, el programa distribuido con arreglo a la Licencia se distribuye «TAL CUAL»,
 * SIN GARANTÍAS NI CONDICIONES DE NINGÚN TIPO, ni expresas ni implícitas.
 * Véase la Licencia en el idioma concreto que rige los permisos y limitaciones que establece la Licencia.
 */
package es.mityc.firmaJava.libreria.xades;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import es.mityc.firmaJava.libreria.ConstantesXADES;

/**
 * Esquemas de firma XAdES
 * 
 */
public class logv {

	private  static BufferedOutputStream f = null;
	private  static boolean tieneError = false;
	private  static StringBuffer logsstart = null;
	private  static StringBuffer logsend = null;
	private  static StringBuffer logsb = null;
	
	// nombreFile: xml a validar
	static void createFile (String nombreFile) {
		
		return;
	}
	
	static void cierraLog() {
		
		return;
	}
	
	static void error(String error) {
		return;
	}
	
	static void info(String info) {
		return;
	}
	
	static void error(String error, int tabs) {
		return;
	}
	
	static void info(String info, int tabs) {
		return;
	}
	
	static void abreTag(boolean resultado) {
		return;
	}
	
	static void cierraTag(boolean resultado) {
		return;
	}
}
