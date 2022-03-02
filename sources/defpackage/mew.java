package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: mew  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mew extends isy {
    public final boolean E() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.facs.cache.internal.IFacsCacheService");
        if (queryLocalInterface instanceof mfd) {
            return (mfd) queryLocalInterface;
        }
        return new mfb(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.facs.cache.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.facs.cache.internal.IFacsCacheService";
    }

    public final int d() {
        return 19525000;
    }

    public mew(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 202, ise, ica, icb);
    }
}
