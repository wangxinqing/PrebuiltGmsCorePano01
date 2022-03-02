package defpackage;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: ahdk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahdk implements aora {
    final /* synthetic */ AtomicBoolean a;
    final /* synthetic */ Set b;
    final /* synthetic */ amsn c;
    final /* synthetic */ ahdn d;
    final /* synthetic */ Integer e;
    final /* synthetic */ ahdo f;

    public ahdk(ahdo ahdo, AtomicBoolean atomicBoolean, Set set, amsn amsn, ahdn ahdn, Integer num) {
        this.f = ahdo;
        this.a = atomicBoolean;
        this.b = set;
        this.c = amsn;
        this.d = ahdn;
        this.e = num;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Void voidR = (Void) obj;
        if (this.a.get()) {
            this.f.h.a(this.b.size(), this.c.a(ahdo.a), ahdo.a);
        } else {
            this.f.h.a(this.b.size(), (Set) anax.a((Collection) this.d.b), ahdo.a.convert((long) this.e.intValue(), this.f.f), ahdo.a);
        }
    }

    public final void a(Throwable th) {
    }
}
