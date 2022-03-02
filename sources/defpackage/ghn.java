package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: ghn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ghn extends isy {
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.managed.internal.IEmmService");
        if (queryLocalInterface instanceof ght) {
            return (ght) queryLocalInterface;
        }
        return new ghr(iBinder);
    }

    public final String b() {
        return "com.google.android.gms.auth.managed.START_EMM_SERVICE";
    }

    public final String c() {
        return "com.google.android.gms.auth.managed.internal.IEmmService";
    }

    public final int d() {
        return 12800000;
    }

    public ghn(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 136, ise, ica, icb);
    }
}
