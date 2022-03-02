package defpackage;

import android.net.Uri;

/* renamed from: plj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class plj extends plk {
    /* access modifiers changed from: protected */
    public abstract dvf a();

    public final String a(String str) {
        String valueOf = String.valueOf(Uri.encode(str));
        return valueOf.length() == 0 ? new String("appdatasearch/") : "appdatasearch/".concat(valueOf);
    }

    /* access modifiers changed from: protected */
    public final dvf b() {
        return a();
    }
}
