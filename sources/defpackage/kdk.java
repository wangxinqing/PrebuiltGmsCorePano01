package defpackage;

import com.google.android.gms.auth.UserRecoverableAuthException;
import java.util.concurrent.TimeUnit;

/* renamed from: kdk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kdk implements Runnable {
    private static final ith b = new ith("ApplyOnServerRunnable", "");
    public final kdw a;
    private final lsm c;
    private final kkf d;
    private final kdn e;
    private final khw f;
    private final kdv g;
    private final lfq h;
    private final lgy i;

    public kdk(lsm lsm, kkf kkf, lgy lgy, kdn kdn, khw khw, kdv kdv, kdw kdw, lfq lfq, jiq jiq) {
        iva.a((Object) lsm);
        this.c = lsm;
        iva.a((Object) kkf);
        this.d = kkf;
        iva.a((Object) lgy);
        this.i = lgy;
        iva.a((Object) kdn);
        this.e = kdn;
        iva.a((Object) khw);
        this.f = khw;
        iva.a((Object) kdv);
        this.g = kdv;
        iva.a((Object) kdw);
        this.a = kdw;
        iva.a((Object) lfq);
        this.h = lfq;
        iva.a((Object) jiq);
    }

    private final void a(kcn kcn, lfk lfk) {
        if (kcn.a) {
            kof kof = this.a.a;
            kof.c++;
            kof.t();
            if (kof.c >= ((Integer) jzq.d.c()).intValue()) {
                b.b("ApplyOnServerRunnable", "Too many retries for action. Undoing.", (Throwable) kcn);
            } else {
                throw new kdj("Applying action on server failed (Increased attempts)");
            }
        } else {
            b.b("ApplyOnServerRunnable", "Got non-retryable error on server. Undoing.", (Throwable) kcn);
        }
        lfk.a((Throwable) kcn);
        a(true);
    }

    public final void run() {
        lgw b2;
        lfk e2;
        int i2;
        kdi kdi;
        lha lha;
        try {
            lfq lfq = this.h;
            lfq.i();
            lfq.c(1, 54);
            b2 = this.i.b();
            e2 = this.h.e();
            e2.a(b2);
            kah b3 = this.a.b();
            lfq lfq2 = this.h;
            lfq2.a(b3.a().a);
            lfq2.a(b3.k());
            kof kof = this.a.a;
            int seconds = (int) TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - kof.e);
            e2.b(kof.c);
            e2.a(seconds);
            if (this.a.e()) {
                kdi = new kdi(this);
            } else {
                kdi = null;
            }
            lsm lsm = this.c;
            long j = kof.m;
            lht lht = this.a.c;
            if (lht != null) {
                lha = ((lhi) lht).c;
            } else {
                lha = new lha(lhr.a);
            }
            kan kan = new kan(lsm, j, kdi, lha, this.h);
            b3.a(kan);
            e2.d();
            kdv.a(this.a, false, 0, this.d, this.f, this.e);
            this.a.b().c(kan);
            e2.a();
            i2 = 7;
        } catch (kcp e3) {
            e2.c();
            kdv.a(this.a, false, 2, this.d, this.f, this.e);
            e2.a();
            i2 = 10;
        } catch (lhp e4) {
            if (this.a.j()) {
                e2.b();
            } else {
                e2.f();
            }
            if (this.a.j()) {
                kdv.a(this.a, true, 3, this.d, this.f, this.e);
                e2.a();
                i2 = 8;
            } else {
                throw new kdj("Applying action on server interrupted (Retryable)");
            }
        } catch (lsq e5) {
            e2.a((Throwable) e5);
            a(true);
        } catch (kcy e6) {
            kcy kcy = e6;
            if (kcy.a) {
                lgw b4 = this.i.b();
                if (lgw.DISCONNECTED.equals(b4)) {
                    throw new kdh("Applying action on server failed (Disconnect).");
                } else if (!b4.equals(b2)) {
                    throw new kdj("Applying action on server failed (Connection changed)");
                }
            }
            a(kcy, e2);
        } catch (kcn e7) {
            a(e7, e2);
        } catch (kct e8) {
            kct kct = e8;
            b.c("ApplyOnServerRunnable", "Action is not yet ready to apply on server.", kct);
            e2.a((Throwable) kct);
            a(false);
        } catch (kcs e9) {
            kcs kcs = e9;
            b.c("ApplyOnServerRunnable", "Dropped action locally because its entry was deleted.", kcs);
            e2.a((Throwable) kcs);
            a(false);
        } catch (kcu e10) {
            kcu kcu = e10;
            b.c("ApplyOnServerRunnable", "Dropped action locally because its parent entry was deleted.", kcu);
            e2.a((Throwable) kcu);
            a(true);
        } catch (kcm e11) {
            kcm kcm = e11;
            b.c("ApplyOnServerRunnable", "Undoing action because the app is no longer authorized.", kcm);
            e2.a((Throwable) kcm);
            a(true);
        } catch (kcv e12) {
            kcv kcv = e12;
            b.c("ApplyOnServerRunnable", "Undoing action because the permission was deleted.", kcv);
            e2.a((Throwable) kcv);
            a(true);
        } catch (kcw e13) {
            kcw kcw = e13;
            b.c("ApplyOnServerRunnable", "Undoing action because the permission is not yet ready to apply on server.", kcw);
            e2.a((Throwable) kcw);
            a(true);
        } catch (RuntimeException e14) {
            b.c("ApplyOnServerRunnable", "Unchecked exception while applying action. Undoing.", e14);
            e2.e();
            a(true);
        } catch (UserRecoverableAuthException e15) {
            UserRecoverableAuthException userRecoverableAuthException = e15;
            b.c("ApplyOnServerRunnable", "Undoing action because there was a user auth error.", userRecoverableAuthException);
            e2.a((Throwable) userRecoverableAuthException);
            a(true);
        } catch (kdj e16) {
            if (this.a.i()) {
                this.g.b(this.a, 5);
                return;
            } else {
                this.g.b(this.a, 4);
                return;
            }
        } catch (kdh e17) {
            this.g.b(this.a, 1);
            return;
        } catch (Exception e18) {
            this.g.a(this.a, 9);
            lfq lfq3 = this.h;
            lfq3.h();
            lfq3.a();
            return;
        } catch (Throwable th) {
            Throwable th2 = th;
            e2.a();
            throw th2;
        }
        this.g.a(this.a, i2);
        lfq lfq4 = this.h;
        lfq4.h();
        lfq4.a();
        e2.a();
        i2 = 9;
        this.g.a(this.a, i2);
        lfq lfq42 = this.h;
        lfq42.h();
        lfq42.a();
    }

    private final void a(boolean z) {
        kdv.a(this.a, z, 1, this.d, this.f, this.e);
    }
}
