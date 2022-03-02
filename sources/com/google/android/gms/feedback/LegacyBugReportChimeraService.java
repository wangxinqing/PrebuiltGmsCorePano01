package com.google.android.gms.feedback;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LegacyBugReportChimeraService extends Service {
    private final IBinder a = new mwp(this);

    public final IBinder onBind(Intent intent) {
        return this.a;
    }
}
