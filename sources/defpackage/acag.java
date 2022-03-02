package defpackage;

import android.content.Context;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: acag  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acag {
    private acae a;
    private acaf b;

    public static void a(Context context, aucd aucd) {
        String str;
        for (ModuleManager.ModuleInfo moduleInfo : ModuleManager.get(context).getAllModules()) {
            if ("com.google.android.gms.smartdevice".equals(moduleInfo.moduleId)) {
                ModuleManager.ModuleApkInfo moduleApkInfo = moduleInfo.moduleApk;
                if (moduleApkInfo != null) {
                    str = moduleApkInfo.apkPackageName;
                } else {
                    str = null;
                }
                if (!"com.google.android.gms".equals(str)) {
                    String str2 = moduleInfo.moduleApk.apkPackageName;
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    anwh anwh = (anwh) aucd.b;
                    anwh anwh2 = anwh.j;
                    str2.getClass();
                    anwh.a |= 16;
                    anwh.f = str2;
                }
                int i = moduleInfo.moduleVersion;
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                anwh anwh3 = (anwh) aucd.b;
                anwh anwh4 = anwh.j;
                anwh3.a |= 32;
                anwh3.g = i;
                return;
            }
        }
    }

    public final acaf b() {
        boolean z;
        if (this.a == null) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z, (Object) "Don't use getTargetHelper() and getSourceHelper() at the same time!");
        if (this.b == null) {
            this.b = new acaf();
        }
        return this.b;
    }

    public final acae a() {
        boolean z;
        if (this.b == null) {
            z = true;
        } else {
            z = false;
        }
        amrl.b(z, (Object) "Don't use getTargetHelper() and getSourceHelper() at the same time!");
        if (this.a == null) {
            this.a = new acae();
        }
        return this.a;
    }
}
