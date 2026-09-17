class Solution {
    public static ArrayList<Integer> getSmaller(int arr[], int x) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:arr){
            if(i<x){
                list.add(i);
            }
        }
        return list;
    }
}