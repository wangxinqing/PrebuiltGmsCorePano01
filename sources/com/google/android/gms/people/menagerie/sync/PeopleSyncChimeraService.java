package com.google.android.gms.people.menagerie.sync;

import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.google.android.chimera.Service;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PeopleSyncChimeraService extends Service {
    private static final Object a = new Object();
    private static xei b = null;

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        ihs.b();
        int i = Build.VERSION.SDK_INT;
        printWriter.write("See the provider log\n");
    }

    public final IBinder onBind(Intent intent) {
        return b.getSyncAdapterBinder();
    }

    public final void onCreate() {
        synchronized (a) {
            if (b == null) {
                b = new xei(getApplicationContext());
            }
        }
    }
}
