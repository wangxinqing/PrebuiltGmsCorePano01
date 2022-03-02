package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CableAuthenticationExtension extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new mzp();
    public final List a;

    public CableAuthenticationExtension(List list) {
        iva.a((Object) list);
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CableAuthenticationExtension) {
            CableAuthenticationExtension cableAuthenticationExtension = (CableAuthenticationExtension) obj;
            if (!this.a.containsAll(cableAuthenticationExtension.a) || !cableAuthenticationExtension.a.containsAll(this.a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{new HashSet(this.a)});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 1, this.a, false);
        ivx.b(parcel, a2);
    }
}
