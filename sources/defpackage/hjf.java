package defpackage;

/* renamed from: hjf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hjf extends hjg {
    public hjf() {
        super(false, 4, (auef) hmd.d.c(7), (auef) aqol.d.c(7));
    }

    protected static final String a(hmd hmd) {
        int a = hmc.a(hmd.a);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            hmm hmm = hmd.b;
            if (hmm == null) {
                hmm = hmm.b;
            }
            String valueOf = String.valueOf(hmm.a);
            return valueOf.length() == 0 ? new String("Card:") : "Card:".concat(valueOf);
        } else if (i == 2) {
            hmn hmn = hmd.c;
            if (hmn == null) {
                hmn = hmn.b;
            }
            String valueOf2 = String.valueOf(hmn.a);
            return valueOf2.length() == 0 ? new String("Address:") : "Address:".concat(valueOf2);
        } else {
            throw new hjm(769, "Unrecognizable autofill_wallet.type.");
        }
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ audx b(audx audx, amri amri) {
        hmf hmf = ((aqol) audx).c;
        if (hmf == null) {
            hmf = hmf.e;
        }
        hmd hmd = hmf.d;
        return hmd == null ? hmd.d : hmd;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ audx c(audx audx) {
        return (hmd) audx;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ anax d(audx audx) {
        return anax.a((Object) a((hmd) audx));
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void e(audx audx) {
        hmd hmd = (hmd) audx;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ hjc b(audx audx) {
        hmd hmd = (hmd) audx;
        return new hjb(a(hmd), hmd);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ audx a(audx audx, amri amri) {
        hmd hmd = (hmd) audx;
        aucd o = aqol.d.o();
        String a = a(hmd);
        if (o.c) {
            o.c();
            o.c = false;
        }
        a.getClass();
        ((aqol) o.b).a = a;
        aucd o2 = hmf.e.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        hmf hmf = (hmf) o2.b;
        hmd.getClass();
        hmf.d = hmd;
        hmf.a |= 8;
        hmf hmf2 = (hmf) o2.i();
        if (o.c) {
            o.c();
            o.c = false;
        }
        hmf2.getClass();
        ((aqol) o.b).c = hmf2;
        return (aqol) o.i();
    }

    public final /* bridge */ /* synthetic */ String a(audx audx) {
        return a((hmd) audx);
    }
}
