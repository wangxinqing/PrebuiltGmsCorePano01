package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: aiwy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aiwy extends ajao {
    public final ajbg a;
    public ajan b = null;
    private Context d = null;
    private final arnf e;
    private final aiwx f = new aiwx(this);
    private volatile boolean g;
    private arnh h = null;

    public aiwy(ajbg ajbg, arnf arnf, Context context) {
        this.a = ajbg;
        this.e = arnf;
        this.d = context;
    }

    private final boolean a(armj armj) {
        arnk a2;
        arnh arnh = this.h;
        if (!(arnh == null || (a2 = arnh.a(97, 1, (audx) armj)) == null)) {
            try {
                int intValue = ((Integer) a2.get(2, TimeUnit.SECONDS)).intValue();
                if (intValue != 0) {
                    StringBuilder sb = new StringBuilder(61);
                    sb.append("Failed to send request to nanoapp: request result=");
                    sb.append(intValue);
                    sb.toString();
                } else {
                    int a3 = armh.a(armj.b);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    String valueOf = String.valueOf(Integer.toString(a3 - 1));
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 61);
                    sb2.append("Sent request to nanoapp: request command=");
                    sb2.append(valueOf);
                    sb2.append(", result=");
                    sb2.append(0);
                    sb2.toString();
                    return true;
                }
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                String valueOf2 = String.valueOf(e2.getMessage());
                if (valueOf2.length() == 0) {
                    new String("Failed to send request to nanoapp: ");
                } else {
                    "Failed to send request to nanoapp: ".concat(valueOf2);
                }
            }
        }
        return false;
    }

    public final void b() {
        aucd o = armj.d.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        armj armj = (armj) o.b;
        armj.b = 2;
        armj.a |= 1;
        a((armj) o.i());
    }

    public final void a() {
        arnd a2;
        Context context = this.d;
        boolean z = false;
        if (!(context == null || (a2 = this.e.a(context)) == null)) {
            aucd o = armj.d.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            armj armj = (armj) o.b;
            armj.b = 0;
            armj.a |= 1;
            if (a((armj) o.i())) {
                synchronized (this.f) {
                    a2.b((arne) this.f);
                    this.g = false;
                }
                z = true;
            }
        }
        this.c = !z;
        boolean z2 = this.c;
        StringBuilder sb = new StringBuilder(19);
        sb.append("isEnabled() = ");
        sb.append(z2);
        sb.toString();
        boolean z3 = this.c;
    }

    public final boolean a(ajan ajan) {
        arnd a2;
        this.b = ajan;
        Context context = this.d;
        boolean z = false;
        if (!(context == null || (a2 = this.e.a(context)) == null)) {
            synchronized (this.f) {
                if (!this.g) {
                    a2.a((arne) this.f);
                    this.g = true;
                }
            }
            arnh a3 = a2.a(5147455389092024326L);
            this.h = a3;
            if (a3 == null) {
                String valueOf = String.valueOf(Long.toHexString(5147455389092024326L));
                if (valueOf.length() == 0) {
                    new String("Unable to find OffBody NanoApp. id = ");
                } else {
                    "Unable to find OffBody NanoApp. id = ".concat(valueOf);
                }
            } else {
                aucd o = armj.d.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                armj armj = (armj) o.b;
                armj.b = 1;
                int i = armj.a | 1;
                armj.a = i;
                armj.c = 1;
                armj.a = i | 2;
                z = a((armj) o.i());
            }
        }
        this.c = z;
        boolean z2 = this.c;
        StringBuilder sb = new StringBuilder(19);
        sb.append("isEnabled() = ");
        sb.append(z2);
        sb.toString();
        return this.c;
    }
}
