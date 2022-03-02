package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: rya  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rya extends isy {
    public final Feature[] D() {
        return oqd.h;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdd.IMobileDataDownloadService");
        if (queryLocalInterface instanceof rxe) {
            return (rxe) queryLocalInterface;
        }
        return new rxc(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.mdd.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.mdd.IMobileDataDownloadService";
    }

    public final int d() {
        return 12600000;
    }

    public rya(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 152, ise, ica, icb);
    }
}
