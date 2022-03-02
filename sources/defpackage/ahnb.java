package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ahnb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahnb {
    public static final ahmn[] a = {ahmn.UNKNOWN, ahmn.OFF_BODY};
    private final ahmu b;

    public ahnb(ByteBuffer byteBuffer, long j) {
        this.b = new ahmu(a, byteBuffer, j);
    }

    public final List a(ahne ahne) {
        int i = 0;
        for (int i2 = 0; i2 < this.b.a(); i2++) {
            i += this.b.a(i2, new float[]{ahne.a, ahne.b, ahne.c, ahne.d, ahne.e, ahne.f, ahne.g, ahne.h, ahne.i, ahne.j, ahne.k, ahne.l, ahne.m, ahne.n, ahne.o, ahne.p, ahne.q, ahne.r, ahne.s, ahne.t, ahne.u, ahne.v, ahne.w, ahne.x, ahne.y, ahne.z, ahne.A, ahne.B, ahne.C, ahne.D, ahne.E, ahne.F, ahne.G, ahne.H, ahne.I}).a();
        }
        int round = Math.round(((float) i) / ((float) this.b.a()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ahmo(ahmn.OFF_BODY, round));
        return arrayList;
    }
}
