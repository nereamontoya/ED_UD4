package cuentas;
/** Empezamos con la clase publica CCuenta que representa la cuenta de un banco */
public class CCuenta {
	/**
     * Se añade el nombre del cliente
     * @return : devuelve el nombe de la cuenta
     */
	public String getNombre() {
		return nombre;
	}
	/**
	    * Aqui se establece el nombre del cliente
	    * @param nombre : nombre del cliente
	    */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	    * Aqui se obtiene el numero de cuenta
	    * @return : numero de cuenta
	    */
	public String getCuenta() {
		return cuenta;
	}
	/**
	    * Aqui se establece el numero de la cuenta
	    * @param cuenta : esto es el numero de la cuenta.
	    */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	/**
     * Aqui obtiene el saldo de la cuenta
     * @return : devuelve el saldo de la cuenta
     */
	public double getSaldo() {
		return saldo;
	}
	 /**
     * Aqui se establece el saldo de la cuenta
     * @param saldo: esto dice el saldo de la cuenta
     */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	/**
	    * Aqui se obtiene el tipo de interes
	    * @return : devuelve el tipo de interes.
	    */
	public double getTipoInterés() {
		return tipoInterés;
	}
	/**
     * Aqui se establecería el tipo de interes
     * @param tipoInterés : esto dice el tipo de interes.
     */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
	/** Aqui creamos el constructor de la clase CCuenta */
	private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    /** aqui tenemos la clase cuenta sin ningun contstructor */
    public CCuenta(){
    }
    /** @param nom : para el nombre del titular de la cuenta
     * @param cue: para el numero de cuenta del titular
     * @param sal: el Saldo incial que tiene el titular
     * @param tipo: el interés que genera la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /** aquí se obtiene el saldo actual de la cuenta.
    *
    * @return : devuelve el saldo actual de la cuenta
    */
    public double estado()
    {
        return saldo;
    }
    /**
     * en este constructor es donde se ingresa el dinero
     * @param cantidad : el dinero que se ingresa
     * @throws Exception : Si se deposita una cantidad negativa
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /**
     *En este constructor se crea la funcion de retirar el dinero
     * @param cantidad: el dinero que se retira
     * @throws Exception : si se retira una cantidad negativa o no hay suficiente saldo
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}