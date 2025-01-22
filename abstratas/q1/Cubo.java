class Cubo extends Figura{
    private double lado, volume, area; 
    
    public Cubo(){
        this.lado = 0;
        this.volume = 0;
        this.area = 0;
    }

    public void CalcularVolume(double lado){
        this.volume = lado*lado*lado;
    }

    @Override public double GetVolume(){
        return this.volume; 
    }

}