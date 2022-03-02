package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* renamed from: udi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class udi {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final Bitmap g;
    public final boolean h;
    public final List i;
    public final Intent j;
    public final Intent k;
    public final boolean l;
    public final boolean m;
    public final int n;
    public String o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    private final int s = 0;
    private final String t;

    public udi(String str, String str2, String str3, String str4, String str5, int i2, Bitmap bitmap, Intent intent, Intent intent2, boolean z, String str6, boolean z2, boolean z3, boolean z4) {
        iva.a((Object) str);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i2;
        this.g = bitmap;
        this.t = null;
        this.h = false;
        this.i = null;
        iva.a((Object) intent);
        this.j = intent;
        iva.a((Object) intent2);
        this.k = intent2;
        this.l = z;
        this.m = true;
        this.n = 1;
        this.o = str6;
        this.p = z2;
        this.q = z3;
        this.r = z4;
    }

    private static boolean a(Intent intent, Intent intent2) {
        return ius.a(intent, intent2) || intent.filterEquals(intent2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof udi) {
            udi udi = (udi) obj;
            int i2 = udi.s;
            if (this.f == udi.f) {
                boolean z = udi.h;
                if (this.l == udi.l) {
                    boolean z2 = udi.m;
                    int i3 = udi.n;
                    if (ius.a(this.a, udi.a) && ius.a(this.b, udi.b) && ius.a(this.c, udi.c) && ius.a(this.d, udi.d) && ius.a(this.e, udi.e)) {
                        String str = udi.t;
                        if (ius.a((Object) null, (Object) null)) {
                            List list = udi.i;
                            if (ius.a((Object) null, (Object) null) && a(this.j, udi.j) && a(this.k, udi.k)) {
                                Bitmap bitmap = this.g;
                                Bitmap bitmap2 = udi.g;
                                return (ius.a(bitmap, bitmap2) || (bitmap != null && bitmap.sameAs(bitmap2))) && ius.a(this.o, udi.o) && this.p == udi.p && this.q == udi.q && this.r == udi.r;
                            }
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, 0, Integer.valueOf(this.f), null, false, null, Boolean.valueOf(this.l), true, 1, this.o, Boolean.valueOf(this.p), Boolean.valueOf(this.r)});
    }

    public final String toString() {
        return String.format(Locale.US, "DiscoveryNotificationItem{notificationId=%s, itemId=%s, title=%s, description=%s, priority=%d, smallIcon=%d, group=%s, isGroupSummary=%s, lines=%s, hasMuteNotificationButton=%s, autoCancel=%s, channelId=%s, isDevice=%s, isLarge=%s, isFirstParty=%s}", new Object[]{this.a, this.b, this.c, this.d, 0, Integer.valueOf(this.f), null, false, null, Boolean.valueOf(this.l), true, this.o, Boolean.valueOf(this.p), Boolean.valueOf(this.q), Boolean.valueOf(this.r)});
    }
}
