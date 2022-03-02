package defpackage;

import android.net.Uri;
import android.os.Handler;

/* renamed from: ajps  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajps extends qvv {
    final /* synthetic */ ajpt a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajps(ajpt ajpt, String str, String str2, Handler handler) {
        super(str, str2, handler);
        this.a = ajpt;
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z, Uri uri) {
        ajpt ajpt = this.a;
        int i = ajpt.c;
        float a2 = ajpt.a();
        synchronized (ajpt.a) {
            ajpt.a(a2);
        }
    }
}
