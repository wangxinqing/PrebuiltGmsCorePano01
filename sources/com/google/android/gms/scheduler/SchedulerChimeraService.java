package com.google.android.gms.scheduler;

import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.Service;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SchedulerChimeraService extends Service {
    final aoru a = jfm.b(10);

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        aabg.a();
    }

    public final void onDestroy() {
        super.onDestroy();
        aabg.a().d.b();
        this.a.shutdownNow();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            intent.getAction();
        }
        if (!nqw.c()) {
            Log.e("GCM", "Unexpected SchedulerService started as secondary user !");
            stopSelf(i2);
            return 2;
        }
        this.a.execute(new aabd(intent));
        return 1;
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        aaaz aaaz = aabg.a().a;
        if (aaaz != null) {
            String valueOf = String.valueOf(axbz.b());
            printWriter.println(valueOf.length() == 0 ? new String("NTS task filter is ") : "NTS task filter is ".concat(valueOf));
            aaaz.a.a(printWriter, strArr);
            return;
        }
        printWriter.println("GmsTaskScheduler unavailable.");
    }
}
