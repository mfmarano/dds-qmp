class Usuario {
  Sugerencia sugerenciaDiaria;
  
  public void setSugerenciaDiaria(Sugerencia sugerencia) {
    this.sugerenciaDiaria = sugerencia;
  }
}

class Sugerencia {
  List<Atuendo> atuendos;
}

public class MotorSugerencias {

  public void calcularSugerenciaDiariaParaTodes() {
    RepositorioUsuarios
      .getUsuarios()
      .forEach(usuario -> 
          usuario.setSugerenciaDiaria(this.calcularSugerencia(usuario)));
  }

  private calcularSugerencia(Usuario usuario) {
    // ...
  }
}

class RepositorioUsuarios {
  List<Usuario> usuarios;

  List<Usuario> getUsuarios() {
    return usuarios;
  }
}