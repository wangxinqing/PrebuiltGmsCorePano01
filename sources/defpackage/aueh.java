package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: aueh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aueh {
    public static final aueh a = new aueh();
    private final ConcurrentMap b = new ConcurrentHashMap();
    private final audo c = new audo();

    private aueh() {
    }

    public final aueq a(Class cls) {
        aucy.a((Object) cls, "messageType");
        aueq aueq = (aueq) this.b.get(cls);
        if (aueq == null) {
            audo audo = this.c;
            auer.a(cls);
            audu b2 = audo.a.b(cls);
            if (b2.a()) {
                if (aucj.class.isAssignableFrom(cls)) {
                    aueq = aueb.a(auer.c, aubu.a, b2.b());
                } else {
                    aueq = aueb.a(auer.a, aubu.a(), b2.b());
                }
            } else if (aucj.class.isAssignableFrom(cls)) {
                if (audo.a(b2)) {
                    aueq = auea.a(b2, auee.b, audk.b, auer.c, aubu.a, audt.b);
                } else {
                    aueq = auea.a(b2, auee.b, audk.b, auer.c, (aubt) null, audt.b);
                }
            } else if (audo.a(b2)) {
                aueq = auea.a(b2, auee.a, audk.a, auer.a, aubu.a(), audt.a);
            } else {
                aueq = auea.a(b2, auee.a, audk.a, auer.b, (aubt) null, audt.a);
            }
            aucy.a((Object) cls, "messageType");
            aucy.a((Object) aueq, "schema");
            aueq aueq2 = (aueq) this.b.putIfAbsent(cls, aueq);
            return aueq2 == null ? aueq : aueq2;
        }
    }

    public final aueq a(Object obj) {
        return a((Class) obj.getClass());
    }
}
