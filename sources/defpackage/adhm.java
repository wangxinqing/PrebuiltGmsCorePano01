package defpackage;

import com.google.android.gms.udc.DeviceDataUploadOptInFlags;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: adhm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adhm {
    public static DeviceDataUploadOptInFlags a(agqt agqt) {
        aorr a = agqt.a(4);
        aorr a2 = agqt.a(5);
        return (DeviceDataUploadOptInFlags) adhn.a(aorl.c(a, a2).a((Callable) new adhl(a, a2), (Executor) aoqm.a));
    }
}
