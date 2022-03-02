package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: ndk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ndk extends ndg {
    public static final iyc a = iyc.FIT_BLE;
    public static final ibq u = new ibq("Fitness.BLE_API", new ndh(), v);
    public static final ibg v = new ibg();

    static {
        new ibq("Fitness.BLE_CLIENT", new ndj(), v);
    }

    public ndk(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, a, ica, icb, ise);
    }

    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitBleApi");
        if (queryLocalInterface instanceof ned) {
            return (ned) queryLocalInterface;
        }
        return new ned(iBinder);
    }

    public final String b() {
        return "com.google.android.gms.fitness.BleApi";
    }

    public final String c() {
        return "com.google.android.gms.fitness.internal.IGoogleFitBleApi";
    }

    public final int d() {
        return 12451000;
    }
}
