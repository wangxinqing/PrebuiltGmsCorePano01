package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: aeeb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeeb extends ContentObserver {
    final /* synthetic */ aeee a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aeeb(aeee aeee) {
        super((Handler) null);
        this.a = aeee;
    }

    public final void onChange(boolean z) {
        this.a.c.set(true);
    }
}
