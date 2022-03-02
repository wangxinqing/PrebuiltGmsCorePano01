package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: alvk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alvk extends alvc {
    private final alwe b = new alwe(new alvl());
    private final alwd c = new alvj();

    public alvk(boolean z) {
        super(3, z);
    }

    public final /* bridge */ /* synthetic */ Object a(alze alze) {
        if (!this.a) {
            alze.c();
        }
        ArrayList arrayList = new ArrayList();
        this.c.a(alze, (Object) arrayList);
        if (!this.a) {
            alze.d();
        }
        return new alrn(arrayList);
    }

    public final /* bridge */ /* synthetic */ void a(alzd alzd, Object obj) {
        a(alzd);
        this.b.a(alzd, (Collection) ((alrn) obj).a);
        alzd.b();
    }
}
