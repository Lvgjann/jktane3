package com.ktane.module;

import com.ktane.Bomb;

import java.io.Console;

public class Memory extends Mod {
    private Integer[] positions;
    private Integer[] values;

    public Memory(String name, Integer label, Bomb bomb) {
        super(name, label, bomb);
        this.positions = new Integer[5];
        this.values = new Integer[5];
    }

    public Integer[] getPositions() {
        return positions;
    }

    public Integer[] getValues() {
        return values;
    }

    public void setMemory() {
        Console console = System.console();
        for (int i = 0; i < 5; i++) {
            System.out.println("Step " + i + " : Indicate position");
            positions[i] = Integer.valueOf(console.readLine());
            System.out.println("Step " + i + " : Indicate value");
            values[i] = Integer.valueOf(console.readLine());
        }
    }

    public Object getMemory() {
        return new Object[]{positions, values};
    }
}
