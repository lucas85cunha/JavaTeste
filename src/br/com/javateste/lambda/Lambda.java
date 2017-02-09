package br.com.javateste.lambda;

//import java.util.ArrayList;
//import java.util.stream.Collectors;

import java.util.List;

public class Lambda {
    public static void main(String[] args) {
//        List<Funcionario> funcionarios = new ArrayList<Funcionario>() {{
//            add(new Funcionario(1903.98F, "João"));
//            add(new Funcionario(2826.65F, "Aline"));
//            add(new Funcionario(3751.0F, "Marcela"));
//            add(new Funcionario(1500.0F, "André"));
//        }};

//        System.out.println(funcionarios.size());
//        for (Funcionario f : funcionarios) {
//            System.out.println(f.getNome() + ": " + f.getSalario());
//        }
//        funcionarios.forEach((Funcionario f) -> System.out.println(f.getNome() + ": " + f.getSalario()));

//        List<Funcionario> funcionariosQuePagamIr = new ArrayList<>();
//        for (Funcionario f : funcionarios) {
//            if (f.getSalario() > 1903.98F) {
//                funcionariosQuePagamIr.add(f);
//            }
//        }
//        funcionarios.forEach((Funcionario f) -> {
//            if(f.getSalario() > 1903.98F) {
//                funcionariosQuePagamIr.add(f);
//            }
//        });

//        for (Funcionario f : funcionariosQuePagamIr) {
//            System.out.println(f.getNome());
//        }
//        funcionariosQuePagamIr.forEach((f) -> System.out.println(f.getNome()));

        // menor número de variaveis
//        List<String> funcionariosQuePagamIr = funcionarios.stream()
//                .filter(f -> f.getSalario() > 1903.98F)
//                .map(f -> f.getNome())
//                .collect(Collectors.toList());
//        funcionariosQuePagamIr.forEach((f) -> System.out.println(f));

        FolhaDePagamento folhaDePagamento = new FolhaDePagamento();
        List<Funcionario> funcionarios = folhaDePagamento.getFuncionarios(
//                new Condicao<Funcionario>() {
//                    @Override
//                    public boolean teste(Funcionario funcionario) {
//                        return (funcionario.getSalario() <= 1903.98);
//                    }
//                });  //Classe Anônima
                f -> f.getSalario() <= 1903.98F);
        funcionarios.forEach((f) -> System.out.println(f.getNome()));
    }
}
