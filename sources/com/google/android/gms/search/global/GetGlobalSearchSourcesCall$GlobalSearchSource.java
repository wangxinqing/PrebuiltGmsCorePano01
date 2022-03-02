package com.google.android.gms.search.global;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetGlobalSearchSourcesCall$GlobalSearchSource extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aaje();
    public String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public String f;
    public String g;
    public String h;
    public GetGlobalSearchSourcesCall$CorpusInfo[] i;
    public boolean j;

    public GetGlobalSearchSourcesCall$GlobalSearchSource() {
    }

    public GetGlobalSearchSourcesCall$GlobalSearchSource(String str, String str2, int i2, int i3, int i4, String str3, String str4, String str5, GetGlobalSearchSourcesCall$CorpusInfo[] getGlobalSearchSourcesCall$CorpusInfoArr, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = getGlobalSearchSourcesCall$CorpusInfoArr;
        this.j = z;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.b(parcel, 2, this.c);
        ivx.b(parcel, 3, this.d);
        ivx.b(parcel, 4, this.e);
        ivx.a(parcel, 5, this.f, false);
        ivx.a(parcel, 6, this.g, false);
        ivx.a(parcel, 7, this.h, false);
        ivx.a(parcel, 8, (Parcelable[]) this.i, i2);
        ivx.a(parcel, 9, this.j);
        ivx.a(parcel, 10, this.b, false);
        ivx.b(parcel, a2);
    }
}
