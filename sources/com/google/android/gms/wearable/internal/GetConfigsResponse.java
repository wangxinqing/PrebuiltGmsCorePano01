package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GetConfigsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aeaq();
    public final int a;
    public final ConnectionConfiguration[] b;

    public GetConfigsResponse(int i, ConnectionConfiguration[] connectionConfigurationArr) {
        this.a = i;
        this.b = connectionConfigurationArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = ivx.a(parcel);
        ivx.b(parcel, 2, this.a);
        ivx.a(parcel, 3, (Parcelable[]) this.b, i);
        ivx.b(parcel, a2);
    }
}
