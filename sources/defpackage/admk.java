package defpackage;

import android.content.Context;
import com.google.android.gms.update.control.ReceiverIntentOperation;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: admk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class admk extends adlm implements adnm {
    public static final adro e = new adro("file_path", "");
    private static final iwd g = adnt.e("NonStreamingAbApplyAction");
    private static final adra h = new adra("post_installation", false);
    private static final adrb i = new adrb("progress", Double.valueOf(-1.0d));
    public final Object f = new Object();
    private final adqw j = admx.a();
    private final adrn k = ((adrn) adrn.a.b());
    private final adkm l = ((adkm) adkm.c.b());
    private final adkt m = ((adkt) adkt.e.b());
    private final adla n = ((adla) adla.h.b());
    private final Context o;
    private final AtomicBoolean p = new AtomicBoolean(false);
    private final AtomicBoolean q = new AtomicBoolean(((Boolean) a(h)).booleanValue());
    private final aoqc r = new aoqc(((Double) a(i)).doubleValue());
    private adnn s;

    public admk(String str, Context context, adre adre) {
        super(str, adre);
        this.o = context;
    }

    private final adnn e() {
        adnn adnn;
        synchronized (this.f) {
            adnn = this.s;
        }
        return adnn;
    }

    public final void a(int i2, int i3, float f2) {
        int i4;
        boolean z = true;
        if (!(i2 == 5 || i2 == 6)) {
            z = false;
        }
        double d = (double) f2;
        this.r.a(d);
        this.q.set(z);
        adla adla = this.n;
        if (!z) {
            i4 = 273;
        } else {
            i4 = 529;
        }
        adla.a(i4, d);
        this.n.a(i2, i3);
    }

    public final void b() {
        g.b("Requesting update engine to reset.", new Object[0]);
        this.p.set(true);
        adnn e2 = e();
        if (e2 != null) {
            try {
                e2.e();
            } catch (InterruptedException e3) {
                g.e("Reset operation interrupted.", e3, new Object[0]);
            }
        }
    }

    public final adll c() {
        adll adll;
        acrz acrz;
        this.l.d();
        this.m.b();
        this.l.a();
        try {
            adjv a = adka.a(this.o, this.n.d());
            try {
                this.n.a(a.a, this.r.a());
                int i2 = a.a;
                if (i2 != 273) {
                    if (i2 == 275) {
                        this.l.c();
                    }
                    if (a.a == 1043) {
                        this.m.a();
                    }
                    admd f2 = adme.f();
                    f2.a(a.b);
                    f2.a("non-streaming-ab-apply", a());
                    adll = f2.b();
                } else if (adkb.a(this.j)) {
                    adrd a2 = adre.a();
                    a2.a(adlw.f.b((String) a(e)));
                    adll = new adll("ab-reboot", a2.a());
                } else {
                    if (ayox.b()) {
                        g.c("Bypassing the self-update check.", new Object[0]);
                    } else if (adkb.b(this.j)) {
                        g.e("The package has already been applied; stale checkin?", new Object[0]);
                        this.n.a(0, -1.0d);
                        adll = new adll("finished-execution", adre.a(new adrc[0]));
                    }
                    if (adkb.c(this.j)) {
                        g.e("The package is unintentionally downgrading.", new Object[0]);
                        this.n.a(530, -1.0d);
                        adll = new adll("finished-execution", adre.a(new adrc[0]));
                    } else {
                        amri amri = (amri) this.k.b(adls.h);
                        if (!amri.a()) {
                            adrd a3 = adre.a();
                            a3.a(admm.e.b((String) a(e)));
                            adll = new adll("non-streaming-process-package", a3.a());
                        } else {
                            try {
                                ArrayList arrayList = new ArrayList();
                                if (!adki.b(this.o, this.n.d())) {
                                    arrayList.add("SWITCH_SLOT_ON_REBOOT=0");
                                }
                                if (this.n.d().h.d) {
                                    arrayList.add("RUN_POST_INSTALL=0");
                                }
                                adqq adqq = (adqq) amri.b();
                                adnn a4 = adnn.a();
                                a4.a((adnm) this);
                                a4.b();
                                try {
                                    synchronized (this.f) {
                                        this.s = a4;
                                    }
                                    acrz = new acrz(this.o, 1, "non-streaming-ab-apply", (String) null, "com.google.android.gms");
                                    acrz.a(false);
                                    acrz.b();
                                    int a5 = a4.a(adqq, (List) arrayList);
                                    acrz.c();
                                    a4.c();
                                    if (this.p.get()) {
                                        adrd b = a().b();
                                        b.a(i, Double.valueOf(this.r.a()));
                                        b.a(h, Boolean.valueOf(this.q.get()));
                                        adll = new adll("non-streaming-ab-apply", b.a());
                                    } else if (!adno.a(a5)) {
                                        g.e("Installation failed with error code: %d.", Integer.valueOf(a5));
                                        this.n.a(1042, -1.0d);
                                        adll = admq.a(this.o, false);
                                    } else {
                                        String str = (String) a(e);
                                        admx.a(str, jlh.a(new File(str).getParent()));
                                        if (adka.b(this.o)) {
                                            if (adjw.g(this.o)) {
                                                try {
                                                    ((adkt) adkt.e.b()).a(ReceiverIntentOperation.b(this.o));
                                                } catch (IOException e2) {
                                                    g.d("Reboot with resume preparation failed.", e2, new Object[0]);
                                                }
                                            }
                                        }
                                        adll = new adll("ab-reboot", adre.a(new adrc[0]));
                                    }
                                } catch (Throwable th) {
                                    a4.c();
                                    throw th;
                                }
                            } catch (InterruptedException e3) {
                                g.e("Installation interrupted.", e3, new Object[0]);
                                this.n.a(1042, -1.0d);
                                adll = admq.a(this.o, false);
                            }
                        }
                    }
                }
            } catch (IOException e4) {
                g.e("Unable to extract the care_map file.", e4, new Object[0]);
            } catch (Throwable th2) {
                this.l.b();
                throw th2;
            }
        } catch (adju e5) {
            g.e("Unable to continue due to invalid config.", e5, new Object[0]);
            this.n.a(786, this.r.a());
            adll = new adll("finished-execution", adre.a(new adrc[0]));
        }
        this.l.b();
        return adll;
    }

    public final boolean d() {
        try {
            if (adka.a(this.o, this.n.d()).a != 273 && (!this.q.get() || aypa.b())) {
                g.b("Requesting update engine to stop.", new Object[0]);
                this.p.set(true);
                adnn e2 = e();
                if (e2 != null) {
                    try {
                        e2.d();
                    } catch (InterruptedException e3) {
                        g.e("Stop operation interrupted.", e3, new Object[0]);
                    }
                }
            }
            return true;
        } catch (adju e4) {
            g.e("Invalid config.", e4, new Object[0]);
            return true;
        }
    }
}
