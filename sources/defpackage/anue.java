package defpackage;

import java.util.List;

/* renamed from: anue  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class anue extends aucd implements audy {
    public anue() {
        super((aucj) anuf.e);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        anuf anuf = (anuf) this.b;
        anuf anuf2 = anuf.e;
        if (!anuf.b.a()) {
            anuf.b = aucj.a(anuf.b);
        }
        auab.a(iterable, (List) anuf.b);
    }
}
