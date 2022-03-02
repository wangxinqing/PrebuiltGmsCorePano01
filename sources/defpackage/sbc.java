package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: sbc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sbc extends isy {
    public final Feature[] D() {
        return oqd.h;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.mdh.internal.IMobileDataHubService");
        if (queryLocalInterface instanceof sav) {
            return (sav) queryLocalInterface;
        }
        return new sat(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.mdh.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.mdh.internal.IMobileDataHubService";
    }

    public final int d() {
        return 12600000;
    }

    public sbc(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 127, ise, ica, icb);
    }
}
