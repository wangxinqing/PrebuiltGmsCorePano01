package defpackage;

import java.util.Calendar;
import java.util.TimeZone;

/* renamed from: ahoz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ahoz {
    private static final int a = ahpf.a.length;
    private final ahpa b = new ahpa(a);
    private final ahpa c = new ahpa(a);
    private final ahpa d = new ahpa(a);
    private final float e;
    private int f = 0;
    private float g = -1.0f;

    public ahoz(String str) {
        this.e = ahpb.a.containsKey(str) ? ((Float) ahpb.a.get(str)).floatValue() : 1.0f;
    }

    public final synchronized ahpf a(aizu aizu) {
        ahpf ahpf;
        int i;
        boolean z;
        float f2;
        ahpf = new ahpf();
        int i2 = (int) (aizu.f / 1000);
        int i3 = this.f;
        int i4 = i2 - i3;
        if (i3 != 0) {
            i = ((i4 + 60) / 360) - 1;
        } else {
            i = a;
        }
        if (i3 == 0 || i4 >= 330) {
            z = true;
        } else {
            z = false;
        }
        for (int i5 = 0; i5 < i; i5++) {
            this.c.a(0.002f);
        }
        this.c.a(aizu.c);
        ahpf.f = this.c.a(2);
        ahpf.g = this.c.a(1);
        ahpf.h = this.c.a(0);
        int i6 = 0;
        while (true) {
            f2 = 0.0f;
            if (i6 >= i) {
                break;
            }
            this.b.a(0.0f);
            i6++;
        }
        float min = Math.min(1000.0f, this.e * aizu.a);
        ahpf.b = min;
        float f3 = this.g;
        if (f3 != -1.0f) {
            f2 = min - f3;
        }
        this.b.a(f2);
        ahpf.c = this.b.a(2);
        ahpf.d = this.b.a(1);
        ahpf.e = this.b.a(0);
        this.g = min;
        for (int i7 = 0; i7 < i; i7++) {
            this.d.a(2.0f);
        }
        this.d.a(aizu.e);
        ahpf.H = this.d.a(2);
        ahpf.I = this.d.a(1);
        ahpf.J = this.d.a(0);
        ahpf.L = (float) aizu.g;
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone(TimeZone.getDefault().getID()));
        instance.setTimeInMillis(((long) i2) * 1000);
        ahpf.K = (float) instance.get(11);
        if (z) {
            this.f = i2;
        }
        return ahpf;
    }
}
