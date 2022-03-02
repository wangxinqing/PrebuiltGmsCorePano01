package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* renamed from: bajk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bajk extends bagk {
    public static final Logger b = Logger.getLogger(bajk.class.getName());
    private static final ReferenceQueue c = new ReferenceQueue();
    private static final ConcurrentMap d = new ConcurrentHashMap();
    private final bajj e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bajk(azzs azzs) {
        super(azzs);
        ReferenceQueue referenceQueue = c;
        ConcurrentMap concurrentMap = d;
        this.e = new bajj(this, azzs, referenceQueue, concurrentMap);
    }

    public final azzs c() {
        this.e.g = true;
        this.e.clear();
        azzs azzs = this.a;
        ((baji) azzs).o();
        return azzs;
    }

    public final azzs d() {
        this.e.g = true;
        this.e.clear();
        azzs azzs = this.a;
        ((baji) azzs).p();
        return azzs;
    }
}
