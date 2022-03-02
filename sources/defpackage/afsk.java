package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: afsk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afsk implements amqy {
    private final Set a;
    private final aflh b;
    private final AtomicLong c;
    private final Set d;
    private final afsn e;
    private final aflf f;
    private final Set g;

    public afsk(Set set, aflh aflh, AtomicLong atomicLong, Set set2, afsn afsn, aflf aflf, Set set3) {
        this.a = set;
        this.b = aflh;
        this.c = atomicLong;
        this.d = set2;
        this.e = afsn;
        this.f = aflf;
        this.g = set3;
    }

    public final Object a(Object obj) {
        Set set = this.a;
        aflh aflh = this.b;
        AtomicLong atomicLong = this.c;
        Set set2 = this.d;
        afsn afsn = this.e;
        aflf aflf = this.f;
        Set set3 = this.g;
        Long l = (Long) obj;
        if (!set.contains(aflh)) {
            atomicLong.getAndAdd(l.longValue());
            set.add(aflh);
        }
        if (!set2.contains(aflh)) {
            afsn.a += l.longValue();
            set2.add(aflh);
        }
        if (!aflf.e) {
            return null;
        }
        amrl.a((Object) set3);
        if (set3.contains(aflh)) {
            return null;
        }
        afsn.b += l.longValue();
        set3.add(aflh);
        return null;
    }
}
