package com.google.android.gms.instantapps;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class InstantAppIntentData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new qdw();
    public static final InstantAppIntentData a = new InstantAppIntentData((Intent) null, 1, (String) null);
    public final Intent b;
    public final int c;
    public final String d;

    public InstantAppIntentData(Intent intent, int i, String str) {
        this.b = intent;
        this.c = i;
        this.d = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.b, i, false);
        ivx.b(parcel, 2, this.c);
        ivx.a(parcel, 3, this.d, false);
        ivx.b(parcel, a2);
    }
}
