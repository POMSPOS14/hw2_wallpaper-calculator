package ru.rosbank.javashcool.service;

public class WallpaperCalcService {

    public long calculate(double firstWall, double secondWall, double realHeightWall) {

        double widthWallpaper = 1.06;
        double lengthRoll = 10;

        long quantityRoll = calculate( firstWall, secondWall, realHeightWall, widthWallpaper, lengthRoll);

        return quantityRoll;
    }

    public long calculate(double firstWall, double secondWall, double realHeightWall, double widthWallpaper, double lengthRoll) {

        double perimeter = firstWall * 2 + secondWall * 2;
        double heightWall = realHeightWall + 0.10;

        double quantityPanels = Math.ceil(perimeter / widthWallpaper);
        double stripInRoll = Math.floor(lengthRoll / heightWall);

        long quantityRoll = Math.round(Math.ceil(quantityPanels / stripInRoll));

        return quantityRoll;
    }
}
