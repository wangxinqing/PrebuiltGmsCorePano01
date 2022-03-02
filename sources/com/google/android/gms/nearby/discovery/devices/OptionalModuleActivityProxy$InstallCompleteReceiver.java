package com.google.android.gms.nearby.discovery.devices;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.lang.ref.WeakReference;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class OptionalModuleActivityProxy$InstallCompleteReceiver extends nla {
    private final Intent a;
    private final WeakReference b;

    public OptionalModuleActivityProxy$InstallCompleteReceiver(bjs bjs, Intent intent) {
        super("nearby");
        this.b = new WeakReference(bjs);
        this.a = intent;
        bjs.registerReceiver(this, new IntentFilter("com.google.location.nearby.common.fastpair.ACTION_FASTPAIR_MODULE_ENABLED"));
    }

    public final void a(Context context, Intent intent) {
        if ("com.google.location.nearby.common.fastpair.ACTION_FASTPAIR_MODULE_ENABLED".equals(intent.getAction())) {
            ((anih) tsp.a.d()).a("loadFastPairModule: Receive fastpair module enable broadcast.");
            bjs bjs = (bjs) this.b.get();
            if (bjs == null) {
                ((anih) tsp.a.d()).a("loadFastPairModule completed but activity reference is missing!");
            } else if (bjs.isDestroyed() || bjs.isFinishing()) {
                ((anih) tsp.a.d()).a("loadFastPairModule completed but activity is finishing!");
            } else {
                try {
                    bjs.startActivity(this.a);
                    bjs.finish();
                } catch (ActivityNotFoundException e) {
                    anih anih = (anih) tsp.a.c();
                    anih.a((Throwable) e);
                    anih.a("Optional module download completed but activity:%s not found!", (Object) this.a.getComponent().getClassName());
                }
            }
        }
    }

    public final synchronized void a(bjs bjs) {
        bjs.unregisterReceiver(this);
    }
}
