package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.gms.beacon.BleSettings;
import com.google.location.nearby.direct.bluetooth.state.BluetoothEventReceiverLogger;
import com.google.location.nearby.direct.bluetooth.state.BluetoothMedium$1;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: asda  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class asda {
    public static final UUID a = UUID.fromString("0000FEF3-0000-1000-8000-00805F9B34FB");
    public static final UUID b = UUID.fromString("00000100-0004-1000-8000-001A11000100");
    public static final UUID c = UUID.fromString("00000100-0004-1000-8000-001A11000102");
    public static final UUID d;
    public static final UUID e = c;
    public static final UUID f;
    public final ascs g;
    public final asdu h;
    public final Context i;
    public final asht j;
    public final Handler k;
    public final ascn l;
    public final asjs m;
    public boolean n;
    public boolean o;
    public final aneu p;
    public gth q;
    public BleSettings r;
    private final arwg s;
    private final AtomicInteger t;
    private final asig u;
    private final BroadcastReceiver v = new BluetoothEventReceiverLogger(new BluetoothMedium$1(this, "nearby"));
    private boolean w;
    private boolean x;
    private final asic y = new ascw(this);
    private final asic z = new ascx(this);

    static {
        UUID fromString = UUID.fromString("00000100-0004-1000-8000-001A11000101");
        d = fromString;
        f = fromString;
    }

    public asda(Context context) {
        jjg jjg = asil.a;
        arwg arwg = (arwg) thl.a(context, arwg.class);
        this.s = arwg;
        this.k = arwg.c();
        this.g = new ascs(context);
        this.i = context;
        this.j = (asht) thl.a(context, asht.class);
        this.w = false;
        this.n = false;
        this.o = false;
        this.t = new AtomicInteger(0);
        this.m = new asjs(this, this.s, new asct(this));
        this.p = amzg.q();
        if (this.g.b()) {
            this.l = new ascn(context, this.g);
        } else {
            this.l = null;
        }
        asdu asdu = new asdu(context, this.g, context.getSharedPreferences("copresence_user_bluetooth_adapter_state", 0), this.l);
        this.h = asdu;
        a((asiz) null, asdu.q);
        this.u = new asig(this.k);
    }

    public static final asiz a(asia asia) {
        return new ascz(asia);
    }

    private final void d(asiz asiz) {
        a(asiz, this.h.g);
    }

    private final void j() {
        if (this.w) {
            jjg jjg = asil.a;
            try {
                this.i.unregisterReceiver(this.v);
            } catch (IllegalArgumentException e2) {
                ((anih) ((anih) asil.a.c()).a("asda", "j", 362, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unregistered bluetooth broadcast receiver when it wasn't registered.");
            }
            this.w = false;
        }
    }

    private final ashy k() {
        auyt auyt = this.j.b;
        auyo auyo = auyt.g;
        if (auyo == null) {
            auyo = auyo.j;
        }
        long j2 = auyo.e;
        auyo auyo2 = auyt.g;
        if (auyo2 == null) {
            auyo2 = auyo.j;
        }
        return new ashy(j2, auyo2.f);
    }

    private final ashy l() {
        auyt auyt = this.j.b;
        auyn auyn = auyt.h;
        if (auyn == null) {
            auyn = auyn.j;
        }
        long j2 = auyn.b;
        auyn auyn2 = auyt.h;
        if (auyn2 == null) {
            auyn2 = auyn.j;
        }
        return new ashy(j2, auyn2.c);
    }

    public final void b(asiz asiz) {
        synchronized (this.t) {
            if (this.t.get() <= 0) {
                ((anih) ((anih) asil.a.c()).a("asda", "b", 330, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BluetoothMedium: Bluetooth released more than requested");
                asiz.b();
            } else if (this.t.decrementAndGet() == 0) {
                c(asiz);
            } else {
                asiz.a();
            }
        }
    }

    public final boolean c() {
        return this.g.b();
    }

    public final boolean e() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        synchronized (this.t) {
            this.t.getAndIncrement();
            d(new ascu(this, atomicBoolean, countDownLatch));
        }
        try {
            auyt auyt = this.j.b;
            auyo auyo = auyt.g;
            if (auyo == null) {
                auyo = auyo.j;
            }
            long j2 = auyo.d;
            auyo auyo2 = auyt.g;
            if (auyo2 == null) {
                auyo2 = auyo.j;
            }
            countDownLatch.await(j2 + auyo2.c, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            jjg jjg = asil.a;
        }
        return atomicBoolean.get();
    }

    public final void f() {
        ashy ashy;
        jjg jjg = asil.a;
        if (!this.x) {
            this.x = true;
            if (this.q != null) {
                ashy = k();
                ashy a2 = this.u.a(this.z);
                if (a2 != null && !a2.equals(l())) {
                    gth gth = this.q;
                    BleSettings bleSettings = this.r;
                    h();
                    a(gth, bleSettings);
                }
            } else {
                ashy = new ashy(aymn.d(), aymn.d());
            }
            this.u.a(this.y, ashy, this.z);
        }
    }

    public final void g() {
        jjg jjg = asil.a;
        this.x = false;
        this.u.b(this.y);
    }

    public final void h() {
        jjg jjg = asil.a;
        this.q = null;
        this.u.b(this.z);
    }

    public final void i() {
        if (!this.x && this.t.get() == 0 && this.q == null && this.h.o.b() && this.h.m.b() && this.h.n.b()) {
            c((asiz) null);
        }
    }

    public static final asiz a(asib asib) {
        return new ascy(asib);
    }

    public final boolean c(asiz asiz) {
        if (this.h.q.b()) {
            this.n = false;
            this.o = false;
            j();
            if (asiz != null) {
                asiz.a();
            }
            return false;
        }
        a(asiz, this.h.q);
        return true;
    }

    public final void d() {
        ((anih) ((anih) asil.a.c()).a("asda", "d", 237, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BluetoothMedium: BluetoothMedium state transition has failed!");
        asjs asjs = this.m;
        asjs.c.clear();
        asjs.b.e(asjs.h);
        asjs.d = 0;
        asjs.e = 0;
        asjs.f = SystemClock.elapsedRealtime();
        for (asiz b2 : this.p.n()) {
            b2.b();
        }
        this.p.d();
        if (!this.o) {
            ((anih) ((anih) asil.a.c()).a("asda", "d", 246, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BluetoothMedium: Attempting to revert: STATE_MACHINE_FAILURE");
            this.o = true;
            h();
            this.x = false;
            a((asiz) null, this.h.k);
            a((asiz) null, this.h.n);
            c((asiz) null);
            return;
        }
        ((anih) ((anih) asil.a.b()).a("asda", "d", 241, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BluetoothMedium: Bluetooth stack is in an unrecoverable state!");
        j();
        this.n = false;
        this.o = false;
    }

    public static boolean a(Context context) {
        return BluetoothAdapter.getDefaultAdapter() != null && context.getPackageManager().hasSystemFeature("android.hardware.bluetooth");
    }

    public final void a(asiz asiz) {
        synchronized (this.t) {
            this.t.getAndIncrement();
            d(new ascv(this, asiz));
        }
    }

    public final void a(asiz asiz, asjt... asjtArr) {
        if (!this.w) {
            this.w = true;
            jjg jjg = asil.a;
            IntentFilter intentFilter = new IntentFilter();
            for (String addAction : BluetoothEventReceiverLogger.a) {
                intentFilter.addAction(addAction);
            }
            this.i.registerReceiver(this.v, intentFilter, (String) null, this.k);
        }
        for (asjt asjt : asjtArr) {
            jjg jjg2 = asil.a;
            String str = asjt.e;
            if (asiz != null) {
                this.p.a((Object) asjt, (Object) asiz);
            }
        }
        this.m.b(asjtArr);
        this.m.a(asjtArr);
    }

    public final void b(asjt asjt) {
        for (asiz b2 : ((amxb) this.p).e(asjt)) {
            b2.b();
        }
    }

    public final boolean b() {
        return this.g.c();
    }

    public final void a(asjt asjt) {
        this.m.b(asjt);
        b(asjt);
    }

    public final void a(gth gth, BleSettings bleSettings) {
        ashy ashy;
        iva.a((Object) gth);
        gth gth2 = this.q;
        if (!(gth2 == null || gth2 == gth)) {
            anih anih = (anih) asil.a.b();
            anih.a((Throwable) new IllegalStateException());
            ((anih) anih.a("asda", "a", 534, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("BluetoothMedium only supports one ble callback for now.");
        }
        if (this.q == null) {
            this.q = gth;
            this.r = bleSettings;
            if (this.x) {
                ashy = l();
                ashy a2 = this.u.a(this.y);
                if (a2 != null && !a2.equals(k())) {
                    g();
                    f();
                }
            } else {
                ashy = new ashy(aymn.c(), aymn.c());
            }
            this.u.a(this.z, ashy, this.y);
        }
    }

    public final boolean a() {
        return this.g.a();
    }
}
