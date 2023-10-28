/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package virtualpetgame;

/**
 *
 * @author phoeb
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.ArrayList;

public class DatabaseSetup {

    private static final String URL = "jdbc:derby:virtualpetdb;create=true";
    private static final String USERNAME = "pdc"; //your DB username
    private static final String PASSWORD = "pdc"; //your DB password

    private static Connection conn;
    private static Statement statement;

    static {
        establishConnection();
        conn = getConnection();
        try {
            statement = conn.createStatement();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        initializeDatabase();
    }

    public static Connection getConnection() {
        return conn;
    }

    private static void establishConnection() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                System.out.println(URL + " Connected Successfully...");
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void closeConnections() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    private static void initializeDatabase() {
        try {
            // Create pets table
            statement.addBatch("CREATE TABLE PETS (NAME VARCHAR(50) NOT NULL, TYPE VARCHAR(10) NOT NULL, HUNGER INT, ENERGY INT, FUN INT, HYGIENE INT, BLADDER INT, THIRST INT)");

            // Insert initial pet data
            statement.addBatch("INSERT INTO PETS VALUES ('Tim', 'Cat', 30, 30, 30, 30, 30, 30),\n"
                    + "('Bob', 'Dog', 50, 50, 50, 50, 50, 50),\n"
                    + "('Max', 'Dog', 60, 40, 70, 30, 50, 50),\n"
                    + "('Kiki', 'Cat', 70, 30, 60, 40, 50, 50)");

            // Execute batch
            statement.executeBatch();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static List<Animal> loadExistingPets() {
        List<Animal> pets = new ArrayList<>();
        try {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM PETS");
            while (resultSet.next()) {
                String name = resultSet.getString("NAME");
                String type = resultSet.getString("TYPE");
                int hunger = resultSet.getInt("HUNGER");
                int energy = resultSet.getInt("ENERGY");
                int fun = resultSet.getInt("FUN");
                int hygiene = resultSet.getInt("HYGIENE");
                int bladder = resultSet.getInt("BLADDER");
                int thirst = resultSet.getInt("THIRST");

                // Create a new pet object based on type
                Animal pet;
                if ("Dog".equals(type)) {
                    pet = new Dog(name);
                } else if ("Cat".equals(type)) {
                    pet = new Cat(name);
                } else {
                    throw new IllegalArgumentException("Invalid pet type: " + type);
                }

                // Set the attributes using the setter method
                if (pet instanceof Dog) {
                    ((Dog) pet).setAttributes(hunger, energy, fun, hygiene, bladder, thirst);
                    pets.add(pet);
                } else if (pet instanceof Cat) {
                    ((Cat) pet).setAttributes(hunger, energy, fun, hygiene, bladder, thirst);
                    pets.add(pet);
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return pets;
    }

    public static void saveNewPet(Animal pet) {
        try {
            // Check if the pet with the given name already exists in the database
            ResultSet resultSet = statement.executeQuery("SELECT * FROM PETS WHERE NAME = '" + pet.getName() + "'");
            if (resultSet.next()) {
                // Pet with the same name exists, update its attributes
                try ( PreparedStatement updateStatement = conn.prepareStatement(
                        "UPDATE PETS SET HUNGER = ?, ENERGY = ?, FUN = ?, HYGIENE = ?, BLADDER = ?, THIRST = ? WHERE NAME = ?")) {
                    updateStatement.setInt(1, pet.getHunger());
                    updateStatement.setInt(2, pet.getEnergy());
                    updateStatement.setInt(3, pet.getFun());
                    updateStatement.setInt(4, pet.getHygiene());
                    updateStatement.setInt(5, pet.getBladder());
                    updateStatement.setInt(6, pet.getThirst());
                    updateStatement.setString(7, pet.getName());
                    updateStatement.executeUpdate();
                }
            } else {
                // Pet with the given name doesn't exist, insert a new entry
                try ( PreparedStatement insertStatement = conn.prepareStatement(
                        "INSERT INTO PETS VALUES (?, ?, ?, ?, ?, ?, ?, ?)")) {
                    insertStatement.setString(1, pet.getName());
                    // Check the type of the pet and set the appropriate type in the database
                    if (pet instanceof Dog) {
                        insertStatement.setString(2, "Dog");
                    } else if (pet instanceof Cat) {
                        insertStatement.setString(2, "Cat");
                    } else {
                        throw new IllegalArgumentException("Invalid pet type.");
                    }
                    insertStatement.setInt(3, pet.getHunger());
                    insertStatement.setInt(4, pet.getEnergy());
                    insertStatement.setInt(5, pet.getFun());
                    insertStatement.setInt(6, pet.getHygiene());
                    insertStatement.setInt(7, pet.getBladder());
                    insertStatement.setInt(8, pet.getThirst());
                    insertStatement.executeUpdate();
                }
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
