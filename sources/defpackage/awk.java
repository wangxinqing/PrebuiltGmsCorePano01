package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: awk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awk implements avu, awl {
    public final boolean a;
    public final awm b;
    public final awm c;
    public final awm d;
    public final int e;
    private final List f = new ArrayList();

    public awk(ayu ayu, ays ays) {
        this.a = ays.d;
        this.e = ays.e;
        this.b = ays.a.a();
        this.c = ays.b.a();
        this.d = ays.c.a();
        ayu.a(this.b);
        ayu.a(this.c);
        ayu.a(this.d);
        this.b.a((awl) this);
        this.c.a((awl) this);
        this.d.a((awl) this);
    }

    public final void a() {
        for (int i = 0; i < this.f.size(); i++) {
            ((awl) this.f.get(i)).a();
        }
    }

    public final void a(List list, List list2) {
    }

    public final String b() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final void a(awl awl) {
        this.f.add(awl);
    }
}
