package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.chimera.FragmentTransaction;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DataMessageManager$BroadcastDoneReceiver extends nla {
    public final acwd a = new acwd();
    boolean b = true;
    private final nrj c;
    private final Intent d;
    private final amnc e;
    private final long f;

    public DataMessageManager$BroadcastDoneReceiver(nrj nrj, Intent intent, amnc amnc, long j) {
        super("gcm");
        this.c = nrj;
        this.d = intent;
        this.e = amnc;
        this.f = j;
    }

    public final void a(Context context, Intent intent) {
        int resultCode = getResultCode();
        nrj nrj = this.c;
        Intent intent2 = this.d;
        amnc amnc = this.e;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f;
        if (resultCode == -1) {
            GcmChimeraService.a("Successful broadcast to %s (id=%s time=%dms priority=%s)", amnc.e, amnc.h, Long.valueOf(elapsedRealtime), nrj.a(amnc.q));
        } else if (resultCode != 0) {
            GcmChimeraService.a("%s returned error code=%d to broadcast (id=%s time=%dms priority=%s)", amnc.e, Integer.valueOf(resultCode), amnc.h, Long.valueOf(elapsedRealtime), nrj.a(amnc.q));
            amnb amnb = (amnb) amnc.r.o();
            nrj.a(amnb, "broadcastError", String.valueOf(resultCode));
            nrj.a(amnb, "cat", amnc.e);
            nrj.a(amnb, "pid", amnc.h);
            if (amnb.c) {
                amnb.c();
                amnb.c = false;
            }
            amnc amnc2 = (amnc) amnb.b;
            "com.google.android.gsf.gtalkservice".getClass();
            amnc2.a |= 16;
            amnc2.e = "com.google.android.gsf.gtalkservice";
            nrj.p.a((audw) amnb);
        } else {
            String valueOf = String.valueOf(intent2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
            sb.append("broadcast intent callback: result=CANCELLED for");
            sb.append(valueOf);
            Log.w("GCM", sb.toString());
            String str = intent2.getPackage();
            if (str == null) {
                GcmChimeraService.a("Broadcast sent to %s missing Intent package (id=%s time=%dms priority=%s)", amnc.e, amnc.h, Long.valueOf(elapsedRealtime), nrj.a(amnc.q));
            } else {
                ntx a2 = ntx.a(intent2.getPackage(), (int) amnc.k);
                if (nrj.g.b(a2)) {
                    try {
                        if ((a2.a(nrj.n, (int) FragmentTransaction.TRANSIT_EXIT_MASK).flags & 2097152) != 0) {
                            GcmChimeraService.a("Failed to broadcast to stopped app %s (id=%s time=%dms priority=%s)", amnc.e, amnc.h, Long.valueOf(elapsedRealtime), nrj.a(amnc.q));
                            nrj.k.a(ntx.a(amnc.e, (int) amnc.k), amnc.h, amnc.q, 7);
                        }
                    } catch (PackageManager.NameNotFoundException e2) {
                    }
                    GcmChimeraService.a("No response to broadcast from %s (id=%s time=%dms priority=%s)", amnc.e, amnc.h, Long.valueOf(elapsedRealtime), nrj.a(amnc.q));
                } else if (nrj.g.b.e(a2) == 2) {
                    GcmChimeraService.a("Failed to broadcast to %s, it may be updating (id=%s time=%dms priority=%s)", str, amnc.h, Long.valueOf(elapsedRealtime), nrj.a(amnc.q));
                    nrj.r.a(amnc);
                } else {
                    GcmChimeraService.a("Failed to broadcast to uninstalled app %s (id=%s time=%dms priority=%s)", str, amnc.h, Long.valueOf(elapsedRealtime), nrj.a(amnc.q));
                    nrj.k.a(a2, amnc.h, amnc.q, 5);
                    nrj.a(a2);
                }
            }
        }
        this.a.b((Object) null);
        a();
    }

    public final boolean a() {
        boolean z;
        synchronized (this) {
            if (this.b) {
                this.c.a();
                z = true;
            } else {
                z = false;
            }
            this.b = false;
        }
        return z;
    }
}
