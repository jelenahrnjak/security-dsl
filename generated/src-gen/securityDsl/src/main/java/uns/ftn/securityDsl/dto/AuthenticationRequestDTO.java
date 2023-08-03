package uns.ftn.securityDsl.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class AuthenticationRequestDTO {
	
    private String username;
    private String password;
    
}
