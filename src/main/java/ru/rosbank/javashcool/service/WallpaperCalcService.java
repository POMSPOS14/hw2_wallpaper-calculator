package ru.rosbank.javashcool.service;

public class WallpaperCalcService {

    public long calculator(double firstWall, double secondWall, double realHeightWall) {

        double perimeter = firstWall * 2 + secondWall * 2;
        double widthWallpeper = 1.06;
        double heightWall = realHeightWall + 0.10;
        double lengthRoll = 10;

        double quantityPanels = Math.ceil(perimeter / widthWallpeper);
        double stripInRoll = Math.floor(lengthRoll / heightWall);

        long quantityRoll = Math.round(Math.ceil(quantityPanels / stripInRoll));

        return quantityRoll;
    }

    public long calculator(double firstWall, double secondWall, double realHeightWall, double widthWallpeper, double lengthRoll) {

        double perimeter = firstWall * 2 + secondWall * 2;
        double heightWall = realHeightWall + 0.10;


        double quantityPanels = Math.ceil(perimeter / widthWallpeper);
        double stripInRoll = Math.floor(lengthRoll / heightWall);

        long quantityRoll = Math.round(Math.ceil(quantityPanels / stripInRoll));

        return quantityRoll;
    }
}
