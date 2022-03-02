package defpackage;

import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: aosk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aosk implements Runnable {
    aosm a;

    public aosk(aosm aosm) {
        this.a = aosm;
    }

    public final void run() {
        aorr aorr;
        aosm aosm = this.a;
        if (aosm != null && (aorr = aosm.a) != null) {
            this.a = null;
            if (!aorr.isDone()) {
                try {
                    ScheduledFuture scheduledFuture = aosm.b;
                    aosm.b = null;
                    String str = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (abs > 10) {
                                StringBuilder sb = new StringBuilder(75);
                                sb.append(str);
                                sb.append(" (timeout delayed by ");
                                sb.append(abs);
                                sb.append(" ms after scheduled time)");
                                str = sb.toString();
                            }
                        } catch (Throwable th) {
                            th = th;
                            aosm.a((Throwable) new aosl(str));
                            throw th;
                        }
                    }
                    try {
                        String valueOf = String.valueOf(str);
                        String valueOf2 = String.valueOf(aorr);
                        StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(valueOf2).length());
                        sb2.append(valueOf);
                        sb2.append(": ");
                        sb2.append(valueOf2);
                        aosm.a((Throwable) new aosl(sb2.toString()));
                    } catch (Throwable th2) {
                        th = th2;
                        aosm.a((Throwable) new aosl(str));
                        throw th;
                    }
                } finally {
                    aorr.cancel(true);
                }
            } else {
                aosm.b(aorr);
            }
        }
    }
}
