package com.google.android.gms.drive.metadata.sync.syncadapter;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class MetadataSyncChimeraService extends Service {
    public static final ith a = new ith("MetadataSyncChimeraServ", "");
    public leq b;
    private lee c;

    public static String a(String str) {
        return str != null ? str.replaceAll("([/~])", "/$1") : "";
    }

    public final IBinder onBind(Intent intent) {
        return this.c;
    }

    public final void onCreate() {
        this.b = new leq(lsm.a());
        this.c = new lee(this);
    }

    public final boolean onUnbind(Intent intent) {
        stopSelf();
        return false;
    }
}
