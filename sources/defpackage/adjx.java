package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.update.SystemUpdateStatus;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: adjx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adjx {
    public static final adjz a = h.a("min_data_space", (Long) 524288000L, ayow.i);
    public static final adjz b = h.a("min_cache_space", (Long) 104857600L, ayow.h);
    public static final adjz c = i.a("offpeak_download_window", "", ayoz.I);
    public static final adjz d = i.a("offpeak_download_max_trying_days", (Long) 2147483647L, ayoz.G);
    public static final adjz e = i.a("offpeak_download_operator_restricted", (Boolean) false, ayoz.H);
    public static final adjz f = i.a("zero_rate_apn_capability", "", ayoz.ad);
    public static final adjz g = i.a("mobile_network_delay", (Long) 0L, ayoz.w);
    private static final adjy h = new adjy("config.flag.download_");
    private static final adjy i = new adjy("config.flag.");

    public static final List b() {
        return amsk.a(',').a().b(amqm.b(' ')).c((CharSequence) f.a());
    }

    public static boolean c() {
        return (ayol.a.b().a() || (ayol.a.b().b() && ((Boolean) adke.h.a()).booleanValue())) && ayqi.b();
    }

    public static long a(Context context) {
        if (ayox.a.a().K()) {
            adjw.e(context);
        }
        return ((Long) g.a()).longValue() * 1000;
    }

    public static adjv a(Context context, amri amri, SystemUpdateStatus systemUpdateStatus) {
        int i2;
        amri amri2;
        long currentTimeMillis = System.currentTimeMillis();
        adkf a2 = adkf.a(context, systemUpdateStatus.n);
        if (adki.a(context, systemUpdateStatus) && !systemUpdateStatus.i) {
            return new adjv(1803, ayou.a.a().c());
        }
        if (systemUpdateStatus.k) {
            return new adjv(1547, ayou.a.a().m());
        }
        if (amrk.a((String) adke.g.a())) {
            long j = systemUpdateStatus.o;
            if (j == 0) {
                return new adjv(1291, Math.max(TimeUnit.MINUTES.toMillis(15), ayox.f()));
            }
            if (currentTimeMillis < j + ayox.f()) {
                return new adjv(1291, (ayox.f() + systemUpdateStatus.o) - currentTimeMillis);
            }
        }
        if (!adjw.d(context)) {
            int c2 = adjw.c(context);
            if (adjw.b(context)) {
                i2 = (int) ayox.a.a().g();
            } else {
                i2 = (int) ayox.a.a().f();
            }
            if (c2 >= i2) {
                if (!systemUpdateStatus.r.b && amri.a() && ((adod) amri.b()).c(context) && !systemUpdateStatus.g.a) {
                    long a3 = a(context);
                    if (a2.a == 0 && a3 > 0 && a3 + systemUpdateStatus.n > currentTimeMillis) {
                        return new adjv(2059, ayou.a.a().u());
                    }
                    if (TimeUnit.DAYS.toMillis(((Long) d.a()).longValue()) + systemUpdateStatus.n > currentTimeMillis) {
                        adkg a4 = adkg.a((String) c.a());
                        if (!a4.a()) {
                            a4 = adkg.b;
                        }
                        if (!a4.a(currentTimeMillis) && !systemUpdateStatus.g.b && a2.a != 1) {
                            return new adjv(267, a4.b(currentTimeMillis));
                        }
                        if (((Boolean) e.a()).booleanValue() && !amrk.b(((TelephonyManager) context.getSystemService("phone")).getSimOperator()).equalsIgnoreCase(gwd.i(context))) {
                            return new adjv(779, ayou.a.a().l());
                        }
                    }
                    if (!ayou.a.a().b()) {
                        adod adod = (adod) amri.b();
                        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                        if (!adod.a.a()) {
                            amri2 = amri.c(connectivityManager.getActiveNetworkInfo());
                        } else {
                            amri2 = amri.c(connectivityManager.getNetworkInfo((Network) adod.a.b()));
                        }
                        if (amri2.a() && ((NetworkInfo) amri2.b()).isRoaming()) {
                            return new adjv(2571, ayou.a.a().e());
                        }
                    }
                }
                if (!adjw.b(context)) {
                    adjw.j(context);
                }
                return new adjv(2, 0);
            }
        }
        return new adjv(2315, ayou.a.a().g());
    }

    public static boolean a() {
        return !TextUtils.isEmpty((CharSequence) f.a()) && jkr.b();
    }
}
