class Main {
  public static void main(String[] args) {
    System.out.println("Cifriamo il nostro testo e trasformiamolo in un testo segreto!");
    Matrice m = new Matrice("TPSIT");
    Vigenere v1 = new Vigenere(0, 12, 0, 12, m1);
    Vigenere v2 = new Vigenere(0, 12, 0, 12, m1);
    Vigenere v3 = new Vigenere(0, 12, 0, 12, m1);
    Vigenere v4 = new Vigenere(0, 12, 0, 12, m)1;
    thread t1 = new thread(v1);
    thread t2 = new thread(v2);
    thread t3 = new thread(v3);com.oracle.svm.core.annotate
    thread t4 = new thread(v4);
    t1.start();
    t2.start();
    t3.start();
    t4.start();

    t1.run();
    v1.cifra();
    v1.stampa();
    
    t2.run();
    v2.cifra();
    v2.stampa();
    
    t3.run();
    v3.cifra();
    v3.stampa();
    
    t4.run();
    v4.cifra();
    v4.stampa();
  }
}