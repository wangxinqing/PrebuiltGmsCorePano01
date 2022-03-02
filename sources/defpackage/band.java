package defpackage;

import java.io.IOException;

/* renamed from: band  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class band {
    final batd a;
    final int b;
    int c;
    int d;
    baml e;
    boolean f;
    final /* synthetic */ banf g;

    public band(banf banf, int i, int i2) {
        this.g = banf;
        this.f = false;
        this.b = i;
        this.c = i2;
        this.a = new batd();
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return Math.max(0, Math.min(this.c, (int) this.a.b)) - this.d;
    }

    /* access modifiers changed from: package-private */
    public final int b() {
        return Math.min(this.c, this.g.d.c);
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        return this.a.b > 0;
    }

    public band(banf banf, baml baml, int i) {
        this(banf, baml.g, i);
        this.e = baml;
    }

    public final void a(int i) {
        if (i <= 0 || Integer.MAX_VALUE - i >= this.c) {
            this.c += i;
            return;
        }
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(44);
        sb.append("Window size overflow for stream: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, bane bane) {
        int min = Math.min(i, b());
        int i2 = 0;
        while (c() && min > 0) {
            batd batd = this.a;
            long j = batd.b;
            if (((long) min) >= j) {
                int i3 = (int) j;
                i2 += i3;
                a(batd, i3, this.f);
            } else {
                i2 += min;
                a(batd, min, false);
            }
            bane.a++;
            min = Math.min(i - i2, b());
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(batd batd, int i, boolean z) {
        do {
            int min = Math.min(i, ((baoi) ((bamd) this.g.b).b).a);
            int i2 = -min;
            this.g.d.a(i2);
            a(i2);
            try {
                boolean z2 = batd.b != ((long) min) ? false : z;
                baoa baoa = this.g.b;
                int i3 = this.b;
                ((bamd) baoa).c.a(2, i3, batd, min, z2);
                try {
                    ((bamd) baoa).b.a(z2, i3, batd, min);
                } catch (IOException e2) {
                    ((bamd) baoa).a.a(e2);
                }
                this.e.h.c(min);
                i -= min;
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        } while (i > 0);
    }
}
