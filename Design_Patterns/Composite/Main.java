/*
Composite: Compõe objetos em estruturas de árvores de modo a possibilitar trabalhar com essas estruturas
como se elas fossem objetos individuais.
Neste caso, FiguraComposta é composta de figuras e outras figuras compostas e pode ser trabalhada como se
fosse uma figura normal.
*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){

        Circulo circulo = new Circulo(0.0,0.0,1.42,1.42);//raio = ~2.008
        circulo.desenhar();
        circulo.areaToString();

        Triangulo triangulo = new Triangulo(5.0,1.0,1.0,3.0,1.0,-2.0);
        triangulo.desenhar();
        triangulo.areaToString();

        TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero(-1.0,1.5,1.0,-2.0,3.0,1.5);
        trianguloEquilatero.desenhar();
        trianguloEquilatero.areaToString();

        TrianguloIsosceles trianguloIsosceles = new TrianguloIsosceles(0.0, 0.0, 3.0,4.0,6.0,0.0);
        trianguloIsosceles.desenhar();
        trianguloIsosceles.areaToString();

        TrianguloEscaleno trianguloEscaleno = new TrianguloEscaleno(0.0,0.0,3.0,3.0,4.0,5.0);
        trianguloEscaleno.desenhar();
        trianguloEscaleno.areaToString();


        List<Figura> lista0 = new ArrayList<>();
        lista0.add(circulo);
        lista0.add(triangulo);
        FiguraComposta figuraComposta0 = new FiguraComposta(lista0);
        figuraComposta0.desenhar();
        figuraComposta0.areaToString();


        List<Figura> lista = new ArrayList<>();
        lista.add(circulo);
        lista.add(triangulo);
        lista.add(trianguloEquilatero);
        lista.add(trianguloEscaleno);
        lista.add(trianguloIsosceles);
        lista.add(figuraComposta0); //Uma figura composta pode ser composta de outras figuras compostas
        FiguraComposta figuraComposta = new FiguraComposta(lista);
        figuraComposta.desenhar();
        figuraComposta.areaToString();
    }
}
