package com.google.android.gms.auth.api.accounttransfer.internal;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class UserChallengeRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new eue();
    final int a = 1;
    public final String b;
    public final PendingIntent c;

    public UserChallengeRequest(String str, PendingIntent pendingIntent) {
        iva.a((Object) str);
        this.b = str;
        iva.a((Object) pendingIntent);
        this.c = pendingIntent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.b(parcel, a2);
    }
}
