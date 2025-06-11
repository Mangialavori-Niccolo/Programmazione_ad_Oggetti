package org.Niccolo.exceptions;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckLicencePlateTest {
    @Test
    void checkLicencePlateTest(){
        assertDoesNotThrow(() -> CheckLicencePlate.checkLicencePlate("AA123BB"));
        assertThrows(IllegalArgumentException.class, () -> CheckLicencePlate.checkLicencePlate("1234567"));
        assertThrows(IllegalArgumentException.class, () -> CheckLicencePlate.checkLicencePlate("12345678"));
        assertThrows(IllegalArgumentException.class, () -> CheckLicencePlate.checkLicencePlate("AA1234A"));
    }
}