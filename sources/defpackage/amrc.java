package defpackage;

import java.util.Iterator;

/* renamed from: amrc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amrc extends amre {
    final /* synthetic */ amre a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public amrc(amre amre, amre amre2) {
        super(amre2);
        this.a = amre;
    }

    public final void a(Appendable appendable, Iterator it) {
        amrl.a((Object) appendable, (Object) "appendable");
        amrl.a((Object) it, (Object) "parts");
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                appendable.append(amre.a(next));
                break;
            }
        }
        while (it.hasNext()) {
            Object next2 = it.next();
            if (next2 != null) {
                appendable.append(this.a.b);
                appendable.append(amre.a(next2));
            }
        }
    }
}
