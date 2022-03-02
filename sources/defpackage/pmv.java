package defpackage;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: pmv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class pmv {
    final String a;
    final String b;
    final Set c = new HashSet();
    final Set d = new HashSet();
    final Map e = new HashMap();

    public pmv(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String toString() {
        return String.format(Locale.US, "Deltas for %s [toInsert=%d toUpdate=%d toDelete=%d]", new Object[]{this.a, Integer.valueOf(this.c.size()), Integer.valueOf(this.e.size()), Integer.valueOf(this.d.size())});
    }
}
