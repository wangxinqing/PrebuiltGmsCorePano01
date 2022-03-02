package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;

/* renamed from: gho  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gho extends bhv implements ghq {
    public gho(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.managed.internal.IEmmCallbacks");
    }

    public final void a(Status status, PendingIntent pendingIntent) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) pendingIntent);
        c(9, aQ);
    }

    public final void a(Status status, byte[] bArr) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeByteArray(bArr);
        c(1, aQ);
    }
}
