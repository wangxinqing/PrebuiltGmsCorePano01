package com.google.android.gms.smart_profile;

import com.google.android.gms.people.identity.internal.models.PersonImpl;
import com.google.android.gms.people.identity.models.Person;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SmartProfilePerson extends PersonImpl {
    public List J;

    public SmartProfilePerson() {
    }

    public SmartProfilePerson(SmartProfilePerson smartProfilePerson, String str, String str2, String str3) {
        super(smartProfilePerson);
        List list = smartProfilePerson.J;
        if (list != null && !list.isEmpty()) {
            this.J = smartProfilePerson.J;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        if (S()) {
            List list2 = this.y;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                Person.PhoneNumbers phoneNumbers = (Person.PhoneNumbers) list2.get(i);
                arrayList.add(new PersonImpl.PhoneNumbersImpl(phoneNumbers));
                hashSet.add(phoneNumbers.k());
            }
        }
        if (str != null && !hashSet.contains(str)) {
            PersonImpl.PhoneNumbersImpl phoneNumbersImpl = new PersonImpl.PhoneNumbersImpl();
            phoneNumbersImpl.f = str;
            arrayList.add(phoneNumbersImpl);
        }
        this.y = arrayList;
        ArrayList arrayList2 = new ArrayList();
        HashSet hashSet2 = new HashSet();
        if (o()) {
            List list3 = this.i;
            int size2 = list3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Person.Emails emails = (Person.Emails) list3.get(i2);
                arrayList2.add(new PersonImpl.EmailsImpl(emails));
                hashSet2.add(emails.i());
            }
        }
        if (str2 != null && !hashSet2.contains(str2)) {
            PersonImpl.EmailsImpl emailsImpl = new PersonImpl.EmailsImpl();
            emailsImpl.e = str2;
            emailsImpl.d = str3;
            arrayList2.add(emailsImpl);
        }
        this.i = arrayList2;
    }
}
