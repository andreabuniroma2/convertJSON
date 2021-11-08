package jsonConvert.jsonConv;

import java.text.ParseException;

import support.ConvertJSONParameters;

public class MainConverrtJSONParameters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConvertJSONParameters convertingClass= new ConvertJSONParameters();
		String json=" [\r\n"
				+ "        {\r\n"
				+ "            \"NUMEROFATTURA\": \"522100699999\",\r\n"
				+ "            \"DATAEMISSIONEFATTURA\": \"2021-09-02T00:00:00.000Z\",\r\n"
				+ "            \"SOCIETA\": \"1111\",\r\n"
				+ "            \"STATUS\": \"OK\",\r\n"
				+ "            \"DATA_INSERT\": \"2021-09-03T19:00:00.000Z\",\r\n"
				+ "            \"MATERIALIZED_VIEW_TIMESTAMP\": \"2021-10-29T09:11:15.321Z\",\r\n"
				+ "            \"PROVADOUBLE\":\"345.34536\"\r\n"
				+ "        }\r\n"
				+ "    ]";
		String parametri="[\r\n"
				+ "            {\r\n"
				+ "                \"name\": \"PROVADOUBLE\",\r\n"
				+ "                \"type\": \"double\"\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"name\": \"NUMEROFATTURA\",\r\n"
				+ "                \"type\": \"string\"\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"name\": \"DATAEMISSIONEFATTURA\",\r\n"
				+ "                \"type\": \"string\"\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"name\": \"STATUS\",\r\n"
				+ "                \"type\": \"string\"\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"name\": \"DATA_INSERT\",\r\n"
				+ "                \"type\": \"datetime\"\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"name\": \"MATERIALIZED_VIEW_TIMESTAMP\",\r\n"
				+ "                \"type\": \"datetime\"\r\n"
				+ "            },\r\n"
				+ "            {\r\n"
				+ "                \"name\": \"SOCIETA\",\r\n"
				+ "                \"type\": \"integer\"\r\n"
				+ "            }\r\n"
				+ "        ]";
		try {
			convertingClass.ConvertJSONParametersTypes(json, parametri);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				

	}

}
/*Attualmente il programma è in grado di cambiare solo coloro che sono esplicitamente stringhe, altrimenti da errore.
 * VINCOLI:
 * 1 bisogna stare attenti che all'interno dei parametri da passare non ci siano duplicati in conflitto
 * DA SISTEMARE:
 * Controllare il tipo che si sta parsando es. se è già integer non fare nessun c
 */
