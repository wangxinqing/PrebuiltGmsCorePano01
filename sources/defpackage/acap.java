package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: acap  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acap {
    private final List a = new ArrayList(0);
    private final aucd b;

    public acap(aucd aucd) {
        amrl.a((Object) aucd);
        this.b = aucd;
    }

    public final anvq a() {
        aucd aucd = this.b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anvq anvq = anvq.e;
        ((anvq) aucd.b).d = aucj.q();
        List list = this.a;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anvq anvq2 = (anvq) aucd.b;
        if (!anvq2.d.a()) {
            anvq2.d = aucj.a(anvq2.d);
        }
        auab.a((Iterable) list, (List) anvq2.d);
        return (anvq) this.b.i();
    }

    public final void a(int i) {
        this.a.add(Integer.valueOf(i));
        aucd aucd = this.b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anvq anvq = (anvq) aucd.b;
        anvq anvq2 = anvq.e;
        anvq.a |= 2;
        anvq.c = i;
    }

    public final void a(boolean z) {
        aucd aucd = this.b;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anvq anvq = (anvq) aucd.b;
        anvq anvq2 = anvq.e;
        anvq.a |= 1;
        anvq.b = z;
    }
}
