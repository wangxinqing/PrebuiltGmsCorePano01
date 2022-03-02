package com.google.android.location.internal;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.chimera.Service;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class GoogleLocationManagerChimeraService extends Service {
    public Handler a;
    private aioc b;
    private aiod c;

    public static Intent a(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, "com.google.android.location.internal.GoogleLocationManagerService"));
        return intent;
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        PrintWriter printWriter2 = printWriter;
        aiod aiod = this.c;
        Class[] clsArr = {axwe.class, axwh.class, axwk.class, axwn.class, axwq.class, axwt.class, axww.class, axwz.class, axxc.class, axxf.class, axxi.class, axxl.class, axxo.class, axxu.class, axxx.class, axya.class, axyh.class, axyk.class, axyn.class, axyq.class, axyh.class, axyk.class, axyn.class, axyt.class, axyw.class, axyz.class, axzf.class, axzi.class, axzl.class, axzo.class, axzr.class, axzu.class, axzx.class, awqi.class, awql.class, awqo.class, ayaa.class, ayai.class, ayaf.class, ayal.class, ayao.class, ayar.class, ayas.class, ayay.class, aybb.class, aybe.class, aybh.class, aybw.class, aybz.class, aycc.class, aycf.class, ayci.class, aycl.class, aycs.class, aycv.class, aycy.class, aydb.class, ayde.class, aydh.class, aydk.class, aydn.class, aydq.class, aydt.class, aydw.class, aydx.class, ayed.class, ayeg.class, ayej.class, ayes.class, ayey.class, ayfb.class, ayfe.class, ayfh.class, ayfk.class, ayfl.class, ayfm.class};
        Class[] clsArr2 = {ayep.class, ayen.class, ayad.class, ayaf.class};
        for (int i = 0; i < 76; i++) {
            ahyf.a(printWriter2, clsArr[i]);
        }
        if (ayek.l()) {
            for (int i2 = 0; i2 < 4; i2++) {
                ahyf.a(printWriter2, clsArr2[i2]);
            }
        }
        aiei aiei = aiod.b;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        aiei.p.a(20, new aidx(aiei, printWriter, strArr, fileDescriptor, countDownLatch));
        try {
            countDownLatch.await(1, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            printWriter2.println("\nThread interrupted while dumping location requests");
        }
        aimj aimj = aiod.d;
        if (strArr.length <= 0) {
            printWriter2.println("\nGeofencer State:");
            aing aing = aimj.a;
            synchronized (aing.k) {
                aing.b(102, printWriter2);
                aimf aimf = new aimf(printWriter2);
                aimf.a((aioa) aing);
                try {
                    if (aimf.a.await(2, TimeUnit.SECONDS)) {
                        aimf.b();
                    } else {
                        throw new InterruptedException("Wait timeout.");
                    }
                } catch (InterruptedException e2) {
                    printWriter2.write("Failed to retrieve information from CHRE.\n");
                }
            }
        }
        aiod.g.a(printWriter2);
        aiod.h.a(printWriter2);
        aiod.i.a(printWriter2);
        new aipq().a(aiod.a).a(printWriter2);
        aiib aiib = aiod.c;
        CountDownLatch countDownLatch2 = new CountDownLatch(1);
        aiib.d.a(29, new aihx(aiib, printWriter2, countDownLatch2));
        try {
            countDownLatch2.await(1, TimeUnit.SECONDS);
        } catch (InterruptedException e3) {
            printWriter2.println("\nThread interrupted while dumping Device Orientation Request ");
        }
        int c2 = aiod.c();
        StringBuilder sb = new StringBuilder(47);
        sb.append("ActivityRecognition Accuracy Mode : ");
        sb.append(c2);
        printWriter2.println(sb.toString());
        printWriter.println();
    }

    public final IBinder onBind(Intent intent) {
        if (!"com.google.android.location.internal.GoogleLocationManagerService.START".equals(intent.getAction())) {
            return null;
        }
        this.c.a(intent);
        return this.b;
    }

    public final void onCreate() {
        super.onCreate();
        Intent a2 = a(this);
        try {
            startService(a2);
            this.b = new aioc(this, this);
            if (ayap.a.a().flpEnableDebugLogging()) {
                aihr.a(new aiuf((aicn) null));
            }
            this.c = new aiod(getApplicationContext());
            jfp jfp = new jfp("LocationServiceBroker", 9);
            jfp.start();
            this.a = new jfo(jfp);
        } catch (IllegalStateException e) {
            if (Build.VERSION.SDK_INT >= 26 && ((amrk.a(a2.getPackage()) || a2.getPackage().equals("com.google.android.gms")) && awxl.b() && ((double) new Random().nextFloat()) < awxl.c())) {
                Log.e("GLMS", "Google Play services is unable to start a service. Exiting.", e);
                jhg.e();
            }
            throw e;
        }
    }

    public final void onDestroy() {
        aiod aiod = this.c;
        aiod.g.b();
        aiod.h.b();
        aiod.i.b();
        aiod.f.quit();
        aihr.a((ajrg) null);
    }

    public final void onRebind(Intent intent) {
        if ("com.google.android.location.internal.GoogleLocationManagerService.START".equals(intent.getAction())) {
            this.c.a(intent);
        }
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        boolean z;
        if (intent != null) {
            if (ikh.a(intent)) {
                aiod aiod = this.c;
                int b2 = ikh.b(intent);
                if (b2 == 1) {
                    aiei aiei = aiod.b;
                    aiei.p.a(19, new aidq(aiei, new Intent(intent)));
                } else if (b2 != 2) {
                    StringBuilder sb = new StringBuilder(31);
                    sb.append("Unknown cache type: ");
                    sb.append(b2);
                    Log.w("GLMSImpl", sb.toString());
                } else {
                    aimj aimj = aiod.d;
                    if (!ikh.a(intent) || ikh.b(intent) != 2) {
                        z = false;
                    } else {
                        z = true;
                    }
                    iva.b(z);
                    aing aing = aimj.a;
                    Intent intent2 = new Intent(intent);
                    synchronized (aing.k) {
                        if (!aing.u) {
                            aing.b(2, intent2);
                            aing.u = true;
                            for (aimi a2 : aing.w) {
                                a2.a((aioa) aing);
                            }
                        } else if (Log.isLoggable("GeofencerStateMachine", 5)) {
                            aikq.c("GeofencerStateMachine", "sendInitialize called more than once.");
                        }
                    }
                }
            }
            intent.getBooleanExtra("fromDeviceBoot", false);
            if (intent.getBooleanExtra("fromGmsCoreInit", false)) {
                Context context = this.c.a;
                Intent a3 = a(context);
                a3.setPackage(context.getPackageName());
                aisl.a(context, PendingIntent.getService(context, 0, a3, 134217728));
            }
        }
        return 1;
    }

    public final boolean onUnbind(Intent intent) {
        if (!"com.google.android.location.internal.GoogleLocationManagerService.START".equals(intent.getAction())) {
            return true;
        }
        aiod aiod = this.c;
        synchronized (aiod.k) {
            int b2 = aiod.b(intent);
            if (b2 >= 0) {
                aiod.k.remove(b2);
            }
            if (aiod.k.isEmpty()) {
                aiei aiei = aiod.b;
                aiei.p.a(25, new aidr(aiei));
                aiei.a(false);
            }
        }
        return true;
    }

    public final void a(itv itv, String str) {
        try {
            itv.a(0, (IBinder) new aioe(this.c, str), (Bundle) null);
        } catch (RemoteException e) {
            if (Log.isLoggable("GLMS", 5)) {
                Log.w("GLMS", "client died while brokering service");
            }
        }
    }
}
