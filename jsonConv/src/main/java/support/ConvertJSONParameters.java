package support;

import java.text.ParseException;

import org.json.JSONArray;
import org.json.JSONObject;

public class ConvertJSONParameters {
	public JSONArray ConvertJSONParametersTypes(String JSONpassato, String JSONparametri) throws ParseException {
		JSONArray jarrayPassato = new JSONArray(JSONpassato);
		JSONArray jsonArrayParametri = new JSONArray(JSONparametri);
		for(int contParam=0;contParam<jsonArrayParametri.length();contParam++) {
			String campo = jsonArrayParametri.getJSONObject(contParam).getString("name");
			String tipoCampo = jsonArrayParametri.getJSONObject(contParam).getString("type");
			for(int contElem=0;contElem<jarrayPassato.length();contElem++) {
				System.out.println(contElem);
				JSONObject job=jarrayPassato.getJSONObject(contElem);
				if(job.has(campo)) {
					System.out.println("campo : "+campo+", tipo campo : "+tipoCampo+ ", numeroParametro : "+contParam);
					CastingClass.convertParameter(job,campo , tipoCampo);
					System.out.println(job.toString());

				}
			}
			
		}
		return null;

	}

}
