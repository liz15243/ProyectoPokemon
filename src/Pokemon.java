public class Pokemon extends Personaje {
    private String tipo;
    private Habilidad habilidad;
    private int hp;
    private boolean esLegendario;
    private String debilContra;
    private String fuerteContra;
    private int fuerza;
    private int velocidad;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Habilidad getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(Habilidad habilidad) {
        this.habilidad = habilidad;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public boolean isEsLegendario() {
        return esLegendario;
    }

    public void setEsLegendario(boolean esLegendario) {
        this.esLegendario = esLegendario;
    }

    public String getDebilContra() {
        return debilContra;
    }

    public void setDebilContra(String debilContra) {
        this.debilContra = debilContra;
    }

    public String getFuerteContra() {
        return fuerteContra;
    }

    public void setFuerteContra(String fuerteContra) {
        this.fuerteContra = fuerteContra;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public Pokemon(String nombre, int nivel, char genero, String tipo, Habilidad habilidad, int hp, boolean esLegendario, String debilContra, String fuerteContra, int fuerza, int velocidad) {
        super(nombre, nivel, genero);
        this.tipo = tipo;
        this.habilidad = habilidad;
        this.hp = hp;
        this.esLegendario = esLegendario;
        this.debilContra = debilContra;
        this.fuerteContra = fuerteContra;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
    }

    public boolean pelear(Pokemon pokemonContrario) {
        if(this.fuerteContra.equals(pokemonContrario.getTipo())){
            this.habilidad.setAtaqueBase(this.habilidad.getAtaqueBase()+20);
            pokemonContrario.getHabilidad().setAtaqueBase(pokemonContrario.getHabilidad().getAtaqueBase()-20);
        }else if(pokemonContrario.getFuerteContra().equals(this.tipo)){
            this.habilidad.setAtaqueBase(this.habilidad.getAtaqueBase()-20);
            pokemonContrario.getHabilidad().setAtaqueBase(pokemonContrario.getHabilidad().getAtaqueBase()+20);
        }else{

        }

        do {
            if(this.velocidad >= pokemonContrario.velocidad) {
                //Empezar
                pokemonContrario.setHp(pokemonContrario.getHp()-this.habilidad.getAtaqueBase());
                if(pokemonContrario.getHp() <= 0){
                    return true;
                }else{
                    this.hp -= pokemonContrario.getHabilidad().getAtaqueBase();
                    if(this.hp <= 0){
                        System.out.println("Vuelve a intentarlo");
                        return false;
                    }
                }
            }else{
                //Empieza el opuesto
                this.hp -= pokemonContrario.getHabilidad().getAtaqueBase();
                if(this.hp <= 0) {
                    return true;
                }else{
                    pokemonContrario.setHp(pokemonContrario.getHp()-this.habilidad.getAtaqueBase());
                    if(pokemonContrario.getHp() <= 0){
                        return false;
                    }
                }
            }
        }while (true);

    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "tipo='" + tipo + '\'' +
                ", habilidad=" + habilidad +
                ", hp=" + hp +
                ", esLegendario=" + esLegendario +
                ", debilContra='" + debilContra + '\'' +
                ", fuerteContra='" + fuerteContra + '\'' +
                ", fuerza=" + fuerza +
                ", velocidad=" + velocidad +
                '}';
    }
}
