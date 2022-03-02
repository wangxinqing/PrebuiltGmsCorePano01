package defpackage;

import android.content.Intent;
import com.google.android.gms.framework.tracing.AbstractGmsTracer;

/* renamed from: njk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class njk extends AbstractGmsTracer {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public njk(android.content.Context r6, android.os.Binder r7) {
        /*
            r5 = this;
            java.lang.Class r0 = r6.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getSimpleName()
            java.lang.String r7 = r7.getInterfaceDescriptor()
            java.lang.String r7 = b(r7)
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r7)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 1
            int r2 = r2 + r3
            r4.<init>(r2)
            r4.append(r1)
            java.lang.String r1 = "-"
            r4.append(r1)
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            r1 = 8
            r5.<init>((java.lang.ClassLoader) r0, (int) r1, (android.content.Context) r6, (java.lang.String) r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.njk.<init>(android.content.Context, android.os.Binder):void");
    }

    private static String a(String str, String str2) {
        int indexOf;
        if (!str.startsWith(str2) || (indexOf = str.indexOf(46, str2.length())) < 0) {
            return null;
        }
        return str.substring(str2.length(), indexOf);
    }

    private static String b(String str) {
        int lastIndexOf = str.lastIndexOf(46);
        return lastIndexOf >= 0 ? str.substring(lastIndexOf + 1) : str;
    }

    public final amky a(int i, amsv amsv) {
        StringBuilder a = a(8);
        a.append(i - 1);
        return a(a.toString(), amsv, (Intent) null, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public njk(defpackage.bhw r5) {
        /*
            r4 = this;
            java.lang.Class r0 = r5.getClass()
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.String r1 = r5.getInterfaceDescriptor()
            java.lang.String r2 = "com.google.android.gms."
            java.lang.String r2 = a((java.lang.String) r1, (java.lang.String) r2)
            if (r2 != 0) goto L_0x004a
            java.lang.String r2 = "com.google.android."
            java.lang.String r2 = a((java.lang.String) r1, (java.lang.String) r2)
            if (r2 != 0) goto L_0x004a
            java.lang.String r2 = "com.google.firebase."
            java.lang.String r2 = a((java.lang.String) r1, (java.lang.String) r2)
            if (r2 == 0) goto L_0x0031
            java.lang.String r1 = "appindexing"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x002f
            java.lang.String r1 = "icing"
            goto L_0x004b
        L_0x002f:
            r1 = r2
            goto L_0x004b
        L_0x0031:
            java.lang.String r2 = "com.google.location."
            boolean r2 = r1.startsWith(r2)
            if (r2 != 0) goto L_0x0047
            r2 = 46
            int r2 = r1.lastIndexOf(r2)
            if (r2 < 0) goto L_0x004b
            r3 = 0
            java.lang.String r1 = r1.substring(r3, r2)
            goto L_0x004b
        L_0x0047:
            java.lang.String r1 = "location"
            goto L_0x004b
        L_0x004a:
            r1 = r2
        L_0x004b:
            r2 = 19
            java.lang.String r5 = r5.getInterfaceDescriptor()
            java.lang.String r5 = b(r5)
            r4.<init>((java.lang.ClassLoader) r0, (int) r2, (java.lang.String) r1, (java.lang.String) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.njk.<init>(bhw):void");
    }
}
