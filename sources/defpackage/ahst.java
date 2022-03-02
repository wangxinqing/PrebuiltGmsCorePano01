package defpackage;

import java.util.List;

/* renamed from: ahst  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahst extends ahum {
    private final List a;

    public ahst(ahss ahss, ajrh ajrh, List list) {
        super(ahss, ajrh, new ahuz(false));
        this.a = list;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((ahum) list.get(i)).a();
        }
    }

    /* access modifiers changed from: protected */
    public final boolean a(aqek aqek, aqek aqek2) {
        List list = this.a;
        int size = list.size();
        boolean z = true;
        for (int i = 0; i < size; i++) {
            z = ((ahum) list.get(i)).b(aqek, aqek2) && z;
        }
        return z;
    }
}
