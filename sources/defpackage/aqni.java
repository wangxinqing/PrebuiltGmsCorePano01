package defpackage;

import java.util.List;

/* renamed from: aqni  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqni extends aucd implements audy {
    public aqni() {
        super((aucj) aqnj.b);
    }

    public final void a(int i) {
        if (this.c) {
            c();
            this.c = false;
        }
        aqnj aqnj = (aqnj) this.b;
        aqnj aqnj2 = aqnj.b;
        aqnj.a();
        aqnj.a.d(i);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        aqnj aqnj = (aqnj) this.b;
        aqnj aqnj2 = aqnj.b;
        aqnj.a();
        auab.a(iterable, (List) aqnj.a);
    }
}
