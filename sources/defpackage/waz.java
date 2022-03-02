package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: waz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class waz extends isy {
    public final Feature[] D() {
        return new Feature[]{tcm.a};
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.sharing.internal.INearbySharingService");
        if (queryLocalInterface instanceof vyk) {
            return (vyk) queryLocalInterface;
        }
        return new vyi(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.nearby.sharing.START_SERVICE";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.nearby.sharing.internal.INearbySharingService";
    }

    public final int d() {
        return 15000000;
    }

    public final boolean n() {
        return tcn.d(this.c);
    }

    public waz(Context context, Looper looper, ica ica, icb icb, ise ise) {
        super(context, looper, 194, ise, ica, icb);
    }

    public final void a(int i) {
        if (i == 1) {
            wbd.a().b();
            way.a().b();
        }
        super.a(i);
    }
}
