public class Principal {
    public static void main(String[] args) {
        
        Arte[] arrayArte = new Arte[(int)(Math.random()*30+1)];
       
        int cont = 0;
        for(int i=0; i<arrayArte.length; i++){
            cont = (int)(Math.random()*3+1);
            
            if(cont == 1)
                arrayArte[i] = new Livro("Livro "+i, "Escritor "+i, (int)(Math.random()*700+1), "Editora "+i);
            else if (cont == 2)
                arrayArte[i] = new Musica("Musica "+i, "Músico "+i, "Gravadora "+i, (Math.random()*10));
            else
                arrayArte[i] = new Escultura("Escultura "+i, "Escultor "+i, "mármore", (Math.random()*3));
        }
        
        System.out.println();
        
        for(int i=0; i<arrayArte.length; i++){
            System.out.println(arrayArte[i]);
        }
        
        System.out.println();
        
        for(int i=0; i<arrayArte.length; i++){
            if (arrayArte[i] instanceof Livro)
                System.out.println("Número de páginas: "+((Livro)arrayArte[i]).getNumPaginas()+", editora: "+((Livro)arrayArte[i]).getEditora());
            else if (arrayArte[i] instanceof Musica)
                System.out.println("Gravadora: "+((Musica)arrayArte[i]).getGravadora()+", duração da música: "+((Musica)arrayArte[i]).getDuracao());
            else if (arrayArte[i] instanceof Escultura)
                System.out.println("Material usado: "+((Escultura)arrayArte[i]).getMaterial()+", altura da escultura: "+((Escultura)arrayArte[i]).getAltura());
            
        }
        
        System.out.println();
        
        int cont3 = 0;
        int[] cont2 = new int[15];
        for(int i = 0; i<cont2.length; i++){
            cont2[i] = (int)(Math.random()*50+1);
            for(int x = 0; x<arrayArte.length; x++){
                if(cont2[i] == x && arrayArte[x] != null){
                    arrayArte[x] = null;
                    System.out.println("Posição sorteada: "+cont2[i]+". Posição removida com sucesso"); 
                }
                else if (cont2[i] == x && arrayArte[x] == null)
                    System.out.println("Posição sorteada: "+cont2[i]+". Posição não pode ser removida pois está nula."); 
                else if (cont2[i]>=arrayArte.length)
                    cont3++;
                 
            }
            if (cont3 >= arrayArte.length){
                System.out.println("Posição sorteada: "+cont2[i]+". Posição inválida, fora do array.");
                cont3 = 0;
            }
        }
        
        System.out.println();
        
        imprimeInformacoes(arrayArte);
    }
    
    public static void imprimeInformacoes(Arte[] arrayA){
        int contLivros = 0;    
        int contMusica = 0;
        int contEscultura = 0;
        for(int i=0; i<arrayA.length; i++){
            if (arrayA[i] instanceof Livro)
                contLivros++;
            else if (arrayA[i] instanceof Musica)
                contMusica++;
            else if (arrayA[i] instanceof Escultura)
                contEscultura++;
        }
        
        Livro[] l = new Livro[contLivros];
        Musica[] m = new Musica[contMusica];
        Escultura[] e = new Escultura[contEscultura];
        int a =0;
        int b = 0;
        int c = 0;
        for(int i=0; i<arrayA.length; i++){
            if (arrayA[i] instanceof Livro)
                l[a++] = ((Livro)arrayA[i]);
            else if (arrayA[i] instanceof Musica)
                m[b++] = ((Musica)arrayA[i]);
            else if (arrayA[i] instanceof Escultura)
                e[c++] = ((Escultura)arrayA[i]);
        }
        
        for(int i=0; i<l.length; i++){
            System.out.println(l[i]);
            if (i == l.length-1)
                System.out.println();
        }
        for(int i=0; i<m.length; i++){
            System.out.println(m[i]);
            if (i == m.length-1)
                System.out.println();
        }
        for(int i=0; i<e.length; i++){
            System.out.println(e[i]);
            
        }
    }

}