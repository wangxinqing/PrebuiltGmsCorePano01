package com.google.android.gms.auth.setup.devicesignals;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DeviceSignalsChimeraService extends Service {
    public final IBinder onBind(Intent intent) {
        return new gdt(this);
    }
}
