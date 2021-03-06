/**
 */
package de.uka.ipd.sdq.dsexplore.qml.profile.util;

import de.uka.ipd.sdq.dsexplore.qml.declarations.QMLDeclaration;

import de.uka.ipd.sdq.dsexplore.qml.profile.*;

import de.uka.ipd.sdq.identifier.Identifier;

import namedelement.NamedElement;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.uka.ipd.sdq.dsexplore.qml.profile.ProfilePackage
 * @generated
 */
public class ProfileSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ProfilePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfileSwitch() {
		if (modelPackage == null) {
			modelPackage = ProfilePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ProfilePackage.SIMPLE_QML_PROFILE: {
				SimpleQMLProfile simpleQMLProfile = (SimpleQMLProfile)theEObject;
				T result = caseSimpleQMLProfile(simpleQMLProfile);
				if (result == null) result = caseGenericQMLProfile(simpleQMLProfile);
				if (result == null) result = caseQMLDeclaration(simpleQMLProfile);
				if (result == null) result = caseIdentifier(simpleQMLProfile);
				if (result == null) result = caseNamedElement(simpleQMLProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilePackage.GENERIC_QML_PROFILE: {
				GenericQMLProfile genericQMLProfile = (GenericQMLProfile)theEObject;
				T result = caseGenericQMLProfile(genericQMLProfile);
				if (result == null) result = caseQMLDeclaration(genericQMLProfile);
				if (result == null) result = caseIdentifier(genericQMLProfile);
				if (result == null) result = caseNamedElement(genericQMLProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilePackage.REQUIREMENT: {
				Requirement requirement = (Requirement)theEObject;
				T result = caseRequirement(requirement);
				if (result == null) result = caseIdentifier(requirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilePackage.REFINED_QML_PROFILE: {
				RefinedQMLProfile refinedQMLProfile = (RefinedQMLProfile)theEObject;
				T result = caseRefinedQMLProfile(refinedQMLProfile);
				if (result == null) result = caseGenericQMLProfile(refinedQMLProfile);
				if (result == null) result = caseQMLDeclaration(refinedQMLProfile);
				if (result == null) result = caseIdentifier(refinedQMLProfile);
				if (result == null) result = caseNamedElement(refinedQMLProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilePackage.USAGE_SCENARIO_REQUIREMENT: {
				UsageScenarioRequirement usageScenarioRequirement = (UsageScenarioRequirement)theEObject;
				T result = caseUsageScenarioRequirement(usageScenarioRequirement);
				if (result == null) result = caseRequirement(usageScenarioRequirement);
				if (result == null) result = caseIdentifier(usageScenarioRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ProfilePackage.ENTRY_LEVEL_SYSTEM_CALL_REQUIREMENT: {
				EntryLevelSystemCallRequirement entryLevelSystemCallRequirement = (EntryLevelSystemCallRequirement)theEObject;
				T result = caseEntryLevelSystemCallRequirement(entryLevelSystemCallRequirement);
				if (result == null) result = caseRequirement(entryLevelSystemCallRequirement);
				if (result == null) result = caseIdentifier(entryLevelSystemCallRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple QML Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple QML Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleQMLProfile(SimpleQMLProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Generic QML Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Generic QML Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGenericQMLProfile(GenericQMLProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRequirement(Requirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Refined QML Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Refined QML Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefinedQMLProfile(RefinedQMLProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Usage Scenario Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Usage Scenario Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUsageScenarioRequirement(UsageScenarioRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Level System Call Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Level System Call Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryLevelSystemCallRequirement(EntryLevelSystemCallRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Identifier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIdentifier(Identifier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedElement(NamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>QML Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>QML Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQMLDeclaration(QMLDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ProfileSwitch
