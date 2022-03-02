package com.google.android.gms.gcm.http;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.Service;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GoogleHttpChimeraService extends Service {
    private opn a;

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.println("\nGoogleHttpService stats:");
        nwb a2 = nwb.a();
        printWriter.println("BackoffStatuses:");
        synchronized (a2.b) {
            for (Map.Entry entry : a2.b.entrySet()) {
                printWriter.print((String) entry.getKey());
                printWriter.print("[");
                printWriter.print("failureCount: ");
                printWriter.print(((nwa) entry.getValue()).a);
                printWriter.print(", currentBackoff: ");
                printWriter.print(((nwa) entry.getValue()).b);
                printWriter.println("]");
            }
        }
    }

    public final IBinder onBind(Intent intent) {
        return this.a;
    }

    public final void onCreate() {
        super.onCreate();
        this.a = new opn(this);
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
