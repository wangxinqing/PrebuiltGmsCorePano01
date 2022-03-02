package defpackage;

/* renamed from: ahpj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahpj {
    int a = 0;
    int b = 0;
    int c = -1;

    private static final int d(int i) {
        if (i == 7 || i == 8) {
            return 2;
        }
        return i;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i) {
        ativ.b(i != 3);
        int d = d(i);
        if (d != this.c) {
            this.c = d;
            this.a = 0;
            this.b = 0;
        }
        this.a++;
    }

    /* access modifiers changed from: package-private */
    public final void b(int i) {
        if (this.c != 3) {
            this.c = 3;
            this.a = 0;
            this.b = 0;
        }
        if (((long) i) > axxa.h()) {
            this.b++;
        } else {
            this.b = 0;
        }
        this.a++;
    }

    /* access modifiers changed from: package-private */
    public final int c(int i) {
        if (d(i) == this.c) {
            return this.a;
        }
        return 0;
    }
}
