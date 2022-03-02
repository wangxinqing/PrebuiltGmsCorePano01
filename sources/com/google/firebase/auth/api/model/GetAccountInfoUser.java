package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.DefaultOAuthCredential;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetAccountInfoUser extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new apuj();
    public String a;
    public String b;
    public boolean c;
    public String d;
    public String e;
    public ProviderUserInfoList f;
    public String g;
    public String h;
    public long i;
    public long j;
    public boolean k;
    public DefaultOAuthCredential l;
    public List m;

    public GetAccountInfoUser() {
        this.f = new ProviderUserInfoList();
    }

    public GetAccountInfoUser(String str, String str2, boolean z, String str3, String str4, ProviderUserInfoList providerUserInfoList, String str5, String str6, long j2, long j3, boolean z2, DefaultOAuthCredential defaultOAuthCredential, List list) {
        ProviderUserInfoList providerUserInfoList2;
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        if (providerUserInfoList != null) {
            List list2 = providerUserInfoList.a;
            providerUserInfoList2 = new ProviderUserInfoList();
            if (list2 != null) {
                providerUserInfoList2.a.addAll(list2);
            }
        } else {
            providerUserInfoList2 = new ProviderUserInfoList();
        }
        this.f = providerUserInfoList2;
        this.g = str5;
        this.h = str6;
        this.i = j2;
        this.j = j3;
        this.k = z2;
        this.l = defaultOAuthCredential;
        this.m = list == null ? amzy.h() : list;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, false);
        ivx.a(parcel, 3, this.b, false);
        ivx.a(parcel, 4, this.c);
        ivx.a(parcel, 5, this.d, false);
        ivx.a(parcel, 6, this.e, false);
        ivx.a(parcel, 7, this.f, i2, false);
        ivx.a(parcel, 8, this.g, false);
        ivx.a(parcel, 9, this.h, false);
        ivx.a(parcel, 10, this.i);
        ivx.a(parcel, 11, this.j);
        ivx.a(parcel, 12, this.k);
        ivx.a(parcel, 13, this.l, i2, false);
        ivx.c(parcel, 14, this.m, false);
        ivx.b(parcel, a2);
    }
}
