package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.net.URISyntaxException;

/* renamed from: aryo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aryo {
    public static final Uri a = a("device_details_update");

    public static Uri a(String str) {
        return new Uri.Builder().scheme("content").authority("com.google.android.gms.nearby.fastpair").appendPath(str).build();
    }

    public static String b(String str) {
        try {
            return Intent.parseUri(str, 0).getStringExtra("com.google.android.gms.nearby.discovery:EXTRA_COMPANION_APP");
        } catch (URISyntaxException e) {
            anih anih = (anih) aryq.a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("aryo", "b", 68, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairSlice: Failed to get companion app from intent.");
            return null;
        }
    }

    public static void a(aoe aoe, boolean z) {
        Boolean valueOf = Boolean.valueOf(z);
        ((anih) ((anih) aryq.a.d()).a("aryo", "a", 45, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairSlice: enableBindServiceForDiscoveryItem called, isBind = %b", (Object) valueOf);
        try {
            aoe.c(new Uri.Builder().scheme("content").authority("com.google.android.gms.nearby.fastpair").appendPath("method_bind_service_for_discovery_item").appendQueryParameter("is_bind", valueOf.toString()).build());
        } catch (NullPointerException e) {
            anih anih = (anih) aryq.a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("aryo", "a", 58, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("FastPairSlice: enableBindServiceForDiscoveryItem meet exception!");
        }
    }
}
