package com.google.android.location.reporting.service;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.ContentObserver;
import android.os.IBinder;
import com.google.android.chimera.Service;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class DispatchingChimeraService extends Service implements ajmb {
    public static boolean a = false;
    public ajme b;
    private aoru c;

    public final void a(int i) {
        stopSelf(i);
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        if (this.b != null) {
            printWriter.println("DispatchingService ULR dump....");
            ajme ajme = this.b;
            printWriter.println(ajme.e);
            printWriter.println("No policy computer running\n");
            ajnw.a(printWriter, ajme.b, ajme.c, ajme.d);
        }
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        super.onCreate();
        ajnw.a((Context) this);
        a = true;
        this.c = jfm.b(10);
        if (aztb.z()) {
            this.c.execute(new ajlg(this));
        } else {
            this.b = ajme.a((Context) this, (ajmb) this);
        }
    }

    public final void onDestroy() {
        a = false;
        this.c.shutdownNow();
        this.c = null;
        ajme ajme = this.b;
        if (ajme != null) {
            String valueOf = String.valueOf(ajme.q);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
            sb.append("Unregister broadcast receiver:");
            sb.append(valueOf);
            sb.toString();
            BroadcastReceiver broadcastReceiver = ajme.q;
            if (broadcastReceiver != null) {
                ajme.b.unregisterReceiver(broadcastReceiver);
            } else {
                ajix.c("GCoreUlr", "mConnectivityBroadcastReceiver is null in onDestroy");
            }
            ContentResolver contentResolver = ajme.b.getContentResolver();
            ContentObserver contentObserver = ajme.r;
            if (contentObserver != null) {
                contentResolver.unregisterContentObserver(contentObserver);
            }
            ContentObserver contentObserver2 = ajme.s;
            if (contentObserver2 != null) {
                contentResolver.unregisterContentObserver(contentObserver2);
            }
            ContentObserver contentObserver3 = ajme.t;
            if (contentObserver3 != null) {
                contentResolver.unregisterContentObserver(contentObserver3);
            }
            ContentObserver contentObserver4 = ajme.u;
            if (contentObserver4 != null) {
                contentResolver.unregisterContentObserver(contentObserver4);
            }
            ajme.b();
            ajkv ajkv = ajme.h;
            if (ajkv != null) {
                ajkv.a();
            }
            ajlm ajlm = ajme.i;
            if (ajlm != null) {
                ajlm.b();
            }
            rom rom = ajme.f;
            if (rom != null) {
                rom.b();
            }
            ajma ajma = ajme.k;
            if (ajma != null) {
                ajma.a();
            }
            synchronized (ajme) {
                ajmd ajmd = ajme.l;
                if (ajmd != null) {
                    ajmd.a();
                }
            }
            ajim ajim = ajme.o;
            if (ajim != null) {
                ajim.close();
            }
            ajik ajik = ajme.n;
            if (ajik != null) {
                ajik.close();
            }
        }
        super.onDestroy();
    }

    public final void onStart(Intent intent, int i) {
        ajix.c("GCoreUlr", 40, "We don't support Froyo, this shouldn't be called");
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            if (aztb.z()) {
                this.c.execute(new ajlh(this, i2, intent));
            } else {
                ajme ajme = this.b;
                if (ajme != null) {
                    ajme.a(intent, i2);
                } else {
                    stopSelf(i2);
                }
            }
            return 2;
        }
        return 2;
    }
}
