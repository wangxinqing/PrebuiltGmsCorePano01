package defpackage;

import android.content.ComponentName;
import android.net.Uri;
import java.util.Arrays;

/* renamed from: itb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class itb {
    private static final Uri f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final String a;
    public final ComponentName b;
    public final int c;
    private final String d;
    private final boolean e;

    public itb(ComponentName componentName) {
        this.d = null;
        this.a = null;
        iva.a((Object) componentName);
        this.b = componentName;
        this.c = 129;
        this.e = false;
    }

    /* JADX WARNING: type inference failed for: r6v12, types: [android.os.Parcelable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.content.Intent a(android.content.Context r6) {
        /*
            r5 = this;
            java.lang.String r0 = "ConnectionStatusConfig"
            java.lang.String r1 = r5.d
            if (r1 != 0) goto L_0x0013
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            android.content.ComponentName r0 = r5.b
            android.content.Intent r6 = r6.setComponent(r0)
            goto L_0x0092
        L_0x0013:
            boolean r1 = defpackage.jim.a()
            r2 = 0
            if (r1 == 0) goto L_0x0022
            java.lang.String r0 = r5.d
            android.content.Intent r6 = com.google.android.chimera.BoundService.getStartIntent(r6, r0)
            goto L_0x0090
        L_0x0022:
            boolean r1 = r5.e
            if (r1 == 0) goto L_0x008f
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            java.lang.String r3 = r5.d
            java.lang.String r4 = "serviceActionBundleKey"
            r1.putString(r4, r3)
            android.content.ContentResolver r6 = r6.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x003f }
            android.net.Uri r3 = f     // Catch:{ IllegalArgumentException -> 0x003f }
            java.lang.String r4 = "serviceIntentCall"
            android.os.Bundle r6 = r6.call(r3, r4, r2, r1)     // Catch:{ IllegalArgumentException -> 0x003f }
            goto L_0x0063
        L_0x003f:
            r6 = move-exception
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r1 = java.lang.String.valueOf(r6)
            int r1 = r1.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r1 = r1 + 34
            r3.<init>(r1)
            java.lang.String r1 = "Dynamic intent resolution failed: "
            r3.append(r1)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            android.util.Log.w(r0, r6)
            r6 = r2
        L_0x0063:
            if (r6 == 0) goto L_0x006f
            java.lang.String r1 = "serviceResponseIntentKey"
            android.os.Parcelable r6 = r6.getParcelable(r1)
            r2 = r6
            android.content.Intent r2 = (android.content.Intent) r2
            goto L_0x0070
        L_0x006f:
        L_0x0070:
            if (r2 != 0) goto L_0x008d
            java.lang.String r6 = r5.d
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r1 = "Dynamic lookup for intent failed for action: "
            int r3 = r6.length()
            if (r3 != 0) goto L_0x0086
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1)
            goto L_0x008a
        L_0x0086:
            java.lang.String r6 = r1.concat(r6)
        L_0x008a:
            android.util.Log.w(r0, r6)
        L_0x008d:
            r6 = r2
            goto L_0x0090
        L_0x008f:
            r6 = r2
        L_0x0090:
            if (r6 == 0) goto L_0x0093
        L_0x0092:
            return r6
        L_0x0093:
            android.content.Intent r6 = new android.content.Intent
            java.lang.String r0 = r5.d
            r6.<init>(r0)
            java.lang.String r0 = r5.a
            android.content.Intent r6 = r6.setPackage(r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.itb.a(android.content.Context):android.content.Intent");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof itb) {
            itb itb = (itb) obj;
            return ius.a(this.d, itb.d) && ius.a(this.a, itb.a) && ius.a(this.b, itb.b) && this.c == itb.c && this.e == itb.e;
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.d, this.a, this.b, Integer.valueOf(this.c), Boolean.valueOf(this.e)});
    }

    public final String toString() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        iva.a((Object) this.b);
        return this.b.flattenToString();
    }

    public itb(String str) {
        this(str, "com.google.android.gms", false);
    }

    public itb(String str, String str2, boolean z) {
        iva.c(str);
        this.d = str;
        iva.c(str2);
        this.a = str2;
        this.b = null;
        this.c = 129;
        this.e = z;
    }
}
