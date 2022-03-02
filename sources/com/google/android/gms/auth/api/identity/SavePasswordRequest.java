package com.google.android.gms.auth.api.identity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SavePasswordRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new fsq();
    public final SignInPassword a;
    public final String b;

    public SavePasswordRequest(SignInPassword signInPassword, String str) {
        iva.a((Object) signInPassword);
        this.a = signInPassword;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SavePasswordRequest) {
            SavePasswordRequest savePasswordRequest = (SavePasswordRequest) obj;
            if (!ius.a(this.a, savePasswordRequest.a) || !ius.a(this.b, savePasswordRequest.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, i, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.b(parcel, a2);
    }
}
