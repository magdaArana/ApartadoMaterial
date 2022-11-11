package uia.com.inventarios;

import java.io.IOException;

public class ApartadoMaterial extends NivelInventario {

    @Override
    public void agrega(String idPartida, String descPartida, String idSubpartida, String descSubpartida, String idCat, String descCat, String cantidad) {
        super.agrega(idPartida, descPartida, idSubpartida, descSubpartida, idCat, descCat, cantidad);
    }

    @Override
    public void serializa() throws IOException {
        super.serializa();
    }

    @Override
    public String busca(int id, String name, String descCat, String cantidad, String idPartida, String idSubpartida, String idCat) {
        return super.busca(id, name, descCat, cantidad, idPartida, idSubpartida, idCat);
    }
}
