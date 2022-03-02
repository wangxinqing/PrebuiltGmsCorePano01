package defpackage;

import android.content.Context;
import android.content.Intent;

/* renamed from: adjl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adjl {
    public static void a(Context context, Intent intent) {
        intent.setPackage("com.google.android.gms");
        intent.setAction("com.google.android.gms.update.START_SERVICE");
        context.startService(intent);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        throw null;
    }
}
