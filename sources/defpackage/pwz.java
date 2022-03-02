package defpackage;

import android.accounts.Account;
import android.util.Log;
import com.google.android.gms.appdatasearch.GetRecentContextCall$Request;
import com.google.android.gms.appdatasearch.UsageInfo;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/* renamed from: pwz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class pwz {
    private final pwx a = new pwx();

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008f, code lost:
        if (r0.c != false) goto L_0x0091;
     */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.List b(com.google.android.gms.appdatasearch.GetRecentContextCall$Request r18, defpackage.prq r19) {
        /*
            r17 = this;
            r0 = r18
            r1 = r19
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = r17
            pwx r4 = r3.a
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0015:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00fc
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = r0.e
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x0037
            java.lang.String r7 = r0.e
            boolean r7 = r7.equals(r6)
            if (r7 == 0) goto L_0x0015
        L_0x0037:
            r7 = 0
            if (r1 != 0) goto L_0x003b
            goto L_0x0068
        L_0x003b:
            boolean r8 = defpackage.axsj.e()
            if (r8 == 0) goto L_0x0055
            android.content.SharedPreferences r8 = r1.a
            java.lang.String r9 = "app-params"
            boolean r8 = r8.contains(r9)
            if (r8 == 0) goto L_0x004c
            goto L_0x0055
        L_0x004c:
            android.content.Context r8 = r1.b
            boolean r8 = defpackage.prp.b(r8, r6)
            if (r8 != 0) goto L_0x0068
            goto L_0x0061
        L_0x0055:
            android.content.SharedPreferences r8 = r1.a
            java.lang.String r9 = defpackage.prp.a((java.lang.String) r6)
            boolean r8 = r8.getBoolean(r9, r7)
            if (r8 == 0) goto L_0x0068
        L_0x0061:
            java.lang.String r5 = "Package %s is blacklisted and excluded from getRecentContext() result"
            defpackage.oso.d((java.lang.String) r5, (java.lang.Object) r6)
            goto L_0x0015
        L_0x0068:
            java.lang.Object r5 = r5.getValue()
            pww r5 = (defpackage.pww) r5
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            boolean r9 = r5.b
            r10 = 2
            r11 = 3
            if (r9 != 0) goto L_0x0091
            agvx r9 = defpackage.ozx.D
            java.lang.Object r9 = r9.c()
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L_0x008d
            java.lang.String r5 = "Third-party context is disabled for getRecentContext()."
            defpackage.oso.d(r5)
            goto L_0x00d1
        L_0x008d:
            boolean r9 = r0.c
            if (r9 == 0) goto L_0x00d1
        L_0x0091:
            java.util.List r5 = r5.a
            int r9 = r5.size()
            r12 = 0
        L_0x0098:
            if (r12 >= r9) goto L_0x00d1
            java.lang.Object r13 = r5.get(r12)
            com.google.android.gms.appdatasearch.UsageInfo r13 = (com.google.android.gms.appdatasearch.UsageInfo) r13
            android.accounts.Account r14 = r0.a
            com.google.android.gms.appdatasearch.DocumentContents r15 = r13.e
            if (r14 != 0) goto L_0x00a7
            goto L_0x00c2
        L_0x00a7:
            if (r15 == 0) goto L_0x00c2
            android.accounts.Account r15 = r15.d
            if (r15 == 0) goto L_0x00c2
            boolean r16 = r15.equals(r14)
            if (r16 != 0) goto L_0x00c2
            java.lang.Object[] r13 = new java.lang.Object[r11]
            r13[r7] = r14
            r14 = 1
            r13[r14] = r15
            r13[r10] = r6
            java.lang.String r14 = "Drop UsageInfo. Mismatch between requested account (%s) and the document's account (%s) in package (%s)"
            defpackage.oso.a((java.lang.String) r14, (java.lang.Object[]) r13)
            goto L_0x00ce
        L_0x00c2:
            boolean r14 = r0.b
            if (r14 == 0) goto L_0x00c7
            goto L_0x00cb
        L_0x00c7:
            boolean r14 = r13.f
            if (r14 != 0) goto L_0x00ce
        L_0x00cb:
            r8.add(r13)
        L_0x00ce:
            int r12 = r12 + 1
            goto L_0x0098
        L_0x00d1:
            boolean r5 = r0.d
            if (r5 == 0) goto L_0x00da
            r2.addAll(r8)
            goto L_0x0015
        L_0x00da:
            pwy r5 = new pwy
            r5.<init>()
            java.util.Collections.sort(r8, r5)
            int r5 = r8.size()
        L_0x00e6:
            if (r7 >= r5) goto L_0x0015
            java.lang.Object r6 = r8.get(r7)
            com.google.android.gms.appdatasearch.UsageInfo r6 = (com.google.android.gms.appdatasearch.UsageInfo) r6
            int r9 = r6.c
            if (r9 == r11) goto L_0x0015
            int r9 = r6.h
            if (r9 == r10) goto L_0x0015
            r2.add(r6)
            int r7 = r7 + 1
            goto L_0x00e6
        L_0x00fc:
            pwy r0 = new pwy
            r0.<init>()
            java.util.Collections.sort(r2, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pwz.b(com.google.android.gms.appdatasearch.GetRecentContextCall$Request, prq):java.util.List");
    }

    public final synchronized List a(GetRecentContextCall$Request getRecentContextCall$Request, prq prq) {
        return b(getRecentContextCall$Request, prq);
    }

    public final synchronized void a(UsageInfo usageInfo, boolean z) {
        String str = usageInfo.a.a;
        pww pww = (pww) this.a.remove(str);
        if (pww == null) {
            pww = new pww(new ArrayList(5), z);
        }
        List list = pww.a;
        list.add(usageInfo);
        if (list.size() > 5) {
            list.remove(0);
        }
        this.a.put(str, pww);
    }

    public final synchronized void a(PrintWriter printWriter, String str) {
        printWriter.println(str.concat("Context cache"));
        String concat = str.concat("  ");
        if (this.a.isEmpty()) {
            printWriter.println(String.valueOf(concat).concat("<empty>"));
            return;
        }
        printWriter.println(String.valueOf(concat).concat("Keys:"));
        for (String str2 : this.a.keySet()) {
            StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + 2 + String.valueOf(str2).length());
            sb.append(concat);
            sb.append("  ");
            sb.append(str2);
            printWriter.println(sb.toString());
        }
        if (Log.isLoggable("Icing", 2)) {
            printWriter.println(String.valueOf(concat).concat("Context:"));
            List b = b(new GetRecentContextCall$Request((Account) null, true, true, false, (String) null), (prq) null);
            int i = 0;
            while (i < b.size()) {
                String valueOf = String.valueOf(b.get(i));
                StringBuilder sb2 = new StringBuilder(String.valueOf(concat).length() + 16 + String.valueOf(valueOf).length());
                sb2.append(concat);
                sb2.append("  #");
                i++;
                sb2.append(i);
                sb2.append(": ");
                sb2.append(valueOf);
                printWriter.println(sb2.toString());
            }
            return;
        }
        printWriter.println(String.valueOf(concat).concat("Context:<redacted>"));
    }
}
