package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: aper  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aper {
    private final ConcurrentHashMap a = new ConcurrentHashMap(16, 0.75f, 10);
    private final ReferenceQueue b = new ReferenceQueue();

    public final List a(Throwable th, boolean z) {
        ReferenceQueue referenceQueue = this.b;
        while (true) {
            Reference poll = referenceQueue.poll();
            if (poll == null) {
                break;
            }
            this.a.remove(poll);
            referenceQueue = this.b;
        }
        List list = (List) this.a.get(new apeq(th, (ReferenceQueue) null));
        if (!z || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List list2 = (List) this.a.putIfAbsent(new apeq(th, this.b), vector);
        return list2 == null ? vector : list2;
    }
}
