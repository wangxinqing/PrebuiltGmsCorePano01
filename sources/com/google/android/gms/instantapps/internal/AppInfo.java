package com.google.android.gms.instantapps.internal;

import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AppInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qfr();
    public final String a;
    public final String b;
    public final List c;
    public final List d;
    public final int e;
    public final byte[] f;
    public final PackageInfo g;
    public final List h;
    public final byte[] i;

    public AppInfo(String str, String str2, List list, List list2, List list3, int i2, byte[] bArr, PackageInfo packageInfo, byte[] bArr2) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = list2;
        this.e = i2;
        this.f = bArr;
        this.g = packageInfo;
        this.h = list3;
        this.i = bArr2;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.c(parcel, 5, this.c, false);
        ivx.c(parcel, 6, this.d, false);
        ivx.b(parcel, 7, this.e);
        ivx.a(parcel, 8, this.f, false);
        ivx.a(parcel, 9, this.g, i2, false);
        ivx.c(parcel, 11, this.h, false);
        ivx.a(parcel, 12, this.i, false);
        ivx.b(parcel, a2);
    }
}
