package defpackage;

import java.util.List;

/* renamed from: aubv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aubv extends aucd implements audy {
    public aubv() {
        super((aucj) aubw.b);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        aubw aubw = (aubw) this.b;
        aubw aubw2 = aubw.b;
        aubw.c();
        auab.a(iterable, (List) aubw.a);
    }

    public final void a(String str) {
        if (this.c) {
            c();
            this.c = false;
        }
        aubw aubw = (aubw) this.b;
        aubw aubw2 = aubw.b;
        str.getClass();
        aubw.c();
        aubw.a.add(str);
    }
}
