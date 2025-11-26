public class Primes {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[num + 1];
        arr[0] = false; arr[1] = false;
        for(int i = 2; i<arr.length; i++)
            arr[i] = true;
        int count = 0;
        System.out.println("Prime numbers up to " + num + ":");
        for(int i = 2; i < arr.length; i++) {
            if(arr[i]) {
                change(arr,i);
                System.out.println(i);
                count++;
            }
        }
        System.out.println("There are " + count + " primes between 2 and " + num + " (" + count*100/num + "% are primes)");
    }
    public static void change(boolean[] arr, int prime){
        int count = prime * 2;
        while (count < arr.length) {
            arr[count] = false;
            count += prime;
        }
    }
}