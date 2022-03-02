package defpackage;

import java.util.List;

/* renamed from: cup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class cup implements acvv {
    private final cuw a;

    public cup(cuw cuw) {
        this.a = cuw;
    }

    public final void a(Object obj) {
        cuw cuw = this.a;
        for (csw csw : (List) obj) {
            aw a2 = cuw.a.a(csw.a);
            Iterable iterable = (anax) a2.b();
            if (iterable == null) {
                iterable = anfv.a;
            }
            anav anav = new anav();
            anav.b(iterable);
            anav.b(csw.b);
            a2.b(anav.a());
        }
        for (aw awVar : cuw.a.b.values()) {
            if (awVar.b() == null) {
                awVar.b(anfv.a);
            }
        }
        cuw.a.e = true;
    }
}
