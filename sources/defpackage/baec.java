package defpackage;

/* renamed from: baec  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class baec implements baeh {
    public final azxk a;
    public boolean b;
    final /* synthetic */ baee c;

    public baec(baee baee, azxk azxk) {
        this.c = baee;
        amrl.a((Object) azxk, (Object) "observer");
        this.a = azxk;
    }

    public final void a() {
        baai baai = this.c.b.a;
        if (baai != baai.UNARY && baai != baai.SERVER_STREAMING) {
            int i = bapg.a;
            this.c.c.execute(new baeb(this));
        }
    }

    public final void b(babj babj, baaf baaf) {
        a(babj, baeg.PROCESSED, baaf);
    }

    public final void a(baaf baaf) {
        int i = bapg.a;
        this.c.c.execute(new bady(this, baaf));
    }

    public final void a(babj babj, baaf baaf) {
        this.b = true;
        this.c.g = true;
        try {
            this.c.a(this.a, babj, baaf);
        } finally {
            this.c.a();
            this.c.d.a(babj.a());
        }
    }

    public final void a(babj babj, baeg baeg, baaf baaf) {
        int i = bapg.a;
        azyf c2 = this.c.c();
        if (babj.r == babg.CANCELLED) {
            if (c2 != null) {
                if (c2.a()) {
                    bahb bahb = new bahb();
                    this.c.f.a(bahb);
                    babj babj2 = babj.f;
                    String valueOf = String.valueOf(bahb);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("ClientCall was cancelled at or after deadline. ");
                    sb.append(valueOf);
                    babj = babj2.b(sb.toString());
                    baaf = new baaf();
                }
            }
        }
        this.c.c.execute(new baea(this, babj, baaf));
    }

    public final void a(bajq bajq) {
        int i = bapg.a;
        this.c.c.execute(new badz(this, bajq));
    }
}
