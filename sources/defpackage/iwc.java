package defpackage;

import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;

/* renamed from: iwc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class iwc {
    private static final iwc a = new iwc();
    private quw b = null;

    private iwc() {
    }

    public static quw a() {
        synchronized (a) {
            if (a.b == null) {
                a.b = new quw(b());
                quw quw = a.b;
                return quw;
            }
            quw quw2 = a.b;
            return quw2;
        }
    }

    private static Semaphore b() {
        Semaphore semaphore;
        try {
            ConcurrentMap lockMap = ihs.b().getLockMap("periodic-restart-lock");
            synchronized (lockMap) {
                if (!lockMap.containsKey("singleton_semaphore")) {
                    semaphore = new Semaphore(1073741823);
                    lockMap.put("singleton_semaphore", semaphore);
                } else {
                    semaphore = (Semaphore) lockMap.get("singleton_semaphore");
                }
            }
            return semaphore;
        } catch (NoSuchMethodError e) {
            return new Semaphore(1073741823);
        }
    }
}
