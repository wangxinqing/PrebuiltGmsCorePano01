package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.SystemClock;

/* renamed from: hkf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
abstract class hkf extends nis {
    private static final iwd b = hir.a("ChromeSyncOperation");
    protected pyv a;
    private final Account c;

    protected hkf(String str, Account account) {
        super(80, str);
        iva.a((Object) account);
        this.c = account;
    }

    /* access modifiers changed from: protected */
    public abstract void b(Context context);

    public final void a(Context context) {
        int i;
        nja nja;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            this.a = pyv.a(context, this.c);
            b(context);
            hke a2 = hke.a(context, this.c.name);
            aucd o = ansm.e.o();
            String str = this.m;
            if (o.c) {
                o.c();
                o.c = false;
            }
            ansm ansm = (ansm) o.b;
            str.getClass();
            ansm.a |= 1;
            ansm.b = str;
            int elapsedRealtime2 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime);
            if (o.c) {
                o.c();
                o.c = false;
            }
            ansm ansm2 = (ansm) o.b;
            ansm2.a |= 2;
            ansm2.c = elapsedRealtime2;
            aucd o2 = ansl.c.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            ansl ansl = (ansl) o2.b;
            ansl.a |= 1;
            ansl.b = 0;
            if (o.c) {
                o.c();
                o.c = false;
            }
            ansm ansm3 = (ansm) o.b;
            ansl ansl2 = (ansl) o2.i();
            ansl2.getClass();
            ansm3.d = ansl2;
            ansm3.a |= 4;
            a2.a((ansm) o.i());
            return;
        } catch (eif e) {
            b.a((Throwable) e);
            throw new nja(8, "Internal error.", (PendingIntent) null, e);
        } catch (hjm e2) {
            b.a((Throwable) e2);
            int i2 = e2.a;
            if (i2 == 513) {
                nja = new nja(7, "Network error.", (PendingIntent) null, e2);
            } else if (i2 == 1537) {
                nja = new nja(11000, "Passphrase required.", hoa.a(context, this.a.a()), e2);
            } else if (i2 != 1538) {
                switch (i2) {
                    case 1793:
                        nja = new nja(10, e2.getMessage(), (PendingIntent) null, e2);
                        break;
                    case 1794:
                        nja = new nja(11002, e2.getMessage(), (PendingIntent) null, e2);
                        break;
                    case 1795:
                        nja = new nja(11001, "Wrong passphrase.", (PendingIntent) null, e2);
                        break;
                    default:
                        nja = new nja(8, "Internal error.", (PendingIntent) null, e2);
                        break;
                }
            } else {
                nja = new nja(11000, "Key retrieval required.", e2.b, e2);
            }
            throw nja;
        } catch (nja e3) {
            try {
                i = e3.a.i;
                throw e3;
            } catch (Throwable th) {
                th = th;
            }
        }
        hke a3 = hke.a(context, this.c.name);
        aucd o3 = ansm.e.o();
        String str2 = this.m;
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        ansm ansm4 = (ansm) o3.b;
        str2.getClass();
        ansm4.a |= 1;
        ansm4.b = str2;
        int elapsedRealtime3 = (int) (SystemClock.elapsedRealtime() - elapsedRealtime);
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        ansm ansm5 = (ansm) o3.b;
        ansm5.a |= 2;
        ansm5.c = elapsedRealtime3;
        aucd o4 = ansl.c.o();
        if (o4.c) {
            o4.c();
            o4.c = false;
        }
        ansl ansl3 = (ansl) o4.b;
        ansl3.a |= 1;
        ansl3.b = i;
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        ansm ansm6 = (ansm) o3.b;
        ansl ansl4 = (ansl) o4.i();
        ansl4.getClass();
        ansm6.d = ansl4;
        ansm6.a |= 4;
        a3.a((ansm) o3.i());
        throw th;
    }
}
