package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: bmf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bmf {
    public final String a;
    public final Queue b = new ArrayDeque();
    public boolean c = false;
    final /* synthetic */ bml d;

    public bmf(bml bml, String str) {
        this.d = bml;
        this.a = str;
    }

    public final void a() {
        bme bme = (bme) this.b.peek();
        amtf.a((Object) bme);
        bmd a2 = bme.a();
        boolean z = true;
        if (a2 == null) {
            if (bme.c <= 0 && bme.e) {
                z = false;
            }
            amtf.a(z);
            return;
        }
        do {
            int i = bme.c;
            if (i == 0) {
                bme.d = a2.f;
            } else if (a2.f != bme.d || i >= 3) {
                return;
            }
            bme.c++;
            bml bml = bme.f.d;
            bml.h++;
            bml.i.add((bmd) bme.b.remove());
            bml bml2 = bme.f.d;
            bml2.d.execute(bml2.n);
            a2 = bme.a();
        } while (a2 != null);
    }

    public final void b() {
        this.b.remove();
        if (this.b.isEmpty()) {
            bmf bmf = (bmf) this.d.g.remove(this.a);
            boolean z = false;
            this.c = false;
            if (bmf == this) {
                z = true;
            }
            amtf.a(z);
            return;
        }
        a();
    }
}
