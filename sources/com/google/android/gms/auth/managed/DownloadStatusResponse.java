package com.google.android.gms.auth.managed;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DownloadStatusResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ghf();
    final int a;
    public int b;
    public int c;

    public DownloadStatusResponse() {
        this(1, 0, 0);
    }

    public DownloadStatusResponse(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.b(parcel, 2, this.b);
        ivx.b(parcel, 3, this.c);
        ivx.b(parcel, a2);
    }
}
