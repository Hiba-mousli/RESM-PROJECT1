// package collage.project1.resm.api;

// import java.net.URI;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.ResponseEntity;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

// import collage.project1.resm.domain.User;
// import collage.project1.resm.service.UserService;
// import lombok.RequiredArgsConstructor;

// @RestController
// @RequiredArgsConstructor
// @RequestMapping("/api")
// public class UserInfoController {
//     @Autowired
//     private UserService userService;

//     // @PostMapping("/user/register")
//     // public ResponseEntity<User> register(@RequestBody User user) throws Exception{
//     //     userService.register(user);
//     //     return ResponseEntity.ok().build();
//     // }


//     // @GetMapping("/register")
//     // public String register(final Model model){
//     //     model.addAttribute("userData", new UserData());
//     //     return "account/register";
//     // }
    

// //     @PostMapping("/register")
// //     public String userRegistration(final @Valid  UserData userData, final BindingResult bindingResult, final Model model){
// //         if(bindingResult.hasErrors()){
// //             model.addAttribute("registrationForm", userData);
// //             return "account/register";
// //         }
// //         try {
// //             userService.register(userData);
// //         }catch (UserAlreadyExistException e){
// //             bindingResult.rejectValue("email", "userData.email","An account already exists for this email.");
// //             model.addAttribute("registrationForm", userData);
// //             return "account/register";
// //         }
// //         return REDIRECT+"/starter";
// //     }
// // }
// }
