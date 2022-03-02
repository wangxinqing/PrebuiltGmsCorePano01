package defpackage;

import android.content.Context;
import com.google.android.gms.contextmanager.ContextData;
import java.util.Collection;

/* renamed from: ccc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ccc extends cbv {
    private final Collection f;

    public ccc(Context context, bsz bsz, Collection collection, cbm cbm, but but) {
        super(context, "WriteBatchTask", bsz, "writebatchinternal", 12547, 4, atra.b, awwb.b(), cbm, but, (String) null);
        iva.a((Object) collection);
        this.f = collection;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ atqk a(audx audx) {
        atqk atqk = ((atra) audx).a;
        return atqk == null ? atqk.c : atqk;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ audx c() {
        aucd o = atqz.d.o();
        atqj a = cbn.a(this.c, this.d);
        if (o.c) {
            o.c();
            o.c = false;
        }
        atqz atqz = (atqz) o.b;
        a.getClass();
        atqz.b = a;
        atqz.a |= 1;
        for (ContextData contextData : this.f) {
            auay au = contextData.c().au();
            if (o.c) {
                o.c();
                o.c = false;
            }
            atqz atqz2 = (atqz) o.b;
            au.getClass();
            if (!atqz2.c.a()) {
                atqz2.c = aucj.a(atqz2.c);
            }
            atqz2.c.add(au);
            new Object[1][0] = contextData;
        }
        return (atqz) o.i();
    }
}
