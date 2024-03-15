package codewars.seven;

import lombok.Getter;

@Getter
public class BuildingBlocks {
    private final int width;
    private final int length;
    private final int height;

    public BuildingBlocks(int[] sides) {
        width = sides[0];
        length = sides[1];
        height = sides[2];
    }

    public int getVolume() {
        return width * length * height;
    }

    public int getSurfaceArea() {
        int a = width;
        int b = length;
        int c = height;
        return 2 * (a * b + b * c + a * c);
    }
}
