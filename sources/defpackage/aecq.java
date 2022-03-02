package defpackage;

import android.accounts.Account;
import android.app.StatsManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.udc.UdcCacheRequest;
import com.google.android.gms.udc.UdcCacheResponse;
import com.google.android.gms.westworld.FetchOperation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aecq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aecq {
    protected static hol a;
    public static hol b;
    public static hol c;
    public static hol d;
    protected static hol e;
    protected static hol f;
    protected static hol g;
    protected static hph h;
    protected static agqu i;
    private static adsa j = null;

    static long a(bca bca) {
        long j2;
        long j3 = 1;
        if (azui.b()) {
            j2 = !bca.f ? 0 : 1;
        } else {
            j2 = 0;
        }
        long j4 = j2 + j2;
        if (azwf.b()) {
            if (!bca.e) {
                j3 = 0;
            }
            j4 += j3;
        }
        bbx a2 = bbx.a(bca.d);
        if (a2 == null) {
            a2 = bbx.UNKNOWN_PERIOD;
        }
        int i2 = a2.g;
        avsd a3 = avsd.a(bca.c);
        if (a3 == null) {
            a3 = avsd.DEFAULT;
        }
        int i3 = a3.f;
        int a4 = bbr.a(bca.b);
        if (a4 == 0) {
            a4 = 1;
        }
        return azws.f() + (((((j4 << 4) + ((long) i2)) << 4) + ((long) i3)) << 4) + ((long) (a4 - 1));
    }

    public static int b(long j2) {
        int a2 = bbr.a((int) ((j2 - azws.f()) & 15));
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    static SharedPreferences c(Context context) {
        return context.getSharedPreferences("com.google.android.westworld", 0);
    }

    public static SharedPreferences d(Context context) {
        return context.getSharedPreferences("westworld.statsd", 0);
    }

    public static hol e(Context context) {
        if (a == null) {
            a = new hol(context, azwv.m(), (String) null);
        }
        return a;
    }

    public static hph f(Context context) {
        hph hph = h;
        if (hph != null) {
            return hph;
        }
        hph hph2 = new hph(e(context), azwv.f(), 100);
        h = hph2;
        return hph2;
    }

    public static synchronized void g(Context context) {
        synchronized (aecq.class) {
            yey a2 = yef.a(context);
            acwa a3 = a2.a("com.google.android.westworld", 1, new String[]{azwv.m(), azwv.l(), azvq.b(), azwv.o(), azwv.f()}, new int[0]);
            try {
                acws.a(a3, azwv.a.a().p(), TimeUnit.MILLISECONDS);
                if (a3.b()) {
                    new aecn(a2, "com.google.android.westworld", context).a("");
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            }
        }
    }

    static boolean b(Context context) {
        try {
            acwa o = adrz.b(context).o();
            ick ick = (ick) acws.a(o, azwv.c(), TimeUnit.MILLISECONDS);
            if (!o.b() || ick == null) {
                return false;
            }
            if (azvk.a.a().a()) {
                if (aecp.a(context)) {
                    return false;
                }
            }
            return ick.p();
        } catch (ExecutionException | TimeoutException e2) {
            return false;
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public static adsa a() {
        if (j == null) {
            j = new aeco();
        }
        return j;
    }

    public static aupy a(Context context) {
        aupy aupy;
        aupy aupy2;
        aucd o = aupy.h.o();
        aupw aupw = (aupw) aupx.b.o();
        if (azwv.a.a().r() && azva.a.a().a()) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            aupy aupy3 = (aupy) o.b;
            aupy3.a |= 16;
            aupy3.e = true;
        }
        if (azuo.a.a().a() && aecp.a(context)) {
            return (aupy) o.i();
        }
        boolean b2 = b(context);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aupy aupy4 = (aupy) o.b;
        aupy4.a |= 2;
        aupy4.b = b2;
        List<Account> d2 = jgu.d(context, context.getPackageName());
        if (azux.b() || (jkr.h() && azwv.h())) {
            ArrayList arrayList = new ArrayList();
            boolean b3 = azwi.b();
            if (d2 != null) {
                for (Account account : d2) {
                    if (b3) {
                        aupy = a(context, account);
                    } else {
                        aupy = a(context, account.name);
                    }
                    if (aupy.c && (!azvn.b() || !aecp.a(context))) {
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        aupy aupy5 = (aupy) o.b;
                        aupy5.a |= 4;
                        aupy5.c = true;
                        if (!aupy.d || azux.b()) {
                            arrayList.add(account.name);
                        } else {
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            aupy aupy6 = (aupy) o.b;
                            aupy6.a |= 8;
                            aupy6.d = true;
                            aupw.a(account.name);
                        }
                    }
                }
            }
            if (((aupx) aupw.b).a.size() == 0 && !arrayList.isEmpty()) {
                if (aupw.c) {
                    aupw.c();
                    aupw.c = false;
                }
                aupx aupx = (aupx) aupw.b;
                aupx.c();
                auab.a((Iterable) arrayList, (List) aupx.a);
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aupy aupy7 = (aupy) o.b;
                aupy7.a |= 8;
                aupy7.d = false;
            }
            if (o.c) {
                o.c();
                o.c = false;
            }
            aupy aupy8 = (aupy) o.b;
            aupx aupx2 = (aupx) aupw.i();
            aupx2.getClass();
            aupy8.g = aupx2;
            aupy8.a |= 64;
            return (aupy) o.i();
        }
        if (d2 != null) {
            boolean b4 = azwi.b();
            for (Account account2 : d2) {
                if (b4) {
                    aupy2 = a(context, account2);
                } else {
                    aupy2 = a(context, account2.name);
                }
                if (aupy2.c && aupy2.d) {
                    if (!azvn.b() || !aecp.a(context)) {
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        aupy aupy9 = (aupy) o.b;
                        int i2 = aupy9.a | 4;
                        aupy9.a = i2;
                        aupy9.c = true;
                        aupy9.a = i2 | 8;
                        aupy9.d = true;
                    }
                    aupw.a(account2.name);
                }
            }
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        aupy aupy10 = (aupy) o.b;
        aupx aupx3 = (aupx) aupw.i();
        aupx3.getClass();
        aupy10.g = aupx3;
        aupy10.a |= 64;
        return (aupy) o.i();
    }

    public static boolean b(aupy aupy, iby iby) {
        if (iby == null) {
            return aupy.e || aupy.b || (aupy.c && ((azux.b() && aupy.b) || ((azwv.h() && jkr.h()) || (!azux.b() && aupy.d))));
        } else if (!azwv.h() || !jkr.h()) {
            return a(iby, azwv.m());
        } else {
            return a(iby, azwv.n());
        }
    }

    private static aupy a(Context context, Account account) {
        if (i == null) {
            agqw agqw = new agqw();
            agqw.a(context);
            agqw.b("gmscorewestworldfacsid");
            i = agqw.a();
        }
        agqt a2 = i.a(account);
        try {
            boolean booleanValue = ((Boolean) a2.a(4).get(15, TimeUnit.SECONDS)).booleanValue();
            boolean booleanValue2 = ((Boolean) a2.a(5).get(15, TimeUnit.SECONDS)).booleanValue();
            aucd o = aupy.h.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aupy aupy = (aupy) o.b;
            int i2 = 4 | aupy.a;
            aupy.a = i2;
            aupy.c = booleanValue;
            aupy.a = i2 | 8;
            aupy.d = booleanValue2;
            return (aupy) o.i();
        } catch (ExecutionException | TimeoutException e2) {
            return aupy.h;
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            return aupy.h;
        }
    }

    static aupy a(Context context, String str) {
        int[] iArr;
        if (azux.b()) {
            iArr = new int[]{8, 10};
        } else {
            iArr = new int[]{7, 8, 10, 9};
        }
        try {
            acwa a2 = acyr.a(context, new acyq(str)).a(new UdcCacheRequest(iArr));
            UdcCacheResponse udcCacheResponse = (UdcCacheResponse) acws.a(a2, azwv.c(), TimeUnit.MILLISECONDS);
            if (a2.b()) {
                if (udcCacheResponse != null) {
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                    boolean z4 = false;
                    for (UdcCacheResponse.UdcSetting udcSetting : udcCacheResponse.a) {
                        int i2 = udcSetting.a;
                        if (i2 == 8) {
                            z3 = udcSetting.b == 2;
                        }
                        if (i2 == 10) {
                            z4 = udcSetting.b == 2;
                        }
                        if (i2 == 7) {
                            z = udcSetting.b == 2;
                        }
                        if (i2 == 9) {
                            z2 = udcSetting.b == 2;
                        }
                    }
                    aucd o = aupy.h.o();
                    if (z && z2) {
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        aupy aupy = (aupy) o.b;
                        aupy.a |= 8;
                        aupy.d = true;
                    }
                    if (z3) {
                        if (z4) {
                            if (o.c) {
                                o.c();
                                o.c = false;
                            }
                            aupy aupy2 = (aupy) o.b;
                            aupy2.a = 4 | aupy2.a;
                            aupy2.c = true;
                        }
                    }
                    return (aupy) o.i();
                }
            }
        } catch (ExecutionException | TimeoutException e2) {
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
        }
        return aupy.h;
    }

    public static bbx a(long j2) {
        return bbx.a((int) (((j2 - azws.f()) >> 8) & 15));
    }

    public static void a(long j2, Context context) {
        StatsManager statsManager = (StatsManager) context.getSystemService("stats");
        if (statsManager != null) {
            a(statsManager, j2, context);
        }
    }

    static synchronized void a(StatsManager statsManager, long j2, Context context) {
        synchronized (aecq.class) {
            Intent intent = new Intent("com.android.server.stats.action.TRIGGER_COLLECTION");
            int i2 = 0;
            if (jkr.h()) {
                intent.putExtra("FETCH_CONFIG_ID", j2);
                if (j2 != azws.f()) {
                    i2 = (int) (j2 % 2147483647L);
                }
            }
            try {
                statsManager.setFetchReportsOperation(IntentOperation.getPendingIntent(context, FetchOperation.class, intent, i2, 134217728), j2);
            } catch (StatsManager.StatsUnavailableException e2) {
            }
        }
    }

    public static void a(aucd aucd, avsd avsd) {
        iby a2 = adrz.a(ihs.b(), new adry());
        acwa f2 = a2.f(azwv.b());
        try {
            acws.a(f2, azwv.c(), TimeUnit.MILLISECONDS);
            if (f2.b() && f2.d() != null && ((Boolean) f2.d()).booleanValue()) {
                a2.a(azwv.b(), ((auqa) aucd.i()).k(), a(), avsd.f);
            }
        } catch (ExecutionException | TimeoutException e2) {
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
        }
    }

    private static void a(aucd aucd, boolean z, int i2) {
        auay auay;
        SharedPreferences d2 = d(ihs.b());
        try {
            bcp bcp = (bcp) aucj.a((aucj) bcp.b, Base64.decode(d2.getString("log_metadata", ""), 0));
            aucd aucd2 = (aucd) bcp.c(5);
            aucd2.a((aucj) bcp);
            aucd o = bco.g.o();
            auqa auqa = (auqa) aucd.b;
            if (auqa.b == 1) {
                auay = (auay) auqa.c;
            } else {
                auay = auay.b;
            }
            int a2 = auay.a();
            if (o.c) {
                o.c();
                o.c = false;
            }
            bco bco = (bco) o.b;
            int i3 = bco.a | 4;
            bco.a = i3;
            bco.d = a2;
            int i4 = i3 | 8;
            bco.a = i4;
            bco.e = z;
            bco.a = i4 | 16;
            bco.f = i2;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (o.c) {
                o.c();
                o.c = false;
            }
            bco bco2 = (bco) o.b;
            bco2.a |= 1;
            bco2.b = elapsedRealtime;
            long currentTimeMillis = System.currentTimeMillis();
            if (o.c) {
                o.c();
                o.c = false;
            }
            bco bco3 = (bco) o.b;
            bco3.a |= 2;
            bco3.c = currentTimeMillis;
            if (aucd2.c) {
                aucd2.c();
                aucd2.c = false;
            }
            bcp bcp2 = (bcp) aucd2.b;
            bco bco4 = (bco) o.i();
            bco4.getClass();
            bcp2.a();
            bcp2.a.add(0, bco4);
            if (((bcp) aucd2.b).a.size() > ((int) azwv.k())) {
                int k = (int) azwv.k();
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                bcp bcp3 = (bcp) aucd2.b;
                bcp3.a();
                bcp3.a.remove(k);
            }
            bcp bcp4 = (bcp) aucd2.i();
            d2.edit().putString("log_metadata", Base64.encodeToString(bcp4.k(), 0)).apply();
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            auqa auqa2 = (auqa) aucd.b;
            auqa auqa3 = auqa.g;
            bcp4.getClass();
            auqa2.e = bcp4;
            auqa2.a |= 128;
        } catch (auda e2) {
        }
    }

    static void a(hol hol, hoi hoi, hph hph) {
        if (a(hol.g, hph)) {
            hoi.a(a(hph));
        }
    }

    public static void a(iby iby, hol hol, aupy aupy, hph hph, aucd aucd) {
        a(iby, hol, aupy, hph, aucd, avsd.a((int) azvz.b()));
    }

    public static void a(iby iby, hol hol, aupy aupy, hph hph, aucd aucd, avsd avsd) {
        if (iby == null) {
            aucd a2 = aupy.h.a((aucj) aupy);
            if (a2.c) {
                a2.c();
                a2.c = false;
            }
            aupy aupy2 = (aupy) a2.b;
            aupy2.g = null;
            aupy2.a &= -65;
            if (azui.b() && hol.k) {
                if (a2.c) {
                    a2.c();
                    a2.c = false;
                }
                aupy aupy3 = (aupy) a2.b;
                aupy3.a |= 32;
                aupy3.f = 0;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                auqa auqa = (auqa) aucd.b;
                aupy aupy4 = (aupy) a2.i();
                auqa auqa2 = auqa.g;
                aupy4.getClass();
                auqa.d = aupy4;
                auqa.a |= 64;
                hoi a3 = hol.a(((auqa) aucd.i()).k());
                a3.f = avsd;
                a3.b();
                return;
            }
            aupx aupx = aupy.g;
            if (aupx == null) {
                aupx = aupx.b;
            }
            if (aupx.a.size() <= 0 || !aupy.c || ((azux.b() || !aupy.d) && ((!azux.b() || !aupy.b) && (!azwv.h() || !azwv.n().equals(hol.g))))) {
                hph.c("UploadByZwieback").a();
                if (azwv.j() && ((auqa) aucd.b).b == 1) {
                    a(aucd, true, 0);
                }
                if (a2.c) {
                    a2.c();
                    a2.c = false;
                }
                aupy aupy5 = (aupy) a2.b;
                aupy5.a |= 32;
                aupy5.f = 0;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                auqa auqa3 = (auqa) aucd.b;
                aupy aupy6 = (aupy) a2.i();
                auqa auqa4 = auqa.g;
                aupy6.getClass();
                auqa3.d = aupy6;
                auqa3.a |= 64;
                hoi a4 = hol.a(((auqa) aucd.i()).k());
                a4.f = avsd;
                a(hol, a4, hph);
                a4.b();
                return;
            }
            hph.c("UploadbyAccount").a();
            aupx aupx2 = aupy.g;
            if (aupx2 == null) {
                aupx2 = aupx.b;
            }
            ArrayList arrayList = new ArrayList(aupx2.a);
            Collections.sort(arrayList);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (azwv.j() && ((auqa) aucd.b).b == 1) {
                    a(aucd, false, i2);
                }
                if (a2.c) {
                    a2.c();
                    a2.c = false;
                }
                aupy aupy7 = (aupy) a2.b;
                aupy7.a |= 32;
                aupy7.f = i2;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                auqa auqa5 = (auqa) aucd.b;
                aupy aupy8 = (aupy) a2.i();
                auqa auqa6 = auqa.g;
                aupy8.getClass();
                auqa5.d = aupy8;
                auqa5.a |= 64;
                hoi a5 = hol.a(((auqa) aucd.i()).k());
                a5.c((String) arrayList.get(i2));
                a5.f = avsd;
                a(hol, a5, hph);
                a5.b();
            }
        } else if (a(hol.g, hph)) {
            iby.a(hol.g, ((auqa) aucd.i()).k(), a(hph), avsd.f);
        } else {
            iby.a(hol.g, ((auqa) aucd.i()).k(), a(), avsd.f);
        }
    }

    public static boolean a(long j2, int i2) {
        int b2 = b(j2);
        boolean z = i2 == 3 || (azux.b() && i2 == 4);
        if (b2 != i2 && (b2 != 1 || !z)) {
            return false;
        }
        return true;
    }

    public static boolean a(aupy aupy, iby iby) {
        return azwv.i() && azuo.a.a().c() && b(aupy, iby);
    }

    public static boolean a(aupy aupy, iby iby, String str) {
        if (iby != null) {
            return a(iby, str);
        }
        return aupy.e || (!azux.b() ? !(!aupy.c || !aupy.d) : !(!aupy.c || !aupy.b));
    }

    public static boolean a(iby iby, String str) {
        acwa f2 = iby.f(str);
        try {
            acws.a(f2, azwv.c(), TimeUnit.MILLISECONDS);
            if (!f2.b() || f2.d() == null || !((Boolean) f2.d()).booleanValue()) {
                return false;
            }
            return true;
        } catch (ExecutionException | TimeoutException e2) {
            return false;
        } catch (InterruptedException e3) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    static boolean a(String str, hph hph) {
        if (!jkr.h()) {
            return false;
        }
        SharedPreferences c2 = c(ihs.b());
        String valueOf = String.valueOf(str);
        try {
            return c2.getBoolean(valueOf.length() == 0 ? new String("clearcut_add_external_ids_log_source_") : "clearcut_add_external_ids_log_source_".concat(valueOf), false);
        } catch (ClassCastException e2) {
            hph.c("ClassCastException").a();
            return false;
        }
    }

    static int[] a(hph hph) {
        try {
            long[] registeredExperimentIds = ((StatsManager) ihs.b().getSystemService("stats")).getRegisteredExperimentIds();
            if (registeredExperimentIds == null) {
                hph.c("NullExperimentsList").a();
                return new int[0];
            }
            int length = registeredExperimentIds.length;
            if (length != 0) {
                hph.c("NonEmptyExperimentsList").a();
            } else {
                hph.c("EmptyExperimentsList").a();
            }
            int[] iArr = new int[length];
            for (int i2 = 0; i2 < registeredExperimentIds.length; i2++) {
                iArr[i2] = (int) registeredExperimentIds[i2];
            }
            return iArr;
        } catch (StatsManager.StatsUnavailableException e2) {
            hph.c("StatsManagerError").a();
            return new int[0];
        }
    }
}
