/*
 * CREDIT SUISSE IS WILLING TO LICENSE THIS SPECIFICATION TO YOU ONLY UPON THE
 * CONDITION THAT YOU ACCEPT ALL OF THE TERMS CONTAINED IN THIS AGREEMENT.
 * PLEASE READ THE TERMS AND CONDITIONS OF THIS AGREEMENT CAREFULLY. BY
 * DOWNLOADING THIS SPECIFICATION, YOU ACCEPT THE TERMS AND CONDITIONS OF THE
 * AGREEMENT. IF YOU ARE NOT WILLING TO BE BOUND BY IT, SELECT THE "DECLINE"
 * BUTTON AT THE BOTTOM OF THIS PAGE. Specification: JSR-354 Money and Currency
 * API ("Specification") Copyright (c) 2012-2013, Credit Suisse All rights
 * reserved.
 */
package javax.money;

import java.util.Locale;

/**
 * A unit of currency.
 * <p>
 * This interface represents a unit of currency such as the British Pound, Euro,
 * US Dollar, Bitcoin or other. It is mainly defined to provide interoperability
 * between different implementations.
 * <p>
 * Currencies can be distinguished within separate arbitrary currency name
 * spaces, whereas as {@link #ISO_NAMESPACE} will be the the most commonly used
 * one, similar to {@link java.util.Currency}.
 * <p>
 * Implementation of this class are required to be
 * <ul>
 * <li>thread-safe
 * <li>immutable
 * <li>serializable. 
 * 
 * @version 0.4
 * @author Werner Keil
 * @author Stephen Colebourne
 * @author Anatole Tresch
 * 
 * @see <a href="https://en.wikipedia.org/wiki/Currency">Wikipedia: Currency</a>
 */
public interface CurrencyUnit {

	/**
	 * Gets the currency code, the effective code depends on the currency and
	 * the name space. It is possible that the two currency may have the same
	 * code, but different name spaces.
	 * <p>
	 * Each currency is uniquely identified within its name space by this code.
	 * As a consequence the currency code is required to be uniqie in
	 * combination with the namespace and not {@code null} or empty.
	 * <p>
	 * This method matches basically the API of <type>java.util.Currency</type>.
	 * 
	 * @see #getNamespace()
	 * @return the currency code, never {@code null}. For the ISO-4217
	 *         namespace, this this will be the three letter ISO-4217 code.
	 *         However, alternate namespaces can have different codes. Also
	 *         there is no constraint about the formatting of alternate codes,
	 *         despite they have to be unique within its corresponding
	 *         namespace.
	 */
	public String getCurrencyCode();
<<<<<<< HEAD
=======

	/**
	 * Gets a numeric currency code. within the ISO-4217 name space, this equals
	 * to the ISO numeric code. In other currency name spaces this number may be
	 * different, or even undefined (-1).
	 * <p>
	 * The numeric code is an optional alternative to the standard currency
	 * code. If defined, the numeric code is required to be unique within its
	 * namespace.
	 * <p>
	 * This method matches the API of <type>java.util.Currency</type>.
	 * 
	 * @see #getNamespace()
	 * @return the numeric currency code
	 */
	public int getNumericCode();

	/**
	 * Gets the number of fractional digits typically used by this currency.
	 * <p>
	 * Different currencies have different numbers of fractional digits by
	 * default. * For example, 'GBP' has 2 fractional digits, but 'JPY' has
	 * zero. * virtual currencies or those with no applicable fractional are
	 * indicated by -1. *
	 * <p>
	 * This method matches the API of <type>java.util.Currency</type>.
	 * 
	 * @return the fractional digits, from 0 to 9 (normally 0, 2 or 3), or -1
	 *         for pseudo-currencies.
	 * 
	 */
	public int getDefaultFractionDigits();

	/**
	 * Get the rounding steps in minor units for when using a cash amount of
	 * this currency. E.g. Swiss Francs in cash are always rounded in 5 minor
	 * unit steps. This results in {@code 1.00, 1.05, 1.10} etc. The cash
	 * rounding consequently extends the default fraction units for certain
	 * currencies.
	 * 
	 * @return the cash rounding, or -1, if not defined.
	 */
	public int getCashRounding();
>>>>>>> refs/remotes/origin/master

}
