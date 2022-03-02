package com.google.android.places.service;

import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.gms.location.places.internal.PlacesParams;
import com.google.android.gms.userlocation.CheckInReport;
import com.google.android.places.Subscription;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class PlaceDetectionAsyncChimeraService extends Service implements akir, akvf {
    public akvl a;
    private final Binder b = new akve(this);

    public final Future a(CheckInReport checkInReport, PlacesParams placesParams) {
        akvl akvl = this.a;
        FutureTask futureTask = new FutureTask(new akvk(akvl, checkInReport, placesParams));
        akvl.c.post(futureTask);
        return futureTask;
    }

    public final Future a(Subscription subscription) {
        akiy akiy = this.a.f;
        FutureTask futureTask = new FutureTask(new akiw(akiy, subscription));
        akiy.a.post(new akiu(akiy, futureTask));
        return futureTask;
    }

    public final Future b(Subscription subscription) {
        return this.a.f.a(subscription);
    }

    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        akvl akvl = this.a;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        akvl.c.post(new akvi(akvl, printWriter, countDownLatch));
        try {
            if (!countDownLatch.await(4, TimeUnit.SECONDS)) {
                printWriter.println("Thread timed out dumping Place Detection Service state.");
            }
        } catch (InterruptedException e) {
            printWriter.println("Thread interrupted while dumping Place Detection Service state.");
        }
    }

    public final IBinder onBind(Intent intent) {
        return this.b;
    }

    public final void onCreate() {
        super.onCreate();
        akvl akvl = new akvl(this, this);
        this.a = akvl;
        akvl.a(amll.a((Runnable) new akvb(this)));
    }

    public final void onDestroy() {
        akvl akvl = this.a;
        akvl.i.a();
        akvl.a.unregisterReceiver(akvl.j);
        akvl.f.b();
        akyn akyn = akvl.h;
        try {
            akyn.c.unregisterReceiver(akyn.l);
        } catch (IllegalArgumentException e) {
            if (Log.isLoggable("Places", 6)) {
                Log.e("Places", "IllegalArgumentException whilst unregistering receiver. Was SignalManager stopped before being started?");
            }
        }
        akvl.c.post(new akvh(akvl));
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        Bundle extras;
        if (!(intent == null || (extras = intent.getExtras()) == null || !extras.containsKey("PREFETCHING"))) {
            this.a.a(amll.a((Runnable) new akvc(this)));
        }
        if (!ikh.a(intent)) {
            return 1;
        }
        this.a.a(amll.a((Runnable) new akvd(this, intent)));
        return 1;
    }

    public final boolean onUnbind(Intent intent) {
        return false;
    }

    public final Future a(String str) {
        akvl akvl = this.a;
        FutureTask futureTask = new FutureTask(new akvj(akvl, str));
        akvl.c.post(futureTask);
        return futureTask;
    }

    public final void a(int i) {
        if (i > 0) {
            Intent intent = new Intent("com.google.android.gms.location.places.PlaceDetectionAsyncService");
            intent.setPackage(getPackageName());
            startService(intent);
            return;
        }
        stopSelf();
    }
}
