package com.google.android.gms.location.persistent;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import com.google.android.chimera.Service;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Map;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LocationPersistentChimeraService extends Service {
    public static WeakReference a = new WeakReference((Object) null);
    public final nz b = new nz();
    private Handler c;

    public static void a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, "com.google.android.gms.location.persistent.LocationPersistentService"));
        amrl.b(context.startService(intent) != null);
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        jjv jjv = new jjv(printWriter, "  ");
        jjv.a();
        for (Map.Entry entry : this.b.entrySet()) {
            printWriter.print((String) entry.getKey());
            printWriter.println(":");
            ((rhb) entry.getValue()).a((PrintWriter) jjv);
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        this.c = new qvr();
        a(this);
        Intent intent = new Intent("com.google.android.gms.location.persistent.REGISTER");
        intent.setPackage("com.google.android.gms");
        sendBroadcast(intent);
    }

    public final void onDestroy() {
        a((LocationPersistentChimeraService) null);
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }

    private static synchronized void a(LocationPersistentChimeraService locationPersistentChimeraService) {
        boolean z;
        synchronized (LocationPersistentChimeraService.class) {
            boolean z2 = true;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                z = true;
            } else {
                z = false;
            }
            amrl.b(z);
            LocationPersistentChimeraService locationPersistentChimeraService2 = (LocationPersistentChimeraService) a.get();
            if (locationPersistentChimeraService2 != null) {
                if (Looper.myLooper() != Looper.getMainLooper()) {
                    z2 = false;
                }
                amrl.b(z2);
                for (rhb a2 : locationPersistentChimeraService2.b.values()) {
                    a2.a();
                }
                locationPersistentChimeraService2.b.clear();
            }
            a = new WeakReference(locationPersistentChimeraService);
        }
    }

    public static synchronized void a(String str, rhb rhb) {
        synchronized (LocationPersistentChimeraService.class) {
            LocationPersistentChimeraService locationPersistentChimeraService = (LocationPersistentChimeraService) a.get();
            if (locationPersistentChimeraService == null) {
                Log.w("LocationPersistentSvc", "unable to register client - no service");
            } else {
                locationPersistentChimeraService.c.post(new rha(locationPersistentChimeraService, str, rhb));
            }
        }
    }
}
