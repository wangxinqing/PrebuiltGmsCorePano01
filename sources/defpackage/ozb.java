package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import com.google.android.gms.R;
import com.google.android.gms.appdatasearch.GlobalSearchApplicationInfo;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: ozb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ozb {
    public final oza a;
    public final Object b;
    public final Map c = new HashMap();

    public ozb(oza oza) {
        Set<String> keySet;
        this.a = oza;
        this.b = oza.a.g;
        prp prp = this.a.a;
        synchronized (prp.g) {
            keySet = prp.c.keySet();
        }
        for (String c2 : keySet) {
            c(c2);
        }
    }

    /* access modifiers changed from: package-private */
    public final int a(int i) {
        return hdg.a(this.a.b, i);
    }

    public final Set b() {
        HashSet hashSet;
        synchronized (this.b) {
            hashSet = new HashSet(this.c.keySet());
        }
        return hashSet;
    }

    public final int c() {
        int intValue = ((Integer) this.a.a.n("com.google.android.googlequicksearchbox").a).intValue();
        return intValue == 0 ? ((Integer) this.a.b("com.google.android.googlequicksearchbox").a).intValue() : intValue;
    }

    public final oyz d(String str) {
        oyz oyz;
        synchronized (this.b) {
            oyz = (oyz) this.c.get(str);
        }
        return oyz;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e() {
        /*
            r4 = this;
            java.lang.String r0 = "maybeUpdateGmailGlobalSearchInfo"
            defpackage.oso.a(r0)
            java.lang.Object r0 = r4.b
            monitor-enter(r0)
            java.lang.String r1 = "com.google.android.gm"
            oyz r1 = r4.d(r1)     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0023
            ozv r2 = r1.g()     // Catch:{ all -> 0x0025 }
            java.lang.Object r2 = r2.c()     // Catch:{ all -> 0x0025 }
            if (r2 != 0) goto L_0x0021
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0025 }
            r1.a((long) r2)     // Catch:{ all -> 0x0025 }
        L_0x0021:
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return
        L_0x0023:
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            return
        L_0x0025:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0025 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozb.e():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0142, code lost:
        r1.a(java.lang.System.currentTimeMillis());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0149, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void f(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.b
            monitor-enter(r0)
            oyz r1 = r8.d(r9)     // Catch:{ all -> 0x0150 }
            if (r1 == 0) goto L_0x0030
            java.lang.String r2 = "com.google.android.gms"
            boolean r2 = r2.equals(r9)     // Catch:{ pau -> 0x0029 }
            if (r2 == 0) goto L_0x0019
            java.util.Set r2 = java.util.Collections.emptySet()     // Catch:{ pau -> 0x0029 }
            r1.a((java.util.Set) r2)     // Catch:{ pau -> 0x0029 }
            goto L_0x001e
        L_0x0019:
            ozv r2 = defpackage.ozv.a     // Catch:{ pau -> 0x0029 }
            r1.a((defpackage.ozv) r2)     // Catch:{ pau -> 0x0029 }
        L_0x001e:
            oza r2 = r8.a     // Catch:{ all -> 0x0150 }
            prp r2 = r2.a     // Catch:{ all -> 0x0150 }
            r2.g(r9)     // Catch:{ all -> 0x0150 }
            r1.m()     // Catch:{ all -> 0x0150 }
            goto L_0x0030
        L_0x0029:
            r9 = move-exception
            paw r1 = new paw     // Catch:{ all -> 0x0150 }
            r1.<init>((java.lang.Throwable) r9)     // Catch:{ all -> 0x0150 }
            throw r1     // Catch:{ all -> 0x0150 }
        L_0x0030:
            monitor-exit(r0)     // Catch:{ all -> 0x0150 }
            if (r1 == 0) goto L_0x014f
            oza r9 = r8.a
            orv r9 = r9.e
            osf r9 = r9.a
            ppp r0 = r9.c
            r2 = 2
            r0.b((int) r2)
            ozq r0 = r9.b()
            java.util.Set r2 = r1.a()
            java.util.Iterator r2 = r2.iterator()
        L_0x004b:
            boolean r3 = r2.hasNext()
            r4 = 1
            if (r3 == 0) goto L_0x00e3
            java.lang.Object r3 = r2.next()
            pao r3 = (defpackage.pao) r3
            ozv r5 = r0.c((defpackage.pao) r3)
            java.lang.Object r6 = r5.c()
            ota r6 = (defpackage.ota) r6
            otg r6 = r6.c
            if (r6 == 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            otg r6 = defpackage.otg.h
        L_0x0069:
            int r6 = r6.c
            int r6 = defpackage.otf.a(r6)
            if (r6 != 0) goto L_0x0072
            goto L_0x0074
        L_0x0072:
            if (r6 != r4) goto L_0x004b
        L_0x0074:
            java.lang.Object r4 = r5.c()
            ota r4 = (defpackage.ota) r4
            osz r4 = r4.b
            if (r4 == 0) goto L_0x007f
            goto L_0x0081
        L_0x007f:
            osz r4 = defpackage.osz.s
        L_0x0081:
            boolean r4 = defpackage.ozq.f((defpackage.osz) r4)
            if (r4 != 0) goto L_0x004b
            java.lang.Object r4 = r5.c()
            ota r4 = (defpackage.ota) r4
            osz r4 = r4.b
            if (r4 != 0) goto L_0x0093
            osz r4 = defpackage.osz.s
        L_0x0093:
            boolean r4 = defpackage.ozq.e((defpackage.osz) r4)
            if (r4 != 0) goto L_0x004b
            java.lang.Object r4 = r5.c()
            ota r4 = (defpackage.ota) r4
            osz r4 = r4.b
            if (r4 == 0) goto L_0x00a4
            goto L_0x00a6
        L_0x00a4:
            osz r4 = defpackage.osz.s
        L_0x00a6:
            r6 = 5
            java.lang.Object r6 = r4.c(r6)
            aucd r6 = (defpackage.aucd) r6
            r6.a((defpackage.aucj) r4)
            boolean r4 = r6.c
            if (r4 != 0) goto L_0x00b5
            goto L_0x00bb
        L_0x00b5:
            r6.c()
            r4 = 0
            r6.c = r4
        L_0x00bb:
            aucj r4 = r6.b
            osz r4 = (defpackage.osz) r4
            aucx r7 = defpackage.aucj.s()
            r4.k = r7
            aucj r4 = r6.i()
            osz r4 = (defpackage.osz) r4
            ozv r4 = r5.a((java.lang.Object) r4)     // Catch:{ pau -> 0x00d4 }
            r0.a((defpackage.pao) r3, (defpackage.ozv) r4)     // Catch:{ pau -> 0x00d4 }
            goto L_0x004b
        L_0x00d4:
            r3 = move-exception
            java.lang.String r4 = "Failed to set corpus config on reparse"
            defpackage.oso.a((java.lang.Throwable) r3, (java.lang.String) r4)
            oyq r3 = r9.r
            java.lang.String r4 = "reparse_sourcecheck_failed"
            r3.a((java.lang.String) r4)
            goto L_0x004b
        L_0x00e3:
            oza r9 = r8.a
            orv r9 = r9.e
            osf r9 = r9.a
            ozs r9 = r9.a()
            r0 = r9
            ozq r0 = (defpackage.ozq) r0
            java.lang.Object r0 = r0.a()
            monitor-enter(r0)
            java.util.Set r2 = r1.a()     // Catch:{ all -> 0x014c }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x014c }
        L_0x00fd:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x014c }
            if (r3 == 0) goto L_0x014a
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x014c }
            pao r3 = (defpackage.pao) r3     // Catch:{ all -> 0x014c }
            r5 = r9
            ozq r5 = (defpackage.ozq) r5     // Catch:{ all -> 0x014c }
            java.util.Map r5 = r5.f     // Catch:{ all -> 0x014c }
            java.lang.Object r3 = r5.get(r3)     // Catch:{ all -> 0x014c }
            ota r3 = (defpackage.ota) r3     // Catch:{ all -> 0x014c }
            if (r3 == 0) goto L_0x00fd
            otg r5 = r3.c     // Catch:{ all -> 0x014c }
            if (r5 == 0) goto L_0x011b
            goto L_0x011d
        L_0x011b:
            otg r5 = defpackage.otg.h     // Catch:{ all -> 0x014c }
        L_0x011d:
            int r5 = r5.c     // Catch:{ all -> 0x014c }
            int r5 = defpackage.otf.a(r5)     // Catch:{ all -> 0x014c }
            if (r5 != 0) goto L_0x0126
            goto L_0x0128
        L_0x0126:
            if (r5 != r4) goto L_0x00fd
        L_0x0128:
            osz r5 = r3.b     // Catch:{ all -> 0x014c }
            if (r5 != 0) goto L_0x012e
            osz r5 = defpackage.osz.s     // Catch:{ all -> 0x014c }
        L_0x012e:
            boolean r5 = defpackage.ozq.f((defpackage.osz) r5)     // Catch:{ all -> 0x014c }
            if (r5 != 0) goto L_0x0141
            osz r3 = r3.b     // Catch:{ all -> 0x014c }
            if (r3 == 0) goto L_0x0139
            goto L_0x013b
        L_0x0139:
            osz r3 = defpackage.osz.s     // Catch:{ all -> 0x014c }
        L_0x013b:
            boolean r3 = defpackage.ozq.e((defpackage.osz) r3)     // Catch:{ all -> 0x014c }
            if (r3 == 0) goto L_0x00fd
        L_0x0141:
            monitor-exit(r0)     // Catch:{ all -> 0x014c }
            long r2 = java.lang.System.currentTimeMillis()
            r1.a((long) r2)
            return
        L_0x014a:
            monitor-exit(r0)     // Catch:{ all -> 0x014c }
            return
        L_0x014c:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x014c }
            throw r9
        L_0x014f:
            return
        L_0x0150:
            r9 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0150 }
            goto L_0x0154
        L_0x0153:
            throw r9
        L_0x0154:
            goto L_0x0153
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozb.f(java.lang.String):void");
    }

    /* access modifiers changed from: package-private */
    public final GlobalSearchApplicationInfo g(String str) {
        return new GlobalSearchApplicationInfo("com.google.android.gms", str, a((int) R.string.icing_contacts_corpus_label), a((int) R.string.icing_contacts_corpus_description), a((int) R.drawable.quantum_ic_contacts_grey600_48), "android.intent.action.MAIN", (String) null, (String) null);
    }

    public final Set a() {
        HashSet hashSet;
        synchronized (this.b) {
            hashSet = new HashSet(this.c.size());
            for (oyz oyz : this.c.values()) {
                if (oyz.b() > 0) {
                    hashSet.add(oyz);
                }
            }
        }
        return hashSet;
    }

    public final Set b(ozc ozc) {
        int length;
        String[] packagesForUid = this.a.c.getPackagesForUid(ozc.a);
        if (packagesForUid == null || (length = packagesForUid.length) == 0) {
            oso.b("No packages found for UID %d", (Object) Integer.valueOf(ozc.a));
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(length);
        for (String c2 : packagesForUid) {
            hashSet.add(c(c2));
        }
        return hashSet;
    }

    public final void d() {
        try {
            oso.a("maybeUpdateGmsCoreGlobalSearchInfo");
            synchronized (this.b) {
                oyz d = d("com.google.android.gms");
                if (d != null) {
                    HashSet hashSet = new HashSet();
                    if (plt.a()) {
                        hashSet.add(new GlobalSearchApplicationInfo("com.google.android.gms", "apps", a((int) R.string.icing_apps_corpus_label), a((int) R.string.icing_apps_corpus_description), a((int) R.drawable.quantum_ic_play_apps_grey600_48), "android.intent.action.MAIN", (String) null, (String) null));
                    }
                    hashSet.add(new GlobalSearchApplicationInfo("com.google.android.gms", "internal.3p:MobileApplication", a((int) R.string.icing_apps_corpus_label), a((int) R.string.icing_apps_corpus_description), a((int) R.drawable.quantum_ic_play_apps_grey600_48), "android.intent.action.MAIN", (String) null, (String) null));
                    if (pnm.a()) {
                        hashSet.add(g("contacts_contact_id"));
                    }
                    hashSet.add(g("internal.3p:Contact"));
                    if (poo.a(this.a.b)) {
                        hashSet.add(new GlobalSearchApplicationInfo("com.google.android.gms", "sms", a((int) R.string.icing_sms_corpus_label), a((int) R.string.icing_sms_corpus_description), a((int) R.drawable.quantum_ic_sms_grey600_48), "android.intent.action.MAIN", (String) null, (String) null));
                    }
                    if (axsd.c()) {
                        hashSet.add(new GlobalSearchApplicationInfo("com.google.android.gms", "internal.3p:Event", a((int) R.string.icing_calendar_corpus_label), a((int) R.string.icing_calendar_corpus_description), a((int) R.drawable.quantum_ic_event_grey600_48), "android.intent.action.MAIN", (String) null, (String) null));
                    }
                    hashSet.add(new GlobalSearchApplicationInfo("com.google.android.gms", "internal.3p:Message", a((int) R.string.icing_sms_corpus_label), a((int) R.string.icing_sms_corpus_description), a((int) R.drawable.quantum_ic_sms_grey600_48), "android.intent.action.MAIN", (String) null, (String) null));
                    hashSet.add(new GlobalSearchApplicationInfo("com.google.android.gms", "internal.3p:Photograph", a((int) R.string.icing_photograph_corpus_label), a((int) R.string.icing_photograph_corpus_description), a((int) R.drawable.quantum_ic_image_grey600_48), "android.intent.action.MAIN", (String) null, (String) null));
                    hashSet.add(new GlobalSearchApplicationInfo("com.google.android.gms", "internal.3p:DigitalDocument", a((int) R.string.icing_digital_document_corpus_label), a((int) R.string.icing_digital_document_corpus_description), a((int) R.drawable.quantum_ic_drive_document_grey600_48), "android.intent.action.MAIN", (String) null, (String) null));
                    hashSet.add(new GlobalSearchApplicationInfo("com.google.android.gms", "internal.3p:MusicRecording", a((int) R.string.icing_music_recording_corpus_label), a((int) R.string.icing_music_recording_corpus_description), a((int) R.drawable.quantum_ic_music_note_grey600_48), "android.intent.action.MAIN", (String) null, (String) null));
                    d.a((Set) hashSet);
                    return;
                }
                oso.a("No client found for GMSCore");
            }
        } catch (pau e) {
            oso.b(e.getMessage());
        }
    }

    public final oyz c(String str) {
        oyz d;
        synchronized (this.b) {
            d = d(str);
            if (d == null) {
                d = new oyz(str, this.a);
                this.c.put(str, d);
            }
        }
        return d;
    }

    public final oyz a(ozc ozc) {
        String str = ozc.f;
        iva.a(true);
        return c(str);
    }

    public final ozc a(int i, String str, int i2) {
        return a(i, str, i2, (String) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.ozc a(int r12, java.lang.String r13, int r14, java.lang.String r15) {
        /*
            r11 = this;
            java.lang.Integer r0 = java.lang.Integer.valueOf(r14)
            java.lang.String r1 = "Creating ClientRequest for %s. Client SDK Version:%d"
            defpackage.oso.d(r1, r13, r0)
            oza r0 = r11.a
            boolean r6 = r0.a(r13)
            oza r0 = r11.a
            android.content.Context r0 = r0.b
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            int r0 = r0.uid
            java.lang.String r1 = ","
            r2 = 1
            r3 = 0
            if (r6 == 0) goto L_0x0037
            agvx r4 = defpackage.ozx.N
            java.lang.Object r4 = r4.c()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String[] r4 = android.text.TextUtils.split(r4, r1)
            java.util.List r4 = java.util.Arrays.asList(r4)
            boolean r4 = r4.contains(r13)
            if (r4 == 0) goto L_0x0037
            r4 = 1
            goto L_0x0038
        L_0x0037:
            r4 = 0
        L_0x0038:
            if (r6 == 0) goto L_0x0062
            java.lang.String r5 = "com.google.android.apps.icing.ui"
            boolean r5 = r5.equals(r13)
            if (r5 != 0) goto L_0x0060
            boolean r5 = defpackage.jix.a()
            if (r5 != 0) goto L_0x0062
            agvx r5 = defpackage.ozx.O
            java.lang.Object r5 = r5.c()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String[] r1 = android.text.TextUtils.split(r5, r1)
            java.util.List r1 = java.util.Arrays.asList(r1)
            boolean r1 = r1.contains(r13)
            if (r1 != 0) goto L_0x0060
            r1 = 0
            goto L_0x0063
        L_0x0060:
            r1 = 1
            goto L_0x0063
        L_0x0062:
            r1 = 0
        L_0x0063:
            if (r6 == 0) goto L_0x0071
            java.util.Set r5 = defpackage.ozx.a()
            boolean r5 = r5.contains(r13)
            if (r5 == 0) goto L_0x0071
            r5 = 1
            goto L_0x0072
        L_0x0071:
            r5 = 0
        L_0x0072:
            ozc r10 = new ozc
            if (r0 != r12) goto L_0x0078
            r3 = 1
            goto L_0x007c
        L_0x0078:
            if (r1 != 0) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            r3 = 1
        L_0x007c:
            r1 = r10
            r2 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ozb.a(int, java.lang.String, int, java.lang.String):ozc");
    }

    public final boolean b(String str) {
        return "com.google.android.googlequicksearchbox".equals(str) && this.a.b();
    }

    public final boolean e(String str) {
        oyz d = d(str);
        if (d != null) {
            if (!"com.google.android.gms".equals(str)) {
                ozv g = d.g();
                if (g.c() != null) {
                    prp prp = this.a.a;
                    try {
                        if (g.b() >= prp.a.getPackageManager().getPackageInfo(str, 0).lastUpdateTime) {
                            return true;
                        }
                        oso.e("GSAI from package %s is stale.", (Object) str);
                    } catch (PackageManager.NameNotFoundException e) {
                        oso.c((Throwable) e, "Cannot find package %s", str);
                    }
                }
            } else if (!d.h().isEmpty()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public final ozc a(ApplicationInfo applicationInfo) {
        return a(applicationInfo.uid, applicationInfo.packageName, -1);
    }

    public final ozc a(String str) {
        int callingUid = Binder.getCallingUid();
        Context context = this.a.b;
        iva.a((Object) str, (Object) "Package name");
        jhg.c(context, str);
        return a(callingUid, str, -1);
    }
}
