/**
 */
package lciat.impl;

import lciat.LciatPackage;
import lciat.MolefTActivities3;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Molef TActivities3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link lciat.impl.MolefTActivities3Impl#getCharacteristic <em>Characteristic</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MolefTActivities3Impl extends MolefTaskAndActivitiesNodeImpl implements MolefTActivities3 {
	/**
	 * The default value of the '{@link #getCharacteristic() <em>Characteristic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARACTERISTIC_EDEFAULT = "Learning activities help to improve or strengthen skills";

	/**
	 * The cached value of the '{@link #getCharacteristic() <em>Characteristic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristic()
	 * @generated
	 * @ordered
	 */
	protected String characteristic = CHARACTERISTIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MolefTActivities3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LciatPackage.Literals.MOLEF_TACTIVITIES3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCharacteristic() {
		return characteristic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LciatPackage.MOLEF_TACTIVITIES3__CHARACTERISTIC:
				return getCharacteristic();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LciatPackage.MOLEF_TACTIVITIES3__CHARACTERISTIC:
				return CHARACTERISTIC_EDEFAULT == null ? characteristic != null : !CHARACTERISTIC_EDEFAULT.equals(characteristic);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (characteristic: ");
		result.append(characteristic);
		result.append(')');
		return result.toString();
	}

} //MolefTActivities3Impl
