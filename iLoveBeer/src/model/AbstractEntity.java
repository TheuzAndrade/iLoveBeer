package model;

public abstract class AbstractEntity {
	public abstract Long getId();
	public abstract void setId(Long id);

	@Override
	public boolean equals(Object arg) {
		AbstractEntity entity = (AbstractEntity) arg;
		return entity.getId() == this.getId();
	}

	public boolean hasValidId() {
		return getId() != null && getId() != 0;
	}
}