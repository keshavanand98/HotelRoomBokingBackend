package com.coderka.rooms.roomcontroller;

import java.util.List;

import com.coderka.rooms.entity.Room;
import com.coderka.rooms.services.RoomService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rooms")
public class RoomController {

    @Autowired
    RoomService roomService;

    @GetMapping
    public ResponseEntity<?> getRooms(){

       List<Room> rooms =  roomService.getRooms();
        return ResponseEntity.ok(rooms);
    }
    @PostMapping
    public ResponseEntity<?> addRooms(@RequestBody Room room){
        roomService.addRooms(room); 
        return ResponseEntity.ok().build();
    }
}
