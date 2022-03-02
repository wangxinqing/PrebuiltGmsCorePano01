package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: alvx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alvx implements alvb, alva {
    private final alwe a = new alwe(new alwi());
    private final alwe b = new alwe(new alxa(true));
    private final alwd c = new alvv();
    private final alwd d = new alvw();

    public final /* bridge */ /* synthetic */ Object a(alze alze) {
        alze.c();
        String g = alze.g();
        String g2 = alze.g();
        alyv alyv = !alze.e() ? alyv.READ_WRITE : alyv.READ_ONLY;
        int b2 = alze.b();
        ArrayList arrayList = new ArrayList();
        this.c.a(alze, (Object) arrayList);
        ArrayList arrayList2 = new ArrayList();
        if (!alze.f()) {
            this.d.a(alze, (Object) arrayList2);
        }
        alrs alrs = new alrs(new alrt(g, b2, g2, Collections.emptyList()), alyv, arrayList, arrayList2, alze.g());
        alze.d();
        return alrs;
    }

    public final /* bridge */ /* synthetic */ void a(alzd alzd, Object obj) {
        boolean z;
        alrs alrs = (alrs) obj;
        if (alrs.b == alyv.READ_ONLY) {
            z = true;
        } else {
            z = false;
        }
        alzd.a();
        alzd.b(alrs.a.a);
        alzd.b(alrs.a.c);
        alzd.a(z);
        alzd.a(alrs.a.b);
        this.a.a(alzd, (Collection) alrs.c);
        this.b.a(alzd, (Collection) new ArrayList(alrs.d));
        alzd.b(alrs.e);
        alzd.b();
    }
}
