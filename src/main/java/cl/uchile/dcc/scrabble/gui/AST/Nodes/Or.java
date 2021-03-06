package cl.uchile.dcc.scrabble.gui.AST.Nodes;

import cl.uchile.dcc.scrabble.gui.natives.interfaces.INative;
import cl.uchile.dcc.scrabble.gui.natives.interfaces.operations.INumberOperable;
import cl.uchile.dcc.scrabble.gui.natives.nativeClasses.SBinary;
import cl.uchile.dcc.scrabble.gui.natives.nativeClasses.SBool;
import cl.uchile.dcc.scrabble.gui.natives.nativeClasses.SString;

public class Or extends OpNode {


  public Or(SString leftChild,
      INode rightChild) {
    super(leftChild, rightChild);
  }

  public Or(INumberOperable leftChild,
      INode rightChild) {
    super(leftChild, rightChild);
  }

  public Or(SBinary leftChild,
      INode rightChild) {
    super(leftChild, rightChild);
  }

  public Or(SBool leftChild,
      INode rightChild) {
    super(leftChild, rightChild);
  }

  public Or(INode leftChild, INode rightChild) {
    super(leftChild, rightChild);
  }

  /**
   * Logical OR between left and right childs, evaluating them first
   *
   * @return New INative containing the result of logical OR of left and right childs
   */
  @Override
  public INative eval() {
    return (INative) this.state.or(getLeftChild(), getRightChild());
  }
}
