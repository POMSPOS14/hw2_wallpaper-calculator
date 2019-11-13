package ru.rosbank.javashcool.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WallpaperCalcServiceTest {

    @Test
    void standardCalculate() {
        WallpaperCalcService service = new WallpaperCalcService();
        double firstWall = 4;
        double secondWall = 8;
        double realHeightWall = 3.9;

        long result = service.calculate(firstWall, secondWall, realHeightWall);

        assertEquals(12, result);
    }

    @Test
    void HardCalculate() {
        WallpaperCalcService service = new WallpaperCalcService();
        double firstWall = 5;
        double secondWall = 6;
        double realHeightWall = 2.75;
        double widthWallpeper = 1.06;
        double lengthRoll = 10;

        long result = service.calculate(firstWall, secondWall, realHeightWall, widthWallpeper, lengthRoll);

        assertEquals(7, result);
    }
}