package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: amum  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amum implements amva {
    volatile amva a;
    final aosh b = aosh.f();
    final amsn c = amsn.a();

    public amum() {
        amva amva = amvo.s;
        this.a = amva;
    }

    public final int a() {
        return 0;
    }

    public final amva a(ReferenceQueue referenceQueue, Object obj, amvp amvp) {
        return this;
    }

    public final amvp b() {
        return null;
    }

    public final boolean c() {
        return true;
    }

    public final boolean d() {
        return false;
    }

    public final Object e() {
        return aosr.a(this.b);
    }

    public final void f() {
        this.c.a(TimeUnit.NANOSECONDS);
    }

    public final Object get() {
        return null;
    }

    public final boolean b(Object obj) {
        return this.b.b(obj);
    }

    public final void a(Object obj) {
        if (obj == null) {
            this.a = amvo.s;
        } else {
            b(obj);
        }
    }
}
