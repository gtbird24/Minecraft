package net.minecraft.src;

import net.minecraft.src.Material;
import net.minecraft.src.TileEntity;
import net.minecraft.src.Vec3Pool;

public interface IBlockAccess {

   int func_72798_a(int var1, int var2, int var3);

   TileEntity func_72796_p(int var1, int var2, int var3);

   int func_72805_g(int var1, int var2, int var3);

   Material func_72803_f(int var1, int var2, int var3);

   boolean func_72809_s(int var1, int var2, int var3);

   Vec3Pool func_82732_R();

   int func_72879_k(int var1, int var2, int var3, int var4);
}
