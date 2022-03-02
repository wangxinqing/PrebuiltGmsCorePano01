package com.google.android.gms.games;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class GamesAndroidServiceStub extends Service {
    private static final ArrayList a = new ArrayList();
    private static final anax b = anax.a("com.google.android.gms.games.service.START", "com.google.android.gms.games.service.START_ASYNC", "com.google.android.play.games.service.START_1P");

    static final void a(Intent intent) {
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append("Binding to games service: ");
        sb.append(valueOf);
        nmf.a("GamesService", sb.toString());
        synchronized (a) {
            int size = a.size();
            int i = 0;
            while (i < size) {
                if (!((Intent) a.get(i)).filterEquals(intent)) {
                    i++;
                } else {
                    return;
                }
            }
            String valueOf2 = String.valueOf(intent);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 15);
            sb2.append("Adding intent: ");
            sb2.append(valueOf2);
            nmf.a("GamesService", sb2.toString());
            a.add(intent);
        }
    }

    public final IBinder onBind(Intent intent) {
        if (!b.contains(intent.getAction())) {
            return null;
        }
        a(intent);
        return new nlk(this);
    }

    public final void onRebind(Intent intent) {
        if ("com.google.android.gms.games.service.START".equals(intent.getAction())) {
            a(intent);
        }
    }

    public final boolean onUnbind(Intent intent) {
        int size;
        String valueOf = String.valueOf(intent);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("Unbinding from games service: ");
        sb.append(valueOf);
        nmf.a("GamesService", sb.toString());
        synchronized (a) {
            int size2 = a.size();
            int i = 0;
            while (true) {
                if (i >= size2) {
                    break;
                }
                Intent intent2 = (Intent) a.get(i);
                if (intent2.filterEquals(intent)) {
                    String valueOf2 = String.valueOf(intent2);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 17);
                    sb2.append("Removing intent: ");
                    sb2.append(valueOf2);
                    nmf.a("GamesService", sb2.toString());
                    a.remove(i);
                    break;
                }
                i++;
            }
            size = a.size();
        }
        if (size != 0) {
            return true;
        }
        nmf.a("GamesService", "Unbound from all clients. Cleaning up.");
        return true;
    }
}
