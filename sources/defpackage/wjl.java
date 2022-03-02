package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: wjl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wjl {
    public static Intent a(Context context, amen amen, String str, ameu ameu) {
        int i;
        amew amew;
        Intent className = new Intent().setClassName(context, "com.google.android.gms.notifications.GunsNotificationActivity");
        className.setAction("com.google.android.gms.notifications.intents.START_ACTIVITY");
        className.putExtra("gms.gnots.payload", wjp.a((audx) amen));
        int i2 = 1;
        if (ameu == null) {
            className.putExtra("com.google.android.gms.notifications.intents.readState", 2);
            className.putExtra("com.google.android.gms.notifications.intents.removeFromSystemTray", true);
            if ((amen.a & 16) != 0) {
                amew = amen.f;
                if (amew == null) {
                    amew = amew.d;
                }
            } else {
                amew = null;
            }
            className.putExtra("com.google.android.gms.notifications.intents.target", wjp.a((audx) amew));
        } else {
            if ((ameu.a & 32) != 0) {
                int a = amed.a(ameu.f);
                if (a != 0) {
                    i2 = a;
                }
                i = i2 - 1;
            } else {
                i = 0;
            }
            className.putExtra("com.google.android.gms.notifications.intents.readState", i);
            className.putExtra("com.google.android.gms.notifications.intents.removeFromSystemTray", ameu.e);
            if ((ameu.a & 2) != 0) {
                amew amew2 = ameu.c;
                if (amew2 == null) {
                    amew2 = amew.d;
                }
                className.putExtra("com.google.android.gms.notifications.intents.target", wjp.a((audx) amew2));
            }
            className.putExtra("com.google.android.gms.notifications.intents.actionId", ameu.d);
        }
        className.putExtra("com.google.android.gms.notifications.intents.accountName", str);
        return className;
    }

    public static Intent a(Context context, Intent intent) {
        Intent className = new Intent().setClassName(context, "com.google.android.gms.notifications.GcmBroadcastReceiver");
        className.setAction("com.google.android.gms.notifications.intents.HANDLE_NOTIFICATION_ACTION");
        className.putExtras(intent);
        return className;
    }

    public static Intent a(Context context, Intent intent, int i, Boolean bool, String str) {
        Intent a = a(context, intent);
        int i2 = i - 1;
        if (i != 0) {
            a.putExtra("com.google.android.gms.notifications.intents.readState", i2);
            a.putExtra("com.google.android.gms.notifications.intents.removeFromSystemTray", bool);
            a.putExtra("com.google.android.gms.notifications.intents.actionId", str);
            return a;
        }
        throw null;
    }
}
