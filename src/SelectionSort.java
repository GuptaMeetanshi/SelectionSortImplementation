public class SelectionSort {
    private int[] arr;
    private int size;
    public SelectionSort(int max)
    {
        arr=new int[max];
        size=0;
    }
    public void insert(int value)
    {
        arr[size]=value;
        size++;
    }
    public void display()
    {
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]);
            System.out.println();
        }

    }
    public void selectionsort()
    {
        int i,j,min;
        for(i=0;i<size-1;i++)
        {
            min=i;
            for(j=i+1;j<size;j++)
            {
                if(arr[j]<arr[min])
                {
                    swap(j,min);
                }
            }
        }
    }
    public void swap(int x,int y)
    {
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

}
class SelectionMain{
    public static void main(String[] args) {
        int maxsize=100;
        SelectionSort obj=new SelectionSort(maxsize);
        obj.insert(77);
        obj.insert(99);
        obj.insert(44);
        obj.insert(55);
        obj.insert(22);
        obj.insert(88);
        obj.insert(11);
        obj.insert(00);
        obj.insert(66);
        obj.insert(33);
        obj.display();
        obj.selectionsort();
        obj.display();

    }
}