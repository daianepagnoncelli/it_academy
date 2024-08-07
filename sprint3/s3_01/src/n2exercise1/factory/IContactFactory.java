package n2exercise1.factory;

import n2exercise1.address.IAddress;
import n2exercise1.phonenumber.IPhoneNumber;

public interface IContactFactory {
    IAddress createAddress(String[] addressData);
    IPhoneNumber createPhoneNumber(String phoneNumber);
}

