package ie.atu.project3;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/notifications")
public class NotificationController {
    @PostMapping
    public ResponseEntity<Void> sendNotification(@RequestBody NotificationRequest request) {

    }

    @GetMapping("/{userId}")
    public ResponseEntity<List<Notification>> getNotifications(@PathVariable String userId) {

    }
}
