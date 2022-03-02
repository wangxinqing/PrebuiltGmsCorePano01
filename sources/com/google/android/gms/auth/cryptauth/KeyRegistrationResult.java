package com.google.android.gms.auth.cryptauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class KeyRegistrationResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gan();
    final int a;
    public final Status b;
    public final byte[] c;
    public final List d;

    public KeyRegistrationResult(int i, Status status, byte[] bArr, List list) {
        this.a = i;
        this.b = status;
        this.c = bArr;
        this.d = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.c(parcel, 4, this.d, false);
        ivx.b(parcel, a2);
    }
}
