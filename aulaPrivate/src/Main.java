public class Main {
    public static void main(String[] args) {
        Professor pf1 = new Professor();
        //al1.nome = "bruno";
        pf1.setNome("Bruno");
        pf1.setMatricula(5241);
        pf1.setSalario(2000);
        System.out.println(pf1.getNome());
        System.out.println(pf1.getMatricula());
        System.out.println(pf1.getSalario());
    }
}