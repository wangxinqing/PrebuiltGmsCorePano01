package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ConnectionInfo;

/* renamed from: itt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class itt extends bhv implements itv {
    public itt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public final void a(int i, Bundle bundle) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) bundle);
        b(2, aQ);
    }

    public final void a(int i, IBinder iBinder, Bundle bundle) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        aQ.writeStrongBinder(iBinder);
        bhx.a(aQ, (Parcelable) bundle);
        b(1, aQ);
    }

    public final void a(int i, IBinder iBinder, ConnectionInfo connectionInfo) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        aQ.writeStrongBinder(iBinder);
        bhx.a(aQ, (Parcelable) connectionInfo);
        b(3, aQ);
    }
}
