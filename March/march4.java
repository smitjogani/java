// sum of two matrices of 3 x 3

class march4{
    public static void main(String[] args) {
        int a[][] = {{1,3,4},{2,4,3},{3,4,5}};
        int b[][] = {{1,3,4},{2,4,3},{3,4,5}};

        int c[][] = new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j] = a[i][j] + b[i][j];
                System.out.println(c[i][j] +" ");
            }
            System.out.println("");
        }

    }
}
