package defpackage;

import android.os.Looper;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: ajbw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajbw implements arne, ajam, arnb, arni {
    public List a;
    private final ajbg b;
    private final arnd c;
    private arnh d;
    private int e = -1;

    public ajbw(arnd arnd, ajbg ajbg) {
        this.c = arnd;
        this.b = ajbg;
    }

    private final boolean a(arlh arlh) {
        amrl.a((Object) this.d);
        arnk a2 = this.d.a(64, 1, (audx) arlh);
        if (a2 == null) {
            return false;
        }
        try {
            int intValue = ((Integer) a2.get(2, TimeUnit.SECONDS)).intValue();
            if (intValue == 0) {
                return true;
            }
            StringBuilder sb = new StringBuilder(61);
            sb.append("Failed to send request to nanoapp: request result=");
            sb.append(intValue);
            sb.toString();
            return false;
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            String valueOf = String.valueOf(e2.getMessage());
            if (valueOf.length() == 0) {
                new String("Failed to send request to nanoapp: ");
                return false;
            }
            "Failed to send request to nanoapp: ".concat(valueOf);
            return false;
        }
    }

    private final arnh f() {
        return this.c.a(5147455389092024327L);
    }

    public final void a(int i) {
        if (i != 1) {
            this.d = null;
        }
    }

    public final void b(int i) {
    }

    public final boolean b() {
        return this.d != null;
    }

    public final void be() {
        int i = this.e;
        if (i != -1) {
            boolean c2 = c(i);
            StringBuilder sb = new StringBuilder(53);
            sb.append("Re-enable because contexthub restarted, success=");
            sb.append(c2);
            sb.toString();
        }
    }

    public final boolean c(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        amrl.a(z);
        arnh f = f();
        this.d = f;
        if (f != null) {
            aucd o = arlh.d.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            arlh arlh = (arlh) o.b;
            arlh.b = 1;
            int i2 = arlh.a | 1;
            arlh.a = i2;
            arlh.a = i2 | 2;
            arlh.c = i;
            if (a((arlh) o.i())) {
                f.a(this);
                if (aydr.a.a().bugFixUseLifecycleCallbacksInFloorChange()) {
                    Looper myLooper = Looper.myLooper();
                    amrl.a((Object) myLooper);
                    this.c.a(5147455389092024327L, this, new qvr(myLooper));
                } else {
                    this.c.a((arni) this);
                }
                this.e = i;
                return true;
            }
        }
        this.d = null;
        return false;
    }

    public final void d() {
        if (this.d != null) {
            aucd o = arlh.d.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            arlh arlh = (arlh) o.b;
            arlh.b = 0;
            arlh.a |= 1;
            if (a((arlh) o.i())) {
                amrl.a((Object) this.d);
                this.d.b(this);
                this.c.b((arni) this);
                this.c.a((arnb) this);
                this.e = -1;
                this.d = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("enable() must be called first.");
    }

    public final void e() {
        if (this.d != null) {
            aucd o = arlh.d.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            arlh arlh = (arlh) o.b;
            arlh.b = 2;
            arlh.a |= 1;
            a((arlh) o.i());
            return;
        }
        throw new IllegalStateException("enable() must be called first.");
    }

    public final void b(ajal ajal) {
        this.a.remove(ajal);
    }

    public final void a(ajal ajal) {
        if (this.a == null) {
            this.a = new ArrayList();
        }
        this.a.add(ajal);
    }

    public final void a(arnd arnd, arnh arnh, arnt arnt) {
        if (arnh != null && arnh.a() == 5147455389092024327L) {
            boolean a2 = this.b.a((Runnable) new ajbv(this, arnt));
        }
    }

    public final boolean a() {
        return f() != null;
    }
}
