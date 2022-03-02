package defpackage;

import android.os.StrictMode;
import android.os.strictmode.CustomViolation;
import android.os.strictmode.DiskReadViolation;
import android.os.strictmode.DiskWriteViolation;
import android.os.strictmode.Violation;
import java.util.concurrent.Executor;

/* renamed from: agnb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agnb implements agkv {
    private final agks a;
    private final bapu b;
    private final StrictMode.OnVmViolationListener c = agmx.a;
    private final agnf d = agnf.a();

    public agnb(agkt agkt, bapu bapu, agic agic) {
        this.a = agkt.a((Executor) bapu.a(), this.d);
        this.b = bapu;
        agic.b(this);
    }

    public void a() {
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectAll().penaltyListener((Executor) this.b.a(), this.c).build());
        agzj.a(new agmy(this));
    }

    public void c() {
        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
        agzj.a(agmz.a);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void d() {
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().penaltyListener((Executor) this.b.a(), new agna(this)).build());
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void a(Violation violation) {
        if (!this.d.b()) {
            aucd o = bast.c.o();
            if (violation instanceof DiskReadViolation) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                bast bast = (bast) o.b;
                bast.b = 1;
                bast.a |= 1;
            } else if (violation instanceof DiskWriteViolation) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                bast bast2 = (bast) o.b;
                bast2.b = 2;
                bast2.a |= 1;
            } else if (violation instanceof CustomViolation) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                bast bast3 = (bast) o.b;
                bast3.b = 3;
                bast3.a |= 1;
            } else {
                return;
            }
            aucd o2 = basu.s.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            basu basu = (basu) o2.b;
            bast bast4 = (bast) o.i();
            bast4.getClass();
            basu.r = bast4;
            basu.a |= 33554432;
            this.a.a((basu) o2.i());
        }
    }
}
