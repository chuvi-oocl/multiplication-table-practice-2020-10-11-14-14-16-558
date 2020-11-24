package com.tw;

public class MultiplicationTable {
    public String create(int startNumber, int endNumber) {
        if(isStartSmallerThanOrEqualToEnd(startNumber, endNumber) && isWithinRange(startNumber, endNumber)){
            return getMultiplicationTable(startNumber, endNumber);
        }
        return null;
    }

    private boolean isStartSmallerThanOrEqualToEnd(int startNumber, int endNumber){
        return (startNumber <= endNumber);
    }

    private boolean isWithinRange(int startNumber, int endNumber) {
        return ((startNumber >= 1 && startNumber <= 1000) && (endNumber >= 1 && endNumber <= 1000));
    }

    private String getMultiplicationTable(int startNumber, int endNumber){
        String result = "";
        for(int i = startNumber; i <= endNumber; i++){
            if(result != ""){
                result += "\r\n";
            }
            result += getMultiplicationLine(i, startNumber);
        }
        return result;
    }

    private String getMultiplicationLine(int rowNum, int startFrom){
        String result = "";
        for(int i = startFrom; i <= rowNum; i++){
            if(result != ""){
                result += "  ";
            }
            result += getMultiplicationResult(i, rowNum);
        }
        return result;
    }

    private String getMultiplicationResult(int numA, int numB){
        return numA + "*" + numB + "=" + numA * numB;
    }
}
