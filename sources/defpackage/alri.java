package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: alri  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alri implements alrf {
    private final Logger a = Logger.getLogger(alri.class.getName());
    private final ScheduledExecutorService b;
    private final alrj c;

    public alri(alrj alrj, ScheduledExecutorService scheduledExecutorService) {
        if (scheduledExecutorService != null) {
            this.c = alrj;
            this.b = scheduledExecutorService;
            return;
        }
        throw null;
    }

    public final void a(alrg alrg, Runnable runnable) {
        double d;
        double millis = (double) TimeUnit.SECONDS.toMillis(1);
        alrj alrj = this.c;
        if (alrg != alrg.SUCCESS) {
            double scalb = Math.scalb(1.0d, alrj.a);
            alrj.a++;
            if (scalb > 15.0d) {
                scalb = 15.0d;
            }
            d = scalb + (Math.random() * scalb);
        } else {
            alrj.a = 0;
            d = 0.0d;
        }
        Double.isNaN(millis);
        long j = (long) (millis * d);
        if (j > 0) {
            Logger logger = this.a;
            Level level = Level.INFO;
            StringBuilder sb = new StringBuilder(75);
            sb.append("Waiting ");
            sb.append(j);
            sb.append(" ms before sending request (failure backoff)...");
            logger.logp(level, "com.google.apps.brix.api.client.net.browserchannel.util.ExecutorServiceBackoffScheduler", "scheduleTask", sb.toString());
        }
        this.b.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }
}
