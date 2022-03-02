package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.util.Pair;
import com.google.android.gms.people.sync.focus.notification.NotificationReceiver;
import java.util.HashMap;
import java.util.Map;

/* renamed from: xxe  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class xxe {
    private static final Map a = new HashMap();

    public static synchronized void a(Context context, wss wss, xxi xxi) {
        synchronized (xxe.class) {
            xxi.d();
            Pair pair = new Pair(xxi.d().b, Integer.valueOf(xxi.d().c));
            NotificationReceiver notificationReceiver = (NotificationReceiver) a.get(pair);
            if (notificationReceiver == null) {
                NotificationReceiver notificationReceiver2 = new NotificationReceiver(wss, xxi);
                context.registerReceiver(notificationReceiver2, new IntentFilter(xxi.a()));
                context.registerReceiver(notificationReceiver2, new IntentFilter(xxi.b()));
                a.put(pair, notificationReceiver2);
            } else {
                notificationReceiver.a = xxi;
            }
        }
    }
}
