package defpackage;

import com.google.android.gms.contextmanager.internal.KeyFilterImpl;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import java.util.Collection;

/* renamed from: ckt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ckt {
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009f A[Catch:{ Exception -> 0x0197 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x010b A[Catch:{ Exception -> 0x0197 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x010e A[Catch:{ Exception -> 0x0197 }] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0114 A[Catch:{ Exception -> 0x0197 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.contextmanager.internal.ContextDataFilterImpl a(defpackage.jtp r16) {
        /*
            r1 = r16
            java.lang.String r2 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            java.lang.String r3 = "a"
            java.lang.String r4 = "ckt"
            if (r1 == 0) goto L_0x01b2
            jtm r6 = new jtm     // Catch:{ Exception -> 0x0197 }
            r6.<init>()     // Catch:{ Exception -> 0x0197 }
            aucx r0 = r1.b     // Catch:{ Exception -> 0x0197 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ Exception -> 0x0197 }
        L_0x0015:
            boolean r0 = r7.hasNext()     // Catch:{ Exception -> 0x0197 }
            if (r0 == 0) goto L_0x0137
            java.lang.Object r0 = r7.next()     // Catch:{ Exception -> 0x0197 }
            r8 = r0
            jto r8 = (defpackage.jto) r8     // Catch:{ Exception -> 0x0197 }
            int r9 = r8.c     // Catch:{ Exception -> 0x0197 }
            int r0 = r8.a     // Catch:{ Exception -> 0x0197 }
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0097
            jtu r0 = r8.d     // Catch:{ Exception -> 0x0197 }
            if (r0 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            jtu r0 = defpackage.jtu.c     // Catch:{ Exception -> 0x0197 }
        L_0x0031:
            if (r0 == 0) goto L_0x0094
            juu r10 = new juu     // Catch:{ Exception -> 0x0078 }
            r10.<init>()     // Catch:{ Exception -> 0x0078 }
            aucx r11 = r0.a     // Catch:{ Exception -> 0x0078 }
            int r11 = r11.size()     // Catch:{ Exception -> 0x0078 }
            if (r11 != 0) goto L_0x0042
            r15 = r6
            goto L_0x005f
        L_0x0042:
            aucx r11 = r0.a     // Catch:{ Exception -> 0x0078 }
            java.util.Iterator r11 = r11.iterator()     // Catch:{ Exception -> 0x0078 }
        L_0x0048:
            boolean r12 = r11.hasNext()     // Catch:{ Exception -> 0x0078 }
            if (r12 == 0) goto L_0x005e
            java.lang.Object r12 = r11.next()     // Catch:{ Exception -> 0x0078 }
            jtt r12 = (defpackage.jtt) r12     // Catch:{ Exception -> 0x0078 }
            long r13 = r12.b     // Catch:{ Exception -> 0x0078 }
            r15 = r6
            long r5 = r12.c     // Catch:{ Exception -> 0x0076 }
            r10.a(r13, r5)     // Catch:{ Exception -> 0x0076 }
            r6 = r15
            goto L_0x0048
        L_0x005e:
            r15 = r6
        L_0x005f:
            aucs r5 = r0.b     // Catch:{ Exception -> 0x0076 }
            int r5 = r5.size()     // Catch:{ Exception -> 0x0076 }
            if (r5 == 0) goto L_0x0070
            aucs r0 = r0.b     // Catch:{ Exception -> 0x0076 }
            int[] r0 = defpackage.aoog.a((java.util.Collection) r0)     // Catch:{ Exception -> 0x0076 }
            r10.a((int[]) r0)     // Catch:{ Exception -> 0x0076 }
        L_0x0070:
            com.google.android.gms.contextmanager.internal.TimeFilterImpl r0 = r10.a()     // Catch:{ Exception -> 0x0076 }
            r5 = r0
            goto L_0x0099
        L_0x0076:
            r0 = move-exception
            goto L_0x007a
        L_0x0078:
            r0 = move-exception
            r15 = r6
        L_0x007a:
            jjg r5 = defpackage.bxk.a     // Catch:{ Exception -> 0x0197 }
            anie r5 = r5.b()     // Catch:{ Exception -> 0x0197 }
            anih r5 = (defpackage.anih) r5     // Catch:{ Exception -> 0x0197 }
            r5.a((java.lang.Throwable) r0)     // Catch:{ Exception -> 0x0197 }
            r0 = 152(0x98, float:2.13E-43)
            anie r0 = r5.a((java.lang.String) r4, (java.lang.String) r3, (int) r0, (java.lang.String) r2)     // Catch:{ Exception -> 0x0197 }
            anih r0 = (defpackage.anih) r0     // Catch:{ Exception -> 0x0197 }
            java.lang.String r5 = "[ContextManagerUtil] Could not create TimeFilterImpl from proto."
            r0.a((java.lang.String) r5)     // Catch:{ Exception -> 0x0197 }
            r5 = 0
            goto L_0x0099
        L_0x0094:
            r15 = r6
            r5 = 0
            goto L_0x0099
        L_0x0097:
            r15 = r6
            r5 = 0
        L_0x0099:
            int r0 = r8.a     // Catch:{ Exception -> 0x0197 }
            r0 = r0 & 8
            if (r0 == 0) goto L_0x010b
            jtr r0 = r8.e     // Catch:{ Exception -> 0x0197 }
            if (r0 == 0) goto L_0x00a4
            goto L_0x00a6
        L_0x00a4:
            jtr r0 = defpackage.jtr.b     // Catch:{ Exception -> 0x0197 }
        L_0x00a6:
            if (r0 == 0) goto L_0x0109
            juo r6 = new juo     // Catch:{ Exception -> 0x00ee }
            r6.<init>()     // Catch:{ Exception -> 0x00ee }
            aucx r0 = r0.a     // Catch:{ Exception -> 0x00ee }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x00ee }
        L_0x00b3:
            boolean r8 = r0.hasNext()     // Catch:{ Exception -> 0x00ee }
            if (r8 == 0) goto L_0x00e9
            java.lang.Object r8 = r0.next()     // Catch:{ Exception -> 0x00ee }
            jtq r8 = (defpackage.jtq) r8     // Catch:{ Exception -> 0x00ee }
            aucx r10 = r8.a     // Catch:{ Exception -> 0x00ee }
            r11 = 0
            java.lang.String[] r12 = new java.lang.String[r11]     // Catch:{ Exception -> 0x00ee }
            java.lang.Object[] r10 = r10.toArray(r12)     // Catch:{ Exception -> 0x00ee }
            java.lang.String[] r10 = (java.lang.String[]) r10     // Catch:{ Exception -> 0x00ee }
            aucx r12 = r8.b     // Catch:{ Exception -> 0x00ee }
            java.lang.String[] r13 = new java.lang.String[r11]     // Catch:{ Exception -> 0x00ee }
            java.lang.Object[] r12 = r12.toArray(r13)     // Catch:{ Exception -> 0x00ee }
            java.lang.String[] r12 = (java.lang.String[]) r12     // Catch:{ Exception -> 0x00ee }
            aucx r8 = r8.c     // Catch:{ Exception -> 0x00ee }
            java.lang.String[] r11 = new java.lang.String[r11]     // Catch:{ Exception -> 0x00ee }
            java.lang.Object[] r8 = r8.toArray(r11)     // Catch:{ Exception -> 0x00ee }
            java.lang.String[] r8 = (java.lang.String[]) r8     // Catch:{ Exception -> 0x00ee }
            java.util.ArrayList r11 = r6.a     // Catch:{ Exception -> 0x00ee }
            com.google.android.gms.contextmanager.internal.KeyFilterImpl$Inclusion r13 = new com.google.android.gms.contextmanager.internal.KeyFilterImpl$Inclusion     // Catch:{ Exception -> 0x00ee }
            r13.<init>(r10, r12, r8)     // Catch:{ Exception -> 0x00ee }
            r11.add(r13)     // Catch:{ Exception -> 0x00ee }
            goto L_0x00b3
        L_0x00e9:
            com.google.android.gms.contextmanager.internal.KeyFilterImpl r0 = r6.a()     // Catch:{ Exception -> 0x00ee }
            goto L_0x010c
        L_0x00ee:
            r0 = move-exception
            jjg r6 = defpackage.bxk.a     // Catch:{ Exception -> 0x0197 }
            anie r6 = r6.b()     // Catch:{ Exception -> 0x0197 }
            anih r6 = (defpackage.anih) r6     // Catch:{ Exception -> 0x0197 }
            r6.a((java.lang.Throwable) r0)     // Catch:{ Exception -> 0x0197 }
            r0 = 180(0xb4, float:2.52E-43)
            anie r0 = r6.a((java.lang.String) r4, (java.lang.String) r3, (int) r0, (java.lang.String) r2)     // Catch:{ Exception -> 0x0197 }
            anih r0 = (defpackage.anih) r0     // Catch:{ Exception -> 0x0197 }
            java.lang.String r6 = "[ContextManagerUtil] Could not convert ContextDataFilterProto.KeyFilter proto."
            r0.a((java.lang.String) r6)     // Catch:{ Exception -> 0x0197 }
            r0 = 0
            goto L_0x010c
        L_0x0109:
            r0 = 0
            goto L_0x010c
        L_0x010b:
            r0 = 0
        L_0x010c:
            if (r5 != 0) goto L_0x0114
            r6 = r15
            r6.a((int) r9)     // Catch:{ Exception -> 0x0197 }
            goto L_0x0015
        L_0x0114:
            r6 = r15
            if (r0 == 0) goto L_0x0132
            defpackage.iva.a((java.lang.Object) r0)     // Catch:{ Exception -> 0x0197 }
            java.util.HashSet r8 = r6.a     // Catch:{ Exception -> 0x0197 }
            if (r8 != 0) goto L_0x0125
            java.util.HashSet r8 = new java.util.HashSet     // Catch:{ Exception -> 0x0197 }
            r8.<init>()     // Catch:{ Exception -> 0x0197 }
            r6.a = r8     // Catch:{ Exception -> 0x0197 }
        L_0x0125:
            java.util.HashSet r8 = r6.a     // Catch:{ Exception -> 0x0197 }
            com.google.android.gms.contextmanager.internal.ContextDataFilterImpl$Inclusion r10 = new com.google.android.gms.contextmanager.internal.ContextDataFilterImpl$Inclusion     // Catch:{ Exception -> 0x0197 }
            r11 = -1
            r10.<init>(r11, r9, r5, r0)     // Catch:{ Exception -> 0x0197 }
            r8.add(r10)     // Catch:{ Exception -> 0x0197 }
            goto L_0x0015
        L_0x0132:
            r6.a(r9, r5)     // Catch:{ Exception -> 0x0197 }
            goto L_0x0015
        L_0x0137:
            aucx r0 = r1.c     // Catch:{ Exception -> 0x0197 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0197 }
        L_0x013d:
            boolean r5 = r0.hasNext()     // Catch:{ Exception -> 0x0197 }
            if (r5 == 0) goto L_0x015a
            java.lang.Object r5 = r0.next()     // Catch:{ Exception -> 0x0197 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0197 }
            java.util.HashSet r7 = r6.b     // Catch:{ Exception -> 0x0197 }
            if (r7 != 0) goto L_0x0154
            java.util.HashSet r7 = new java.util.HashSet     // Catch:{ Exception -> 0x0197 }
            r7.<init>()     // Catch:{ Exception -> 0x0197 }
            r6.b = r7     // Catch:{ Exception -> 0x0197 }
        L_0x0154:
            java.util.HashSet r7 = r6.b     // Catch:{ Exception -> 0x0197 }
            r7.add(r5)     // Catch:{ Exception -> 0x0197 }
            goto L_0x013d
        L_0x015a:
            jts r0 = r1.d     // Catch:{ Exception -> 0x0197 }
            if (r0 == 0) goto L_0x015f
            goto L_0x0161
        L_0x015f:
            jts r0 = defpackage.jts.e     // Catch:{ Exception -> 0x0197 }
        L_0x0161:
            int r0 = r0.c     // Catch:{ Exception -> 0x0197 }
            if (r0 <= 0) goto L_0x0171
            jts r0 = r1.d     // Catch:{ Exception -> 0x0197 }
            if (r0 == 0) goto L_0x016a
            goto L_0x016c
        L_0x016a:
            jts r0 = defpackage.jts.e     // Catch:{ Exception -> 0x0197 }
        L_0x016c:
            int r0 = r0.c     // Catch:{ Exception -> 0x0197 }
            r6.b(r0)     // Catch:{ Exception -> 0x0197 }
        L_0x0171:
            jts r0 = r1.d     // Catch:{ Exception -> 0x0197 }
            if (r0 == 0) goto L_0x0176
            goto L_0x0178
        L_0x0176:
            jts r0 = defpackage.jts.e     // Catch:{ Exception -> 0x0197 }
        L_0x0178:
            aucs r0 = r0.d     // Catch:{ Exception -> 0x0197 }
            int r0 = r0.size()     // Catch:{ Exception -> 0x0197 }
            if (r0 == 0) goto L_0x0190
            jts r0 = r1.d     // Catch:{ Exception -> 0x0197 }
            if (r0 == 0) goto L_0x0185
            goto L_0x0187
        L_0x0185:
            jts r0 = defpackage.jts.e     // Catch:{ Exception -> 0x0197 }
        L_0x0187:
            aucs r0 = r0.d     // Catch:{ Exception -> 0x0197 }
            int[] r0 = defpackage.aoog.a((java.util.Collection) r0)     // Catch:{ Exception -> 0x0197 }
            r6.a((int[]) r0)     // Catch:{ Exception -> 0x0197 }
        L_0x0190:
            jtn r0 = r6.a()     // Catch:{ Exception -> 0x0197 }
            com.google.android.gms.contextmanager.internal.ContextDataFilterImpl r0 = (com.google.android.gms.contextmanager.internal.ContextDataFilterImpl) r0
            return r0
        L_0x0197:
            r0 = move-exception
            jjg r1 = defpackage.bxk.a
            anie r1 = r1.b()
            anih r1 = (defpackage.anih) r1
            r1.a((java.lang.Throwable) r0)
            r0 = 122(0x7a, float:1.71E-43)
            anie r0 = r1.a((java.lang.String) r4, (java.lang.String) r3, (int) r0, (java.lang.String) r2)
            anih r0 = (defpackage.anih) r0
            java.lang.String r1 = "[ContextManagerUtil] Could not create ContextDataFilterImpl from proto."
            r0.a((java.lang.String) r1)
            r1 = 0
            return r1
        L_0x01b2:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckt.a(jtp):com.google.android.gms.contextmanager.internal.ContextDataFilterImpl");
    }

    public static KeyFilterImpl a(jtr jtr) {
        if (jtr == null) {
            return null;
        }
        try {
            juo juo = new juo();
            for (jtq jtq : jtr.a) {
                juo.a.add(new KeyFilterImpl.Inclusion((String[]) jtq.a.toArray(new String[0]), (String[]) jtq.b.toArray(new String[0]), (String[]) jtq.c.toArray(new String[0])));
            }
            return juo.a();
        } catch (Exception e) {
            anih anih = (anih) bxk.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("ckt", "a", 180, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextManagerUtil] Could not convert ContextDataFilterProto.KeyFilter proto.");
            return null;
        }
    }

    public static TimeFilterImpl a(jtu jtu) {
        if (jtu == null) {
            return null;
        }
        try {
            juu juu = new juu();
            if (jtu.a.size() != 0) {
                for (jtt jtt : jtu.a) {
                    juu.a(jtt.b, jtt.c);
                }
            }
            if (jtu.b.size() != 0) {
                juu.a(aoog.a((Collection) jtu.b));
            }
            return juu.a();
        } catch (Exception e) {
            anih anih = (anih) bxk.a.b();
            anih.a((Throwable) e);
            ((anih) anih.a("ckt", "a", 152, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[ContextManagerUtil] Could not create TimeFilterImpl from proto.");
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(com.google.android.gms.contextmanager.ContextData r1, java.util.Collection r2) {
        /*
            java.util.Iterator r2 = r2.iterator()
        L_0x0004:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x001c
            java.lang.Object r0 = r2.next()
            cas r0 = (defpackage.cas) r0
            jwi r0 = r0.d
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.a(r1)
            if (r0 == 0) goto L_0x0004
        L_0x001a:
            r1 = 1
            return r1
        L_0x001c:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ckt.a(com.google.android.gms.contextmanager.ContextData, java.util.Collection):boolean");
    }
}
