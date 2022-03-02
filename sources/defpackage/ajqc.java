package defpackage;

import android.content.Context;
import android.location.GnssStatus;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: ajqc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ajqc extends ajqa {
    protected final GnssStatus.Callback e = new ajqb(this);

    public ajqc(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void a(Executor executor) {
        if (Looper.myLooper() != null) {
            this.a.registerGnssStatusCallback(this.e);
        } else {
            this.a.registerGnssStatusCallback(this.e, new qvr(Looper.getMainLooper()));
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.a.unregisterGnssStatusCallback(this.e);
    }
}
