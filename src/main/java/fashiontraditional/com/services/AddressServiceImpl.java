package fashiontraditional.com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fashiontraditional.com.dao.AddressDAO;
import fashiontraditional.com.dao.BannerDAO;
import fashiontraditional.com.exception.DataAccessException;
import fashiontraditional.com.model.Address;
import fashiontraditional.com.model.Banner;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressDAO addressDAO;

	@Override
	@Transactional
	public List<Address> findAddressByName(String addressName)
			throws DataAccessException {
		return addressDAO.findAddressByName(addressName);
	}

}
