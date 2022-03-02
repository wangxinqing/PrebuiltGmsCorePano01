package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* renamed from: nec  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nec extends ndg {
    public static final iyc a = iyc.FIT_SESSIONS;
    public static final ibg u = new ibg();

    static {
        new ibq("Fitness.SESSIONS_API", new nea(), u);
        new ibq("Fitness.SESSIONS_CLIENT", new neb(), u);
    }

    public nec(Context context, Looper looper, ise ise, ica ica, icb icb) {
        super(context, looper, a, ica, icb, ise);
    }

    public final /* bridge */ /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitSessionsApi");
        if (queryLocalInterface instanceof nej) {
            return (nej) queryLocalInterface;
        }
        return new nej(iBinder);
    }

    public final String b() {
        return "com.google.android.gms.fitness.SessionsApi";
    }

    public final String c() {
        return "com.google.android.gms.fitness.internal.IGoogleFitSessionsApi";
    }

    public final int d() {
        return 12451000;
    }
}
