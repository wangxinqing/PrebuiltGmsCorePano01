package defpackage;

import android.content.Context;
import android.os.RemoteException;
import java.io.Closeable;

/* renamed from: luv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class luv implements Closeable {
    public final luu a;

    public luv(Context context) {
        lww.a();
        luu f = lww.f(context);
        this.a = f;
        if (!f.l()) {
            throw new RemoteException("Unable to synchronously connect to the Driving Mode Manager");
        }
    }

    public final void close() {
        this.a.n();
    }
}
