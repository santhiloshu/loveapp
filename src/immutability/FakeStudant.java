package immutability;

public class FakeStudant extends Studant {
private String fakestudant;
	public FakeStudant(String name) {
		super(name);
		this.setFakestudant(name);
	}
	public String getFakestudant() {
		return fakestudant;
	}
	public void setFakestudant(String fakestudant) {
		this.fakestudant = fakestudant;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((fakestudant == null) ? 0 : fakestudant.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		FakeStudant other = (FakeStudant) obj;
		if (fakestudant == null) {
			if (other.fakestudant != null)
				return false;
		} else if (!fakestudant.equals(other.fakestudant))
			return false;
		return true;
	}

	

}
