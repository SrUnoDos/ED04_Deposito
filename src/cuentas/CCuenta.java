package cuentas;

/**
 * Crea objetos de tipo CCuenta, con nombre, número de cuenta, saldo y tipos de interes.
 * 
 * @author Juan Couto
 */
public class CCuenta {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Nombre titular de la cuenta
     */
    private String nombre;
    
    /**
     * Numero de cuenta del cliente
     */
    private String cuenta;
    
    /**
     * Saldo disponible en la cuenta
     */
    private double saldo;
    
    /**
     * Tipo de interés aplicado en la cuenta
     */
    private double tipoInterés;
    
    
    /**
     * Constructor por defecto de la clase CCuenta
     */
    public CCuenta()
    {
    }

    /**
     * Constructor de la clase cuenta
     * 
     * @param nom nombre        
     * @param cue cuenta        
     * @param sal saldo         
     * @param tipo tipo de interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Método que devuelve el saldo de la cuenta
     * 
     * @return devuelve el saldo disponible en la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Metodo para insertar saldo en la cuenta
     * 
     * @param cantidad cantidad 
     * @throws Exception Excepcion capturada si se intenta ingresar una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Metodo para retirar saldo en la cuenta
     * 
     * @param cantidad cantidad 
     * @throws Exception Excepcion capturada si se intenta retirar una cantidad negativa o superior al saldo disponible
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}

