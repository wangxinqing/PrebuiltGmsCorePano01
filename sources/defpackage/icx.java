package defpackage;

import com.google.android.gms.common.Feature;

/* renamed from: icx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class icx extends ict {
    public final igc b;

    public icx(igc igc, acwd acwd) {
        super(4, acwd);
        this.b = igc;
    }

    public final /* bridge */ /* synthetic */ void a(ied ied, boolean z) {
    }

    public final void c(ifj ifj) {
        igj igj = (igj) ifj.d.remove(this.b);
        if (igj != null) {
            igj.b.a(ifj.b, this.a);
            igj.a.a.a();
            return;
        }
        this.a.b((Object) false);
    }

    public final Feature[] a(ifj ifj) {
        igj igj = (igj) ifj.d.get(this.b);
        if (igj != null) {
            return igj.a.b;
        }
        return null;
    }
}
