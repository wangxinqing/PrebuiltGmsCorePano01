package com.google.firebase.auth.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetAccountInfoUserList extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new apuk();
    public List a;

    public GetAccountInfoUserList() {
        this.a = new ArrayList();
    }

    public static GetAccountInfoUserList a() {
        return new GetAccountInfoUserList();
    }

    public GetAccountInfoUserList(List list) {
        this.a = list == null ? Collections.emptyList() : Collections.unmodifiableList(list);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.c(parcel, 2, this.a, false);
        ivx.b(parcel, a2);
    }
}
