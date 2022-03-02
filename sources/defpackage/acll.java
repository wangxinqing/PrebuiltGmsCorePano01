package defpackage;

import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.VerificationInfo;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: acll  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acll implements aclb {
    private final Queue a = new ArrayDeque();
    private aclb b;

    public final void a(aclb aclb) {
        this.b = aclb;
        while (!this.a.isEmpty() && aclb != null) {
            aclm.a.a("Consuming %d queued actions", Integer.valueOf(this.a.size()));
            Runnable runnable = (Runnable) this.a.poll();
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void b(String str) {
        aclb aclb = this.b;
        if (aclb == null) {
            this.a.add(new aclg(this, str));
        } else {
            aclb.b(str);
        }
    }

    public final void c() {
        aclb aclb = this.b;
        if (aclb == null) {
            this.a.add(new aclc(this));
        } else {
            aclb.c();
        }
    }

    public final void d() {
        aclb aclb = this.b;
        if (aclb == null) {
            this.a.add(new acld(this));
        } else {
            aclb.d();
        }
    }

    public final void g() {
        aclb aclb = this.b;
        if (aclb == null) {
            this.a.add(new aclh(this));
        } else {
            aclb.g();
        }
    }

    public final void m() {
        aclb aclb = this.b;
        if (aclb == null) {
            this.a.add(new aclk(this));
        } else {
            aclb.m();
        }
    }

    public final void c(int i) {
        aclb aclb = this.b;
        if (aclb == null) {
            this.a.add(new acli(this, i));
        } else {
            aclb.c(i);
        }
    }

    public final void a(BootstrapProgressResult bootstrapProgressResult) {
        aclb aclb = this.b;
        if (aclb == null) {
            this.a.add(new aclj(this, bootstrapProgressResult));
        } else {
            aclb.a(bootstrapProgressResult);
        }
    }

    public final void a(VerificationInfo verificationInfo) {
        aclb aclb = this.b;
        if (aclb == null) {
            this.a.add(new aclf(this, verificationInfo));
        } else {
            aclb.a(verificationInfo);
        }
    }

    public final void a(String str) {
        aclb aclb = this.b;
        if (aclb == null) {
            this.a.add(new acle(this, str));
        } else {
            aclb.a(str);
        }
    }
}
