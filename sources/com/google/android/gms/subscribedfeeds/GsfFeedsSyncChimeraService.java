package com.google.android.gms.subscribedfeeds;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GsfFeedsSyncChimeraService extends Service {
    public final IBinder onBind(Intent intent) {
        return new acun(getApplicationContext(), "subscribedfeeds").getSyncAdapterBinder();
    }
}
