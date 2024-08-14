public class ordenacao_bubble {
    public static void main(String[] args) {
        int[] vetores = { 6, 1, 4, 2, 3 };
        ordenacao_bubbleSort(vetores);
        for (int i = 0; i < vetores.length; i++) {
            System.out.println(vetores[i]);
        }
    }

    public static void ordenacao_bubbleSort(int[] vetores) {
        int out, in;
        int nElems = vetores.length;
        int temp = 0;
        for (out = nElems - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (vetores[in] > vetores[in + 1]) {
                    temp = vetores[in];
                    vetores[in] = vetores[in + 1];
                    vetores[in + 1] = temp;
                }
            }
        }
    }
}