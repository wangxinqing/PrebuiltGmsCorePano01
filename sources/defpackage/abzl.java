package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: abzl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abzl extends isy {
    public final Feature[] D() {
        return abmo.j;
    }

    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceService");
        if (queryLocalInterface instanceof abxt) {
            return (abxt) queryLocalInterface;
        }
        return new abxr(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.smartdevice.d2d.TargetDeviceService.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.smartdevice.d2d.internal.ITargetDeviceService";
    }

    public final int d() {
        return 12800000;
    }

    public final Feature[] v() {
        return new Feature[0];
    }

    public abzl(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 76, ise, ica, icb);
    }
}
