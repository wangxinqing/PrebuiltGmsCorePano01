package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: hjs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hjs extends bhv implements hju {
    public hjs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.chromesync.internal.IBundleCallback");
    }

    public final void a(Bundle bundle) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) bundle);
        c(1, aQ);
    }
}
