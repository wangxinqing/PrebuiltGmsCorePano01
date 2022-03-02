package defpackage;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: ljv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ljv implements alpi {
    final /* synthetic */ lkk a;
    final /* synthetic */ alpf b;
    final /* synthetic */ String c;
    final /* synthetic */ ljw d;
    final /* synthetic */ ljt e;
    final /* synthetic */ ljy f;

    public ljv(ljy ljy, lkk lkk, alpf alpf, String str, ljw ljw, ljt ljt) {
        this.f = ljy;
        this.a = lkk;
        this.b = alpf;
        this.c = str;
        this.d = ljw;
        this.e = ljt;
    }

    public final void a(alpj alpj) {
        this.d.a(new Status(7, "Failed to load document from network.", (PendingIntent) null));
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        alrs alrs = (alrs) obj;
        try {
            new lkf(this.a, this.f.f, alrs).a(this.f.d);
        } catch (RemoteException | nja e2) {
            ljy.a.c("RealtimeLoader", "Failed to get initial snapshot.", e2);
        }
        alny a2 = alny.a(this.b, alns.a(alrs), ljy.c);
        a2.a(this.c);
        this.d.a(this.a, a2, this.e);
    }
}
