package com.google.android.gms.auth.firstparty.dataservice;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PostSignInData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new gcx();
    final int a;
    public final Intent b;
    public final PendingIntent c;

    public PostSignInData(int i, Intent intent, PendingIntent pendingIntent) {
        this.a = i;
        this.b = intent;
        this.c = pendingIntent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.a(parcel, 3, this.c, i, false);
        ivx.b(parcel, a2);
    }
}
