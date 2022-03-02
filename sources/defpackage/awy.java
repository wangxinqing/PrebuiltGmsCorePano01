package defpackage;

import android.graphics.PointF;
import java.util.Collections;

/* renamed from: awy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class awy extends awm {
    private final PointF e = new PointF();
    private final awm f;
    private final awm g;

    public awy(awm awm, awm awm2) {
        super(Collections.emptyList());
        this.f = awm;
        this.g = awm2;
        a(this.c);
    }

    public final /* bridge */ /* synthetic */ Object a(bbc bbc, float f2) {
        return this.e;
    }

    public final /* bridge */ /* synthetic */ Object f() {
        return this.e;
    }

    public final void a(float f2) {
        this.f.a(f2);
        this.g.a(f2);
        this.e.set(((Float) this.f.f()).floatValue(), ((Float) this.g.f()).floatValue());
        for (int i = 0; i < this.a.size(); i++) {
            ((awl) this.a.get(i)).a();
        }
    }
}
