class Laser {
    String fabricante;
    String alcance;
    String precisao;
    String medida;
    
    Laser(){}
    
    Laser(String fabricante,
        String alcance,
        String precisao,
        String medida) {
    this.fabricante = fabricante;
    this.alcance = alcance;
    this.precisao = precisao;
    this.medida = medida;
    }
    
    @Override
    public String toString(){
        return "\nfabricante: " + this.fabricante +
                "\nalcance: " + this.alcance +
                "\nprecisão: " + this.precisao +
                "\nmedida: " + this.medida + "\n";
        
    }
    
}
