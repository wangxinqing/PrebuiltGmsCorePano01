package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: qgm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qgm extends isy {
    public qgm(Context context, Looper looper, ica ica, icb icb) {
        super(context, looper, 121, ise.a(context), ica, icb);
    }

    public final Feature[] D() {
        return new Feature[]{qdv.a, qdv.b, qdv.c, qdv.d};
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.instantapps.internal.IInstantAppsService");
        if (queryLocalInterface instanceof qgb) {
            return (qgb) queryLocalInterface;
        }
        return new qfz(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.instantapps.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.instantapps.internal.IInstantAppsService";
    }

    public final int d() {
        return 12200000;
    }
}
