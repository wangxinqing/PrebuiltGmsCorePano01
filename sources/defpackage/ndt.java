package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: ndt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ndt extends ndg {
    public static final iyc a = iyc.FIT_HISTORY;
    public static final ibg u = new ibg();

    static {
        new ibq("Fitness.API", new ndr(), u);
        new ibq("Fitness.CLIENT", new nds(), u);
    }

    public ndt(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, a, ica, icb, ise);
    }

    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitHistoryApi");
        if (queryLocalInterface instanceof neg) {
            return (neg) queryLocalInterface;
        }
        return new neg(iBinder);
    }

    public final String b() {
        return "com.google.android.gms.fitness.HistoryApi";
    }

    public final String c() {
        return "com.google.android.gms.fitness.internal.IGoogleFitHistoryApi";
    }

    public final int d() {
        return 12451000;
    }
}
