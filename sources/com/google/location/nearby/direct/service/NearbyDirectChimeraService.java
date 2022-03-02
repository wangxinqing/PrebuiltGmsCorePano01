package com.google.location.nearby.direct.service;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import com.google.android.chimera.Service;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class NearbyDirectChimeraService extends Service implements thm {
    public Handler a;
    private asjw b;
    private arwg c;
    private int d;
    private thl e;

    public final thl a() {
        return this.e;
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        askc askc;
        ascn ascn;
        aseb aseb;
        asda asda = (asda) thl.b(this, asda.class);
        if (!(asda == null || (ascn = asda.l) == null || (aseb = ascn.g) == null)) {
            Object[] objArr = new Object[2];
            int i = aseb.k;
            String a2 = avay.a(i);
            if (i != 0) {
                objArr[0] = a2;
                objArr[1] = Long.valueOf(aymt.p());
                printWriter.printf("FastPairScanner: scan mode=%s, lost millis=%s\n", objArr);
                printWriter.printf("  Last %d scans\n    %s\n", new Object[]{Long.valueOf(aymn.j()), amre.a("\n    ").a((Iterable) aseb.h)});
                printWriter.printf("  Ongoing scan\n    %s\n", new Object[]{aseb.i});
                printWriter.printf("  Screen state\n    Interactive=%s\n", new Object[]{Boolean.valueOf(aseb.c())});
            } else {
                throw null;
            }
        }
        asjw asjw = this.b;
        if (asjw == null || (askc = asjw.a) == null) {
            printWriter.println("No bound clients.");
        } else {
            askc.dump(fileDescriptor, printWriter, strArr);
        }
    }

    public final IBinder onBind(Intent intent) {
        jjg jjg = asil.a;
        this.b = new asjw(this);
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName(this, "com.google.location.nearby.direct.service.NearbyDirectService"));
        startService(intent2);
        return this.b;
    }

    public final void onCreate() {
        jjg jjg = asil.a;
        HandlerThread handlerThread = new HandlerThread("NearbyDirectMain");
        handlerThread.start();
        this.a = new qvr(handlerThread.getLooper());
        thl thl = new thl(this);
        this.e = thl;
        arwg arwg = new arwg(new arwl("NearbyDirect", this.a.getLooper()));
        this.c = arwg;
        thl.a(arwg.class, (Object) arwg);
        thl.a(asht.class, (Object) new asht(this));
        thl.a(ashu.class, (Object) new ashu());
        thl.a(ascd.class, (Object) new ascd());
        thl.a(asbo.class, (Object) new asbo(this));
        thl.a(asbb.class, (Object) new asbb());
        if (asda.a((Context) this)) {
            asda asda = new asda(this);
            thl.a(asda.class, (Object) asda);
            if (asda.c()) {
                thl.a(gte.class, (Object) gtd.a(this));
            }
        }
    }

    public final void onDestroy() {
        jjg jjg = asil.a;
        asda asda = (asda) thl.b(this, asda.class);
        if (asda != null) {
            asda.c((asiz) null);
            ascs ascs = asda.g;
            if (ascs != null) {
                try {
                    ascs.a.unregisterReceiver(ascs.h);
                } catch (IllegalArgumentException e2) {
                    ((anih) ((anih) asil.a.c()).a("ascs", "i", 361, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unregistered bluetooth broadcast receiver when it wasn't registered.");
                }
                ascs.f = true;
            }
        }
        this.c.d(new asjv(this, "StopBackgroundThread"));
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        this.d = i2;
        jjg jjg = asil.a;
        return 2;
    }

    public final boolean onUnbind(Intent intent) {
        jjg jjg = asil.a;
        askc askc = this.b.a;
        if (askc != null && askc.i.compareAndSet(false, true)) {
            askc.b.obtainMessage(1).sendToTarget();
        }
        this.c.d(new asju(this, "StopNearbyDirect", this.d));
        return false;
    }
}
