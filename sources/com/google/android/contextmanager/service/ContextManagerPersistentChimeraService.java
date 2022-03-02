package com.google.android.contextmanager.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.Service;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ContextManagerPersistentChimeraService extends Service {
    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        cbi.n();
        bwg.a(printWriter);
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            new Object[1][0] = intent.getAction();
            if (ikh.a(intent)) {
                Intent startIntent = IntentOperation.getStartIntent((Context) this, SystemMemoryCacheIntentOperation.class, "com.google.android.contextmanager.service.SystemMemoryCacheIntentOperation.INIT");
                startIntent.putExtras(intent);
                startService(startIntent);
            }
        }
        return 1;
    }
}
