package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;

/* renamed from: ajly  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ajly extends qvv {
    final /* synthetic */ Intent a;
    final /* synthetic */ ajme b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ajly(ajme ajme, String str, String str2, Handler handler, Intent intent) {
        super(str, str2, handler);
        this.b = ajme;
        this.a = intent;
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z, Uri uri) {
        ajme ajme = this.b;
        int i = ajme.v;
        ajma ajma = ajme.k;
        ajma.sendMessage(ajma.obtainMessage(1, this.a));
    }
}
