package uns.ftn.securityDsl.model.enumeration;

public enum Role {

    ADMIN,
    USER;
    public String getAuthority() {
    	return this.name();
    }
}
