package defpackage;

import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* renamed from: abli  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class abli {
    static final anax a = anax.a((Object) null, 13, 14, 3, 7, 1, 6, 2, 10, 4, 8, 11);
    static final anax b = anax.a((Object) null, 13, 14, 3, 7, 1, 6, 10, 4, 8, 11);
    static final anax c = anax.a((Object) null, 13, 14, 3, 7, 6, 2, 10, 4, 8, 11);
    static final anax d = anax.a((Object) null, 13, 14, 3, 7, 6, 10, 4, 8, 11);
    public final String e;
    public final Set f;

    public abli(String str, Set set) {
        this.e = str;
        this.f = set;
    }

    public static abli a(String str, Bundle bundle) {
        if (bundle.containsKey("com.google.android.gms.people.smart_profile.SHOW_THESE_CARDS_ONLY")) {
            return new abli(str, a(bundle.getIntArray("com.google.android.gms.people.smart_profile.SHOW_THESE_CARDS_ONLY")));
        }
        if (!bundle.containsKey("com.google.android.gms.people.smart_profile.HIDE_THESE_CARDS")) {
            return new abli(str, a());
        }
        HashSet hashSet = new HashSet(a());
        hashSet.removeAll(a(bundle.getIntArray("com.google.android.gms.people.smart_profile.HIDE_THESE_CARDS")));
        return new abli(str, hashSet);
    }

    private static anax a() {
        if (!azis.b() && !aziv.b()) {
            return a;
        }
        if (!azis.b() || aziv.b()) {
            return (azis.b() || !aziv.b()) ? d : b;
        }
        return c;
    }

    private static Set a(int[] iArr) {
        HashSet hashSet = new HashSet();
        for (int valueOf : iArr) {
            hashSet.add(Integer.valueOf(valueOf));
        }
        return hashSet;
    }
}
