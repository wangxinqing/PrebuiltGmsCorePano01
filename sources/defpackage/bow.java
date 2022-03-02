package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: bow  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class bow {
    private final Class a;
    private final oi b;
    private WeakReference c = new WeakReference((Object) null);

    public bow(Class cls, int i) {
        oi oiVar = null;
        this.a = cls;
        if (i > 0) {
            int highestOneBit = Integer.highestOneBit(i);
            oiVar = new oi(Math.max((int) (((((long) (i > highestOneBit ? highestOneBit + highestOneBit : highestOneBit)) * 3) / 4) - 1), 2));
        }
        this.b = oiVar;
    }

    public final boolean a(Context context, bou bou) {
        return a(context, bou, bou.getClass().getName());
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(bou bou, apxg apxg, String str, bov bov);

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:107:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x019f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01a1, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b9, code lost:
        r10 = java.lang.String.valueOf(r25);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c5, code lost:
        if (r10.length() != 0) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c7, code lost:
        r10 = new java.lang.String("No registered Chimera impl for ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cd, code lost:
        r10 = "No registered Chimera impl for ".concat(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d4, code lost:
        throw new com.google.android.chimera.config.InvalidConfigException(r10);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x019f A[ExcHandler: ClassCastException | ClassNotFoundException (e java.lang.Throwable), Splitter:B:94:0x0169] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x01e4  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x01f3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0133 A[EDGE_INSN: B:128:0x0133->B:80:0x0133 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x015c A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0152 A[Catch:{ all -> 0x01f7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0158 A[LOOP:0: B:4:0x0025->B:90:0x0158, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.content.Context r23, defpackage.bou r24, java.lang.String r25) {
        /*
            r22 = this;
            r1 = r22
            r2 = r23
            r3 = r24
            r4 = r25
            java.lang.String r5 = "ChimeraProxyRslvr"
            bkv r6 = defpackage.bkv.a((android.content.Context) r23)
            bov r7 = new bov
            r7.<init>()
            android.os.StrictMode$ThreadPolicy r8 = android.os.StrictMode.allowThreadDiskWrites()
            defpackage.bkn.b()     // Catch:{ all -> 0x01f7 }
            boolean r0 = defpackage.awxs.b()     // Catch:{ all -> 0x01f7 }
            r9 = 1
            r0 = r0 ^ r9
            r11 = 0
            r12 = r0
            r13 = 0
            r14 = 0
            r15 = 0
        L_0x0025:
            boz r0 = r6.f()     // Catch:{ InvalidConfigException -> 0x0130 }
            oi r14 = r1.b     // Catch:{ InvalidConfigException -> 0x012d }
            if (r14 == 0) goto L_0x004c
            java.lang.ref.WeakReference r14 = r1.c     // Catch:{ InvalidConfigException -> 0x012d }
            java.lang.Object r14 = r14.get()     // Catch:{ InvalidConfigException -> 0x012d }
            if (r14 == r0) goto L_0x0043
            oi r14 = r1.b     // Catch:{ InvalidConfigException -> 0x012d }
            r14.a()     // Catch:{ InvalidConfigException -> 0x012d }
            java.lang.ref.WeakReference r14 = new java.lang.ref.WeakReference     // Catch:{ InvalidConfigException -> 0x012d }
            r14.<init>(r0)     // Catch:{ InvalidConfigException -> 0x012d }
            r1.c = r14     // Catch:{ InvalidConfigException -> 0x012d }
            r14 = 0
            goto L_0x004d
        L_0x0043:
            oi r14 = r1.b     // Catch:{ InvalidConfigException -> 0x012d }
            java.lang.Object r14 = r14.a((java.lang.Object) r4)     // Catch:{ InvalidConfigException -> 0x012d }
            bot r14 = (defpackage.bot) r14     // Catch:{ InvalidConfigException -> 0x012d }
            goto L_0x004d
        L_0x004c:
            r14 = 0
        L_0x004d:
            if (r14 != 0) goto L_0x0105
            r10 = -1
            r7.c = r10     // Catch:{ InvalidConfigException -> 0x012b }
            java.lang.String r10 = ""
            r7.d = r10     // Catch:{ InvalidConfigException -> 0x012b }
            java.lang.Object[] r10 = defpackage.bov.a     // Catch:{ InvalidConfigException -> 0x012b }
            r7.e = r10     // Catch:{ InvalidConfigException -> 0x012b }
            java.lang.Class[] r10 = defpackage.bov.b     // Catch:{ InvalidConfigException -> 0x012b }
            r7.f = r10     // Catch:{ InvalidConfigException -> 0x012b }
            r7.g = r11     // Catch:{ InvalidConfigException -> 0x012b }
            apxg r10 = r0.f()     // Catch:{ InvalidConfigException -> 0x012b }
            java.lang.String r9 = r10.F()     // Catch:{ InvalidConfigException -> 0x012b }
            java.lang.String r11 = defpackage.brt.a((java.lang.String) r9, (java.lang.String) r4)     // Catch:{ IndexOutOfBoundsException -> 0x00d8 }
            boolean r10 = r1.a(r3, r10, r11, r7)     // Catch:{ IndexOutOfBoundsException -> 0x00d8 }
            if (r10 == 0) goto L_0x00a6
            boolean r10 = r7.g     // Catch:{ InvalidConfigException -> 0x012b }
            if (r10 != 0) goto L_0x00a1
            int r10 = r7.c     // Catch:{ InvalidConfigException -> 0x012b }
            if (r10 < 0) goto L_0x0084
            java.lang.String r10 = r7.d     // Catch:{ InvalidConfigException -> 0x012b }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ InvalidConfigException -> 0x012b }
            if (r10 != 0) goto L_0x0084
            r10 = 1
            goto L_0x0085
        L_0x0084:
            r10 = 0
        L_0x0085:
            defpackage.amtf.a((boolean) r10)     // Catch:{ InvalidConfigException -> 0x012b }
            java.lang.Object[] r10 = r7.e     // Catch:{ InvalidConfigException -> 0x012b }
            int r10 = r10.length     // Catch:{ InvalidConfigException -> 0x012b }
            java.lang.Class[] r11 = r7.f     // Catch:{ InvalidConfigException -> 0x012b }
            int r11 = r11.length     // Catch:{ InvalidConfigException -> 0x012b }
            if (r10 != r11) goto L_0x0092
            r10 = 1
            goto L_0x0093
        L_0x0092:
            r10 = 0
        L_0x0093:
            defpackage.amtf.a((boolean) r10)     // Catch:{ InvalidConfigException -> 0x012b }
            java.lang.String r10 = r7.d     // Catch:{ InvalidConfigException -> 0x012b }
            java.lang.String r9 = defpackage.brt.b((java.lang.String) r9, (java.lang.String) r10)     // Catch:{ InvalidConfigException -> 0x012b }
            r7.d = r9     // Catch:{ InvalidConfigException -> 0x012b }
            int r9 = r7.c     // Catch:{ InvalidConfigException -> 0x012b }
            goto L_0x0107
        L_0x00a1:
            android.os.StrictMode.setThreadPolicy(r8)
            r2 = 0
            return r2
        L_0x00a6:
            if (r12 == 0) goto L_0x00a9
            goto L_0x00b9
        L_0x00a9:
            boolean r9 = r3.c(r2)     // Catch:{ InvalidConfigException -> 0x012b }
            if (r9 == 0) goto L_0x00a1
            boz r9 = r6.f()     // Catch:{ InvalidConfigException -> 0x00d5 }
            if (r9 == r0) goto L_0x00b9
            r12 = 1
            r15 = 1
            goto L_0x0156
        L_0x00b9:
            com.google.android.chimera.config.InvalidConfigException r0 = new com.google.android.chimera.config.InvalidConfigException     // Catch:{ InvalidConfigException -> 0x00d5 }
            java.lang.String r9 = "No registered Chimera impl for "
            java.lang.String r10 = java.lang.String.valueOf(r25)     // Catch:{ InvalidConfigException -> 0x00d5 }
            int r11 = r10.length()     // Catch:{ InvalidConfigException -> 0x00d5 }
            if (r11 != 0) goto L_0x00cd
            java.lang.String r10 = new java.lang.String     // Catch:{ InvalidConfigException -> 0x00d5 }
            r10.<init>(r9)     // Catch:{ InvalidConfigException -> 0x00d5 }
            goto L_0x00d1
        L_0x00cd:
            java.lang.String r10 = r9.concat(r10)     // Catch:{ InvalidConfigException -> 0x00d5 }
        L_0x00d1:
            r0.<init>((java.lang.String) r10)     // Catch:{ InvalidConfigException -> 0x00d5 }
            throw r0     // Catch:{ InvalidConfigException -> 0x00d5 }
        L_0x00d5:
            r0 = move-exception
            r12 = 1
            goto L_0x0131
        L_0x00d8:
            r0 = move-exception
            defpackage.bkn.b()     // Catch:{ InvalidConfigException -> 0x012b }
            awxs r9 = defpackage.awxs.a     // Catch:{ InvalidConfigException -> 0x012b }
            awxt r9 = r9.a()     // Catch:{ InvalidConfigException -> 0x012b }
            boolean r9 = r9.G()     // Catch:{ InvalidConfigException -> 0x012b }
            if (r9 == 0) goto L_0x0104
            com.google.android.chimera.config.InvalidConfigException r0 = new com.google.android.chimera.config.InvalidConfigException     // Catch:{ InvalidConfigException -> 0x012b }
            java.lang.String r9 = "IndexOutOfBounds retrieving Chimera impl for "
            java.lang.String r10 = java.lang.String.valueOf(r25)     // Catch:{ InvalidConfigException -> 0x012b }
            int r11 = r10.length()     // Catch:{ InvalidConfigException -> 0x012b }
            if (r11 != 0) goto L_0x00fc
            java.lang.String r10 = new java.lang.String     // Catch:{ InvalidConfigException -> 0x012b }
            r10.<init>(r9)     // Catch:{ InvalidConfigException -> 0x012b }
            goto L_0x0100
        L_0x00fc:
            java.lang.String r10 = r9.concat(r10)     // Catch:{ InvalidConfigException -> 0x012b }
        L_0x0100:
            r0.<init>((java.lang.String) r10)     // Catch:{ InvalidConfigException -> 0x012b }
            throw r0     // Catch:{ InvalidConfigException -> 0x012b }
        L_0x0104:
            throw r0     // Catch:{ InvalidConfigException -> 0x012b }
        L_0x0105:
            int r9 = r14.a     // Catch:{ InvalidConfigException -> 0x012b }
        L_0x0107:
            android.content.Context r13 = r6.a((android.content.Context) r2, (defpackage.boz) r0, (int) r9)     // Catch:{ InvalidConfigException -> 0x012b }
            if (r13 != 0) goto L_0x012a
            java.lang.String r0 = "Failed to load module containing Chimera impl for "
            java.lang.String r9 = java.lang.String.valueOf(r25)     // Catch:{ InvalidConfigException -> 0x0128 }
            int r10 = r9.length()     // Catch:{ InvalidConfigException -> 0x0128 }
            if (r10 != 0) goto L_0x011f
            java.lang.String r9 = new java.lang.String     // Catch:{ InvalidConfigException -> 0x0128 }
            r9.<init>(r0)     // Catch:{ InvalidConfigException -> 0x0128 }
            goto L_0x0123
        L_0x011f:
            java.lang.String r9 = r0.concat(r9)     // Catch:{ InvalidConfigException -> 0x0128 }
        L_0x0123:
            android.util.Log.e(r5, r9)     // Catch:{ InvalidConfigException -> 0x0128 }
            goto L_0x00a1
        L_0x0128:
            r0 = move-exception
            goto L_0x0131
        L_0x012a:
            goto L_0x0156
        L_0x012b:
            r0 = move-exception
            goto L_0x0131
        L_0x012d:
            r0 = move-exception
            r14 = 0
            goto L_0x0131
        L_0x0130:
            r0 = move-exception
        L_0x0131:
            if (r15 == 0) goto L_0x0152
            java.lang.String r2 = "Chimera config error: "
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x01f7 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x01f7 }
            int r3 = r0.length()     // Catch:{ all -> 0x01f7 }
            if (r3 != 0) goto L_0x0149
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x01f7 }
            r0.<init>(r2)     // Catch:{ all -> 0x01f7 }
            goto L_0x014d
        L_0x0149:
            java.lang.String r0 = r2.concat(r0)     // Catch:{ all -> 0x01f7 }
        L_0x014d:
            android.util.Log.e(r5, r0)     // Catch:{ all -> 0x01f7 }
            goto L_0x00a1
        L_0x0152:
            r24.d()     // Catch:{ all -> 0x01f7 }
            r15 = 1
        L_0x0156:
            if (r13 != 0) goto L_0x015c
            r9 = 1
            r11 = 0
            goto L_0x0025
        L_0x015c:
            android.os.StrictMode.setThreadPolicy(r8)
            if (r14 != 0) goto L_0x01d9
            int r2 = r7.c
            java.lang.String r6 = r7.d
            java.lang.Class[] r0 = r7.f
            java.lang.Object[] r7 = r7.e
            java.lang.ClassLoader r8 = r13.getClassLoader()     // Catch:{ ClassNotFoundException -> 0x01a3, NoSuchMethodException -> 0x01a1, ClassCastException -> 0x019f }
            java.lang.Class r8 = r8.loadClass(r6)     // Catch:{ ClassNotFoundException -> 0x01a3, NoSuchMethodException -> 0x01a1, ClassCastException -> 0x019f }
            java.lang.Class<bnu> r9 = defpackage.bnu.class
            java.lang.Class r8 = r8.asSubclass(r9)     // Catch:{ ClassNotFoundException -> 0x01a3, NoSuchMethodException -> 0x01a1, ClassCastException -> 0x019f }
            java.lang.reflect.Constructor r0 = r8.getConstructor(r0)     // Catch:{ NoSuchMethodException -> 0x0180, ClassNotFoundException -> 0x01a3, ClassCastException -> 0x019f }
            r19 = r0
            r21 = 0
            goto L_0x018f
        L_0x0180:
            r0 = move-exception
            r9 = r0
            java.lang.String r0 = "provideInstance"
            r10 = 0
            java.lang.Class[] r11 = new java.lang.Class[r10]     // Catch:{ NoSuchMethodException -> 0x019d, ClassNotFoundException -> 0x01a3, ClassCastException -> 0x019f }
            java.lang.reflect.Method r0 = r8.getDeclaredMethod(r0, r11)     // Catch:{ NoSuchMethodException -> 0x019d, ClassNotFoundException -> 0x01a3, ClassCastException -> 0x019f }
            r21 = r0
            r19 = 0
        L_0x018f:
            bot r10 = new bot
            r16 = r10
            r17 = r2
            r18 = r6
            r20 = r7
            r16.<init>(r17, r18, r19, r20, r21)
            goto L_0x01da
        L_0x019d:
            r0 = move-exception
            throw r9     // Catch:{ ClassNotFoundException -> 0x01a3, NoSuchMethodException -> 0x01a1, ClassCastException -> 0x019f }
        L_0x019f:
            r0 = move-exception
            goto L_0x01a4
        L_0x01a1:
            r0 = move-exception
            goto L_0x01a4
        L_0x01a3:
            r0 = move-exception
        L_0x01a4:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r6)
            int r2 = r2.length()
            java.lang.String r7 = java.lang.String.valueOf(r0)
            int r7 = r7.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r2 = r2 + 24
            int r2 = r2 + r7
            r8.<init>(r2)
            java.lang.String r2 = "Failed to instantiate "
            r8.append(r2)
            r8.append(r6)
            java.lang.String r2 = ": "
            r8.append(r2)
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            android.util.Log.e(r5, r0)
            r10 = 0
            goto L_0x01da
        L_0x01d9:
            r10 = r14
        L_0x01da:
            if (r10 == 0) goto L_0x01f5
            java.lang.Class r0 = r1.a
            java.lang.Object r0 = r10.a(r0)
            if (r0 == 0) goto L_0x01f3
            oi r2 = r1.b
            if (r2 != 0) goto L_0x01e9
            goto L_0x01ee
        L_0x01e9:
            if (r14 != 0) goto L_0x01ee
            r2.a((java.lang.Object) r4, (java.lang.Object) r10)
        L_0x01ee:
            r3.a(r0, r13)
            r2 = 1
            return r2
        L_0x01f3:
            r2 = 0
            return r2
        L_0x01f5:
            r2 = 0
            return r2
        L_0x01f7:
            r0 = move-exception
            android.os.StrictMode.setThreadPolicy(r8)
            goto L_0x01fd
        L_0x01fc:
            throw r0
        L_0x01fd:
            goto L_0x01fc
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bow.a(android.content.Context, bou, java.lang.String):boolean");
    }
}
