package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: angs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class angs extends anhh {
    final /* synthetic */ angt a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public angs(angt angt, Iterator it) {
        super(it);
        this.a = angt;
    }

    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new angr(this, (Map.Entry) obj);
    }
}
