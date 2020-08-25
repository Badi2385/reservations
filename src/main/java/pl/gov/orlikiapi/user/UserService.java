package pl.gov.orlikiapi.user;

import org.springframework.security.core.userdetails.UserDetailsService;
import pl.gov.orlikiapi.user.dto.UserRegistrationDto;
import pl.gov.orlikiapi.user.model.User;

public interface UserService extends UserDetailsService {
    User save(UserRegistrationDto userRegistrationDto);
}
