package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.DeviceDetails;
import com.google.android.gms.smartdevice.d2d.EsimActivationInfo;
import com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload;
import com.google.android.gms.smartdevice.d2d.data.AccountTransferPayload;
import com.google.android.gms.smartdevice.d2d.data.DisplayText;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.ProgressEvent;
import java.util.concurrent.Executor;

/* renamed from: abqd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abqd extends abno {
    public static final iwd d = acqa.a("D2D", "SourceDeviceBootstrapController");
    public final acah e;
    public abox f;
    public BootstrapConfigurations g;
    public boolean h = false;
    public abpt i;
    public abpr j;
    private final Context k;
    private final abvo l;
    private final abxb m;
    private final abnd n;
    private BootstrapOptions o;
    private final abzy p;
    private final abpg q;
    private final qub r;
    private final abps s = new abqc(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public abqd(abpo abpo, abnn abnn, abxb abxb) {
        super(d, abpo.b, abnn);
        abnd abnd = abnd.a;
        abzy abzy = new abzy(abpo.a, abpo.b);
        abpg abpg = new abpg(abpo.a);
        Context context = abpo.a;
        iva.a((Object) context);
        this.k = context;
        this.l = abpo.d;
        this.e = (acah) abpo.c;
        iva.a((Object) abxb);
        this.m = abxb;
        iva.a((Object) abnd);
        this.n = abnd;
        this.p = abzy;
        this.q = abpg;
        this.r = acpd.a(this.k);
    }

    private final int f() {
        return this.r.a("com.google").length;
    }

    /* access modifiers changed from: protected */
    public final abox a() {
        return this.f;
    }

    public final void b(int i2) {
        this.l.a(i2);
        try {
            this.m.a(i2);
        } catch (RemoteException e2) {
            d.e("Error invoking callback.", e2, new Object[0]);
        }
    }

    /* access modifiers changed from: protected */
    public final void c() {
        BootstrapOptions bootstrapOptions = this.o;
        long R = azlf.a.a().R();
        long j2 = (long) bootstrapOptions.s;
        long s2 = azlf.a.a().s();
        if (R > 0 && j2 < s2) {
            d.a("Waiting %dms before sending completion.", Long.valueOf(R));
            try {
                Thread.sleep(R);
            } catch (InterruptedException e2) {
                d.a((Throwable) e2);
            }
        }
        c(2);
        super.c();
    }

    public final void e() {
        d.a("cleanup()", new Object[0]);
        super.e();
        if (this.i != null) {
            this.i = null;
        }
        abpr abpr = this.j;
        if (abpr != null) {
            abpr.b();
        }
        super.d();
        this.f = null;
    }

    public final void a(BootstrapConfigurations bootstrapConfigurations, int i2) {
        boolean z;
        acwa acwa;
        iva.a((Object) bootstrapConfigurations, (Object) "bootstrapConfigurations cannot be null.");
        this.g = bootstrapConfigurations;
        d.b("Starting bootstrap", new Object[0]);
        boolean a = acpf.a(this.o);
        if (a) {
            this.j = this.n.a(this.k, this.e, this.s, this.g.g, this.o.i);
        } else {
            this.i = this.n.a(this.k, this.e, this.s, this.o.i, bootstrapConfigurations.g, bootstrapConfigurations.h);
        }
        BootstrapOptions bootstrapOptions = this.o;
        if (!bootstrapOptions.p || !azlf.i()) {
            z = false;
        } else {
            z = true;
        }
        int i3 = bootstrapOptions.q;
        if (z && i3 > 0) {
            bootstrapConfigurations.a(i3);
        } else {
            bootstrapConfigurations.a(0);
        }
        this.e.c(f());
        long a2 = jhg.a(this.k);
        hxj hxj = hxj.a;
        bootstrapConfigurations.a(new DeviceDetails(a2, hxz.j(this.k)));
        abpi b = this.o.b();
        abpi c = bootstrapConfigurations.c();
        BootstrapOptions bootstrapOptions2 = this.o;
        if (azlb.b() && bootstrapOptions2.v != null) {
            new aceb(this.k).a(bootstrapOptions2.v, bootstrapOptions2.l);
            c.a(4, true);
        }
        anvn a3 = acgp.a(this.k, this.o.u);
        aucd aucd = this.e.e;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anvp anvp = (anvp) aucd.b;
        anvp anvp2 = anvp.h;
        anvp.e = a3.d;
        anvp.a |= 8;
        anvn anvn = anvn.NONE;
        int ordinal = a3.ordinal();
        if (ordinal == 1) {
            c.a(8, true);
        } else if (ordinal == 2) {
            c.a(9, true);
        }
        boolean a4 = b.a(5);
        boolean c2 = azkf.c();
        boolean d2 = azkf.d();
        if (azks.c()) {
            d.a("createWorkProfileTask: targetSupport=%s, supportsWorkProfileSetup=%s, workProfileFallback=%s", Boolean.valueOf(a4), Boolean.valueOf(c2), Boolean.valueOf(d2));
        }
        if (d2) {
            if (this.p.c() == 4) {
                d2 = true;
            } else {
                d2 = false;
            }
        }
        acwa acwa2 = null;
        if (!a4) {
            acwa = null;
        } else if (!c2 && !d2) {
            acwa = null;
        } else {
            c.a(6, true);
            acwa = this.p.a();
        }
        bootstrapConfigurations.a(c);
        a(bootstrapConfigurations, false);
        if (bootstrapConfigurations.l > 0) {
            a(this.o.q);
        }
        EsimActivationInfo esimActivationInfo = this.o.w;
        if (esimActivationInfo != null && azki.b()) {
            c.a(7, true);
            acwa2 = this.q.a(esimActivationInfo);
        }
        if (acwa2 != null) {
            acwa2.a((Executor) new jls(this.b), (acvv) new abqb(this));
        }
        if (this.o.c() || f() != 0 || a3 == anvn.NONE) {
            abpy abpy = new abpy(this, a, acwa);
            if (i2 == 1) {
                long D = azlf.a.a().D();
                if (D > 0) {
                    d.b("Delaying for %dms before sending next message", Long.valueOf(D));
                    this.b.postDelayed(abpy, D);
                    return;
                }
                abpy.run();
                return;
            }
            abpy.run();
            return;
        }
        d.b("Skipping account transfer because accounts are not required, there are no accounts and WiFi D2D is supported on the device.", new Object[0]);
        c(4);
        super.c();
    }

    public final void a(BootstrapConfigurations bootstrapConfigurations, boolean z) {
        d.b("Sending BootstrapConfigurations.", new Object[0]);
        MessagePayload messagePayload = new MessagePayload();
        messagePayload.a(bootstrapConfigurations);
        messagePayload.i = z;
        messagePayload.a.add(9);
        b(messagePayload);
    }

    /* access modifiers changed from: protected */
    public final void a(MessagePayload messagePayload) {
        abpr abpr;
        abpt abpt;
        d.a("Processing MessagePayload.", new Object[0]);
        DisplayText displayText = messagePayload.f;
        if (displayText != null) {
            d.a("Processing DisplayText", new Object[0]);
            iva.a((Object) displayText);
            String str = displayText.b;
            if (!TextUtils.isEmpty(str)) {
                this.c.a(str);
            }
        }
        BootstrapOptions bootstrapOptions = messagePayload.d;
        if (bootstrapOptions != null) {
            d.a("Processing BootstrapOptions.", new Object[0]);
            iva.a((Object) bootstrapOptions);
            this.o = bootstrapOptions;
            if (!acpy.a(bootstrapOptions.l)) {
                this.o.a(acpy.a());
            }
            d.b("from target %s", bootstrapOptions.b());
            acah acah = this.e;
            acah.a(this.o.l);
            acah.a(this.o.i);
            try {
                this.m.a(this.o);
            } catch (RemoteException e2) {
                d.e("Error invoking callback.", e2, new Object[0]);
            }
        }
        AccountBootstrapPayload accountBootstrapPayload = messagePayload.g;
        if (!(accountBootstrapPayload == null || (abpt = this.i) == null)) {
            abpt.a(accountBootstrapPayload);
        }
        ProgressEvent progressEvent = messagePayload.h;
        if (progressEvent != null) {
            d.a("Processing ProgressEvent", new Object[0]);
            this.c.a(new BootstrapProgressResult(progressEvent.b, new Bundle()));
        }
        AccountTransferPayload accountTransferPayload = messagePayload.k;
        if (accountTransferPayload != null && (abpr = this.j) != null) {
            abpr.a(accountTransferPayload);
        }
    }
}
