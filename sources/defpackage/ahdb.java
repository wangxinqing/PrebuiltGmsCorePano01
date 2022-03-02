package defpackage;

import android.content.IntentFilter;
import android.net.Uri;

/* renamed from: ahdb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class ahdb implements amqy {
    private final ahde a;
    private final Runnable b;

    public ahdb(ahde ahde, Runnable runnable) {
        this.a = ahde;
        this.b = runnable;
    }

    public final Object a(Object obj) {
        ahde ahde = this.a;
        Runnable runnable = this.b;
        Uri uri = (Uri) obj;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.libraries.storage.protostore.SIGNAL_ACTION");
        intentFilter.addDataScheme(uri.getScheme());
        intentFilter.addDataPath(uri.getPath(), 0);
        intentFilter.addDataAuthority("*", (String) null);
        ahde.b.registerReceiver(new ahdc(runnable), intentFilter, ahde.d, ahde.e);
        return null;
    }
}
