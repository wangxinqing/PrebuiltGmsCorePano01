package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;

/* renamed from: aada  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aada extends isy {
    public aada(Context context, Looper looper, ise ise, iea iea, igg igg) {
        super(context, looper, 218, ise, iea, igg);
    }

    public final Feature[] D() {
        return aaao.c;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.scheduler.IGmsTaskScheduler");
        if (queryLocalInterface instanceof aaas) {
            return (aaas) queryLocalInterface;
        }
        return new aaaq(iBinder);
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.scheduler.ACTION_PROXY_SCHEDULE";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.scheduler.IGmsTaskScheduler";
    }

    public final int d() {
        return 19792000;
    }
}
