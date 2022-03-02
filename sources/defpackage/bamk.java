package defpackage;

import java.util.List;

/* renamed from: bamk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bamk extends bagw {
    public static final /* synthetic */ int v = 0;
    public final Object a;
    public List b;
    public final batd c = new batd();
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public final bamd g;
    public final banf h;
    public final bamt i;
    public boolean t = true;
    final /* synthetic */ baml u;
    private final int w;
    private int x;
    private int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bamk(baml baml, int i2, balm balm, Object obj, bamd bamd, banf banf, bamt bamt, int i3) {
        super(i2, balm, baml.r);
        this.u = baml;
        amrl.a(obj, (Object) "lock");
        this.a = obj;
        this.g = bamd;
        this.h = banf;
        this.i = bamt;
        this.x = i3;
        this.y = i3;
        this.w = i3;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        super.a();
        balu balu = this.l;
        balu.c++;
        balu.b.a();
    }

    public final void c(babj babj, boolean z, baaf baaf) {
        if (!this.f) {
            this.f = true;
            if (this.t) {
                bamt bamt = this.i;
                baml baml = this.u;
                bamt.v.remove(baml);
                bamt.b(baml);
                this.b = null;
                this.c.n();
                this.t = false;
                if (baaf == null) {
                    baaf = new baaf();
                }
                b(babj, true, baaf);
                return;
            }
            this.i.a(this.u.g, babj, baeg.PROCESSED, z, bany.CANCEL, baaf);
        }
    }

    public final void a(int i2) {
        int i3 = this.y - i2;
        this.y = i3;
        int i4 = this.w;
        if (((float) i3) <= ((float) i4) * 0.5f) {
            int i5 = i4 - i3;
            this.x += i5;
            this.y = i3 + i5;
            this.g.a(this.u.g, (long) i5);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(babj babj, boolean z, baaf baaf) {
        c(babj, false, baaf);
    }

    public final void a(batd batd, boolean z) {
        int i2 = this.x - ((int) batd.b);
        this.x = i2;
        if (i2 < 0) {
            this.g.a(this.u.g, bany.FLOW_CONTROL_ERROR);
            this.i.a(this.u.g, babj.n.a("Received data size exceeded our receiving window size"), baeg.PROCESSED, false, (bany) null, (baaf) null);
            return;
        }
        super.a(new bamz(batd), z);
    }

    public final void a(Throwable th) {
        c(babj.a(th), true, new baaf());
    }

    public final void a(boolean z) {
        if (!this.r) {
            this.i.a(this.u.g, (babj) null, baeg.PROCESSED, false, bany.CANCEL, (baaf) null);
        } else {
            this.i.a(this.u.g, (babj) null, baeg.PROCESSED, false, (bany) null, (baaf) null);
        }
        super.a(z);
    }
}
