/*
 * 
 */
package lciat.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

import lciat.diagram.edit.parts.Group2EditPart;
import lciat.diagram.edit.parts.Group3EditPart;
import lciat.diagram.edit.parts.Group4EditPart;
import lciat.diagram.edit.parts.GroupEditPart;
import lciat.diagram.edit.parts.Rol2EditPart;
import lciat.diagram.edit.parts.Rol3EditPart;
import lciat.diagram.edit.parts.Rol4EditPart;
import lciat.diagram.edit.parts.RolEditPart;
import lciat.diagram.providers.LciatElementTypes;
import lciat.diagram.providers.LciatModelingAssistantProvider;

/**
 * @generated
 */
public class LciatModelingAssistantProviderOfGroup3EditPart extends LciatModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((Group3EditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(Group3EditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(LciatElementTypes.Inheritance_4001);
		types.add(LciatElementTypes.Acting_4002);
		types.add(LciatElementTypes.Association_4003);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((Group3EditPart) sourceEditPart, targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(Group3EditPart source, IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof RolEditPart) {
			types.add(LciatElementTypes.Inheritance_4001);
		}
		if (targetEditPart instanceof GroupEditPart) {
			types.add(LciatElementTypes.Inheritance_4001);
		}
		if (targetEditPart instanceof Rol2EditPart) {
			types.add(LciatElementTypes.Inheritance_4001);
		}
		if (targetEditPart instanceof Group2EditPart) {
			types.add(LciatElementTypes.Inheritance_4001);
		}
		if (targetEditPart instanceof Rol3EditPart) {
			types.add(LciatElementTypes.Inheritance_4001);
		}
		if (targetEditPart instanceof Group3EditPart) {
			types.add(LciatElementTypes.Inheritance_4001);
		}
		if (targetEditPart instanceof Rol4EditPart) {
			types.add(LciatElementTypes.Inheritance_4001);
		}
		if (targetEditPart instanceof Group4EditPart) {
			types.add(LciatElementTypes.Inheritance_4001);
		}
		if (targetEditPart instanceof RolEditPart) {
			types.add(LciatElementTypes.Acting_4002);
		}
		if (targetEditPart instanceof GroupEditPart) {
			types.add(LciatElementTypes.Acting_4002);
		}
		if (targetEditPart instanceof Rol2EditPart) {
			types.add(LciatElementTypes.Acting_4002);
		}
		if (targetEditPart instanceof Group2EditPart) {
			types.add(LciatElementTypes.Acting_4002);
		}
		if (targetEditPart instanceof Rol3EditPart) {
			types.add(LciatElementTypes.Acting_4002);
		}
		if (targetEditPart instanceof Group3EditPart) {
			types.add(LciatElementTypes.Acting_4002);
		}
		if (targetEditPart instanceof Rol4EditPart) {
			types.add(LciatElementTypes.Acting_4002);
		}
		if (targetEditPart instanceof Group4EditPart) {
			types.add(LciatElementTypes.Acting_4002);
		}
		if (targetEditPart instanceof RolEditPart) {
			types.add(LciatElementTypes.Association_4003);
		}
		if (targetEditPart instanceof GroupEditPart) {
			types.add(LciatElementTypes.Association_4003);
		}
		if (targetEditPart instanceof Rol2EditPart) {
			types.add(LciatElementTypes.Association_4003);
		}
		if (targetEditPart instanceof Group2EditPart) {
			types.add(LciatElementTypes.Association_4003);
		}
		if (targetEditPart instanceof Rol3EditPart) {
			types.add(LciatElementTypes.Association_4003);
		}
		if (targetEditPart instanceof Group3EditPart) {
			types.add(LciatElementTypes.Association_4003);
		}
		if (targetEditPart instanceof Rol4EditPart) {
			types.add(LciatElementTypes.Association_4003);
		}
		if (targetEditPart instanceof Group4EditPart) {
			types.add(LciatElementTypes.Association_4003);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((Group3EditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(Group3EditPart source, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == LciatElementTypes.Inheritance_4001) {
			types.add(LciatElementTypes.Rol_3001);
			types.add(LciatElementTypes.Group_3002);
			types.add(LciatElementTypes.Rol_3027);
			types.add(LciatElementTypes.Group_3028);
			types.add(LciatElementTypes.Rol_3047);
			types.add(LciatElementTypes.Group_3048);
			types.add(LciatElementTypes.Rol_3062);
			types.add(LciatElementTypes.Group_3063);
		} else if (relationshipType == LciatElementTypes.Acting_4002) {
			types.add(LciatElementTypes.Rol_3001);
			types.add(LciatElementTypes.Group_3002);
			types.add(LciatElementTypes.Rol_3027);
			types.add(LciatElementTypes.Group_3028);
			types.add(LciatElementTypes.Rol_3047);
			types.add(LciatElementTypes.Group_3048);
			types.add(LciatElementTypes.Rol_3062);
			types.add(LciatElementTypes.Group_3063);
		} else if (relationshipType == LciatElementTypes.Association_4003) {
			types.add(LciatElementTypes.Rol_3001);
			types.add(LciatElementTypes.Group_3002);
			types.add(LciatElementTypes.Rol_3027);
			types.add(LciatElementTypes.Group_3028);
			types.add(LciatElementTypes.Rol_3047);
			types.add(LciatElementTypes.Group_3048);
			types.add(LciatElementTypes.Rol_3062);
			types.add(LciatElementTypes.Group_3063);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((Group3EditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(Group3EditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(LciatElementTypes.Inheritance_4001);
		types.add(LciatElementTypes.Acting_4002);
		types.add(LciatElementTypes.Association_4003);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((Group3EditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(Group3EditPart target, IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == LciatElementTypes.Inheritance_4001) {
			types.add(LciatElementTypes.Rol_3001);
			types.add(LciatElementTypes.Group_3002);
			types.add(LciatElementTypes.Rol_3027);
			types.add(LciatElementTypes.Group_3028);
			types.add(LciatElementTypes.Rol_3047);
			types.add(LciatElementTypes.Group_3048);
			types.add(LciatElementTypes.Rol_3062);
			types.add(LciatElementTypes.Group_3063);
		} else if (relationshipType == LciatElementTypes.Acting_4002) {
			types.add(LciatElementTypes.Rol_3001);
			types.add(LciatElementTypes.Group_3002);
			types.add(LciatElementTypes.Rol_3027);
			types.add(LciatElementTypes.Group_3028);
			types.add(LciatElementTypes.Rol_3047);
			types.add(LciatElementTypes.Group_3048);
			types.add(LciatElementTypes.Rol_3062);
			types.add(LciatElementTypes.Group_3063);
		} else if (relationshipType == LciatElementTypes.Association_4003) {
			types.add(LciatElementTypes.Rol_3001);
			types.add(LciatElementTypes.Group_3002);
			types.add(LciatElementTypes.Rol_3027);
			types.add(LciatElementTypes.Group_3028);
			types.add(LciatElementTypes.Rol_3047);
			types.add(LciatElementTypes.Group_3048);
			types.add(LciatElementTypes.Rol_3062);
			types.add(LciatElementTypes.Group_3063);
		}
		return types;
	}

}
