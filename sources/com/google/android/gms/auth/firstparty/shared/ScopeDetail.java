package com.google.android.gms.auth.firstparty.shared;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ScopeDetail extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new geh();
    final int a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    List g;
    public FACLData h;

    public ScopeDetail(int i, String str, String str2, String str3, String str4, String str5, List list, FACLData fACLData) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = list;
        this.h = fACLData;
    }

    public final List a() {
        return Collections.unmodifiableList(this.g);
    }

    public ScopeDetail(String str, String str2, String str3, String str4, String str5, FACLData fACLData, List list) {
        this.a = 1;
        this.f = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.h = fACLData;
        ArrayList arrayList = new ArrayList();
        this.g = arrayList;
        arrayList.addAll(list);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, false);
        ivx.a(parcel, 3, this.c, false);
        ivx.a(parcel, 4, this.d, false);
        ivx.a(parcel, 5, this.e, false);
        ivx.a(parcel, 6, this.f, false);
        ivx.b(parcel, 7, this.g, false);
        ivx.a(parcel, 8, this.h, i, false);
        ivx.b(parcel, a2);
    }
}
