package defpackage;

/* renamed from: ahwm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahwm {
    public long a = -1;
    public long b = -1;
    public aiwz c = null;
    private final ahqu d;
    private final ahwl e = new ahwl();

    public ahwm(ahqu ahqu) {
        this.d = ahqu;
    }

    /* access modifiers changed from: package-private */
    public final int a(aibt aibt, long j) {
        int i = 0;
        for (int i2 = 0; i2 < aibt.b(); i2++) {
            ahqt a2 = this.d.a.a(aibt.a(i2));
            long j2 = a2 != null ? a2.c : -1;
            if (j2 == -1 || j - j2 > 600000) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public final void a(aiwz aiwz, aiaj aiaj, aibt aibt) {
        if (aiwz != null) {
            this.c = aiwz;
        }
        if (aiaj != null) {
            this.b = aiaj.g;
            if (aiwz != null) {
                this.e.a(aiaj, aiwz);
            }
        }
        if (aibt != null) {
            this.a = aibt.a;
            ahqu ahqu = this.d;
            if (ahqu != null) {
                long c2 = ahqu.b.c();
                for (int i = 0; i < aibt.b(); i++) {
                    ahqu.a(aibt.a(i), c2).c = c2;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(aiaj aiaj, aiwz aiwz) {
        int i;
        aiwz aiwz2 = aiwz;
        ahwl ahwl = this.e;
        if (aiwz2 == null) {
            return false;
        }
        String a2 = aiaj.a();
        double b2 = aiwz.b();
        double c2 = aiwz.c();
        int i2 = 0;
        while (i2 < 20) {
            if (!ahwl.b[i2] || !ahwl.a[i2].equals(a2)) {
                i = i2;
            } else {
                i = i2;
                if (aell.b(ahwl.c[i2], ahwl.d[i2], b2, c2) < 50.0d) {
                    return true;
                }
            }
            i2 = i + 1;
        }
        ahwl.a(aiaj, aiwz2);
        return false;
    }
}
