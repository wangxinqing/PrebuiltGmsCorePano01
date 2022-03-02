package defpackage;

import java.util.List;

/* renamed from: atlg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atlg extends aucd implements audy {
    public atlg() {
        super((aucj) atlj.h);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        atlj atlj = (atlj) this.b;
        atlj atlj2 = atlj.h;
        if (!atlj.f.a()) {
            atlj.f = aucj.a(atlj.f);
        }
        auab.a(iterable, (List) atlj.f);
    }

    public final void b(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        atlj atlj = (atlj) this.b;
        atlj atlj2 = atlj.h;
        if (!atlj.d.a()) {
            atlj.d = aucj.a(atlj.d);
        }
        auab.a(iterable, (List) atlj.d);
    }
}
