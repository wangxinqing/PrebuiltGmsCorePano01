package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: hsp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hsp extends bhv implements hsr {
    public hsp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IBootCountCallbacks");
    }

    public final void a(Status status, int i) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeInt(i);
        c(1, aQ);
    }
}
