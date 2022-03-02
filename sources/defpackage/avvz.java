package defpackage;

import java.util.List;

/* renamed from: avvz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class avvz extends aucd implements audy {
    public avvz() {
        super((aucj) avwc.v);
    }

    public final void a(avwa avwa) {
        if (this.c) {
            c();
            this.c = false;
        }
        avwc avwc = (avwc) this.b;
        avwc avwc2 = avwc.v;
        avwa.getClass();
        avwc.c();
        avwc.i.add(avwa);
    }

    public final void a(Iterable iterable) {
        if (this.c) {
            c();
            this.c = false;
        }
        avwc avwc = (avwc) this.b;
        avwc avwc2 = avwc.v;
        avwc.c();
        auab.a(iterable, (List) avwc.i);
    }
}
