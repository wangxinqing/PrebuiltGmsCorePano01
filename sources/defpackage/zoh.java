package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: zoh  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zoh extends isy {
    public final Feature[] D() {
        return zns.b;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.pseudonymous.internal.IPseudonymousIdService");
        if (queryLocalInterface instanceof zog) {
            return (zog) queryLocalInterface;
        }
        return new zoe(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.pseudonymous.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.pseudonymous.internal.IPseudonymousIdService";
    }

    public final int d() {
        return 9410000;
    }

    public zoh(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 38, ise, ica, icb);
    }
}
