package Patterns.PatternsBuilder.PatternBuilder;


import Patterns.PatternsBuilder.model.Casa;

public interface IBuilderCasa {
    void buildQuartos();
    void buildBanheiros();
    void buildChurrasqueira();
    Casa getCasa();
}
