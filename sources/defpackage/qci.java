package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: qci  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qci extends aw {
    public final AtomicBoolean a = new AtomicBoolean(false);

    public final void a(aj ajVar, ax axVar) {
        super.a(ajVar, new qch(this, axVar));
    }

    public final void b(Object obj) {
        this.a.set(true);
        super.b(obj);
    }
}
