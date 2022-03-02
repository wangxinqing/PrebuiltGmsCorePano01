package defpackage;

/* renamed from: hjk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hjk extends hjg {
    private static final hmf e;

    public hjk() {
        super(false, 1, (auef) hmk.d.c(7), (auef) aqph.f.c(7));
    }

    protected static final String a(hmk hmk) {
        return hjl.a(e, hmk.b);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ audx b(audx audx, amri amri) {
        aqph aqph = (aqph) audx;
        aucd o = hmk.d.o();
        String str = aqph.d;
        if (o.c) {
            o.c();
            o.c = false;
        }
        hmk hmk = (hmk) o.b;
        str.getClass();
        int i = hmk.a | 1;
        hmk.a = i;
        hmk.b = str;
        String str2 = aqph.e;
        str2.getClass();
        hmk.a = i | 2;
        hmk.c = str2;
        return (hmk) o.i();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ audx c(audx audx) {
        return (hmk) audx;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ anax d(audx audx) {
        return anax.a((Object) a((hmk) audx));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void e(audx audx) {
        if (((hmk) audx).b.isEmpty()) {
            throw new hji("name", "cannot be empty");
        }
    }

    static {
        aucd o = hmf.e.o();
        hml hml = hml.a;
        if (o.c) {
            o.c();
            o.c = false;
        }
        hmf hmf = (hmf) o.b;
        hml.getClass();
        hmf.c = hml;
        hmf.a |= 4;
        e = (hmf) o.i();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ audx a(audx audx, amri amri) {
        hmk hmk = (hmk) audx;
        aucd o = aqph.f.o();
        String a = a(hmk);
        if (o.c) {
            o.c();
            o.c = false;
        }
        aqph aqph = (aqph) o.b;
        a.getClass();
        aqph.b = a;
        String str = hmk.b;
        str.getClass();
        aqph.d = str;
        String str2 = hmk.c;
        str2.getClass();
        aqph.e = str2;
        return (aqph) o.i();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ hjc b(audx audx) {
        hmk hmk = (hmk) audx;
        return new hje(a(hmk), hmk);
    }

    public final /* bridge */ /* synthetic */ String a(audx audx) {
        return a((hmk) audx);
    }
}
