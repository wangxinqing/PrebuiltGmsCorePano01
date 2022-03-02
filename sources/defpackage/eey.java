package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: eey  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eey extends isy {
    private IBinder a;

    public final IBinder a() {
        if (this.a == null) {
            this.a = new Binder();
        }
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "com.google.android.gms.audiomodem.service.AudioModemService.START";
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return "com.google.android.gms.audiomodem.internal.IAudioModemService";
    }

    public final int d() {
        return 12800000;
    }

    public eey(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, 48, ise, ica, icb);
        new efp();
        new efp();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.audiomodem.internal.IAudioModemService");
        if (queryLocalInterface instanceof efe) {
            return (efe) queryLocalInterface;
        }
        return new efc(iBinder);
    }
}
