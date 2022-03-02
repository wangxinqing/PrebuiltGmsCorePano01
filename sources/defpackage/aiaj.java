package defpackage;

import java.util.Collection;
import java.util.Collections;

/* renamed from: aiaj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aiaj {
    public static final Collection a = Collections.emptyList();
    public final int b;
    public final int c;
    public final int d;
    protected final int e;
    protected final int f;
    public final long g;
    public final Collection h;
    public final int i;
    public final int j;
    protected String k;

    public aiaj(long j2, int i2, int i3, int i4, int i5, Collection collection, int i6, int i7, int i8) {
        this.g = j2;
        this.i = i2;
        this.b = i3;
        this.c = i4;
        this.d = i5;
        this.h = collection;
        this.j = i8;
        this.e = i6;
        this.f = i7;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0003, code lost:
        r13 = r13.trim().split(":");
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x004f A[Catch:{ NumberFormatException -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0058 A[Catch:{ NumberFormatException -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005d A[Catch:{ NumberFormatException -> 0x0061 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.aqek a(java.lang.String r13) {
        /*
            r0 = 0
            if (r13 == 0) goto L_0x0062
            java.lang.String r13 = r13.trim()
            java.lang.String r1 = ":"
            java.lang.String[] r13 = r13.split(r1)
            int r1 = r13.length
            r2 = 4
            if (r1 < r2) goto L_0x0062
            r3 = 0
            r3 = r13[r3]     // Catch:{ NumberFormatException -> 0x0061 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0061 }
            r4 = 1
            r5 = r13[r4]     // Catch:{ NumberFormatException -> 0x0061 }
            int r5 = java.lang.Integer.parseInt(r5)     // Catch:{ NumberFormatException -> 0x0061 }
            r6 = 2
            r7 = r13[r6]     // Catch:{ NumberFormatException -> 0x0061 }
            int r7 = java.lang.Integer.parseInt(r7)     // Catch:{ NumberFormatException -> 0x0061 }
            int r8 = r1 + -1
            r8 = r13[r8]     // Catch:{ NumberFormatException -> 0x0061 }
            int r8 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x0061 }
            aqek r9 = new aqek     // Catch:{ NumberFormatException -> 0x0061 }
            aqem r10 = defpackage.ajck.P     // Catch:{ NumberFormatException -> 0x0061 }
            r9.<init>(r10)     // Catch:{ NumberFormatException -> 0x0061 }
            r10 = 3
            r11 = -1
            if (r3 == r11) goto L_0x004c
            r12 = 10
            r9.g(r12, r3)     // Catch:{ NumberFormatException -> 0x0061 }
            r12 = 6
            if (r3 == r12) goto L_0x004c
            r3 = 5
            if (r1 != r3) goto L_0x004b
            r13 = r13[r10]     // Catch:{ NumberFormatException -> 0x0061 }
            int r13 = java.lang.Integer.parseInt(r13)     // Catch:{ NumberFormatException -> 0x0061 }
            goto L_0x004d
        L_0x004b:
            return r0
        L_0x004c:
            r13 = -1
        L_0x004d:
            if (r13 == r11) goto L_0x0052
            r9.g(r4, r13)     // Catch:{ NumberFormatException -> 0x0061 }
        L_0x0052:
            r9.g(r6, r8)     // Catch:{ NumberFormatException -> 0x0061 }
            if (r7 == r11) goto L_0x005b
            r9.g(r10, r7)     // Catch:{ NumberFormatException -> 0x0061 }
        L_0x005b:
            if (r5 == r11) goto L_0x0060
            r9.g(r2, r5)     // Catch:{ NumberFormatException -> 0x0061 }
        L_0x0060:
            return r9
        L_0x0061:
            r13 = move-exception
        L_0x0062:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiaj.a(java.lang.String):aqek");
    }

    public static String b(aqek aqek) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = -1;
        if (aqek.i(2)) {
            i2 = aqek.b(2);
        } else {
            i2 = -1;
        }
        if (aqek.i(4)) {
            i3 = aqek.b(4);
        } else {
            i3 = -1;
        }
        if (aqek.i(3)) {
            i4 = aqek.b(3);
        } else {
            i4 = -1;
        }
        if (aqek.i(10)) {
            i5 = aqek.b(10);
        } else {
            i5 = -1;
        }
        if (i5 == 6) {
            StringBuilder sb = new StringBuilder(47);
            sb.append("6:");
            sb.append(i3);
            sb.append(":");
            sb.append(i4);
            sb.append(":");
            sb.append(i2);
            return sb.toString();
        }
        if (aqek.i(1) && i5 != 5) {
            i6 = aqek.b(1);
        }
        StringBuilder sb2 = new StringBuilder(59);
        sb2.append(i5);
        sb2.append(":");
        sb2.append(i3);
        sb2.append(":");
        sb2.append(i4);
        sb2.append(":");
        sb2.append(i6);
        sb2.append(":");
        sb2.append(i2);
        return sb2.toString();
    }

    public abstract String a();

    public abstract void a(aqek aqek);

    public abstract boolean a(aiaj aiaj);

    public abstract boolean b();

    public abstract String c();

    public abstract long d();

    public final boolean e() {
        int i2 = this.b;
        return i2 != Integer.MAX_VALUE && i2 != -1 && this.c >= 0 && this.d >= 0 && b();
    }

    public boolean equals(Object obj) {
        if (obj instanceof aiaj) {
            aiaj aiaj = (aiaj) obj;
            return this.b == aiaj.b && this.c == aiaj.c && this.d == aiaj.d && this.i == aiaj.i;
        }
    }

    public final int f() {
        int i2 = this.i;
        if (i2 == 1) {
            return 3;
        }
        if (i2 == 2) {
            return 4;
        }
        if (i2 == 3) {
            return 5;
        }
        if (i2 != 4) {
            return i2 != 5 ? -1 : 7;
        }
        return 6;
    }

    public final aqek g() {
        aqek aqek = new aqek(ajck.P);
        int i2 = this.b;
        if (i2 != Integer.MAX_VALUE && !(this instanceof aiaz)) {
            aqek.g(2, i2);
        }
        int i3 = this.d;
        if (!(i3 == -1 || i3 == Integer.MAX_VALUE)) {
            aqek.g(3, i3);
        }
        int i4 = this.c;
        if (!(i4 == -1 || i4 == Integer.MAX_VALUE)) {
            aqek.g(4, i4);
        }
        int i5 = this.j;
        if (i5 != -9999) {
            aqek.g(5, i5);
        }
        int i6 = this.e;
        int i7 = this.f;
        if (i6 != Integer.MAX_VALUE && i7 != Integer.MAX_VALUE && i6 <= 1296000 && i6 >= -1296000 && i7 <= 2592000 && i7 >= -2592000) {
            aqek aqek2 = new aqek(ajck.O);
            double d2 = (double) this.e;
            Double.isNaN(d2);
            aqek2.g(1, (int) (d2 * 694.4444444444445d));
            double d3 = (double) this.f;
            Double.isNaN(d3);
            aqek2.g(2, (int) (d3 * 694.4444444444445d));
            aqek.a(9, (Object) aqek2);
        }
        aqek.g(10, f());
        a(aqek);
        return aqek;
    }

    public int hashCode() {
        return (((this.b * 2347) ^ (this.c * 937)) ^ (this.d * 101)) ^ (this.i * 3643);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        a(sb, this);
        return sb.toString();
    }

    public final aqek b(long j2) {
        if (!e()) {
            return null;
        }
        aqek aqek = new aqek(ajck.Q);
        aqek.b(2, this.g + j2);
        aqek.b(1, (Object) g());
        Collection<aiaj> collection = this.h;
        if (collection != null) {
            for (aiaj g2 : collection) {
                aqek.a(3, (Object) g2.g());
            }
        }
        return aqek;
    }

    static void a(StringBuilder sb, aiaj aiaj) {
        if (aiaj != null) {
            sb.append("[cid: ");
            sb.append(aiaj.b);
            sb.append(" mcc: ");
            sb.append(aiaj.c);
            sb.append(" mnc: ");
            sb.append(aiaj.d);
            sb.append(aiaj.c());
            sb.append(" radioType: ");
            sb.append(aiaj.i);
            sb.append(" signalStrength: ");
            sb.append(aiaj.j);
            sb.append(" timeStamp: ");
            sb.append(aiaj.g);
            sb.append(" neighbors[");
            boolean z = true;
            for (aiaj aiaj2 : aiaj.h) {
                if (!z) {
                    sb.append(",");
                }
                sb.append(aiaj2);
                z = false;
            }
            sb.append("]]");
            return;
        }
        sb.append("null");
    }

    public final boolean b(aiaj aiaj) {
        return this.b == aiaj.b && this.c == aiaj.c && this.d == aiaj.d && this.i == aiaj.i && a(aiaj);
    }

    public final aqek a(long j2) {
        aqek aqek = new aqek(ajck.ah);
        aqek b2 = b(j2);
        if (b2 != null) {
            b2.g(5, 2);
            aqek.b(1, (Object) b2);
        }
        return aqek;
    }
}
