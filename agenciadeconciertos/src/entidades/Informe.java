package entidades;

public class Informe {
	
	private String Revision;

	private Informe(String revision) {
		super();
		Revision = revision;
	}

	public String getRevision() {
		return Revision;
	}

	public void setRevision(String revision) {
		Revision = revision;
	}

}
