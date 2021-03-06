/**
 *
 * $Id$
 */
package de.uka.ipd.sdq.dsexplore.qml.dimensions.validation;

import de.uka.ipd.sdq.dsexplore.qml.dimensiontypes.DimensionType;

import de.uka.ipd.sdq.dsexplore.qml.units.Unit;

/**
 * A sample validator interface for {@link de.uka.ipd.sdq.dsexplore.qml.dimensions.Dimension}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface DimensionValidator {
	boolean validate();

	boolean validateType(DimensionType value);
	boolean validateUnit(Unit value);
}
