package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: acfr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class acfr extends isy {
    public final Feature[] D() {
        return abmo.j;
    }

    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.smartdevice.directtransfer.internal.ISourceDirectTransferService");
        if (queryLocalInterface instanceof acfj) {
            return (acfj) queryLocalInterface;
        }
        return new acfh(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.smartdevice.directtransfer.SourceDirectTransferService.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.smartdevice.directtransfer.internal.ISourceDirectTransferService";
    }

    public final int d() {
        return 12800000;
    }

    public acfr(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 210, ise, ica, icb);
    }
}
