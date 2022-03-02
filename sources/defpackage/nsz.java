package defpackage;

import android.content.ComponentName;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: nsz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nsz extends bhv implements ntb {
    public nsz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gcm.IMessengerProxyCallback");
    }

    public final void a(ComponentName componentName) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) componentName);
        c(3, aQ);
    }

    public final void b() {
        c(1, aQ());
    }

    public final void c() {
        c(2, aQ());
    }

    public final void d() {
        c(4, aQ());
    }

    public final void a(ComponentName componentName, nsy nsy) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) componentName);
        bhx.a(aQ, (IInterface) nsy);
        c(6, aQ);
    }
}
