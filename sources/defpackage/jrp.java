package defpackage;

import android.content.Intent;
import android.net.Uri;

/* renamed from: jrp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jrp {
    static Intent a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        String valueOf = String.valueOf(Uri.encode(str));
        intent.setData(Uri.parse(valueOf.length() == 0 ? new String("geo:0,0?q=") : "geo:0,0?q=".concat(valueOf)));
        return intent;
    }
}
