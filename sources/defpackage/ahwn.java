package defpackage;

/* renamed from: ahwn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ahwn {
    private final long a;
    private final aizy b;
    private long c = -1;

    protected ahwn(aizy aizy, long j) {
        this.b = aizy;
        this.a = j;
    }

    /* access modifiers changed from: protected */
    public final void a(long j) {
        if ((j & this.a) != 0) {
            this.c = this.b.c();
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.c = -1;
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        return this.c != -1 && this.b.c() - this.c < 10000;
    }
}
