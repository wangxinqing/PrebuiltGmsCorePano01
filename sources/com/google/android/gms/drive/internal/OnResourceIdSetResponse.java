package com.google.android.gms.drive.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OnResourceIdSetResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new kxb();
    public final List a;

    public OnResourceIdSetResponse(List list) {
        this.a = list;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a, false);
        ivx.b(parcel, a2);
    }
}
