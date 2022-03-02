package defpackage;

/* renamed from: aezj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aezj extends awem {
    private final awef b;
    private final awef c;

    public aezj(bapu bapu, bapu bapu2, awef awef, awef awef2) {
        super(bapu2, awey.a(aezj.class), bapu);
        this.b = aweu.a(awef);
        this.c = aweu.a(awef2);
    }

    /* access modifiers changed from: protected */
    public final aorr a() {
        return this.b.b();
    }

    public final /* bridge */ /* synthetic */ aorr b(Object obj) {
        aunk aunk = (aunk) obj;
        awef awef = this.c;
        aucx aucx = aunk.d;
        int size = aucx.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            auni a = auni.a(((aunj) aucx.get(i2)).c);
            if (a == null) {
                a = auni.UNKNOWN;
            }
            if (a == auni.DELTA_FAILURE) {
                i++;
            }
        }
        if (i <= 0) {
            return aorl.a((Object) aunk);
        }
        if (i == aunk.d.size()) {
            return awef.b();
        }
        throw new afer("If server fails to decode deltas, it should reject all changes with DELTA_FAILURE!");
    }
}
