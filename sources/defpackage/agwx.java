package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.ArrayList;

/* renamed from: agwx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agwx extends BroadcastReceiver {
    private static final Object a = new Object();
    private static final ancq b = anfb.a(amxc.p());
    private static volatile boolean c;

    public static void a(Context context, String str, agww agww) {
        b.a((Object) str, (Object) agww);
        if (!c) {
            synchronized (a) {
                if (!c) {
                    context.registerReceiver(new agwx(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                    c = true;
                }
            }
        }
    }

    public final void onReceive(Context context, Intent intent) {
        ArrayList arrayList;
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra != null) {
            synchronized (b) {
                arrayList = new ArrayList(b.a(stringExtra));
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((agww) arrayList.get(i)).a();
            }
        }
    }
}
