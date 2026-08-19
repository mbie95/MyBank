package com.finance.mybank.notification.service;

import com.finance.mybank.auth_user.entity.User;
import com.finance.mybank.notification.dto.NotificationDTO;

public interface NotificationService {
    void sendEmail(NotificationDTO notificationDTO, User user);
}
