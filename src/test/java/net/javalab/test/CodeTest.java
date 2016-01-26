package net.javalab.test;

import static net.cfrost.javalab.util.PrintTool.print;
import static net.cfrost.javalab.util.PrintTool.printLine;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;












import javax.xml.crypto.Data;

import net.javalab.test.dao.TestDao;
import net.javalab.test.dao.TestDaoo;
import net.javalab.test.domain.A;
import net.javalab.test.domain.B;
//import net.javalab.test.domain.CrewReport;
import net.javalab.test.domain.FuelRecord_vrSector;
import net.javalab.test.domain.OptObjectForVr;
import net.javalab.test.domain.VoyageRecordDetail_vrSector;
import net.javalab.test.domain.VoyageRecordSummary_vrSector;
import net.javalab.test.domain.VrDetailLHS;
import net.javalab.test.domain.VrDetailRHS;
import net.sf.json.JSONObject;
//import net.javalab.test.biz.VrRefactorBiz;

public class CodeTest {

    public static void main(String[] args) throws ParseException, InterruptedException {
        
        Long num = 9999L;
        Date date = new Date();
        A a = new A();
        B b = new B();
        TestDaoo TestDaoo = new TestDaoo();
        Type type = TestDaoo.getClass().getGenericSuperclass();
        printLine(((ParameterizedType)type).getActualTypeArguments()[0]);
        
//        List<Long>  crewLinkLines = new ArrayList<Long>();
//        for(long i = 0 ; i<21; i++){
//            crewLinkLines.add(i);
//        }
//        
//
//        printLine("result:" + sqlInTest(crewLinkLines));
    }
    
    private static List<Long> sqlInTest(List<Long> crewLinkLines) {
        int sqlInSize = 10;
        if(crewLinkLines.size()<=sqlInSize) {
            printLine("Less than sqlInSize:" + crewLinkLines);
            return crewLinkLines;
        } else {
            List<Long> crewLinkLineList = new ArrayList<Long>(crewLinkLines);
            List<Long> lessThan1000 = new ArrayList<Long>();
            List<Long> moreThan1000 = new ArrayList<Long>();
            List<Long> returnList = new ArrayList<Long>();
            int count = 0;
            for(Long crewLinkLine : crewLinkLineList){
                if(count < sqlInSize){
                    lessThan1000.add(crewLinkLine);
                }else{
                    moreThan1000.add(crewLinkLine);
                }
                count++;
            }
            returnList.addAll(sqlInTest(lessThan1000));
            returnList.addAll(sqlInTest(moreThan1000));
            printLine("More than sqlInSize:" + returnList);
            return returnList;
        }
        // TODO Auto-generated method stub
        
    }

    /*
     * 形参传递方式测试 结论： Java中形参永远是值传递： 基本变量传递变量值（复制一份新的），函数内修改不影响函数外的值
     * 对象传递对象地址值（复制一份新的，所以两个变量指向同一地址），函数内修改影响函数外的值
     */
    public static void functionArgsTest() {
        CodeTest codeTest = new CodeTest();
        List<Integer> intList = codeTest.getIntList();
        print("List befort someOtherFunction: ");
        printLine(intList);
        codeTest.someOtherFunction(intList);
        print("List after someOtherFunction: ");
        printLine(intList);
    }

    private List<Integer> getIntList() {
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(0);
        intList.add(3);
        intList.add(4);
        intList.add(2);
        intList.add(3);
        intList.add(45);
        intList.add(4);
        intList.add(12);
        return intList;
    }

    private void someOtherFunction(List<Integer> intList) {

        Collections.sort(intList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        print("List in someOtherFunction: ");
        printLine(intList);
    }
    // ==================================

    


    private OptObjectForVr optJsonToOptObj(String optJson){
        optJson = optJson.replaceAll(".vrSector", "_vrSector");
        JSONObject obj = JSONObject.fromObject(optJson);
        Map<String, Class<?>> classMap = new HashMap<String, Class<?>>();
        classMap.put("voyageRecordSummary_vrSector", VoyageRecordSummary_vrSector.class);
        classMap.put("fuelRecord_vrSector", FuelRecord_vrSector.class);
        classMap.put("voyageRecordDetail_vrSector", VoyageRecordDetail_vrSector.class);
        classMap.put("vrDetailRHS", VrDetailRHS.class);
        classMap.put("vrDetailLHS", VrDetailLHS.class);
        return (OptObjectForVr) JSONObject.toBean(obj, OptObjectForVr.class, classMap);
    }
    
    private String optObjToOptJson(OptObjectForVr newOptObjectForVr) {
        JSONObject obj = JSONObject.fromObject(newOptObjectForVr);
        String jsonStr = obj.toString();
        jsonStr = jsonStr.replaceAll("_vrSector", ".vrSector");
        return jsonStr;
    }
}
