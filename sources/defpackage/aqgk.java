package defpackage;

import java.util.NoSuchElementException;

/* renamed from: aqgk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aqgk {
    private static final double[] b = {0.3d, 0.3d, 0.4d};
    private static final boolean[] c = {true, true, false};
    public aqgf a = aqgf.UNKNOWN;
    private aqgf d = aqgf.UNKNOWN;
    private final aemf e;
    private final aemb f;
    private final aemb g;
    private final aemb h;
    private final aemb i;

    public aqgk() {
        double[] dArr = b;
        aemd aemd = new aemd();
        aemd.a(0, 0, 0.6d);
        aemd.a(0, 1, 0.39d);
        aemd.a(0, 2, 0.01d);
        aemd.a(1, 0, 0.3d);
        aemd.a(1, 1, 0.6d);
        aemd.a(1, 2, 0.1d);
        aemd.a(2, 0, 0.39d);
        aemd.a(2, 1, 0.01d);
        aemd.a(2, 2, 0.6d);
        this.e = new aemf(dArr, aemd);
        aemc aemc = new aemc();
        aemc.a(0, 2, 0.925d);
        aemc.a(0, 3, 0.065d);
        aemc.a(0, 0, 0.95d);
        aemc.a(0, 1, 0.01d);
        aemc.a(1, 2, 0.925d);
        aemc.a(1, 3, 0.065d);
        aemc.a(1, 0, 0.1d);
        aemc.a(1, 1, 0.95d);
        aemc.a(2, 2, 0.037d);
        aemc.a(2, 3, 0.955d);
        aemc.a(2, 0, 0.1d);
        int i2 = 0;
        while (i2 < 4) {
            int i3 = 0;
            while (i3 < 3) {
                if (i3 == 2 || aemc.a[i2][i3] != 2) {
                    i3++;
                } else {
                    throw new IllegalArgumentException(String.format("Can't link state %s because state %s already links to it", new Object[]{2, Integer.valueOf(i3)}));
                }
            }
            byte[] bArr = aemc.a[i2];
            if (bArr[1] != 1) {
                throw new IllegalArgumentException(String.format("Can't link to a state that already has a link: state=%s", new Object[]{1}));
            } else if (i2 == 1 || bArr[2] == 2) {
                i2++;
            } else {
                throw new IllegalArgumentException(String.format("Can't link more than one observation on state %s, obs1=%s, obs2=%s", new Object[]{1, 1, Integer.valueOf(i2)}));
            }
        }
        aemc.a[1][2] = 1;
        this.f = aemc.a(2);
        this.g = aemc.a(3);
        this.h = aemc.a(1);
        this.i = aemc.a(0);
    }

    public final void a() {
        this.e.a();
        this.d = aqgf.UNKNOWN;
    }

    public final void a(aqey aqey) {
        if (!aqey.a()) {
            return;
        }
        if (aqey.e >= 5.0f) {
            this.e.a(this.i);
        } else {
            this.e.a(this.h);
        }
    }

    public final void a(aqgf aqgf) {
        if (aqgf.equals(aqgf.ON_BICYCLE) || aqgf.equals(aqgf.IN_VEHICLE)) {
            this.e.a(this.f);
        } else if (aqgf.equals(aqgf.ON_FOOT)) {
            this.e.a(this.g);
        }
        aemf aemf = this.e;
        aeme aeme = aemf.c;
        aeme.c = aemf.f;
        aemf aemf2 = aeme.d;
        aeme.a = aemf2.d;
        aeme.e = aemf2.g;
        aeme.b = aemf2.e + 1;
        boolean[] zArr = c;
        int i2 = aeme.b;
        if (i2 > 0) {
            int i3 = aeme.c;
            int i4 = i2 - 1;
            aeme.b = i4;
            if (i4 > 0) {
                int i5 = aeme.a - 1;
                aeme.a = i5;
                if (i5 < 0) {
                    i5 = aeme.d.e - 1;
                    aeme.a = i5;
                }
                aemf aemf3 = aeme.d;
                aeme.c = aemf3.a[i3][i5];
                aeme.e = (aemb) aemf3.b.get(i5);
            }
            aqgf aqgf2 = (!zArr[i3] || this.d == aqgf.UNKNOWN) ? aqgf : this.d;
            if (aqgf.equals(aqgf.IN_VEHICLE) || aqgf.equals(aqgf.ON_BICYCLE)) {
                this.d = aqgf;
            }
            this.a = aqgf2;
            return;
        }
        throw new NoSuchElementException("No more elements to iterate");
    }
}
