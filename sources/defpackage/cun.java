package defpackage;

import java.util.List;

/* renamed from: cun  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cun implements acvv {
    private final cuw a;

    public cun(cuw cuw) {
        this.a = cuw;
    }

    public final void a(Object obj) {
        cuw cuw = this.a;
        for (cui cui : (List) obj) {
            ctt ctt = new ctt(dio.a(cui.a), cui.c, cui.b, cui.d, cvm.a(cui.e));
            csl csl = cui.f;
            cuw.a.b(ctt).b(new csl(csq.a(csl.a), csl.b));
        }
        cuw.a.a().b(true);
    }
}
