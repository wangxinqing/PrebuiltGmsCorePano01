package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.chimera.ModuleContext;
import java.util.ArrayList;
import java.util.List;

/* renamed from: bjo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bjo extends BroadcastReceiver {
    private static boolean a = false;
    private static final List b = new ArrayList();

    public static synchronized void a(Context context, ModuleContext moduleContext) {
        synchronized (bjo.class) {
            if (moduleContext.f != null) {
                b.add(moduleContext);
                if (!a) {
                    context.registerReceiver(ModuleContext.k, new IntentFilter("android.intent.action.CONFIGURATION_CHANGED"));
                    a = true;
                }
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        synchronized (bjo.class) {
            for (int i = 0; i < b.size(); i++) {
                ModuleContext moduleContext = (ModuleContext) b.get(i);
                moduleContext.updateModuleConfiguration(moduleContext.getBaseContext().getResources().getConfiguration());
            }
        }
    }
}
