package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: hol  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hol {
    @Deprecated
    public static final ibq a = new ibq("ClearcutLogger.API", s, r);
    public static final String[] b = new String[0];
    public static final byte[][] c = new byte[0][];
    public static volatile int d = -1;
    public static final List p = new CopyOnWriteArrayList();
    public static final ibg r = new ibg();
    public static final ibn s = new hog();
    public final Context e;
    public final String f;
    public String g;
    public int h;
    public String i;
    public String j;
    public final boolean k;
    public atzz l;
    public avsd m;
    final hom n;
    public final hoj o;
    public final List q;

    public hol(Context context, int i2, String str, String str2, String str3, boolean z, hom hom, hoj hoj) {
        boolean z2;
        this.h = -1;
        this.l = null;
        this.m = avsd.DEFAULT;
        this.q = new CopyOnWriteArrayList();
        this.e = context.getApplicationContext();
        this.f = context.getPackageName();
        this.h = i2;
        this.g = str;
        this.i = str2;
        this.j = str3;
        this.k = z;
        this.n = hom;
        this.m = avsd.DEFAULT;
        this.o = hoj;
        if (z) {
            if (str2 == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            iva.b(z2, "can't be anonymous with an upload account");
        }
    }

    public static hol a(Context context, String str) {
        return new hol(context, -1, str, (String) null, (String) null, true, hsm.a(context), new htc(context));
    }

    public static String a(Iterable iterable) {
        return iterable != null ? amre.a(", ").a(iterable) : "null";
    }

    public static int[] a(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] iArr = new int[arrayList.size()];
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            iArr[i3] = ((Integer) arrayList.get(i2)).intValue();
            i2++;
            i3++;
        }
        return iArr;
    }

    public final hoi a(audx audx) {
        return new hoi(this, new hof(audx));
    }

    public hol(Context context, String str, String str2) {
        this(context, -1, str, str2, (String) null, false, hsm.a(context), new htc(context));
    }

    public final hoi a(hok hok) {
        return new hoi(this, hok);
    }

    public final hoi a(byte[] bArr) {
        auay auay;
        if (bArr != null) {
            auay = auay.a(bArr);
        } else {
            auay = null;
        }
        return new hoi(this, auay, (hok) null);
    }

    public final void a(long j2, TimeUnit timeUnit) {
        this.n.a(j2, timeUnit);
    }

    public final void a(avsd avsd) {
        if (avsd == null) {
            avsd = avsd.DEFAULT;
        }
        this.m = avsd;
    }
}
