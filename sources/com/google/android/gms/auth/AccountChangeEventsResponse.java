package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ehu();
    final int a;
    public final List b;

    public AccountChangeEventsResponse(int i, List list) {
        this.a = i;
        iva.a((Object) list);
        this.b = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.c(parcel, 2, this.b, false);
        ivx.b(parcel, a2);
    }

    public AccountChangeEventsResponse(List list) {
        this.a = 1;
        iva.a((Object) list);
        this.b = list;
    }
}
