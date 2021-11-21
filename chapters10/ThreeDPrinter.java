package chapters10;

// 재료 : 파우더, 플라스틱

public class ThreeDPrinter<T> {
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	
	public T getMaterial() {
		return material;
	}

	@Override
	public String toString() {
		return material.toString();
	}
}
