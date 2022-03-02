package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: alwv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alwv extends alvc {
    private final alwe b;
    private final alwd c = new alwu();

    public alwv(alwi alwi, boolean z) {
        super(41, z);
        this.b = new alwe(alwi);
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
        return arrayList;
    }

    public final /* bridge */ /* synthetic */ void a(alzd alzd, Object obj) {
        a(alzd);
        this.b.a(alzd, (Collection) (List) obj);
        alzd.b();
    }
}
