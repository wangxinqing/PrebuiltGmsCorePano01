package defpackage;

import android.content.Intent;
import java.net.URISyntaxException;

/* renamed from: mtu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class mtu {
    public static String a(String str) {
        try {
            Intent parseUri = Intent.parseUri(str, 1);
            if (parseUri.getAction().equals("com.google.android.gms.nearby.discovery:ACTION_MAGIC_PAIR")) {
                return parseUri.getStringExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP");
            }
            jjg jjg = mte.a;
            parseUri.getAction();
            return null;
        } catch (URISyntaxException e) {
            anih anih = (anih) mte.a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("mtu", "a", 43, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("fail to get companion app info from discovery item");
            return null;
        }
    }
}
