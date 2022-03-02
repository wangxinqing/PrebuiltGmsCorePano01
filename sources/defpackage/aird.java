package defpackage;

import android.net.Uri;
import android.os.Handler;

/* renamed from: aird  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aird extends qvv {
    final /* synthetic */ aire a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public aird(aire aire, Handler handler) {
        super("location", "MyContentObserver", handler);
        this.a = aire;
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z, Uri uri) {
        StringBuilder sb = new StringBuilder(34);
        sb.append("MyContentObserver: change is ");
        sb.append(z);
        sb.toString();
        this.a.c();
    }

    public final boolean deliverSelfNotifications() {
        return true;
    }
}
