public class selection_sort {
    public static void main(String[] args) {
        int[] vetor = {1, 5, 2, 8};
        selection_sort(vetor);
        for(int i = 0; i<vetor.length; i++){
            System.out.println(vetor[i]);
        }
    }
    public static void selection_sort(int[] vetor){
        int out, in, min, temp;
        int nElems = vetor.length;
        for(out=0;out<nElems-1;out++){
            min=out;
            for(in=out+1;in<nElems;in++){
                if(vetor[in]<vetor[min]){
                    min=in;
                    temp=vetor[out];
                    vetor[out]=vetor[min];
                    vetor[min]=temp;
                }
            }
        }
    }
}
