package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.ads.afma.proto2api.c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.gass.internal.GassRequestParcel;
import com.google.android.gms.gass.internal.GassResponseParcel;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: noc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class noc implements irn, iro {
    protected final npk a;
    public final LinkedBlockingQueue b = new LinkedBlockingQueue();
    private final String c;
    private final String d;
    private final HandlerThread e;

    public noc(Context context, String str, String str2) {
        this.c = str;
        this.d = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.e = handlerThread;
        handlerThread.start();
        this.a = new npk(context, this.e.getLooper(), this, this, 9200000);
        this.a.t();
    }

    static c c() {
        aucd o = c.Q.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        c cVar = (c) o.b;
        cVar.a |= 524288;
        cVar.l = 32768;
        return (c) o.i();
    }

    /* access modifiers changed from: protected */
    public final npp a() {
        try {
            return this.a.q();
        } catch (DeadObjectException | IllegalStateException e2) {
            return null;
        }
    }

    public final void b() {
        npk npk = this.a;
        if (npk == null) {
            return;
        }
        if (npk.l() || this.a.m()) {
            this.a.j();
        }
    }

    public final void a(int i) {
        try {
            this.b.put(c());
        } catch (InterruptedException e2) {
        }
    }

    public final void a(Bundle bundle) {
        npp a2 = a();
        if (a2 != null) {
            try {
                GassResponseParcel a3 = a2.a(new GassRequestParcel(1, this.c, this.d));
                if (a3.b == null) {
                    a3.b = (c) aucj.a((aucj) c.Q, a3.c, aubs.c());
                    a3.c = null;
                }
                a3.a();
                this.b.put(a3.b);
            } catch (auda e2) {
                throw new IllegalStateException(e2);
            } catch (Throwable th) {
                try {
                    this.b.put(c());
                } catch (InterruptedException e3) {
                } catch (Throwable th2) {
                    b();
                    this.e.quit();
                    throw th2;
                }
            }
            b();
            this.e.quit();
        }
    }

    public final void a(ConnectionResult connectionResult) {
        try {
            this.b.put(c());
        } catch (InterruptedException e2) {
        }
    }
}
