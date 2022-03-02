package defpackage;

import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.OnConnectionRequestParams;
import com.google.android.gms.nearby.internal.connection.OnStoppedAdvertisingParams;

/* renamed from: uga  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class uga extends bhw implements ugb {
    public uga() {
        super("com.google.android.gms.nearby.internal.connection.IAdvertisingCallback");
    }

    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            a((OnConnectionRequestParams) bhx.a(parcel, OnConnectionRequestParams.CREATOR));
            return true;
        } else if (i != 3) {
            return false;
        } else {
            OnStoppedAdvertisingParams onStoppedAdvertisingParams = (OnStoppedAdvertisingParams) bhx.a(parcel, OnStoppedAdvertisingParams.CREATOR);
            return true;
        }
    }
}
