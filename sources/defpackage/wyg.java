package defpackage;

import com.google.android.gms.people.identity.internal.models.ImageReferenceImpl;
import com.google.android.gms.people.identity.internal.models.PersonImpl;
import com.google.android.gms.plus.service.v2whitelisted.models.Mergedpeoplemetadata;
import com.google.android.gms.plus.service.v2whitelisted.models.Person;
import java.util.Collection;
import java.util.List;

/* renamed from: wyg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wyg {
    private static PersonImpl.AboutsImpl a(Person.Abouts abouts) {
        PersonImpl.AboutsImpl aboutsImpl = new PersonImpl.AboutsImpl();
        if (abouts.a.contains(2)) {
            aboutsImpl.b = a(abouts.b);
        }
        if (abouts.a.contains(3)) {
            aboutsImpl.c = abouts.c;
        }
        if (abouts.a.contains(4)) {
            aboutsImpl.d = abouts.d;
        }
        return aboutsImpl;
    }

    private static PersonImpl.AddressesImpl a(Person.Addresses addresses) {
        PersonImpl.AddressesImpl addressesImpl = new PersonImpl.AddressesImpl();
        if (addresses.a.contains(7)) {
            addressesImpl.b = a(addresses.e);
        }
        if (addresses.a.contains(2)) {
            addressesImpl.c = addresses.b;
        }
        if (addresses.a.contains(3)) {
            addressesImpl.d = addresses.c;
        }
        if (addresses.a.contains(8)) {
            addressesImpl.g = addresses.f;
        }
        if (addresses.a.contains(9)) {
            addressesImpl.h = addresses.g;
        }
        if (addresses.a.contains(10)) {
            addressesImpl.i = addresses.h;
        }
        if (addresses.a.contains(11)) {
            addressesImpl.j = addresses.i;
        }
        if (addresses.a.contains(12)) {
            addressesImpl.k = addresses.j;
        }
        if (addresses.a.contains(13)) {
            addressesImpl.l = addresses.k;
        }
        return addressesImpl;
    }

    private static PersonImpl.MetadataImpl a(Mergedpeoplemetadata mergedpeoplemetadata) {
        PersonImpl.MetadataImpl metadataImpl = new PersonImpl.MetadataImpl();
        metadataImpl.b = mergedpeoplemetadata.c;
        metadataImpl.c = mergedpeoplemetadata.d;
        metadataImpl.d = mergedpeoplemetadata.e;
        metadataImpl.a(mergedpeoplemetadata.j);
        return metadataImpl;
    }

    public static void a(Person person, PersonImpl personImpl) {
        Person person2 = person;
        PersonImpl personImpl2 = personImpl;
        if (person2.a.contains(2)) {
            List list = person2.b;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                personImpl2.a(a((Person.Abouts) list.get(i)));
            }
        }
        if (person2.a.contains(3)) {
            List list2 = person2.c;
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                personImpl2.a(a((Person.Addresses) list2.get(i2)));
            }
        }
        if (person2.a.contains(5)) {
            List list3 = person2.d;
            int size3 = list3.size();
            for (int i3 = 0; i3 < size3; i3++) {
                Person.Birthdays birthdays = (Person.Birthdays) list3.get(i3);
                PersonImpl.BirthdaysImpl birthdaysImpl = new PersonImpl.BirthdaysImpl();
                if (birthdays.a.contains(3)) {
                    birthdaysImpl.b = a(birthdays.c);
                }
                if (birthdays.a.contains(2)) {
                    birthdaysImpl.c = birthdays.b;
                }
                personImpl2.a(birthdaysImpl);
            }
        }
        if (person2.a.contains(6)) {
            List list4 = person2.e;
            int size4 = list4.size();
            for (int i4 = 0; i4 < size4; i4++) {
                Person.BraggingRights braggingRights = (Person.BraggingRights) list4.get(i4);
                PersonImpl.BraggingRightsImpl braggingRightsImpl = new PersonImpl.BraggingRightsImpl();
                if (braggingRights.a.contains(2)) {
                    braggingRightsImpl.b = a(braggingRights.b);
                }
                if (braggingRights.a.contains(3)) {
                    braggingRightsImpl.c = braggingRights.c;
                }
                personImpl2.a(braggingRightsImpl);
            }
        }
        if (person2.a.contains(9)) {
            List list5 = person2.h;
            int size5 = list5.size();
            for (int i5 = 0; i5 < size5; i5++) {
                Person.CoverPhotos coverPhotos = (Person.CoverPhotos) list5.get(i5);
                PersonImpl.CoverPhotosImpl coverPhotosImpl = new PersonImpl.CoverPhotosImpl();
                if (coverPhotos.a.contains(2)) {
                    coverPhotosImpl.a(coverPhotos.b);
                }
                if (coverPhotos.a.contains(3)) {
                    coverPhotosImpl.c = coverPhotos.c;
                }
                if (coverPhotos.a.contains(7)) {
                    ImageReferenceImpl imageReferenceImpl = new ImageReferenceImpl();
                    imageReferenceImpl.c = coverPhotos.f;
                    imageReferenceImpl.a(1);
                    coverPhotosImpl.d = imageReferenceImpl;
                }
                if (coverPhotos.a.contains(8)) {
                    coverPhotosImpl.b(coverPhotos.g);
                }
                if (coverPhotos.a.contains(5)) {
                    coverPhotosImpl.a(coverPhotos.d);
                }
                personImpl2.a(coverPhotosImpl);
            }
        }
        if (person2.a.contains(10)) {
            List list6 = person2.i;
            int size6 = list6.size();
            for (int i6 = 0; i6 < size6; i6++) {
                Person.CustomFields customFields = (Person.CustomFields) list6.get(i6);
                PersonImpl.CustomFieldsImpl customFieldsImpl = new PersonImpl.CustomFieldsImpl();
                if (customFields.a.contains(2)) {
                    customFieldsImpl.b = customFields.b;
                }
                if (customFields.a.contains(4)) {
                    customFieldsImpl.c = customFields.d;
                }
                personImpl2.a(customFieldsImpl);
            }
        }
        if (person2.a.contains(11)) {
            List list7 = person2.j;
            int size7 = list7.size();
            for (int i7 = 0; i7 < size7; i7++) {
                Person.Emails emails = (Person.Emails) list7.get(i7);
                PersonImpl.EmailsImpl emailsImpl = new PersonImpl.EmailsImpl();
                if (emails.a.contains(5)) {
                    emailsImpl.b = a(emails.d);
                }
                if (emails.a.contains(4)) {
                    emailsImpl.c = emails.c;
                }
                if (emails.a.contains(6)) {
                    emailsImpl.d = emails.e;
                }
                if (emails.a.contains(7)) {
                    emailsImpl.e = emails.f;
                }
                personImpl2.a(emailsImpl);
            }
        }
        if (person2.a.contains(12)) {
            personImpl2.j = person2.k;
        }
        if (person2.a.contains(13)) {
            List list8 = person2.l;
            int size8 = list8.size();
            for (int i8 = 0; i8 < size8; i8++) {
                Person.Events events = (Person.Events) list8.get(i8);
                PersonImpl.EventsImpl eventsImpl = new PersonImpl.EventsImpl();
                if (events.a.contains(4)) {
                    eventsImpl.b = a(events.d);
                }
                if (events.a.contains(3)) {
                    eventsImpl.c = events.c;
                }
                if (events.a.contains(5)) {
                    eventsImpl.d = events.e;
                }
                if (events.a.contains(2)) {
                    eventsImpl.e = events.b;
                }
                personImpl2.a(eventsImpl);
            }
        }
        if (person2.a.contains(17)) {
            List list9 = person2.o;
            int size9 = list9.size();
            for (int i9 = 0; i9 < size9; i9++) {
                Person.Genders genders = (Person.Genders) list9.get(i9);
                PersonImpl.GendersImpl gendersImpl = new PersonImpl.GendersImpl();
                if (genders.a.contains(4)) {
                    gendersImpl.b = a(genders.c);
                }
                if (genders.a.contains(3)) {
                    gendersImpl.c = genders.b;
                }
                if (genders.a.contains(5)) {
                    gendersImpl.d = genders.d;
                }
                personImpl2.a(gendersImpl);
            }
        }
        if (person2.a.contains(18)) {
            personImpl2.m = person2.p;
        }
        if (person2.a.contains(19)) {
            List list10 = person2.q;
            int size10 = list10.size();
            for (int i10 = 0; i10 < size10; i10++) {
                Person.Images images = (Person.Images) list10.get(i10);
                PersonImpl.ImagesImpl imagesImpl = new PersonImpl.ImagesImpl();
                if (images.a.contains(3)) {
                    imagesImpl.b = a(images.c);
                }
                if (images.b()) {
                    ImageReferenceImpl imageReferenceImpl2 = new ImageReferenceImpl();
                    imageReferenceImpl2.c = images.e;
                    imageReferenceImpl2.a(1);
                    imagesImpl.c = imageReferenceImpl2;
                }
                if (images.a.contains(2)) {
                    imagesImpl.a(images.b);
                }
                personImpl2.a(imagesImpl);
            }
        }
        if (person2.a.contains(21)) {
            List list11 = person2.r;
            int size11 = list11.size();
            for (int i11 = 0; i11 < size11; i11++) {
                Person.InstantMessaging instantMessaging = (Person.InstantMessaging) list11.get(i11);
                PersonImpl.InstantMessagingImpl instantMessagingImpl = new PersonImpl.InstantMessagingImpl();
                if (instantMessaging.a.contains(4)) {
                    instantMessagingImpl.b = a(instantMessaging.d);
                }
                if (instantMessaging.a.contains(2)) {
                    instantMessagingImpl.c = instantMessaging.b;
                }
                if (instantMessaging.a.contains(3)) {
                    instantMessagingImpl.d = instantMessaging.c;
                }
                if (instantMessaging.a.contains(5)) {
                    instantMessagingImpl.e = instantMessaging.e;
                }
                if (instantMessaging.a.contains(6)) {
                    instantMessagingImpl.f = instantMessaging.f;
                }
                if (instantMessaging.a.contains(7)) {
                    instantMessagingImpl.g = instantMessaging.g;
                }
                personImpl2.a(instantMessagingImpl);
            }
        }
        if (person2.a.contains(24)) {
            personImpl2.p = person2.t;
        }
        if (person2.a.contains(26)) {
            Person.LegacyFields legacyFields = person2.v;
            PersonImpl.LegacyFieldsImpl legacyFieldsImpl = new PersonImpl.LegacyFieldsImpl();
            if (legacyFields.a.contains(2)) {
                legacyFieldsImpl.b = legacyFields.b;
            }
            personImpl2.q = legacyFieldsImpl;
        }
        if (person2.a.contains(28)) {
            List list12 = person2.w;
            int size12 = list12.size();
            for (int i12 = 0; i12 < size12; i12++) {
                Person.Memberships memberships = (Person.Memberships) list12.get(i12);
                PersonImpl.MembershipsImpl membershipsImpl = new PersonImpl.MembershipsImpl();
                if (memberships.a.contains(4)) {
                    membershipsImpl.b = a(memberships.d);
                }
                if (memberships.a.contains(2)) {
                    membershipsImpl.c = memberships.b;
                }
                if (memberships.a.contains(3)) {
                    membershipsImpl.d = memberships.c;
                }
                if (memberships.a.contains(5)) {
                    membershipsImpl.e = memberships.e;
                }
                personImpl2.a(membershipsImpl);
            }
        }
        if (person2.a.contains(29)) {
            Person.Metadata metadata = person2.x;
            PersonImpl.PersonMetadataImpl personMetadataImpl = new PersonImpl.PersonMetadataImpl();
            if (metadata.a.contains(3)) {
                personMetadataImpl.a((Collection) metadata.c);
            }
            if (metadata.a.contains(4)) {
                personMetadataImpl.b((Collection) metadata.d);
            }
            if (metadata.a.contains(6)) {
                personMetadataImpl.c((Collection) metadata.f);
            }
            if (metadata.a.contains(7)) {
                personMetadataImpl.d(metadata.g);
            }
            if (metadata.a.contains(10)) {
                personMetadataImpl.e(metadata.j);
            }
            if (metadata.a.contains(13)) {
                personMetadataImpl.f(metadata.m);
            }
            if (metadata.a.contains(15)) {
                personMetadataImpl.h = metadata.o;
            }
            if (metadata.a.contains(16)) {
                personMetadataImpl.i = metadata.p;
            }
            if (metadata.b()) {
                personMetadataImpl.g(metadata.q);
            }
            if (metadata.a.contains(18)) {
                personMetadataImpl.k = metadata.r;
            }
            if (metadata.a.contains(19)) {
                Person.Metadata.ProfileOwnerStats profileOwnerStats = metadata.s;
                PersonImpl.ProfileOwnerStatsImpl profileOwnerStatsImpl = new PersonImpl.ProfileOwnerStatsImpl();
                if (profileOwnerStats.a.contains(2)) {
                    profileOwnerStatsImpl.a(profileOwnerStats.b);
                }
                if (profileOwnerStats.a.contains(3)) {
                    profileOwnerStatsImpl.b(profileOwnerStats.c);
                }
                personMetadataImpl.l = profileOwnerStatsImpl;
            }
            if (metadata.a.contains(5)) {
                personMetadataImpl.a(metadata.e);
            }
            if (metadata.a.contains(9)) {
                personMetadataImpl.b(metadata.i);
            }
            if (metadata.a.contains(12)) {
                personMetadataImpl.c(metadata.l);
            }
            personImpl2.t = personMetadataImpl;
        }
        if (person2.a.contains(30)) {
            List list13 = person2.y;
            int size13 = list13.size();
            for (int i13 = 0; i13 < size13; i13++) {
                Person.Names names = (Person.Names) list13.get(i13);
                PersonImpl.NamesImpl namesImpl = new PersonImpl.NamesImpl();
                if (names.a.contains(8)) {
                    namesImpl.b = a(names.h);
                }
                if (names.a.contains(2)) {
                    namesImpl.c = names.b;
                }
                if (names.a.contains(3)) {
                    namesImpl.d = names.c;
                }
                if (names.a.contains(4)) {
                    namesImpl.e = names.d;
                }
                if (names.a.contains(5)) {
                    namesImpl.f = names.e;
                }
                if (names.a.contains(6)) {
                    namesImpl.g = names.f;
                }
                if (names.a.contains(7)) {
                    namesImpl.h = names.g;
                }
                if (names.a.contains(9)) {
                    namesImpl.i = names.i;
                }
                if (names.a.contains(10)) {
                    namesImpl.j = names.j;
                }
                if (names.a.contains(11)) {
                    namesImpl.k = names.k;
                }
                if (names.a.contains(12)) {
                    namesImpl.l = names.l;
                }
                if (names.a.contains(13)) {
                    namesImpl.m = names.m;
                }
                personImpl2.a(namesImpl);
            }
        }
        if (person2.a.contains(31)) {
            List list14 = person2.z;
            int size14 = list14.size();
            for (int i14 = 0; i14 < size14; i14++) {
                Person.Nicknames nicknames = (Person.Nicknames) list14.get(i14);
                PersonImpl.NicknamesImpl nicknamesImpl = new PersonImpl.NicknamesImpl();
                if (nicknames.a.contains(2)) {
                    nicknamesImpl.b = a(nicknames.b);
                }
                if (nicknames.a.contains(3)) {
                    nicknamesImpl.c = nicknames.c;
                }
                if (nicknames.a.contains(4)) {
                    nicknamesImpl.d = nicknames.d;
                }
                personImpl2.a(nicknamesImpl);
            }
        }
        if (person2.a.contains(32)) {
            List list15 = person2.A;
            int size15 = list15.size();
            for (int i15 = 0; i15 < size15; i15++) {
                Person.Occupations occupations = (Person.Occupations) list15.get(i15);
                PersonImpl.OccupationsImpl occupationsImpl = new PersonImpl.OccupationsImpl();
                if (occupations.a.contains(2)) {
                    occupationsImpl.b = a(occupations.b);
                }
                if (occupations.a.contains(3)) {
                    occupationsImpl.c = occupations.c;
                }
                personImpl2.a(occupationsImpl);
            }
        }
        if (person2.a.contains(33)) {
            List list16 = person2.B;
            int size16 = list16.size();
            for (int i16 = 0; i16 < size16; i16++) {
                Person.Organizations organizations = (Person.Organizations) list16.get(i16);
                PersonImpl.OrganizationsImpl organizationsImpl = new PersonImpl.OrganizationsImpl();
                if (organizations.a.contains(9)) {
                    organizationsImpl.b = a(organizations.h);
                }
                if (organizations.a.contains(2)) {
                    organizationsImpl.a(organizations.b);
                }
                if (organizations.a.contains(3)) {
                    organizationsImpl.d = organizations.c;
                }
                if (organizations.a.contains(4)) {
                    organizationsImpl.e = organizations.d;
                }
                if (organizations.a.contains(5)) {
                    organizationsImpl.f = organizations.e;
                }
                if (organizations.a.contains(6)) {
                    organizationsImpl.g = organizations.f;
                }
                if (organizations.a.contains(8)) {
                    organizationsImpl.h = organizations.g;
                }
                if (organizations.a.contains(10)) {
                    organizationsImpl.i = organizations.i;
                }
                if (organizations.a.contains(11)) {
                    organizationsImpl.j = organizations.j;
                }
                if (organizations.a.contains(12)) {
                    organizationsImpl.k = organizations.k;
                }
                if (organizations.a.contains(14)) {
                    organizationsImpl.l = organizations.l;
                }
                if (organizations.a.contains(15)) {
                    organizationsImpl.m = organizations.m;
                }
                if (organizations.a.contains(16)) {
                    organizationsImpl.n = organizations.n;
                }
                personImpl2.a(organizationsImpl);
            }
        }
        if (person2.a.contains(36)) {
            List list17 = person2.D;
            int size17 = list17.size();
            for (int i17 = 0; i17 < size17; i17++) {
                Person.PhoneNumbers phoneNumbers = (Person.PhoneNumbers) list17.get(i17);
                PersonImpl.PhoneNumbersImpl phoneNumbersImpl = new PersonImpl.PhoneNumbersImpl();
                if (phoneNumbers.a.contains(5)) {
                    phoneNumbersImpl.b = a(phoneNumbers.d);
                }
                if (phoneNumbers.a.contains(2)) {
                    phoneNumbersImpl.c = phoneNumbers.b;
                }
                if (phoneNumbers.a.contains(4)) {
                    phoneNumbersImpl.d = phoneNumbers.c;
                }
                if (phoneNumbers.a.contains(6)) {
                    phoneNumbersImpl.e = phoneNumbers.e;
                }
                if (phoneNumbers.a.contains(8)) {
                    phoneNumbersImpl.f = phoneNumbers.f;
                }
                personImpl2.a(phoneNumbersImpl);
            }
        }
        if (person2.a.contains(38)) {
            List list18 = person2.E;
            int size18 = list18.size();
            for (int i18 = 0; i18 < size18; i18++) {
                Person.PlacesLived placesLived = (Person.PlacesLived) list18.get(i18);
                PersonImpl.PlacesLivedImpl placesLivedImpl = new PersonImpl.PlacesLivedImpl();
                if (placesLived.a.contains(3)) {
                    placesLivedImpl.b = a(placesLived.c);
                }
                if (placesLived.a.contains(2)) {
                    placesLivedImpl.a(placesLived.b);
                }
                if (placesLived.a.contains(4)) {
                    placesLivedImpl.d = placesLived.d;
                }
                personImpl2.a(placesLivedImpl);
            }
        }
        if (person2.a.contains(39)) {
            personImpl2.A = person2.F;
        }
        if (person2.a.contains(40)) {
            List list19 = person2.G;
            int size19 = list19.size();
            for (int i19 = 0; i19 < size19; i19++) {
                Person.Relations relations = (Person.Relations) list19.get(i19);
                PersonImpl.RelationsImpl relationsImpl = new PersonImpl.RelationsImpl();
                if (relations.a.contains(3)) {
                    relationsImpl.b = a(relations.c);
                }
                if (relations.a.contains(2)) {
                    relationsImpl.c = relations.b;
                }
                if (relations.a.contains(4)) {
                    relationsImpl.d = relations.d;
                }
                if (relations.a.contains(5)) {
                    relationsImpl.e = relations.e;
                }
                personImpl2.a(relationsImpl);
            }
        }
        if (person2.a.contains(44)) {
            List list20 = person2.I;
            int size20 = list20.size();
            for (int i20 = 0; i20 < size20; i20++) {
                Person.Skills skills = (Person.Skills) list20.get(i20);
                PersonImpl.SkillsImpl skillsImpl = new PersonImpl.SkillsImpl();
                if (skills.a.contains(2)) {
                    skillsImpl.b = a(skills.b);
                }
                if (skills.a.contains(3)) {
                    skillsImpl.c = skills.c;
                }
                personImpl2.a(skillsImpl);
            }
        }
        if (person2.a.contains(45)) {
            Person.SortKeys sortKeys = person2.J;
            PersonImpl.SortKeysImpl sortKeysImpl = new PersonImpl.SortKeysImpl();
            if (sortKeys.a.contains(4)) {
                sortKeysImpl.b = sortKeys.d;
            }
            if (sortKeys.a.contains(6)) {
                sortKeysImpl.c = sortKeys.f;
            }
            personImpl2.F = sortKeysImpl;
        }
        if (person2.a.contains(46)) {
            List list21 = person2.K;
            int size21 = list21.size();
            for (int i21 = 0; i21 < size21; i21++) {
                Person.Taglines taglines = (Person.Taglines) list21.get(i21);
                PersonImpl.TaglinesImpl taglinesImpl = new PersonImpl.TaglinesImpl();
                if (taglines.a.contains(2)) {
                    taglinesImpl.b = a(taglines.b);
                }
                if (taglines.a.contains(3)) {
                    taglinesImpl.c = taglines.c;
                }
                personImpl2.a(taglinesImpl);
            }
        }
        if (person2.a.contains(47)) {
            List list22 = person2.L;
            int size22 = list22.size();
            for (int i22 = 0; i22 < size22; i22++) {
                Person.Urls urls = (Person.Urls) list22.get(i22);
                PersonImpl.UrlsImpl urlsImpl = new PersonImpl.UrlsImpl();
                if (urls.a.contains(3)) {
                    urlsImpl.b = a(urls.c);
                }
                if (urls.a.contains(2)) {
                    urlsImpl.c = urls.b;
                }
                if (urls.a.contains(5)) {
                    urlsImpl.d = urls.d;
                }
                if (urls.a.contains(6)) {
                    urlsImpl.e = urls.e;
                }
                personImpl2.a(urlsImpl);
            }
        }
    }
}
