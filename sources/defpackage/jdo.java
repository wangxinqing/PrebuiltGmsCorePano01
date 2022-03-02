package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* renamed from: jdo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jdo implements acrx {
    private static final Callable a = jdn.a;
    private final amsv b;
    private final jcv c;

    public jdo() {
        this((jcv) null);
    }

    public final long a(String str, String str2) {
        iyg iyg = (iyg) this.b.a();
        long j = 0;
        for (int i = 0; i < iyg.a.size(); i++) {
            iyf iyf = (iyf) iyg.a.get(i);
            int i2 = iyf.a;
            if ((i2 & 4) != 0 && (i2 & 1) != 0 && iyf.b.equals(str) && (((iyf.a & 2) != 0 && "__any__".equals(iyf.c)) || ((str2 == null && (iyf.a & 2) == 0) || ((iyf.a & 2) != 0 && iyf.c.equals(str2))))) {
                j = iyf.d;
                if ((iyf.a & 2) == 0 || !"__any__".equals(iyf.c)) {
                    return j;
                }
            }
        }
        return j <= 0 ? ((Long) jcf.d.c()).longValue() : j;
    }

    public final boolean b() {
        return a() && axdp.a.b().a();
    }

    public final boolean c() {
        return awym.a.a().b();
    }

    public final boolean d() {
        return axai.b();
    }

    public final acrw f() {
        String str;
        nih b2 = nku.b();
        String str2 = null;
        if (b2 == null) {
            return null;
        }
        if ((b2.a & 4) != 0) {
            nii nii = b2.d;
            if (nii == null) {
                nii = nii.d;
            }
            str = nii.b;
        } else {
            str = null;
        }
        if ((b2.a & 1) != 0) {
            nig nig = b2.b;
            if (nig == null) {
                nig = nig.g;
            }
            str2 = nig.b;
        }
        if (str2 == null) {
            str2 = "com.google.android.gms";
        }
        return new acrw(str, str2);
    }

    public final jcv g() {
        return this.c;
    }

    public final Runnable h() {
        amlv.b("WakeLock");
        if (!axda.a.a().B()) {
            return null;
        }
        amkr a2 = amlv.a("WakeLock");
        try {
            nkg nkg = nkf.b;
            aors a3 = aors.a(a);
            nkg.a(a2, a3);
            if (a2 != null) {
                a2.close();
            }
            return a3;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public jdo(jcv jcv) {
        agvx agvx = jcf.f;
        agvx.getClass();
        this.b = amta.a(new jdm(agvx), 1, TimeUnit.HOURS);
        this.c = jcv;
    }

    public final quw e() {
        if (axai.b()) {
            return iwc.a();
        }
        return null;
    }

    public final boolean a() {
        return jkr.g() && ((Boolean) jcf.e.c()).booleanValue();
    }
}
