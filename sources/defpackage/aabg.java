package defpackage;

import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.scheduler.DeviceStateReceiver;
import com.google.android.gms.scheduler.SchedulerDebugReceiver;
import com.google.android.gms.scheduler.standalone.ReceiverBasedNetworkConstraintObserver;

/* renamed from: aabg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aabg {
    private static Boolean f;
    private static aabg g;
    public aaaz a;
    public aadl b;
    public final ntv c;
    public final nsh d = new nsh();
    public final DeviceStateReceiver e = new DeviceStateReceiver();

    private aabg(Context context) {
        this.c = new ntv(context);
    }

    public static synchronized aabg a() {
        synchronized (aabg.class) {
            if (g == null) {
                ihs b2 = ihs.b();
                nqw.a((Context) b2);
                f = Boolean.valueOf(aekv.a(ihs.b()));
                boolean z = true;
                if (!nqw.c()) {
                    if (nqw.d() == 0) {
                        z = false;
                    }
                    iva.a(z);
                    aabg aabg = new aabg(b2);
                    g = aabg;
                    return aabg;
                }
                jiu jiu = jiu.a;
                if (nqw.d() != 0) {
                    z = false;
                }
                iva.a(z);
                aabg aabg2 = new aabg(b2);
                if (!b()) {
                    aabg2.a(b2, jiu);
                }
                DeviceStateReceiver deviceStateReceiver = aabg2.e;
                int i = Build.VERSION.SDK_INT;
                IntentFilter intentFilter = new IntentFilter();
                if (jkr.b()) {
                    intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
                }
                if (jkr.c()) {
                    intentFilter.addAction("android.os.action.LIGHT_DEVICE_IDLE_MODE_CHANGED");
                }
                if (axbn.d()) {
                    int i2 = Build.VERSION.SDK_INT;
                    intentFilter.addAction("android.intent.action.DREAMING_STARTED");
                    intentFilter.addAction("android.intent.action.DREAMING_STOPPED");
                    intentFilter.addAction("android.intent.action.DOCK_IDLE");
                    intentFilter.addAction("android.intent.action.DOCK_ACTIVE");
                    intentFilter.addAction("android.intent.action.SCREEN_ON");
                    intentFilter.addAction("android.intent.action.SCREEN_OFF");
                    intentFilter.addAction("com.google.android.gms.gcm.TRIGGER_IDLE");
                }
                b2.registerReceiver(deviceStateReceiver, intentFilter);
                if (hxz.g(b2)) {
                    SchedulerDebugReceiver schedulerDebugReceiver = new SchedulerDebugReceiver();
                    IntentFilter intentFilter2 = new IntentFilter();
                    intentFilter2.addAction("com.google.android.gms.gcm.ACTION_SCHEDULER_DEBUG");
                    b2.registerReceiver(schedulerDebugReceiver, intentFilter2);
                }
                g = aabg2;
                return aabg2;
            }
            aabg aabg3 = g;
            return aabg3;
        }
    }

    public static synchronized boolean b() {
        boolean equals;
        synchronized (aabg.class) {
            if (axkn.e()) {
                iva.a((Object) f);
            }
            equals = Boolean.TRUE.equals(f);
        }
        return equals;
    }

    public final void a(Context context, jiq jiq) {
        Looper looper;
        qvg qvg;
        aaeb aaeb;
        Context context2 = context;
        if (!axmd.a.a().l()) {
            this.a = null;
            this.b = null;
        } else if (this.a == null) {
            aadt aadt = new aadt(context, new jbs(context2), this.d, jfm.a(10), new aady(), new aabe(new hol(context2, "GCM", (String) null)));
            aaey aaey = new aaey(context2);
            aabj aabj = new aabj(context2, this.c);
            aoru b2 = jfm.b(10);
            HandlerThread handlerThread = new HandlerThread("netscheduler-queue-handler", 10);
            handlerThread.start();
            if (!axlu.a.a().p()) {
                looper = Looper.getMainLooper();
            } else {
                looper = handlerThread.getLooper();
            }
            ntv ntv = this.c;
            aacr aacr = new aacr(ntv, new aacp(ntv, looper));
            if (!jkr.c() || axma.b()) {
                qvg = null;
            } else {
                qvg = new qvg((JobScheduler) context2.getSystemService(JobScheduler.class));
            }
            if (qvg != null) {
                Log.i("NetworkScheduler", "Using JobScheduler engine");
                aade aade = new aade(aaey, new aabo[]{new aadf(qvg, new aadm(new ComponentName("com.google.android.gms", "com.google.android.gms.gcm.nts.TaskExecutionService"), jiq))}, this.c, aabj, new aadc(), qvg, new aabn(context2), aadt);
                this.a = new aaaz(context2, aade, b2, this.d);
                this.b = new aadl(aade, qvg, aacr, b2);
                return;
            }
            Log.i("NetworkScheduler", "Using standalone scheduling engine");
            int i = Build.VERSION.SDK_INT;
            if (axmd.a.a().b()) {
                aaeb = new aaeb(context2);
            } else {
                aaeb = new ReceiverBasedNetworkConstraintObserver(context2);
            }
            aaen aaen = r1;
            aaen aaen2 = new aaen(context, aacr, aaeb, aaey, b2, handlerThread.getLooper(), new aabo[]{new aaee(context2, aaey)}, this.c, aabj, new aabn(context2), new aaeu(context2, new jbs(context2)), aadt);
            this.a = new aaaz(context, aaen, b2, this.d);
            this.b = null;
        }
    }
}
