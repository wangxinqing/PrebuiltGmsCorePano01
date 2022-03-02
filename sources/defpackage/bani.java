package defpackage;

/* renamed from: bani  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bani {
    public final boolean a;
    public String[] b;
    public String[] c;
    public boolean d;

    public bani(banj banj) {
        this.a = banj.b;
        banj banj2 = banj.a;
        this.b = banj.c;
        this.c = banj.d;
        this.d = banj.e;
    }

    public final banj a() {
        return new banj(this);
    }

    public final void b() {
        if (this.a) {
            this.d = true;
            return;
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
    }

    public final void b(String... strArr) {
        if (!this.a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        } else if (strArr != null) {
            this.c = (String[]) strArr.clone();
        } else {
            this.c = null;
        }
    }

    public final void a(banh... banhArr) {
        if (this.a) {
            String[] strArr = new String[banhArr.length];
            for (int i = 0; i < banhArr.length; i++) {
                strArr[i] = banhArr[i].aS;
            }
            this.b = strArr;
            return;
        }
        throw new IllegalStateException("no cipher suites for cleartext connections");
    }

    public bani(boolean z) {
        this.a = z;
    }

    public final void a(banw... banwArr) {
        if (this.a) {
            int length = banwArr.length;
            if (length != 0) {
                String[] strArr = new String[length];
                for (int i = 0; i < banwArr.length; i++) {
                    strArr[i] = banwArr[i].e;
                }
                this.c = strArr;
                return;
            }
            throw new IllegalArgumentException("At least one TlsVersion is required");
        }
        throw new IllegalStateException("no TLS versions for cleartext connections");
    }

    public final void a(String... strArr) {
        if (!this.a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        } else if (strArr != null) {
            this.b = (String[]) strArr.clone();
        } else {
            this.b = null;
        }
    }
}
