package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.clearcut.CollectForDebugParcelable;
import com.google.android.gms.clearcut.LogEventParcelable;

/* renamed from: hsy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hsy extends bhv implements hta {
    public hsy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.clearcut.internal.IClearcutLoggerService");
    }

    public final void a(hsx hsx) {
        throw null;
    }

    public final void a(hsx hsx, CollectForDebugParcelable collectForDebugParcelable) {
        throw null;
    }

    public final void a(hsx hsx, String str) {
        throw null;
    }

    public final void b(hsx hsx) {
        throw null;
    }

    public final void b(hsx hsx, String str) {
        throw null;
    }

    public final void c(hsx hsx) {
        throw null;
    }

    public final void d(hsx hsx) {
        throw null;
    }

    public final void e(hsx hsx) {
        throw null;
    }

    public final void a(hsx hsx, LogEventParcelable logEventParcelable) {
        Parcel aQ = aQ();
        bhx.a(aQ, (IInterface) hsx);
        bhx.a(aQ, (Parcelable) logEventParcelable);
        c(1, aQ);
    }
}
