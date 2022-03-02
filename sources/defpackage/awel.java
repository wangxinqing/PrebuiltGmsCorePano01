package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: awel  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class awel implements awen {
    public final awek a = new awek();
    private final AtomicBoolean b = new AtomicBoolean();

    protected awel() {
    }

    public final awef a(aweo aweo) {
        awej awej = new awej(this);
        awej.a.a(new awei(awej, aweo), aoqm.a);
        return awej;
    }

    public final awef aZ() {
        return new awej(this);
    }

    public final aorr b() {
        if (this.b.compareAndSet(false, true)) {
            this.a.b(c());
        }
        return this.a;
    }

    /* access modifiers changed from: protected */
    public abstract aorr c();

    public final void a(boolean z) {
        this.b.set(true);
        this.a.a(z);
    }
}
