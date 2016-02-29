package org.gnode;

import org.g_node.nix.*;

public class NixJavaExample {
    public static void main(String[] args) {
        System.out.println("Writing to file");

        File fd = File.open("test.nix", FileMode.Overwrite);

        Block b = fd.createBlock("Data", "example");
        DataArray d = b.createDataArray("fibonacci", "numbers", DataType.Double, new NDSize(new int[]{2, 3}));

        float[] data = {1, 1, 2, 3, 5, 8};
        d.setData(data, new NDSize(new int[]{2, 3}), new NDSize(2, 0));

        d = null;
        b = null;

        fd.close();
        System.out.println("Done.");
    }
}
