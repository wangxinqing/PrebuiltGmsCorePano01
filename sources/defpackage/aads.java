package defpackage;

import com.google.android.gms.scheduler.reachability.ReachabilityObserver$AlarmReceiver;

/* renamed from: aads  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class aads implements Runnable {
    private final ReachabilityObserver$AlarmReceiver a;

    public aads(ReachabilityObserver$AlarmReceiver reachabilityObserver$AlarmReceiver) {
        this.a = reachabilityObserver$AlarmReceiver;
    }

    public final void run() {
        ReachabilityObserver$AlarmReceiver reachabilityObserver$AlarmReceiver = this.a;
        synchronized (reachabilityObserver$AlarmReceiver.a) {
            aadt aadt = reachabilityObserver$AlarmReceiver.a;
            int i = aadt.d;
            aadt.c = null;
            if (axlx.b()) {
                for (aadx a2 : aadt.b.values()) {
                    a2.a();
                }
            }
        }
    }
}
