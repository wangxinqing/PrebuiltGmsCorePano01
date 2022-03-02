package defpackage;

import com.google.android.gms.udc.DeviceDataUploadOptInFlags;
import java.util.concurrent.Callable;

/* renamed from: adhl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class adhl implements Callable {
    private final aorr a;
    private final aorr b;

    public adhl(aorr aorr, aorr aorr2) {
        this.a = aorr;
        this.b = aorr2;
    }

    public final Object call() {
        return new DeviceDataUploadOptInFlags(((Boolean) this.a.get()).booleanValue(), ((Boolean) this.b.get()).booleanValue());
    }
}
