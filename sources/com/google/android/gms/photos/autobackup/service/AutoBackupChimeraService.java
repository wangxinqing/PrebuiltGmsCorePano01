package com.google.android.gms.photos.autobackup.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AutoBackupChimeraService extends Service {
    public static final Set a = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"android.permission-group.STORAGE", "android.permission-group.PHONE"})));

    public final IBinder onBind(Intent intent) {
        if ("com.google.android.gms.photos.autobackup.service.START".equals(intent.getAction())) {
            return new ykd(this, this);
        }
        return null;
    }
}
