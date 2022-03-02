package defpackage;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;

/* renamed from: auqx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class auqx implements auql {
    private static final auqk a = new auqz();
    private final ConcurrentMap b = new ConcurrentHashMap(3, 0.75f, 1);
    private final auqt c;
    private final aurc d;

    public auqx(auqt auqt, aurc aurc) {
        amrl.a((Object) auqt);
        this.c = auqt;
        amrl.a((Object) aurc);
        this.d = aurc;
    }

    private final aorr a(auqk auqk) {
        String str = auqk.a().a;
        aurc aurc = this.d;
        String str2 = aurc.a;
        Object[] objArr = {str2, str};
        aosh f = aosh.f();
        aurc.c.a(str2, str, (String) null).a((acvp) new psa(str2, str, f));
        auqk.a(f);
        return f;
    }

    public final auqk b(String str) {
        ConcurrentMap concurrentMap = this.b;
        amrl.a((Object) str);
        auqk auqk = (auqk) concurrentMap.get(str);
        return auqk == null ? a : auqk;
    }

    public final void a() {
        ArrayList arrayList = new ArrayList();
        for (auqk a2 : this.b.values()) {
            arrayList.add(a(a2));
        }
        aopr.a(aorl.a((Iterable) arrayList), (amqy) new auqv(), (Executor) aoqm.a);
    }

    public final void a(auqj auqj) {
        prx prx = (prx) this.c.a.a();
        auqt.a(prx, 1);
        Executor b2 = psi.b();
        auqt.a(b2, 2);
        auqt.a(auqj, 3);
        auqs auqs = new auqs(prx, b2, auqj);
        amrl.a((Object) auqs);
        aorl.a(a((auqk) auqs), new auqw(), aoqm.a);
        this.b.put(auqj.a, auqs);
    }

    public final boolean a(String str) {
        ConcurrentMap concurrentMap = this.b;
        amrl.a((Object) str);
        return concurrentMap.containsKey(str);
    }
}
