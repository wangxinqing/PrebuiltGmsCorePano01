package defpackage;

import java.util.Random;

/* renamed from: aqiy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqiy extends aqjm {
    private final Random a;

    public aqiy(aqjq aqjq) {
        this.a = aqjq.b();
    }

    public final void a(aqjc aqjc) {
        aqjc.b[2] = this.a.nextDouble() * 6.283185307179586d;
    }
}
