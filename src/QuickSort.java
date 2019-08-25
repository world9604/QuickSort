public class QuickSort {
    int number;
    int data[];

    QuickSort(int[] data, int number) {
        this.data = data;
        this.number = number;
    }

    void quickSort(int[] data, int start, int end) {
        if(start >= end) { // 원소가 1개인 경우 그대로 두기
            return;
        }

        int key = start; // 키는 첫 번째 원소
        int i = start + 1, j = end, temp;

        while(i <= j) { // 엇갈릴 때까지 반복
            while(i <= end && data[i] <= data[key]) { // 키 값보다 큰 값을 만날때 까지
                i++;
            }
            while(j > start && data[j] >= data[key]) { // 키 값보다 작은 값을 만날때 까지
                j--;
            }
            if(i > j) { // 현재 엇갈린 상태면 키 값과 교체
                temp = data[j];
                data[j] = data[key];
                data[key] = temp;
            } else { // 엇갈리지 않았다면 i와 j를 교체
                temp = data[i];
                data[i] = data[j];
                data[j] = temp;
            }
        }

        quickSort(data, start, j - 1);
        quickSort(data, j + 1, end);
    }

    void show() {
        for(int i = 0; i < number; i++) {
            System.out.printf("%d ", data[i]);
        }
    }
}
