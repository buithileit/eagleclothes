package fashiontraditional.com.dao;

import java.util.List;

import fashiontraditional.com.exception.DataAccessException;
import fashiontraditional.com.model.Address;
import fashiontraditional.com.model.Banner;

public interface AddressDAO {

	List<Address> findAddressByName(String addressName)throws DataAccessException;

	Address findAddressById(Long addressId) throws DataAccessException;

	Long createAddress(Address address) throws DataAccessException;

	boolean updateAddress(Address Address) throws DataAccessException;

	boolean deleteAddress(Address Address) throws DataAccessException;

}
