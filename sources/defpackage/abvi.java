package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import com.google.android.gms.auth.api.accounttransfer.AccountTransferMsg;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import com.google.android.gms.smartdevice.d2d.AccountTransferResult;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.CleanSharedSecretChimeraService;
import com.google.android.gms.smartdevice.d2d.DeviceDetails;
import com.google.android.gms.smartdevice.d2d.ManagedAccountSetupInfo;
import com.google.android.gms.smartdevice.d2d.TargetDirectTransferController$3;
import com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload;
import com.google.android.gms.smartdevice.d2d.data.AccountTransferPayload;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.data.WorkProfilePayload;
import com.google.android.gms.smartdevice.d2d.ui.ForwardingChimeraActivity;
import com.google.android.gms.smartdevice.d2d.utils.ProxyResultReceiver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: abvi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abvi extends abnu implements acpr, aced {
    public static final iwd h = acqa.a("D2D", "TargetDirectTransferController");
    private final absy A;
    private final abzt B;
    private final abzy C;
    private final abpg D;
    private boolean E;
    private boolean F;
    private final AtomicBoolean G = new AtomicBoolean(false);
    private final absz H = new abvf(this);
    public final Context i;
    public final abvo j;
    public final aboy k;
    public final acpt l;
    public final ProxyResultReceiver m;
    public final acef n;
    public final ArrayList o = new ArrayList();
    public final ScheduledExecutorService p;
    public boolean q;
    public Future r;
    public boolean s;
    private final abpo t;
    private final acan u;
    private final BootstrapOptions v;
    private final boolean w;
    private final acpv x;
    private final abnd y;
    private final abta z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public abvi(defpackage.abpo r17, com.google.android.gms.smartdevice.d2d.BootstrapOptions r18, defpackage.acpt r19, defpackage.acpv r20, defpackage.aboy r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            abnd r3 = defpackage.abnd.a
            abzy r4 = new abzy
            android.content.Context r5 = r1.a
            android.os.Handler r6 = r1.b
            r4.<init>(r5, r6)
            abpg r5 = new abpg
            android.content.Context r6 = r1.a
            r5.<init>(r6)
            r6 = 1
            r7 = 10
            jfc r7 = defpackage.jfm.a(r6, r7)
            android.os.Handler r8 = r1.b
            r0.<init>(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r0.o = r8
            java.util.concurrent.atomic.AtomicBoolean r8 = new java.util.concurrent.atomic.AtomicBoolean
            r9 = 0
            r8.<init>(r9)
            r0.G = r8
            abvf r8 = new abvf
            r8.<init>(r0)
            r0.H = r8
            r0.t = r1
            android.content.Context r8 = r1.a
            r0.i = r8
            java.lang.Object r8 = r1.c
            acan r8 = (defpackage.acan) r8
            r0.u = r8
            abvo r8 = r1.d
            r0.j = r8
            defpackage.amrl.a((java.lang.Object) r18)
            r0.v = r2
            defpackage.amrl.a((java.lang.Object) r21)
            r8 = r21
            r0.k = r8
            defpackage.amrl.a((java.lang.Object) r19)
            r8 = r19
            r0.l = r8
            defpackage.amrl.a((java.lang.Object) r20)
            r8 = r20
            r0.x = r8
            r0.C = r4
            r0.D = r5
            r0.p = r7
            r0.y = r3
            com.google.android.gms.smartdevice.d2d.utils.ProxyResultReceiver r3 = new com.google.android.gms.smartdevice.d2d.utils.ProxyResultReceiver
            android.os.Handler r4 = r1.b
            r3.<init>(r4, r0)
            r0.m = r3
            acef r3 = new acef
            r3.<init>()
            r0.n = r3
            android.content.Context r3 = r0.i
            abzt r3 = defpackage.acec.c(r3)
            r0.B = r3
            int r3 = r2.j
            if (r3 != r6) goto L_0x008a
            r3 = 1
            goto L_0x008b
        L_0x008a:
            r3 = 0
        L_0x008b:
            r0.w = r3
            android.content.Context r3 = r0.i
            long r4 = r2.l
            boolean r4 = defpackage.acpy.a(r4)
            if (r4 != 0) goto L_0x009e
            long r4 = defpackage.acpy.a()
            r2.a((long) r4)
        L_0x009e:
            defpackage.acpf.a((android.content.Context) r3)
            r18.g()
            boolean r3 = defpackage.azlf.d()
            r2.c((boolean) r3)
            boolean r3 = defpackage.azlf.n()
            if (r3 == 0) goto L_0x00b6
            int r3 = defpackage.abnb.c()
            goto L_0x00ba
        L_0x00b6:
            int r3 = defpackage.abnb.d()
        L_0x00ba:
            r2.c((int) r3)
            abpi r3 = new abpi
            r3.<init>()
            azlf r4 = defpackage.azlf.a
            azlg r4 = r4.a()
            boolean r4 = r4.f()
            r3.a(r6, r4)
            r4 = 5
            boolean r5 = defpackage.azkf.e()
            r3.a(r4, r5)
            long r4 = r3.b
            r2.c((long) r4)
            long r3 = r3.a
            r2.b((long) r3)
            acan r3 = r0.u
            com.google.android.gms.smartdevice.d2d.BootstrapOptions r4 = r0.v
            long r4 = r4.l
            r3.a((long) r4)
            boolean r4 = r0.w
            r3.a((boolean) r4)
            abnd r10 = r0.y
            android.content.Context r11 = r0.i
            acan r12 = r0.u
            absz r13 = r0.H
            boolean r14 = r0.w
            r15 = 0
            abta r3 = r10.a((android.content.Context) r11, (defpackage.acan) r12, (defpackage.absz) r13, (boolean) r14, (boolean) r15)
            r0.z = r3
            boolean r2 = r2.n
            if (r2 == 0) goto L_0x0122
            iwd r2 = h
            java.lang.Object[] r3 = new java.lang.Object[r9]
            java.lang.String r4 = "Target supports 3P MFM"
            r2.a(r4, r3)
            boolean r2 = r0.w
            abnd r7 = r0.y
            android.content.Context r8 = r0.i
            android.os.Handler r9 = r1.b
            acan r10 = r0.u
            absz r11 = r0.H
            r12 = r2 ^ 1
            absy r1 = r7.a((android.content.Context) r8, (android.os.Handler) r9, (defpackage.acan) r10, (defpackage.absz) r11, (boolean) r12)
            r0.A = r1
            return
        L_0x0122:
            iwd r1 = h
            java.lang.Object[] r2 = new java.lang.Object[r9]
            java.lang.String r3 = "Target does not support 3P MFM"
            r1.a(r3, r2)
            r1 = 0
            r0.A = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abvi.<init>(abpo, com.google.android.gms.smartdevice.d2d.BootstrapOptions, acpt, acpv, aboy):void");
    }

    public final void a() {
        super.a();
        h.a("Cleaning up.", new Object[0]);
        this.l.a();
        absy absy = this.A;
        if (absy != null) {
            absy.a();
        }
    }

    public final void b(int i2, String str) {
        this.l.a();
        b(i2);
        a(i2, str);
    }

    /* access modifiers changed from: protected */
    public final void c() {
        h.a("handleOnCompleted().", new Object[0]);
        if (this.G.get()) {
            h.c("Complete state is already handled.", new Object[0]);
            return;
        }
        this.G.set(true);
        this.l.a();
        this.j.a();
        aboy aboy = this.k;
        ArrayList arrayList = this.o;
        AccountTransferResult[] accountTransferResultArr = (AccountTransferResult[]) arrayList.toArray(new AccountTransferResult[arrayList.size()]);
        ((abvj) aboy).c.b = null;
        try {
            aboy.b.a(accountTransferResultArr);
        } catch (RemoteException e) {
            aboy.a.a((Throwable) e);
        }
        a();
    }

    /* access modifiers changed from: protected */
    public final void d() {
        h.b("-> Sending BootstrapOptions", new Object[0]);
        MessagePayload messagePayload = new MessagePayload();
        messagePayload.a(this.v);
        b(messagePayload);
    }

    /* access modifiers changed from: protected */
    public final acpv e() {
        return this.x;
    }

    public final void f() {
        this.s = true;
        this.u.a(10564);
        this.l.a();
        this.n.a(2051, Bundle.EMPTY);
        a(1);
        a();
    }

    public final void g() {
        if (azjz.c()) {
            MessagePayload messagePayload = new MessagePayload();
            messagePayload.a(2);
            MessagePayload messagePayload2 = new MessagePayload();
            messagePayload2.a(this.o);
            a((aora) new abvh(this), messagePayload2, messagePayload);
            return;
        }
        MessagePayload messagePayload3 = new MessagePayload();
        messagePayload3.a(this.o);
        b(messagePayload3);
        a(2);
    }

    public final void a(int i2, Bundle bundle) {
        switch (i2) {
            case 2001:
                this.n.a(a(bundle, "resultReceiver"));
                return;
            case 2002:
                this.n.a();
                return;
            case 2003:
                a(bundle.getParcelableArrayList("accountChallengeData"));
                a((List) this.o);
                return;
            case 2004:
                b(10564, "User nagivated back in UI.");
                return;
            default:
                StringBuilder sb = new StringBuilder(32);
                sb.append("Unknown result code: ");
                sb.append(i2);
                throw new RuntimeException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, String str) {
        this.l.a();
        this.f.post(new abvg(this, i2, str));
    }

    /* access modifiers changed from: protected */
    public final void a(MessagePayload messagePayload) {
        boolean z2;
        BootstrapConfigurations bootstrapConfigurations = messagePayload.e;
        if (bootstrapConfigurations != null) {
            h.a("processBootstrapConfigurations.", new Object[0]);
            int i2 = bootstrapConfigurations.l;
            if (i2 > 0 && this.v.p) {
                c(i2);
            }
            abpi c = bootstrapConfigurations.c();
            this.E = c.a(2);
            this.q = c.a(6);
            DeviceDetails deviceDetails = bootstrapConfigurations.o;
            if (deviceDetails != null && deviceDetails.d) {
                this.u.f(3);
            } else {
                this.u.f(2);
            }
            h.b("from source: %s", c);
            z2 = true;
        } else {
            z2 = false;
        }
        AccountBootstrapPayload accountBootstrapPayload = messagePayload.g;
        if (accountBootstrapPayload != null) {
            this.z.a(accountBootstrapPayload);
            z2 = true;
        }
        AccountTransferPayload accountTransferPayload = messagePayload.k;
        if (!(accountTransferPayload == null || this.A == null)) {
            AccountTransferMsg b = accountTransferPayload.b();
            if (b != null) {
                this.A.a(b);
            }
            z2 = true;
        }
        WorkProfilePayload workProfilePayload = messagePayload.m;
        if (workProfilePayload != null) {
            h.b("Persisting work profile %s", iwd.a((Object) workProfilePayload.b));
            this.q = false;
            this.C.a(workProfilePayload);
            this.t.f.a();
            CleanSharedSecretChimeraService.a(this.i);
            this.u.e(workProfilePayload.b());
            Future future = this.r;
            if (future != null) {
                future.cancel(true);
                this.r = null;
                a((List) this.o);
            }
        }
        ArrayList arrayList = messagePayload.n;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.D.a(arrayList);
            CleanSharedSecretChimeraService.c(this.i);
        }
        if (!z2) {
            h.e("Did not process message for payload: ", messagePayload.toString());
        }
    }

    public final void a(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.o.add(new AccountTransferResult(new BootstrapAccount(((Bundle) arrayList.get(i2)).getString("name"), "com.google"), 1));
        }
    }

    public final void a(List list) {
        ManagedAuthOptions managedAuthOptions;
        int i2;
        int i3;
        int i4;
        if (this.F) {
            h.d("Transfer already completed", new Object[0]);
            return;
        }
        if (this.q) {
            h.d("Never received work profile data", new Object[0]);
        }
        this.F = true;
        if (this.w || azlf.a.a().Q()) {
            g();
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            AccountTransferResult accountTransferResult = (AccountTransferResult) list.get(i5);
            if (accountTransferResult.c == 1) {
                BootstrapAccount bootstrapAccount = accountTransferResult.b;
                arrayList.add(new Account(bootstrapAccount.b, bootstrapAccount.c));
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i6 = 0; i6 < size2; i6++) {
            Account account = (Account) arrayList.get(i6);
            if (this.B.a(account)) {
                Bundle bundle = new Bundle();
                bundle.putString("theme", jli.a("setupwizard.theme", "glif_light"));
                abzt abzt = this.B;
                if (!azkf.b()) {
                    managedAuthOptions = new ManagedAuthOptions();
                } else {
                    try {
                        i2 = ((ManagedAccountSetupInfo) acws.a(this.C.b())).b;
                    } catch (InterruptedException | ExecutionException e) {
                        h.a(e);
                        i2 = 0;
                    }
                    if (!this.E) {
                        i3 = i2 == 4 ? 1 : i2 == 3 ? 2 : 0;
                    } else {
                        i3 = 1;
                    }
                    if (this.v.b == 3) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    managedAuthOptions = new ManagedAuthOptions(i3, i4);
                }
                Intent a = abzt.a(account, bundle, managedAuthOptions);
                if (a != null) {
                    arrayList2.add(a);
                }
            }
        }
        if (arrayList2.isEmpty()) {
            g();
        } else {
            this.k.a(ForwardingChimeraActivity.a(this.i, (ResultReceiver) new TargetDirectTransferController$3(this, this.f), arrayList2));
        }
    }
}
