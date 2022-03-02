package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;

/* renamed from: ajlx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajlx extends qvv {
    final /* synthetic */ ajme a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajlx(ajme ajme, String str, String str2, Handler handler) {
        super(str, str2, handler);
        this.a = ajme;
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z, Uri uri) {
        ajme ajme = this.a;
        int i = ajme.v;
        ajma ajma = ajme.k;
        ajma.sendMessage(ajma.obtainMessage(1, new Intent("com.google.android.location.reporting.CHANGE_ON_BATTERY_SAVER_MODE_THRESHOLD")));
    }
}
