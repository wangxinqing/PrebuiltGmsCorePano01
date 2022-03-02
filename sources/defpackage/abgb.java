package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: abgb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abgb implements ablg {
    private boolean a;
    private abmg b;
    private abgl c;
    private final List d = new ArrayList();

    private final void a() {
        if (b()) {
            boolean c2 = c();
            List list = this.d;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((abga) list.get(i)).a(c2);
            }
        }
    }

    private final boolean b() {
        return this.a && this.c != null;
    }

    private final boolean c() {
        abmg abmg = this.b;
        return abmg != null && abmg.a != null && this.c.c() && this.b.a.equals(this.c.d.i);
    }

    public final void a(abga abga) {
        this.d.add(abga);
        if (b()) {
            abga.a(c());
        }
    }

    public final void a(abgl abgl) {
        this.c = abgl;
        a();
    }

    public final void a(abmg abmg) {
        this.a = true;
        this.b = abmg;
        a();
    }
}
