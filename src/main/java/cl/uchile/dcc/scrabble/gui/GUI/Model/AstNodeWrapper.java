package cl.uchile.dcc.scrabble.gui.GUI.Model;

import cl.uchile.dcc.scrabble.gui.AST.Nodes.INode;
import cl.uchile.dcc.scrabble.gui.natives.interfaces.INative;
import java.util.Objects;
import javafx.scene.control.TreeItem;

/**
 * We extend TreeItem to also allow it to wrap an AST Node
 */
public abstract class AstNodeWrapper extends TreeItem<String> {

  protected INode node;

  public AstNodeWrapper(String label, INode node) {
    super(label);
    this.node = node;
  }

  /**
   * Changes the node of the current Tree
   * @param node <code>INode</code> to set as Tree's node
   */
  public void setNode(INode node) {
    this.node = node;
  }

  /**
   * Gets the current stored node
   * @return Tree's node
   */
  public INode getNode() {
    return node;
  }

  /**
   * Evaluates stored node, result is a native scrabble type
   *
   * @return <code>INative</code> representing the stored value
   * @throws StackOverflowError   When node tries to do an Invalid operation
   * @throws NullPointerException When node isn't fully initialized (Maybe user hasnt set a value)
   */
  public INative eval() throws StackOverflowError, NullPointerException {
    return this.node.eval();
  }

  /**
   * Compares two AstNodeWrappers
   * @param o object to compare with
   * @return <code>true</code> if both instances wrap the same node
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof AstNodeWrapper)) {
      return false;
    }
    AstNodeWrapper that = (AstNodeWrapper) o;
    return Objects.equals(getNode(), that.getNode());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getNode());
  }
}
