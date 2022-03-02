package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: prp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class prp implements prs {
    private static final int h = ((int) TimeUnit.HOURS.toSeconds(4));
    public final Context a;
    public final SharedPreferences b;
    public Map c;
    public ous d;
    public Map e;
    public int f;
    public final Object g = new Object();
    private final String i;

    static SharedPreferences a(Context context, String str) {
        StringBuilder sb = new StringBuilder(str.length() + 15);
        sb.append(str);
        sb.append("-icing-settings");
        return context.getSharedPreferences(sb.toString(), 4);
    }

    public static boolean b(Context context, String str) {
        if (axry.a.a().e().a.contains(str)) {
            return true;
        }
        if (axry.a.a().c()) {
            return hya.a(context).b(str);
        }
        return false;
    }

    private final void k() {
        String string = this.b.getString("app-params", (String) null);
        if (string != null) {
            pqr pqr = (pqr) plc.a(string, (auef) pqr.c.c(7));
            int i2 = pqr.b;
            if (i2 == 0) {
                i2 = h;
            }
            this.f = i2;
            if (pqr.a.size() != 0) {
                this.e = anet.a(pqr.a.size());
                aucx aucx = pqr.a;
                int size = aucx.size();
                for (int i3 = 0; i3 < size; i3++) {
                    pqq pqq = (pqq) aucx.get(i3);
                    this.e.put(pqq.a, pqq);
                }
                return;
            }
            this.e = Collections.emptyMap();
        }
    }

    public final long c() {
        return this.b.getLong("last-maintenance", 0);
    }

    public final out d(String str) {
        out out = (out) this.c.get(str);
        if (out != null) {
            return out;
        }
        out out2 = out.n;
        this.c.put(str, out2);
        return out2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String e(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.g
            monitor-enter(r0)
            out r3 = r2.c(r3)     // Catch:{ all -> 0x0018 }
            if (r3 == 0) goto L_0x0015
            java.lang.String r1 = r3.b     // Catch:{ all -> 0x0018 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0018 }
            if (r1 != 0) goto L_0x0015
            java.lang.String r3 = r3.b     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return r3
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            r3 = 0
            return r3
        L_0x0018:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prp.e(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0016, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String f(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.g
            monitor-enter(r0)
            out r3 = r2.c(r3)     // Catch:{ all -> 0x0018 }
            if (r3 == 0) goto L_0x0015
            java.lang.String r1 = r3.f     // Catch:{ all -> 0x0018 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0018 }
            if (r1 != 0) goto L_0x0015
            java.lang.String r3 = r3.f     // Catch:{ all -> 0x0018 }
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            return r3
        L_0x0015:
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            r3 = 0
            return r3
        L_0x0018:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0018 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prp.f(java.lang.String):java.lang.String");
    }

    public final void g() {
        synchronized (this.g) {
            this.b.edit().putString("current-os-build-id", Build.ID).apply();
        }
    }

    public final Set h() {
        opr opr = (opr) plc.a(this.b.getString("known-accounts", (String) null), (auef) opr.b.c(7));
        HashSet hashSet = new HashSet(opr.a.size());
        aucx aucx = opr.a;
        int size = aucx.size();
        for (int i2 = 0; i2 < size; i2++) {
            opq opq = (opq) aucx.get(i2);
            try {
                hashSet.add(new Account(opq.b, opq.c));
            } catch (IllegalArgumentException e2) {
                oso.c((Throwable) e2, "Skipping invalid account %s", opq);
            }
        }
        return hashSet;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo i(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.g
            monitor-enter(r0)
            out r3 = r2.c(r3)     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x001c
            int r1 = r3.a     // Catch:{ all -> 0x001f }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x001c
            otl r3 = r3.d     // Catch:{ all -> 0x001f }
            if (r3 == 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            otl r3 = defpackage.otl.j     // Catch:{ all -> 0x001f }
        L_0x0016:
            com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo r3 = defpackage.plc.a((defpackage.otl) r3)     // Catch:{ all -> 0x001f }
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            return r3
        L_0x001c:
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            r3 = 0
            return r3
        L_0x001f:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001f }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prp.i(java.lang.String):com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo");
    }

    public final int j(String str) {
        int i2;
        synchronized (this.g) {
            out c2 = c(str);
            i2 = c2 != null ? c2.e : 0;
        }
        return i2;
    }

    public final otn l(String str) {
        otn otn;
        synchronized (this.g) {
            out c2 = c(str);
            if (c2 != null) {
                otn = otn.a(c2.i);
                if (otn == null) {
                    otn = otn.UNSET;
                }
            } else {
                otn = otn.UNSET;
            }
        }
        return otn;
    }

    public final otn m(String str) {
        synchronized (this.g) {
            if (this.d != null) {
                int i2 = 0;
                while (i2 < this.d.b.size()) {
                    if (!plc.a((otl) this.d.a.get(i2)).b.equals(str)) {
                        i2++;
                    } else {
                        otn otn = (otn) ous.c.a(Integer.valueOf(this.d.b.c(i2)));
                        return otn;
                    }
                }
            }
            otn otn2 = otn.UNSET;
            return otn2;
        }
    }

    public final oq n(String str) {
        oq oqVar;
        synchronized (this.g) {
            out c2 = c(str);
            if (c2 == null) {
                oqVar = new oq(0, "");
            } else {
                oqVar = new oq(Integer.valueOf(c2.j), c2.k);
            }
        }
        return oqVar;
    }

    public final void o(String str) {
        synchronized (this.g) {
            out d2 = d(str);
            aucd aucd = (aucd) d2.c(5);
            aucd.a((aucj) d2);
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            out out = (out) aucd.b;
            out out2 = out.n;
            int i2 = out.a & -257;
            out.a = i2;
            out.j = 0;
            out.a = i2 & -513;
            out.k = out.n.k;
            a(str, (out) aucd.i());
        }
    }

    public final long p(String str) {
        long j;
        synchronized (this.g) {
            out c2 = c(str);
            j = c2 != null ? c2.m : 0;
        }
        return j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x038d, code lost:
        r0 = new java.util.HashMap();
        defpackage.prr.a(r1.c, r0);
        r1 = r1.c.edit();
        r0 = r0.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x03a9, code lost:
        if (r0.hasNext() == false) goto L_0x03e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x03ab, code lost:
        r2 = (java.util.Map.Entry) r0.next();
        r3 = (defpackage.out) r2.getValue();
        r5 = (defpackage.aucd) r3.c(5);
        r5.a((defpackage.aucj) r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x03c3, code lost:
        if (r5.c != false) goto L_0x03c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03c6, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x03cc, code lost:
        defpackage.out.b((defpackage.out) r5.b);
        defpackage.prr.a(r1, (java.lang.String) r2.getKey(), (defpackage.out) r5.i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x03e3, code lost:
        r1.commit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x03e6, code lost:
        r1.c.edit().putLong("last-maintenance", java.lang.System.currentTimeMillis()).commit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x03f9, code lost:
        r0 = java.lang.System.currentTimeMillis();
        r2 = new java.util.HashMap();
        defpackage.prr.a(r1.c, r2);
        r3 = r1.c.edit();
        r2 = r2.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0419, code lost:
        if (r2.hasNext() == false) goto L_0x0467;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x041b, code lost:
        r4 = (java.util.Map.Entry) r2.next();
        r5 = (defpackage.out) r4.getValue();
        r7 = (defpackage.aucd) r5.c(5);
        r7.a((defpackage.aucj) r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x043b, code lost:
        if (((defpackage.out) r7.b).h == 0) goto L_0x043e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0440, code lost:
        if (r7.c != false) goto L_0x0443;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0443, code lost:
        r7.c();
        r7.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0449, code lost:
        r5 = (defpackage.out) r7.b;
        r6 = defpackage.out.n;
        r5.a |= 64;
        r5.h = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0457, code lost:
        defpackage.prr.a(r3, (java.lang.String) r4.getKey(), (defpackage.out) r7.i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0467, code lost:
        r3.commit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x046a, code lost:
        r0 = new java.util.HashMap();
        defpackage.prr.a(r1.c, r0);
        r1 = r1.c.edit();
        r2 = r0.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0486, code lost:
        if (r2.hasNext() == false) goto L_0x04de;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0488, code lost:
        r3 = (java.util.Map.Entry) r2.next();
        r0 = (defpackage.out) r3.getValue();
        r5 = (defpackage.aucd) r0.c(5);
        r5.a((defpackage.aucj) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:?, code lost:
        r0 = r1.a.getPackageManager().getPackageInfo((java.lang.String) r3.getKey(), 0).versionCode;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x04b4, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x04de, code lost:
        r1.commit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x04e1, code lost:
        r0 = new java.util.HashMap();
        defpackage.prr.a(r1.c, r0);
        r1 = r1.c.edit();
        r2 = r0.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x04fd, code lost:
        if (r2.hasNext() == false) goto L_0x0573;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x04ff, code lost:
        r3 = (java.util.Map.Entry) r2.next();
        r0 = (defpackage.out) r3.getValue();
        r5 = (defpackage.aucd) r0.c(5);
        r5.a((defpackage.aucj) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        r0 = defpackage.jhg.e(r1.a, (java.lang.String) r3.getKey());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0522, code lost:
        if (r0 != null) goto L_0x0526;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0528, code lost:
        if (r5.c != false) goto L_0x052b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x052b, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0531, code lost:
        r6 = (defpackage.out) r5.b;
        r7 = defpackage.out.n;
        r0.getClass();
        r6.a |= 512;
        r6.k = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0547, code lost:
        if (r5.c == false) goto L_0x0549;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x054b, code lost:
        r5.c();
        r5.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0551, code lost:
        r0 = (defpackage.out) r5.b;
        r7 = defpackage.out.n;
        r0.a &= -513;
        r0.k = defpackage.out.n.k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0573, code lost:
        r1.commit();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0576, code lost:
        r20.edit().putInt(r19, 7).commit();
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x012f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public prp(android.content.Context r22, java.lang.String r23) {
        /*
            r21 = this;
            r7 = r21
            r21.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r7.g = r0
            r0 = r22
            r7.a = r0
            r0 = r23
            r7.i = r0
            java.lang.String r0 = "-icing-settings"
            android.content.SharedPreferences r8 = r7.b(r0)
            java.lang.String r9 = "settings-version"
            r10 = 0
            int r5 = r8.getInt(r9, r10)
            r11 = 7
            if (r5 == r11) goto L_0x0585
            prt r12 = new prt
            android.content.Context r2 = r7.a
            java.lang.String r6 = r7.i
            r1 = r12
            r3 = r21
            r4 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            int r0 = r12.d
            switch(r0) {
                case 0: goto L_0x005a;
                case 1: goto L_0x0054;
                case 2: goto L_0x004e;
                case 3: goto L_0x0048;
                case 4: goto L_0x0042;
                case 5: goto L_0x003c;
                case 6: goto L_0x003c;
                default: goto L_0x0036;
            }
        L_0x0036:
            r20 = r8
            r19 = r9
            goto L_0x0576
        L_0x003c:
            r20 = r8
            r19 = r9
            goto L_0x04e1
        L_0x0042:
            r20 = r8
            r19 = r9
            goto L_0x046a
        L_0x0048:
            r20 = r8
            r19 = r9
            goto L_0x03f9
        L_0x004e:
            r20 = r8
            r19 = r9
            goto L_0x03e6
        L_0x0054:
            r20 = r8
            r19 = r9
            goto L_0x038d
        L_0x005a:
            prs r0 = r12.b
            java.lang.String r2 = "-version"
            android.content.SharedPreferences r0 = r0.b(r2)
            prs r3 = r12.b
            java.lang.String r4 = "-appauth"
            android.content.SharedPreferences r3 = r3.b(r4)
            prs r5 = r12.b
            java.lang.String r6 = "-blockedpackages"
            android.content.SharedPreferences r5 = r5.b(r6)
            prs r13 = r12.b
            java.lang.String r14 = "-universalsearch"
            android.content.SharedPreferences r13 = r13.b(r14)
            prs r15 = r12.b
            java.lang.String r11 = "-resourceparse"
            android.content.SharedPreferences r15 = r15.b(r11)
            boolean r16 = defpackage.prt.a((android.content.SharedPreferences) r0)
            if (r16 == 0) goto L_0x00a7
            boolean r16 = defpackage.prt.a((android.content.SharedPreferences) r3)
            if (r16 == 0) goto L_0x00a7
            boolean r16 = defpackage.prt.a((android.content.SharedPreferences) r5)
            if (r16 == 0) goto L_0x00a7
            boolean r16 = defpackage.prt.a((android.content.SharedPreferences) r13)
            if (r16 == 0) goto L_0x00a7
            boolean r16 = defpackage.prt.a((android.content.SharedPreferences) r15)
            if (r16 != 0) goto L_0x00a1
            goto L_0x00a7
        L_0x00a1:
            r20 = r8
            r19 = r9
            goto L_0x038d
        L_0x00a7:
            java.lang.String r16 = "Upgrading settings"
            defpackage.oso.c(r16)
            r1 = -1
            java.lang.String r10 = "version"
            int r1 = r0.getInt(r10, r1)
            java.util.Map r3 = r3.getAll()
            java.lang.String r0 = "blockedpackages"
            r10 = 0
            java.lang.String r0 = r5.getString(r0, r10)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            if (r0 == 0) goto L_0x00e5
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch:{ JSONException -> 0x00df }
            r10.<init>(r0)     // Catch:{ JSONException -> 0x00df }
            r0 = 0
        L_0x00cc:
            int r7 = r10.length()     // Catch:{ JSONException -> 0x00df }
            if (r0 < r7) goto L_0x00d3
            goto L_0x00e5
        L_0x00d3:
            java.lang.String r7 = r10.getString(r0)     // Catch:{ JSONException -> 0x00df }
            r5.add(r7)     // Catch:{ JSONException -> 0x00df }
            int r0 = r0 + 1
            r7 = r21
            goto L_0x00cc
        L_0x00df:
            r0 = move-exception
            java.lang.String r0 = "Upgrade: blocked packages list corrupted"
            defpackage.oso.b(r0)
        L_0x00e5:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Map r7 = r13.getAll()
            java.util.Collection r7 = r7.values()
            java.util.Iterator r7 = r7.iterator()
        L_0x00f6:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto L_0x0140
            java.lang.Object r10 = r7.next()
            java.lang.String r10 = (java.lang.String) r10
            if (r10 == 0) goto L_0x0133
            android.os.Parcel r13 = android.os.Parcel.obtain()     // Catch:{ all -> 0x012b }
            r18 = r7
            r7 = 0
            byte[] r10 = android.util.Base64.decode(r10, r7)     // Catch:{ all -> 0x0128 }
            int r7 = r10.length     // Catch:{ all -> 0x0128 }
            r19 = r9
            r9 = 0
            r13.unmarshall(r10, r9, r7)     // Catch:{ all -> 0x0128 }
            r13.setDataPosition(r9)     // Catch:{ all -> 0x0128 }
            android.os.Parcelable$Creator r7 = com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo.CREATOR     // Catch:{ all -> 0x0128 }
            java.lang.Object r7 = r7.createFromParcel(r13)     // Catch:{ all -> 0x0128 }
            com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo r7 = (com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo) r7     // Catch:{ all -> 0x0128 }
            if (r13 != 0) goto L_0x0124
            goto L_0x0138
        L_0x0124:
            r13.recycle()
            goto L_0x0138
        L_0x0128:
            r0 = move-exception
            r10 = r13
            goto L_0x012d
        L_0x012b:
            r0 = move-exception
            r10 = 0
        L_0x012d:
            if (r10 == 0) goto L_0x0132
            r10.recycle()
        L_0x0132:
            throw r0
        L_0x0133:
            r18 = r7
            r19 = r9
            r7 = 0
        L_0x0138:
            r0.add(r7)
            r7 = r18
            r9 = r19
            goto L_0x00f6
        L_0x0140:
            r19 = r9
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.util.Map r10 = r15.getAll()
            java.util.Set r10 = r10.keySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x0158:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L_0x01a9
            java.lang.Object r13 = r10.next()
            java.lang.String r13 = (java.lang.String) r13
            r18 = r10
            java.lang.String r10 = "gsai-src-"
            boolean r10 = r13.startsWith(r10)
            if (r10 == 0) goto L_0x0187
            r10 = 9
            java.lang.String r10 = r13.substring(r10)
            r20 = r8
            r8 = 0
            int r13 = r15.getInt(r13, r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r13)
            r7.put(r10, r8)
            r10 = r18
            r8 = r20
            goto L_0x0158
        L_0x0187:
            r20 = r8
            java.lang.String r8 = "fp-"
            boolean r8 = r13.startsWith(r8)
            if (r8 == 0) goto L_0x01a3
            r8 = 3
            java.lang.String r8 = r13.substring(r8)
            r10 = 0
            java.lang.String r13 = r15.getString(r13, r10)
            r9.put(r8, r13)
            r10 = r18
            r8 = r20
            goto L_0x0158
        L_0x01a3:
            r10 = 0
            r10 = r18
            r8 = r20
            goto L_0x0158
        L_0x01a9:
            r20 = r8
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r12.e = r8
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x01ba:
            boolean r8 = r3.hasNext()
            if (r8 == 0) goto L_0x0210
            java.lang.Object r8 = r3.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r10 = r8.getKey()
            java.lang.String r10 = (java.lang.String) r10
            out r10 = r12.a((java.lang.String) r10)
            r13 = 5
            java.lang.Object r15 = r10.c(r13)
            aucd r15 = (defpackage.aucd) r15
            r15.a((defpackage.aucj) r10)
            java.lang.Object r10 = r8.getValue()
            java.lang.String r10 = (java.lang.String) r10
            boolean r13 = r15.c
            if (r13 != 0) goto L_0x01e5
            goto L_0x01eb
        L_0x01e5:
            r15.c()
            r13 = 0
            r15.c = r13
        L_0x01eb:
            aucj r13 = r15.b
            out r13 = (defpackage.out) r13
            out r17 = defpackage.out.n
            r10.getClass()
            r17 = r3
            int r3 = r13.a
            r3 = r3 | 1
            r13.a = r3
            r13.b = r10
            aucj r3 = r15.i()
            out r3 = (defpackage.out) r3
            java.lang.Object r8 = r8.getKey()
            java.lang.String r8 = (java.lang.String) r8
            r12.a(r8, r3)
            r3 = r17
            goto L_0x01ba
        L_0x0210:
            java.util.Iterator r3 = r5.iterator()
        L_0x0214:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x024a
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            out r8 = r12.a((java.lang.String) r5)
            r10 = 5
            java.lang.Object r13 = r8.c(r10)
            aucd r13 = (defpackage.aucd) r13
            r13.a((defpackage.aucj) r8)
            boolean r8 = r13.c
            if (r8 != 0) goto L_0x0233
            goto L_0x0239
        L_0x0233:
            r13.c()
            r8 = 0
            r13.c = r8
        L_0x0239:
            aucj r8 = r13.b
            out r8 = (defpackage.out) r8
            defpackage.out.a(r8)
            aucj r8 = r13.i()
            out r8 = (defpackage.out) r8
            r12.a(r5, r8)
            goto L_0x0214
        L_0x024a:
            int r3 = r0.size()
            r5 = 0
        L_0x024f:
            if (r5 >= r3) goto L_0x0295
            java.lang.Object r8 = r0.get(r5)
            com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo r8 = (com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo) r8
            java.lang.String r10 = r8.a
            out r10 = r12.a((java.lang.String) r10)
            r13 = 5
            java.lang.Object r15 = r10.c(r13)
            aucd r15 = (defpackage.aucd) r15
            r15.a((defpackage.aucj) r10)
            otl r10 = defpackage.plc.a((com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo) r8)
            boolean r13 = r15.c
            if (r13 != 0) goto L_0x0270
            goto L_0x0276
        L_0x0270:
            r15.c()
            r13 = 0
            r15.c = r13
        L_0x0276:
            aucj r13 = r15.b
            out r13 = (defpackage.out) r13
            out r17 = defpackage.out.n
            r10.getClass()
            r13.d = r10
            int r10 = r13.a
            r10 = r10 | 4
            r13.a = r10
            aucj r10 = r15.i()
            out r10 = (defpackage.out) r10
            java.lang.String r8 = r8.a
            r12.a(r8, r10)
            int r5 = r5 + 1
            goto L_0x024f
        L_0x0295:
            java.util.Set r0 = r7.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x029d:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x02f0
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r5 = r3.getKey()
            java.lang.String r5 = (java.lang.String) r5
            out r5 = r12.a((java.lang.String) r5)
            r7 = 5
            java.lang.Object r8 = r5.c(r7)
            aucd r8 = (defpackage.aucd) r8
            r8.a((defpackage.aucj) r5)
            java.lang.Object r5 = r3.getValue()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            boolean r7 = r8.c
            if (r7 != 0) goto L_0x02cc
            goto L_0x02d2
        L_0x02cc:
            r8.c()
            r7 = 0
            r8.c = r7
        L_0x02d2:
            aucj r7 = r8.b
            out r7 = (defpackage.out) r7
            out r10 = defpackage.out.n
            int r10 = r7.a
            r10 = r10 | 8
            r7.a = r10
            r7.e = r5
            aucj r5 = r8.i()
            out r5 = (defpackage.out) r5
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r12.a(r3, r5)
            goto L_0x029d
        L_0x02f0:
            java.util.Set r0 = r9.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x02f8:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x034a
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r5 = r3.getKey()
            java.lang.String r5 = (java.lang.String) r5
            out r5 = r12.a((java.lang.String) r5)
            r7 = 5
            java.lang.Object r8 = r5.c(r7)
            aucd r8 = (defpackage.aucd) r8
            r8.a((defpackage.aucj) r5)
            java.lang.Object r5 = r3.getValue()
            java.lang.String r5 = (java.lang.String) r5
            boolean r7 = r8.c
            if (r7 != 0) goto L_0x0323
            goto L_0x0329
        L_0x0323:
            r8.c()
            r7 = 0
            r8.c = r7
        L_0x0329:
            aucj r7 = r8.b
            out r7 = (defpackage.out) r7
            out r9 = defpackage.out.n
            r5.getClass()
            int r9 = r7.a
            r9 = r9 | 16
            r7.a = r9
            r7.f = r5
            aucj r5 = r8.i()
            out r5 = (defpackage.out) r5
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            r12.a(r3, r5)
            goto L_0x02f8
        L_0x034a:
            android.content.SharedPreferences r0 = r12.c
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r3 = "index-version"
            r0.putInt(r3, r1)
            java.util.Map r1 = r12.e
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x035f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x037b
            java.lang.Object r3 = r1.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r5 = r3.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r3 = r3.getValue()
            out r3 = (defpackage.out) r3
            defpackage.prr.a(r0, r5, r3)
            goto L_0x035f
        L_0x037b:
            r0.commit()
            r12.b(r2)
            r12.b(r4)
            r12.b(r6)
            r12.b(r14)
            r12.b(r11)
        L_0x038d:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            android.content.SharedPreferences r1 = r12.c
            defpackage.prr.a(r1, r0)
            android.content.SharedPreferences r1 = r12.c
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x03a5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x03e3
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            out r3 = (defpackage.out) r3
            r4 = 5
            java.lang.Object r5 = r3.c(r4)
            aucd r5 = (defpackage.aucd) r5
            r5.a((defpackage.aucj) r3)
            boolean r3 = r5.c
            if (r3 != 0) goto L_0x03c6
            goto L_0x03cc
        L_0x03c6:
            r5.c()
            r3 = 0
            r5.c = r3
        L_0x03cc:
            aucj r3 = r5.b
            out r3 = (defpackage.out) r3
            defpackage.out.b(r3)
            aucj r3 = r5.i()
            out r3 = (defpackage.out) r3
            java.lang.Object r2 = r2.getKey()
            java.lang.String r2 = (java.lang.String) r2
            defpackage.prr.a(r1, r2, r3)
            goto L_0x03a5
        L_0x03e3:
            r1.commit()
        L_0x03e6:
            android.content.SharedPreferences r0 = r12.c
            android.content.SharedPreferences$Editor r0 = r0.edit()
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.String r3 = "last-maintenance"
            android.content.SharedPreferences$Editor r0 = r0.putLong(r3, r1)
            r0.commit()
        L_0x03f9:
            long r0 = java.lang.System.currentTimeMillis()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            android.content.SharedPreferences r3 = r12.c
            defpackage.prr.a(r3, r2)
            android.content.SharedPreferences r3 = r12.c
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x0415:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0467
            java.lang.Object r4 = r2.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getValue()
            out r5 = (defpackage.out) r5
            r6 = 5
            java.lang.Object r7 = r5.c(r6)
            aucd r7 = (defpackage.aucd) r7
            r7.a((defpackage.aucj) r5)
            aucj r5 = r7.b
            out r5 = (defpackage.out) r5
            long r5 = r5.h
            r8 = 0
            int r10 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r10 == 0) goto L_0x043e
            goto L_0x0457
        L_0x043e:
            boolean r5 = r7.c
            if (r5 != 0) goto L_0x0443
            goto L_0x0449
        L_0x0443:
            r7.c()
            r5 = 0
            r7.c = r5
        L_0x0449:
            aucj r5 = r7.b
            out r5 = (defpackage.out) r5
            out r6 = defpackage.out.n
            int r6 = r5.a
            r6 = r6 | 64
            r5.a = r6
            r5.h = r0
        L_0x0457:
            java.lang.Object r4 = r4.getKey()
            java.lang.String r4 = (java.lang.String) r4
            aucj r5 = r7.i()
            out r5 = (defpackage.out) r5
            defpackage.prr.a(r3, r4, r5)
            goto L_0x0415
        L_0x0467:
            r3.commit()
        L_0x046a:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            android.content.SharedPreferences r1 = r12.c
            defpackage.prr.a(r1, r0)
            android.content.SharedPreferences r1 = r12.c
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x0482:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x04de
            java.lang.Object r0 = r2.next()
            r3 = r0
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getValue()
            out r0 = (defpackage.out) r0
            r4 = 5
            java.lang.Object r5 = r0.c(r4)
            aucd r5 = (defpackage.aucd) r5
            r5.a((defpackage.aucj) r0)
            java.lang.Object r0 = r3.getKey()
            java.lang.String r0 = (java.lang.String) r0
            android.content.Context r4 = r12.a
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            r6 = 0
            android.content.pm.PackageInfo r0 = r4.getPackageInfo(r0, r6)     // Catch:{ NameNotFoundException -> 0x04b3 }
            int r0 = r0.versionCode     // Catch:{ NameNotFoundException -> 0x04b3 }
            goto L_0x04b5
        L_0x04b3:
            r0 = move-exception
            r0 = 0
        L_0x04b5:
            boolean r4 = r5.c
            if (r4 != 0) goto L_0x04ba
            goto L_0x04c0
        L_0x04ba:
            r5.c()
            r4 = 0
            r5.c = r4
        L_0x04c0:
            aucj r4 = r5.b
            out r4 = (defpackage.out) r4
            out r6 = defpackage.out.n
            int r6 = r4.a
            r6 = r6 | 256(0x100, float:3.59E-43)
            r4.a = r6
            r4.j = r0
            aucj r0 = r5.i()
            out r0 = (defpackage.out) r0
            java.lang.Object r3 = r3.getKey()
            java.lang.String r3 = (java.lang.String) r3
            defpackage.prr.a(r1, r3, r0)
            goto L_0x0482
        L_0x04de:
            r1.commit()
        L_0x04e1:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            android.content.SharedPreferences r1 = r12.c
            defpackage.prr.a(r1, r0)
            android.content.SharedPreferences r1 = r12.c
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x04f9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0573
            java.lang.Object r0 = r2.next()
            r3 = r0
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r0 = r3.getValue()
            out r0 = (defpackage.out) r0
            r4 = 5
            java.lang.Object r5 = r0.c(r4)
            aucd r5 = (defpackage.aucd) r5
            r5.a((defpackage.aucj) r0)
            android.content.Context r0 = r12.a     // Catch:{ NameNotFoundException -> 0x0544 }
            java.lang.Object r6 = r3.getKey()     // Catch:{ NameNotFoundException -> 0x0544 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ NameNotFoundException -> 0x0544 }
            java.lang.String r0 = defpackage.jhg.e(r0, r6)     // Catch:{ NameNotFoundException -> 0x0544 }
            if (r0 != 0) goto L_0x0526
            r6 = 0
            goto L_0x0563
        L_0x0526:
            boolean r6 = r5.c     // Catch:{ NameNotFoundException -> 0x0544 }
            if (r6 != 0) goto L_0x052b
            goto L_0x0531
        L_0x052b:
            r5.c()     // Catch:{ NameNotFoundException -> 0x0544 }
            r6 = 0
            r5.c = r6     // Catch:{ NameNotFoundException -> 0x0544 }
        L_0x0531:
            aucj r6 = r5.b     // Catch:{ NameNotFoundException -> 0x0544 }
            out r6 = (defpackage.out) r6     // Catch:{ NameNotFoundException -> 0x0544 }
            out r7 = defpackage.out.n     // Catch:{ NameNotFoundException -> 0x0544 }
            r0.getClass()     // Catch:{ NameNotFoundException -> 0x0544 }
            int r7 = r6.a     // Catch:{ NameNotFoundException -> 0x0544 }
            r7 = r7 | 512(0x200, float:7.175E-43)
            r6.a = r7     // Catch:{ NameNotFoundException -> 0x0544 }
            r6.k = r0     // Catch:{ NameNotFoundException -> 0x0544 }
            r6 = 0
            goto L_0x0563
        L_0x0544:
            r0 = move-exception
            boolean r0 = r5.c
            if (r0 != 0) goto L_0x054b
            r6 = 0
            goto L_0x0551
        L_0x054b:
            r5.c()
            r6 = 0
            r5.c = r6
        L_0x0551:
            aucj r0 = r5.b
            out r0 = (defpackage.out) r0
            out r7 = defpackage.out.n
            int r7 = r0.a
            r7 = r7 & -513(0xfffffffffffffdff, float:NaN)
            r0.a = r7
            out r7 = defpackage.out.n
            java.lang.String r7 = r7.k
            r0.k = r7
        L_0x0563:
            java.lang.Object r0 = r3.getKey()
            java.lang.String r0 = (java.lang.String) r0
            aucj r3 = r5.i()
            out r3 = (defpackage.out) r3
            defpackage.prr.a(r1, r0, r3)
            goto L_0x04f9
        L_0x0573:
            r1.commit()
        L_0x0576:
            android.content.SharedPreferences$Editor r0 = r20.edit()
            r2 = r19
            r1 = 7
            android.content.SharedPreferences$Editor r0 = r0.putInt(r2, r1)
            r0.commit()
            goto L_0x0587
        L_0x0585:
            r20 = r8
        L_0x0587:
            r1 = r21
            r2 = r20
            r1.b = r2
            r21.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.prp.<init>(android.content.Context, java.lang.String):void");
    }

    public static String a(String str) {
        String valueOf = String.valueOf(str);
        return valueOf.length() == 0 ? new String("app-params-recent-context-blacklist-") : "app-params-recent-context-blacklist-".concat(valueOf);
    }

    public final out c(String str) {
        return (out) this.c.get(str);
    }

    public final void g(String str) {
        synchronized (this.g) {
            out d2 = d(str);
            aucd aucd = (aucd) d2.c(5);
            aucd.a((aucj) d2);
            if (aucd != null) {
                if (aucd.c) {
                    aucd.c();
                    aucd.c = false;
                }
                out out = (out) aucd.b;
                out out2 = out.n;
                out.a &= -17;
                out.f = out.n.f;
                a(str, (out) aucd.i());
            }
        }
    }

    public final void j() {
        this.b.edit().putInt("index-version", 63).commit();
    }

    public final void a() {
        synchronized (this.g) {
            this.c = new HashMap();
            String string = this.b.getString("gmscore-info", (String) null);
            if (string != null) {
                this.d = (ous) plc.a(string, (auef) ous.d.c(7));
            }
            prr.a(this.b, this.c);
            this.e = Collections.emptyMap();
            this.f = h;
            k();
        }
    }

    public final pro d() {
        pro pro;
        synchronized (this.g) {
            pro = new pro(this);
        }
        return pro;
    }

    public final int b() {
        return this.b.getInt("index-version", -1);
    }

    public final boolean e() {
        boolean contains;
        synchronized (this.g) {
            contains = this.b.contains("app-params-last-update-sched");
        }
        return contains;
    }

    public final boolean f() {
        boolean z;
        synchronized (this.g) {
            z = this.b.getBoolean("app-history-upload-pending", false);
        }
        return z;
    }

    public final SharedPreferences b(String str) {
        Context context = this.a;
        String valueOf = String.valueOf(this.i);
        return context.getSharedPreferences(str.length() == 0 ? new String(valueOf) : valueOf.concat(str), 4);
    }

    public final Set i() {
        HashSet hashSet = new HashSet();
        synchronized (this.g) {
            ous ous = this.d;
            if (ous != null) {
                for (otl a2 : ous.a) {
                    hashSet.add(plc.a(a2));
                }
            }
        }
        return hashSet;
    }

    public final boolean h(String str) {
        boolean z;
        synchronized (this.g) {
            out c2 = c(str);
            z = false;
            if (c2 != null && c2.c) {
                z = true;
            }
        }
        return z;
    }

    public final long k(String str) {
        long j;
        synchronized (this.g) {
            out c2 = c(str);
            j = c2 != null ? c2.h : 0;
        }
        return j;
    }

    public final void a(String str, out out) {
        this.c.put(str, out);
        SharedPreferences.Editor edit = this.b.edit();
        boolean a2 = prr.a(edit, str, out);
        edit.commit();
        if (!a2) {
            this.c.remove(str);
        }
    }

    public final void a(ous ous) {
        SharedPreferences.Editor edit = this.b.edit();
        if (ous == null || ous.a.size() == 0) {
            edit.remove("gmscore-info").commit();
        } else {
            edit.putString("gmscore-info", plc.a((audx) ous)).commit();
        }
    }

    public final void a(pqr pqr) {
        synchronized (this.g) {
            SharedPreferences.Editor edit = this.b.edit();
            for (String next : this.b.getAll().keySet()) {
                if (next.startsWith("app-params-recent-context-blacklist-")) {
                    edit.remove(next);
                }
            }
            for (pqq pqq : pqr.a) {
                if (pqq.c) {
                    String valueOf = String.valueOf(pqq.a);
                    edit.putBoolean(valueOf.length() == 0 ? new String("app-params-recent-context-blacklist-") : "app-params-recent-context-blacklist-".concat(valueOf), true);
                }
            }
            edit.putString("app-params", plc.a((audx) pqr)).putLong("app-params-last-update", System.currentTimeMillis()).remove("app-params-last-update-sched").apply();
            k();
        }
    }

    public final void a(boolean z) {
        this.b.edit().putBoolean("predefined-typeconfigs-update-in-progress", z).commit();
    }
}
