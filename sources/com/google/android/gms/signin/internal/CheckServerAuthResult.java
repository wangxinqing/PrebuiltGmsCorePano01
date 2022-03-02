package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CheckServerAuthResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abdo();
    final int a;
    final boolean b;
    final List c;

    public CheckServerAuthResult(int i, boolean z, List list) {
        this.a = i;
        this.b = z;
        this.c = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b);
        ivx.c(parcel, 3, this.c, false);
        ivx.b(parcel, a2);
    }
}
