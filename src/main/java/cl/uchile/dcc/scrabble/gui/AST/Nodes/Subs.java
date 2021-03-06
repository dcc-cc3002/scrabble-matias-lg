package cl.uchile.dcc.scrabble.gui.AST.Nodes;

import cl.uchile.dcc.scrabble.gui.natives.interfaces.INative;
import cl.uchile.dcc.scrabble.gui.natives.interfaces.operations.INumberOperable;
import cl.uchile.dcc.scrabble.gui.natives.nativeClasses.SBinary;
import cl.uchile.dcc.scrabble.gui.natives.nativeClasses.SBool;
import cl.uchile.dcc.scrabble.gui.natives.nativeClasses.SString;

public class Subs extends OpNode {

  public Subs(SString leftChild,
      INode rightChild) {
    super(leftChild, rightChild);
  }

  public Subs(INumberOperable leftChild,
      INode rightChild) {
    super(leftChild, rightChild);
  }

  public Subs(SBinary leftChild,
      INode rightChild) {
    super(leftChild, rightChild);
  }

  public Subs(SBool leftChild,
      INode rightChild) {
    super(leftChild, rightChild);
  }

  public Subs(INode leftChild, INode rightChild) {
    super(leftChild, rightChild);
  }

  /**
   * Substracts left and right childs, evaluating them first
   *
   * @return New INative containing the result of substraction of left and right childs
   */
  @Override
  public INative eval() {
    return this.state.subs(getLeftChild(), getRightChild());
  }
}
