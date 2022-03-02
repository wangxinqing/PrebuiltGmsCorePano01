package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.Set;

/* renamed from: key  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class key extends nis {
    public final kec a;
    public final kwg b;
    public final lfq c;
    protected final boolean d;
    protected khq e;

    protected key(String str, kec kec, kwg kwg) {
        this(str, kec, kwg, (lfq) null, false);
    }

    public abstract Set a();

    public final void a(Context context) {
        boolean z;
        boolean d2;
        boolean z2;
        boolean z3;
        this.e = this.a.e();
        if (ldn.a()) {
            String str = b().a.a;
            ldn c2 = ldn.c();
            lfq lfq = this.c;
            String str2 = b().c.b;
            if (c2.b.contains(getClass())) {
                ldj a2 = c2.a(str);
                synchronized (a2) {
                    if (a2.d != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    iva.a(z, (Object) "Not initialized yet");
                    long currentTimeMillis = System.currentTimeMillis();
                    a2.b.a(currentTimeMillis);
                    a2.h.put(str2, Long.valueOf(currentTimeMillis));
                    d2 = a2.d();
                    if (lfq != null) {
                        lfq.a(a2.d);
                        if (a2.e || a2.g) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        ((lgc) lfq).k();
                        if ((((ambk) ((lgc) lfq).e.b).a & 131072) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        iva.a(true ^ z3, (Object) "Can't call setHasPendingPushNotifications() twice");
                        aucd aucd = ((lgc) lfq).e;
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        ambk ambk = (ambk) aucd.b;
                        ambk ambk2 = ambk.K;
                        ambk.a |= 131072;
                        ambk.t = z2;
                    }
                }
                if (d2) {
                    a2.b();
                }
            }
        }
        if (!b().a(a())) {
            lfq lfq2 = this.c;
            if (lfq2 != null) {
                lfn g = lfq2.g();
                g.b(1511);
                g.a();
                lfq lfq3 = this.c;
                lfq3.h();
                lfq3.a();
            }
            throw new nja(1511, "Insufficient scopes authorized");
        } else if (this.c != null) {
            try {
                b(context);
                if (this.d) {
                    lfq lfq4 = this.c;
                    lfq4.h();
                    lfq4.a();
                }
            } catch (nja e2) {
                lfn g2 = this.c.g();
                g2.b(e2.a.i);
                g2.a();
                lfq lfq5 = this.c;
                lfq5.h();
                lfq5.a();
                throw e2;
            } catch (RemoteException e3) {
                lfn g3 = this.c.g();
                g3.b();
                g3.a();
                lfq lfq6 = this.c;
                lfq6.h();
                lfq6.a();
                throw e3;
            }
        } else {
            b(context);
        }
    }

    /* access modifiers changed from: protected */
    public final khq b() {
        khq khq = this.e;
        iva.a((Object) khq, (Object) "The authorized app is not defined");
        return khq;
    }

    public abstract void b(Context context);

    protected key(String str, kec kec, kwg kwg, int i) {
        this(str, kec, kwg, i, true);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected key(java.lang.String r8, defpackage.kec r9, defpackage.kwg r10, int r11, boolean r12) {
        /*
            r7 = this;
            lfr r0 = r9.q
            lfv r0 = (defpackage.lfv) r0
            lgc r5 = r0.d()
            r5.i()
            r0 = 0
            r5.c(r0, r11)
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r6 = r12
            r1.<init>((java.lang.String) r2, (defpackage.kec) r3, (defpackage.kwg) r4, (defpackage.lfq) r5, (boolean) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.key.<init>(java.lang.String, kec, kwg, int, boolean):void");
    }

    private key(String str, kec kec, kwg kwg, lfq lfq, boolean z) {
        super(11, str);
        iva.a((Object) kec);
        this.a = kec;
        iva.a((Object) kwg);
        this.b = kwg;
        this.c = lfq;
        this.d = z;
        boolean z2 = true;
        if (z && lfq == null) {
            z2 = false;
        }
        iva.b(z2, "Send what after doExecute??");
    }

    public void a(Status status) {
        this.b.a(status);
    }
}
