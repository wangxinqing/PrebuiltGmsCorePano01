package defpackage;

import android.os.Build;
import android.provider.DeviceConfig;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: ykg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ykg {
    private static final jjg a = jjg.a(iyc.PLATFORM_CONFIGURATOR);
    private static boolean b;

    static {
        try {
            boolean z = false;
            if ("google".equals(Build.BRAND) && Integer.parseInt(Build.VERSION.INCREMENTAL) >= 6070236) {
                z = true;
            }
            b = z;
        } catch (NumberFormatException e) {
            b = true;
        }
        b &= jkr.i();
    }

    public static String a(String str, String str2) {
        return DeviceConfig.getProperty(str, str2);
    }

    public static boolean b() {
        return jkr.h() && !Build.ID.startsWith("QPP1") && !Build.ID.startsWith("QPP2") && azdd.a.a().d();
    }

    static boolean c() {
        return b && azdd.a.a().k();
    }

    public static void a(String str, String str2, String str3, boolean z) {
        DeviceConfig.setProperty(str, str2, str3, z);
    }

    public static void a(String str, Executor executor, DeviceConfig.OnPropertiesChangedListener onPropertiesChangedListener) {
        DeviceConfig.addOnPropertiesChangedListener(str, executor, onPropertiesChangedListener);
    }

    public static boolean a() {
        return jkr.h() && azdd.c();
    }

    static boolean a(String str, Map map) {
        try {
            DeviceConfig.Properties.Builder builder = new DeviceConfig.Properties.Builder(str);
            for (Map.Entry entry : map.entrySet()) {
                builder.setString((String) entry.getKey(), (String) entry.getValue());
            }
            return DeviceConfig.setProperties(builder.build());
        } catch (NoClassDefFoundError e) {
            anih anih = (anih) a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("ykg", "a", 94, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("This device does not support atomic writes. Falling back to writing individual flags");
            b = false;
            return false;
        } catch (Exception e2) {
            if (e2 instanceof DeviceConfig.BadConfigException) {
                throw new ykf(e2);
            } else if (e2 instanceof SecurityException) {
                throw ((SecurityException) e2);
            } else {
                throw new RuntimeException(e2);
            }
        }
    }
}
