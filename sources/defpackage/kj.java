package defpackage;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: kj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kj extends ContentObserver {
    final /* synthetic */ km a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kj(km kmVar) {
        super(new Handler());
        this.a = kmVar;
    }

    public final boolean deliverSelfNotifications() {
        return true;
    }

    public final void onChange(boolean z) {
        this.a.onContentChanged();
    }
}
