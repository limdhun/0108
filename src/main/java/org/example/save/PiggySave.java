package org.example.save;

public class PiggySave {
    
    private int total; // private은 나중에 배움
    //f(x) = y가 아니므로 static은 안붙여야 함
    public void deposit(int amount){
        this.total += amount;
    }
    public int withdraw(){
        int result = this.total;
        this.total = 0;
        return result;
    }




}
