package com.google.android.gms.chimera.container;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DexOptIntentOperation extends IntentOperation {
    public static void a(Context context, boolean z) {
        if (bld.a()) {
            Intent startIntent = IntentOperation.getStartIntent(context, DexOptIntentOperation.class, "com.google.android.gms.chimera.container.OPTIMIZE_MODULES_ACTION");
            if (startIntent != null) {
                startIntent.putExtra("FORCE_DEXOPT", z);
                context.startService(startIntent);
                return;
            }
            Log.w("DexOptIntOp", "Failed to start async module optimization");
        }
    }

    public final void onHandleIntent(Intent intent) {
        if (bld.a()) {
            String action = intent.getAction();
            if ("com.google.android.gms.chimera.container.OPTIMIZE_MODULES_ACTION".equals(action)) {
                blu.a((Context) this).a(false, intent.getBooleanExtra("FORCE_DEXOPT", false));
            } else {
                String valueOf = String.valueOf(action);
                throw new IllegalStateException(valueOf.length() == 0 ? new String("Unknown action: ") : "Unknown action: ".concat(valueOf));
            }
        }
    }
}
