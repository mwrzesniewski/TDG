package pl.mwrzesniewski.tdg.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public List<User> getUserList(){

        return userRepository.findAll();
    }
}
