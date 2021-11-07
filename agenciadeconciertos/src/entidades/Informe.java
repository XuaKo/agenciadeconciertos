package entidades;

public class Informe {
	private long id;
	private String Revision;

	public Informe(long id, String revision) {
		super();
		this.id = id;
		Revision = revision;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getRevision() {
		return Revision;
	}

	public void setRevision(String revision) {
		Revision = revision;
	}

	public String toString() {
		return "Informe [id=" + id + ", Revision=" + Revision + "]";
	}

}
