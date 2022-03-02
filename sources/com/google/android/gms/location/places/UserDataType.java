package com.google.android.gms.location.places;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class UserDataType extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new riu();
    public static final UserDataType a = a("test_type", 1);
    public static final UserDataType b = a("labeled_place", 6);
    public static final UserDataType c;
    final String d;
    final int e;

    static {
        UserDataType a2 = a("here_content", 7);
        c = a2;
        jir.a((Object) a, (Object) b, (Object) a2);
    }

    public UserDataType(String str, int i) {
        iva.c(str);
        this.d = str;
        this.e = i;
    }

    private static UserDataType a(String str, int i) {
        return new UserDataType(str, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserDataType) {
            UserDataType userDataType = (UserDataType) obj;
            return this.d.equals(userDataType.d) && this.e == userDataType.e;
        }
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return this.d;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.d, false);
        ivx.b(parcel, 2, this.e);
        ivx.b(parcel, a2);
    }
}
