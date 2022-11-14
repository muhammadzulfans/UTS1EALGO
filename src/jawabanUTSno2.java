public class jawabanUTSno2 {
    public static void main(String[] args) {
        float[]myNumber = new float[] {2.34f,4.56f,67.89f};
        PembulatanKeAtas(myNumber);
    }

    public static void PembulatanKeAtas(float[] myNumber){
        System.out.println(Math.ceil(myNumber[0]));
        System.out.println(Math.ceil(myNumber[1]));
        System.out.println(Math.ceil(myNumber[2]));


    }
}
