package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;

/* renamed from: nnz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class nnz extends BroadcastReceiver {
    static {
        nnz.class.getSimpleName();
    }

    /* access modifiers changed from: protected */
    public abstract int a();

    /* access modifiers changed from: protected */
    public abstract byte[] a(Intent intent, Context context);

    public final void onReceive(Context context, Intent intent) {
        byte[] a = a(intent, context);
        if (a != null) {
            nol.a(context, nol.a(a(), a));
        }
    }
}
