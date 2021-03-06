/**
 */
package lciat;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Learning Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link lciat.LearningLink#getSource <em>Source</em>}</li>
 *   <li>{@link lciat.LearningLink#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see lciat.LciatPackage#getLearningLink()
 * @model
 * @generated
 */
public interface LearningLink extends Link {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(LearningNode)
	 * @see lciat.LciatPackage#getLearningLink_Source()
	 * @model required="true"
	 * @generated
	 */
	LearningNode getSource();

	/**
	 * Sets the value of the '{@link lciat.LearningLink#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(LearningNode value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(LearningNode)
	 * @see lciat.LciatPackage#getLearningLink_Target()
	 * @model required="true"
	 * @generated
	 */
	LearningNode getTarget();

	/**
	 * Sets the value of the '{@link lciat.LearningLink#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(LearningNode value);

} // LearningLink
