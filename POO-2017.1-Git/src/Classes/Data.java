package Classes;

/**
 *
 * @author gmnun
 */
public class Data {
    private String dia, mes, ano;
    
    public Data(){
        this("","","");
    }
    public Data(String dia, String mes, String ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getAno() {
        return ano;
    }
    public String getDia() {
        return dia;
    }
    public String getMes() {
        return mes;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    public void setDia(String dia) {
        this.dia = dia;
    }
    public void setMes(String mes) {
        this.mes = mes;
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        return dia + "/" + mes + "/" + ano;
    }
    
    
}
