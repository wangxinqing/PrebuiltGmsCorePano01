package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.chimera.config.ModuleManager;
import com.google.android.gms.clearcut.CollectForDebugParcelable;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.service.ClearcutLoggerChimeraService;
import com.google.android.gms.common.api.Status;

/* renamed from: hti  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hti extends hsz implements niz {
    final htl a;
    private final ClearcutLoggerChimeraService b;
    private final nix c;
    private final hvh d;
    private final nit e;
    private final String f;

    public hti(ClearcutLoggerChimeraService clearcutLoggerChimeraService, nix nix, hvh hvh, nit nit, String str) {
        this.b = clearcutLoggerChimeraService;
        this.c = nix;
        this.d = hvh;
        this.e = nit;
        this.f = str;
        this.a = new htl(clearcutLoggerChimeraService);
    }

    public final void a(hsx hsx) {
        this.c.a(new htm(hsx, this.f));
    }

    public final void b(hsx hsx) {
        this.c.a(new htt(hsx, this.f));
    }

    public final void c(hsx hsx) {
        this.c.a(new htv(hsx, this.f));
    }

    public final void d(hsx hsx) {
        this.c.a(new htn(hsx, this.f));
    }

    public final void e(hsx hsx) {
        this.c.a(new hto(hsx, this.f));
    }

    public final void a(hsx hsx, CollectForDebugParcelable collectForDebugParcelable) {
        this.c.a(new htu(hsx, this.f, collectForDebugParcelable));
    }

    public final void b(hsx hsx, String str) {
        this.c.a(new htp(hsx, str, this.d, this.f));
    }

    public final void a(hsx hsx, LogEventParcelable logEventParcelable) {
        if (awsu.a.a().b()) {
            try {
                hsx.a(new Status(31002, "Logging is disabled"));
            } catch (RemoteException e2) {
                Log.w("ClearcutService", "Failed to send operation result", e2);
            }
        } else {
            if (awsx.c()) {
                hrw.a.a();
            }
            hsa.a(logEventParcelable, hry.EVENTS_SERVICE_RECEIVED);
            try {
                ClearcutLoggerChimeraService.a(this.b, this.f, this.e, logEventParcelable);
                this.c.a(new htr(hsx, logEventParcelable, this.d, ModuleManager.get(this.b), this.f, this.a, ClearcutLoggerChimeraService.b));
                hsa.a(logEventParcelable, hry.EVENTS_SERVICE_DISPATCHED);
            } catch (Throwable th) {
                try {
                    hsx.a(new Status(31002, "Caller is restricted"));
                } catch (RemoteException e3) {
                    Log.w("ClearcutService", "Failed to send operation result", th);
                }
                hsa.a(logEventParcelable, hry.DROPS_BY_RESTRICTION);
            }
        }
    }

    public final void a(hsx hsx, String str) {
        this.c.a(new htp(hsx, str, this.d, this.f));
    }
}
