package com.tpi.notificaations.controller;

import com.tpi.notificaations.models.User;
import com.tpi.notificaations.service.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notif")
public class NotificationController
{
private final NotificationService notificationService;

public NotificationController (NotificationService service){
    this.notificationService = service;
}
    @GetMapping
    public ResponseEntity<User> showUser(@PathVariable Long id) {
        return ResponseEntity.ok(notificationService.getUser());
    }

}
