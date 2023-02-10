package campo.minado.modelo;

@FunctionalInterface
public interface CampoObservador {

	public void eventocorreu(Campo campo, CampoEvento evento);
}
