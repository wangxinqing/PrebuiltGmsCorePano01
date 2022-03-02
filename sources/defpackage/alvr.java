package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: alvr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alvr extends alvf {
    private final alwe a = new alwe(new alwi());
    private final alwd b = new alvq();

    public alvr() {
        super(48);
    }

    public final /* bridge */ /* synthetic */ Object a(alze alze) {
        alze.c();
        ArrayList arrayList = new ArrayList();
        this.b.a(alze, (Object) arrayList);
        alrp a2 = alrp.a(alze.g());
        alze.d();
        return new alrq(arrayList, a2);
    }

    public final /* bridge */ /* synthetic */ void a(alzd alzd, Object obj) {
        alrq alrq = (alrq) obj;
        alzd.a();
        this.a.a(alzd, (Collection) alrq.a);
        alzd.b(alrq.b.name());
        alzd.b();
    }
}
