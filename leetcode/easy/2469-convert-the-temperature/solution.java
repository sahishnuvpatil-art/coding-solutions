class Solution {
    public double[] convertTemperature(double c) {
       double kelvin=c+273.15;
       double far=c*1.80+32.00;
      
      double[] arr = new double[2];
       arr[0]=kelvin;
       arr[1]=far;
       return arr;
    }
}