package defpackage;

import android.graphics.PointF;
import java.util.Collections;
import java.util.List;

/* renamed from: axr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class axr implements axz {
    public final List a;

    public axr() {
        this.a = Collections.singletonList(new bbc(new PointF(0.0f, 0.0f)));
    }

    public final awm a() {
        if (((bbc) this.a.get(0)).d()) {
            return new awv(this.a);
        }
        return new awu(this.a);
    }

    public final List b() {
        return this.a;
    }

    public final boolean c() {
        return this.a.size() == 1 && ((bbc) this.a.get(0)).d();
    }

    public axr(List list) {
        this.a = list;
    }
}
