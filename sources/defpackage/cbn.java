package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.util.Set;

/* renamed from: cbn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cbn {
    private static atov a(Context context, String str) {
        aucd o = atov.f.o();
        if (!TextUtils.isEmpty(str)) {
            if (o.c) {
                o.c();
                o.c = false;
            }
            atov atov = (atov) o.b;
            str.getClass();
            atov.a |= 1;
            atov.b = str;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 64);
            if (packageInfo == null) {
                ((anih) ((anih) bxk.a.b()).a("cbn", "a", 94, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[NetworkUtil] Null package info for %s", (Object) str);
                return (atov) o.i();
            }
            if (!TextUtils.isEmpty(packageInfo.versionName)) {
                String str2 = packageInfo.versionName;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atov atov2 = (atov) o.b;
                str2.getClass();
                atov2.a |= 2;
                atov2.c = str2;
            }
            long j = (long) packageInfo.versionCode;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atov atov3 = (atov) o.b;
            atov3.a |= 4;
            atov3.d = j;
            String a = jhg.a(packageInfo);
            if (a != null) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                atov atov4 = (atov) o.b;
                a.getClass();
                atov4.a |= 8;
                atov4.e = a;
            }
            return (atov) o.i();
        } catch (PackageManager.NameNotFoundException e) {
            anih anih = (anih) bxk.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("cbn", "a", 90, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[NetworkUtil] Failed to find package info for %s", (Object) str);
            return (atov) o.i();
        }
    }

    private static atpr a(bsz bsz) {
        atpq atpq = (atpq) atpr.b.o();
        if (awuz.a.a().ax()) {
            return (atpr) atpq.i();
        }
        Set<Integer> a = cbi.s().a(bsz, 2);
        if (a == null || a.isEmpty()) {
            ((anih) ((anih) bxk.a.b()).a("cbn", "a", 163, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[NetworkUtil] No active synchronizable contexts.");
            return (atpr) atpq.i();
        }
        for (Integer intValue : a) {
            int intValue2 = intValue.intValue();
            aucd o = atpx.d.o();
            atjv b = jtj.b(intValue2);
            if (o.c) {
                o.c();
                o.c = false;
            }
            atpx atpx = (atpx) o.b;
            atpx.b = b.bA;
            atpx.a |= 1;
            long j = cbi.j().a.getLong(cjv.a(intValue2), 0);
            if (o.c) {
                o.c();
                o.c = false;
            }
            atpx atpx2 = (atpx) o.b;
            atpx2.a |= 2;
            atpx2.c = j;
            atpq.a(o);
        }
        return (atpr) atpq.i();
    }

    public static atqj a(Context context, bsz bsz) {
        atov atov;
        atpr atpr;
        iva.a((Object) bsz);
        aucd o = atqj.j.o();
        aucd o2 = atov.f.o();
        if (!TextUtils.isEmpty("com.google.android.gms")) {
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atov atov2 = (atov) o2.b;
            "com.google.android.gms".getClass();
            atov2.a |= 1;
            atov2.b = "com.google.android.gms";
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            if (packageInfo == null) {
                ((anih) ((anih) bxk.a.b()).a("cbn", "a", 94, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[NetworkUtil] Null package info for %s", (Object) "com.google.android.gms");
                atov = (atov) o2.i();
            } else {
                if (!TextUtils.isEmpty(packageInfo.versionName)) {
                    String str = packageInfo.versionName;
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    atov atov3 = (atov) o2.b;
                    str.getClass();
                    atov3.a |= 2;
                    atov3.c = str;
                }
                long j = (long) packageInfo.versionCode;
                if (o2.c) {
                    o2.c();
                    o2.c = false;
                }
                atov atov4 = (atov) o2.b;
                atov4.a |= 4;
                atov4.d = j;
                String a = jhg.a(packageInfo);
                if (a != null) {
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    atov atov5 = (atov) o2.b;
                    a.getClass();
                    atov5.a |= 8;
                    atov5.e = a;
                }
                atov = (atov) o2.i();
            }
        } catch (PackageManager.NameNotFoundException e) {
            anih anih = (anih) bxk.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("cbn", "a", 90, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[NetworkUtil] Failed to find package info for %s", (Object) "com.google.android.gms");
            atov = (atov) o2.i();
        }
        if (o.c) {
            o.c();
            o.c = false;
        }
        atqj atqj = (atqj) o.b;
        atov.getClass();
        atqj.b = atov;
        atqj.a |= 1;
        aucd o3 = atov.f.o();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        atov atov6 = (atov) o3.b;
        "com.google.android.gms".getClass();
        atov6.a |= 1;
        atov6.b = "com.google.android.gms";
        String a2 = jlo.a();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        atov atov7 = (atov) o3.b;
        a2.getClass();
        atov7.a |= 2;
        atov7.c = a2;
        long b = (long) jlo.b();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        atov atov8 = (atov) o3.b;
        atov8.a |= 4;
        atov8.d = b;
        atov atov9 = (atov) o3.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atqj atqj2 = (atqj) o.b;
        atov9.getClass();
        atqj2.c = atov9;
        atqj2.a |= 2;
        String c = cbi.c();
        int d = cbi.d();
        aucd o4 = atov.f.o();
        if (!TextUtils.isEmpty(c)) {
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            atov atov10 = (atov) o4.b;
            c.getClass();
            atov10.a |= 1;
            atov10.b = c;
        }
        if (d != -1) {
            long j2 = (long) d;
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            atov atov11 = (atov) o4.b;
            atov11.a |= 4;
            atov11.d = j2;
        }
        atov atov12 = (atov) o4.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atqj atqj3 = (atqj) o.b;
        atov12.getClass();
        atqj3.h = atov12;
        atqj3.a |= 64;
        long a3 = cbi.i().a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atqj atqj4 = (atqj) o.b;
        atqj4.a |= 4;
        atqj4.d = a3;
        String str2 = cbi.v().a(bsz, false).a.b;
        if (o.c) {
            o.c();
            o.c = false;
        }
        atqj atqj5 = (atqj) o.b;
        str2.getClass();
        atqj5.a |= 8;
        atqj5.e = str2;
        aucd o5 = atoz.g.o();
        if (o5.c) {
            o5.c();
            o5.c = false;
        }
        atoz atoz = (atoz) o5.b;
        atoz.d = 1;
        atoz.a |= 4;
        String str3 = Build.MANUFACTURER;
        if (o5.c) {
            o5.c();
            o5.c = false;
        }
        atoz atoz2 = (atoz) o5.b;
        str3.getClass();
        atoz2.a |= 1;
        atoz2.b = str3;
        String str4 = Build.MODEL;
        if (o5.c) {
            o5.c();
            o5.c = false;
        }
        atoz atoz3 = (atoz) o5.b;
        str4.getClass();
        atoz3.a |= 2;
        atoz3.c = str4;
        String str5 = Build.VERSION.RELEASE;
        if (o5.c) {
            o5.c();
            o5.c = false;
        }
        atoz atoz4 = (atoz) o5.b;
        str5.getClass();
        atoz4.a |= 8;
        atoz4.e = str5;
        int i = Build.VERSION.SDK_INT;
        if (o5.c) {
            o5.c();
            o5.c = false;
        }
        atoz atoz5 = (atoz) o5.b;
        atoz5.a |= 16;
        atoz5.f = i;
        atoz atoz6 = (atoz) o5.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atqj atqj6 = (atqj) o.b;
        atoz6.getClass();
        atqj6.f = atoz6;
        atqj6.a |= 16;
        atpq atpq = (atpq) atpr.b.o();
        if (!awuz.a.a().ax()) {
            Set<Integer> a4 = cbi.s().a(bsz, 2);
            if (a4 == null || a4.isEmpty()) {
                ((anih) ((anih) bxk.a.b()).a("cbn", "a", 163, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[NetworkUtil] No active synchronizable contexts.");
                atpr = (atpr) atpq.i();
            } else {
                for (Integer intValue : a4) {
                    int intValue2 = intValue.intValue();
                    aucd o6 = atpx.d.o();
                    atjv b2 = jtj.b(intValue2);
                    if (o6.c) {
                        o6.c();
                        o6.c = false;
                    }
                    atpx atpx = (atpx) o6.b;
                    atpx.b = b2.bA;
                    atpx.a |= 1;
                    long j3 = cbi.j().a.getLong(cjv.a(intValue2), 0);
                    if (o6.c) {
                        o6.c();
                        o6.c = false;
                    }
                    atpx atpx2 = (atpx) o6.b;
                    atpx2.a |= 2;
                    atpx2.c = j3;
                    atpq.a(o6);
                }
                atpr = (atpr) atpq.i();
            }
        } else {
            atpr = (atpr) atpq.i();
        }
        String a5 = awwh.a.a().a();
        if (o.c) {
            o.c();
            o.c = false;
        }
        atqj atqj7 = (atqj) o.b;
        a5.getClass();
        int i2 = atqj7.a | 128;
        atqj7.a = i2;
        atqj7.i = a5;
        new Object[1][0] = atpr;
        atpr.getClass();
        atqj7.g = atpr;
        atqj7.a = i2 | 32;
        return (atqj) o.i();
    }
}
