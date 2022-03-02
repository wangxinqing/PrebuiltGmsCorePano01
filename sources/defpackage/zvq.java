package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: zvq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zvq extends isy {
    public final Feature[] D() {
        return zrb.d;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.romanesco.internal.IRomanescoService");
        if (queryLocalInterface instanceof zvp) {
            return (zvp) queryLocalInterface;
        }
        return new zvn(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.romanesco.service.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.romanesco.internal.IRomanescoService";
    }

    public final int d() {
        return 12800000;
    }

    public zvq(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 135, ise, ica, icb);
    }
}
