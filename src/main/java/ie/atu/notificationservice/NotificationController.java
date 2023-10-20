package ie.atu.notificationservice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    @PostMapping("/notifications")
    public String confirmNotifications(UserDetails userDetails)
    {
        String notifyMessage = String.format("User %s [%s] has been successfully registered", userDetails.getName(), userDetails.getEmail());
        return notifyMessage;
    }


}
