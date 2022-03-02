package defpackage;

import com.google.android.chimera.config.ModuleManager;

/* renamed from: gaw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gaw {
    public final ModuleManager a;

    public gaw(ModuleManager moduleManager) {
        this.a = moduleManager;
    }

    public final boolean a() {
        ModuleManager moduleManager = this.a;
        aucd o = boe.b.o();
        aucd o2 = bob.f.o();
        String str = mdh.a.a;
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        bob bob = (bob) o2.b;
        str.getClass();
        int i = bob.a | 1;
        bob.a = i;
        bob.b = str;
        bob.a = i | 2;
        bob.c = 0;
        bob bob2 = (bob) o2.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        boe boe = (boe) o.b;
        bob2.getClass();
        boe.a();
        boe.a.add(bob2);
        if (moduleManager.checkFeaturesAreAvailable(ModuleManager.FeatureList.fromProto(((boe) o.i()).k())) != 0) {
            return false;
        }
        return true;
    }
}
