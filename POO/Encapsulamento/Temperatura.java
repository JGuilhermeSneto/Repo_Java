

public class Temperatura {

    private double celsius;

    public Temperatura(double celsius){
        this.celsius = celsius;
    }

    public double paraFarhrenheit(){
        return(celsius * 9 / 5)  + 32;
    }

    public double paraKelvin(){
        return celsius + 273.15;
    }


    public static void main(String[] args) {
    
        Temperatura t = new Temperatura(25);

        System.out.println("Farnheit"+ t.paraFarhrenheit()+ "\n");
        System.out.println("Kelvin" + t.paraKelvin() +"\n");



    }
}
