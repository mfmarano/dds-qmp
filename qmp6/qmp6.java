class Usuario {
  Sugerencia sugerenciaDiaria;
  ProveedorMotor proveedorMotor;

  public void calcularSugerenciaDiaria() {
    this.sugerenciaDiaria = this.getMotor().getSugerencia(this);
  }

  private MotorSugerencias getMotor() {
    return this.proveedorMotor.getMotor();
  }
}

class Sugerencia {
  List<Atuendo> atuendos;
}

class ProveedorMotor {
    private static ProveedorMotor INSTANCE;
    MotorSugerencias motor;

    static ProveedorMotor getInstance(){
        return ProveedorMotor INSTANCE;
    }

    MotorSugerencias getMotor(){
        return motor;
    }

    setMotor(MotorSugerencias motor){
        this.motor = motor;
    }
}

interface MotorSugerencias {
    Sugerencia calcularSugerenciaDiaria(Usuario usuario);
}

public class MotorClimatico implements MotorSugerencias {
  private ServicioMeteorologico servicioMeteorologico;

  public Sugerencia calcularSugerenciaDiaria() {
    RepositorioUsuarios.getUsuarios().forEach(usuario ->
     usuario.calcularSugerenciaDiaria())
  }
}

class RepositorioUsuarios{
  List<Usuario> usuarios;

  List<Usuario> getUsuarios() {
    return usuarios;
  }

}