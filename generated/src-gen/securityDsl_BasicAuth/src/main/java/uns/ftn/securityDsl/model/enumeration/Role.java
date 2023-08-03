package uns.ftn.securityDsl.model.enumeration;

public enum Role {

	admin
,
	admin2
,
	user
;

    public String getAuthority() {
		return this.name();
	}
}
