package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: jpj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jpj extends isy {
    public final Feature[] D() {
        return jph.d;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.constellation.internal.IConstellationApiService");
        if (queryLocalInterface instanceof jpk) {
            return (jpk) queryLocalInterface;
        }
        return new jpk(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.constellation.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.constellation.internal.IConstellationApiService";
    }

    public final int d() {
        return 12800000;
    }

    public jpj(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 155, ise, ica, icb);
    }
}
