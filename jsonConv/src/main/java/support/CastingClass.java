package support;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.json.JSONObject;

public class CastingClass {
	public static void convertParameter(JSONObject jobToConvert, String nomeParametroDaCambiare,
			String tipoDelParametro) throws ParseException {
		String valoreData="";
		switch (tipoDelParametro) {
		case "datetime":
			/*
			 * String valoreData = jobToConvert.getString(nomeParametroDaCambiare);
			 * System.out.println(valoreData); // parte conversione Data SimpleDateFormat
			 * formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
			 * java.util.Date data = formatter.parse(valoreData);
			 * jobToConvert.remove(nomeParametroDaCambiare);
			 * jobToConvert.put(nomeParametroDaCambiare, data);
			 * System.out.println(jobToConvert.toString());
			 */
			break;
		case "integer":
			 valoreData = jobToConvert.getString(nomeParametroDaCambiare);
			int foo = Integer.parseInt(valoreData);
			jobToConvert.remove(nomeParametroDaCambiare);
			jobToConvert.put(nomeParametroDaCambiare, foo);
			break;
		case "double":
			 valoreData = jobToConvert.getString(nomeParametroDaCambiare);
			double fooD = Double.parseDouble(valoreData);
			jobToConvert.remove(nomeParametroDaCambiare);
			jobToConvert.put(nomeParametroDaCambiare, fooD);
			break;
		}

	}

}
