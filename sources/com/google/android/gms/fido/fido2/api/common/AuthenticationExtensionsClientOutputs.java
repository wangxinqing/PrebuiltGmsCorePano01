package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new mzi();
    public UvmEntries a;

    public AuthenticationExtensionsClientOutputs(UvmEntries uvmEntries) {
        this.a = uvmEntries;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AuthenticationExtensionsClientOutputs) {
            return ius.a(this.a, ((AuthenticationExtensionsClientOutputs) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.b(parcel, a2);
    }
}
