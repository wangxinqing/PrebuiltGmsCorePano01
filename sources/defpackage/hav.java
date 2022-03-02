package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.io.File;

/* renamed from: hav  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class hav {
    private static final iwd a = gzk.a("AndroidBuildModule");
    private static final anaf b;

    static {
        anab h = anaf.h();
        h.a("client_id", han.BASE_CLIENT_ID);
        h.a("search_client_id", han.SEARCH_CLIENT_ID);
        h.a("voicesearch_client_id", han.VOICESEARCH_CLIENT_ID);
        h.a("maps_client_id", han.MAPS_CLIENT_ID);
        h.a("youtube_client_id", han.YOUTUBE_CLIENT_ID);
        h.a("market_client_id", han.MARKET_CLIENT_ID);
        h.a("shopper_client_id", han.SHOPPER_CLIENT_ID);
        h.a("wallet_client_id", han.WALLET_CLIENT_ID);
        h.a("chrome_client_id", han.CHROME_CLIENT_ID);
        b = h.a();
    }

    private static amri a(Context context, String str) {
        String str2;
        try {
            str2 = aeed.a(context.getContentResolver(), str);
        } catch (SecurityException e) {
            a.d("Unable to get partner string with key: %s", e, str);
            str2 = null;
        }
        return amri.c(str2);
    }

    static hac a(Context context, File file, gwr gwr, hct hct) {
        aucd o = hac.r.o();
        if (hct.a(hac.class, 1) && !TextUtils.isEmpty(Build.FINGERPRINT)) {
            String str = Build.FINGERPRINT;
            if (o.c) {
                o.c();
                o.c = false;
            }
            hac hac = (hac) o.b;
            str.getClass();
            hac.a |= 1;
            hac.b = str;
        }
        String radioVersion = Build.getRadioVersion();
        if (hct.a(hac.class, 4)) {
            if (TextUtils.isEmpty(radioVersion)) {
                radioVersion = null;
            }
            SharedPreferences sharedPreferences = gwr.b;
            if (sharedPreferences == null) {
                sharedPreferences = context.getSharedPreferences("DeviceConfigUtils", 0);
            }
            String string = sharedPreferences.getString("lastRadio", (String) null);
            if (radioVersion == null) {
                radioVersion = string;
            } else if (!radioVersion.equals(string)) {
                sharedPreferences.edit().putString("lastRadio", radioVersion).apply();
            }
            if (!TextUtils.isEmpty(radioVersion)) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                hac hac2 = (hac) o.b;
                radioVersion.getClass();
                hac2.a |= 2;
                hac2.c = radioVersion;
            }
        }
        if (hct.a(hac.class, 5) && !TextUtils.isEmpty(Build.BOOTLOADER)) {
            String str2 = Build.BOOTLOADER;
            if (o.c) {
                o.c();
                o.c = false;
            }
            hac hac3 = (hac) o.b;
            str2.getClass();
            hac3.a |= 4;
            hac3.d = str2;
        }
        if (hct.a(hac.class, 2) && !TextUtils.isEmpty(Build.HARDWARE)) {
            String str3 = Build.HARDWARE;
            if (o.c) {
                o.c();
                o.c = false;
            }
            hac hac4 = (hac) o.b;
            str3.getClass();
            hac4.a |= 8;
            hac4.e = str3;
        }
        if (hct.a(hac.class, 3) && !TextUtils.isEmpty(Build.BRAND)) {
            String str4 = Build.BRAND;
            if (o.c) {
                o.c();
                o.c = false;
            }
            hac hac5 = (hac) o.b;
            str4.getClass();
            hac5.a |= 16;
            hac5.f = str4;
        }
        if (hct.a(hac.class, 9) && !TextUtils.isEmpty(Build.DEVICE)) {
            String str5 = Build.DEVICE;
            if (o.c) {
                o.c();
                o.c = false;
            }
            hac hac6 = (hac) o.b;
            str5.getClass();
            hac6.a |= 512;
            hac6.k = str5;
        }
        if (hct.a(hac.class, 11) && !TextUtils.isEmpty(Build.MODEL)) {
            String str6 = Build.MODEL;
            if (o.c) {
                o.c();
                o.c = false;
            }
            hac hac7 = (hac) o.b;
            str6.getClass();
            hac7.a |= 1024;
            hac7.l = str6;
        }
        if (hct.a(hac.class, 12) && !TextUtils.isEmpty(Build.MANUFACTURER)) {
            String str7 = Build.MANUFACTURER;
            if (o.c) {
                o.c();
                o.c = false;
            }
            hac hac8 = (hac) o.b;
            str7.getClass();
            hac8.a |= 2048;
            hac8.m = str7;
        }
        if (hct.a(hac.class, 13) && !TextUtils.isEmpty(Build.PRODUCT)) {
            String str8 = Build.PRODUCT;
            if (o.c) {
                o.c();
                o.c = false;
            }
            hac hac9 = (hac) o.b;
            str8.getClass();
            hac9.a |= FragmentTransaction.TRANSIT_ENTER_MASK;
            hac9.n = str8;
        }
        if (hct.a(hac.class, 7)) {
            long j = Build.TIME / 1000;
            if (o.c) {
                o.c();
                o.c = false;
            }
            hac hac10 = (hac) o.b;
            hac10.a |= 64;
            hac10.h = j;
        }
        if (hct.a(hac.class, 10)) {
            int i = Build.VERSION.SDK_INT;
            if (o.c) {
                o.c();
                o.c = false;
            }
            hac hac11 = (hac) o.b;
            hac11.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            hac11.j = i;
        }
        if (hct.a(hac.class, 19)) {
            String a2 = !jkr.b() ? jli.a("ro.build.version.security_patch", (String) null) : Build.VERSION.SECURITY_PATCH;
            if (!TextUtils.isEmpty(a2)) {
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                hac hac12 = (hac) o.b;
                a2.getClass();
                hac12.a |= 65536;
                hac12.q = a2;
            }
        }
        if (hct.a(hac.class, 14)) {
            boolean exists = file.exists();
            if (o.c) {
                o.c();
                o.c = false;
            }
            hac hac13 = (hac) o.b;
            hac13.a |= FragmentTransaction.TRANSIT_EXIT_MASK;
            hac13.o = exists;
        }
        if (hct.a(hac.class, 16)) {
            jiw.b(context);
        }
        if (hct.a(hac.class, 15)) {
            amzt j2 = amzy.j();
            anhj a3 = b.keySet().iterator();
            while (a3.hasNext()) {
                String str9 = (String) a3.next();
                amri a4 = a(context, str9);
                if (a4.a()) {
                    aucd o2 = hao.d.o();
                    han han = (han) b.get(str9);
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    hao hao = (hao) o2.b;
                    hao.b = han.j;
                    hao.a |= 1;
                    String str10 = (String) a4.b();
                    if (o2.c) {
                        o2.c();
                        o2.c = false;
                    }
                    hao hao2 = (hao) o2.b;
                    str10.getClass();
                    hao2.a |= 2;
                    hao2.c = str10;
                    j2.c((hao) o2.i());
                }
            }
            o.y((Iterable) j2.a());
        }
        if (hct.a(hac.class, 6)) {
            amri a5 = a(context, "client_id");
            if (a5.a()) {
                String str11 = (String) a5.b();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                hac hac14 = (hac) o.b;
                str11.getClass();
                hac14.a |= 32;
                hac14.g = str11;
            }
        }
        if (hct.a(hac.class, 8)) {
            String packageName = context.getPackageName();
            try {
                int i2 = context.getPackageManager().getPackageInfo(packageName, 0).versionCode;
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                hac hac15 = (hac) o.b;
                hac15.a |= 128;
                hac15.i = i2;
            } catch (PackageManager.NameNotFoundException e) {
                a.f("Our own package not found: %s.", e, packageName);
            }
        }
        return (hac) o.i();
    }

    static File a() {
        return new File("/system/recovery-from-boot.p");
    }
}
