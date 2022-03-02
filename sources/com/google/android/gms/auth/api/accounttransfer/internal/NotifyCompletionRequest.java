package com.google.android.gms.auth.api.accounttransfer.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NotifyCompletionRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new eub();
    final int a = 1;
    public final String b;
    public final int c;

    public NotifyCompletionRequest(String str, int i) {
        iva.a((Object) str);
        this.b = str;
        this.c = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.b(parcel, 3, this.c);
        ivx.b(parcel, a2);
    }
}
