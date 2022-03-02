package com.google.android.gms.appinvite;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.chimera.IntentOperation;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AppInviteIntentOperation extends IntentOperation {
    public static final Queue a = new ConcurrentLinkedQueue();
    public static final dvz b = new dvz();
    private static long c = 0;

    public static synchronized long a() {
        long j;
        synchronized (AppInviteIntentOperation.class) {
            j = c + 1;
            c = j;
        }
        return j;
    }

    public final void onHandleIntent(Intent intent) {
        for (dwb dwb = (dwb) a.poll(); dwb != null; dwb = (dwb) a.poll()) {
            try {
                dwb.a(getApplicationContext());
            } catch (RemoteException | jbk e) {
                apev.a(e);
            }
        }
    }

    public static void a(long j, Intent intent) {
        dvz dvz = b;
        Long valueOf = Long.valueOf(j);
        if (!dvz.a.containsKey(valueOf)) {
            while (dvz.b.size() >= 2000) {
                dvz.a.remove(dvz.b.get(0));
                dvz.b.remove(0);
            }
        } else {
            dvz.b.remove(valueOf);
        }
        dvz.b.add(valueOf);
        dvz.a.put(valueOf, intent);
    }
}
