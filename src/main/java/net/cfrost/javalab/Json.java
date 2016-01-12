package net.cfrost.javalab;

public class Json {

    public static String getKeyValue(String jsonStr, String key){
        key = "\"" + key + "\"";
        String unit=null;
        String value="";
        if(jsonStr.indexOf(key)>0){
            System.out.println("jsonStr:"+jsonStr);
            unit=jsonStr.substring(jsonStr.indexOf(key+":"));
            unit=unit.substring(0, unit.indexOf("\",\"")+1);
            System.out.println("unit:"+unit);
            value=unit.substring(key.length()+1);
            System.out.println("value:"+value);
            if(value.startsWith("\"") && value.endsWith("\"")){
                value=value.substring(1, value.length()-1);
            }
        }
        return value;
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String jsonStr = "[\"key\":\"value\",\"key2\":\"123\",\"key3\":1234]";
        String value = Json.getKeyValue(jsonStr, "key2");
        System.out.println(value);
    }

}
