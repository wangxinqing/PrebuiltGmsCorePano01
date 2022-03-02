package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new ize();
    final int a;
    public final String b;
    public final int c;

    public FavaDiagnosticsEntity(int i, String str, int i2) {
        this.a = i;
        this.b = str;
        this.c = i2;
    }

    public FavaDiagnosticsEntity(String str, int i) {
        this.a = 1;
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
