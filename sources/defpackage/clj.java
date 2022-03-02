package defpackage;

import android.text.TextUtils;
import com.google.android.gms.contextmanager.internal.ContextManagerClientInfo;
import java.io.PrintWriter;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: clj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class clj extends cbe {
    public final cln a = new cln();
    public final Set b = new LinkedHashSet();
    private final cli c = new cli(this);

    public static void a(PrintWriter printWriter, jyk jyk) {
        long j = jyk.c - jyk.b;
        long j2 = j / 3600000;
        long j3 = j - (3600000 * j2);
        long j4 = j3 / 60000;
        long j5 = j3 - (60000 * j4);
        long j6 = j5 / 1000;
        String format = String.format("%02d:%02d:%02d.%03d", new Object[]{Long.valueOf(j2), Long.valueOf(j4), Long.valueOf(j6), Long.valueOf(j5 - (j6 * 1000))});
        String a2 = cku.a(jyk.b);
        String a3 = cku.a(jyk.c);
        StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 30 + String.valueOf(a2).length() + String.valueOf(a3).length());
        sb.append("[Interval duration ");
        sb.append(format);
        sb.append(" from ");
        sb.append(a2);
        sb.append(" to ");
        sb.append(a3);
        sb.append("]");
        printWriter.println(sb.toString());
        aucx aucx = jyk.d;
        int size = aucx.size();
        for (int i = 0; i < size; i++) {
            jyj jyj = (jyj) aucx.get(i);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("  \"");
            sb2.append(jyj.b);
            sb2.append("\" (");
            sb2.append(jyj.c.c(0));
            sb2.append("): mean=");
            sb2.append(jyj.h);
            sb2.append("/");
            sb2.append(jyj.d);
            sb2.append("ms, stdev=");
            sb2.append(jyj.i);
            sb2.append("/");
            sb2.append(jyj.e);
            sb2.append("ms, min=");
            sb2.append(jyj.j);
            sb2.append("/");
            sb2.append(jyj.f);
            sb2.append("ms, max=");
            sb2.append(jyj.k);
            sb2.append("/");
            sb2.append(jyj.g);
            sb2.append("ms");
            for (int i2 = 1; i2 < jyj.c.size(); i2++) {
                if (jyj.c.c(i2) > 0) {
                    sb2.append(", errorCode(");
                    sb2.append(i2);
                    sb2.append(")=");
                    sb2.append(jyj.c.c(i2));
                    sb2.append(" count");
                }
            }
            printWriter.println(sb2.toString());
        }
        if (jyk.e.size() > 0) {
            printWriter.println("    write counts:");
            aucx aucx2 = jyk.e;
            int size2 = aucx2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                jyi jyi = (jyi) aucx2.get(i3);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("      [");
                sb3.append(jyi.g);
                sb3.append("] ");
                atjv a4 = atjv.a(jyi.b);
                if (a4 == null) {
                    a4 = atjv.UNKNOWN_CONTEXT_NAME;
                }
                sb3.append(Integer.toString(a4.bA));
                sb3.append(" :");
                if (jyi.c != 0) {
                    sb3.append(" write(");
                    sb3.append(jyi.c);
                    sb3.append(")");
                }
                if (jyi.d != 0) {
                    sb3.append(" inject(");
                    sb3.append(jyi.d);
                    sb3.append(")");
                }
                if (jyi.e != 0) {
                    sb3.append(" accessDenied(");
                    sb3.append(jyi.e);
                    sb3.append(")");
                }
                if (jyi.f != 0) {
                    sb3.append(" error(");
                    sb3.append(jyi.f);
                    sb3.append(")");
                }
                printWriter.println(sb3.toString());
            }
        }
        if (jyk.f.size() > 0 && awvm.b()) {
            printWriter.println("    Fence event details:");
            aucx aucx3 = jyk.f;
            int size3 = aucx3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                jyd jyd = (jyd) aucx3.get(i4);
                long j7 = jyd.b - jyk.b;
                String str = (jyd.a & 2) != 0 ? jyd.c : "   //   ";
                int a5 = jyc.a(jyd.d);
                if (a5 == 0) {
                    a5 = 1;
                }
                String num = Integer.toString(a5 - 1);
                StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(num).length());
                sb4.append(" ");
                sb4.append(j7);
                sb4.append(" - ");
                sb4.append(str);
                sb4.append(": ");
                sb4.append(num);
                printWriter.println(sb4.toString());
            }
            printWriter.println();
        }
    }

    public final void b(bvp bvp) {
        synchronized (this.b) {
            if (!this.b.remove(bvp)) {
                ((anih) ((anih) bxk.a.b()).a("clj", "b", 65, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[WorkManager] Ongoing task not found: %s", (Object) bvp.a);
            }
        }
        c(bvp);
    }

    public final void c(bvp bvp) {
        if (bvp.d() > 1000) {
            ((anih) ((anih) bxk.a.c()).a("clj", "c", 73, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[WorkManager] Long workInfo: %s", (Object) bvp);
        }
        synchronized (this.a) {
            cln cln = this.a;
            String str = bvp.a;
            clm clm = (clm) cln.a.get(str);
            if (clm == null) {
                clm = new clm(str);
                cln.a.put(str, clm);
            }
            if (!TextUtils.equals(bvp.a, clm.a)) {
                ((anih) ((anih) bxk.a.b()).a("cln", "a", 65, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[WorkInfoSummary] Could not add work info: %s", (Object) bvp);
            } else {
                int[] iArr = clm.b;
                int i = bvp.f;
                iArr[i] = iArr[i] + 1;
                if (i == 0) {
                    clm.a(bvp.d(), 0);
                    clm.a(bvp.e(), 1);
                }
            }
        }
    }

    public final void a() {
        cbi.k().a(this.c, 3600000, bvq.a("WorkManagerSave"));
    }

    public final void a(long j, String str, int i) {
        if (awvm.b()) {
            synchronized (this.a) {
                cln cln = this.a;
                aucd o = jyd.e.o();
                if (o.c) {
                    o.c();
                    o.c = false;
                }
                jyd jyd = (jyd) o.b;
                int i2 = jyd.a | 1;
                jyd.a = i2;
                jyd.b = j;
                int i3 = i - 1;
                if (i != 0) {
                    jyd.d = i3;
                    jyd.a = i2 | 4;
                    if (!str.equals(cln.d)) {
                        if (o.c) {
                            o.c();
                            o.c = false;
                        }
                        jyd jyd2 = (jyd) o.b;
                        str.getClass();
                        jyd2.a |= 2;
                        jyd2.c = str;
                        cln.d = str;
                    }
                    cln.c.add((jyd) o.i());
                } else {
                    throw null;
                }
            }
        }
    }

    public final void a(bvp bvp) {
        synchronized (this.b) {
            bvp.a();
            this.b.add(bvp);
        }
    }

    public final void a(ContextManagerClientInfo contextManagerClientInfo, atjv atjv, int i) {
        synchronized (this.a) {
            cln cln = this.a;
            cll cll = (cll) cln.b.get(atjv.bA);
            if (cll == null) {
                cll = new cll(atjv);
                cln.b.put(atjv.bA, cll);
            }
            String str = contextManagerClientInfo.a;
            clk clk = (clk) cll.b.get(str);
            if (clk == null) {
                clk = new clk();
                cll.b.put(str, clk);
            }
            if (i == 0) {
                clk.a++;
            } else if (i == 1) {
                clk.b++;
            } else if (i != 2) {
                clk.d++;
            } else {
                clk.c++;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x009a, code lost:
        r1 = defpackage.cbi.i().b();
        r14.println("[Ongoing tasks]");
        r0 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00af, code lost:
        if (r0.hasNext() == false) goto L_0x0104;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b1, code lost:
        r3 = (defpackage.bvp) r0.next();
        r4 = r3.e();
        r6 = r1 - r3.c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c3, code lost:
        if (r4 >= 0) goto L_0x00cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c5, code lost:
        r4 = r6;
        r6 = -1 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cd, code lost:
        r3 = r3.a;
        r9 = new java.lang.StringBuilder(java.lang.String.valueOf(r3).length() + 49);
        r9.append("  \"");
        r9.append(r3);
        r9.append("\": ");
        r9.append(r4);
        r9.append("/");
        r9.append(r6 - r4);
        r9.append("ms");
        r14.println(r9.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0104, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.io.PrintWriter r14) {
        /*
            r13 = this;
            juk r0 = new juk
            r1 = 0
            r0.<init>(r1)
            juu r2 = new juu
            r2.<init>()
            r2.b()
            com.google.android.gms.contextmanager.internal.TimeFilterImpl r2 = r2.a()
            r3 = 5
            r0.a(r3, r2)
            jum r0 = r0.a()
            cjo r2 = defpackage.cbi.q()
            java.util.ArrayList r0 = r2.a((defpackage.jum) r0)
            r14.println()
            java.lang.String r2 = ">>> WorkManager <<<"
            r14.println(r2)
            int r2 = r0.size()
            r3 = 0
        L_0x002f:
            if (r3 >= r2) goto L_0x006d
            java.lang.Object r4 = r0.get(r3)
            juj r4 = (defpackage.juj) r4
            byte[] r4 = r4.c()     // Catch:{ auda -> 0x004b }
            aubs r5 = defpackage.aubs.c()     // Catch:{ auda -> 0x004b }
            jyk r6 = defpackage.jyk.g     // Catch:{ auda -> 0x004b }
            aucj r4 = defpackage.aucj.a((defpackage.aucj) r6, (byte[]) r4, (defpackage.aubs) r5)     // Catch:{ auda -> 0x004b }
            jyk r4 = (defpackage.jyk) r4     // Catch:{ auda -> 0x004b }
            a(r14, r4)     // Catch:{ auda -> 0x004b }
            goto L_0x006a
        L_0x004b:
            r4 = move-exception
            jjg r5 = defpackage.bxk.a
            anie r5 = r5.b()
            anih r5 = (defpackage.anih) r5
            r5.a((java.lang.Throwable) r4)
            r4 = 115(0x73, float:1.61E-43)
            java.lang.String r6 = "clj"
            java.lang.String r7 = "a"
            java.lang.String r8 = ":com.google.android.gms@201216073@20.12.16 (080306-306753009)"
            anie r4 = r5.a((java.lang.String) r6, (java.lang.String) r7, (int) r4, (java.lang.String) r8)
            anih r4 = (defpackage.anih) r4
            java.lang.String r5 = "[WorkManager] Could not parse work stats"
            r4.a((java.lang.String) r5)
        L_0x006a:
            int r3 = r3 + 1
            goto L_0x002f
        L_0x006d:
            cln r0 = r13.a
            monitor-enter(r0)
            cln r2 = r13.a     // Catch:{ all -> 0x010a }
            boolean r2 = r2.b()     // Catch:{ all -> 0x010a }
            if (r2 != 0) goto L_0x007f
            cln r1 = r13.a     // Catch:{ all -> 0x010a }
            jyk r1 = r1.c()     // Catch:{ all -> 0x010a }
            goto L_0x0080
        L_0x007f:
        L_0x0080:
            monitor-exit(r0)     // Catch:{ all -> 0x010a }
            if (r1 != 0) goto L_0x0084
            goto L_0x0087
        L_0x0084:
            a(r14, r1)
        L_0x0087:
            java.util.Set r1 = r13.b
            monitor-enter(r1)
            java.util.Set r0 = r13.b     // Catch:{ all -> 0x0107 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0107 }
            if (r0 != 0) goto L_0x0105
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet     // Catch:{ all -> 0x0107 }
            java.util.Set r2 = r13.b     // Catch:{ all -> 0x0107 }
            r0.<init>(r2)     // Catch:{ all -> 0x0107 }
            monitor-exit(r1)     // Catch:{ all -> 0x0107 }
            jiq r1 = defpackage.cbi.i()
            long r1 = r1.b()
            java.lang.String r3 = "[Ongoing tasks]"
            r14.println(r3)
            java.util.Iterator r0 = r0.iterator()
        L_0x00ab:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0104
            java.lang.Object r3 = r0.next()
            bvp r3 = (defpackage.bvp) r3
            long r4 = r3.e()
            long r6 = r3.c
            long r6 = r1 - r6
            r8 = 0
            int r10 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x00cc
            r4 = -1
            long r4 = r4 + r6
            r11 = r4
            r4 = r6
            r6 = r11
            goto L_0x00cd
        L_0x00cc:
        L_0x00cd:
            java.lang.String r3 = r3.a
            java.lang.String r8 = java.lang.String.valueOf(r3)
            int r8 = r8.length()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            int r8 = r8 + 49
            r9.<init>(r8)
            java.lang.String r8 = "  \""
            r9.append(r8)
            r9.append(r3)
            java.lang.String r3 = "\": "
            r9.append(r3)
            r9.append(r4)
            java.lang.String r3 = "/"
            r9.append(r3)
            long r6 = r6 - r4
            r9.append(r6)
            java.lang.String r3 = "ms"
            r9.append(r3)
            java.lang.String r3 = r9.toString()
            r14.println(r3)
            goto L_0x00ab
        L_0x0104:
            return
        L_0x0105:
            monitor-exit(r1)     // Catch:{ all -> 0x0107 }
            return
        L_0x0107:
            r14 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0107 }
            throw r14
        L_0x010a:
            r14 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x010a }
            goto L_0x010e
        L_0x010d:
            throw r14
        L_0x010e:
            goto L_0x010d
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clj.a(java.io.PrintWriter):void");
    }
}
