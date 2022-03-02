package defpackage;

import android.net.Uri;
import android.os.Handler;

/* renamed from: msx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class msx extends qvv {
    final /* synthetic */ mta a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public msx(mta mta, String str, String str2, Handler handler) {
        super(str, str2, handler);
        this.a = mta;
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z, Uri uri) {
        jjg jjg = mte.a;
        uri.toString();
        if (uri.equals(aehb.a)) {
            this.a.b();
        } else if (uri.equals(aryo.a)) {
            this.a.c();
        }
    }
}
