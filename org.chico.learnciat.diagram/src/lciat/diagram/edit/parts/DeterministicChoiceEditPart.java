/*
 * 
 */
package lciat.diagram.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;

import lciat.diagram.edit.policies.DeterministicChoiceItemSemanticEditPolicy;

/**
 * @generated
 */
public class DeterministicChoiceEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 4017;

	/**
	* @generated
	*/
	public DeterministicChoiceEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new DeterministicChoiceItemSemanticEditPolicy());
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/

	protected Connection createConnectionFigure() {
		return new DeterministicChoiceFigure();
	}

	/**
	* @generated
	*/
	public DeterministicChoiceFigure getPrimaryShape() {
		return (DeterministicChoiceFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class DeterministicChoiceFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public DeterministicChoiceFigure() {
			this.setForegroundColor(THIS_FORE);

		}

	}

	/**
	 * @generated
	 */
	static final Color THIS_FORE = new Color(null, 0, 0, 0);

}