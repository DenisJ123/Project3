package ie.atu.project3;

import org.springframework.stereotype.Service;

@Service
public class NotificationEventListener {
    @RabbitListener(queues = "tool-notifications")
    public void handleOverdueNotification(String message) {
    }
}

