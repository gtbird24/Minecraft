package net.minecraft.src;

import java.util.Random;

public class BlockExample extends Block
{
    
	private Icon ExampleIconTop;
    private Icon ExampleIconFront;
    
	public BlockExample(int par1)
    {
        super(par1, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    /**
     * From the specified side and block metadata retrieves the blocks texture. Args: side, metadata
     */
    public Icon getIcon(int par1, int par2)
    {
        return par1 == 1 ? this.ExampleIconTop : (par1 == 0 ? Block.planks.getBlockTextureFromSide(par1) : (par1 != 2 && par1 != 4 ? this.blockIcon : this.ExampleIconFront));
    }

    /**
     * When this method is called, your block should register all the icons it needs with the given IconRegister. This
     * is the only chance you get to register icons.
     */
    public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon("workbench_side");
        this.ExampleIconTop = par1IconRegister.registerIcon("workbench_top");
        this.ExampleIconFront = par1IconRegister.registerIcon("workbench_front");
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return Block.tnt.blockID;
    }
}
