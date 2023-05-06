public class pra1 {
    static class Calculator{
        int avg(int[] arr){
            int sum=0;
            for(int i=0;i<arr.length;i++){
                sum+=arr[i];
            }
            return sum/arr.length;
        }
    }
    public static void main(String[] args){
        Calculator cal = new Calculator();

        int[] data={1,3,5,7,9,11};
        int result = cal.avg(data);

        System.out.println("avg: "+result);
    }
}
