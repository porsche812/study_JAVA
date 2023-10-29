import java.util.Arrays;

public class study1 {
    static int maxx(int[][] arrays){
        return Arrays.stream(arrays)
                .flatMapToInt(Arrays::stream)
                .max()
                .orElseThrow();
    }

    static int minn(int[][] arrays){
        return Arrays.stream(arrays)
                .flatMapToInt(Arrays::stream)
                .min()
                .orElseThrow();
    }

    public static void main(String[] args) {
        int arr[][] =  {{3, 4, 5, 6},
                        {2, 3, 4, 7},
                        {4, 1, 0, 9},
                        {5, 5, 4, 1},
                        {6, 10, 6, 8}};


        System.out.println(maxx(arr));
        System.out.println(minn(arr));

        int sum = 0;
        int avg = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + ",");
                //합
                sum += arr[i][j];

                int max = maxx(arr);
                int min = minn(arr);


            }
            //평균
            avg = sum / arr.length;
        }

        System.out.println("\n" + sum);
        System.out.println(avg);

        char [][] eng = new char[2][13];
        char cr = 'a';

        for(int i = 0 ; i < eng.length ; i++){
            for(int j =0 ; j < eng[i].length ; j++){
                eng[i][j] = cr;
                System.out.print(eng[i][j]);
                cr++;
            }
        }
    }
}
