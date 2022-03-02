package defpackage;

import android.os.HandlerThread;

/* renamed from: ajgu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajgu {
    public static final /* synthetic */ int d = 0;
    public final String a;
    public final ajgt b;
    public ajgs c;
    private final ajgs e;
    private ajgs f;

    static {
        jjg.a("QStage");
    }

    public ajgu(String str, HandlerThread handlerThread) {
        ajgy ajgy = new ajgy();
        this.e = ajgy;
        this.f = ajgy;
        this.a = str;
        this.b = new ajgt(this, handlerThread.getLooper());
    }

    public final ajgd a(int i) {
        return new ajgd(i, this.b);
    }

    public final void b() {
        a(this.e);
    }

    public final void b(ajgs ajgs) {
        if (this.c == null) {
            this.c = ajgs;
        }
        ajgs ajgs2 = this.f;
        ajgs2.f = ajgs;
        ajgs.g = ajgs2;
        this.f = ajgs;
        ajgs.h = this;
    }

    public final void c() {
        iva.a((Object) this.c.f);
        ajgs ajgs = this.c.f;
        this.c = ajgs;
        ajgs.a();
    }

    public final void a() {
        this.c.a();
    }

    public final void a(ajgs ajgs) {
        while (true) {
            ajgs ajgs2 = this.c;
            if (ajgs2 != ajgs && ajgs2 != this.e) {
                ajgs2.b();
                this.c = this.c.g;
            } else {
                return;
            }
        }
    }
}
