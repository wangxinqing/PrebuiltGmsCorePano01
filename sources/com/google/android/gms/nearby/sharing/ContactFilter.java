package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ContactFilter extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new vil();
    public Boolean a;
    public Boolean b;
    public Boolean c;
    public String d;

    public ContactFilter() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ContactFilter) {
            ContactFilter contactFilter = (ContactFilter) obj;
            return ius.a(this.a, contactFilter.a) && ius.a(this.b, contactFilter.b) && ius.a(this.c, contactFilter.c) && ius.a(this.d, contactFilter.d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public ContactFilter(Boolean bool, Boolean bool2, Boolean bool3, String str) {
        this.a = bool;
        this.b = bool2;
        this.c = bool3;
        this.d = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.a(parcel, 3, this.c);
        ivx.a(parcel, 4, this.d, false);
        ivx.b(parcel, a2);
    }
}
