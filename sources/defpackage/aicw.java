package defpackage;

/* renamed from: aicw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aicw implements aqio {
    public final aicv a = new aicv((int) ayam.a.a().flpParticleFusionClearcutMaxFilterUpDeltas());
    public final aicv b = new aicv((int) ayam.a.a().flpParticleFusionClearcutMaxPositionReInitDeltas());
    public final aicv c = new aicv((int) ayam.a.a().flpParticleFusionClearcutMaxCarryChangeDeltas());
    public final aicv d = new aicv((int) ayam.a.a().flpParticleFusionClearcutMaxReProjectionDeltas());
    public int e = 0;
    public int f = 1;
    public int g = 1;

    public final void a() {
        this.e++;
    }

    /* access modifiers changed from: package-private */
    public final void b(int i) {
        if (ayam.b()) {
            this.g = i;
        }
    }

    public final void c(long j) {
        this.c.a(j);
    }

    public final void d(long j) {
        this.d.a(j);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i) {
        if (ayam.b()) {
            this.f = i;
        }
    }

    public final void b(long j) {
        this.b.a(j);
    }

    public final void a(long j) {
        this.a.a(j);
    }
}
