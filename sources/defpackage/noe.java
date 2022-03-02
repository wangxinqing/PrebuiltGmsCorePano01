package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.gass.internal.ProgramRequest;
import com.google.android.gms.gass.internal.ProgramResponse;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: noe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class noe implements irn, iro {
    protected final npk a;
    public final LinkedBlockingQueue b;
    public final long c;
    private final String d;
    private final String e;
    private final bhs f;
    private final int g = 1;
    private final HandlerThread h;
    private final nnt i;

    public noe(Context context, bhs bhs, String str, String str2, nnt nnt) {
        this.d = str;
        this.f = bhs;
        this.e = str2;
        this.i = nnt;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.h = handlerThread;
        handlerThread.start();
        this.c = System.currentTimeMillis();
        this.a = new npk(context, this.h.getLooper(), this, this, 19621000);
        this.b = new LinkedBlockingQueue();
        this.a.t();
    }

    public static ProgramResponse c() {
        return new ProgramResponse((byte[]) null, 1);
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

    public final void a(int i2) {
        try {
            a(4011, this.c);
            this.b.put(c());
        } catch (InterruptedException e2) {
        }
    }

    public final void a(int i2, long j) {
        a(i2, j, (Exception) null);
    }

    public final void a(int i2, long j, Exception exc) {
        nnt nnt = this.i;
        if (nnt != null) {
            nnt.a(i2, System.currentTimeMillis() - j, exc);
        }
    }

    public final void a(Bundle bundle) {
        npp a2 = a();
        if (a2 != null) {
            try {
                int i2 = this.g;
                bhs bhs = this.f;
                ProgramResponse a3 = a2.a(new ProgramRequest(1, i2, bhs.f, this.d, this.e));
                a(5011, this.c);
                this.b.put(a3);
            } catch (Throwable th) {
                b();
                this.h.quit();
                throw th;
            }
            b();
            this.h.quit();
        }
    }

    public final void a(ConnectionResult connectionResult) {
        try {
            a(4012, this.c);
            this.b.put(c());
        } catch (InterruptedException e2) {
        }
    }
}
