package com.google.android.gms.mdd;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FileGroupWithDownloadStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rwv();
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public FileGroupWithDownloadStatus(String str, String str2, int i, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.d);
        ivx.b(parcel, 4, this.c);
        ivx.b(parcel, a2);
    }
}
