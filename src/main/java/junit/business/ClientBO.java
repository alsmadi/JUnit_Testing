package junit.business;

import java.util.List;

import junit.business.exception.DifferentCurrenciesException;
import junit.model.Amount;
import junit.model.Product;

public interface ClientBO {

	Amount getClientProductsSum(List<Product> products)
			throws DifferentCurrenciesException;

}