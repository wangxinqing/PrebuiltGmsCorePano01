package defpackage;

import android.content.Context;
import android.net.Network;
import android.os.RemoteException;
import com.google.android.gms.update.SystemUpdateStatus;
import com.google.android.gms.update.control.ReceiverIntentOperation;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: admr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class admr extends adlm implements adof, adnm {
    public static final adro e = new adro("dir_path", "");
    private static final iwd g = adnt.e("StreamingApplyAction");
    private static final adrg h = new adrg("network_error_attempts", 0);
    private static final adra i = new adra("post_installation", false);
    private static final adrb j = new adrb("progress", Double.valueOf(-1.0d));
    public final AtomicBoolean f;
    private final Context k;
    private final adrn l = ((adrn) adrn.a.b());
    private final adkm m = ((adkm) adkm.c.b());
    private final adkt n = ((adkt) adkt.e.b());
    private final adla o = ((adla) adla.h.b());
    private final adle p = ((adle) adle.c.b());
    private final adqw q = admx.a();
    private final adns r;
    private final adog s;
    private final AtomicBoolean t;
    private final aoqc u;
    private final AtomicReference v;
    private final AtomicReference w;

    private admr(Context context, adre adre) {
        super("streaming-apply", adre);
        adog adog;
        this.k = context;
        this.r = adns.a(context);
        if (adjx.a()) {
            adog = adoi.a(context, adjx.b(), ayou.i(), ayou.g(), ayou.h());
        } else {
            adog = adoh.a(context, ayou.g());
        }
        this.s = adog;
        this.t = new AtomicBoolean(false);
        this.u = new aoqc(((Double) a(j)).doubleValue());
        this.f = new AtomicBoolean(((Boolean) a(i)).booleanValue());
        this.v = new AtomicReference(ampu.a);
        this.w = new AtomicReference(ampu.a);
    }

    public static admr a(Context context, adre adre) {
        iva.a(adjw.a());
        iva.a(jkr.c());
        return new admr(context, adre);
    }

    private final adjv f() {
        SystemUpdateStatus d = this.o.d();
        if (!this.f.get()) {
            adjv a = adjx.a(this.k, this.s.a(), d);
            if (a.a != 2) {
                return a;
            }
        }
        return adka.a(this.k, d);
    }

    private final adll g() {
        int intValue = ((Integer) a(h)).intValue();
        adrd h2 = h();
        h2.a(h, Integer.valueOf(intValue + 1));
        adre a = h2.a();
        adma f2 = admb.f();
        f2.a(ayou.d(), ayou.e());
        f2.a(ayou.f());
        f2.a(intValue);
        f2.a("streaming-apply", a);
        return f2.b();
    }

    private final adrd h() {
        adrd b = a().b();
        b.a(j, Double.valueOf(this.u.a()));
        b.a(i, Boolean.valueOf(this.f.get()));
        return b;
    }

    private final amri i() {
        if (amrk.a(this.o.d().a)) {
            this.o.a(0, -1.0d);
            return amri.b(new adll("finished-execution", adre.a(new adrc[0])));
        } else if (adkb.a(this.q)) {
            g.c("Unable to stream a brick package. Falling back to non-streaming flow.", new Object[0]);
            return amri.b(new adll("non-streaming-download", adre.a(new adrc[0])));
        } else {
            if (ayox.b()) {
                g.c("Bypassing the self-update check.", new Object[0]);
            } else if (adkb.b(this.q)) {
                g.e("The package has already been applied; stale checkin?", new Object[0]);
                this.o.a(0, -1.0d);
                return amri.b(new adll("finished-execution", adre.a(new adrc[0])));
            }
            if (adkb.c(this.q)) {
                g.e("The package is unintentionally downgrading.", new Object[0]);
                this.o.a(530, -1.0d);
                return amri.b(new adll("finished-execution", adre.a(new adrc[0])));
            }
            try {
                adjv f2 = f();
                int i2 = f2.a;
                int i3 = 273;
                if (i2 == 2 || i2 == 273) {
                    adla adla = this.o;
                    if (this.f.get()) {
                        i3 = 529;
                    }
                    adla.a(i3, this.u.a());
                    return ampu.a;
                }
                this.o.a(i2, this.u.a());
                if (f2.a == 2059) {
                    this.p.c();
                }
                int i4 = f2.a;
                if (i4 == 2315 || i4 == 275) {
                    this.m.c();
                }
                if (f2.a == 1043) {
                    this.n.a();
                }
                admd f3 = adme.f();
                f3.a(f2.b);
                f3.a("streaming-apply", a());
                return amri.b(f3.b());
            } catch (adju e2) {
                g.e("Unable to continue due to invalid config.", e2, new Object[0]);
                this.o.a(786, -1.0d);
                return amri.b(new adll("finished-execution", adre.a(new adrc[0])));
            }
        }
    }

    public final void b() {
        amri amri = (amri) this.w.getAndSet(ampu.a);
        if (amri.a()) {
            ((admw) amri.b()).c();
        }
        this.t.set(true);
        g.b("Requesting update engine to reset.", new Object[0]);
        amri amri2 = (amri) this.v.get();
        if (amri2.a()) {
            try {
                ((adnn) amri2.b()).e();
            } catch (InterruptedException e2) {
                g.e("Reset operation interrupted.", e2, new Object[0]);
            }
        }
    }

    public final adll c() {
        adll a;
        adle adle;
        acrz acrz;
        int i2;
        this.o.a(true);
        this.m.d();
        this.n.b();
        this.p.d();
        amri i3 = i();
        if (i3.a()) {
            return (adll) i3.b();
        }
        adog adog = this.s;
        synchronized (adog.c) {
            adog.d = this;
        }
        try {
            this.s.c();
            this.r.a(admf.a(this.k, this.s));
            try {
                this.m.a();
                this.p.a();
                try {
                    amri i4 = i();
                    if (i4.a()) {
                        a = (adll) i4.b();
                    } else {
                        amri amri = (amri) this.l.b(adls.h);
                        if (amri.a()) {
                            if (!this.f.get()) {
                                admw a2 = admw.a();
                                this.w.set(amri.b(a2));
                                a2.b();
                                if (this.t.get()) {
                                    g.b("Cancelled. Will restart later.", new Object[0]);
                                    a = new adll("streaming-apply", h().a());
                                }
                            }
                            adod adod = (adod) this.s.a().c();
                            if (adod != null) {
                                adqq adqq = (adqq) amri.b();
                                long networkHandle = ((Network) adod.a.b()).getNetworkHandle();
                                adnn a3 = adnn.a();
                                a3.b();
                                try {
                                    a3.a((adnm) this);
                                    this.v.set(amri.b(a3));
                                    acrz = new acrz(this.k, 1, "streaming-apply", (String) null, "com.google.android.gms");
                                    acrz.a(false);
                                    acrz.b();
                                    try {
                                        ArrayList arrayList = new ArrayList();
                                        StringBuilder sb = new StringBuilder(31);
                                        sb.append("NETWORK_ID=");
                                        sb.append(networkHandle);
                                        arrayList.add(sb.toString());
                                        anhk i5 = admx.a(this.k).listIterator();
                                        while (i5.hasNext()) {
                                            oq oqVar = (oq) i5.next();
                                            String str = (String) oqVar.a;
                                            String str2 = (String) oqVar.b;
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
                                            sb2.append(str);
                                            sb2.append("=");
                                            sb2.append(str2);
                                            arrayList.add(sb2.toString());
                                        }
                                        if (!adki.b(this.k, this.o.d())) {
                                            arrayList.add("SWITCH_SLOT_ON_REBOOT=0");
                                        }
                                        if (this.o.d().h.d) {
                                            arrayList.add("RUN_POST_INSTALL=0");
                                        }
                                        i2 = a3.a(adqq, (List) arrayList);
                                        g.b("Update engine finished with code %d.", Integer.valueOf(i2));
                                        acrz.c();
                                        a3.c();
                                    } catch (InterruptedException e2) {
                                        g.e("Failed to stream the update.", e2, new Object[0]);
                                        acrz.c();
                                        a3.c();
                                        i2 = 1;
                                    }
                                    if (this.t.get()) {
                                        g.b("Cancelled. Will restart later.", new Object[0]);
                                        a = new adll("streaming-apply", h().a());
                                    } else if (adno.a(i2)) {
                                        File file = new File((String) a(e), "payload_metadata.bin");
                                        adrd a4 = adre.a();
                                        if (file.exists()) {
                                            a4.a(adlw.g.b(file.getAbsolutePath()));
                                        }
                                        if (adka.b(this.k)) {
                                            if (adjw.g(this.k)) {
                                                try {
                                                    ((adkt) adkt.e.b()).a(ReceiverIntentOperation.b(this.k));
                                                } catch (IOException e3) {
                                                    g.d("Reboot with resume preparation failed.", e3, new Object[0]);
                                                }
                                            }
                                        }
                                        a = new adll("ab-reboot", a4.a());
                                    } else if (i2 == 9) {
                                        this.o.a(262, this.u.a());
                                        a = g();
                                    } else {
                                        this.o.a(1042, -1.0d);
                                        a = admq.a(this.k, true);
                                    }
                                } catch (Throwable th) {
                                    a3.c();
                                    throw th;
                                }
                            } else {
                                this.o.a(262, this.u.a());
                                a = g();
                            }
                        } else {
                            adrd a5 = adre.a();
                            a5.a(admu.e.b((String) a(e)));
                            a = new adll("streaming-process-package", a5.a());
                        }
                    }
                    this.m.b();
                    adle = this.p;
                } catch (RuntimeException e4) {
                    if (e4.getCause() instanceof RemoteException) {
                        g.e("Failed to apply payload due to UpdateEngine RemoteException.", e4, new Object[0]);
                        this.o.a(1042, -1.0d);
                        a = admq.a(this.k, true);
                        this.m.b();
                        adle = this.p;
                    } else {
                        throw e4;
                    }
                }
                adle.b();
                this.s.b();
                return a;
            } catch (Throwable th2) {
                this.s.b();
                throw th2;
            }
        } catch (IOException e5) {
            g.e("Failed to request streaming network.", e5, new Object[0]);
            this.o.a(262, this.u.a());
            this.r.a(admf.a(this.k, this.s));
            return g();
        }
    }

    public final boolean d() {
        try {
            int i2 = f().a;
            if (!(i2 == 2 || i2 == 273)) {
                e();
            }
            return true;
        } catch (adju e2) {
            g.e("Unable to continue due to invalid config.", e2, new Object[0]);
            return true;
        }
    }

    public final void e() {
        if (!this.f.get() || aypa.b()) {
            amri amri = (amri) this.w.getAndSet(ampu.a);
            if (amri.a()) {
                ((admw) amri.b()).c();
            }
            this.t.set(true);
            g.b("Requesting update engine to stop.", new Object[0]);
            amri amri2 = (amri) this.v.get();
            if (amri2.a()) {
                try {
                    ((adnn) amri2.b()).d();
                } catch (InterruptedException e2) {
                    g.e("Stop operation interrupted.", e2, new Object[0]);
                }
            }
        }
    }

    public final void a(int i2, int i3, float f2) {
        int i4;
        boolean z = true;
        if (!(i2 == 5 || i2 == 6)) {
            z = false;
        }
        double d = (double) f2;
        this.u.a(d);
        this.f.set(z);
        adla adla = this.o;
        if (!z) {
            i4 = 273;
        } else {
            i4 = 529;
        }
        adla.a(i4, d);
        this.o.a(i2, i3);
    }
}
