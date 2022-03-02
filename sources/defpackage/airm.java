package defpackage;

/* renamed from: airm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class airm {
    public final aizy a;
    public arhu b = null;
    private final ajaa c;
    private final ajbg d;
    private final aizz e;
    private boolean f = false;
    private final ahqz g;

    public airm(ahqz ahqz, aizy aizy, ajaa ajaa, ajbg ajbg, aizz aizz) {
        this.g = ahqz;
        this.a = aizy;
        this.c = ajaa;
        this.d = ajbg;
        this.e = aizz;
        if (aizy != null && ajaa != null && ajbg != null && aizz != null && b()) {
            this.b = new arhu(arhy.a(aizy, aizz.b()));
            this.f = true;
        }
    }

    private static boolean b() {
        return (axyo.a.b().cellFingerprintConfig() & 1) != 0;
    }

    public final aibe a(aiaj aiaj, long j) {
        return this.g.a(aiaj.a(), j);
    }

    public final boolean a() {
        aizy aizy;
        aizz aizz;
        if (b() && this.b == null && (aizy = this.a) != null && this.c != null && this.d != null && (aizz = this.e) != null) {
            this.b = new arhu(arhy.a(aizy, aizz.b()));
        } else if (!b() && this.b != null) {
            this.b = null;
        }
        return this.b != null && b() && this.f;
    }
}
