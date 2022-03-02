package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rgf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rgf extends bhv implements rgh {
    public rgf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    public final void a(int i, PendingIntent pendingIntent) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        bhx.a(aQ, (Parcelable) pendingIntent);
        c(3, aQ);
    }

    public final void b(int i, String[] strArr) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        aQ.writeStringArray(strArr);
        c(2, aQ);
    }

    public final void a(int i, String[] strArr) {
        Parcel aQ = aQ();
        aQ.writeInt(i);
        aQ.writeStringArray(strArr);
        c(1, aQ);
    }
}
