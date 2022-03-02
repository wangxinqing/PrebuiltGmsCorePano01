package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ProviderUserInfoList extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new apus();
    public List a;

    public ProviderUserInfoList() {
        this.a = new ArrayList();
    }

    public static ProviderUserInfoList a(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            alni alni = (alni) list.get(i);
            arrayList.add(new ProviderUserInfo(jlh.b(alni.d), jlh.b(alni.b), jlh.b(alni.c), jlh.b(alni.a), (String) null, jlh.b(alni.f), jlh.b(alni.e)));
        }
        return new ProviderUserInfoList(arrayList);
    }

    public ProviderUserInfoList(List list) {
        if (list == null || list.isEmpty()) {
            this.a = Collections.emptyList();
        } else {
            this.a = Collections.unmodifiableList(list);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 2, this.a, false);
        ivx.b(parcel, a2);
    }
}
