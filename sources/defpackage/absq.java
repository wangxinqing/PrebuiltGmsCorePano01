package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.smartdevice.d2d.AccountTransferResult;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.d2d.BootstrapConfigurations;
import com.google.android.gms.smartdevice.d2d.BootstrapOptions;
import com.google.android.gms.smartdevice.d2d.DeviceDetails;
import com.google.android.gms.smartdevice.d2d.EsimActivationInfo;
import com.google.android.gms.smartdevice.d2d.data.AccountBootstrapPayload;
import com.google.android.gms.smartdevice.d2d.data.AccountTransferPayload;
import com.google.android.gms.smartdevice.d2d.data.MessagePayload;
import com.google.android.gms.smartdevice.d2d.ui.SourceDirectTransferChimeraActivity;
import com.google.android.gms.smartdevice.d2d.utils.ProxyResultReceiver;
import java.util.ArrayList;
import java.util.List;

/* renamed from: absq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class absq extends abnu implements aced {
    public static final iwd h = acqa.a("D2D", "SourceDirectTransferController");
    private final acpv A;
    private final ProxyResultReceiver B;
    private final absn C;
    private final abzy D;
    private final abpg E;
    private final ArrayList F = new ArrayList();
    public final Context i;
    public final acah j;
    public final abvo k;
    public final BootstrapConfigurations l;
    public final abnd m;
    public final acef n;
    public final absp o;
    public BootstrapOptions p;
    public Boolean q = null;
    public boolean r;
    public boolean s;
    public abpt t;
    public abpr u;
    public acwa v;
    public acwa w;
    public final abps x = new absj(this);
    public final abwu y;
    private final acpt z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public absq(abpo abpo, BootstrapConfigurations bootstrapConfigurations, acpt acpt, acpv acpv, abwu abwu) {
        super(abpo.b);
        long j2;
        abvs a = abvs.a(abpo.a);
        abnd abnd = abnd.a;
        abzy abzy = new abzy(abpo.a, abpo.b);
        abpg abpg = new abpg(abpo.a);
        this.i = abpo.a;
        acah acah = (acah) abpo.c;
        iva.a((Object) acah);
        this.j = acah;
        this.k = abpo.d;
        iva.a((Object) bootstrapConfigurations);
        this.l = bootstrapConfigurations;
        iva.a((Object) acpt);
        this.z = acpt;
        iva.a((Object) acpv);
        this.A = acpv;
        this.D = abzy;
        this.E = abpg;
        iva.a((Object) abwu);
        this.y = abwu;
        this.m = abnd;
        this.n = new acef();
        this.B = new ProxyResultReceiver(this.f, this);
        this.C = new absn(a, this.l.h, new absk(this));
        if (this.l.j) {
            this.q = false;
            this.C.a();
        }
        String str = abpo.e;
        if (str != null && str.startsWith("com.google.android.wearable")) {
            j2 = azlx.a.a().a();
        } else {
            j2 = azkc.a.a().a();
        }
        this.o = new absp(this, j2);
    }

    public static List a(Context context) {
        Account[] a = acpd.a(context).a("com.google");
        ArrayList arrayList = new ArrayList();
        for (Account account : a) {
            arrayList.add(new BootstrapAccount(account.name, account.type));
        }
        return arrayList;
    }

    public final void b(int i2, String str) {
        this.z.a();
        b(i2);
        a(i2, str);
    }

    /* access modifiers changed from: protected */
    public final void c() {
        this.z.a();
        this.k.a();
        this.n.a(1011, Bundle.EMPTY);
        if (azjz.c()) {
            MessagePayload messagePayload = new MessagePayload();
            messagePayload.a(2);
            a((aora) new absm(this), messagePayload);
            return;
        }
        a(2);
        h();
    }

    /* access modifiers changed from: protected */
    public final void d() {
        absn absn = this.C;
        h.a("Encryption negotiation has completed.", new Object[0]);
        absn.a = true;
        absn.b();
    }

    /* access modifiers changed from: protected */
    public final acpv e() {
        return this.A;
    }

    public final synchronized void f() {
        int i2;
        if (!this.l.k) {
            i2 = 8;
        } else {
            i2 = 9;
        }
        a(new abwj(true, this, i2));
    }

    public final synchronized void g() {
        this.z.a();
        this.s = true;
        this.j.b(10564);
        this.n.a(1012, Bundle.EMPTY);
        a(1);
        a();
    }

    public final void h() {
        try {
            abwu abwu = this.y;
            ArrayList arrayList = this.F;
            abwu.a((AccountTransferResult[]) arrayList.toArray(new AccountTransferResult[arrayList.size()]));
        } catch (RemoteException e) {
            h.e("Could not handle complete request", e, new Object[0]);
        } catch (Throwable th) {
            a();
            throw th;
        }
        a();
    }

    public final void a() {
        super.a();
        this.z.a();
        this.o.b.b();
        abpr abpr = this.u;
        if (abpr != null) {
            abpr.b();
        }
    }

    public final void b(byte[] bArr) {
        this.o.a();
        super.b(bArr);
    }

    public final void a(int i2, Bundle bundle) {
        iwd iwd = h;
        StringBuilder sb = new StringBuilder(28);
        sb.append("onReceiveResult: ");
        sb.append(i2);
        iwd.a(sb.toString(), new Object[0]);
        switch (i2) {
            case 1001:
                this.n.a(a(bundle, "resultReceiver"));
                return;
            case 1002:
                this.n.a();
                return;
            case 1003:
                this.t.a(bundle.getParcelableArrayList("accountChallengeData"));
                this.o.c();
                return;
            case 1004:
                this.q = Boolean.valueOf(bundle.getBoolean("lockScreenConfirmed"));
                this.C.a();
                this.o.c();
                return;
            case 1005:
                b(10564, "Bootstrap canceled by user.");
                return;
            case 1006:
                b(10585, "The source device is managed by a device owner.");
                return;
            case 1007:
                b(10586, "The source device backup account is a managed account.");
                return;
            default:
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("Unknown resultCode: ");
                sb2.append(i2);
                throw new RuntimeException(sb2.toString());
        }
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, String str) {
        this.z.a();
        this.f.post(new absl(this, i2, str));
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(abwj abwj) {
        this.o.d();
        a(abwj, false);
        this.z.a(this);
        h.a("startEncryptionNegotiation", new Object[0]);
    }

    /* access modifiers changed from: protected */
    public final void a(MessagePayload messagePayload) {
        boolean z2;
        abpr abpr;
        abpt abpt;
        boolean z3;
        acwa acwa;
        acwa acwa2;
        boolean z4;
        boolean z5;
        boolean z6;
        BootstrapOptions bootstrapOptions = messagePayload.d;
        String str = null;
        if (bootstrapOptions != null) {
            if (bootstrapOptions.j != -1) {
                z3 = true;
            } else {
                z3 = false;
            }
            iva.b(z3);
            this.p = bootstrapOptions;
            abpi b = bootstrapOptions.b();
            abpi abpi = new abpi();
            boolean a = b.a(5);
            boolean c = azkf.c();
            boolean d = azkf.d();
            if (azks.c()) {
                h.a("createWorkProfileTask: targetSupport=%s, supportsWorkProfileSetup=%s, workProfileFallback=%s", Boolean.valueOf(a), Boolean.valueOf(c), Boolean.valueOf(d));
            }
            if (d) {
                if (this.D.c() == 4) {
                    d = true;
                } else {
                    d = false;
                }
            }
            if (!a) {
                acwa = null;
            } else if (!c && !d) {
                acwa = null;
            } else {
                abpi.a(6, true);
                acwa = this.D.a();
            }
            this.v = acwa;
            EsimActivationInfo esimActivationInfo = bootstrapOptions.w;
            if (this.p.w == null || !azki.b()) {
                acwa2 = null;
            } else {
                abpi.a(7, true);
                acwa2 = this.E.a(esimActivationInfo);
            }
            this.w = acwa2;
            abpi.a(2, new abzt(this.i).a());
            BootstrapConfigurations bootstrapConfigurations = this.l;
            long a2 = jhg.a(this.i);
            hxj hxj = hxj.a;
            bootstrapConfigurations.a(new DeviceDetails(a2, hxz.j(this.i)));
            this.l.a(abpi);
            if (this.p.j == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.r = z4;
            absp absp = this.o;
            absp.a = z4;
            absp.d();
            if (!acpy.a(this.p.l)) {
                this.p.a(acpy.a());
            }
            h.b("from target: %s", bootstrapOptions.b());
            acah acah = this.j;
            acah.a(this.p.l);
            acah.a(this.r);
            if (!this.p.p || !azlf.d()) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (z5) {
                this.l.a(this.p.q);
            } else {
                this.l.a(0);
            }
            MessagePayload messagePayload2 = new MessagePayload();
            messagePayload2.a(this.l);
            b(messagePayload2);
            if (z5) {
                c(this.p.q);
            }
            absn absn = this.C;
            h.a("Received bootstrap options from target device.", new Object[0]);
            absn.b = true;
            absn.b();
            this.o.b();
            boolean a3 = this.p.b().a(1);
            BootstrapOptions bootstrapOptions2 = this.p;
            if (bootstrapOptions2.s >= 11800000) {
                z6 = a3;
            } else {
                z6 = true;
            }
            PendingIntent a4 = SourceDirectTransferChimeraActivity.a(this.i, this.B, this.l, bootstrapOptions2, acpf.a(bootstrapOptions2), z6);
            try {
                h.a("Sending pending intent to listener", new Object[0]);
                this.y.a(a4);
                z2 = true;
            } catch (RemoteException e) {
                h.e("RemoteException trying to start UI", e, new Object[0]);
                z2 = true;
            }
        } else {
            z2 = false;
        }
        AccountBootstrapPayload accountBootstrapPayload = messagePayload.g;
        if (!(accountBootstrapPayload == null || (abpt = this.t) == null)) {
            abpt.a(accountBootstrapPayload);
            z2 = true;
        }
        AccountTransferPayload accountTransferPayload = messagePayload.k;
        if (!(accountTransferPayload == null || (abpr = this.u) == null)) {
            abpr.a(accountTransferPayload);
            z2 = true;
        }
        ArrayList arrayList = messagePayload.j;
        if (arrayList != null) {
            this.F.addAll(arrayList);
            int size = arrayList.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                if (((AccountTransferResult) arrayList.get(i3)).c == 1) {
                    i2++;
                }
            }
            if (i2 > 0 && acea.b()) {
                BootstrapOptions bootstrapOptions3 = this.p;
                if (bootstrapOptions3 != null) {
                    str = bootstrapOptions3.g;
                }
                acea.a(this.i, i2, str);
            }
        } else if (!z2) {
            h.e("Did not process message for payload: ", messagePayload.toString());
        }
    }

    public final void a(byte[] bArr) {
        this.o.a();
        super.a(bArr);
    }
}
