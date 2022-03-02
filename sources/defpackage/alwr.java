package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: alwr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class alwr implements alvb, alva {
    private final alwe a = new alwe(new alwi());
    private final alwd b = new alwq();

    public final /* bridge */ /* synthetic */ Object a(alze alze) {
        alze.c();
        int b2 = alze.b();
        long parseLong = Long.parseLong(alze.g(), 16);
        ArrayList arrayList = new ArrayList();
        this.b.a(alze, (Object) arrayList);
        alze.d();
        return new alru(b2, parseLong, arrayList);
    }

    public final void a(alzd alzd, alru alru) {
        alzd.a();
        alzd.a(alru.a);
        alzd.b(Long.toHexString(alru.b));
        this.a.a(alzd, (Collection) alru.c);
        alzd.b();
    }
}
