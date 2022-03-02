package defpackage;

import java.util.List;

/* renamed from: awdz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awdz {
    private final List a;
    private final List b;

    public awdz(int i, int i2) {
        this.a = awdq.a(i);
        this.b = awdq.a(i2);
    }

    public final awea a() {
        return new awea(this.a, this.b);
    }

    public final void b(bapu bapu) {
        this.a.add(bapu);
    }

    public final void a(bapu bapu) {
        this.b.add(bapu);
    }
}
