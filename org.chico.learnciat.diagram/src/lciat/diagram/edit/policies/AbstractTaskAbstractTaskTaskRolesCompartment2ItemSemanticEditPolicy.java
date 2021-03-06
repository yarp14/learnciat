/*
* 
*/
package lciat.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import lciat.diagram.edit.commands.Group4CreateCommand;
import lciat.diagram.edit.commands.Rol4CreateCommand;
import lciat.diagram.providers.LciatElementTypes;

/**
 * @generated
 */
public class AbstractTaskAbstractTaskTaskRolesCompartment2ItemSemanticEditPolicy
		extends LciatBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public AbstractTaskAbstractTaskTaskRolesCompartment2ItemSemanticEditPolicy() {
		super(LciatElementTypes.AbstractTask_3079);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (LciatElementTypes.Rol_3062 == req.getElementType()) {
			return getGEFWrapper(new Rol4CreateCommand(req));
		}
		if (LciatElementTypes.Group_3063 == req.getElementType()) {
			return getGEFWrapper(new Group4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
