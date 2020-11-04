package io.cucumber.skeleton;

public class Belly {
    
    public void eat(int cukes) {
    }
    
    // define o tipo da variavel
    private static String varMSG = "Error";

    // retorna o valor
    public static String getVar() {
        return Belly.varMSG;
    }

    public Boolean failTestException() throws IllegalAccessException {
        try{
            int num[] = {1, 2, 3, 4};
            System.out.println(num[5]);
            return true;
        } catch (Exception ex) {
            setVar(String.valueOf(ex.getMessage()));
            return false;
        }
    }

    // seta o valor
    public static void setVar(String var) {
        Belly.varMSG = var;
    }
}
