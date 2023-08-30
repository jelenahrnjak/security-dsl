package uns.ftn.securityDsl.model.enumeration;

public enum Role {

	admin,	user;

    public String getAuthority() {
		return this.name();
	}
}

