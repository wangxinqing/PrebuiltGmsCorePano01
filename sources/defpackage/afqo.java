package defpackage;

import java.util.List;

/* renamed from: afqo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class afqo implements aoqb {
    private final afqr a;
    private final afli b;
    private final afkn c;
    private final aflf d;
    private final aflh e;
    private final aflb f;
    private final int g;
    private final List h;

    public afqo(afqr afqr, afli afli, afkn afkn, aflf aflf, aflh aflh, aflb aflb, int i, List list) {
        this.a = afqr;
        this.b = afli;
        this.c = afkn;
        this.d = aflf;
        this.e = aflh;
        this.f = aflb;
        this.g = i;
        this.h = list;
    }

    public final aorr a(Object obj) {
        String str;
        int i;
        afqr afqr = this.a;
        afli afli = this.b;
        afkn afkn = this.c;
        aflf aflf = this.d;
        aflh aflh = this.e;
        aflb aflb = this.f;
        int i2 = this.g;
        List list = this.h;
        afku afku = (afku) obj;
        aucd aucd = (aucd) afli.c(5);
        aucd.a((aucj) afli);
        String str2 = afli.b;
        if (afku != null) {
            str = afrt.a(str2, afku.d);
        } else if ((afkn.a & 32) != 0) {
            str = afrt.a(str2, afkn.h);
        } else {
            str = str2;
        }
        afkr a2 = afqr.i.a(aflf);
        if (a2 != null) {
            i = a2.e;
        } else {
            i = 0;
        }
        return aopr.a(aorl.a((Object) Integer.valueOf(i)), (aoqb) new afqq(afqr, aucd, aflh, str, aflf, afkn, afku, aflb, i2, list), afqr.k);
    }
}
