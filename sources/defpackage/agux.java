package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: agux  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class agux extends ContentObserver {
    final /* synthetic */ aguy a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public agux(aguy aguy) {
        super((Handler) null);
        this.a = aguy;
    }

    public final void onChange(boolean z) {
        this.a.b();
    }
}
