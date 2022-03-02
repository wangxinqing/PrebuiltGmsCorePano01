package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.firebase.auth.DefaultOAuthCredential;
import java.util.ArrayList;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetAccountInfoResponse extends AbstractSafeParcelable implements apth {
    public static final Parcelable.Creator CREATOR = new apui();
    public GetAccountInfoUserList a;

    public GetAccountInfoResponse() {
    }

    public final auef a() {
        return (auef) almg.b.c(7);
    }

    public final List b() {
        return this.a.a;
    }

    public GetAccountInfoResponse(GetAccountInfoUserList getAccountInfoUserList) {
        GetAccountInfoUserList getAccountInfoUserList2;
        if (getAccountInfoUserList == null) {
            getAccountInfoUserList2 = GetAccountInfoUserList.a();
        } else {
            iva.a((Object) getAccountInfoUserList);
            List list = getAccountInfoUserList.a;
            GetAccountInfoUserList getAccountInfoUserList3 = new GetAccountInfoUserList();
            if (list != null && !list.isEmpty()) {
                getAccountInfoUserList3.a.addAll(list);
            }
            getAccountInfoUserList2 = getAccountInfoUserList3;
        }
        this.a = getAccountInfoUserList2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 2, this.a, i, false);
        ivx.b(parcel, a2);
    }

    public final /* bridge */ /* synthetic */ void a(audx audx) {
        ArrayList arrayList;
        ArrayList arrayList2;
        long j;
        audx audx2 = audx;
        if (audx2 instanceof almg) {
            almg almg = (almg) audx2;
            if (almg.a.size() != 0) {
                ArrayList arrayList3 = new ArrayList(almg.a.size());
                int i = 0;
                while (i < almg.a.size()) {
                    alnl alnl = (alnl) almg.a.get(i);
                    String b = jlh.b(alnl.a);
                    String b2 = jlh.b(alnl.b);
                    boolean z = alnl.e;
                    String b3 = jlh.b(alnl.c);
                    String b4 = jlh.b(alnl.d);
                    ProviderUserInfoList a2 = ProviderUserInfoList.a(alnl.f);
                    String b5 = jlh.b(alnl.i);
                    String b6 = jlh.b(alnl.j);
                    int i2 = i;
                    long j2 = alnl.h;
                    almg almg2 = almg;
                    long j3 = alnl.g;
                    aucx aucx = alnl.k;
                    if (aucx != null) {
                        ArrayList arrayList4 = new ArrayList();
                        arrayList = arrayList3;
                        int size = aucx.size();
                        j = j3;
                        for (int i3 = 0; i3 < size; i3++) {
                            arrayList4.add(MfaInfo.a((alnh) aucx.get(i3)));
                        }
                        arrayList2 = arrayList4;
                    } else {
                        j = j3;
                        arrayList = arrayList3;
                        arrayList2 = amzy.h();
                    }
                    GetAccountInfoUser getAccountInfoUser = r6;
                    GetAccountInfoUser getAccountInfoUser2 = new GetAccountInfoUser(b, b2, z, b3, b4, a2, b5, b6, j2, j, false, (DefaultOAuthCredential) null, arrayList2);
                    ArrayList arrayList5 = arrayList;
                    arrayList5.add(getAccountInfoUser);
                    i = i2 + 1;
                    arrayList3 = arrayList5;
                    almg = almg2;
                }
                this.a = new GetAccountInfoUserList(arrayList3);
                return;
            }
            this.a = GetAccountInfoUserList.a();
            return;
        }
        throw new IllegalArgumentException("The passed proto must be an instance of GetAccountInfoResponse.");
    }
}
