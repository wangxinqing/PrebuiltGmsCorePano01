package defpackage;

import android.util.Log;

/* renamed from: ahzf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahzf implements arnj {
    public final void a(int i) {
        if (i != 0 && i != 1 && Log.isLoggable("SettingsHelperNyc", 6)) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Error sending notification to nanoapp: ");
            sb.append(i);
            Log.e("SettingsHelperNyc", sb.toString());
        }
    }
}
