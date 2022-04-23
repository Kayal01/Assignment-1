public class youngphysicist
{
    public boolean equilibrium(int numberofforces, int [][]xyz){
        int sum=0;

        if ( numberofforces<1 || numberofforces>100) {
            return false;
        }

        for (int i=0; i<numberofforces; i++) {
            for (int j = 0; j < 3; j++) {
                if (xyz[i][j] <= -101 || xyz[i][j] >= 101){
                    return false;
                }
            }
        }

        for (int j=0; j<3; j++) {
            for (int k = 0; k < numberofforces; k++){
                sum = sum + xyz[k][j];
            }
            if (sum != 0) {
                return false;
            }
        }
        return true;
    }

}
