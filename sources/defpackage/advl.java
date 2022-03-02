package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: advl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class advl extends isy {
    public final Feature[] D() {
        return adty.c;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.userlocation.internal.ISemanticLocationProviderClient");
        if (queryLocalInterface instanceof advj) {
            return (advj) queryLocalInterface;
        }
        return new advh(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.userlocation.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.userlocation.internal.ISemanticLocationProviderClient";
    }

    public final int d() {
        return 12800000;
    }

    public advl(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 163, ise, ica, icb);
    }
}
