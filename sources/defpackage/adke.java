package defpackage;

import android.content.Context;
import android.os.Build;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: adke  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adke {
    public static final adjz a;
    public static final adjz b = new adjy("config.flag.").a("size_value", (Long) -1L, ayoz.S);
    public static final adjz c = l.a("description", "", ayoz.h);
    public static final adjz d = l.a("url", "", ayoz.ab);
    public static final adjz e = l.a("install_success_message", "", ayoz.r);
    public static final adjz f = l.a("install_failure_message", "", ayoz.q);
    public static final adjz g = l.a("required_setup", "", ayoz.O);
    public static final adjz h = l.a("is_security_update", Boolean.FALSE, ayoz.s);
    public static final adjz i = l.a("streaming_property_files", "", ayoz.X);
    private static final iwd j = adnt.c("SystemUpdate");
    private static int k = -1;
    private static final adjy l;

    static {
        adjy adjy = new adjy("config.flag.");
        l = adjy;
        a = adjy.a("title", "", ayoz.Y);
    }

    public static int b(Context context) {
        int i2 = k;
        if (i2 != -1) {
            return i2;
        }
        try {
            for (ModuleManager.ModuleInfo moduleInfo : ModuleManager.get(context).getAllModules()) {
                if (moduleInfo.moduleId.equals("com.google.android.gms.ota_base")) {
                    int i3 = moduleInfo.moduleVersion;
                    k = i3;
                    return i3;
                }
            }
        } catch (Exception e2) {
            j.e("Failed to get the module version: %s", e2, new Object[0]);
        }
        return -1;
    }

    public static boolean a(Context context) {
        int i2 = Build.VERSION.SDK_INT;
        if (jgu.f(context)) {
            return ayox.a.a().D();
        }
        return false;
    }
}
