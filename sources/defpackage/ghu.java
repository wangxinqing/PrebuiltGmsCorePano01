package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: ghu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ghu extends bhv implements IInterface {
    public ghu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.managed.internal.IPasswordComplexityCallbacks");
    }

    public final void a(Status status, int i) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeInt(i);
        c(1, aQ);
    }
}
