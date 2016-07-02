package fashiontraditional.com.services;

import java.util.List;

import fashiontraditional.com.exception.DataAccessException;
import fashiontraditional.com.model.Address;
import fashiontraditional.com.model.Banner;

public interface AddressService {

	List<Address> findAddressByName(String addressName)throws DataAccessException;
}
