package defpackage;

import com.google.android.chimera.config.ModuleManager;

/* renamed from: hda  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hda {
    public static final int a = a("com.google.android.chimera.container.ModuleApi");

    static {
        b("com.google.android.gms.chimera.container.CronetDynamiteModuleApi");
        b("com.google.android.gms.chimera.container.LevelDbModuleApi");
        a("com.google.android.gms.chimera.container.GmsModuleApi");
    }

    private static int a(String str) {
        try {
            ModuleManager.class.getMethod("getApiVersion", new Class[]{String.class});
            return ModuleManager.get(ihs.b()).getApiVersion(str);
        } catch (NoSuchMethodException e) {
            return 0;
        }
    }

    private static void b(String str) {
        if (a >= 100) {
            ModuleManager.get(ihs.b()).getApiVersion(str);
        }
    }
}
