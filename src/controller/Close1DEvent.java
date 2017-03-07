package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vue.MainWindow1D;

public class Close1DEvent implements ActionListener {


	/******ATTRIBUTES******/
	MainWindow1D window;
	
	
	/**
	 * ****CONSTRUCTOR*****.
	 */
	public Close1DEvent(MainWindow1D window) {
		super();
		this.window = window;
		
	}

	
	/**
	 * ****CLASS METHODS*****.
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		this.window.dispose();
		
	}

	
}
