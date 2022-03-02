package defpackage;

import java.io.IOException;

/* renamed from: banf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class banf {
    public final bamt a;
    public final baoa b;
    public int c = 65535;
    public final band d = new band(this, 0, 65535);

    public banf(bamt bamt, baoa baoa) {
        amrl.a((Object) bamt, (Object) "transport");
        this.a = bamt;
        amrl.a((Object) baoa, (Object) "frameWriter");
        this.b = baoa;
    }

    private final band a(baml baml) {
        Object obj = baml.f;
        if (obj != null) {
            return (band) obj;
        }
        band band = new band(this, baml, this.c);
        baml.f = band;
        return band;
    }

    public final void b() {
        baml[] d2 = this.a.d();
        int i = this.d.c;
        int length = d2.length;
        while (true) {
            int i2 = 0;
            if (length > 0 && i > 0) {
                int ceil = (int) Math.ceil((double) (((float) i) / ((float) length)));
                for (int i3 = 0; i3 < length && i > 0; i3++) {
                    baml baml = d2[i3];
                    band a2 = a(baml);
                    int min = Math.min(i, Math.min(a2.a(), ceil));
                    if (min > 0) {
                        a2.d += min;
                        i -= min;
                    }
                    if (a2.a() > 0) {
                        d2[i2] = baml;
                        i2++;
                    }
                }
                length = i2;
            }
        }
        bane bane = new bane();
        for (baml a3 : this.a.d()) {
            band a4 = a(a3);
            a4.a(a4.d, bane);
            a4.d = 0;
        }
        if (bane.a()) {
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        try {
            this.b.b();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public final void a(baml baml, int i) {
        if (baml != null) {
            band a2 = a(baml);
            a2.a(i);
            bane bane = new bane();
            a2.a(a2.b(), bane);
            if (bane.a()) {
                a();
                return;
            }
            return;
        }
        this.d.a(i);
        b();
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z, int i, batd batd, boolean z2) {
        amrl.a((Object) batd, (Object) "source");
        baml b2 = this.a.b(i);
        if (b2 != null) {
            band a2 = a(b2);
            int b3 = a2.b();
            boolean c2 = a2.c();
            int i2 = (int) batd.b;
            if (c2 || b3 < i2) {
                if (!c2 && b3 > 0) {
                    a2.a(batd, b3, false);
                }
                a2.a.a(batd, (long) ((int) batd.b));
                a2.f = z | a2.f;
            } else {
                a2.a(batd, i2, z);
            }
            if (z2) {
                a();
            }
        }
    }
}
