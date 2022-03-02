package defpackage;

import java.util.List;

/* renamed from: atng  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class atng extends aucd implements audy {
    public atng() {
        super((aucj) atnh.d);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        atnh atnh = (atnh) this.b;
        atnh atnh2 = atnh.d;
        if (!atnh.b.a()) {
            atnh.b = aucj.a(atnh.b);
        }
        auab.a(iterable, (List) atnh.b);
    }
}
