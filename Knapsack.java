/*
بسم الله الرحمن الرحيم
 */
package project1;

/**
 *
 * @author ayah
 */
public class Knapsack {
   private int profit; 
   private int time; 
   private int oneHourWeight; 
   private int maxTime; 

    public Knapsack(int profit, int time, int oneHourWeight, int maxTime) {
        this.profit = profit;
        this.time = time;
        this.oneHourWeight = oneHourWeight;
        this.maxTime = maxTime;
    }

    Knapsack() {}
   

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getOneHourWeight() {
        return oneHourWeight;
    }

    public void setOneHourWeight(int oneHourWeight) {
        this.oneHourWeight = oneHourWeight;
    }

    public int getMaxTime() {
        return maxTime;
    }

    public void setMaxTime(int maxTime) {
        this.maxTime = maxTime;
    }
    
    

    @Override
    public String toString() {
        return "Knapsack{" + "profit=" + profit + ", time=" + time + ", oneHourWeight=" + oneHourWeight + ", maxTime=" + maxTime + '}';
    }
   

    
}
