package com.github.hmdev.swing;

import java.awt.Component;
import java.awt.Insets;
import java.io.Serial;

import javax.swing.border.TitledBorder;

public class NarrowTitledBorder extends TitledBorder
{
	@Serial
	private static final long serialVersionUID = 1L;
	
	public NarrowTitledBorder(String title)
	{
		super(title);
	}
	
	@Override
	public Insets getBorderInsets(Component c)
	{
		return new Insets(15, 7, 6, 7);
	}
}
