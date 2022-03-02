package defpackage;

import android.content.Context;
import android.os.SystemClock;
import java.util.Random;

/* renamed from: aiha  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiha {
    public final hol a;
    public final Random b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public final iby r;

    public aiha(Context context) {
        hol hol = new hol(context, "LE", (String) null);
        iby b2 = adrz.b(context);
        Random random = new Random();
        this.a = hol;
        this.r = b2;
        this.b = random;
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public final void a(boolean z) {
        if (axxm.f()) {
            if (this.o > 0) {
                this.g = (int) (SystemClock.elapsedRealtime() - this.o);
            }
            this.o = 0;
            if (z) {
                this.d++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(boolean z, boolean z2) {
        if (axxm.f()) {
            if (this.o > 0) {
                this.g = (int) (SystemClock.elapsedRealtime() - this.o);
            }
            this.o = 0;
            if (z) {
                this.e++;
            }
            if (z2) {
                this.d++;
            }
        }
    }
}
