package defpackage;

import java.util.List;

/* renamed from: aund  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aund extends aucd implements audy {
    public aund() {
        super((aucj) aung.h);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        aung aung = (aung) this.b;
        aung aung2 = aung.h;
        if (!aung.c.a()) {
            aung.c = aucj.a(aung.c);
        }
        auab.a(iterable, (List) aung.c);
    }

    public final void b(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        aung aung = (aung) this.b;
        aung aung2 = aung.h;
        if (!aung.e.a()) {
            aung.e = aucj.a(aung.e);
        }
        auab.a(iterable, (List) aung.e);
    }
}
