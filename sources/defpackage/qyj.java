package defpackage;

import android.content.ComponentName;
import android.util.Log;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: qyj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qyj implements amrm {
    private String a = "";
    private amzy b = amzy.h();
    private amzy c = amzy.h();
    private final amsv d;
    private final String e;

    private final synchronized void a(String str) {
        amzt j = amzy.j();
        amzt j2 = amzy.j();
        Pattern compile = Pattern.compile("^([-+])([^/]+)/([^:]+):(.+)$");
        for (String str2 : amsk.a(',').a((CharSequence) str)) {
            Matcher matcher = compile.matcher(str2);
            if (!matcher.matches()) {
                String valueOf = String.valueOf(str2);
                Log.w("NetworkScheduler.Filter", valueOf.length() == 0 ? new String("Ignored malformed rule: ") : "Ignored malformed rule: ".concat(valueOf));
            } else {
                boolean equals = matcher.group(1).equals("-");
                String group = matcher.group(2);
                String group2 = matcher.group(3);
                String group3 = matcher.group(4);
                qyk qyk = new qyk();
                boolean z = !"*".equals(group);
                boolean z2 = !"*".equals(group2);
                boolean z3 = !"*".equals(group3);
                if (z && z2) {
                    StringBuilder sb = new StringBuilder(String.valueOf(group).length() + 1 + String.valueOf(group2).length());
                    sb.append(group);
                    sb.append("/");
                    sb.append(group2);
                    ComponentName unflattenFromString = ComponentName.unflattenFromString(sb.toString());
                    if (unflattenFromString != null) {
                        qyk.b(unflattenFromString.getPackageName());
                        qyk.a(unflattenFromString.getClassName());
                    }
                } else if (z) {
                    qyk.b(group);
                } else if (z2) {
                    qyk.a(group2);
                }
                if (z3) {
                    qyk.c(group3);
                }
                if (!equals) {
                    j2.c(qyk.a());
                } else {
                    j.c(qyk.a());
                }
            }
        }
        this.a = str;
        this.b = j2.a();
        this.c = j.a();
    }

    public qyj(amsv amsv) {
        this.d = amsv;
        this.e = "";
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.util.List, java.util.Collection] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.util.Collection r4, defpackage.qyi r5) {
        /*
            int r0 = r4.size()
            r1 = 0
            r2 = 0
        L_0x0006:
            if (r2 >= r0) goto L_0x001a
            int r3 = r2 + 1
            java.lang.Object r2 = r4.get(r2)
            amrm r2 = (defpackage.amrm) r2
            boolean r2 = r2.a(r5)
            if (r2 != 0) goto L_0x0018
            r2 = r3
            goto L_0x0006
        L_0x0018:
            r4 = 1
            return r4
        L_0x001a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qyj.a(java.util.Collection, qyi):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(defpackage.qyi r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = r6.e     // Catch:{ all -> 0x0062 }
            amsv r1 = r6.d     // Catch:{ all -> 0x0062 }
            java.lang.Object r1 = r1.a()     // Catch:{ all -> 0x0062 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0062 }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0062 }
            r3 = 1
            if (r2 != 0) goto L_0x003c
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0062 }
            if (r2 != 0) goto L_0x003b
            int r2 = r0.length()     // Catch:{ all -> 0x0062 }
            java.lang.String r4 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x0062 }
            int r4 = r4.length()     // Catch:{ all -> 0x0062 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0062 }
            int r2 = r2 + r3
            int r2 = r2 + r4
            r5.<init>(r2)     // Catch:{ all -> 0x0062 }
            r5.append(r0)     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = ","
            r5.append(r0)     // Catch:{ all -> 0x0062 }
            r5.append(r1)     // Catch:{ all -> 0x0062 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x0062 }
            goto L_0x003c
        L_0x003b:
            r0 = r1
        L_0x003c:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0062 }
            if (r1 != 0) goto L_0x0060
            java.lang.String r1 = r6.a     // Catch:{ all -> 0x0062 }
            boolean r1 = r1.equals(r0)     // Catch:{ all -> 0x0062 }
            if (r1 != 0) goto L_0x004d
            r6.a((java.lang.String) r0)     // Catch:{ all -> 0x0062 }
        L_0x004d:
            amzy r0 = r6.c     // Catch:{ all -> 0x0062 }
            boolean r0 = a(r0, r7)     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x0060
            amzy r0 = r6.b     // Catch:{ all -> 0x0062 }
            boolean r7 = a(r0, r7)     // Catch:{ all -> 0x0062 }
            if (r7 != 0) goto L_0x0060
            r7 = 0
            monitor-exit(r6)
            return r7
        L_0x0060:
            monitor-exit(r6)
            return r3
        L_0x0062:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qyj.a(qyi):boolean");
    }
}
