package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: wks  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wks extends isy {
    public wks(Context context, Looper looper, ise ise, iea iea, igg igg) {
        super(context, looper, 198, ise, iea, igg);
    }

    public final Feature[] D() {
        return new Feature[]{wko.a, wko.b, wko.c, wko.d, wko.f, wko.e, wko.g, wko.h, wko.i, wko.j, wko.k, wko.l, wko.m, wko.n};
    }

    /* access modifiers changed from: protected */
    public final boolean F() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.pay.internal.IPayService");
        if (queryLocalInterface instanceof wkr) {
            return (wkr) queryLocalInterface;
        }
        return new wkr(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.pay.service.BIND";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.pay.internal.IPayService";
    }

    public final int d() {
        return 17895000;
    }
}
