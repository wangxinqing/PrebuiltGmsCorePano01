package defpackage;

import android.content.Context;
import java.util.Collection;

/* renamed from: cbz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class cbz extends cbv {
    private final Collection f;

    public cbz(Context context, bsz bsz, Collection collection, cbm cbm, but but) {
        super(context, "ReadServerFenceUpdatesTask", bsz, "readfenceupdates", 12554, 12, atqn.c, awwb.b(), cbm, but, (String) null);
        this.f = collection;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ atqk a(audx audx) {
        atqk atqk = ((atqn) audx).a;
        return atqk == null ? atqk.c : atqk;
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [java.util.List, java.util.Collection] */
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ audx c() {
        aucd o = atqm.d.o();
        atqj a = cbn.a(this.c, this.d);
        if (o.c) {
            o.c();
            o.c = false;
        }
        atqm atqm = (atqm) o.b;
        a.getClass();
        atqm.b = a;
        atqm.a |= 1;
        ? r1 = this.f;
        int size = r1.size();
        for (int i = 0; i < size; i++) {
            bzm bzm = (bzm) r1.get(i);
            aucd o2 = atre.d.o();
            String str = bzm.a;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atre atre = (atre) o2.b;
            str.getClass();
            int i2 = atre.a | 1;
            atre.a = i2;
            atre.b = str;
            long j = bzm.c;
            atre.a = i2 | 2;
            atre.c = j;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atqm atqm2 = (atqm) o.b;
            atre atre2 = (atre) o2.i();
            atre2.getClass();
            if (!atqm2.c.a()) {
                atqm2.c = aucj.a(atqm2.c);
            }
            atqm2.c.add(atre2);
        }
        new Object[1][0] = o.i();
        return (atqm) o.i();
    }
}
