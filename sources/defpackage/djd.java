package defpackage;

import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;

/* renamed from: djd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class djd implements amsv {
    private static final anax a = anax.a((Object) "accountsettings", (Object) "octarine");
    private final ModuleManager b;

    public djd(ModuleManager moduleManager) {
        amrl.a((Object) moduleManager);
        this.b = moduleManager;
    }

    public final /* bridge */ /* synthetic */ Object a() {
        String str;
        anab h = anaf.h();
        try {
            for (ModuleManager.ModuleInfo moduleInfo : this.b.getAllModules()) {
                if (!(moduleInfo == null || (str = moduleInfo.moduleId) == null)) {
                    String replace = str.replace("com.google.android.gms.", "");
                    if (a.contains(replace)) {
                        h.a(replace, moduleInfo);
                    }
                }
            }
        } catch (InvalidConfigException e) {
            dje.b.b("Can't retrieve module versions", e, new Object[0]);
        }
        return h.a();
    }
}
