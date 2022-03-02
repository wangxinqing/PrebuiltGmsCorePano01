package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: aeef  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeef extends ContentObserver {
    public aeef() {
        super((Handler) null);
    }

    public final void onChange(boolean z) {
        aeeg.e.set(true);
    }
}
