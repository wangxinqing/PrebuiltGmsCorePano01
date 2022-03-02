package defpackage;

import android.graphics.Path;
import java.util.List;

/* renamed from: awi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awi implements awe, awl {
    private final Path a = new Path();
    private final boolean b;
    private final avc c;
    private final awm d;
    private boolean e;
    private final avt f = new avt();

    public awi(avc avc, ayu ayu, ayo ayo) {
        this.b = ayo.b;
        this.c = avc;
        awm a2 = ayo.a.a();
        this.d = a2;
        ayu.a(a2);
        this.d.a((awl) this);
    }

    public final void a() {
        this.e = false;
        this.c.invalidateSelf();
    }

    public final String b() {
        throw null;
    }

    public final Path e() {
        if (!this.e) {
            this.a.reset();
            if (!this.b) {
                this.a.set((Path) this.d.f());
                this.a.setFillType(Path.FillType.EVEN_ODD);
                this.f.a(this.a);
            }
            this.e = true;
        }
        return this.a;
    }

    public final void a(List list, List list2) {
        for (int i = 0; i < list.size(); i++) {
            avu avu = (avu) list.get(i);
            if (avu instanceof awk) {
                awk awk = (awk) avu;
                if (awk.e == 1) {
                    this.f.a(awk);
                    awk.a(this);
                }
            }
        }
    }
}
