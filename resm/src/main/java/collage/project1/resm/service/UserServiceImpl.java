package collage.project1.resm.service;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import collage.project1.resm.domain.User;
import collage.project1.resm.repo.UserRepo;
import lombok.RequiredArgsConstructor;

@Service @RequiredArgsConstructor @Component
public class UserServiceImpl implements UserService {
    private final UserRepo userRepo;
    @Override
    public void singUp(User user) throws Exception {
        if(checkIfUserExist(user.getUsername()))
        {
            throw new Exception("User already exists for this email ");
        }
        else if(! isValid(user.getUsername()))
        {
            throw new Exception("Sorry, this email is not valid");
        }
        else
        {
            User Euser = new User();
            Euser.setUsername(user.getUsername());
            Euser.setHashedPassword(user.getHashedPassword());
            Euser.setFirstName(user.getFirstName());
            Euser.setLastName(user.getLastName());
            Euser.getAddress().getClass().
           
        }
    }

    @Override
    public boolean checkIfUserExist(String username) {
        return userRepo.findByUsername(username) !=null ? true : false;
    }
    public static boolean isValid(String username)
    {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                            "[a-zA-Z0-9_+&*-]+)*@" +
                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                            "A-Z]{2,7}$";
        Pattern pat = Pattern.compile(emailRegex);
        if (username == null)
            return false;
        return pat.matcher(username).matches();
    }

    
}
