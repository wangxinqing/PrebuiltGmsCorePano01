package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.mdd.FileGroupRequest;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: akho  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class akho implements akmf {
    public final Context a;
    public int b;
    public String c;
    private final akma d;
    private final Executor e;
    private final String f;
    private long g = -1;
    private akmd h;
    private final akuo i;

    public akho(akuo akuo, akma akma, Executor executor, String str, Context context) {
        this.i = akuo;
        this.d = akma;
        this.e = executor;
        this.f = str;
        this.a = context;
        this.h = null;
        this.c = null;
        this.b = -1;
    }

    private final void f() {
        try {
            a(4, a(jjt.b(this.a.getResources().getAssets().open(this.f))));
            c(4);
        } catch (auda | InvalidObjectException e2) {
            b(4);
        } catch (IOException e3) {
            b(7);
        }
    }

    public final akmd a(byte[] bArr) {
        aucd o = assj.e.o();
        o.b(bArr);
        assj assj = (assj) o.i();
        int a2 = assg.a(assj.b);
        if (a2 == 0) {
            a2 = 1;
        }
        int i2 = a2 - 1;
        if (i2 != 1) {
            if (i2 == 2) {
                akmd a3 = akme.a(assj);
                aklz.a();
                return a3;
            } else if (i2 != 3) {
                throw new InvalidObjectException("Unknown model version.");
            }
        }
        int d2 = akuo.d();
        Boolean valueOf = Boolean.valueOf(azbh.b());
        if (assj.a.size() == 1) {
            asve asve = (asve) assj.a.get(0);
            akmb a4 = akmo.a(d2, valueOf);
            int a5 = assg.a(assj.b);
            if (a5 == 0) {
                a5 = 1;
            }
            akmd akmd = new akmd(asve, a5, (assi[]) new aucu(assj.c, assj.d).toArray(new assi[assj.c.size()]), a4);
            asve asve2 = akmd.b;
            if (asve2 == null || (asve2.a & 1) == 0 || akmd.a.isEmpty()) {
                aklz.a().c("Invalid model weights, returning null model weights container");
                throw new InvalidObjectException("Failed to parse model weights");
            }
            aklz.a();
            return akmd;
        }
        throw new InvalidObjectException("No model weights found in proto");
    }

    public final void b() {
        this.b = -1;
        this.h = null;
        this.c = null;
    }

    public final void c() {
        if (this.b != 0) {
            aklz.a();
        } else if (System.currentTimeMillis() > this.g) {
            aklz.a();
            e();
        }
    }

    public final akmd d() {
        return this.h;
    }

    public final void e() {
        this.b = 1;
        rxu.a(this.a).a("userlocation_placeinference_model", "com.google.android.gms").a(this.e, (acvp) new akhn(this));
    }

    /* access modifiers changed from: package-private */
    public final void b(int i2) {
        this.d.a(4, i2, 1, 0);
        aklz.a().c("Failed to load model from APK.");
        c(4);
    }

    public final void c(int i2) {
        this.b = 0;
        if (i2 == 4) {
            this.g = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(azcf.a.a().e());
        } else {
            this.g = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(azcf.a.a().f());
        }
    }

    public final void a() {
        e();
    }

    public final void a(int i2) {
        this.d.a(3, i2, 1, 0);
        rxy a2 = rxu.a(this.a);
        FileGroupRequest fileGroupRequest = new FileGroupRequest("userlocation_placeinference_model", "com.google.android.gms", (Account) null);
        iha b2 = ihb.b();
        b2.a(new rxv(fileGroupRequest));
        b2.b = new Feature[]{oqd.e};
        a2.a(b2.a());
        if (this.h != null) {
            aklz.a();
            c(4);
            return;
        }
        f();
    }

    public final void a(int i2, akmd akmd) {
        this.h = akmd;
        int i3 = akmd.f;
        int i4 = i3 - 1;
        if (i3 != 0) {
            this.d.a(i2, 2, aobp.a(i4), akmd.e);
            return;
        }
        throw null;
    }
}
