package com.google.android.gms.romanesco.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RawContactEntity extends AbstractSafeParcelable implements RawContact {
    public static final Parcelable.Creator CREATOR = new zwc();
    public final String a;
    private final List b;
    private final List c;
    private List d;
    private List e;

    public RawContactEntity(String str, List list, List list2) {
        this.a = str;
        this.b = list;
        this.c = list2;
    }

    public final String a() {
        return this.a;
    }

    public final List b() {
        List list;
        if (this.d == null && (list = this.b) != null) {
            this.d = new ArrayList(list.size());
            List list2 = this.b;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                this.d.add((EmailAddress) list2.get(i));
            }
        }
        return this.d;
    }

    public final List c() {
        List list;
        if (this.e == null && (list = this.c) != null) {
            this.e = new ArrayList(list.size());
            List list2 = this.c;
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                this.e.add((PhoneNumber) list2.get(i));
            }
        }
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof RawContact)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        RawContact rawContact = (RawContact) obj;
        return ius.a(a(), rawContact.a()) && ius.a(b(), rawContact.b()) && ius.a(c(), rawContact.c());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), b(), c()});
    }

    public final /* bridge */ /* synthetic */ Object r() {
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.c(parcel, 4, b(), false);
        ivx.c(parcel, 5, c(), false);
        ivx.b(parcel, a2);
    }
}
