package data.repository;

import data.models.Vehicle;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehiclesTest {

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        Vehicle vehicle = new Vehicle();
    }

    @Test
    public void testToCreateNewVehicle() {
        vehicle.createNewVehicle();
        assertEquals(1, vehicles.size());
    }
}