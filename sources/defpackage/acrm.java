package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* renamed from: acrm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class acrm extends ks {
    public static void b(Context context, Intent intent) {
        if (intent != null) {
            if (context == null) {
                String valueOf = String.valueOf(intent.toUri(0));
                Log.w("GCoreWakefulBR", valueOf.length() == 0 ? new String("context shouldn't be null. intent: ") : "context shouldn't be null. intent: ".concat(valueOf));
            } else {
                jds.a.a(context, intent);
            }
            ks.a(intent);
        }
    }

    public static void c(Context context, Intent intent) {
        intent.putExtra("WAKE_LOCK_KEY", jdl.a(context, intent));
        ComponentName k = ks.k(context, intent);
        if (k != null) {
            jds jds = jds.a;
            String valueOf = String.valueOf(k.flattenToShortString());
            jds.a(context, intent, valueOf.length() == 0 ? new String("wake:") : "wake:".concat(valueOf), intent.getAction(), "com.google.android.gms");
        }
    }
}
