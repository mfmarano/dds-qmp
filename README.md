# "Qué Me Pongo" - Primera iteración

```
class Prenda {
  TipoDePrenda tipoDePrenda
  Material material
  String color // HEX
  String colorSecundario // HEX

  constructor(TipoDePrenda tipoDePrenda, Material material, String color, String colorSecundario = null)
    if (tipoDePrenda == null || material == null || color == null)
      throw NullException()
    this.tipoDePrenda = tipoDePrenda
    this.material = material
    this.color = color
    this.colorSecundario = colorSecundario
}

class TipoDePrenda {
  Categoria categoria

  constructor(Categoria categoria)
    this.categoria = categoria
}

enum Categoria {
  PARTE_SUPERIOR, CALZADO, PARTE_INFERIOR, ACCESORIO
}

enum Material {
  ALGODON, POLIESTER, CUERO
}

```