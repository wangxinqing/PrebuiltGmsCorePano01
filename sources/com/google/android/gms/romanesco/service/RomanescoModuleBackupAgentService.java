package com.google.android.gms.romanesco.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class RomanescoModuleBackupAgentService extends BoundService {
    public static final zsg a = zsg.a("RomanescoBackupService");

    public final IBinder onBind(Intent intent) {
        return new gsv(this);
    }
}
