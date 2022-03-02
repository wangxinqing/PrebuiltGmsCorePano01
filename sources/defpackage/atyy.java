package defpackage;

import java.util.List;

/* renamed from: atyy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atyy extends aucd implements audy {
    public atyy() {
        super((aucj) atyz.g);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        atyz atyz = (atyz) this.b;
        atyz atyz2 = atyz.g;
        if (!atyz.f.a()) {
            atyz.f = aucj.a(atyz.f);
        }
        auab.a(iterable, (List) atyz.f);
    }
}
