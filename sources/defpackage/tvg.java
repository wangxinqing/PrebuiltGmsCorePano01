package defpackage;

import android.content.Context;
import com.google.android.chimera.ModuleContext;
import com.google.android.chimera.config.ModuleManager;
import java.util.concurrent.Executor;

/* renamed from: tvg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tvg {
    public final Context a;
    public long b = -2147483648L;
    private final Executor c = jfm.b(10);

    public tvg(Context context) {
        this.a = ModuleContext.getModuleContext(context);
    }

    public static void a(Context context, asom asom) {
        if (context != null) {
            context.startService(arza.a(context, asom));
        }
    }

    public final boolean b() {
        ModuleManager moduleManager = ModuleManager.get(this.a);
        ModuleManager.FeatureCheck featureCheck = new ModuleManager.FeatureCheck();
        featureCheck.checkFeatureAtAnyVersion("fast_pair");
        int checkFeaturesAreAvailable = moduleManager.checkFeaturesAreAvailable(featureCheck);
        ((anih) tsp.a.d()).a("loadFastPairModule: checkFeaturesAreAvailable:%d", checkFeaturesAreAvailable);
        return checkFeaturesAreAvailable == 0;
    }

    public final void a() {
        this.c.execute(new tve(this, new tvf()));
    }
}
