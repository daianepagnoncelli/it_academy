package cat.itacademy.barcelonactiva.pagnoncellidaiane.S05T02.service.impl;

import cat.itacademy.barcelonactiva.pagnoncellidaiane.S05T02.model.entity.Role;
import cat.itacademy.barcelonactiva.pagnoncellidaiane.S05T02.model.entity.User;
import cat.itacademy.barcelonactiva.pagnoncellidaiane.S05T02.exception.UserNotFoundException;
import cat.itacademy.barcelonactiva.pagnoncellidaiane.S05T02.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String email) throws UserNotFoundException {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new UserNotFoundException("User not found with email: " + email));
        return user;
    }

    public User createUser(String email, String firstName, String lastName, String password, Role role) {
        User user = User.builder()
                .email(email)
                .firstName(firstName)
                .lastName(lastName)
                .password(passwordEncoder.encode(password))
                .role(role)
                .build();
        return userRepository.save(user);
    }
}










