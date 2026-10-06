import static java.lang.IO.println;
import static java.lang.IO.readln;

void main() {

    List<Pessoa> banco = new ArrayList<Pessoa>();
    List<Pessoa> cache = new ArrayList<Pessoa>();
    // HashSet<Pessoa> banco = new HashSet<>();
    // HashSet<Pessoa> cache = new HashSet<>();

    int ac = 0;



    Pessoa pessoa1 = new Pessoa("José", 1, 23);
    Pessoa pessoa2 = new Pessoa("Maria", 2, 12);
    Pessoa pessoa3 = new Pessoa("Otavio", 3, 56);
    Pessoa pessoa4 = new Pessoa("Teresa", 4, 72);
    Pessoa pessoa5 = new Pessoa("123", 5, 101230);
    Pessoa pessoa6 = new Pessoa("Jo123sé", 6, 232);
    Pessoa pessoa7 = new Pessoa("Mahria", 7, 132);
    Pessoa pessoa8 = new Pessoa("Otvavio", 8, 566);
    Pessoa pessoa9 = new Pessoa("Teraesa", 9, 728);
    Pessoa pessoa10 = new Pessoa("Jaesus", 10, 1090);
    Pessoa pessoa11 = new Pessoa("Jaadfus", 11, 12315);



    banco.add(pessoa1);
    banco.add(pessoa2);
    banco.add(pessoa3);
    banco.add(pessoa4);
    banco.add(pessoa5);
    banco.add(pessoa6);
    banco.add(pessoa7);
    banco.add(pessoa8);
    banco.add(pessoa9);
    banco.add(pessoa10);
    banco.add(pessoa11);



    while (ac != 2) {
        while (ac == 1) {
            int esc = Integer.parseInt(readln("pesuqise o id da pessoa: "));
            try {
                if (banco.get(esc - 1).getId().equals(cache.get(esc - 1).getId())) {
                    println("Pessoa encontrada no cache: " + cache.get(esc - 1));
                }
            } catch (Exception e) {
                if (banco.get(esc - 1).getId() == esc) {
                    println("Pessoa buscada no banco e adicionada ao cache: " + banco.get(esc - 1));
                    cache.add(banco.get(esc - 1));
                }
            }
            break;

        }
        ac = Integer.parseInt(readln("Escolha 1- Pesquisar o id da pessoa \n 2- Sair"));

    }
    println("Adeus");
}