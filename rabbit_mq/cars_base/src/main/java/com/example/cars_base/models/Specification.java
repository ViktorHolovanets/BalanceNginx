package com.example.cars_base.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "specifications")
public class Specification {
    @Id
    @Column(name = "complectation_id")
    private String complectationId;

    @Column(name = "back-brake")
    private String backBrake;

    @Column(name = "feeding")
    private String feeding;

    @Column(name = "horse-power")
    private String horsePower;

    @Column(name = "kvt-power")
    private String kvtPower;

    @Column(name = "rpm-power")
    private String rpmPower;

    @Column(name = "engine-type")
    private String engineType;

    @Column(name = "transmission")
    private String transmission;

    @Column(name = "drive")
    private String drive;

    @Column(name = "volume")
    private String volume;

    @Column(name = "time-to-100")
    private String timeTo100;

    @Column(name = "cylinders-order")
    private String cylindersOrder;

    @Column(name = "max-speed")
    private String maxSpeed;

    @Column(name = "compression")
    private String compression;

    @Column(name = "cylinders-value")
    private String cylindersValue;

    @Column(name = "diametr")
    private String diametr;

    @Column(name = "piston-stroke")
    private String pistonStroke;

    @Column(name = "engine-feeding")
    private String engineFeeding;

    @Column(name = "engine-order")
    private String engineOrder;

    @Column(name = "gear-value")
    private String gearValue;

    @Column(name = "moment")
    private String moment;

    @Column(name = "petrol-type")
    private String petrolType;

    @Column(name = "valves")
    private String valves;

    @Column(name = "weight")
    private String weight;

    @Column(name = "wheel-size")
    private String wheelSize;

    @Column(name = "wheel-base")
    private String wheelBase;

    @Column(name = "front-wheel-base")
    private String frontWheelBase;

    @Column(name = "back-wheel-base")
    private String backWheelBase;

    @Column(name = "front-brake")
    private String frontBrake;

    @Column(name = "front-suspension")
    private String frontSuspension;

    @Column(name = "back-suspension")
    private String backSuspension;

    @Column(name = "height")
    private String height;

    @Column(name = "width")
    private String width;

    @Column(name = "fuel-tank-capacity")
    private String fuelTankCapacity;

    @Column(name = "seats")
    private String seats;

    @Column(name = "length")
    private String length;

    @Column(name = "doors-count")
    private String doorsCount;

    @Column(name = "emission-euro-class")
    private String emissionEuroClass;

    @Column(name = "volume-litres")
    private String volumeLitres;

    @Column(name = "consumption-mixed")
    private String consumptionMixed;

    @Column(name = "clearance")
    private String clearance;

    @Column(name = "trunks-min-capacity")
    private String trunksMinCapacity;

    @Column(name = "trunks-max-capacity")
    private String trunksMaxCapacity;

}
