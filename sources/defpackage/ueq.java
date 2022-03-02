package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import java.io.Closeable;
import java.util.Set;

/* renamed from: ueq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ueq extends isy {
    public final Set a = new ob();
    public final Set u = new ob();
    public final Set v = new ob();
    public uik w;
    private final long x = ((long) hashCode());
    private final String y;

    private final void B() {
        for (ueg a2 : this.a) {
            a2.a();
        }
        for (uem a3 : this.u) {
            a3.a();
        }
        for (ueb a4 : this.v) {
            a4.a();
        }
        this.a.clear();
        this.u.clear();
        this.v.clear();
        uik uik = this.w;
        if (uik != null) {
            uik.c = true;
            uik.a.shutdownNow();
            jjt.a((Closeable) uik.b);
            this.w = null;
        }
    }

    public static Status b(int i) {
        return new Status(i, tit.g(i));
    }

    public final void A() {
        ((ugu) x()).a(new uix().a);
    }

    public final Feature[] D() {
        return new Feature[]{tcm.b};
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
        if (queryLocalInterface instanceof ugu) {
            return (ugu) queryLocalInterface;
        }
        return new ugs(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.nearby.connection.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.nearby.internal.connection.INearbyConnectionService";
    }

    public final int d() {
        return 12451000;
    }

    /* access modifiers changed from: protected */
    public final Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putLong("clientId", this.x);
        String str = this.y;
        if (str != null) {
            bundle.putString("zeroPartyIdentifier", str);
        }
        return bundle;
    }

    public final void j() {
        if (l()) {
            try {
                ((ugu) x()).a(new udt().a);
            } catch (RemoteException e) {
                Log.w("NearbyConnectionsClient", "Failed to notify client disconnect.", e);
            }
        }
        B();
        super.j();
    }

    public final boolean n() {
        return tcn.d(this.c);
    }

    public ueq(Context context, Looper looper, ise ise, tis tis, ica ica, icb icb) {
        super(context, looper, 54, ise, ica, icb);
        this.y = tis != null ? tis.a : null;
    }

    public final void a(int i) {
        if (i == 1) {
            B();
        }
        super.a(i);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void a(IInterface iInterface) {
        super.a((IInterface) (ugu) iInterface);
        this.w = new uik();
    }
}
