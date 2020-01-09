package cuentas;

/**
 * Esta es la clase CCuenta
 * @author carlo
 * @version 1.0
 * @since 09/01/2020
 * */

public class CCuenta {

	/** Esta clase tiene siempre 4 atributos*/
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta()
    {
    }

	private String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

    public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInteres() {
		return tipoInteres;
	}

	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        cuenta=cue;
        saldo=sal;
    }

    public double estado()
    {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
