package list.OperacoesBasicas.Pesquisa;

import java.util.ArrayList;

public class CatalogoLivros {

    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new Arraylist();
    }

    public void adicionarLivros(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));

    }

    public list<Livro> pesquisarPorAutor(String autor) {
        list<Livro> livrosPorAutor = new Arraylist<>();
        if (!livroList.isempty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase((autor))) {
                    livrosPorAutor.add(l);
                }
            }

        }
        return livrosPorAutor;
    }

    public List<livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livroPorIntervaloAnos = new ArrayList<>();
        if (!livroList.isempty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livroPorIntervaloAnos.add(l);
                }
            }

        }
        return livroPorIntervaloAnos;
    }

    public Livro pesquisaporTitulo(String titulo) {
        Livro livroporTitulo = null;
        if (!livroList.isempty()) {
            for (Livro l : livrolist) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroporTitulo = l;
                    break;
                }
            }
        }
        return livroporTitulo;
    }

}
    public static void main(String[] args) {

    System.out.println("Teste");

    }


