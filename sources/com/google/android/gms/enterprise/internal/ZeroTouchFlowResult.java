package com.google.android.gms.enterprise.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ZeroTouchFlowResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new mdq();
    public final int a;
    public final Intent b;

    public ZeroTouchFlowResult(int i, Intent intent) {
        this.a = i;
        this.b = intent;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 1, this.a);
        ivx.a(parcel, 2, this.b, i, false);
        ivx.b(parcel, a2);
    }
}
