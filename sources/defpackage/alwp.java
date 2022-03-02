package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: alwp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alwp extends alvf {
    private final alwe a;
    private final alwd b = new alwo();

    public alwp(alwl alwl) {
        super(40);
        this.a = new alwe(alwl);
    }

    public final /* bridge */ /* synthetic */ Object a(alze alze) {
        amim a2 = amin.a();
        this.b.a(alze, (Object) a2);
        amin amin = new amin(a2);
        a2.a = new ArrayList();
        a2.b = amjf.a;
        return amin;
    }

    public final /* bridge */ /* synthetic */ void a(alzd alzd, Object obj) {
        a(alzd);
        this.a.a(alzd, (Collection) Collections.unmodifiableList(((amin) obj).a));
        alzd.b();
    }
}
