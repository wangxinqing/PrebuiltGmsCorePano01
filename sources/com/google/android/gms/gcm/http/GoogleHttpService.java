package com.google.android.gms.gcm.http;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GoogleHttpService extends hdy {
    public final IBinder onBind(Intent intent) {
        Service service = this.a;
        if (service != null) {
            return service.onBind(intent);
        }
        return null;
    }
}
