package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* renamed from: alup  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class alup extends aluo {
    private final List f = new ArrayList();

    public alup(alui alui, alsu alsu, alss alss, boolean z) {
        super(alui, alsu, alss);
        this.e = z;
    }

    public final alse a() {
        throw new UnsupportedOperationException("Cannot use CompoundOperations while applying remote operations.");
    }

    /* access modifiers changed from: protected */
    public final void b(amiw amiw) {
        this.f.add(this.b.a(amiw));
    }

    public final boolean b() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void c(amiw amiw) {
    }

    public final alse a(amiw amiw) {
        c();
        d(amiw);
        d();
        List a = this.d.a();
        Collection b = this.d.b();
        Set e = e();
        alsw alsw = alsw.a;
        List list = this.f;
        int size = list.size();
        alsw alsw2 = alsw;
        for (int i = 0; i < size; i++) {
            alsw2 = alsw2.a((alsw) list.get(i));
        }
        return new alse(a, b, e, (amiw) null, alsw2, amiw, (alsh) null);
    }

    public final void a(String str, altz altz) {
        throw new UnsupportedOperationException("Cannot use CompoundOperations while applying remote operations.");
    }
}
