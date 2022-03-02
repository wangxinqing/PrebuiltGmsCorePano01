package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;

/* renamed from: zob  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zob extends bhv implements zod {
    public zob(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.pseudonymous.internal.IPseudonymousIdCallbacks");
    }

    public final void a(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        c(2, aQ);
    }

    public final void a(Status status, long j) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeLong(j);
        c(3, aQ);
    }

    public final void a(Status status, PseudonymousIdToken pseudonymousIdToken) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) pseudonymousIdToken);
        c(1, aQ);
    }
}
