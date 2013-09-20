package net.minecraft.src;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityEnderPearl;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;

public class ItemEnderPearl extends Item {

   public ItemEnderPearl(int p_i3648_1_) {
      super(p_i3648_1_);
      this.field_77777_bU = 16;
      this.func_77637_a(CreativeTabs.field_78026_f);
   }

   public ItemStack func_77659_a(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_) {
      if(p_77659_3_.field_71075_bZ.field_75098_d) {
         return p_77659_1_;
      } else if(p_77659_3_.field_70154_o != null) {
         return p_77659_1_;
      } else {
         --p_77659_1_.field_77994_a;
         p_77659_2_.func_72956_a(p_77659_3_, "random.bow", 0.5F, 0.4F / (field_77697_d.nextFloat() * 0.4F + 0.8F));
         if(!p_77659_2_.field_72995_K) {
            p_77659_2_.func_72838_d(new EntityEnderPearl(p_77659_2_, p_77659_3_));
         }

         return p_77659_1_;
      }
   }
}
