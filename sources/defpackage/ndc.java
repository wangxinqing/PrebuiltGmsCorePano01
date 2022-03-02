package defpackage;

import android.os.Build;
import com.google.android.gms.common.api.Scope;

/* renamed from: ndc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ndc {
    @Deprecated
    public static final ibq a = ndk.u;

    static {
        iyc iyc = ndz.a;
        iyc iyc2 = ndw.a;
        iyc iyc3 = nec.a;
        iyc iyc4 = ndt.a;
        iyc iyc5 = ndq.a;
        iyc iyc6 = ndn.a;
        int i = Build.VERSION.SDK_INT;
        new Scope("https://www.googleapis.com/auth/fitness.activity.read");
        new Scope("https://www.googleapis.com/auth/fitness.activity.write");
        new Scope("https://www.googleapis.com/auth/fitness.location.read");
        new Scope("https://www.googleapis.com/auth/fitness.location.write");
        new Scope("https://www.googleapis.com/auth/fitness.body.read");
        new Scope("https://www.googleapis.com/auth/fitness.body.write");
        new Scope("https://www.googleapis.com/auth/fitness.nutrition.read");
        new Scope("https://www.googleapis.com/auth/fitness.nutrition.write");
        new Scope("https://www.googleapis.com/auth/fitness.heart_rate.read");
        new Scope("https://www.googleapis.com/auth/fitness.heart_rate.write");
        new Scope("https://www.googleapis.com/auth/fitness.sleep.read");
        new Scope("https://www.googleapis.com/auth/fitness.sleep.write");
    }
}
