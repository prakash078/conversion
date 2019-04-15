package com.example.converter;

public class Model {

    private String[] ones = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
            "Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    private String[] tens = {"","","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

    public Model() {
    }

    public Model(String[] ones, String[] tens) {
        this.ones = ones;
        this.tens = tens;
    }

    public String[] getOnes() {
        return ones;
    }

    public void setOnes(String[] ones) {
        this.ones = ones;
    }

    public String[] getTens() {
        return tens;
    }

    public void setTens(String[] tens) {
        this.tens = tens;
    }
}
