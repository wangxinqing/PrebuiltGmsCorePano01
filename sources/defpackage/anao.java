package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: anao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class anao extends anhj {
    final Iterator a = this.d.b.entrySet().iterator();
    Object b = null;
    Iterator c = anby.a;
    final /* synthetic */ anau d;

    public anao(anau anau) {
        this.d = anau;
    }

    public final boolean hasNext() {
        return this.c.hasNext() || this.a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (!this.c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.a.next();
            this.b = entry.getKey();
            this.c = ((amzn) entry.getValue()).iterator();
        }
        return anet.a(this.b, this.c.next());
    }
}
