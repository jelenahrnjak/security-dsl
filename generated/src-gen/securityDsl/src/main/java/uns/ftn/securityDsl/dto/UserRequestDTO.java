package uns.ftn.securityDsl.dto;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class UserRequestDTO {

    private String username;

    private String firstName;

    private String lastName;

	private String password;

    private String role;
}

