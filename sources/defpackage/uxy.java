package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.SparseArray;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.messages.ClientAppIdentifier;
import com.google.android.gms.nearby.messages.Strategy;
import com.google.android.gms.nearby.messages.internal.SubscribeRequest;
import com.google.android.gms.nearby.messages.internal.UnsubscribeRequest;

/* renamed from: uxy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class uxy {
    public final Context a;
    public final ClientAppIdentifier b;
    public final uwl c;
    public final uyc d;
    public final uyf e;
    public final uwr f;
    public final vau g = new vau();
    public final var h;
    public final uyt i;
    public SparseArray j;
    private final IBinder k;
    private final uyj l;

    public uxy(Context context, ClientAppIdentifier clientAppIdentifier, uwl uwl) {
        this.a = context;
        this.b = clientAppIdentifier;
        this.c = uwl;
        this.d = (uyc) thl.a(context, uyc.class);
        this.k = new Binder();
        this.f = (uwr) thl.a(context, uwr.class);
        this.h = new var(this.a);
        this.e = new uyf(clientAppIdentifier, context, uwl, new vgm(context));
        this.l = (uyj) thl.a(context, uyj.class);
        this.i = (uyt) thl.a(context, uyt.class);
    }

    public static Strategy a(Strategy strategy, boolean z, boolean z2) {
        uyk uyk = new uyk(strategy);
        if (z) {
            if (strategy.h == -1) {
                uyk.c = 4;
            }
            if (strategy.i == 3) {
                if (!z2) {
                    uyk.a = 1;
                } else {
                    uyk.a = 2;
                }
            }
            if (strategy.f == 0) {
                uyk.b = 1;
            }
        }
        if (strategy.h == 2 && strategy.i == 3) {
            if (!z2) {
                uyk.a = 1;
            } else {
                uyk.a = 2;
            }
        } else if (strategy.f == 1) {
            uyk.c = 4;
        }
        return uyk.a();
    }

    public final int a(int i2) {
        uyf uyf = this.e;
        int i3 = uyf.c;
        int i4 = i2 | i3;
        uyf.c = i4;
        return i4 ^ i3;
    }

    public final IBinder b(vci vci) {
        return vci != null ? vci.asBinder() : this.k;
    }

    private final void a(PendingIntent pendingIntent, vci vci) {
        jjg jjg = tgc.a;
        this.c.a(pendingIntent);
        uyb uyb = new uyb(this.b, 5);
        this.d.a(uyb);
        this.f.a(vdo.a(vdv.a(pendingIntent), a(vci, uyb)), b(vci), this.b);
        this.h.a(pendingIntent);
    }

    public static void a(Status status, vci vci) {
        jjg jjg = tgc.a;
        if (vci != null) {
            try {
                vci.a(status);
            } catch (RemoteException e2) {
                status.toString();
            }
        }
    }

    private final void a(vcf vcf, vci vci) {
        jjg jjg = tgc.a;
        if (this.i.a(vcf) != null) {
            uyb uyb = new uyb(this.b, 5);
            this.d.a(uyb);
            this.f.a(vdo.a(vdv.a(vcf), a(vci, uyb)), b(vci), this.b);
        } else {
            a(vci);
        }
        this.h.a(new vaq(vcf));
    }

    public static void a(vci vci) {
        a(Status.a, vci);
    }

    public final icm a(vci vci, uyb uyb) {
        return new uxw(this, vci, uyb);
    }

    public final void a() {
        vau vau = this.g;
        boolean b2 = this.e.b((vci) null);
        try {
            int beginBroadcast = vau.a.beginBroadcast();
            jjg jjg = tgc.a;
            for (int i2 = 0; i2 < beginBroadcast; i2++) {
                ((vcn) vau.a.getBroadcastItem(i2)).a(b2);
            }
            vau.a.finishBroadcast();
        } catch (RemoteException e2) {
            anih anih = (anih) tgc.a.c();
            anih.a((Throwable) e2);
            ((anih) anih.a("vau", "a", 47, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to send onPermissionChange");
        } catch (Throwable th) {
            vau.a.finishBroadcast();
            throw th;
        }
    }

    public final void a(UnsubscribeRequest unsubscribeRequest) {
        vcf vcf;
        SparseArray sparseArray;
        uyf uyf = this.e;
        if (unsubscribeRequest.b != null) {
            if (!uyf.c(unsubscribeRequest.c)) {
                return;
            }
        } else if (!uyf.d(unsubscribeRequest.c) || !uyf.c(unsubscribeRequest.c)) {
            return;
        }
        int i2 = unsubscribeRequest.e;
        if (i2 == 0 || (sparseArray = this.j) == null) {
            vcf = unsubscribeRequest.b;
        } else {
            vcf = (vcf) sparseArray.get(i2, unsubscribeRequest.b);
            this.j.remove(i2);
        }
        if (vcf == null) {
            a(unsubscribeRequest.d, unsubscribeRequest.c);
        } else {
            a(vcf, unsubscribeRequest.c);
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.util.List, java.util.Collection] */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.List, java.util.Collection] */
    public final void a(boolean z) {
        SubscribeRequest b2;
        jjg jjg = tgc.a;
        var var = this.h;
        ? b3 = var.a.b();
        int size = b3.size();
        for (int i2 = 0; i2 < size; i2++) {
            try {
                ((vcm) b3.get(i2)).b();
            } catch (RemoteException e2) {
            }
        }
        ? b4 = var.c.b();
        int size2 = b4.size();
        for (int i3 = 0; i3 < size2; i3++) {
            try {
                ((vcq) b4.get(i3)).b();
            } catch (RemoteException e3) {
            }
        }
        var.a.a();
        var.c.a();
        for (arwm e4 : var.b.values()) {
            var.e.e(e4);
        }
        var.b.clear();
        for (arwm e5 : var.d.values()) {
            var.e.e(e5);
        }
        var.d.clear();
        if (z) {
            this.c.b().size();
            for (Bundle bundle : this.c.b()) {
                if (this.b.equals(uwl.e(bundle)) && (b2 = uwl.b(bundle)) != null) {
                    a(b2.f, (vci) null);
                }
            }
        }
        for (String a2 : this.l.a(this.b)) {
            this.f.a(vdo.a(vdt.a(this.b, a2), uxx.a), this.k, this.b);
        }
        for (uyq uyq : this.i.a(this.b)) {
            if (!uyq.a()) {
                a(uyq.b.a, (vci) null);
            }
        }
        SparseArray sparseArray = this.j;
        if (sparseArray != null) {
            sparseArray.clear();
            this.j = null;
        }
    }
}
