package defpackage;

import android.content.Context;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: sce  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sce {
    public static int a(Context context) {
        try {
            for (ModuleManager.ModuleInfo moduleInfo : ModuleManager.get(context).getAllModules()) {
                if (moduleInfo.moduleId.equals("com.google.android.gms.mdi_download")) {
                    return moduleInfo.moduleVersion;
                }
            }
            return -1;
        } catch (Exception e) {
            afsh.a("Failed to set mdi download module version: %s", (Object) e);
            return -1;
        }
    }
}
