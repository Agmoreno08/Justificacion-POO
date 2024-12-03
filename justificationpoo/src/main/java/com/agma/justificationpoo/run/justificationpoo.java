package com.agma.justificationpoo.run;

import org.openxava.util.*;



public class justificationpoo {

	public static void main(String[] args) throws Exception {
		DBServer.start("justificationpoo-db"); // Para usar tu propia base de datos comenta esta línea y configura src/main/webapp/META-INF/context.xml
		AppServer.run("justificationpoo"); // Usa AppServer.run("") para funcionar en el contexto raíz
	}

}
