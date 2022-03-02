package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: ndq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ndq extends ndg {
    public static final iyc a = iyc.FIT_GOALS;
    public static final ibg u = new ibg();

    static {
        new ibq("Fitness.GOALS_API", new ndo(), u);
        new ibq("Fitness.GOALS_CLIENT", new ndp(), u);
    }

    public ndq(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, a, ica, icb, ise);
    }

    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitGoalsApi");
        if (queryLocalInterface instanceof nef) {
            return (nef) queryLocalInterface;
        }
        return new nef(iBinder);
    }

    public final String b() {
        return "com.google.android.gms.fitness.GoalsApi";
    }

    public final String c() {
        return "com.google.android.gms.fitness.internal.IGoogleFitGoalsApi";
    }

    public final int d() {
        return 12451000;
    }
}
