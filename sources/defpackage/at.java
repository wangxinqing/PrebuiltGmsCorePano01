package defpackage;

/* renamed from: at  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class at implements ax {
    final as a;
    final ax b;
    int c = -1;

    public at(as asVar, ax axVar) {
        this.a = asVar;
        this.b = axVar;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        as asVar = this.a;
        as.a("observeForever");
        ap apVar = new ap(asVar, this);
        ar arVar = (ar) asVar.d.a(this, apVar);
        if (arVar instanceof aq) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        } else if (arVar == null) {
            apVar.a(true);
        }
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.a.a((ax) this);
    }

    public final void a(Object obj) {
        int i = this.c;
        int i2 = this.a.g;
        if (i != i2) {
            this.c = i2;
            this.b.a(obj);
        }
    }
}
