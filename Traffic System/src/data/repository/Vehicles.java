package data.repository;

import data.models.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class Vehicles implements VehicleRepository {

    private List<Vehicle> vehicles =  new ArrayList<Vehicle>();

    @Override
    public Vehicle save(Vehicle vehicle) {
        if (vehicle == null) {
            throw new IllegalArgumentException("Vehicle cannot be null");
        }
        Vehicle existing = null;
        for (Vehicle vehicle1 : vehicles) {
            if(vehicle1.getId() == vehicle.getId()) {
                existing = vehicle1;
                break;
            }
        }
        if (existing != null) {
            vehicles.remove(existing);
        }
        vehicles.add(vehicle);
        return vehicle;
    }

    @Override
    public Vehicle findById(int id) {
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == id) {
                return vehicle;
            }
        }
        return null;
    }

    @Override
    public List<Vehicle> findAll() {
        return new ArrayList<>(vehicles);
    }

    @Override
    public void deleteById(int id) {
        Vehicle toDelete = null;
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getId() == id) {
                toDelete = vehicle;
                break;
            }
        }
        if (toDelete != null) {
            vehicles.remove(toDelete);
        }
    }

    @Override
    public void deleteAll() {
        vehicles.clear();
    }

    @Override
    public void delete(Vehicle vehicle) {
        if (vehicle == null) {
            return;
        }
        Vehicle toDelete = null;
        for (Vehicle vehicle1 : vehicles) {
            if (vehicle1.getId() == vehicle.getId()) {
                toDelete = vehicle1;
                break;
            }
        }
        if (toDelete != null) {
            vehicles.remove(toDelete);
        }
    }

    @Override
    public long count() {
        return vehicles.size();
    }
}
