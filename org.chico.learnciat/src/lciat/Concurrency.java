/**
 */
package lciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concurrency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.Concurrency#getIcLabel <em>Ic Label</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getConcurrency()
 * @model annotation="gmf.link label='icLabel' source='source' target='target' style='solid' width='1' color='0,0,0' tool.small.bundle='org.chico.learnciat.figures' tool.small.path='images/IndependentConcurrencyTransition.gif' source.constraint='self <> oppositeEnd' target.constraint='self <> oppositeEnd'"
 * @generated
 */
public interface Concurrency extends LearningLink {
	/**
	 * Returns the value of the '<em><b>Ic Label</b></em>' attribute.
	 * The default value is <code>"|||"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ic Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ic Label</em>' attribute.
	 * @see lciat.LciatPackage#getConcurrency_IcLabel()
	 * @model default="|||" changeable="false"
	 * @generated
	 */
	String getIcLabel();

} // Concurrency
