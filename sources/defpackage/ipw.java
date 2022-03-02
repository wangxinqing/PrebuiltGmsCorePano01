package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: ipw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ipw extends isy {
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.download.internal.IDownloadService");
        if (queryLocalInterface instanceof ipz) {
            return (ipz) queryLocalInterface;
        }
        return new ipx(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.common.download.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.common.download.internal.IDownloadService";
    }

    public final int d() {
        return 12800000;
    }

    public ipw(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 43, ise, ica, icb);
    }
}
