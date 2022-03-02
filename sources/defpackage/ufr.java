package defpackage;

/* renamed from: ufr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ufr extends tim {
    final /* synthetic */ ufu a;
    private final tim b;

    public ufr(ufu ufu, tim tim) {
        this.a = ufu;
        this.b = tim;
    }

    public final void a(String str) {
        this.a.i(str);
        this.b.a(str);
    }

    public final void a(String str, tij tij) {
        this.b.a(str, tij);
    }

    public final void a(String str, til til) {
        if (til.d) {
            this.a.h(str);
        }
        this.b.a(str, til);
    }

    public final void a(String str, tip tip) {
        if (!tip.a.c()) {
            this.a.i(str);
        }
        this.b.a(str, tip);
    }
}
