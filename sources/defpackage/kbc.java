package defpackage;

import android.os.SystemClock;
import com.android.volley.VolleyError;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.drive.auth.AppIdentity;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: kbc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kbc extends kaf {
    @Deprecated
    private final Boolean g;

    static {
        new ith("DeleteFileAction", "");
    }

    public kbc(kkz kkz, AppIdentity appIdentity, knc knc) {
        super(kaj.DELETE_FILE, kkz, appIdentity, knc, kbi.NORMAL);
        this.g = null;
    }

    public static int a(kkf kkf, kkz kkz, long j, boolean z) {
        kky a;
        khq a2 = khq.a(kkz);
        kkf.d();
        try {
            a = kkf.a(kkz, j);
            Iterator it = a.iterator();
            int i = 0;
            while (it.hasNext()) {
                kmp kmp = (kmp) it.next();
                if (kmp.J()) {
                    iva.a(kmp.J());
                    if (kmp.a.h.longValue() == j) {
                        a(kkf, kmp, a2, j, z);
                        i++;
                    }
                }
            }
            kkf.f();
            a.close();
            kkf.e();
            return i;
        } catch (Throwable th) {
            kkf.e();
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    public final kah b(kam kam, khq khq, kmp kmp) {
        kkf kkf = kam.a;
        kkz kkz = khq.a;
        AppIdentity appIdentity = khq.c;
        long j = kam.b;
        if (!Boolean.FALSE.equals(this.g)) {
            kba kba = new kba(kkf, this.b, khq);
            a(kmp, kam.c, (kap) kba);
            Set<kmp> a = kba.a();
            if (a.size() == 0) {
                return new kbh(kkz, appIdentity, kbi.NONE);
            }
            for (kmp kmp2 : a) {
                kmp2.a(true, j);
                kmp2.m(true);
            }
            return new kcd(khq.a, khq.c);
        }
        if ((kmp.I() == null || !a(kkf, khq, kmp)) && kmp.A()) {
            kmp.a.E = false;
            kmp.o(false);
            kmp.m(true);
        }
        b(Collections.singleton(kmp.a()));
        return new kbh(kkz, appIdentity, kbi.NONE);
    }

    public final void c(kan kan) {
        if (o().size() > 1) {
            SystemClock.sleep(((Long) jzq.aB.c()).longValue());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            kbc kbc = (kbc) obj;
            return a((kac) kbc) && ius.a(this.g, kbc.g);
        }
    }

    /* access modifiers changed from: protected */
    public final boolean g() {
        return false;
    }

    public final JSONObject h() {
        JSONObject h = super.h();
        Boolean bool = this.g;
        if (bool != null) {
            h.put("deleted", bool);
        }
        return h;
    }

    public final int hashCode() {
        return (n() * 31) + Arrays.hashCode(new Object[]{this.g});
    }

    public final String toString() {
        return String.format(Locale.US, "DeleteFileAction [%s, mLegacyDeleted=%s]", new Object[]{m(), this.g});
    }

    public kbc(kkz kkz, JSONObject jSONObject) {
        super(kaj.DELETE_FILE, kkz, jSONObject);
        this.g = jSONObject.has("deleted") ? Boolean.valueOf(jSONObject.getBoolean("deleted")) : null;
    }

    private static void a(kkf kkf, kmp kmp, khq khq, long j, boolean z) {
        iva.b(kkf.b());
        if (kmp.I() != null) {
            a(kkf, khq, kmp);
        }
        if (kmp.b(j)) {
            kmp.m(z);
        }
    }

    static boolean a(kkf kkf, khq khq, kmp kmp) {
        kmp c = kkf.c(khq, kmp.I(), kmp.X(), kmp.ai());
        if (c == null || kmp.a().equals(c.a())) {
            return false;
        }
        kmp.L();
        return true;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final void a(kan kan, ClientContext clientContext, String str) {
        lsm lsm = kan.a;
        iva.a(!Boolean.FALSE.equals(this.g), (Object) "Cannot undelete an entry on the server.");
        lnv lnv = new lnv(lsm.i.a(clientContext, 2832));
        try {
            iyu iyu = new iyu();
            StringBuilder sb = new StringBuilder();
            new Formatter(sb).format("files/%1$s", new Object[]{iyv.a(str)});
            iyu.a(sb);
            lnv.a.a(clientContext, 3, sb.toString(), (Object) null);
        } catch (VolleyError e) {
            if (lnn.a(e)) {
                lnn.a.b("ApiaryRemoteResourceAcc", "Not found, assuming already deleted", (Throwable) e);
            } else {
                lry.a(e);
                throw e;
            }
        }
        kkf kkf = lsm.d;
        kkf.d();
        try {
            kmp a = kkf.a(d(kkf), str);
            if (!a.O()) {
                boolean w = a.w();
                a.K();
                a.m(false);
                if (!w) {
                    a(kkf, this.b, kan.b, false);
                    kkf.f();
                    kkf.e();
                    lsm.p.a();
                }
            }
            kkf kkf2 = kkf;
            a(kkf2, a, khq.a(this.b), kan.b, false);
            kkz kkz = this.b;
            kaj kaj = this.a;
            long j = kan.b;
            jiq jiq = lsm.F;
            kkf.a(kkz, kaj, j, System.currentTimeMillis());
            lsm.f.d();
            kkf.f();
            kkf.e();
            lsm.p.a();
        } catch (Throwable th) {
            kkf.e();
            throw th;
        }
    }
}
