package defpackage;

/* renamed from: aial  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aial {
    final /* synthetic */ long a;
    final /* synthetic */ airn b;
    final /* synthetic */ airm c;

    public aial() {
    }

    public final void a(aiaj aiaj) {
        aibe a2 = this.c.a(aiaj, this.a);
        if (a2 != null && a2.a()) {
            airn airn = this.b;
            double b2 = aell.b(a2.b);
            double b3 = aell.b(a2.c);
            int a3 = aias.a(a2.d);
            int i = airn.c;
            int[] iArr = airn.f;
            if (i < iArr.length && a3 <= 5000) {
                airn.a += b2;
                airn.b += b3;
                airn.d[i] = b2;
                airn.e[i] = b3;
                iArr[i] = a3;
                airn.c = i + 1;
            }
        }
    }

    public aial(airm airm, long j, airn airn) {
        this.c = airm;
        this.a = j;
        this.b = airn;
    }
}
