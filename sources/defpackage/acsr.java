package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: acsr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class acsr {
    static final hol b;
    static final hph c = new hph(b, "PLATFORM_STATS_COUNTERS", 1024);
    static final SharedPreferences d;
    public static final int[] e = {0, 1, 2};

    static {
        ihs b2 = ihs.b();
        b = new hol(b2, (String) null, (String) null);
        d = b2.getSharedPreferences("EastworldSharedPreference", 0);
    }

    public static boolean a(aucd aucd, String str, String str2, int i, aucd aucd2) {
        boolean z;
        ihs b2 = ihs.b();
        if (azoi.b()) {
            iby a = adrz.a(b2, new adry());
            acwa f = a.f(str2);
            try {
                acws.a(f, aznq.a.a().b(), TimeUnit.MILLISECONDS);
                if (!f.b() || f.d() == null || !((Boolean) f.d()).booleanValue()) {
                    if (aznq.d()) {
                        c.c(str.length() == 0 ? new String("ConsentApiOptedOut") : "ConsentApiOptedOut".concat(str)).a();
                        c.d();
                    }
                    return false;
                }
                acso.a(a, b, c, aucd, false, new ArrayList(), false, false, str, str2, i, aucd2);
                return true;
            } catch (ExecutionException | TimeoutException e2) {
                if (aznq.d()) {
                    c.c("ConsentApiEastworldFailure").a();
                    c.d();
                }
                return false;
            } catch (InterruptedException e3) {
                if (aznq.d()) {
                    c.c("ConsentApiEastworldFailure").a();
                    c.d();
                }
                Thread.currentThread().interrupt();
                return false;
            }
        } else {
            String str3 = str;
            String str4 = str2;
            boolean c2 = acub.c();
            new acro();
            List a2 = acro.a(b2);
            if (!a2.isEmpty()) {
                if (!azmy.b()) {
                    z = true;
                } else if (c2) {
                    z = true;
                }
                boolean b3 = aznh.b();
                acso.a((iby) null, b, c, aucd, z, a2, c2, b3, str, str2, i, aucd2);
                return !c2 || z || b3;
            }
            z = false;
            boolean b32 = aznh.b();
            acso.a((iby) null, b, c, aucd, z, a2, c2, b32, str, str2, i, aucd2);
            if (!c2) {
            }
        }
    }

    public abstract void a(int i, boolean z, boolean z2, aucd aucd);
}
