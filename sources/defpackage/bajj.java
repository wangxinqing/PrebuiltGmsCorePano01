package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.LogRecord;

/* renamed from: bajj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bajj extends WeakReference {
    private static final boolean a = Boolean.parseBoolean(System.getProperty("io.grpc.ManagedChannel.enableAllocationTracking", "true"));
    private static final RuntimeException b;
    private final ReferenceQueue c;
    private final ConcurrentMap d;
    private final String e;
    private final Reference f;
    /* access modifiers changed from: private */
    public volatile boolean g;

    static {
        RuntimeException runtimeException = new RuntimeException("ManagedChannel allocation site not recorded.  Set -Dio.grpc.ManagedChannel.enableAllocationTracking=true to enable it");
        runtimeException.setStackTrace(new StackTraceElement[0]);
        b = runtimeException;
    }

    public bajj(bajk bajk, azzs azzs, ReferenceQueue referenceQueue, ConcurrentMap concurrentMap) {
        super(bajk, referenceQueue);
        RuntimeException runtimeException;
        if (a) {
            runtimeException = new RuntimeException("ManagedChannel allocation site");
        } else {
            runtimeException = b;
        }
        this.f = new SoftReference(runtimeException);
        this.e = azzs.toString();
        this.c = referenceQueue;
        this.d = concurrentMap;
        concurrentMap.put(this, this);
        a(referenceQueue);
    }

    private final void a() {
        super.clear();
        this.d.remove(this);
        this.f.clear();
    }

    public final void clear() {
        a();
        a(this.c);
    }

    static void a(ReferenceQueue referenceQueue) {
        while (true) {
            bajj bajj = (bajj) referenceQueue.poll();
            if (bajj != null) {
                RuntimeException runtimeException = (RuntimeException) bajj.f.get();
                bajj.a();
                if (!bajj.g) {
                    Level level = Level.SEVERE;
                    if (bajk.b.isLoggable(level)) {
                        String property = System.getProperty("line.separator");
                        StringBuilder sb = new StringBuilder(String.valueOf(property).length() + 148);
                        sb.append("*~*~*~ Channel {0} was not shutdown properly!!! ~*~*~*");
                        sb.append(property);
                        sb.append("    Make sure to call shutdown()/shutdownNow() and wait until awaitTermination() returns true.");
                        LogRecord logRecord = new LogRecord(level, sb.toString());
                        logRecord.setLoggerName(bajk.b.getName());
                        logRecord.setParameters(new Object[]{bajj.e});
                        logRecord.setThrown(runtimeException);
                        bajk.b.log(logRecord);
                    }
                }
            } else {
                return;
            }
        }
    }
}
