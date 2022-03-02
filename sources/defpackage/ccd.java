package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Set;

/* renamed from: ccd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ccd extends cbv {
    private final Set f;

    public ccd(Context context, bsz bsz, Set set, cbm cbm, but but) {
        super(context, "WriteInterestRecordTask", bsz, "writeinterestrecords", 12546, 3, atrc.d, awwb.b(), cbm, but, (String) null);
        this.f = set;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ atqk a(audx audx) {
        atqk atqk = ((atrc) audx).a;
        return atqk == null ? atqk.c : atqk;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ audx c() {
        aucd o = atrb.d.o();
        atqj a = cbn.a(this.c, this.d);
        if (o.c) {
            o.c();
            o.c = false;
        }
        atrb atrb = (atrb) o.b;
        a.getClass();
        atrb.b = a;
        atrb.a |= 1;
        Set set = this.f;
        if (!atrb.c.a()) {
            atrb.c = aucj.a(atrb.c);
        }
        auab.a((Iterable) set, (List) atrb.c);
        atrb atrb2 = (atrb) o.i();
        new Object[1][0] = atrb2;
        return atrb2;
    }
}
