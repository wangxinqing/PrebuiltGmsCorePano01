package defpackage;

/* renamed from: bue  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bue {
    public final int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public long f;

    public bue(int i) {
        this.a = i;
        a();
    }

    public final void a() {
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = -1;
    }

    public final void a(int i) {
        if (i != -1) {
            long j = this.f;
            this.f = j != -1 ? j + ((long) i) : (long) i;
        }
    }

    public final boolean a(int i, int i2) {
        if (i != 0) {
            if (i == 3) {
                this.b++;
                a(i2);
            } else if (i == 4) {
                this.c++;
                a(i2);
            } else if (i != 5) {
                ((anih) ((anih) bxk.a.b()).a("bue", "a", 80, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[FenceTriggerStatsImpl] Incorrect operation code %d", i);
                return false;
            }
            return true;
        } else if (this.a == 1) {
            this.d++;
            return true;
        }
        this.e++;
        return true;
    }
}
