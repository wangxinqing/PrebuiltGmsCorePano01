package defpackage;

import android.net.Uri;

/* renamed from: agvj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class agvj {
    private static final nz a = new nz();

    public static synchronized Uri a(String str) {
        Uri uri;
        synchronized (agvj.class) {
            uri = (Uri) a.get(str);
            if (uri == null) {
                String valueOf = String.valueOf(Uri.encode(str));
                uri = Uri.parse(valueOf.length() == 0 ? new String("content://com.google.android.gms.phenotype/") : "content://com.google.android.gms.phenotype/".concat(valueOf));
                a.put(str, uri);
            }
        }
        return uri;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r0 = r0 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean b(java.lang.String r4) {
        /*
            java.lang.String r0 = "#"
            int r0 = r4.indexOf(r0)
            r1 = 0
            if (r0 < 0) goto L_0x001a
            r2 = 1
            int r0 = r0 + r2
            int r3 = r4.length()
            if (r0 >= r3) goto L_0x001a
            char r4 = r4.charAt(r0)
            r0 = 64
            if (r4 != r0) goto L_0x001a
            return r2
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agvj.b(java.lang.String):boolean");
    }
}
