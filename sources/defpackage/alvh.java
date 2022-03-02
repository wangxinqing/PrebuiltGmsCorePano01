package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: alvh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alvh extends alvf {
    private final alwe a = new alwe(new alvi());
    private final alwd b = new alvg();

    public alvh() {
        super(37);
    }

    public final /* bridge */ /* synthetic */ Object a(alze alze) {
        ArrayList arrayList = new ArrayList();
        this.b.a(alze, (Object) arrayList);
        return new alrk(arrayList);
    }

    public final /* bridge */ /* synthetic */ void a(alzd alzd, Object obj) {
        ArrayList arrayList = new ArrayList(((alrk) obj).a);
        a(alzd);
        this.a.a(alzd, (Collection) arrayList);
        alzd.b();
    }
}
