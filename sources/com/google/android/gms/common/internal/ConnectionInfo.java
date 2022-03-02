package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ConnectionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new isg();
    public Bundle a;
    public Feature[] b;
    public int c;

    public ConnectionInfo() {
    }

    public ConnectionInfo(Bundle bundle, Feature[] featureArr, int i) {
        this.a = bundle;
        this.b = featureArr;
        this.c = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.a(parcel, 1, this.a, false);
        ivx.a(parcel, 2, (Parcelable[]) this.b, i);
        ivx.b(parcel, 3, this.c);
        ivx.b(parcel, a2);
    }
}
