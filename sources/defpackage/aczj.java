package defpackage;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.facs.cache.FacsCacheCallOptions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: aczj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aczj extends nis {
    private static final anij k = addh.b();
    protected final mfa a;
    protected final ClientContext b;
    protected final adev c;
    protected final aful d;
    protected final Executor e;
    protected final FacsCacheCallOptions f;
    protected final adde g;
    protected final agos h;
    protected final mep i;
    protected final int j;

    public aczj(String str, mfa mfa, ClientContext clientContext, adev adev, aful aful, Executor executor, FacsCacheCallOptions facsCacheCallOptions, adde adde, agos agos, int i2, mep mep) {
        super(202, str);
        this.a = mfa;
        this.b = clientContext;
        this.c = adev;
        this.d = aful;
        this.e = executor;
        this.f = facsCacheCallOptions;
        this.g = adde;
        this.h = agos;
        this.j = i2;
        this.i = mep;
    }

    static final Object a(acwa acwa) {
        try {
            return acws.a(acwa);
        } catch (InterruptedException e2) {
            throw new nja(14, "Upload thread interrupted!", (PendingIntent) null, e2);
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof ibr) {
                throw new nja(((ibr) cause).a(), "Internal sync API failure!", (PendingIntent) null, cause);
            }
            amtb.a(cause);
            throw new IllegalStateException(cause);
        }
    }

    /* access modifiers changed from: package-private */
    public final String b() {
        String str = this.b.e;
        String str2 = this.f.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("#");
        sb.append(str2);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    public final long c() {
        return this.f.b;
    }

    static final Object a(aorr aorr) {
        try {
            return aorr.get();
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause == null) {
                throw new IllegalStateException("ExecutionException without cause", e2);
            }
            amtb.a(cause, eif.class);
            amtb.a(cause, babk.class);
            amtb.a(cause, babl.class);
            amtb.a(cause);
            throw new IllegalStateException(cause);
        }
    }

    /* access modifiers changed from: package-private */
    public final atwh a(adeu adeu) {
        afum afum;
        k.d().a("aczj", "a", 121, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Operation '%s' performing sync (type: '%s')...", (Object) this.m, (Object) adeu);
        try {
            if (!azrk.l()) {
                afum = this.d.h(aczd.SYNC_ID_CUSTOM_CACHE);
            } else {
                afum = this.d.c(aczd.SYNC_ID_CUSTOM_CACHE, this.b.c);
            }
            return (atwh) a(afum.a(new aczi(this, adeu), 1, this.e));
        } catch (eif e2) {
            throw new nja(35001, "Auth error when downloading settings!", (PendingIntent) null, e2);
        } catch (babk | babl e3) {
            throw new nja(7, "Downloading settings failed!", (PendingIntent) null, e3);
        } catch (InterruptedException e4) {
            throw new nja(14, "Download thread interrupted!", (PendingIntent) null, e4);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        if (this.b.c == null) {
            throw new nja(5, "Provided client context doesn't have a resolved account!");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, long j2) {
        adde adde = this.g;
        int i3 = this.j;
        String b2 = b();
        long c2 = c();
        long longValue = ((Long) adde.c.a()).longValue();
        if (adde.d.a(longValue)) {
            hol hol = (hol) adde.b.a();
            aucd o = atwz.h.o();
            int i4 = (int) longValue;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atwz atwz = (atwz) o.b;
            atwz.a |= 64;
            atwz.d = i4;
            aucd o2 = atvy.c.o();
            aucd o3 = atvv.g.o();
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            atvv atvv = (atvv) o3.b;
            int i5 = atvv.a | 1;
            atvv.a = i5;
            atvv.b = i2;
            atvv.a = i5 | 2;
            atvv.c = j2;
            aucd o4 = atvt.d.o();
            if (o4.c) {
                o4.c();
                o4.c = false;
            }
            atvt atvt = (atvt) o4.b;
            b2.getClass();
            int i6 = atvt.a | 1;
            atvt.a = i6;
            atvt.b = b2;
            atvt.a = i6 | 2;
            atvt.c = c2;
            if (o3.c) {
                o3.c();
                o3.c = false;
            }
            atvv atvv2 = (atvv) o3.b;
            atvt atvt2 = (atvt) o4.i();
            atvt2.getClass();
            atvv2.d = atvt2;
            atvv2.a |= 4;
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            atvy atvy = (atvy) o2.b;
            atvv atvv3 = (atvv) o3.i();
            atvv3.getClass();
            atvy.b = atvv3;
            atvy.a = 3;
            if (o.c) {
                o.c();
                o.c = false;
            }
            atwz atwz2 = (atwz) o.b;
            atvy atvy2 = (atvy) o2.i();
            atvy2.getClass();
            atwz2.c = atvy2;
            atwz2.b = 3;
            aucd o5 = atws.d.o();
            if (o5.c) {
                o5.c();
                o5.c = false;
            }
            atws atws = (atws) o5.b;
            "com.google.android.gms#udc-facs".getClass();
            atws.a |= 1;
            atws.b = "com.google.android.gms#udc-facs";
            if (o.c) {
                o.c();
                o.c = false;
            }
            atwz atwz3 = (atwz) o.b;
            atws atws2 = (atws) o5.i();
            atws2.getClass();
            atwz3.e = atws2;
            atwz3.a |= 128;
            hoi a2 = hol.a((audx) o.i());
            int i7 = i3 - 1;
            if (i3 != 0) {
                a2.b(i7);
                a2.b();
            } else {
                throw null;
            }
        }
        if (i2 == Status.a.i) {
            k.d().a("aczj", "a", 105, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Operation '%s' successful!", (Object) this.m);
        } else {
            k.c().a("aczj", "a", 107, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)").a("Operation '%s' failed with status '%d'!", (Object) this.m, i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(String str) {
        if (amsk.a(',').a().c(str).contains(this.b.e)) {
            throw new nja(35000, "The calling package is blacklisted!");
        }
    }
}
