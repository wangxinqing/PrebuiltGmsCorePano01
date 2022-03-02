package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: tdo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class tdo extends isy {
    public tdo(Context context, Looper looper, iea iea, igg igg, ise ise) {
        super(context, looper, 69, ise, iea, igg);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService");
        if (queryLocalInterface instanceof tee) {
            return (tee) queryLocalInterface;
        }
        return new tec(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.nearby.bootstrap.service.NearbyBootstrapService.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.nearby.bootstrap.internal.INearbyBootstrapService";
    }

    public final int d() {
        return 12451000;
    }
}
