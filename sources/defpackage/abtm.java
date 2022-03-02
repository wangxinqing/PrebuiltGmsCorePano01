package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.smartdevice.d2d.BootstrapCompletionResult;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.BootstrapProgressResult;
import com.google.android.gms.smartdevice.d2d.CleanSharedSecretChimeraService;
import com.google.android.gms.smartdevice.d2d.DeviceDetails;
import com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload;
import com.google.android.gms.smartdevice.d2d.data.AccountTransferPayload;
import com.google.android.gms.smartdevice.d2d.data.DisplayText;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.WorkProfilePayload;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/* renamed from: abtm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abtm extends abno {
    public static final iwd d = acqa.a("D2D", "TargetDeviceBootstrapController");
    public final Context e;
    public final BootstrapOptions f;
    public final ScheduledExecutorService g;
    public abox h;
    public boolean i = false;
    public abpi j;
    public ScheduledFuture k;
    public final abnw l = new abnw();
    public boolean m;
    private final abpo n;
    private final Queue o;
    private final acan p;
    private final abta q;
    private final absy r;
    private final abzy s;
    private final abpg t;
    private boolean u;
    private final absz v = new abtg(this);

    public abtm(abpo abpo, abnn abnn, BootstrapOptions bootstrapOptions, abnd abnd, ScheduledExecutorService scheduledExecutorService) {
        super(d, abpo.b, abnn);
        this.p = (acan) abpo.c;
        this.n = abpo;
        this.g = scheduledExecutorService;
        Context context = abpo.a;
        iva.a((Object) context);
        this.e = context;
        this.o = new ArrayDeque();
        iva.a((Object) bootstrapOptions);
        this.f = bootstrapOptions;
        this.s = new abzy(this.e, this.b);
        this.t = new abpg(this.e);
        if (azlb.b()) {
            bootstrapOptions.c(aceb.b());
        }
        iva.a((Object) abnd);
        if (bootstrapOptions.n) {
            abnd abnd2 = abnd;
            this.r = abnd2.a(abpo.a, abpo.b, (acan) abpo.c, this.v, !this.f.i);
        } else {
            this.r = null;
        }
        this.q = abnd.a(abpo.a, (acan) abpo.c, this.v, this.f.i, true);
    }

    /* access modifiers changed from: protected */
    public final abox a() {
        return this.h;
    }

    /* access modifiers changed from: protected */
    public final BootstrapCompletionResult b() {
        abnw abnw = this.l;
        return new BootstrapCompletionResult(abnw.a, abnw.b, (ArrayList) null, abnw.c, (ArrayList) null, abnw.d, abnw.e);
    }

    public final void b(int i2) {
    }

    public final void e() {
        super.e();
        super.d();
        this.h = null;
        absy absy = this.r;
        if (absy != null) {
            absy.a();
        }
    }

    public final void f() {
        synchronized (this.o) {
            while (!this.o.isEmpty()) {
                if (!this.i) {
                    abtl abtl = (abtl) this.o.poll();
                    iwd iwd = d;
                    String valueOf = String.valueOf(abtl.getClass().getSimpleName());
                    iwd.a(valueOf.length() == 0 ? new String("Processing item from Request queue: ") : "Processing item from Request queue: ".concat(valueOf), new Object[0]);
                    abtl.a();
                } else {
                    d.c("Bootstrap paused.", new Object[0]);
                    return;
                }
            }
        }
    }

    public final void g() {
        if (!this.u) {
            c(2);
            this.u = true;
        }
    }

    public final void a(BootstrapProgressResult bootstrapProgressResult) {
        this.i = this.c.a(bootstrapProgressResult);
    }

    /* access modifiers changed from: protected */
    public final void a(MessagePayload messagePayload) {
        int i2;
        d.a("Processing MessagePayload.", new Object[0]);
        iva.a((Object) messagePayload, (Object) "payload cannot be null.");
        ArrayList arrayList = new ArrayList();
        DisplayText displayText = messagePayload.f;
        if (displayText != null) {
            arrayList.add(new abtj(this.c, displayText));
        }
        BootstrapConfigurations bootstrapConfigurations = messagePayload.e;
        if (bootstrapConfigurations != null) {
            if (!TextUtils.isEmpty(bootstrapConfigurations.d)) {
                arrayList.add(new abtk(this, this.c, bootstrapConfigurations));
            }
            abpi c = bootstrapConfigurations.c();
            this.j = c;
            abnw abnw = this.l;
            if (!c.a(2)) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            abnw.d = i2;
            if (this.j.a(9)) {
                this.l.a = 2;
                this.p.a(anvn.OEM_APP);
            } else if (this.j.a(8)) {
                this.l.a = 1;
                this.p.a(anvn.WIFI_D2D);
            }
            this.m = this.j.a(6);
            if (this.j.a(4)) {
                abpk d2 = acec.d(this.e);
                BootstrapOptions bootstrapOptions = this.f;
                d2.a(bootstrapOptions.v, bootstrapOptions.l);
            }
            d.b("from source: %s", this.j);
            DeviceDetails deviceDetails = bootstrapConfigurations.o;
            if (deviceDetails != null) {
                this.l.e = deviceDetails.b;
            }
            int i3 = bootstrapConfigurations.l;
            if (this.f.p && i3 > 0) {
                a(i3);
            }
        }
        AccountBootstrapPayload accountBootstrapPayload = messagePayload.g;
        if (accountBootstrapPayload != null) {
            arrayList.add(new abti(this.q, accountBootstrapPayload));
        }
        WorkProfilePayload workProfilePayload = messagePayload.m;
        if (workProfilePayload != null) {
            d.b("Persisting work profile %s", iwd.a((Object) workProfilePayload.b));
            this.m = false;
            this.s.a(workProfilePayload);
            this.p.e(workProfilePayload.b());
            this.l.d = workProfilePayload.c;
            this.n.f.a();
            CleanSharedSecretChimeraService.a(this.e);
            ScheduledFuture scheduledFuture = this.k;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
                this.k = null;
                g();
            }
        }
        ArrayList arrayList2 = messagePayload.n;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            this.t.a(arrayList2);
            CleanSharedSecretChimeraService.c(this.e);
        }
        AccountTransferPayload accountTransferPayload = messagePayload.k;
        if (accountTransferPayload != null) {
            arrayList.add(new abth(this.r, accountTransferPayload));
        }
        if (arrayList.size() == 0) {
            d.c("MessagePayload did not yield any Requests.", new Object[0]);
            if (Log.isLoggable(d.a, 2)) {
                iwd iwd = d;
                String valueOf = String.valueOf(messagePayload.toString());
                iwd.c(valueOf.length() == 0 ? new String("MessagePayload: ") : "MessagePayload: ".concat(valueOf), new Object[0]);
            }
        }
        if (messagePayload.i) {
            ArrayDeque arrayDeque = new ArrayDeque();
            synchronized (this.o) {
                while (!this.o.isEmpty()) {
                    arrayDeque.add((abtl) this.o.poll());
                }
                this.o.addAll(arrayList);
                this.o.addAll(arrayDeque);
            }
            this.i = false;
        } else {
            synchronized (this.o) {
                this.o.addAll(arrayList);
            }
        }
        f();
    }
}
