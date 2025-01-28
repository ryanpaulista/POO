class Esfera extends Figura{
    private double volume;

    public Esfera(){
        this.volume = 0; 
    }

    public void CalcularVolume(double raio){
        this.volume = (4/3)*3.14*(raio*raio*raio); 
    }

    public double getVolume(){
        return this.volume + 1000;
    }
}