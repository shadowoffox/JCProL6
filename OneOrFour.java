/*
Написать метод, который проверяет состав массива из чисел 1 и 4.
Если в нем нет хоть одной четверки или единицы, то метод вернет false;
Написать набор тестов для этого метода (по 3-4 варианта входных данных).
        [ 1 1 1 4 4 1 4 4 ] -> true
        [ 1 1 1 1 1 1 ] -> false
        [ 4 4 4 4 ] -> false
        [ 1 4 4 1 1 4 3 ] -> false
*/

public class OneOrFour {

    public boolean newMass(int[] arr){
        boolean result=true;
        int one=0;
        int four=0;
        for (int i=0;i<arr.length-1;i++){
            if (arr[i]!=1 && arr[i]!=4){result=false; break;}
            else {
                if (arr[i]==1){one++;} if (arr[i]==4){four++;}
            }

        }
        if (one==0 || four==0){result=false;}
return result;
    }

}
