package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.chimera.Service;
import java.io.File;
import java.util.regex.Matcher;
import org.chromium.net.UrlRequest;

/* renamed from: jlo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jlo {
    private static String a;
    private static int b = -1;
    private static aedz c = null;

    public static String a() {
        if (a == null) {
            a = jhg.e((Context) ihs.b());
        }
        return a;
    }

    public static int b() {
        if (b == -1) {
            b = jhg.d((Context) ihs.b());
        }
        return b;
    }

    public static String c() {
        int b2 = b();
        long lastModified = new File(ihs.b().getApplicationInfo().sourceDir).lastModified();
        StringBuilder sb = new StringBuilder(32);
        sb.append(b2);
        sb.append("_");
        sb.append(lastModified);
        return sb.toString();
    }

    public static int d() {
        return f().getInt("version_code", -1);
    }

    public static String e() {
        return f().getString("version_code_and_timestamp", "");
    }

    public static SharedPreferences f() {
        boolean z = false;
        if (!jkr.c()) {
            return ihs.b().getSharedPreferences("init.initialized_version", 0);
        }
        ihs b2 = ihs.b();
        Context d = aekv.d(b2);
        SharedPreferences sharedPreferences = d.getSharedPreferences("init.initialized_version", 0);
        if (!sharedPreferences.getBoolean("migrated", false)) {
            if (!sharedPreferences.contains("migrated")) {
                if (aekv.b(d)) {
                    d.moveSharedPreferencesFrom(b2, "init.initialized_version");
                    b2.deleteSharedPreferences("init.initialized_version");
                    sharedPreferences = d.getSharedPreferences("init.initialized_version", 0);
                    z = true;
                }
                sharedPreferences.edit().putBoolean("migrated", z).apply();
            } else if (aekv.b(d)) {
                b2.deleteSharedPreferences("init.initialized_version");
                sharedPreferences.edit().putBoolean("migrated", true).apply();
                return sharedPreferences;
            }
        }
        return sharedPreferences;
    }

    public static long g() {
        String a2 = a();
        if (a2 == null) {
            return -1;
        }
        Matcher matcher = jjl.a().matcher(a2);
        if (!matcher.find()) {
            return -1;
        }
        try {
            return Long.parseLong(matcher.group(2));
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    @Deprecated
    public static int h() {
        int b2 = jjl.b(a());
        if (b2 != -1) {
            return b2 + 5;
        }
        return -1;
    }

    public static String i() {
        int h = h();
        switch (h) {
            case 5:
                return "prod";
            case 6:
                return "internal";
            case 7:
                return "prodlmp";
            case 8:
                return "things";
            case 9:
                return "prodmnc";
            case 10:
                return "wearable";
            case 11:
                return "auto";
            case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                return "atv";
            case Service.START_CONTINUATION_MASK:
                return "prodpi";
            case 16:
                return "prodgo";
            case 17:
                return "prodqt";
            default:
                return String.valueOf(h);
        }
    }

    @Deprecated
    public static int j() {
        return jjl.c(a());
    }

    @Deprecated
    public static int k() {
        return jjl.d(a());
    }

    public static aedz l() {
        if (c == null) {
            int h = h();
            int j = j();
            int k = k();
            if (h == -1 || j == -1 || k == -1) {
                return null;
            }
            aucd o = aedz.e.o();
            int m = m();
            if (o.c) {
                o.c();
                o.c = false;
            }
            aedz aedz = (aedz) o.b;
            int i = m - 1;
            if (m != 0) {
                aedz.b = i;
                int i2 = 1;
                aedz.a |= 1;
                int n = n();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                aedz aedz2 = (aedz) o.b;
                int i3 = n - 1;
                if (n != 0) {
                    aedz2.c = i3;
                    aedz2.a |= 2;
                    int k2 = k();
                    if (k2 != -1) {
                        i2 = aedy.a(k2 + 1);
                    }
                    if (o.c) {
                        o.c();
                        o.c = false;
                    }
                    aedz aedz3 = (aedz) o.b;
                    int i4 = i2 - 1;
                    if (i2 != 0) {
                        aedz3.d = i4;
                        aedz3.a |= 4;
                        c = (aedz) o.i();
                    } else {
                        throw null;
                    }
                } else {
                    throw null;
                }
            } else {
                throw null;
            }
        }
        return c;
    }

    public static int m() {
        int h = h();
        if (h != -1) {
            return aedw.a(h - 4);
        }
        return 1;
    }

    public static int n() {
        int j = j();
        if (j != -1) {
            return aedu.a(j + 1);
        }
        return 1;
    }
}
