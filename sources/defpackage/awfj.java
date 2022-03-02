package defpackage;

import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: awfj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awfj {
    private static final Logger a = Logger.getLogger(awfj.class.getName());

    private awfj() {
    }

    public static awfc a(bapu bapu, bapu bapu2) {
        awfb awfb;
        try {
            Collection collection = (Collection) ((awdu) bapu2).a;
            if (!collection.isEmpty()) {
                awfb = collection.size() == 1 ? new awfh((awfb) anbs.b(collection)) : new awfe(collection);
            } else {
                awfb = awfb.a;
            }
            return awfb.a(((awdu) bapu).a);
        } catch (RuntimeException e) {
            a.logp(Level.SEVERE, "dagger.producers.monitoring.internal.Monitors", "createMonitorForComponent", "RuntimeException while constructing monitor factories.", e);
            return awfc.a;
        }
    }

    public static void a(RuntimeException runtimeException, awex awex, String str) {
        Logger logger = a;
        Level level = Level.SEVERE;
        String valueOf = String.valueOf(awex);
        StringBuilder sb = new StringBuilder(str.length() + 59 + String.valueOf(valueOf).length());
        sb.append("RuntimeException while calling ProducerMonitor.");
        sb.append(str);
        sb.append(" on monitor ");
        sb.append(valueOf);
        logger.logp(level, "dagger.producers.monitoring.internal.Monitors", "logProducerMonitorMethodException", sb.toString(), runtimeException);
    }

    public static void a(RuntimeException runtimeException, awex awex, String str, Object obj) {
        Logger logger = a;
        Level level = Level.SEVERE;
        String valueOf = String.valueOf(awex);
        String valueOf2 = String.valueOf(obj);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 65 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("RuntimeException while calling ProducerMonitor.");
        sb.append(str);
        sb.append(" on monitor ");
        sb.append(valueOf);
        sb.append(" with ");
        sb.append(valueOf2);
        logger.logp(level, "dagger.producers.monitoring.internal.Monitors", "logProducerMonitorArgMethodException", sb.toString(), runtimeException);
    }

    public static void a(RuntimeException runtimeException, awfb awfb, Object obj) {
        Logger logger = a;
        Level level = Level.SEVERE;
        String valueOf = String.valueOf(awfb);
        String valueOf2 = String.valueOf(obj);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 100 + String.valueOf(valueOf2).length());
        sb.append("RuntimeException while calling ProductionComponentMonitor.Factory.create on factory ");
        sb.append(valueOf);
        sb.append(" with component ");
        sb.append(valueOf2);
        logger.logp(level, "dagger.producers.monitoring.internal.Monitors", "logCreateException", sb.toString(), runtimeException);
    }

    public static void a(RuntimeException runtimeException, awfc awfc, awey awey) {
        Logger logger = a;
        Level level = Level.SEVERE;
        String valueOf = String.valueOf(awfc);
        String valueOf2 = String.valueOf(awey);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 100 + String.valueOf(valueOf2).length());
        sb.append("RuntimeException while calling ProductionComponentMonitor.producerMonitorFor on monitor ");
        sb.append(valueOf);
        sb.append(" with token ");
        sb.append(valueOf2);
        logger.logp(level, "dagger.producers.monitoring.internal.Monitors", "logProducerMonitorForException", sb.toString(), runtimeException);
    }
}
