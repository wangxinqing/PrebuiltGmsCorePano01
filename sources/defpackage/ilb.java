package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.chimera.config.ModuleManager;
import java.util.Set;

/* renamed from: ilb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ilb {
    private final Context a;
    private final yey b;

    public ilb(Context context, yey yey) {
        this.a = context;
        this.b = yey;
    }

    private final Set b() {
        Set b2 = jir.b();
        try {
            for (ModuleManager.ModuleInfo metadata : ModuleManager.get(this.a).getAllModulesWithMetadata("com.google.android.gms.phenotype.registration.proto")) {
                for (nil nil : ((nim) aucj.a((aucj) nim.b, metadata.getMetadata(this.a).getByteArray("com.google.android.gms.phenotype.registration.proto"))).a) {
                    if (!nil.h) {
                        b2.add(nil);
                    }
                }
            }
        } catch (auda | InvalidConfigException | RuntimeException e) {
            Log.e("PhenotypeCommitHelper", "Error register phenotype info", e);
        }
        return b2;
    }

    private final boolean c(String str) {
        yfa yfa;
        if ("com.google.android.gms".equals(str) || "com.google.android.gms".equals(str)) {
            yfa = new yfb(this.b, str, jkq.b(str), this.a);
        } else {
            yfa = new ila(this.b, str);
        }
        return yfa.a("");
    }

    public final Set a() {
        Set b2 = jir.b();
        for (nil nil : b()) {
            if (c(nil.b)) {
                b2.add(nil);
            }
        }
        return b2;
    }

    public final boolean a(String str) {
        nil b2 = b(str);
        if (b2 != null) {
            return c(b2.b);
        }
        return false;
    }

    public final nil b(String str) {
        for (nil nil : b()) {
            if (nil.b.equals(str)) {
                return nil;
            }
        }
        return null;
    }
}
