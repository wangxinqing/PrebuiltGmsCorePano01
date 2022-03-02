package com.google.android.gms.config.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class FetchConfigIpcRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new jol();
    public final String a;
    public final long b;
    public final DataHolder c;
    public final String d;
    public final String e;
    public final String f;
    public final List g;
    public final int h;
    public final List i;
    public final int j;
    public final int k;

    public FetchConfigIpcRequest(String str) {
        this(str, 43200, (DataHolder) null, (String) null, (String) null, (String) null, (List) null, 0, (List) null, -1, -1);
    }

    public FetchConfigIpcRequest(String str, long j2, DataHolder dataHolder, String str2, String str3, String str4, List list, int i2, List list2, int i3, int i4) {
        this.a = str;
        this.b = j2;
        this.c = dataHolder;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = list;
        this.h = i2;
        this.i = list2;
        this.j = i3;
        this.k = i4;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b);
        ivx.a(parcel, 4, this.c, i2, false);
        ivx.a(parcel, 5, this.d, false);
        ivx.a(parcel, 6, this.e, false);
        ivx.a(parcel, 7, this.f, false);
        ivx.b(parcel, 8, this.g, false);
        ivx.b(parcel, 9, this.h);
        ivx.c(parcel, 10, this.i, false);
        ivx.b(parcel, 11, this.j);
        ivx.b(parcel, 12, this.k);
        ivx.b(parcel, a2);
    }
}
