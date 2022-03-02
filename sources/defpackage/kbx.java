package defpackage;

import android.os.SystemClock;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.auth.AppIdentity;
import com.google.android.gms.drive.internal.model.File;
import java.util.Formatter;
import java.util.Locale;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: kbx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kbx extends kaf {
    public static final /* synthetic */ int h = 0;
    private static final ith i = new ith("SetTrashedAction", "");
    public final kpy g;
    private final long j = ((Long) jzq.aB.c()).longValue();

    public kbx(kkz kkz, AppIdentity appIdentity, knc knc, kpy kpy) {
        super(kaj.TRASH, kkz, appIdentity, knc, kbi.NORMAL);
        boolean z = true;
        if (!kpy.a() && !kpy.b()) {
            z = false;
        }
        iva.b(z);
        this.g = kpy;
    }

    private static void a(kkf kkf, long j2, kmp kmp, kpy kpy) {
        knl a = lrt.a(kkf, kmp);
        lrt.a(kmp, a, kpy, j2);
        kmp.m(true);
        a.t();
    }

    /* access modifiers changed from: protected */
    public final kah b(kam kam, khq khq, kmp kmp) {
        kkf kkf = kam.a;
        long j2 = kam.b;
        kkz kkz = khq.a;
        AppIdentity appIdentity = khq.c;
        kbv kbv = new kbv(this, kkf, kkz, khq);
        a(kmp, kam.c, (kap) kbv);
        Set<kmp> a = kbv.a();
        if (a.size() == 0) {
            return new kbh(kkz, appIdentity, kbi.NONE);
        }
        if (this.g.b()) {
            for (kmp a2 : a) {
                a(kkf, j2, a2, this.g);
            }
        } else {
            knc a3 = kmp.a();
            for (kmp kmp2 : a) {
                if (!kmp2.a().equals(a3)) {
                    a(kkf, j2, kmp2, kpy.IMPLICITLY_TRASHED);
                }
            }
            a(kkf, j2, kmp, this.g);
        }
        return new kcj(kkz, appIdentity, kmp.a());
    }

    public final void c(kan kan) {
        try {
            if (!e(kan.a.d).w()) {
                return;
            }
        } catch (kcs e) {
            return;
        } catch (kcm e2) {
            i.b("SetTrashedAction", "App has no longer access, so sleeping just in case", (Throwable) e2);
        }
        SystemClock.sleep(this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            kbx kbx = (kbx) obj;
            return a((kac) kbx) && this.g.equals(kbx.g);
        }
    }

    public final JSONObject h() {
        JSONObject h2 = super.h();
        h2.put("trashedState", this.g.d);
        return h2;
    }

    public final int hashCode() {
        return (n() * 31) + this.g.hashCode();
    }

    public final String toString() {
        return String.format(Locale.US, "SetTrashedAction [%s, mTrashedState=%s]", new Object[]{m(), this.g});
    }

    /* access modifiers changed from: protected */
    public final void a(kan kan, ClientContext clientContext, String str) {
        lnl lnl;
        kan kan2 = kan;
        ClientContext clientContext2 = clientContext;
        lsm lsm = kan2.a;
        kkf kkf = lsm.d;
        String str2 = d(kkf).b;
        long j2 = kan2.b;
        if (!kpy.IMPLICITLY_TRASHED.equals(this.g)) {
            if (this.g.a()) {
                lnv lnv = new lnv(lsm.i.a(clientContext2, 2830));
                try {
                    iyu iyu = new iyu();
                    iyu.a(lnn.a(File.class, lnn.a(clientContext)));
                    StringBuilder sb = new StringBuilder();
                    new Formatter(sb).format("files/%1$s/trash", new Object[]{iyv.a(str)});
                    iyu.a(sb);
                    ClientContext clientContext3 = clientContext;
                    lnl = new lnl((File) lnv.a.a(clientContext3, 1, sb.toString(), (Object) null, File.class), clientContext2, (String) null);
                } catch (VolleyError e) {
                    lry.a(e);
                    throw e;
                }
            } else {
                lnv lnv2 = new lnv(lsm.i.a(clientContext2, 2831));
                try {
                    iyu iyu2 = new iyu();
                    iyu2.a(lnn.a(File.class, lnn.a(clientContext)));
                    StringBuilder sb2 = new StringBuilder();
                    new Formatter(sb2).format("files/%1$s/untrash", new Object[]{iyv.a(str)});
                    iyu2.a(sb2);
                    ClientContext clientContext4 = clientContext;
                    lnl = new lnl((File) lnv2.a.a(clientContext4, 1, sb2.toString(), (Object) null, File.class), clientContext2, (String) null);
                } catch (VolleyError e2) {
                    lry.a(e2);
                    throw e2;
                }
            }
            kkf.d();
            try {
                kmp e3 = e(kkf);
                if (e3 != null && !e3.O()) {
                    kju.a(kkf, (lnj) lnl, e3, str2);
                    e3.n(false);
                    if (!e3.w()) {
                        lrt.b(kkf, this.b, j2, false);
                        kkf.f();
                    }
                }
                kkz kkz = this.b;
                kaj kaj = this.a;
                jiq jiq = lsm.F;
                kkf.a(kkz, kaj, j2, System.currentTimeMillis());
                lsm.f.d();
                kkf.f();
            } finally {
                kkf.e();
            }
        } else {
            throw new IllegalStateException("Cannot apply an implicit trash action on the server");
        }
    }

    public kbx(kkz kkz, JSONObject jSONObject) {
        super(kaj.TRASH, kkz, jSONObject);
        kpy a = kpy.a(jSONObject.getLong("trashedState"));
        this.g = a;
        boolean z = true;
        if (!a.a() && !this.g.b()) {
            z = false;
        }
        iva.b(z);
    }
}
