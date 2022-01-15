package com.coderka.rooms.entity;

import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.coderka.rooms.enums.RoomType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="romm-data")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String roomNo;
    @Enumerated
    private RoomType  roomType;
   

}
