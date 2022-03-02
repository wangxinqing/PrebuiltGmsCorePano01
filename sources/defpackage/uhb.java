package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.nearby.internal.connection.OnStartAdvertisingResultParams;

/* renamed from: uhb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uhb extends bhv implements uhd {
    public uhb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener");
    }

    public final void a(OnStartAdvertisingResultParams onStartAdvertisingResultParams) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) onStartAdvertisingResultParams);
        c(2, aQ);
    }
}
