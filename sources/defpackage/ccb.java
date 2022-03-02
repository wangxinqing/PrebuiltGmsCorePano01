package defpackage;

import android.content.Context;
import java.util.Collection;

/* renamed from: ccb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ccb extends cbv {
    private final Collection f;

    public ccb(Context context, bsz bsz, Collection collection, cbm cbm, but but) {
        super(context, "ReportServerFenceResultsTask", bsz, "reportfenceresults", 12555, 13, atqp.b, awwb.b(), cbm, but, (String) null);
        iva.a((Object) collection);
        this.f = collection;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ atqk a(audx audx) {
        atqk atqk = ((atqp) audx).a;
        return atqk == null ? atqk.c : atqk;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ audx c() {
        aucd o = atqo.d.o();
        atqj a = cbn.a(this.c, this.d);
        if (o.c) {
            o.c();
            o.c = false;
        }
        atqo atqo = (atqo) o.b;
        a.getClass();
        atqo.b = a;
        atqo.a |= 1;
        for (bzm bzm : this.f) {
            int a2 = atrg.a(bzm.l);
            if (a2 == 0) {
                a2 = 1;
            }
            aucd o2 = atrd.e.o();
            aucd o3 = atre.d.o();
            String str = bzm.a;
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            atre atre = (atre) o3.b;
            str.getClass();
            int i = atre.a | 1;
            atre.a = i;
            atre.b = str;
            long j = bzm.c;
            atre.a = i | 2;
            atre.c = j;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atrd atrd = (atrd) o2.b;
            atre atre2 = (atre) o3.i();
            atre2.getClass();
            atrd.b = atre2;
            atrd.a |= 1;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atrd atrd2 = (atrd) o2.b;
            atrd2.c = a2 - 1;
            int i2 = atrd2.a | 2;
            atrd2.a = i2;
            long j2 = bzm.o;
            atrd2.a = i2 | 4;
            atrd2.d = j2;
            atrd atrd3 = (atrd) o2.i();
            if (o.c) {
                o.c();
                o.c = false;
            }
            atqo atqo2 = (atqo) o.b;
            atrd3.getClass();
            if (!atqo2.c.a()) {
                atqo2.c = aucj.a(atqo2.c);
            }
            atqo2.c.add(atrd3);
            bzm.q = 2;
        }
        new Object[1][0] = o.i();
        return (atqo) o.i();
    }
}
