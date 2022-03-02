package defpackage;

import android.content.Intent;
import android.net.Uri;

/* renamed from: jrv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class jrv {
    public static Intent a(String str) {
        Intent intent = new Intent("android.intent.action.DIAL");
        String valueOf = String.valueOf(str);
        intent.setData(Uri.parse(valueOf.length() == 0 ? new String("tel:") : "tel:".concat(valueOf)));
        return intent;
    }

    public static Intent a(String str, String str2) {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", new String[]{str});
        intent.putExtra("fromAccountString", str2);
        return intent;
    }
}
