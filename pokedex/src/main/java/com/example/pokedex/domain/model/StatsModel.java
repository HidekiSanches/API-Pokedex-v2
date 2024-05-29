package com.example.pokedex.domain.model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "stats")
public class StatsModel {
    @Id
    @GeneratedValue(generator = "uuid")
    @Column(name = "stats_id", length = 36, columnDefinition = "uuid")
    private UUID statsId;
    @Column(name = "hp", length = 50, nullable = false)
    private int hp;
    @Column(name = "attack", length = 50, nullable = false)
    private int attack;
    @Column(name = "defense", length = 50, nullable = false)
    private int defense;
    @Column(name = "sp_attack", length = 50, nullable = false)
    private int speed;
    @Column(name = "sp_defense", length = 50, nullable = false)
    private int special;

    public StatsModel() {
    }

    public StatsModel(UUID statsId, int hp, int attack, int defense, int speed, int special) {
        this.statsId = statsId;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.special = special;
    }

    public UUID getStatsId() {
        return statsId;
    }

    public void setStatsId(UUID statsId) {
        this.statsId = statsId;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpecial() {
        return special;
    }

    public void setSpecial(int special) {
        this.special = special;
    }
}
