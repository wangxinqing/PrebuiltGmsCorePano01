package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: cqn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cqn extends bhv implements IInterface {
    public cqn(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.zapp.protocol.IPlayModuleService");
    }

    public final void a(String str, Bundle bundle) {
        Parcel aQ = aQ();
        aQ.writeString(str);
        bhx.a(aQ, (Parcelable) bundle);
        c(3, aQ);
    }
}
