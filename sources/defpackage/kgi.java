package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.internal.OnLoadRealtimeResponse;

/* renamed from: kgi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class kgi implements ljw {
    final /* synthetic */ ljt a;
    final /* synthetic */ kgk b;
    private keo c;

    public kgi(kgk kgk, ljt ljt) {
        this.b = kgk;
        this.a = ljt;
    }

    public final void a(Status status) {
        keo keo = this.c;
        if (keo != null) {
            lmg lmg = keo.l;
            if (lmg != null) {
                try {
                    Parcel aQ = lmg.aQ();
                    bhx.a(aQ, (Parcelable) status);
                    lmg.b(2, aQ);
                } catch (RemoteException e) {
                    keo.a.b("RealtimeService", String.format("Unable to deliver error: %s", new Object[]{status}), (Throwable) e);
                }
            }
            if (!status.b() && status.i != 7) {
                keo.a();
                return;
            }
            return;
        }
        try {
            this.b.b.a(status);
        } catch (RemoteException e2) {
        }
    }

    public final void a(lkk lkk, alny alny, ljt ljt) {
        keo keo;
        OnLoadRealtimeResponse onLoadRealtimeResponse = new OnLoadRealtimeResponse(alny.d.b());
        this.b.j.e.a(ljt);
        try {
            kgk kgk = this.b;
            kef kef = kgk.g;
            IBinder asBinder = kgk.b.asBinder();
            synchronized (kef.e) {
                if (!kef.f) {
                    keo = new keo(kef.b, kef.c, kef.d, alny, asBinder, ljt, lkk);
                    kef.e.add(keo);
                } else {
                    kef.a.b("DriveService closed before Realtime document finished loading.");
                    throw new RemoteException();
                }
            }
            this.c = keo;
            this.b.b.a(onLoadRealtimeResponse, this.c);
        } catch (RemoteException e) {
            kgk.f.a("LoadRealtimeOperation", "Application disconnected before Realtime load completed; closing Realtime document: %s", ljt);
            alny.a();
            try {
                new lkd(lkk, this.b.i.w, true).a(this.b.i.b);
            } catch (RemoteException | nja e2) {
                kgk.f.c("LoadRealtimeOperation", String.format("Failed to close the cache for Realtime document: %s", new Object[]{this.a}), e2);
            }
            this.b.j.e.b(this.a);
        }
    }
}
