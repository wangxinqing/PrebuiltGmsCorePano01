package com.google.android.gms.pseudonymous;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PseudonymousIdToken extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new zny();
    public final String a;

    public PseudonymousIdToken(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof PseudonymousIdToken) {
            return ius.a(this.a, ((PseudonymousIdToken) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
        sb.append("PseudonymousIdToken[");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.b(parcel, a2);
    }
}
