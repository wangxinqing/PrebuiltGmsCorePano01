package defpackage;

import com.google.android.gms.common.data.DataHolder;

/* renamed from: rkq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rkq extends ilj implements ric {
    private final String c = d("photo_fife_url");

    public final int a() {
        return a("photo_max_width", 0);
    }

    public final int b() {
        return a("photo_max_height", 0);
    }

    /* renamed from: c */
    public final ric r() {
        return new rkp(this.c, a(), b(), a("photo_attributions", (String) null), this.b);
    }

    public rkq(DataHolder dataHolder, int i) {
        super(dataHolder, i);
    }

    public final icf a(icc icc, int i, int i2) {
        return r().a(icc, i, i2);
    }
}
