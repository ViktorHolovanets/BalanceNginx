package com.example.cars_base.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "options")
public class Option {
    @Id
    @Column(name = "complectation_id")
    private String complectationId;

    @Column(name = "alcantara")
    private String alcantara;

    @Column(name = "black-roof")
    private String blackRoof;

    @Column(name = "combo-interior")
    private String comboInterior;

    @Column(name = "decorative-interior-lighting")
    private String decorativeInteriorLighting;

    @Column(name = "door-sill-panel")
    private String doorSillPanel;

    @Column(name = "driver-seat-electric")
    private String driverSeatElectric;

    @Column(name = "driver-seat-memory")
    private String driverSeatMemory;

    @Column(name = "driver-seat-support")
    private String driverSeatSupport;

    @Column(name = "driver-seat-updown")
    private String driverSeatUpdown;

    @Column(name = "eco-leather")
    private String ecoLeather;

    @Column(name = "electro-rear-seat")
    private String electroRearSeat;

    @Column(name = "fabric-seats")
    private String fabricSeats;

    @Column(name = "folding-front-passenger-seat")
    private String foldingFrontPassengerSeat;

    @Column(name = "folding-tables-rear")
    private String foldingTablesRear;

    @Column(name = "front-centre-armrest")
    private String frontCentreArmrest;

    @Column(name = "front-seat-support")
    private String frontSeatSupport;

    @Column(name = "front-seats-heat")
    private String frontSeatsHeat;

    @Column(name = "front-seats-heat-vent")
    private String frontSeatsHeatVent;

    @Column(name = "hatch")
    private String hatch;

    @Column(name = "leather")
    private String leather;

    @Column(name = "leather-gear-stick")
    private String leatherGearStick;

    @Column(name = "massage-seats")
    private String massageSeats;

    @Column(name = "panorama-roof")
    private String panoramaRoof;

    @Column(name = "passenger-seat-electric")
    private String passengerSeatElectric;

    @Column(name = "passenger-seat-updown")
    private String passengerSeatUpdown;

    @Column(name = "rear-seat-heat-vent")
    private String rearSeatHeatVent;

    @Column(name = "rear-seat-memory")
    private String rearSeatMemory;

    @Column(name = "rear-seats-heat")
    private String rearSeatsHeat;

    @Column(name = "roller-blind-for-rear-window")
    private String rollerBlindForRearWindow;

    @Column(name = "roller-blinds-for-rear-side-windows")
    private String rollerBlindsForRearSideWindows;

    @Column(name = "seat-memory")
    private String seatMemory;

    @Column(name = "seat-transformation")
    private String seatTransformation;

    @Column(name = "sport-pedals")
    private String sportPedals;

    @Column(name = "sport-seats")
    private String sportSeats;

    @Column(name = "third-rear-headrest")
    private String thirdRearHeadrest;

    @Column(name = "third-row-seats")
    private String thirdRowSeats;

    @Column(name = "tinted-glass")
    private String tintedGlass;

    @Column(name = "wheel-heat")
    private String wheelHeat;
    @Column(name = "wheel-leather")
    private String wheelLeather;
    @Column(name = "360-camera")
    private String _360Camera;
    @Column(name = "adj-pedals")
    private String adjPedals;
}
