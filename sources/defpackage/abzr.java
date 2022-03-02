package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.internal.ConnectionInfo;
import java.lang.ref.WeakReference;

/* renamed from: abzr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class abzr extends itu {
    private final Handler a;
    private final WeakReference b;

    public abzr(Handler handler, abzs abzs) {
        this.a = handler;
        this.b = new WeakReference(abzs);
    }

    public final void a(int i, Bundle bundle) {
    }

    public final void a(int i, IBinder iBinder, Bundle bundle) {
    }

    public final IBinder asBinder() {
        return this;
    }

    public final void a(int i, IBinder iBinder, ConnectionInfo connectionInfo) {
        abzs.a.a("PostInitComplete %s - status %d", iBinder, Integer.valueOf(i));
        abzs abzs = (abzs) this.b.get();
        if (abzs == null) {
            abzs.a.d("client is null", new Object[0]);
        } else {
            this.a.post(new abzq(abzs, iBinder));
        }
    }
}
