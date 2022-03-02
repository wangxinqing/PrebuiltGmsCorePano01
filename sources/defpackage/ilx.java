package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.util.Log;

/* renamed from: ilx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ilx extends BroadcastReceiver {
    public final void onReceive(Context context, Intent intent) {
        long a = ilv.a(context);
        long longExtra = intent.getLongExtra("dd_shared_prefs_id_extra", -1);
        if (a != -1 && a == longExtra) {
            return;
        }
        if (longExtra != -1) {
            Log.i("DDSharedPrefsUpdatedBR", "Killing process to force shared prefs update.");
            Process.killProcess(Process.myPid());
            return;
        }
        Log.w("DDSharedPrefsUpdatedBR", "Intent had no version set. Ignoring!");
    }
}
