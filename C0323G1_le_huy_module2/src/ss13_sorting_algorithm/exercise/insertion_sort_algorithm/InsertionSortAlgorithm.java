package ss13_sorting_algorithm.exercise.insertion_sort_algorithm;

import java.util.Arrays;

public class InsertionSortAlgorithm {
    public static void main(String[] args) {
        //Create an array:
        int[] arrNum = {7, 2, 5, 8, 1};
        System.out.print("Mảng cho sẵn: ");
        System.out.println(Arrays.toString(arrNum));

        //Description:
        System.out.println("Mô tả: ");
        System.out.println("Lần lượt duyệt mảng theo thứ tự từ trái qua, mỗi vòng duyệt lấy phần tử chèn tại vị trí tương ứng và thực hiện thuật toán chèn, cụ thể như sau: ");
        System.out.println("1. Khai báo biến x đại diện cho value của phần tử lấy ra để chèn (gọi tắt là phần tử chèn), biến pos đại diện cho vị trí phần tử chèn");
        int x;
        int pos;
        System.out.println("2. Vòng lặp ngoài chạy từ vị trí 1 đến vị trí cuối (độ dài mảng - 1) (duyệt hết mảng): for (int i = 1; i < arrNum.length; i++)");
        for (int i = 1; i < arrNum.length; i++) {
            System.out.println("");
            x = arrNum[i];
            pos = i;
            System.out.println("***************************Vòng thứ " + i + "***************************");
            System.out.println("* x = " + x);
            System.out.println("* pos = " + pos);
            while (pos > 0 && x < arrNum[pos - 1]) {
                String stringNumCheck = "";
                System.out.println("* Vòng while phía trong xét điều kiện: x có nhỏ hơn các phần tử có vị trí ở trước nó hay không? và xét tới phần tử đầu tiên (index 0)");
                for (int j = 0; j < pos; j++) {
                    stringNumCheck += arrNum[j] + " , ";
                }
                System.out.println("* So sánh x = " + x + " với phần tử ở trước nó là: " + stringNumCheck);
                System.out.println("So sánh lần lượt theo từng cặp với phần tử liền kề, nếu thoả điều kiện x nhỏ hơn thì dời trong phạm vi cặp đó, quá trình dời như sau: ");
                arrNum[pos] = arrNum[pos - 1];
                pos--;
                System.out.println("Dời x về vị trí: " + pos);
                System.out.println("");
            }
            arrNum[pos] = x;
            System.out.println("Đã tìm thấy vị trí phù hợp, sau khi sắp xếp, mảng trở thành: ");
            System.out.println(Arrays.toString(arrNum));
        }
    }
}

