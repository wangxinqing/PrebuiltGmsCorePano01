package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;

/* renamed from: ijw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ijw {
    private static ijs a;

    public static synchronized void a(Context context) {
        synchronized (ijw.class) {
            if (jkr.e()) {
                if (a == null) {
                    if (a()) {
                        Context applicationContext = context.getApplicationContext();
                        a(applicationContext, new ijz(applicationContext));
                        return;
                    }
                }
                Log.w("GmsReceiverSupport", "Didn't register runtime background receiver.");
            }
            Log.w("GmsReceiverSupport", "Didn't register runtime background receiver.");
        }
    }

    static synchronized void a(Context context, ijz ijz) {
        synchronized (ijw.class) {
            a = new ijs(ijz);
            ArrayList arrayList = new ArrayList();
            Map map = ijz.a;
            if (map != null) {
                for (ijy ijy : map.values()) {
                    if (ijy.b) {
                        arrayList.add(ijy.a);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Map map2 = ijz.a;
            if (map2 != null) {
                for (ijy ijy2 : map2.values()) {
                    if (!ijy2.b) {
                        arrayList2.add(ijy2.a);
                    }
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                context.registerReceiver(a, (IntentFilter) arrayList.get(i));
            }
            int size2 = arrayList2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                context.registerReceiver(a, (IntentFilter) arrayList2.get(i2), "com.google.android.gms.permission.INTERNAL_BROADCAST", (Handler) null);
            }
            Log.i("GmsReceiverSupport", String.format(Locale.getDefault(), "Registered Receiver for %d+%d IntentFilters", new Object[]{Integer.valueOf(arrayList.size()), Integer.valueOf(arrayList2.size())}));
        }
    }

    public static boolean a() {
        return "com.google.android.gms.persistent".equals(jkt.a());
    }
}
