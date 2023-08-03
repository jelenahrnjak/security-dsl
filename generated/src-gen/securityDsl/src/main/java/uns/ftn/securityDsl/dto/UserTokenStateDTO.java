package uns.ftn.securityDsl.dto;

import lombok.*;

@Getter
@Setter
@ToString
public class UserTokenStateDTO {
	
    private String accessToken;
    private Long expiresIn;

    public UserTokenStateDTO() {
        this.accessToken = null;
        this.expiresIn = null;
    }

    public UserTokenStateDTO(String accessToken, long expiresIn) {
        this.accessToken = accessToken;
        this.expiresIn = expiresIn;
    }
}
