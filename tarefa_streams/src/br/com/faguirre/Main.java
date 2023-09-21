package br.com.faguirre;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Pessoa> pessoas = new Pessoa().registroPessoas();

        List<Pessoa> pessoasF = pessoas.stream()
                .filter(pessoa -> pessoa.getSexualidade().equals("Feminino"))
                .collect(Collectors.toList());
        pessoasF.forEach(pessoa -> System.out.println(pessoa));
    }
}