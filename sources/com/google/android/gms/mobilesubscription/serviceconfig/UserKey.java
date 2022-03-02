package com.google.android.gms.mobilesubscription.serviceconfig;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class UserKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new tbm();
    public Long a;
    public AuthType b;
    public String c;
    public Long d;

    private UserKey() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UserKey) {
            UserKey userKey = (UserKey) obj;
            return ius.a(this.a, userKey.a) && ius.a(this.b, userKey.b) && ius.a(this.c, userKey.c) && ius.a(this.d, userKey.d);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    public UserKey(Long l, AuthType authType, String str, Long l2) {
        this.a = l;
        this.b = authType;
        this.c = str;
        this.d = l2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d);
        ivx.b(parcel, a2);
    }
}
