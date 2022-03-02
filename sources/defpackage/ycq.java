package defpackage;

import com.google.android.gms.people.protomodel.Birthday;
import com.google.android.gms.people.protomodel.BirthdayEntity;
import com.google.android.gms.people.protomodel.Email;
import com.google.android.gms.people.protomodel.EmailEntity;
import com.google.android.gms.people.protomodel.Name;
import com.google.android.gms.people.protomodel.NameEntity;
import com.google.android.gms.people.protomodel.Person;
import com.google.android.gms.people.protomodel.PersonEntity;
import com.google.android.gms.people.protomodel.PersonFieldMetadata;
import com.google.android.gms.people.protomodel.PersonFieldMetadataEntity;
import com.google.android.gms.people.protomodel.Phone;
import com.google.android.gms.people.protomodel.PhoneEntity;
import com.google.android.gms.people.protomodel.Photo;
import com.google.android.gms.people.protomodel.PhotoEntity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ycq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ycq {
    public static Person a(amgi amgi) {
        PhoneEntity phoneEntity;
        char c;
        int i;
        EmailEntity emailEntity;
        char c2;
        int i2;
        PhotoEntity photoEntity;
        char c3;
        int i3;
        NameEntity nameEntity;
        char c4;
        int i4;
        BirthdayEntity birthdayEntity;
        char c5;
        int i5;
        amgi amgi2 = amgi;
        if (amgi2 == null) {
            return null;
        }
        xpa xpa = new xpa();
        aucx aucx = amgi2.k;
        int size = aucx.size();
        int i6 = 0;
        while (i6 < size) {
            amfa amfa = (amfa) aucx.get(i6);
            Birthday[] birthdayArr = new Birthday[1];
            if (amfa != null) {
                xor xor = new xor();
                xor.b = Long.valueOf(amfa.c);
                amgl amgl = amfa.b;
                if (amgl == null) {
                    amgl = amgl.h;
                }
                PersonFieldMetadata a = a(amgl);
                if (a == null) {
                    a = null;
                }
                xor.a = a;
                birthdayEntity = new BirthdayEntity(xor.a, xor.b, true);
            } else {
                birthdayEntity = null;
            }
            birthdayArr[0] = birthdayEntity;
            if (xpa.e == null) {
                xpa.e = new ArrayList();
                c5 = 0;
            } else {
                c5 = 0;
            }
            while (true) {
                i5 = i6 + 1;
                if (c5 > 0) {
                    break;
                }
                Birthday birthday = birthdayArr[0];
                if (birthday != null) {
                    List list = xpa.e;
                    birthday.r();
                    list.add(birthday);
                }
                c5 = 1;
            }
            i6 = i5;
        }
        aucx aucx2 = amgi2.d;
        int size2 = aucx2.size();
        int i7 = 0;
        while (i7 < size2) {
            amfz amfz = (amfz) aucx2.get(i7);
            Name[] nameArr = new Name[1];
            if (amfz != null) {
                xoy xoy = new xoy();
                xoy.b = amfz.c;
                xoy.d = amfz.f;
                xoy.c = amfz.e;
                xoy.e = amfz.g;
                xoy.f = amfz.n;
                amgl amgl2 = amfz.b;
                if (amgl2 == null) {
                    amgl2 = amgl.h;
                }
                PersonFieldMetadata a2 = a(amgl2);
                if (a2 == null) {
                    a2 = null;
                }
                xoy.a = a2;
                nameEntity = new NameEntity(xoy.a, xoy.b, (String) null, xoy.c, xoy.d, xoy.e, xoy.f, true);
            } else {
                nameEntity = null;
            }
            nameArr[0] = nameEntity;
            if (xpa.a == null) {
                xpa.a = new ArrayList();
                c4 = 0;
            } else {
                c4 = 0;
            }
            while (true) {
                i4 = i7 + 1;
                if (c4 > 0) {
                    break;
                }
                Name name = nameArr[0];
                if (name != null) {
                    List list2 = xpa.a;
                    name.r();
                    list2.add(name);
                }
                c4 = 1;
            }
            i7 = i4;
        }
        aucx aucx3 = amgi2.e;
        int size3 = aucx3.size();
        int i8 = 0;
        while (i8 < size3) {
            amgp amgp = (amgp) aucx3.get(i8);
            Photo[] photoArr = new Photo[1];
            if (amgp != null) {
                xpg xpg = new xpg();
                amgl amgl3 = amgp.b;
                if (amgl3 == null) {
                    amgl3 = amgl.h;
                }
                PersonFieldMetadata a3 = a(amgl3);
                if (a3 == null) {
                    a3 = null;
                }
                xpg.a = a3;
                xpg.b = amgp.c;
                photoEntity = new PhotoEntity(xpg.a, xpg.b, true);
            } else {
                photoEntity = null;
            }
            photoArr[0] = photoEntity;
            if (xpa.b == null) {
                xpa.b = new ArrayList();
                c3 = 0;
            } else {
                c3 = 0;
            }
            while (true) {
                i3 = i8 + 1;
                if (c3 > 0) {
                    break;
                }
                Photo photo = photoArr[0];
                if (photo != null) {
                    List list3 = xpa.b;
                    photo.r();
                    list3.add(photo);
                }
                c3 = 1;
            }
            i8 = i3;
        }
        aucx aucx4 = amgi2.g;
        int size4 = aucx4.size();
        int i9 = 0;
        while (i9 < size4) {
            amfm amfm = (amfm) aucx4.get(i9);
            Email[] emailArr = new Email[1];
            if (amfm != null) {
                xou xou = new xou();
                xou.b = amfm.c;
                amgl amgl4 = amfm.b;
                if (amgl4 == null) {
                    amgl4 = amgl.h;
                }
                PersonFieldMetadata a4 = a(amgl4);
                if (a4 == null) {
                    a4 = null;
                }
                xou.a = a4;
                emailEntity = new EmailEntity(xou.a, xou.b, true);
            } else {
                emailEntity = null;
            }
            emailArr[0] = emailEntity;
            if (xpa.c == null) {
                xpa.c = new ArrayList();
                c2 = 0;
            } else {
                c2 = 0;
            }
            while (true) {
                i2 = i9 + 1;
                if (c2 > 0) {
                    break;
                }
                Email email = emailArr[0];
                if (email != null) {
                    List list4 = xpa.c;
                    email.r();
                    list4.add(email);
                }
                c2 = 1;
            }
            i9 = i2;
        }
        aucx aucx5 = amgi2.h;
        int size5 = aucx5.size();
        int i10 = 0;
        while (i10 < size5) {
            amgo amgo = (amgo) aucx5.get(i10);
            Phone[] phoneArr = new Phone[1];
            if (amgo != null) {
                xpe xpe = new xpe();
                xpe.b = amgo.c;
                xpe.c = amgo.d;
                amgl amgl5 = amgo.b;
                if (amgl5 == null) {
                    amgl5 = amgl.h;
                }
                PersonFieldMetadata a5 = a(amgl5);
                if (a5 == null) {
                    a5 = null;
                }
                xpe.a = a5;
                phoneEntity = new PhoneEntity(xpe.a, xpe.b, xpe.c, true);
            } else {
                phoneEntity = null;
            }
            phoneArr[0] = phoneEntity;
            if (xpa.d == null) {
                xpa.d = new ArrayList();
                c = 0;
            } else {
                c = 0;
            }
            while (true) {
                i = i10 + 1;
                if (c > 0) {
                    break;
                }
                Phone phone = phoneArr[0];
                if (phone != null) {
                    List list5 = xpa.d;
                    phone.r();
                    list5.add(phone);
                }
                c = 1;
            }
            i10 = i;
        }
        return new PersonEntity((String) null, xpa.a, xpa.b, xpa.c, xpa.d, xpa.e, true);
    }

    private static PersonFieldMetadata a(amgl amgl) {
        if (amgl == null) {
            return null;
        }
        xpc xpc = new xpc();
        int a = amgk.a(amgl.b);
        if (a == 0) {
            a = 4;
        }
        Integer valueOf = Integer.valueOf(a - 1);
        boolean z = true;
        if (!(valueOf.intValue() == 3 || valueOf.intValue() == 0 || valueOf.intValue() == 1 || valueOf.intValue() == 2 || valueOf.intValue() == 4 || valueOf.intValue() == 5 || valueOf.intValue() == 6 || valueOf.intValue() == 7 || valueOf.intValue() == 8 || valueOf.intValue() == 9 || valueOf.intValue() == 10 || valueOf.intValue() == 11 || valueOf.intValue() == 13 || valueOf.intValue() == 14 || valueOf.intValue() == 15 || valueOf.intValue() == 16)) {
            z = false;
        }
        iva.b(z, "Invalid constant for Container. Use value in ModelConstants");
        xpc.a = valueOf;
        xpc.b = Boolean.valueOf(amgl.e);
        return new PersonFieldMetadataEntity(xpc.a, xpc.b);
    }
}
