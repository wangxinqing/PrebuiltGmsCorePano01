package defpackage;

import android.content.IntentFilter;
import android.net.Uri;

/* renamed from: ahdi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahdi implements amqy {
    private final ahdo a;
    private final Runnable b;

    public ahdi(ahdo ahdo, Runnable runnable) {
        this.a = ahdo;
        this.b = runnable;
    }

    public final Object a(Object obj) {
        ahdo ahdo = this.a;
        Runnable runnable = this.b;
        Uri uri = (Uri) obj;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.libraries.storage.protostore.MULTI_APP");
        intentFilter.addDataScheme(uri.getScheme());
        intentFilter.addDataPath(uri.getPath(), 0);
        intentFilter.addDataAuthority("*", (String) null);
        ahdo.b.registerReceiver(new ahdm(runnable), intentFilter, ahdo.c, ahdo.d);
        return null;
    }
}
