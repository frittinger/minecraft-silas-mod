package net.schnegg.minecraft.itemgroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IItemProvider;
import net.schnegg.minecraft.SilasMod;

import java.util.function.Supplier;

public class BasicItemGroup extends ItemGroup {

	private final Supplier<IItemProvider> supplier;

	public BasicItemGroup(String label, Supplier<IItemProvider> supplier) {
		super(SilasMod.MOD_ID + "." + label);
		this.supplier = supplier;
	}

	@Override
	public ItemStack createIcon() {
		return new ItemStack(supplier.get());
	}

}
