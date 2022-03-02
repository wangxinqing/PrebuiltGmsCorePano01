package defpackage;

/* renamed from: agz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agz {
    Object a;
    ahd b;
    public ahf c = new ahf();
    private boolean d;

    private final void a() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        ahf ahf;
        ahd ahd = this.b;
        if (ahd != null && !ahd.isDone()) {
            ahd.a(new aha("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a));
        }
        if (!this.d && (ahf = this.c) != null) {
            ahf.a((Object) null);
        }
    }

    public final void a(Object obj) {
        this.d = true;
        ahd ahd = this.b;
        if (ahd != null && ahd.b.a(obj)) {
            a();
        }
    }

    public final void a(Throwable th) {
        this.d = true;
        ahd ahd = this.b;
        if (ahd != null && ahd.a(th)) {
            a();
        }
    }
}
