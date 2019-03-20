/*
2. Написать метод, которому в качестве аргумента передается не пустой одномерный целочисленный массив.
Метод должен вернуть новый массив, который получен путем вытаскивания из исходного массива элементов, идущих после последней четверки.
Входной массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить RuntimeException.
Написать набор тестов для этого метода (по 3-4 варианта входных данных). Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].
*/

public class After4 {


    public int[] newMass(int[] arr){
        int[] out = new int[0];
        int inter=0;
        for (int i=arr.length-1; i>0;i--){
            if (arr[i]==4 && i<arr.length-1){
                out = new int[arr.length-1-i];
                for (int j=i;j<arr.length-1;j++){
                    out[inter]=arr[j+1];
                    inter++;
                }
                break;
            } else if (arr[i]==4 && i==arr.length-1){out = new int[]{0}; }

        }
        if (out.length==0) throw new  RuntimeException();
        return out;

    }

}
