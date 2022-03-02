package defpackage;

import android.accounts.Account;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.Callable;

/* renamed from: aeyc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aeyc implements Callable {
    private final awdn a;
    private final aevl b;
    private final String c;
    private final Account d;
    private final int e;
    private final int f;
    private final auay g;

    public aeyc(awdn awdn, aevl aevl, String str, Account account, int i, int i2, byte[] bArr) {
        this.a = awdn;
        this.b = aevl;
        this.c = str;
        this.d = account;
        this.e = i;
        this.f = i2;
        this.g = auay.a(bArr);
    }

    /* renamed from: a */
    public final Long call() {
        Throwable th;
        afdp b2;
        Throwable th2;
        ((pia) this.a.a()).a("Writing %d bytes of data to Footprints %s/%s.", Integer.valueOf(this.g.a()), Integer.valueOf(this.e), Integer.valueOf(this.f));
        try {
            aevm a2 = this.b.a(this.d, this.e, this.f);
            try {
                b2 = a2.c().b();
                aesm d2 = a2.d(b2);
                if (d2.a() != -1) {
                    long c2 = (d2.c() * 1000) + (afgm.a() / 1000);
                    long a3 = d2.a();
                    Long.signum(a3);
                    long j = c2 - (a3 * 1000);
                    a2.a(b2, this.g, j, this.c);
                    b2.b();
                    Long valueOf = Long.valueOf(j);
                    b2.close();
                    if (a2 != null) {
                        a2.close();
                    }
                    return valueOf;
                }
                throw new aepg(4, "There was no sync since device boot, local time is not trustworthy.", (Exception) null);
            } catch (Throwable th3) {
                th = th3;
                if (a2 != null) {
                    a2.close();
                }
                throw th;
            }
            throw th2;
        } catch (IOException e2) {
            throw new aepg(3, String.format(Locale.ENGLISH, "Failed to write %d bytes to Footprints %s/%s.", new Object[]{Integer.valueOf(this.g.a()), Integer.valueOf(this.e), Integer.valueOf(this.f)}), e2);
        } catch (Throwable th4) {
            apev.a(th, th4);
        }
    }
}
