package com.google.android.gms.instantapps;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LaunchData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qea();
    public final Intent a;
    public final String b;
    public final String c;
    final BitmapTeleporter d;

    public LaunchData(Intent intent, String str, String str2, BitmapTeleporter bitmapTeleporter) {
        this.a = intent;
        this.b = str;
        this.c = str2;
        this.d = bitmapTeleporter;
        if (bitmapTeleporter != null) {
            bitmapTeleporter.a();
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c, false);
        ivx.a(parcel, 5, this.d, i, false);
        ivx.b(parcel, a2);
    }
}
