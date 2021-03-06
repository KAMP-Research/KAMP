/**
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensiontypes;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensiontypesPackage
 * @generated
 */
public interface DimensiontypesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DimensiontypesFactory eINSTANCE = de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.impl.DimensiontypesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Dimension Type Set</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dimension Type Set</em>'.
	 * @generated
	 */
	DimensionTypeSet createDimensionTypeSet();

	/**
	 * Returns a new object of class '<em>Relation Semantics</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Relation Semantics</em>'.
	 * @generated
	 */
	RelationSemantics createRelationSemantics();

	/**
	 * Returns a new object of class '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Element</em>'.
	 * @generated
	 */
	Element createElement();

	/**
	 * Returns a new object of class '<em>Order</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order</em>'.
	 * @generated
	 */
	Order createOrder();

	/**
	 * Returns a new object of class '<em>Dimension Type Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dimension Type Enum</em>'.
	 * @generated
	 */
	DimensionTypeEnum createDimensionTypeEnum();

	/**
	 * Returns a new object of class '<em>Dimension Type Numeric</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dimension Type Numeric</em>'.
	 * @generated
	 */
	DimensionTypeNumeric createDimensionTypeNumeric();

	/**
	 * Returns a new object of class '<em>Numeric Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Numeric Range</em>'.
	 * @generated
	 */
	NumericRange createNumericRange();

	/**
	 * Returns a new object of class '<em>Dimension Type Repository</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dimension Type Repository</em>'.
	 * @generated
	 */
	DimensionTypeRepository createDimensionTypeRepository();

	/**
	 * Returns a new object of class '<em>Dimension Type Scale</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dimension Type Scale</em>'.
	 * @generated
	 */
	<T extends Number> DimensionTypeScale<T> createDimensionTypeScale();

	/**
	 * Returns a new object of class '<em>Scale Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scale Element</em>'.
	 * @generated
	 */
	<T extends Number> ScaleElement<T> createScaleElement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	DimensiontypesPackage getDimensiontypesPackage();

} //DimensiontypesFactory
