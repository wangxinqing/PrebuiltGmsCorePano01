package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: ndw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ndw extends ndg {
    public static final iyc a = iyc.FIT_RECORDING;
    public static final ibg u = new ibg();

    static {
        new ibq("Fitness.RECORDING_API", new ndu(), u);
        new ibq("Fitness.RECORDING_CLIENT", new ndv(), u);
    }

    public ndw(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, a, ica, icb, ise);
    }

    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitRecordingApi");
        if (queryLocalInterface instanceof neh) {
            return (neh) queryLocalInterface;
        }
        return new neh(iBinder);
    }

    public final String b() {
        return "com.google.android.gms.fitness.RecordingApi";
    }

    public final String c() {
        return "com.google.android.gms.fitness.internal.IGoogleFitRecordingApi";
    }

    public final int d() {
        return 12451000;
    }
}
