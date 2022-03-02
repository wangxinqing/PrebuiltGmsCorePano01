package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: agve  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agve extends ContentObserver {
    public agve() {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        agvx.a();
    }
}
