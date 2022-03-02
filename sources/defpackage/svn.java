package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: svn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class svn extends syx implements spf {
    public final Map a = new nz();
    public final Map b = new nz();
    public final Map c = new nz();
    private final Map d = new nz();
    private final Map e = new nz();
    private final Map f = new nz();

    public svn(sze sze) {
        super(sze);
    }

    private static final Map a(szv szv) {
        nz nzVar = new nz();
        if (szv != null) {
            aucx aucx = szv.d;
            int size = aucx.size();
            for (int i = 0; i < size; i++) {
                szw szw = (szw) aucx.get(i);
                nzVar.put(szw.a, szw.b);
            }
        }
        return nzVar;
    }

    /* access modifiers changed from: protected */
    public final boolean a() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final szv b(String str) {
        q();
        h();
        iva.c(str);
        a(str);
        return (szv) this.a.get(str);
    }

    /* access modifiers changed from: protected */
    public final void c(String str) {
        h();
        this.c.put(str, (Object) null);
    }

    /* access modifiers changed from: package-private */
    public final boolean d(String str) {
        h();
        szv b2 = b(str);
        if (b2 != null) {
            return b2.g;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean e(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_internal"));
    }

    /* access modifiers changed from: package-private */
    public final boolean f(String str) {
        return "1".equals(a(str, "measurement.upload.blacklist_public"));
    }

    /* access modifiers changed from: package-private */
    public final boolean c(String str, String str2) {
        Boolean bool;
        h();
        a(str);
        if ("ecommerce_purchase".equals(str2)) {
            return true;
        }
        if (ayij.b() && v().a(sud.aP) && ("purchase".equals(str2) || "refund".equals(str2))) {
            return true;
        }
        Map map = (Map) this.f.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    private final szv a(String str, byte[] bArr) {
        Long l;
        if (bArr == null) {
            return szv.h;
        }
        try {
            szv szv = (szv) ((aucd) szg.a((audw) szv.h.o(), bArr)).i();
            sur sur = E().k;
            String str2 = null;
            if ((szv.a & 1) != 0) {
                l = Long.valueOf(szv.b);
            } else {
                l = null;
            }
            if ((szv.a & 2) != 0) {
                str2 = szv.c;
            }
            sur.a("Parsed config. version, gmp_app_id", l, str2);
            return szv;
        } catch (auda e2) {
            E().f.a("Unable to merge remote config. appId", sut.a(str), e2);
            return szv.h;
        } catch (RuntimeException e3) {
            E().f.a("Unable to merge remote config. appId", sut.a(str), e3);
            return szv.h;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b(String str, String str2) {
        Boolean bool;
        h();
        a(str);
        if (e(str) && szj.f(str2)) {
            return true;
        }
        if (f(str) && szj.a(str2)) {
            return true;
        }
        Map map = (Map) this.e.get(str);
        if (map == null || (bool = (Boolean) map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    private final void a(String str, aucd aucd) {
        nz nzVar = new nz();
        nz nzVar2 = new nz();
        nz nzVar3 = new nz();
        if (aucd != null) {
            for (int i = 0; i < ((szv) aucd.b).e.size(); i++) {
                szu szu = (szu) ((szv) aucd.b).e.get(i);
                aucd aucd2 = (aucd) szu.c(5);
                aucd2.a((aucj) szu);
                if (!TextUtils.isEmpty(((szu) aucd2.b).b)) {
                    String a2 = swp.a(((szu) aucd2.b).b);
                    if (!TextUtils.isEmpty(a2)) {
                        if (aucd2.c) {
                            aucd2.c();
                            aucd2.c = false;
                        }
                        szu szu2 = (szu) aucd2.b;
                        szu szu3 = szu.f;
                        a2.getClass();
                        szu2.a |= 1;
                        szu2.b = a2;
                        if (aucd.c) {
                            aucd.c();
                            aucd.c = false;
                        }
                        szv szv = (szv) aucd.b;
                        szu szu4 = (szu) aucd2.i();
                        szv szv2 = szv.h;
                        szu4.getClass();
                        if (!szv.e.a()) {
                            szv.e = aucj.a(szv.e);
                        }
                        szv.e.set(i, szu4);
                    }
                    szu szu5 = (szu) aucd2.b;
                    nzVar.put(szu5.b, Boolean.valueOf(szu5.c));
                    szu szu6 = (szu) aucd2.b;
                    nzVar2.put(szu6.b, Boolean.valueOf(szu6.d));
                    szu szu7 = (szu) aucd2.b;
                    if ((szu7.a & 8) != 0) {
                        int i2 = szu7.e;
                        if (i2 >= 2 && i2 <= 65535) {
                            nzVar3.put(szu7.b, Integer.valueOf(i2));
                        } else {
                            sur sur = E().f;
                            szu szu8 = (szu) aucd2.b;
                            sur.a("Invalid sampling rate. Event name, sample rate", szu8.b, Integer.valueOf(szu8.e));
                        }
                    }
                } else {
                    E().f.a("EventConfig contained null event name");
                }
            }
        }
        this.e.put(str, nzVar);
        this.f.put(str, nzVar2);
        this.b.put(str, nzVar3);
    }

    public final String a(String str, String str2) {
        h();
        a(str);
        Map map = (Map) this.d.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005f, code lost:
        if (r2 != null) goto L_0x007b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.String r12) {
        /*
            r11 = this;
            r11.q()
            r11.h()
            defpackage.iva.c(r12)
            java.util.Map r0 = r11.a
            java.lang.Object r0 = r0.get(r12)
            if (r0 != 0) goto L_0x00db
            spj r0 = r11.n()
            defpackage.iva.c(r12)
            r0.h()
            r0.q()
            r1 = 0
            android.database.sqlite.SQLiteDatabase r2 = r0.e()     // Catch:{ SQLiteException -> 0x0067, all -> 0x0065 }
            r3 = 1
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0067, all -> 0x0065 }
            java.lang.String r5 = "remote_config"
            r10 = 0
            r4[r10] = r5     // Catch:{ SQLiteException -> 0x0067, all -> 0x0065 }
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ SQLiteException -> 0x0067, all -> 0x0065 }
            r6[r10] = r12     // Catch:{ SQLiteException -> 0x0067, all -> 0x0065 }
            java.lang.String r3 = "apps"
            java.lang.String r5 = "app_id=?"
            r7 = 0
            r8 = 0
            r9 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ SQLiteException -> 0x0067, all -> 0x0065 }
            boolean r3 = r2.moveToFirst()     // Catch:{ SQLiteException -> 0x0063 }
            if (r3 == 0) goto L_0x005f
            byte[] r3 = r2.getBlob(r10)     // Catch:{ SQLiteException -> 0x0063 }
            boolean r4 = r2.moveToNext()     // Catch:{ SQLiteException -> 0x0063 }
            if (r4 == 0) goto L_0x0059
            sut r4 = r0.E()     // Catch:{ SQLiteException -> 0x0063 }
            sur r4 = r4.c     // Catch:{ SQLiteException -> 0x0063 }
            java.lang.String r5 = "Got multiple records for app config, expected one. appId"
            java.lang.Object r6 = defpackage.sut.a((java.lang.String) r12)     // Catch:{ SQLiteException -> 0x0063 }
            r4.a(r5, r6)     // Catch:{ SQLiteException -> 0x0063 }
        L_0x0059:
            if (r2 == 0) goto L_0x0081
            r2.close()
            goto L_0x0081
        L_0x005f:
            if (r2 == 0) goto L_0x0062
            goto L_0x007b
        L_0x0062:
            goto L_0x007e
        L_0x0063:
            r3 = move-exception
            goto L_0x006a
        L_0x0065:
            r12 = move-exception
            goto L_0x00d5
        L_0x0067:
            r2 = move-exception
            r3 = r2
            r2 = r1
        L_0x006a:
            sut r0 = r0.E()     // Catch:{ all -> 0x00d3 }
            sur r0 = r0.c     // Catch:{ all -> 0x00d3 }
            java.lang.String r4 = "Error querying remote config. appId"
            java.lang.Object r5 = defpackage.sut.a((java.lang.String) r12)     // Catch:{ all -> 0x00d3 }
            r0.a(r4, r5, r3)     // Catch:{ all -> 0x00d3 }
            if (r2 == 0) goto L_0x0080
        L_0x007b:
            r2.close()
        L_0x007e:
            r3 = r1
            goto L_0x0081
        L_0x0080:
            r3 = r1
        L_0x0081:
            if (r3 == 0) goto L_0x00b4
            szv r0 = r11.a((java.lang.String) r12, (byte[]) r3)
            r2 = 5
            java.lang.Object r2 = r0.c(r2)
            aucd r2 = (defpackage.aucd) r2
            r2.a((defpackage.aucj) r0)
            r11.a((java.lang.String) r12, (defpackage.aucd) r2)
            java.util.Map r0 = r11.d
            aucj r3 = r2.i()
            szv r3 = (defpackage.szv) r3
            java.util.Map r3 = a((defpackage.szv) r3)
            r0.put(r12, r3)
            java.util.Map r0 = r11.a
            aucj r2 = r2.i()
            szv r2 = (defpackage.szv) r2
            r0.put(r12, r2)
            java.util.Map r0 = r11.c
            r0.put(r12, r1)
            return
        L_0x00b4:
            java.util.Map r0 = r11.d
            r0.put(r12, r1)
            java.util.Map r0 = r11.e
            r0.put(r12, r1)
            java.util.Map r0 = r11.f
            r0.put(r12, r1)
            java.util.Map r0 = r11.a
            r0.put(r12, r1)
            java.util.Map r0 = r11.c
            r0.put(r12, r1)
            java.util.Map r0 = r11.b
            r0.put(r12, r1)
            return
        L_0x00d3:
            r12 = move-exception
            r1 = r2
        L_0x00d5:
            if (r1 == 0) goto L_0x00da
            r1.close()
        L_0x00da:
            throw r12
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.svn.a(java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0482, code lost:
        r12 = r0.c.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x048c, code lost:
        if (r12.hasNext() == false) goto L_0x04b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0498, code lost:
        if ((((defpackage.szq) r12.next()).a & 1) != 0) goto L_0x0488;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x049a, code lost:
        r9.E().f.a("Property filter with no ID. Audience definition ignored. appId, audienceId", defpackage.sut.a(r28), java.lang.Integer.valueOf(r11));
        r19 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x04b1, code lost:
        r12 = r0.d.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x04bb, code lost:
        r21 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x04c7, code lost:
        if (r12.hasNext() == false) goto L_0x05a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:?, code lost:
        r13 = (defpackage.szl) r12.next();
        r9.q();
        r9.h();
        defpackage.iva.c(r28);
        defpackage.iva.a((java.lang.Object) r13);
        r22 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x04e3, code lost:
        if (android.text.TextUtils.isEmpty(r13.c) != false) goto L_0x0579;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x04e5, code lost:
        r8 = r13.k();
        r23 = r10;
        r10 = new android.content.ContentValues();
        r10.put("app_id", r2);
        r10.put("audience_id", java.lang.Integer.valueOf(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x04fe, code lost:
        if ((r13.a & 1) == 0) goto L_0x0507;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0500, code lost:
        r3 = java.lang.Integer.valueOf(r13.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0507, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0508, code lost:
        r10.put("filter_id", r3);
        r10.put("event_name", r13.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x051c, code lost:
        if (r9.v().b(r2, defpackage.sud.ad) == false) goto L_0x052f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0522, code lost:
        if ((r13.a & 64) == 0) goto L_0x052b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0524, code lost:
        r3 = java.lang.Boolean.valueOf(r13.h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x052b, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x052c, code lost:
        r10.put("session_scoped", r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x052f, code lost:
        r10.put("data", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0541, code lost:
        if (r9.e().insertWithOnConflict("event_filters", (java.lang.String) null, r10, 5) != -1) goto L_0x055c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0543, code lost:
        r9.E().c.a("Failed to insert event filter (got -1). appId", defpackage.sut.a(r28));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0552, code lost:
        r7 = r27;
        r3 = r21;
        r8 = r22;
        r10 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x055c, code lost:
        r7 = r27;
        r3 = r21;
        r8 = r22;
        r10 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0579, code lost:
        r23 = r10;
        r0 = r9.E().f;
        r6 = defpackage.sut.a(r28);
        r7 = java.lang.Integer.valueOf(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x058f, code lost:
        if ((r13.a & 1) == 0) goto L_0x059a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0591, code lost:
        r20 = java.lang.Integer.valueOf(r13.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x059a, code lost:
        r20 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x059c, code lost:
        r0.a("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r6, r7, java.lang.String.valueOf(r20));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x05a6, code lost:
        r22 = r8;
        r23 = r10;
        r0 = r0.c.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x05b4, code lost:
        if (r0.hasNext() == false) goto L_0x06b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x05b6, code lost:
        r8 = (defpackage.szq) r0.next();
        r9.q();
        r9.h();
        defpackage.iva.c(r28);
        defpackage.iva.a((java.lang.Object) r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x05ce, code lost:
        if (android.text.TextUtils.isEmpty(r8.c) != false) goto L_0x0658;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x05d0, code lost:
        r10 = r8.k();
        r12 = new android.content.ContentValues();
        r12.put("app_id", r2);
        r12.put("audience_id", java.lang.Integer.valueOf(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x05e9, code lost:
        if ((r8.a & 1) == 0) goto L_0x05f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x05eb, code lost:
        r13 = java.lang.Integer.valueOf(r8.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x05f2, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x05f3, code lost:
        r12.put("filter_id", r13);
        r24 = r0;
        r12.put("property_name", r8.c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0609, code lost:
        if (r9.v().b(r2, defpackage.sud.ad) == false) goto L_0x061c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x060f, code lost:
        if ((r8.a & 32) == 0) goto L_0x0618;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x0611, code lost:
        r0 = java.lang.Boolean.valueOf(r8.g);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x0618, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x0619, code lost:
        r12.put("session_scoped", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x061c, code lost:
        r12.put("data", r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x062e, code lost:
        if (r9.e().insertWithOnConflict("property_filters", (java.lang.String) null, r12, 5) != -1) goto L_0x0640;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0630, code lost:
        r9.E().c.a("Failed to insert property filter (got -1). appId", defpackage.sut.a(r28));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0640, code lost:
        r0 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0644, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0646, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:?, code lost:
        r9.E().c.a("Error storing property filter. appId", defpackage.sut.a(r28), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0658, code lost:
        r13 = null;
        r0 = r9.E().f;
        r6 = defpackage.sut.a(r28);
        r7 = java.lang.Integer.valueOf(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x066e, code lost:
        if ((r8.a & 1) == 0) goto L_0x0679;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0670, code lost:
        r13 = java.lang.Integer.valueOf(r8.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0679, code lost:
        r0.a("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r6, r7, java.lang.String.valueOf(r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0680, code lost:
        r9.q();
        r9.h();
        defpackage.iva.c(r28);
        r0 = r9.e();
        r3 = r17;
        r0.delete("property_filters", r3, new java.lang.String[]{r2, java.lang.String.valueOf(r11)});
        r0.delete("event_filters", r3, new java.lang.String[]{r2, java.lang.String.valueOf(r11)});
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x06af, code lost:
        r17 = r3;
        r3 = r21;
        r19 = r22;
        r10 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x06b9, code lost:
        r3 = r17;
        r3 = r21;
        r19 = r22;
        r10 = r23;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r28, byte[] r29, java.lang.String r30) {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            java.lang.String r3 = "app_id=? and audience_id=?"
            java.lang.String r0 = "app_id=?"
            java.lang.String r4 = "event_filters"
            java.lang.String r5 = "property_filters"
            r27.q()
            r27.h()
            defpackage.iva.c(r28)
            szv r6 = r27.a((java.lang.String) r28, (byte[]) r29)
            r7 = 5
            java.lang.Object r8 = r6.c(r7)
            aucd r8 = (defpackage.aucd) r8
            r8.a((defpackage.aucj) r6)
            if (r8 == 0) goto L_0x06cb
            r1.a((java.lang.String) r2, (defpackage.aucd) r8)
            java.util.Map r9 = r1.a
            aucj r10 = r8.i()
            szv r10 = (defpackage.szv) r10
            r9.put(r2, r10)
            java.util.Map r9 = r1.c
            r10 = r30
            r9.put(r2, r10)
            java.util.Map r9 = r1.d
            aucj r10 = r8.i()
            szv r10 = (defpackage.szv) r10
            java.util.Map r10 = a((defpackage.szv) r10)
            r9.put(r2, r10)
            spj r9 = r27.n()
            java.util.ArrayList r10 = new java.util.ArrayList
            aucj r11 = r8.b
            szv r11 = (defpackage.szv) r11
            aucx r11 = r11.f
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r10.<init>(r11)
            defpackage.iva.a((java.lang.Object) r10)
            r11 = 0
        L_0x0060:
            int r12 = r10.size()
            if (r11 >= r12) goto L_0x0255
            java.lang.Object r12 = r10.get(r11)
            szk r12 = (defpackage.szk) r12
            java.lang.Object r15 = r12.c(r7)
            aucd r15 = (defpackage.aucd) r15
            r15.a((defpackage.aucj) r12)
            aucj r12 = r15.b
            szk r12 = (defpackage.szk) r12
            aucx r12 = r12.d
            int r12 = r12.size()
            if (r12 != 0) goto L_0x0087
            r17 = r3
            r19 = r8
            goto L_0x01b5
        L_0x0087:
            r12 = 0
        L_0x0088:
            aucj r14 = r15.b
            szk r14 = (defpackage.szk) r14
            aucx r14 = r14.d
            int r14 = r14.size()
            if (r12 >= r14) goto L_0x01b1
            aucj r14 = r15.b
            szk r14 = (defpackage.szk) r14
            aucx r14 = r14.d
            java.lang.Object r14 = r14.get(r12)
            szl r14 = (defpackage.szl) r14
            java.lang.Object r16 = r14.c(r7)
            r7 = r16
            aucd r7 = (defpackage.aucd) r7
            r7.a((defpackage.aucj) r14)
            aucd r14 = r7.clone()
            aucj r13 = r7.b
            szl r13 = (defpackage.szl) r13
            java.lang.String r13 = r13.c
            java.lang.String r13 = defpackage.swp.a(r13)
            if (r13 == 0) goto L_0x00dd
            boolean r6 = r14.c
            if (r6 != 0) goto L_0x00c0
            goto L_0x00c6
        L_0x00c0:
            r14.c()
            r6 = 0
            r14.c = r6
        L_0x00c6:
            aucj r6 = r14.b
            szl r6 = (defpackage.szl) r6
            szl r17 = defpackage.szl.i
            r13.getClass()
            r17 = r3
            int r3 = r6.a
            r16 = 2
            r3 = r3 | 2
            r6.a = r3
            r6.c = r13
            r3 = 1
            goto L_0x00e0
        L_0x00dd:
            r17 = r3
            r3 = 0
        L_0x00e0:
            r6 = 0
        L_0x00e1:
            aucj r13 = r7.b
            szl r13 = (defpackage.szl) r13
            aucx r13 = r13.d
            int r13 = r13.size()
            if (r6 >= r13) goto L_0x0169
            aucj r13 = r7.b
            szl r13 = (defpackage.szl) r13
            aucx r13 = r13.d
            java.lang.Object r13 = r13.get(r6)
            szm r13 = (defpackage.szm) r13
            r18 = r7
            java.lang.String r7 = r13.e
            java.lang.String[] r1 = defpackage.swq.a
            r19 = r8
            java.lang.String[] r8 = defpackage.swq.b
            java.lang.String r1 = defpackage.sxj.a(r7, r1, r8)
            if (r1 == 0) goto L_0x015f
            r3 = 5
            java.lang.Object r7 = r13.c(r3)
            aucd r7 = (defpackage.aucd) r7
            r7.a((defpackage.aucj) r13)
            boolean r3 = r7.c
            if (r3 != 0) goto L_0x0118
            goto L_0x011e
        L_0x0118:
            r7.c()
            r3 = 0
            r7.c = r3
        L_0x011e:
            aucj r3 = r7.b
            szm r3 = (defpackage.szm) r3
            szm r8 = defpackage.szm.f
            r1.getClass()
            int r8 = r3.a
            r8 = r8 | 8
            r3.a = r8
            r3.e = r1
            aucj r1 = r7.i()
            szm r1 = (defpackage.szm) r1
            boolean r3 = r14.c
            if (r3 != 0) goto L_0x013a
            goto L_0x0140
        L_0x013a:
            r14.c()
            r3 = 0
            r14.c = r3
        L_0x0140:
            aucj r3 = r14.b
            szl r3 = (defpackage.szl) r3
            szl r7 = defpackage.szl.i
            r1.getClass()
            aucx r7 = r3.d
            boolean r7 = r7.a()
            if (r7 != 0) goto L_0x0159
            aucx r7 = r3.d
            aucx r7 = defpackage.aucj.a((defpackage.aucx) r7)
            r3.d = r7
        L_0x0159:
            aucx r3 = r3.d
            r3.set(r6, r1)
            r3 = 1
        L_0x015f:
            int r6 = r6 + 1
            r1 = r27
            r7 = r18
            r8 = r19
            goto L_0x00e1
        L_0x0169:
            r19 = r8
            if (r3 != 0) goto L_0x016e
            goto L_0x01a6
        L_0x016e:
            boolean r1 = r15.c
            if (r1 != 0) goto L_0x0173
            goto L_0x0179
        L_0x0173:
            r15.c()
            r1 = 0
            r15.c = r1
        L_0x0179:
            aucj r1 = r15.b
            szk r1 = (defpackage.szk) r1
            aucj r3 = r14.i()
            szl r3 = (defpackage.szl) r3
            szk r6 = defpackage.szk.e
            r3.getClass()
            aucx r6 = r1.d
            boolean r6 = r6.a()
            if (r6 != 0) goto L_0x0198
            aucx r6 = r1.d
            aucx r6 = defpackage.aucj.a((defpackage.aucx) r6)
            r1.d = r6
        L_0x0198:
            aucx r1 = r1.d
            r1.set(r12, r3)
            aucj r1 = r15.i()
            szk r1 = (defpackage.szk) r1
            r10.set(r11, r1)
        L_0x01a6:
            int r12 = r12 + 1
            r1 = r27
            r3 = r17
            r8 = r19
            r7 = 5
            goto L_0x0088
        L_0x01b1:
            r17 = r3
            r19 = r8
        L_0x01b5:
            aucj r1 = r15.b
            szk r1 = (defpackage.szk) r1
            aucx r1 = r1.c
            int r1 = r1.size()
            if (r1 != 0) goto L_0x01c3
            goto L_0x024a
        L_0x01c3:
            r1 = 0
        L_0x01c4:
            aucj r3 = r15.b
            szk r3 = (defpackage.szk) r3
            aucx r3 = r3.c
            int r3 = r3.size()
            if (r1 >= r3) goto L_0x024a
            aucj r3 = r15.b
            szk r3 = (defpackage.szk) r3
            aucx r3 = r3.c
            java.lang.Object r3 = r3.get(r1)
            szq r3 = (defpackage.szq) r3
            java.lang.String r6 = r3.c
            java.lang.String[] r7 = defpackage.swr.a
            java.lang.String[] r8 = defpackage.swr.b
            java.lang.String r6 = defpackage.sxj.a(r6, r7, r8)
            if (r6 == 0) goto L_0x0246
            r7 = 5
            java.lang.Object r8 = r3.c(r7)
            aucd r8 = (defpackage.aucd) r8
            r8.a((defpackage.aucj) r3)
            boolean r3 = r8.c
            if (r3 != 0) goto L_0x01f7
            goto L_0x01fd
        L_0x01f7:
            r8.c()
            r3 = 0
            r8.c = r3
        L_0x01fd:
            aucj r3 = r8.b
            szq r3 = (defpackage.szq) r3
            szq r7 = defpackage.szq.h
            r6.getClass()
            int r7 = r3.a
            r12 = 2
            r7 = r7 | r12
            r3.a = r7
            r3.c = r6
            boolean r3 = r15.c
            if (r3 != 0) goto L_0x0213
            goto L_0x0219
        L_0x0213:
            r15.c()
            r3 = 0
            r15.c = r3
        L_0x0219:
            aucj r3 = r15.b
            szk r3 = (defpackage.szk) r3
            aucj r6 = r8.i()
            szq r6 = (defpackage.szq) r6
            szk r7 = defpackage.szk.e
            r6.getClass()
            aucx r7 = r3.c
            boolean r7 = r7.a()
            if (r7 != 0) goto L_0x0238
            aucx r7 = r3.c
            aucx r7 = defpackage.aucj.a((defpackage.aucx) r7)
            r3.c = r7
        L_0x0238:
            aucx r3 = r3.c
            r3.set(r1, r6)
            aucj r3 = r15.i()
            szk r3 = (defpackage.szk) r3
            r10.set(r11, r3)
        L_0x0246:
            int r1 = r1 + 1
            goto L_0x01c4
        L_0x024a:
            int r11 = r11 + 1
            r1 = r27
            r3 = r17
            r8 = r19
            r7 = 5
            goto L_0x0060
        L_0x0255:
            r17 = r3
            r19 = r8
            r9.q()
            r9.h()
            defpackage.iva.c(r28)
            defpackage.iva.a((java.lang.Object) r10)
            android.database.sqlite.SQLiteDatabase r1 = r9.e()
            r1.beginTransaction()
            r9.q()     // Catch:{ all -> 0x06c6 }
            r9.h()     // Catch:{ all -> 0x06c6 }
            defpackage.iva.c(r28)     // Catch:{ all -> 0x06c6 }
            android.database.sqlite.SQLiteDatabase r3 = r9.e()     // Catch:{ all -> 0x06c6 }
            r6 = 1
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ all -> 0x06c6 }
            r6 = 0
            r7[r6] = r2     // Catch:{ all -> 0x06c6 }
            r3.delete(r5, r0, r7)     // Catch:{ all -> 0x06c6 }
            r6 = 1
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ all -> 0x06c6 }
            r6 = 0
            r7[r6] = r2     // Catch:{ all -> 0x06c6 }
            r3.delete(r4, r0, r7)     // Catch:{ all -> 0x06c6 }
            java.util.Iterator r3 = r10.iterator()     // Catch:{ all -> 0x06c6 }
        L_0x028f:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x06c6 }
            if (r0 != 0) goto L_0x0422
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x041d }
            r0.<init>()     // Catch:{ all -> 0x041d }
            java.util.Iterator r3 = r10.iterator()     // Catch:{ all -> 0x041d }
        L_0x029e:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x041d }
            if (r4 != 0) goto L_0x03fe
            defpackage.iva.c(r28)     // Catch:{ all -> 0x041d }
            r9.q()     // Catch:{ all -> 0x041d }
            r9.h()     // Catch:{ all -> 0x041d }
            android.database.sqlite.SQLiteDatabase r3 = r9.e()     // Catch:{ all -> 0x041d }
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x0352 }
            r4 = 0
            r5[r4] = r2     // Catch:{ SQLiteException -> 0x0352 }
            java.lang.String r4 = "select count(1) from audience_filter_values where app_id=?"
            long r4 = r9.a((java.lang.String) r4, (java.lang.String[]) r5)     // Catch:{ SQLiteException -> 0x0352 }
            spg r6 = r9.v()     // Catch:{ all -> 0x06c6 }
            r7 = 2000(0x7d0, float:2.803E-42)
            suc r8 = defpackage.sud.F     // Catch:{ all -> 0x06c6 }
            int r6 = r6.a((java.lang.String) r2, (defpackage.suc) r8)     // Catch:{ all -> 0x06c6 }
            int r6 = java.lang.Math.min(r7, r6)     // Catch:{ all -> 0x06c6 }
            r7 = 0
            int r6 = java.lang.Math.max(r7, r6)     // Catch:{ all -> 0x06c6 }
            long r7 = (long) r6     // Catch:{ all -> 0x06c6 }
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0362
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x06c6 }
            r4.<init>()     // Catch:{ all -> 0x06c6 }
            r5 = 0
        L_0x02dd:
            int r7 = r0.size()     // Catch:{ all -> 0x06c6 }
            if (r5 < r7) goto L_0x033c
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r4)     // Catch:{ all -> 0x06c6 }
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x06c6 }
            int r4 = r4.length()     // Catch:{ all -> 0x06c6 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x06c6 }
            r7 = 2
            int r4 = r4 + r7
            r5.<init>(r4)     // Catch:{ all -> 0x06c6 }
            java.lang.String r4 = "("
            r5.append(r4)     // Catch:{ all -> 0x06c6 }
            r5.append(r0)     // Catch:{ all -> 0x06c6 }
            java.lang.String r0 = ")"
            r5.append(r0)     // Catch:{ all -> 0x06c6 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x06c6 }
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x06c6 }
            int r4 = r4.length()     // Catch:{ all -> 0x06c6 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x06c6 }
            int r4 = r4 + 140
            r5.<init>(r4)     // Catch:{ all -> 0x06c6 }
            java.lang.String r4 = "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in "
            r5.append(r4)     // Catch:{ all -> 0x06c6 }
            r5.append(r0)     // Catch:{ all -> 0x06c6 }
            java.lang.String r0 = " order by rowid desc limit -1 offset ?)"
            r5.append(r0)     // Catch:{ all -> 0x06c6 }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x06c6 }
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]     // Catch:{ all -> 0x06c6 }
            r5 = 0
            r4[r5] = r2     // Catch:{ all -> 0x06c6 }
            java.lang.String r5 = java.lang.Integer.toString(r6)     // Catch:{ all -> 0x06c6 }
            r6 = 1
            r4[r6] = r5     // Catch:{ all -> 0x06c6 }
            java.lang.String r5 = "audience_filter_values"
            r3.delete(r5, r0, r4)     // Catch:{ all -> 0x06c6 }
            goto L_0x0362
        L_0x033c:
            java.lang.Object r7 = r0.get(r5)     // Catch:{ all -> 0x06c6 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x06c6 }
            if (r7 == 0) goto L_0x0362
            int r7 = r7.intValue()     // Catch:{ all -> 0x06c6 }
            java.lang.String r7 = java.lang.Integer.toString(r7)     // Catch:{ all -> 0x06c6 }
            r4.add(r7)     // Catch:{ all -> 0x06c6 }
            int r5 = r5 + 1
            goto L_0x02dd
        L_0x0352:
            r0 = move-exception
            sut r3 = r9.E()     // Catch:{ all -> 0x041d }
            sur r3 = r3.c     // Catch:{ all -> 0x041d }
            java.lang.String r4 = "Database error querying filters. appId"
            java.lang.Object r5 = defpackage.sut.a((java.lang.String) r28)     // Catch:{ all -> 0x041d }
            r3.a(r4, r5, r0)     // Catch:{ all -> 0x041d }
        L_0x0362:
            r1.setTransactionSuccessful()     // Catch:{ all -> 0x041d }
            r1.endTransaction()
            r8 = r19
            boolean r0 = r8.c     // Catch:{ RuntimeException -> 0x038c }
            if (r0 != 0) goto L_0x036f
            goto L_0x0375
        L_0x036f:
            r8.c()     // Catch:{ RuntimeException -> 0x038c }
            r1 = 0
            r8.c = r1     // Catch:{ RuntimeException -> 0x038c }
        L_0x0375:
            aucj r0 = r8.b     // Catch:{ RuntimeException -> 0x038c }
            szv r0 = (defpackage.szv) r0     // Catch:{ RuntimeException -> 0x038c }
            szv r1 = defpackage.szv.h     // Catch:{ RuntimeException -> 0x038c }
            aucx r1 = defpackage.aucj.s()     // Catch:{ RuntimeException -> 0x038c }
            r0.f = r1     // Catch:{ RuntimeException -> 0x038c }
            aucj r0 = r8.i()     // Catch:{ RuntimeException -> 0x038c }
            szv r0 = (defpackage.szv) r0     // Catch:{ RuntimeException -> 0x038c }
            byte[] r0 = r0.k()     // Catch:{ RuntimeException -> 0x038c }
            goto L_0x039e
        L_0x038c:
            r0 = move-exception
            sut r1 = r27.E()
            sur r1 = r1.f
            java.lang.Object r3 = defpackage.sut.a((java.lang.String) r28)
            java.lang.String r4 = "Unable to serialize reduced-size config. Storing full config instead. appId"
            r1.a(r4, r3, r0)
            r0 = r29
        L_0x039e:
            spj r1 = r27.n()
            defpackage.iva.c(r28)
            r1.h()
            r1.q()
            android.content.ContentValues r3 = new android.content.ContentValues
            r3.<init>()
            java.lang.String r4 = "remote_config"
            r3.put(r4, r0)
            android.database.sqlite.SQLiteDatabase r0 = r1.e()     // Catch:{ SQLiteException -> 0x03df }
            r4 = 1
            java.lang.String[] r5 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x03df }
            r4 = 0
            r5[r4] = r2     // Catch:{ SQLiteException -> 0x03df }
            java.lang.String r4 = "apps"
            java.lang.String r6 = "app_id = ?"
            int r0 = r0.update(r4, r3, r6, r5)     // Catch:{ SQLiteException -> 0x03df }
            long r3 = (long) r0     // Catch:{ SQLiteException -> 0x03df }
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x03cf
            goto L_0x03ef
        L_0x03cf:
            sut r0 = r1.E()     // Catch:{ SQLiteException -> 0x03df }
            sur r0 = r0.c     // Catch:{ SQLiteException -> 0x03df }
            java.lang.String r3 = "Failed to update remote config (got 0). appId"
            java.lang.Object r4 = defpackage.sut.a((java.lang.String) r28)     // Catch:{ SQLiteException -> 0x03df }
            r0.a(r3, r4)     // Catch:{ SQLiteException -> 0x03df }
            goto L_0x03ef
        L_0x03df:
            r0 = move-exception
            sut r1 = r1.E()
            sur r1 = r1.c
            java.lang.Object r3 = defpackage.sut.a((java.lang.String) r28)
            java.lang.String r4 = "Error storing remote config. appId"
            r1.a(r4, r3, r0)
        L_0x03ef:
            r7 = r27
            java.util.Map r0 = r7.a
            aucj r1 = r8.i()
            szv r1 = (defpackage.szv) r1
            r0.put(r2, r1)
            r1 = 1
            return r1
        L_0x03fe:
            r7 = r27
            r8 = r19
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x06c6 }
            szk r4 = (defpackage.szk) r4     // Catch:{ all -> 0x06c6 }
            int r5 = r4.a     // Catch:{ all -> 0x06c6 }
            r10 = 1
            r5 = r5 & r10
            if (r5 == 0) goto L_0x0415
            int r4 = r4.b     // Catch:{ all -> 0x06c6 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x06c6 }
            goto L_0x0416
        L_0x0415:
            r4 = 0
        L_0x0416:
            r0.add(r4)     // Catch:{ all -> 0x06c6 }
            r19 = r8
            goto L_0x029e
        L_0x041d:
            r0 = move-exception
            r7 = r27
            goto L_0x06c7
        L_0x0422:
            r7 = r27
            r8 = r19
            java.lang.Object r0 = r3.next()     // Catch:{ all -> 0x06c6 }
            szk r0 = (defpackage.szk) r0     // Catch:{ all -> 0x06c6 }
            r9.q()     // Catch:{ all -> 0x06c6 }
            r9.h()     // Catch:{ all -> 0x06c6 }
            defpackage.iva.c(r28)     // Catch:{ all -> 0x06c6 }
            defpackage.iva.a((java.lang.Object) r0)     // Catch:{ all -> 0x06c6 }
            int r11 = r0.a     // Catch:{ all -> 0x06c6 }
            r12 = 1
            r11 = r11 & r12
            if (r11 != 0) goto L_0x0451
            sut r0 = r9.E()     // Catch:{ all -> 0x06c6 }
            sur r0 = r0.f     // Catch:{ all -> 0x06c6 }
            java.lang.String r6 = "Audience with no ID. appId"
            java.lang.Object r11 = defpackage.sut.a((java.lang.String) r28)     // Catch:{ all -> 0x06c6 }
            r0.a(r6, r11)     // Catch:{ all -> 0x06c6 }
            r19 = r8
            goto L_0x028f
        L_0x0451:
            int r11 = r0.b     // Catch:{ all -> 0x06c6 }
            aucx r12 = r0.d     // Catch:{ all -> 0x06c6 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x06c6 }
        L_0x0459:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x06c6 }
            if (r13 == 0) goto L_0x0482
            java.lang.Object r13 = r12.next()     // Catch:{ all -> 0x06c6 }
            szl r13 = (defpackage.szl) r13     // Catch:{ all -> 0x06c6 }
            int r13 = r13.a     // Catch:{ all -> 0x06c6 }
            r14 = 1
            r13 = r13 & r14
            if (r13 != 0) goto L_0x0459
            sut r0 = r9.E()     // Catch:{ all -> 0x06c6 }
            sur r0 = r0.f     // Catch:{ all -> 0x06c6 }
            java.lang.String r6 = "Event filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r12 = defpackage.sut.a((java.lang.String) r28)     // Catch:{ all -> 0x06c6 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x06c6 }
            r0.a(r6, r12, r11)     // Catch:{ all -> 0x06c6 }
            r19 = r8
            goto L_0x028f
        L_0x0482:
            aucx r12 = r0.c     // Catch:{ all -> 0x06c6 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x06c6 }
        L_0x0488:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x06c6 }
            if (r13 == 0) goto L_0x04b1
            java.lang.Object r13 = r12.next()     // Catch:{ all -> 0x06c6 }
            szq r13 = (defpackage.szq) r13     // Catch:{ all -> 0x06c6 }
            int r13 = r13.a     // Catch:{ all -> 0x06c6 }
            r14 = 1
            r13 = r13 & r14
            if (r13 != 0) goto L_0x0488
            sut r0 = r9.E()     // Catch:{ all -> 0x06c6 }
            sur r0 = r0.f     // Catch:{ all -> 0x06c6 }
            java.lang.String r6 = "Property filter with no ID. Audience definition ignored. appId, audienceId"
            java.lang.Object r12 = defpackage.sut.a((java.lang.String) r28)     // Catch:{ all -> 0x06c6 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x06c6 }
            r0.a(r6, r12, r11)     // Catch:{ all -> 0x06c6 }
            r19 = r8
            goto L_0x028f
        L_0x04b1:
            aucx r12 = r0.d     // Catch:{ all -> 0x06c6 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x06c6 }
        L_0x04b7:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x06c6 }
            java.lang.String r14 = "session_scoped"
            java.lang.String r15 = "data"
            java.lang.String r6 = "filter_id"
            r21 = r3
            java.lang.String r3 = "audience_id"
            java.lang.String r7 = "app_id"
            if (r13 == 0) goto L_0x05a6
            java.lang.Object r13 = r12.next()     // Catch:{ all -> 0x06c6 }
            szl r13 = (defpackage.szl) r13     // Catch:{ all -> 0x06c6 }
            r9.q()     // Catch:{ all -> 0x06c6 }
            r9.h()     // Catch:{ all -> 0x06c6 }
            defpackage.iva.c(r28)     // Catch:{ all -> 0x06c6 }
            defpackage.iva.a((java.lang.Object) r13)     // Catch:{ all -> 0x06c6 }
            r22 = r8
            java.lang.String r8 = r13.c     // Catch:{ all -> 0x06c6 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ all -> 0x06c6 }
            if (r8 != 0) goto L_0x0579
            byte[] r8 = r13.k()     // Catch:{ all -> 0x06c6 }
            r23 = r10
            android.content.ContentValues r10 = new android.content.ContentValues     // Catch:{ all -> 0x06c6 }
            r10.<init>()     // Catch:{ all -> 0x06c6 }
            r10.put(r7, r2)     // Catch:{ all -> 0x06c6 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x06c6 }
            r10.put(r3, r7)     // Catch:{ all -> 0x06c6 }
            int r3 = r13.a     // Catch:{ all -> 0x06c6 }
            r7 = 1
            r3 = r3 & r7
            if (r3 == 0) goto L_0x0507
            int r3 = r13.b     // Catch:{ all -> 0x06c6 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x06c6 }
            goto L_0x0508
        L_0x0507:
            r3 = 0
        L_0x0508:
            r10.put(r6, r3)     // Catch:{ all -> 0x06c6 }
            java.lang.String r3 = "event_name"
            java.lang.String r6 = r13.c     // Catch:{ all -> 0x06c6 }
            r10.put(r3, r6)     // Catch:{ all -> 0x06c6 }
            spg r3 = r9.v()     // Catch:{ all -> 0x06c6 }
            suc r6 = defpackage.sud.ad     // Catch:{ all -> 0x06c6 }
            boolean r3 = r3.b(r2, r6)     // Catch:{ all -> 0x06c6 }
            if (r3 == 0) goto L_0x052f
            int r3 = r13.a     // Catch:{ all -> 0x06c6 }
            r3 = r3 & 64
            if (r3 == 0) goto L_0x052b
            boolean r3 = r13.h     // Catch:{ all -> 0x06c6 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x06c6 }
            goto L_0x052c
        L_0x052b:
            r3 = 0
        L_0x052c:
            r10.put(r14, r3)     // Catch:{ all -> 0x06c6 }
        L_0x052f:
            r10.put(r15, r8)     // Catch:{ all -> 0x06c6 }
            android.database.sqlite.SQLiteDatabase r3 = r9.e()     // Catch:{ SQLiteException -> 0x0566 }
            r6 = 5
            r7 = 0
            long r13 = r3.insertWithOnConflict(r4, r7, r10, r6)     // Catch:{ SQLiteException -> 0x0566 }
            r6 = -1
            int r3 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x055c
            sut r3 = r9.E()     // Catch:{ SQLiteException -> 0x0566 }
            sur r3 = r3.c     // Catch:{ SQLiteException -> 0x0566 }
            java.lang.String r6 = "Failed to insert event filter (got -1). appId"
            java.lang.Object r7 = defpackage.sut.a((java.lang.String) r28)     // Catch:{ SQLiteException -> 0x0566 }
            r3.a(r6, r7)     // Catch:{ SQLiteException -> 0x0566 }
            r7 = r27
            r3 = r21
            r8 = r22
            r10 = r23
            goto L_0x04b7
        L_0x055c:
            r7 = r27
            r3 = r21
            r8 = r22
            r10 = r23
            goto L_0x04b7
        L_0x0566:
            r0 = move-exception
            sut r3 = r9.E()     // Catch:{ all -> 0x06c6 }
            sur r3 = r3.c     // Catch:{ all -> 0x06c6 }
            java.lang.String r6 = "Error storing event filter. appId"
            java.lang.Object r7 = defpackage.sut.a((java.lang.String) r28)     // Catch:{ all -> 0x06c6 }
            r3.a(r6, r7, r0)     // Catch:{ all -> 0x06c6 }
            r10 = 5
            goto L_0x0680
        L_0x0579:
            r23 = r10
            sut r0 = r9.E()     // Catch:{ all -> 0x06c6 }
            sur r0 = r0.f     // Catch:{ all -> 0x06c6 }
            java.lang.String r3 = "Event filter had no event name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r6 = defpackage.sut.a((java.lang.String) r28)     // Catch:{ all -> 0x06c6 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x06c6 }
            int r8 = r13.a     // Catch:{ all -> 0x06c6 }
            r10 = 1
            r8 = r8 & r10
            if (r8 == 0) goto L_0x059a
            int r8 = r13.b     // Catch:{ all -> 0x06c6 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x06c6 }
            r20 = r8
            goto L_0x059c
        L_0x059a:
            r20 = 0
        L_0x059c:
            java.lang.String r8 = java.lang.String.valueOf(r20)     // Catch:{ all -> 0x06c6 }
            r0.a(r3, r6, r7, r8)     // Catch:{ all -> 0x06c6 }
            r10 = 5
            goto L_0x0680
        L_0x05a6:
            r22 = r8
            r23 = r10
            aucx r0 = r0.c     // Catch:{ all -> 0x06c6 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x06c6 }
        L_0x05b0:
            boolean r8 = r0.hasNext()     // Catch:{ all -> 0x06c6 }
            if (r8 == 0) goto L_0x06b9
            java.lang.Object r8 = r0.next()     // Catch:{ all -> 0x06c6 }
            szq r8 = (defpackage.szq) r8     // Catch:{ all -> 0x06c6 }
            r9.q()     // Catch:{ all -> 0x06c6 }
            r9.h()     // Catch:{ all -> 0x06c6 }
            defpackage.iva.c(r28)     // Catch:{ all -> 0x06c6 }
            defpackage.iva.a((java.lang.Object) r8)     // Catch:{ all -> 0x06c6 }
            java.lang.String r10 = r8.c     // Catch:{ all -> 0x06c6 }
            boolean r10 = android.text.TextUtils.isEmpty(r10)     // Catch:{ all -> 0x06c6 }
            if (r10 != 0) goto L_0x0658
            byte[] r10 = r8.k()     // Catch:{ all -> 0x06c6 }
            android.content.ContentValues r12 = new android.content.ContentValues     // Catch:{ all -> 0x06c6 }
            r12.<init>()     // Catch:{ all -> 0x06c6 }
            r12.put(r7, r2)     // Catch:{ all -> 0x06c6 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x06c6 }
            r12.put(r3, r13)     // Catch:{ all -> 0x06c6 }
            int r13 = r8.a     // Catch:{ all -> 0x06c6 }
            r24 = 1
            r13 = r13 & 1
            if (r13 == 0) goto L_0x05f2
            int r13 = r8.b     // Catch:{ all -> 0x06c6 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x06c6 }
            goto L_0x05f3
        L_0x05f2:
            r13 = 0
        L_0x05f3:
            r12.put(r6, r13)     // Catch:{ all -> 0x06c6 }
            java.lang.String r13 = "property_name"
            r24 = r0
            java.lang.String r0 = r8.c     // Catch:{ all -> 0x06c6 }
            r12.put(r13, r0)     // Catch:{ all -> 0x06c6 }
            spg r0 = r9.v()     // Catch:{ all -> 0x06c6 }
            suc r13 = defpackage.sud.ad     // Catch:{ all -> 0x06c6 }
            boolean r0 = r0.b(r2, r13)     // Catch:{ all -> 0x06c6 }
            if (r0 == 0) goto L_0x061c
            int r0 = r8.a     // Catch:{ all -> 0x06c6 }
            r0 = r0 & 32
            if (r0 == 0) goto L_0x0618
            boolean r0 = r8.g     // Catch:{ all -> 0x06c6 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x06c6 }
            goto L_0x0619
        L_0x0618:
            r0 = 0
        L_0x0619:
            r12.put(r14, r0)     // Catch:{ all -> 0x06c6 }
        L_0x061c:
            r12.put(r15, r10)     // Catch:{ all -> 0x06c6 }
            android.database.sqlite.SQLiteDatabase r0 = r9.e()     // Catch:{ SQLiteException -> 0x0646 }
            r10 = 5
            r13 = 0
            long r25 = r0.insertWithOnConflict(r5, r13, r12, r10)     // Catch:{ SQLiteException -> 0x0644 }
            r18 = -1
            int r0 = (r25 > r18 ? 1 : (r25 == r18 ? 0 : -1))
            if (r0 != 0) goto L_0x0640
            sut r0 = r9.E()     // Catch:{ SQLiteException -> 0x0644 }
            sur r0 = r0.c     // Catch:{ SQLiteException -> 0x0644 }
            java.lang.String r3 = "Failed to insert property filter (got -1). appId"
            java.lang.Object r6 = defpackage.sut.a((java.lang.String) r28)     // Catch:{ SQLiteException -> 0x0644 }
            r0.a(r3, r6)     // Catch:{ SQLiteException -> 0x0644 }
            goto L_0x0680
        L_0x0640:
            r0 = r24
            goto L_0x05b0
        L_0x0644:
            r0 = move-exception
            goto L_0x0648
        L_0x0646:
            r0 = move-exception
            r10 = 5
        L_0x0648:
            sut r3 = r9.E()     // Catch:{ all -> 0x06c6 }
            sur r3 = r3.c     // Catch:{ all -> 0x06c6 }
            java.lang.String r6 = "Error storing property filter. appId"
            java.lang.Object r7 = defpackage.sut.a((java.lang.String) r28)     // Catch:{ all -> 0x06c6 }
            r3.a(r6, r7, r0)     // Catch:{ all -> 0x06c6 }
            goto L_0x0680
        L_0x0658:
            r10 = 5
            r13 = 0
            sut r0 = r9.E()     // Catch:{ all -> 0x06c6 }
            sur r0 = r0.f     // Catch:{ all -> 0x06c6 }
            java.lang.String r3 = "Property filter had no property name. Audience definition ignored. appId, audienceId, filterId"
            java.lang.Object r6 = defpackage.sut.a((java.lang.String) r28)     // Catch:{ all -> 0x06c6 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x06c6 }
            int r12 = r8.a     // Catch:{ all -> 0x06c6 }
            r14 = 1
            r12 = r12 & r14
            if (r12 == 0) goto L_0x0678
            int r8 = r8.b     // Catch:{ all -> 0x06c6 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x06c6 }
            r13 = r8
            goto L_0x0679
        L_0x0678:
        L_0x0679:
            java.lang.String r8 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x06c6 }
            r0.a(r3, r6, r7, r8)     // Catch:{ all -> 0x06c6 }
        L_0x0680:
            r9.q()     // Catch:{ all -> 0x06c6 }
            r9.h()     // Catch:{ all -> 0x06c6 }
            defpackage.iva.c(r28)     // Catch:{ all -> 0x06c6 }
            android.database.sqlite.SQLiteDatabase r0 = r9.e()     // Catch:{ all -> 0x06c6 }
            r3 = 2
            java.lang.String[] r6 = new java.lang.String[r3]     // Catch:{ all -> 0x06c6 }
            r3 = 0
            r6[r3] = r2     // Catch:{ all -> 0x06c6 }
            java.lang.String r3 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x06c6 }
            r7 = 1
            r6[r7] = r3     // Catch:{ all -> 0x06c6 }
            r3 = r17
            r0.delete(r5, r3, r6)     // Catch:{ all -> 0x06c6 }
            r6 = 2
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ all -> 0x06c6 }
            r8 = 0
            r7[r8] = r2     // Catch:{ all -> 0x06c6 }
            java.lang.String r8 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x06c6 }
            r11 = 1
            r7[r11] = r8     // Catch:{ all -> 0x06c6 }
            r0.delete(r4, r3, r7)     // Catch:{ all -> 0x06c6 }
            r17 = r3
            r3 = r21
            r19 = r22
            r10 = r23
            goto L_0x028f
        L_0x06b9:
            r3 = r17
            r6 = 2
            r10 = 5
            r11 = 1
            r3 = r21
            r19 = r22
            r10 = r23
            goto L_0x028f
        L_0x06c6:
            r0 = move-exception
        L_0x06c7:
            r1.endTransaction()
            throw r0
        L_0x06cb:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.svn.a(java.lang.String, byte[], java.lang.String):boolean");
    }
}
