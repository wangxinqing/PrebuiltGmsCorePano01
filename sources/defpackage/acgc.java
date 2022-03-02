package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.smartdevice.notification.PersistentNotificationCancellationBroadcastChimeraReceiver;
import com.google.android.gms.smartdevice.notification.PersistentNotificationDelayIntentOperation;
import com.google.android.gms.smartdevice.notification.SerializableNotification;

/* renamed from: acgc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acgc {
    public static final iwd a = acqa.a("Notification", "PersistentNotificationManager");
    private final iwq b;
    private final jbs c;

    public acgc(iwq iwq, jbs jbs) {
        iva.a((Object) iwq);
        this.b = iwq;
        iva.a((Object) jbs);
        this.c = jbs;
    }

    public static acgc a(Context context) {
        iwq a2 = iwq.a(context);
        if (a2 != null) {
            return new acgc(a2, new jbs(context));
        }
        throw null;
    }

    public final void b(String str, int i) {
        this.b.a(str, i);
        a().edit().remove(a(str, i)).commit();
    }

    public static SharedPreferences a() {
        return ihs.b().getSharedPreferences("SmartDevice.PersistentNotificationManager", 0);
    }

    public static String a(String str, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    private final void a(String str, PendingIntent pendingIntent, long j) {
        this.c.a(str, 1, j, pendingIntent, "com.google.android.gms");
    }

    public final void a(String str, int i, SerializableNotification serializableNotification) {
        iwd iwd = a;
        Integer valueOf = Integer.valueOf(i);
        iwd.a("doNotify(tag=%s, id=%s)", str, valueOf);
        ihs b2 = ihs.b();
        a().edit().putString(a(str, i), serializableNotification.a()).commit();
        if (serializableNotification.c > 0) {
            PendingIntent pendingIntent = IntentOperation.getPendingIntent((Context) b2, PersistentNotificationDelayIntentOperation.class, PersistentNotificationDelayIntentOperation.a(b2, str, i, serializableNotification), 0, 134217728);
            if (pendingIntent != null) {
                a.a("Setting timer to launch notification in %d ms", Long.valueOf(serializableNotification.c));
                a("PersistentNotificationManager", pendingIntent, serializableNotification.a + serializableNotification.c);
            } else {
                a.d("Unable to set timer to launch notification.", new Object[0]);
            }
        } else {
            a.a("Showing notification (tag=%s, id=%s)", str, valueOf);
            this.b.a(str, i, serializableNotification.a((Context) b2));
        }
        if (serializableNotification.b > 0) {
            PendingIntent broadcast = PendingIntent.getBroadcast(b2, 0, PersistentNotificationCancellationBroadcastChimeraReceiver.a(b2, str, i), 134217728);
            a.a("Setting timer to cancel notification in %d ms", Long.valueOf(serializableNotification.b));
            a("PersistentNotificationManager.CANCELATION", broadcast, serializableNotification.a + serializableNotification.c + serializableNotification.b);
        }
    }
}
