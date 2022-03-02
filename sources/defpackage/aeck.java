package defpackage;

import android.util.ArraySet;
import java.util.Set;

/* renamed from: aeck  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class aeck {
    final Set a = aecg.a(azws.d());
    final Set b = aecg.a(azws.c());
    final Set c = aecg.a(azws.b());
    final Set d = aecg.a(azws.e());
    final Set e = new ArraySet();
    final Set f = new ArraySet();
    final Set g = new ArraySet();
    final Set h = new ArraySet(100);
    final Set i = new ArraySet();
    final Set j = new ArraySet();
    final Set k = new ArraySet();
    final Set l = new ArraySet();
    final aucd m = bci.u.o();

    public static boolean a(Set set, long j2, Set set2) {
        Long valueOf = Long.valueOf(j2);
        if (set2.contains(valueOf) || set.contains(valueOf)) {
            return false;
        }
        set2.add(valueOf);
        return true;
    }

    public static boolean a(Set set, long j2, Set set2, Set set3, Set set4) {
        Long valueOf = Long.valueOf(j2);
        if (!set3.contains(valueOf)) {
            set4.add(valueOf);
        }
        return a(set, j2, set2);
    }
}
