package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import com.google.android.gms.R;
import java.util.Set;

/* renamed from: ozu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ozu {
    public final ozb a;
    public boolean b;
    public final ors c;
    private final Account[] d;

    public ozu(ozb ozb, ors ors, Set set) {
        this(ozb, ors, (Account[]) set.toArray(new Account[set.size()]));
    }

    private final orv a() {
        return this.a.a.e;
    }

    private static final void a(oyz oyz) {
        if (oyz.g().a() == 2) {
            String valueOf = String.valueOf(oyz);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
            sb.append("Clearing GSAI for ");
            sb.append(valueOf);
            sb.append("; no longer in resources");
            oso.d(sb.toString());
            try {
                oyz.a(ozv.b((Object) null, 0));
            } catch (pau e) {
                throw new paw("Could not clear GSAI");
            }
        }
    }

    public ozu(ozb ozb, ors ors, Account[] accountArr) {
        this.a = ozb;
        this.c = ors;
        this.d = accountArr;
    }

    private final void a(oyz oyz, String str) {
        ors ors = this.c;
        osf osf = ors.a;
        if (!osf.w && oyz.b.equals(osf.b.getPackageName())) {
            oso.e("Skipping unregister from self resource");
            return;
        }
        osf osf2 = ors.a;
        oso.d("unregisterFromResources: %s corpus %s", oyz.b, str);
        osf2.c.b(2);
        pao pao = new pao(oyz.b, str);
        ozv c2 = osf2.a().c(pao);
        if (c2 == null) {
            oso.b("Request to unregister non-existent resources corpus %s from package %s", (Object) str, (Object) oyz.b);
            return;
        }
        iva.a(c2.a() == 2);
        if (!osf2.a(pao, oyz)) {
            String valueOf = String.valueOf(oyz.b);
            oso.b(valueOf.length() == 0 ? new String("Failed to unregister corpus from client ") : "Failed to unregister corpus from client ".concat(valueOf));
        }
    }

    /* access modifiers changed from: protected */
    public final oyy a(ApplicationInfo applicationInfo) {
        XmlResourceParser xmlResourceParser;
        if (applicationInfo.packageName != null) {
            Context context = this.a.a.b;
            if ("com.google.android.gms".equals(applicationInfo.packageName)) {
                try {
                    xmlResourceParser = context.getResources().getXml(R.xml.appdatasearch);
                } catch (Resources.NotFoundException e) {
                    oso.a((Throwable) e, "Failed to load resources for GmsCore");
                    return null;
                }
            } else {
                try {
                    context = context.createPackageContext(applicationInfo.packageName, 0);
                    XmlResourceParser loadXmlMetaData = applicationInfo.loadXmlMetaData(this.a.a.c, "com.google.android.gms.appdatasearch");
                    if (loadXmlMetaData != null) {
                        xmlResourceParser = loadXmlMetaData;
                    } else {
                        oso.b("Failed to read %s meta data from %s; could not create XML parser", (Object) "com.google.android.gms.appdatasearch", (Object) applicationInfo.packageName);
                        return null;
                    }
                } catch (PackageManager.NameNotFoundException | Resources.NotFoundException | SecurityException e2) {
                    oso.b(e2, "Failed to get context for %s", applicationInfo.packageName);
                    return null;
                }
            }
            return new oyy(applicationInfo, context, xmlResourceParser);
        }
        oso.b("null packageName in ApplicationInfo, bailing");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x01ef, code lost:
        defpackage.oso.f("Package %s Corpus %s Version %s failed appdatasearch-corpus-whitelist", r0.b, r5.a, r5.b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0205, code lost:
        r3.remove(r5.a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:?, code lost:
        r6 = r12.c;
        r7 = r12.a.a(r13.applicationInfo);
        r8 = r13.lastUpdateTime;
        r10 = r6.a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x021a, code lost:
        if (r10.w != false) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0228, code lost:
        if (r7.f.equals(r10.b.getPackageName()) == false) goto L_0x0230;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x022a, code lost:
        defpackage.oso.e("Skipping register from self resource");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0230, code lost:
        r6 = r6.a;
        r10 = defpackage.osn.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0236, code lost:
        if (r10 != null) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:?, code lost:
        r6.a(r7, defpackage.ozv.b(r5, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0240, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:?, code lost:
        r7 = r7.f;
        r9 = new java.lang.StringBuilder(java.lang.String.valueOf(r7).length() + 41);
        r9.append("Failed to register corpus from ");
        r9.append(r7);
        r9.append(" resources");
        defpackage.oso.a(r6, r9.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x026f, code lost:
        throw new defpackage.pau(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02bc, code lost:
        r1 = r3.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02c4, code lost:
        if (r1.hasNext() == false) goto L_0x02d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02c6, code lost:
        a(r0, (java.lang.String) r1.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02d8, code lost:
        if ("com.google.android.gms".equals(r0.b) != false) goto L_0x032b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02da, code lost:
        r14 = r14.b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02dc, code lost:
        if (r14 == null) goto L_0x0328;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02de, code lost:
        r1 = java.lang.String.valueOf(r0);
        r2 = java.lang.String.valueOf(r14);
        r4 = new java.lang.StringBuilder((java.lang.String.valueOf(r1).length() + 19) + java.lang.String.valueOf(r2).length());
        r4.append("Setting GSAI for ");
        r4.append(r1);
        r4.append(": ");
        r4.append(r2);
        defpackage.oso.d(r4.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:?, code lost:
        r0.a(defpackage.ozv.b(r14, r13.lastUpdateTime));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0328, code lost:
        a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x032b, code lost:
        r0.n();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x032e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x034b, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0350, code lost:
        if (r13.getMessage() == null) goto L_0x0352;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0352, code lost:
        r13 = "Error parsing xml.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0355, code lost:
        r13 = r13.getMessage();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0359, code lost:
        defpackage.oso.b(r13);
        r0.b(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x035f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ea, code lost:
        r3 = r0.d;
        r4 = r0.b;
        r5 = r3.g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f0, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r7 = r3.d(r4);
        r6 = (defpackage.aucd) r7.c(5);
        r6.a((defpackage.aucj) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0100, code lost:
        if (r6.c != false) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0103, code lost:
        r6.c();
        r6.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0108, code lost:
        r7 = (defpackage.out) r6.b;
        r8 = defpackage.out.n;
        r7.a &= -1025;
        r7.l = false;
        r3.a(r4, (defpackage.out) r6.i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011f, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x012a, code lost:
        r3 = r0.d;
        r4 = r0.b;
        r5 = r3.g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0130, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r7 = r3.d(r4);
        r6 = (defpackage.aucd) r7.c(5);
        r6.a((defpackage.aucj) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0144, code lost:
        if (((defpackage.out) r6.b).l == true) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0148, code lost:
        if (r6.c != false) goto L_0x014b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014b, code lost:
        r6.c();
        r6.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0150, code lost:
        r7 = (defpackage.out) r6.b;
        r8 = defpackage.out.n;
        r7.a |= 1024;
        r7.l = true;
        r3.a(r4, (defpackage.out) r6.i());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0167, code lost:
        monitor-exit(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01c2, code lost:
        r4 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01ca, code lost:
        if (r4.hasNext() == false) goto L_0x02bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01cc, code lost:
        r5 = (com.google.android.gms.appdatasearch.RegisterCorpusInfo) r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01d6, code lost:
        if (defpackage.pba.b() != false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01ed, code lost:
        if (defpackage.ozt.a(r0.b, r5, r0.l(), r12.a.a.b.getResources()) != false) goto L_0x0205;
     */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x034b A[ExcHandler: oyx (r13v5 'e' oyx A[CUSTOM_DECLARE]), Splitter:B:40:0x00da] */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0363  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x036b  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x037f  */
    /* JADX WARNING: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.pm.PackageInfo r13, boolean r14) {
        /*
            r12 = this;
            android.content.pm.ApplicationInfo r0 = r13.applicationInfo
            android.os.Bundle r0 = r0.metaData
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0016
            android.content.pm.ApplicationInfo r0 = r13.applicationInfo
            android.os.Bundle r0 = r0.metaData
            java.lang.String r3 = "com.google.android.gms.appdatasearch"
            boolean r0 = r0.containsKey(r3)
            if (r0 == 0) goto L_0x0016
            r0 = 1
            goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            ozb r3 = r12.a
            java.lang.String r4 = r13.packageName
            oyz r3 = r3.d(r4)
            if (r3 == 0) goto L_0x0029
            boolean r4 = r3.i()
            if (r4 != 0) goto L_0x0029
            r4 = 1
            goto L_0x002a
        L_0x0029:
            r4 = 0
        L_0x002a:
            agvx r5 = defpackage.pba.f
            java.lang.Object r5 = r5.c()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x005e
            boolean r5 = defpackage.jkr.g()
            if (r5 == 0) goto L_0x005e
            android.content.pm.ApplicationInfo r5 = r13.applicationInfo
            int r5 = r5.targetSdkVersion
            r6 = 27
            if (r5 <= r6) goto L_0x005e
            java.lang.String r5 = r13.packageName
            agvx r6 = defpackage.ozx.ck
            java.lang.Object r6 = r6.c()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r7 = ","
            java.lang.String[] r6 = r6.split(r7)
            boolean r5 = defpackage.jhx.a((java.lang.Object[]) r6, (java.lang.Object) r5)
            if (r5 != 0) goto L_0x005e
            r5 = 1
            goto L_0x005f
        L_0x005e:
            r5 = 0
        L_0x005f:
            r6 = 0
            if (r0 == 0) goto L_0x0361
            if (r4 != 0) goto L_0x0361
            if (r5 != 0) goto L_0x0361
            ozb r0 = r12.a
            java.lang.String r3 = r13.packageName
            oyz r0 = r0.c(r3)
            if (r14 != 0) goto L_0x00b0
            boolean r14 = r0.o()
            if (r14 != 0) goto L_0x00b0
            java.lang.String r14 = r0.b
            java.lang.String r3 = "com.google.android.gms"
            boolean r14 = r14.equals(r3)
            if (r14 == 0) goto L_0x0081
            goto L_0x00b0
        L_0x0081:
            boolean r14 = r12.b
            if (r14 != 0) goto L_0x0086
            goto L_0x008d
        L_0x0086:
            boolean r14 = r0.q()
            if (r14 == 0) goto L_0x008d
            goto L_0x00b0
        L_0x008d:
            java.lang.String r13 = java.lang.String.valueOf(r0)
            java.lang.String r14 = java.lang.String.valueOf(r13)
            int r14 = r14.length()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r14 = r14 + 28
            r0.<init>(r14)
            java.lang.String r14 = "updateResources: up to date:"
            r0.append(r14)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            defpackage.oso.d(r13)
            return
        L_0x00b0:
            java.lang.String r14 = java.lang.String.valueOf(r0)
            java.lang.String r3 = java.lang.String.valueOf(r14)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r3 + 31
            r4.<init>(r3)
            java.lang.String r3 = "updateResources: need to parse "
            r4.append(r3)
            r4.append(r14)
            java.lang.String r14 = r4.toString()
            defpackage.oso.c(r14)
            android.content.pm.ApplicationInfo r14 = r13.applicationInfo
            oyy r14 = r12.a((android.content.pm.ApplicationInfo) r14)
            if (r14 == 0) goto L_0x0360
            r0.b((java.lang.String) r6)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            java.lang.String r3 = r0.b     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            oyv r14 = r14.a(r3)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            r3 = 0
        L_0x00e4:
            oyu[] r4 = r14.a     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            int r5 = r4.length     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            r6 = 5
            if (r3 < r5) goto L_0x0124
            prp r3 = r0.d     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            java.lang.String r4 = r0.b     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            java.lang.Object r5 = r3.g     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            monitor-enter(r5)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            out r7 = r3.d(r4)     // Catch:{ all -> 0x0121 }
            java.lang.Object r6 = r7.c(r6)     // Catch:{ all -> 0x0121 }
            aucd r6 = (defpackage.aucd) r6     // Catch:{ all -> 0x0121 }
            r6.a((defpackage.aucj) r7)     // Catch:{ all -> 0x0121 }
            boolean r7 = r6.c     // Catch:{ all -> 0x0121 }
            if (r7 != 0) goto L_0x0103
            goto L_0x0108
        L_0x0103:
            r6.c()     // Catch:{ all -> 0x0121 }
            r6.c = r2     // Catch:{ all -> 0x0121 }
        L_0x0108:
            aucj r7 = r6.b     // Catch:{ all -> 0x0121 }
            out r7 = (defpackage.out) r7     // Catch:{ all -> 0x0121 }
            out r8 = defpackage.out.n     // Catch:{ all -> 0x0121 }
            int r8 = r7.a     // Catch:{ all -> 0x0121 }
            r8 = r8 & -1025(0xfffffffffffffbff, float:NaN)
            r7.a = r8     // Catch:{ all -> 0x0121 }
            r7.l = r2     // Catch:{ all -> 0x0121 }
            aucj r6 = r6.i()     // Catch:{ all -> 0x0121 }
            out r6 = (defpackage.out) r6     // Catch:{ all -> 0x0121 }
            r3.a((java.lang.String) r4, (defpackage.out) r6)     // Catch:{ all -> 0x0121 }
            monitor-exit(r5)     // Catch:{ all -> 0x0121 }
            goto L_0x0168
        L_0x0121:
            r13 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0121 }
            throw r13     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
        L_0x0124:
            r4 = r4[r3]     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            boolean r4 = r4.b     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            if (r4 == 0) goto L_0x0332
            prp r3 = r0.d     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            java.lang.String r4 = r0.b     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            java.lang.Object r5 = r3.g     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            monitor-enter(r5)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            out r7 = r3.d(r4)     // Catch:{ all -> 0x032f }
            java.lang.Object r6 = r7.c(r6)     // Catch:{ all -> 0x032f }
            aucd r6 = (defpackage.aucd) r6     // Catch:{ all -> 0x032f }
            r6.a((defpackage.aucj) r7)     // Catch:{ all -> 0x032f }
            aucj r7 = r6.b     // Catch:{ all -> 0x032f }
            out r7 = (defpackage.out) r7     // Catch:{ all -> 0x032f }
            boolean r7 = r7.l     // Catch:{ all -> 0x032f }
            if (r7 == r1) goto L_0x0167
            boolean r7 = r6.c     // Catch:{ all -> 0x032f }
            if (r7 != 0) goto L_0x014b
            goto L_0x0150
        L_0x014b:
            r6.c()     // Catch:{ all -> 0x032f }
            r6.c = r2     // Catch:{ all -> 0x032f }
        L_0x0150:
            aucj r7 = r6.b     // Catch:{ all -> 0x032f }
            out r7 = (defpackage.out) r7     // Catch:{ all -> 0x032f }
            out r8 = defpackage.out.n     // Catch:{ all -> 0x032f }
            int r8 = r7.a     // Catch:{ all -> 0x032f }
            r8 = r8 | 1024(0x400, float:1.435E-42)
            r7.a = r8     // Catch:{ all -> 0x032f }
            r7.l = r1     // Catch:{ all -> 0x032f }
            aucj r6 = r6.i()     // Catch:{ all -> 0x032f }
            out r6 = (defpackage.out) r6     // Catch:{ all -> 0x032f }
            r3.a((java.lang.String) r4, (defpackage.out) r6)     // Catch:{ all -> 0x032f }
        L_0x0167:
            monitor-exit(r5)     // Catch:{ all -> 0x032f }
        L_0x0168:
            orv r3 = r12.a()     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            ozb r4 = r12.a     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            android.content.pm.ApplicationInfo r5 = r13.applicationInfo     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            ozc r4 = r4.a((android.content.pm.ApplicationInfo) r5)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            java.util.Set r3 = r3.a(r4)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            android.accounts.Account[] r4 = r12.d     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            r5.<init>()     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            r6 = 0
        L_0x0180:
            oyu[] r7 = r14.a     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            int r8 = r7.length     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            if (r6 >= r8) goto L_0x01c2
            r7 = r7[r6]     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            boolean r8 = r7.b     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            if (r8 != 0) goto L_0x0191
            com.google.android.gms.appdatasearch.RegisterCorpusInfo r7 = r7.a     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            r5.add(r7)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            goto L_0x01b9
        L_0x0191:
            com.google.android.gms.appdatasearch.RegisterCorpusInfo r8 = r7.a     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            java.lang.String r8 = defpackage.osn.a((com.google.android.gms.appdatasearch.RegisterCorpusInfo) r8)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            if (r8 != 0) goto L_0x01bc
            if (r4 == 0) goto L_0x01b9
            r8 = 0
        L_0x019c:
            int r9 = r4.length     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            if (r8 >= r9) goto L_0x01b9
            com.google.android.gms.appdatasearch.RegisterCorpusInfo r9 = r7.a     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            r10 = r4[r8]     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            com.google.android.gms.appdatasearch.RegisterCorpusInfo r9 = r9.a((android.accounts.Account) r10)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            java.lang.String r10 = defpackage.osn.a((com.google.android.gms.appdatasearch.RegisterCorpusInfo) r9)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            if (r10 == 0) goto L_0x01b3
            java.lang.String r9 = "Account exceeds length limits"
            defpackage.oso.b(r9)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            goto L_0x01b6
        L_0x01b3:
            r5.add(r9)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
        L_0x01b6:
            int r8 = r8 + 1
            goto L_0x019c
        L_0x01b9:
            int r6 = r6 + 1
            goto L_0x0180
        L_0x01bc:
            pau r13 = new pau     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            r13.<init>(r8)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            throw r13     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
        L_0x01c2:
            java.util.Iterator r4 = r5.iterator()     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
        L_0x01c6:
            boolean r5 = r4.hasNext()     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            if (r5 == 0) goto L_0x02bc
            java.lang.Object r5 = r4.next()     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            com.google.android.gms.appdatasearch.RegisterCorpusInfo r5 = (com.google.android.gms.appdatasearch.RegisterCorpusInfo) r5     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            boolean r6 = defpackage.pba.b()     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            if (r6 != 0) goto L_0x01d9
            goto L_0x0205
        L_0x01d9:
            java.lang.String r6 = r0.b     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            android.content.res.Resources r7 = r0.l()     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            ozb r8 = r12.a     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            oza r8 = r8.a     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            android.content.Context r8 = r8.b     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            android.content.res.Resources r8 = r8.getResources()     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            boolean r6 = defpackage.ozt.a(r6, r5, r7, r8)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            if (r6 != 0) goto L_0x0205
            java.lang.String r6 = "Package %s Corpus %s Version %s failed appdatasearch-corpus-whitelist"
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            java.lang.String r8 = r0.b     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            r7[r2] = r8     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            java.lang.String r8 = r5.a     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            r7[r1] = r8     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            r8 = 2
            java.lang.String r5 = r5.b     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            r7[r8] = r5     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            defpackage.oso.f(r6, r7)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            goto L_0x01c6
        L_0x0205:
            java.lang.String r6 = r5.a     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            r3.remove(r6)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            ors r6 = r12.c     // Catch:{ pau -> 0x0270, oyx -> 0x034b }
            ozb r7 = r12.a     // Catch:{ pau -> 0x0270, oyx -> 0x034b }
            android.content.pm.ApplicationInfo r8 = r13.applicationInfo     // Catch:{ pau -> 0x0270, oyx -> 0x034b }
            ozc r7 = r7.a((android.content.pm.ApplicationInfo) r8)     // Catch:{ pau -> 0x0270, oyx -> 0x034b }
            long r8 = r13.lastUpdateTime     // Catch:{ pau -> 0x0270, oyx -> 0x034b }
            osf r10 = r6.a     // Catch:{ pau -> 0x0270, oyx -> 0x034b }
            boolean r11 = r10.w     // Catch:{ pau -> 0x0270, oyx -> 0x034b }
            if (r11 != 0) goto L_0x0230
            java.lang.String r11 = r7.f     // Catch:{ pau -> 0x0270, oyx -> 0x034b }
            android.content.Context r10 = r10.b     // Catch:{ pau -> 0x0270, oyx -> 0x034b }
            java.lang.String r10 = r10.getPackageName()     // Catch:{ pau -> 0x0270, oyx -> 0x034b }
            boolean r10 = r11.equals(r10)     // Catch:{ pau -> 0x0270, oyx -> 0x034b }
            if (r10 == 0) goto L_0x0230
            java.lang.String r6 = "Skipping register from self resource"
            defpackage.oso.e(r6)     // Catch:{ pau -> 0x0270, oyx -> 0x034b }
            goto L_0x01c6
        L_0x0230:
            osf r6 = r6.a     // Catch:{ pau -> 0x0270, oyx -> 0x034b }
            java.lang.String r10 = defpackage.osn.a((com.google.android.gms.appdatasearch.RegisterCorpusInfo) r5)     // Catch:{ pau -> 0x0270, oyx -> 0x034b }
            if (r10 != 0) goto L_0x026a
            ozv r8 = defpackage.ozv.b(r5, r8)     // Catch:{ pax -> 0x0242, SecurityException -> 0x0240 }
            r6.a((defpackage.ozc) r7, (defpackage.ozv) r8)     // Catch:{ pax -> 0x0242, SecurityException -> 0x0240 }
            goto L_0x01c6
        L_0x0240:
            r6 = move-exception
            goto L_0x0243
        L_0x0242:
            r6 = move-exception
        L_0x0243:
            java.lang.String r7 = r7.f     // Catch:{ pau -> 0x0270, oyx -> 0x034b }
            java.lang.String r8 = java.lang.String.valueOf(r7)     // Catch:{ pau -> 0x0270, oyx -> 0x034b }
            int r8 = r8.length()     // Catch:{ pau -> 0x0270, oyx -> 0x034b }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ pau -> 0x0270, oyx -> 0x034b }
            int r8 = r8 + 41
            r9.<init>(r8)     // Catch:{ pau -> 0x0270, oyx -> 0x034b }
            java.lang.String r8 = "Failed to register corpus from "
            r9.append(r8)     // Catch:{ pau -> 0x0270, oyx -> 0x034b }
            r9.append(r7)     // Catch:{ pau -> 0x0270, oyx -> 0x034b }
            java.lang.String r7 = " resources"
            r9.append(r7)     // Catch:{ pau -> 0x0270, oyx -> 0x034b }
            java.lang.String r7 = r9.toString()     // Catch:{ pau -> 0x0270, oyx -> 0x034b }
            defpackage.oso.a((java.lang.Throwable) r6, (java.lang.String) r7)     // Catch:{ pau -> 0x0270, oyx -> 0x034b }
            goto L_0x01c6
        L_0x026a:
            pau r14 = new pau     // Catch:{ pau -> 0x0270, oyx -> 0x034b }
            r14.<init>(r10)     // Catch:{ pau -> 0x0270, oyx -> 0x034b }
            throw r14     // Catch:{ pau -> 0x0270, oyx -> 0x034b }
        L_0x0270:
            r14 = move-exception
            pau r1 = new pau     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            java.lang.String r13 = r13.packageName     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            java.lang.String r2 = r5.a     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            java.lang.String r14 = r14.getMessage()     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            java.lang.String r3 = java.lang.String.valueOf(r13)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            int r3 = r3.length()     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            int r4 = r4.length()     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            java.lang.String r5 = java.lang.String.valueOf(r14)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            int r5 = r5.length()     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            int r3 = r3 + 39
            int r3 = r3 + r4
            int r3 = r3 + r5
            r6.<init>(r3)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            java.lang.String r3 = "From "
            r6.append(r3)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            r6.append(r13)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            java.lang.String r13 = " resources: problem with corpus "
            r6.append(r13)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            r6.append(r2)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            java.lang.String r13 = ": "
            r6.append(r13)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            r6.append(r14)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            java.lang.String r13 = r6.toString()     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            r1.<init>(r13)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            throw r1     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
        L_0x02bc:
            java.util.Iterator r1 = r3.iterator()     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
        L_0x02c0:
            boolean r2 = r1.hasNext()     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            if (r2 == 0) goto L_0x02d0
            java.lang.Object r2 = r1.next()     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            r12.a((defpackage.oyz) r0, (java.lang.String) r2)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            goto L_0x02c0
        L_0x02d0:
            java.lang.String r1 = "com.google.android.gms"
            java.lang.String r2 = r0.b     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            boolean r1 = r1.equals(r2)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            if (r1 != 0) goto L_0x032b
            com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo r14 = r14.b     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            if (r14 == 0) goto L_0x0328
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            java.lang.String r2 = java.lang.String.valueOf(r14)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            int r3 = r3.length()     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            int r3 = r3 + 19
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            int r4 = r4.length()     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            r4.<init>(r3)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            java.lang.String r3 = "Setting GSAI for "
            r4.append(r3)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            r4.append(r1)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            java.lang.String r1 = ": "
            r4.append(r1)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            r4.append(r2)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            java.lang.String r1 = r4.toString()     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            defpackage.oso.d(r1)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            long r1 = r13.lastUpdateTime     // Catch:{ pau -> 0x031f, oyx -> 0x034b }
            ozv r13 = defpackage.ozv.b(r14, r1)     // Catch:{ pau -> 0x031f, oyx -> 0x034b }
            r0.a((defpackage.ozv) r13)     // Catch:{ pau -> 0x031f, oyx -> 0x034b }
            goto L_0x032b
        L_0x031f:
            r13 = move-exception
            paw r13 = new paw     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            java.lang.String r14 = "Could not set GSAI from resources"
            r13.<init>((java.lang.String) r14)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            throw r13     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
        L_0x0328:
            a((defpackage.oyz) r0)     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
        L_0x032b:
            r0.n()     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
            return
        L_0x032f:
            r13 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x032f }
            throw r13     // Catch:{ oyx -> 0x034b, pau -> 0x0336 }
        L_0x0332:
            int r3 = r3 + 1
            goto L_0x00e4
        L_0x0336:
            r13 = move-exception
            java.lang.String r14 = r13.getMessage()
            if (r14 != 0) goto L_0x0340
            java.lang.String r13 = "Error from Icing client."
            goto L_0x0344
        L_0x0340:
            java.lang.String r13 = r13.getMessage()
        L_0x0344:
            defpackage.oso.b(r13)
            r0.b((java.lang.String) r13)
            return
        L_0x034b:
            r13 = move-exception
            java.lang.String r14 = r13.getMessage()
            if (r14 != 0) goto L_0x0355
            java.lang.String r13 = "Error parsing xml."
            goto L_0x0359
        L_0x0355:
            java.lang.String r13 = r13.getMessage()
        L_0x0359:
            defpackage.oso.b(r13)
            r0.b((java.lang.String) r13)
            return
        L_0x0360:
            return
        L_0x0361:
            if (r0 != 0) goto L_0x036b
            java.lang.String r14 = r13.packageName
            java.lang.String r0 = "Package %s has no appdatasearch metadata"
            defpackage.oso.d((java.lang.String) r0, (java.lang.Object) r14)
            goto L_0x037d
        L_0x036b:
            if (r4 != 0) goto L_0x0375
            java.lang.String r14 = r13.packageName
            java.lang.String r0 = "Package %s targets Android P and isn't allowed to use AppDataSearch indexing API"
            defpackage.oso.e((java.lang.String) r0, (java.lang.Object) r14)
            goto L_0x037d
        L_0x0375:
            java.lang.String r14 = r13.packageName
            java.lang.String r0 = "Package %s is not allowed to use icing"
            defpackage.oso.d((java.lang.String) r0, (java.lang.Object) r14)
        L_0x037d:
            if (r3 == 0) goto L_0x03ce
            r3.b((java.lang.String) r6)
            java.lang.String r14 = java.lang.String.valueOf(r3)
            java.lang.String r0 = java.lang.String.valueOf(r14)
            int r0 = r0.length()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            int r0 = r0 + 35
            r1.<init>(r0)
            java.lang.String r0 = "updateResources: resources removed:"
            r1.append(r0)
            r1.append(r14)
            java.lang.String r14 = r1.toString()
            defpackage.oso.a(r14)
            a((defpackage.oyz) r3)
            orv r14 = r12.a()
            ozb r0 = r12.a
            android.content.pm.ApplicationInfo r13 = r13.applicationInfo
            ozc r13 = r0.a((android.content.pm.ApplicationInfo) r13)
            java.util.Set r13 = r14.a(r13)
            java.util.Iterator r13 = r13.iterator()
        L_0x03bb:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x03cb
            java.lang.Object r14 = r13.next()
            java.lang.String r14 = (java.lang.String) r14
            r12.a((defpackage.oyz) r3, (java.lang.String) r14)
            goto L_0x03bb
        L_0x03cb:
            r3.n()
        L_0x03ce:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozu.a(android.content.pm.PackageInfo, boolean):void");
    }

    public final void a(boolean z) {
        for (String str : this.a.b()) {
            if (!a(str, z)) {
                oso.a("Package %s no longer installed", (Object) str);
                this.c.a(str);
            }
        }
    }

    public final boolean a(String str) {
        return a(str, false);
    }

    public final boolean a(String str, boolean z) {
        try {
            PackageInfo packageInfo = this.a.a.c.getPackageInfo(str, 128);
            if (!packageInfo.applicationInfo.enabled) {
                oso.d("Package %s is disabled", (Object) packageInfo.packageName);
                this.c.a(packageInfo.packageName);
                return true;
            }
            a(packageInfo, z);
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            return false;
        }
    }
}
