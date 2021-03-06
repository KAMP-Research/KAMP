/**
 */
package de.uka.ipd.sdq.dsexplore.qml.declarations;

import de.uka.ipd.sdq.identifier.IdentifierPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarationsFactory
 * @model kind="package"
 * @generated
 */
public interface QMLDeclarationsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "declarations";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://sdq.ipd.uka.de/QML/declarations/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "declarations";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QMLDeclarationsPackage eINSTANCE = de.uka.ipd.sdq.dsexplore.qml.declarations.impl.QMLDeclarationsPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.qml.declarations.impl.QMLDeclarationsImpl <em>QML Declarations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.qml.declarations.impl.QMLDeclarationsImpl
	 * @see de.uka.ipd.sdq.dsexplore.qml.declarations.impl.QMLDeclarationsPackageImpl#getQMLDeclarations()
	 * @generated
	 */
	int QML_DECLARATIONS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QML_DECLARATIONS__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Qml Declarations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QML_DECLARATIONS__QML_DECLARATIONS = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>QML Declarations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QML_DECLARATIONS_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link de.uka.ipd.sdq.dsexplore.qml.declarations.impl.QMLDeclarationImpl <em>QML Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.uka.ipd.sdq.dsexplore.qml.declarations.impl.QMLDeclarationImpl
	 * @see de.uka.ipd.sdq.dsexplore.qml.declarations.impl.QMLDeclarationsPackageImpl#getQMLDeclaration()
	 * @generated
	 */
	int QML_DECLARATION = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QML_DECLARATION__ID = IdentifierPackage.IDENTIFIER__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QML_DECLARATION__NAME = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>QML Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QML_DECLARATION_FEATURE_COUNT = IdentifierPackage.IDENTIFIER_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarations <em>QML Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QML Declarations</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarations
	 * @generated
	 */
	EClass getQMLDeclarations();

	/**
	 * Returns the meta object for the containment reference list '{@link de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarations#getQmlDeclarations <em>Qml Declarations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Qml Declarations</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclarations#getQmlDeclarations()
	 * @see #getQMLDeclarations()
	 * @generated
	 */
	EReference getQMLDeclarations_QmlDeclarations();

	/**
	 * Returns the meta object for class '{@link de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclaration <em>QML Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QML Declaration</em>'.
	 * @see de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclaration
	 * @generated
	 */
	EClass getQMLDeclaration();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QMLDeclarationsFactory getQMLDeclarationsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.qml.declarations.impl.QMLDeclarationsImpl <em>QML Declarations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.qml.declarations.impl.QMLDeclarationsImpl
		 * @see de.uka.ipd.sdq.dsexplore.qml.declarations.impl.QMLDeclarationsPackageImpl#getQMLDeclarations()
		 * @generated
		 */
		EClass QML_DECLARATIONS = eINSTANCE.getQMLDeclarations();

		/**
		 * The meta object literal for the '<em><b>Qml Declarations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QML_DECLARATIONS__QML_DECLARATIONS = eINSTANCE.getQMLDeclarations_QmlDeclarations();

		/**
		 * The meta object literal for the '{@link de.uka.ipd.sdq.dsexplore.qml.declarations.impl.QMLDeclarationImpl <em>QML Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.uka.ipd.sdq.dsexplore.qml.declarations.impl.QMLDeclarationImpl
		 * @see de.uka.ipd.sdq.dsexplore.qml.declarations.impl.QMLDeclarationsPackageImpl#getQMLDeclaration()
		 * @generated
		 */
		EClass QML_DECLARATION = eINSTANCE.getQMLDeclaration();

	}

} //QMLDeclarationsPackage
