package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PersonEntity extends AbstractSafeParcelable implements Person {
    public static final Parcelable.Creator CREATOR = new xpb();
    public final String a;
    private final List b;
    private final List c;
    private final List d;
    private final List e;
    private final List f;
    private List g;
    private List h;
    private List i;
    private List j;
    private List k;

    public PersonEntity(String str, List list, List list2, List list3, List list4, List list5) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
    }

    public final String a() {
        return this.a;
    }

    public final List b() {
        List list;
        if (this.g == null && (list = this.b) != null) {
            this.g = new ArrayList(list.size());
            List list2 = this.b;
            int size = list2.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.g.add((Name) list2.get(i2));
            }
        }
        return this.g;
    }

    public final List c() {
        List list;
        if (this.h == null && (list = this.c) != null) {
            this.h = new ArrayList(list.size());
            List list2 = this.c;
            int size = list2.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.h.add((Photo) list2.get(i2));
            }
        }
        return this.h;
    }

    public final List d() {
        List list;
        if (this.i == null && (list = this.d) != null) {
            this.i = new ArrayList(list.size());
            List list2 = this.d;
            int size = list2.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.i.add((Email) list2.get(i2));
            }
        }
        return this.i;
    }

    public final List e() {
        List list;
        if (this.j == null && (list = this.e) != null) {
            this.j = new ArrayList(list.size());
            List list2 = this.e;
            int size = list2.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.j.add((Phone) list2.get(i2));
            }
        }
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Person person = (Person) obj;
        return ius.a(a(), person.a()) && ius.a(b(), person.b()) && ius.a(c(), person.c()) && ius.a(d(), person.d()) && ius.a(e(), person.e()) && ius.a(f(), person.f());
    }

    public final List f() {
        List list;
        if (this.k == null && (list = this.f) != null) {
            this.k = new ArrayList(list.size());
            List list2 = this.f;
            int size = list2.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.k.add((Birthday) list2.get(i2));
            }
        }
        return this.k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b(), c(), d(), e(), f()});
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public PersonEntity(String str, List list, List list2, List list3, List list4, List list5, boolean z) {
        List list6 = list;
        List list7 = list2;
        List list8 = list3;
        List list9 = list4;
        List list10 = list5;
        this.a = str;
        if (z) {
            this.g = list6;
            if (list6 != null) {
                this.b = new ArrayList(list.size());
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    this.b.add((NameEntity) ((Name) it.next()));
                }
            } else {
                this.b = null;
            }
            this.h = list7;
            if (list7 != null) {
                this.c = new ArrayList(list2.size());
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    this.c.add((PhotoEntity) ((Photo) it2.next()));
                }
            } else {
                this.c = null;
            }
            this.i = list8;
            if (list8 != null) {
                this.d = new ArrayList(list3.size());
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    this.d.add((EmailEntity) ((Email) it3.next()));
                }
            } else {
                this.d = null;
            }
            this.j = list9;
            if (list9 != null) {
                this.e = new ArrayList(list4.size());
                Iterator it4 = list4.iterator();
                while (it4.hasNext()) {
                    this.e.add((PhoneEntity) ((Phone) it4.next()));
                }
            } else {
                this.e = null;
            }
            this.k = list10;
            if (list10 != null) {
                this.f = new ArrayList(list5.size());
                Iterator it5 = list5.iterator();
                while (it5.hasNext()) {
                    this.f.add((BirthdayEntity) ((Birthday) it5.next()));
                }
                return;
            }
            this.f = null;
            return;
        }
        this.g = list6;
        if (list6 != null) {
            this.b = new ArrayList(list.size());
            Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                Name name = (Name) it6.next();
                List list11 = this.b;
                NameEntity nameEntity = r9;
                NameEntity nameEntity2 = new NameEntity(name.a(), name.b(), name.c(), name.d(), name.e(), name.f(), name.g(), false);
                list11.add(nameEntity);
            }
        } else {
            this.b = null;
        }
        this.h = list7;
        if (list7 != null) {
            this.c = new ArrayList(list2.size());
            Iterator it7 = list2.iterator();
            while (it7.hasNext()) {
                Photo photo = (Photo) it7.next();
                this.c.add(new PhotoEntity(photo.a(), photo.b(), false));
            }
        } else {
            this.c = null;
        }
        this.i = list8;
        if (list8 != null) {
            this.d = new ArrayList(list3.size());
            Iterator it8 = list3.iterator();
            while (it8.hasNext()) {
                Email email = (Email) it8.next();
                this.d.add(new EmailEntity(email.a(), email.b(), false));
            }
        } else {
            this.d = null;
        }
        this.j = list9;
        if (list9 != null) {
            this.e = new ArrayList(list4.size());
            Iterator it9 = list4.iterator();
            while (it9.hasNext()) {
                Phone phone = (Phone) it9.next();
                this.e.add(new PhoneEntity(phone.a(), phone.b(), phone.c(), false));
            }
        } else {
            this.e = null;
        }
        this.k = list10;
        if (list10 != null) {
            this.f = new ArrayList(list5.size());
            Iterator it10 = list5.iterator();
            while (it10.hasNext()) {
                Birthday birthday = (Birthday) it10.next();
                this.f.add(new BirthdayEntity(birthday.a(), birthday.b(), false));
            }
            return;
        }
        this.f = null;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.c(parcel, 4, b(), false);
        ivx.c(parcel, 5, c(), false);
        ivx.c(parcel, 9, f(), false);
        ivx.c(parcel, 11, d(), false);
        ivx.c(parcel, 13, e(), false);
        ivx.b(parcel, a2);
    }
}
