package sss;

public class Main2 {
    public static void main(String[] args) {
        int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10};
        // 创建一个类的对象
        FindNumber a = new FindNumber();
        int b = a.find(numArray);
        System.out.println(b);
    }
}

class FindNumber {
    public int find(int[] num) {
        int[] countArray = new int[1000];

        for(int i = 0; i < num.length;i++){

            int current = num[i];

            countArray[current]++;

            if(countArray[current]==2){

                return current;

            }

        }

        return 0;

    }
}
//
//    select age ,avg(score) as average_scoer,count(age) as num_students
//
//        from student
//
//        where scoer >=60
//
//        group by age
//
//        having count(age) >= 2;