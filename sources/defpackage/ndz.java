package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: ndz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ndz extends ndg {
    public static final iyc a = iyc.FIT_SENSORS;
    public static final ibg u = new ibg();

    static {
        new ibq("Fitness.SENSORS_API", new ndx(), u);
        new ibq("Fitness.SENSORS_CLIENT", new ndy(), u);
    }

    public ndz(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, a, ica, icb, ise);
    }

    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitSensorsApi");
        if (queryLocalInterface instanceof nei) {
            return (nei) queryLocalInterface;
        }
        return new nei(iBinder);
    }

    public final String b() {
        return "com.google.android.gms.fitness.SensorsApi";
    }

    public final String c() {
        return "com.google.android.gms.fitness.internal.IGoogleFitSensorsApi";
    }

    public final int d() {
        return 12451000;
    }
}
