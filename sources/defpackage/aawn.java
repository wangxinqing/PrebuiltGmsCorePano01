package defpackage;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: aawn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aawn implements Runnable {
    final /* synthetic */ aawo a;

    public aawn(aawo aawo) {
        this.a = aawo;
    }

    public final void run() {
        aarq aarq = new aarq(this.a.b);
        String str = this.a.a;
        HashSet hashSet = new HashSet(aarq.b.getStringSet("snet_verify_apps_api_usage", Collections.emptySet()));
        if (!hashSet.contains(str)) {
            hashSet.add(str);
            aarq.a("snet_verify_apps_api_usage", (Set) hashSet);
        }
    }
}
