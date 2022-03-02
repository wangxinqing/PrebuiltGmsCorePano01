package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.CollectForDebugParcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: hsv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hsv extends bhv implements hsx {
    public hsv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    public final void a(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        c(1, aQ);
    }

    public final void b(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        c(2, aQ);
    }

    public final void c(Status status) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        c(4, aQ);
    }

    public final void a(Status status, long j) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeLong(j);
        c(3, aQ);
    }

    public final void b(Status status, long j) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        aQ.writeLong(j);
        c(5, aQ);
    }

    public final void a(Status status, CollectForDebugParcelable collectForDebugParcelable) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) collectForDebugParcelable);
        c(8, aQ);
    }

    public final void b(Status status, CollectForDebugParcelable collectForDebugParcelable) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) status);
        bhx.a(aQ, (Parcelable) collectForDebugParcelable);
        c(9, aQ);
    }

    public final void a(DataHolder dataHolder) {
        Parcel aQ = aQ();
        bhx.a(aQ, (Parcelable) dataHolder);
        c(7, aQ);
    }
}
