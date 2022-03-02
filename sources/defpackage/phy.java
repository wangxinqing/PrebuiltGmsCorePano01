package defpackage;

import android.content.Context;
import com.google.android.chimera.config.ModuleManager;
import java.util.Iterator;
import java.util.Random;

/* renamed from: phy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class phy implements aetj {
    private final amsv a;
    private final Random b = new Random();
    private final Context c;
    private final int d;

    public phy(Context context) {
        amsv a2 = amta.a((amsv) new phx(context));
        this.c = context;
        int i = -1;
        try {
            Iterator it = ModuleManager.get(context).getAllModules().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                ModuleManager.ModuleInfo moduleInfo = (ModuleManager.ModuleInfo) it.next();
                if (moduleInfo.moduleId.equals("com.google.android.gms.icing")) {
                    i = moduleInfo.moduleVersion;
                    break;
                }
            }
        } catch (Exception e) {
            oso.b("Failed to set icing module version: %s", (Object) e);
        }
        this.d = i;
        this.a = a2;
    }

    private final void a(int i, aucd aucd, long j) {
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoji aoji = (aoji) aucd.b;
        aoji aoji2 = aoji.R;
        aoji.a |= 524288;
        aoji.s = j;
        aucd o = aojh.c.o();
        boolean a2 = oyo.a(this.c);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aojh aojh = (aojh) o.b;
        aojh.a |= 1;
        aojh.b = a2;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoji aoji3 = (aoji) aucd.b;
        aojh aojh2 = (aojh) o.i();
        aojh2.getClass();
        aoji3.E = aojh2;
        aoji3.b |= 64;
        aucd o2 = aoiu.d.o();
        int i2 = this.d;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        aoiu aoiu = (aoiu) o2.b;
        aoiu.a |= 1;
        aoiu.b = i2;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        aoji aoji4 = (aoji) aucd.b;
        aoiu aoiu2 = (aoiu) o2.i();
        aoiu2.getClass();
        aoji4.L = aoiu2;
        aoji4.b |= 131072;
        hoi a3 = ((hol) this.a.a()).a((audx) aucd.i());
        a3.b(aolk.a(i));
        a3.b();
    }

    public final void a(int i) {
        long c2 = axrp.c();
        if (a(c2)) {
            a(i, aoji.R.o(), c2);
        }
    }

    public final void a(int i, aokg aokg) {
        long intValue = (long) ((Integer) ozz.a.c()).intValue();
        if (a(intValue)) {
            aucd o = aoji.R.o();
            aucd o2 = aokf.c.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            aokf aokf = (aokf) o2.b;
            aokg.getClass();
            aokf.b = aokg;
            aokf.a |= 1;
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoji aoji = (aoji) o.b;
            aokf aokf2 = (aokf) o2.i();
            aokf2.getClass();
            aoji.G = aokf2;
            aoji.b |= 512;
            a(i, o, intValue);
        }
    }

    public final void a(aokd aokd) {
        long intValue = (long) ((Integer) ozz.b.c()).intValue();
        if (a(intValue)) {
            aucd o = aoji.R.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoji aoji = (aoji) o.b;
            aokd.getClass();
            aoji.r = aokd;
            aoji.a |= 262144;
            a(10003, o, intValue);
        }
    }

    public final void a(aoke aoke) {
        long a2 = axrv.a.a().a();
        if (a(a2)) {
            aucd o = aoji.R.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoji aoji = (aoji) o.b;
            aoke.getClass();
            aoji.q = aoke;
            aoji.a |= 131072;
            a(10002, o, a2);
        }
    }

    public final void a(aokh aokh) {
        long f = axrv.a.a().f();
        if (a(f)) {
            aucd o = aoji.R.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoji aoji = (aoji) o.b;
            aokh.getClass();
            aoji.v = aokh;
            aoji.a |= 16777216;
            a(10011, o, f);
        }
    }

    public final void a(aokl aokl) {
        long intValue = (long) ((Integer) ozz.d.c()).intValue();
        if (a(intValue)) {
            aucd o = aoji.R.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoji aoji = (aoji) o.b;
            aokl.getClass();
            aoji.D = aokl;
            aoji.b |= 2;
            a(10013, o, intValue);
        }
    }

    public final void a(aokp aokp) {
        long intValue = (long) ((Integer) ozz.c.c()).intValue();
        if (a(intValue)) {
            aucd o = aoji.R.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aoji aoji = (aoji) o.b;
            aokp.getClass();
            aoji.t = aokp;
            aoji.a |= 1048576;
            a(10004, o, intValue);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(long j) {
        if (j <= 0) {
            if (j < 0) {
                oso.b("Bad sample interval: %d", (Object) Long.valueOf(j));
            }
            return false;
        } else if (j <= 2147483647L) {
            return this.b.nextInt((int) j) == 0;
        } else {
            oso.b("Bad sample interval: %d", (Object) Long.valueOf(j));
            return false;
        }
    }
}
