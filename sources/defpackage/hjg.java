package defpackage;

/* renamed from: hjg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class hjg {
    public final boolean a;
    public final int b;
    protected final auef c;
    protected final auef d;

    protected hjg(boolean z, int i, auef auef, auef auef2) {
        this.a = z;
        this.b = i;
        this.c = auef;
        this.d = auef2;
    }

    private final void a(amri amri) {
        if (this.a) {
            iva.b(amri.a());
        }
    }

    /* access modifiers changed from: protected */
    public abstract audx a(audx audx, amri amri);

    public abstract String a(audx audx);

    /* access modifiers changed from: protected */
    public abstract audx b(audx audx, amri amri);

    /* access modifiers changed from: protected */
    public abstract hjc b(audx audx);

    /* access modifiers changed from: protected */
    public abstract audx c(audx audx);

    public final audx c(audx audx, amri amri) {
        a(amri);
        return a(audx, amri);
    }

    /* access modifiers changed from: protected */
    public abstract anax d(audx audx);

    /* access modifiers changed from: protected */
    public abstract void e(audx audx);

    public final hjc f(audx audx) {
        e(audx);
        return b(c(audx));
    }

    public final anax a(hjc hjc) {
        return d(hjc.c);
    }

    public final hjc a(hln hln, amri amri) {
        try {
            a(amri);
            return f(b((audx) this.d.b(hln.d, aubs.c()), amri));
        } catch (auda e) {
            throw new hjm(769, "Unable to parse sync proto bytes.", e);
        }
    }

    public final hjc a(byte[] bArr) {
        try {
            return f((audx) this.c.b(bArr, aubs.c()));
        } catch (auda e) {
            throw new hjm(769, "Unable to parse data proto bytes.", e);
        }
    }

    public final hlm a(hln hln, hjc hjc, amri amri) {
        boolean z;
        if (this.b == hjc.a) {
            z = true;
        } else {
            z = false;
        }
        iva.b(z);
        audw av = a(hln, amri).c.av();
        av.a(hjc.c);
        audx i = av.i();
        if (a(i).equals(hln.c)) {
            try {
                audw av2 = ((audx) this.d.b(hln.d, aubs.c())).av();
                av2.a(c(i, amri));
                auay au = av2.i().au();
                hlm hlm = new hlm(hln);
                hlm.b = au;
                return hlm;
            } catch (auda e) {
                throw new hjm(769, "Unable to parse sync proto bytes.", e);
            }
        } else {
            throw new hjm(769, "The merged data has a different id.");
        }
    }
}
