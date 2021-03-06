package cl.uchile.dcc.scrabble.gui.natives.interfaces;


import cl.uchile.dcc.scrabble.gui.natives.nativeClasses.SBinary;
import cl.uchile.dcc.scrabble.gui.natives.nativeClasses.SInt;

/**
 * Operations that numbers that aren't float should do
 */
public interface IInteger extends INumber {
  /* operations */

  /* Transformations */
  SInt toSInt();

  SBinary toSBinary();

  IInteger sumWithBinary(SBinary num);

  IInteger subsWithBinary(SBinary num);

  IInteger multWithBinary(SBinary num);

  IInteger divWithBinary(SBinary num);
}
