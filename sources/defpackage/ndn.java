package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: ndn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ndn extends ndg {
    public static final iyc a = iyc.FIT_CONFIG;
    public static final ibg u = new ibg();

    static {
        new ibq("Fitness.CONFIG_API", new ndl(), u);
        new ibq("Fitness.CONFIG_CLIENT", new ndm(), u);
    }

    public ndn(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, a, ica, icb, ise);
    }

    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitConfigApi");
        if (queryLocalInterface instanceof nee) {
            return (nee) queryLocalInterface;
        }
        return new nee(iBinder);
    }

    public final String b() {
        return "com.google.android.gms.fitness.ConfigApi";
    }

    public final String c() {
        return "com.google.android.gms.fitness.internal.IGoogleFitConfigApi";
    }

    public final int d() {
        return 12451000;
    }
}
