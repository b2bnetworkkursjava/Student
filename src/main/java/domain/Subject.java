package domain;

import java.util.List;

public class Subject {

    private String name;
    private List<Double> deegres;

    public String getName(){
        return name;
    }

    public Subject(String name, List<Double> deegres) {
        this.name = name;
        this.deegres = deegres;
    }

    public void setName(String name){
        this.name=name;
    }

    public List<Double> getDeegres(){
        return deegres;
    }

    public void setDeegres(List<Double> deegres){
        this.deegres =deegres;
    }


}
