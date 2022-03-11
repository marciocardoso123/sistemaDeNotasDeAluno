public class Sistema {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double mediageral(){
        return   nota1 + nota2 + nota3;
    }
    public double missingPoints(){
        if(mediageral()<60.0){
            return 60.0 - mediageral();
        }else{
            return 0.0;
        }
    }
    public String toString(){
        return name + "," + String.format("%.2f", mediageral());
    }


}
