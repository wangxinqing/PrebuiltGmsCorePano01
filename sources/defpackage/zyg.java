package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.R;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: zyg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class zyg {
    public static final zsg c = zsg.a("CRSPresenter");
    public final ContactsRestoreSettingsChimeraActivity a;
    public final zxq b;
    final zwl d;
    public final gst e;
    private final boolean f;
    private final aoru g = new jfz(1, 9);
    private final zrt h;

    public zyg(ContactsRestoreSettingsChimeraActivity contactsRestoreSettingsChimeraActivity, zxq zxq) {
        this.a = contactsRestoreSettingsChimeraActivity;
        this.b = zxq;
        new zru(contactsRestoreSettingsChimeraActivity.getApplicationContext());
        this.d = zwl.a();
        this.f = azfh.c();
        this.e = gso.a(contactsRestoreSettingsChimeraActivity);
        this.h = new zrt(contactsRestoreSettingsChimeraActivity.getApplicationContext());
    }

    public final String a() {
        zxq zxq = this.b;
        zxq.a(zxq.a.getString("restore:restore_account_name", (String) null));
        String str = this.b.b;
        if (zyk.a((Context) this.a, str)) {
            return str;
        }
        ArrayList arrayList = new ArrayList(zrr.b(this.a));
        if (!arrayList.isEmpty()) {
            return (String) arrayList.get(0);
        }
        return null;
    }

    public final void b(String str) {
        this.d.e = str;
        this.a.a(true);
        c.b("Prepare fetching available backups");
        if (zsh.b(str)) {
            this.a.a((List) null);
            this.a.a(false);
            return;
        }
        zsi.a().a(true, false, 0, 0);
        acwa a2 = zrc.a(this.a).a((ihb) new zrk(str, ""));
        a2.a((acvv) new zyf(this.a, this, str));
        a2.a((acvs) new zye(this.a));
        if (this.f) {
            acwa a3 = a2.a((Executor) this.g, (acvz) new zxr(this));
            a3.a(zxt.a);
            acwa a4 = this.h.a();
            acwa a5 = a4.a((acvz) new zxu(this, str));
            a4.a(zxv.a);
            a5.a((acvs) new zxw(this, str));
            acwa a6 = a5.a((Executor) this.g, (acvz) new zxx());
            a6.a(zxy.a);
            acwa a7 = acws.b((Collection) Arrays.asList(new acwa[]{a6, a3})).a((acvz) new zxz());
            a7.a((acvv) new zya(this, str));
            a7.a((acvs) new zyb(this));
        }
    }

    public final List a(List list) {
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, zxs.a);
        return arrayList;
    }

    public final void a(Exception exc) {
        if (!(exc instanceof ibr)) {
            zsi.a().a(4);
            this.a.a((int) R.string.common_something_went_wrong);
        } else if (((ibr) exc).a() == Status.e.i) {
            c.b("Ignore the CANCELED exception");
        }
    }

    public final void a(String str) {
        if (TextUtils.isEmpty(str)) {
            zsi.a().a("CRSP.opened_settings_with_no_account");
        }
        this.b.a(str);
        this.a.a(this.b.b);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f1, code lost:
        if (r5.e > 0) goto L_0x00f3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r11, java.util.List r12, java.util.List r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            zsi r0 = defpackage.zsi.a()     // Catch:{ all -> 0x0170 }
            zxq r1 = r10.b     // Catch:{ all -> 0x0170 }
            java.lang.String r1 = r1.b     // Catch:{ all -> 0x0170 }
            boolean r1 = android.text.TextUtils.equals(r11, r1)     // Catch:{ all -> 0x0170 }
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x0016
            r0.a((boolean) r3, (boolean) r2, (int) r3, (int) r3)     // Catch:{ all -> 0x0170 }
            monitor-exit(r10)
            return
        L_0x0016:
            boolean r1 = defpackage.azfh.c()     // Catch:{ all -> 0x0170 }
            if (r1 == 0) goto L_0x0062
            zxq r12 = r10.b     // Catch:{ all -> 0x0170 }
            if (r13 != 0) goto L_0x0022
            goto L_0x009a
        L_0x0022:
            boolean r1 = r13.isEmpty()     // Catch:{ all -> 0x0170 }
            if (r1 != 0) goto L_0x009a
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x0170 }
            r1.<init>()     // Catch:{ all -> 0x0170 }
            java.util.Map r12 = r12.c     // Catch:{ all -> 0x0170 }
            r12.put(r11, r1)     // Catch:{ all -> 0x0170 }
            java.util.Iterator r12 = r13.iterator()     // Catch:{ all -> 0x0170 }
        L_0x0036:
            boolean r13 = r12.hasNext()     // Catch:{ all -> 0x0170 }
            if (r13 == 0) goto L_0x009a
            java.lang.Object r13 = r12.next()     // Catch:{ all -> 0x0170 }
            zyi r13 = (defpackage.zyi) r13     // Catch:{ all -> 0x0170 }
            boolean r4 = r13.a()     // Catch:{ all -> 0x0170 }
            if (r4 != 0) goto L_0x004c
            int r4 = r13.d     // Catch:{ all -> 0x0170 }
            if (r4 <= 0) goto L_0x0036
        L_0x004c:
            boolean r4 = defpackage.azfh.c()     // Catch:{ all -> 0x0170 }
            if (r4 != 0) goto L_0x005a
            zsg r13 = defpackage.zxq.d     // Catch:{ all -> 0x0170 }
            java.lang.String r4 = "updateContactsRestoreSources should only be called after enableEncryptedRestoreFromSettings is enabled."
            r13.d(r4)     // Catch:{ all -> 0x0170 }
            goto L_0x0036
        L_0x005a:
            java.lang.String r4 = defpackage.zyk.a((defpackage.zyi) r13)     // Catch:{ all -> 0x0170 }
            r1.put(r4, r13)     // Catch:{ all -> 0x0170 }
            goto L_0x0036
        L_0x0062:
            zxq r13 = r10.b     // Catch:{ all -> 0x0170 }
            if (r12 == 0) goto L_0x009a
            boolean r1 = r12.isEmpty()     // Catch:{ all -> 0x0170 }
            if (r1 != 0) goto L_0x009a
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x0170 }
            r1.<init>()     // Catch:{ all -> 0x0170 }
            java.util.Map r4 = r13.c     // Catch:{ all -> 0x0170 }
            r4.put(r11, r1)     // Catch:{ all -> 0x0170 }
            java.util.Iterator r12 = r12.iterator()     // Catch:{ all -> 0x0170 }
        L_0x007a:
            boolean r4 = r12.hasNext()     // Catch:{ all -> 0x0170 }
            if (r4 == 0) goto L_0x009a
            java.lang.Object r4 = r12.next()     // Catch:{ all -> 0x0170 }
            com.google.android.gms.romanesco.protomodel.BackedUpContactsPerDeviceEntity r4 = (com.google.android.gms.romanesco.protomodel.BackedUpContactsPerDeviceEntity) r4     // Catch:{ all -> 0x0170 }
            java.util.List r5 = r4.c()     // Catch:{ all -> 0x0170 }
            if (r5 == 0) goto L_0x007a
            zyi r4 = r13.a((com.google.android.gms.romanesco.protomodel.BackedUpContactsPerDeviceEntity) r4)     // Catch:{ all -> 0x0170 }
            int r5 = r4.d     // Catch:{ all -> 0x0170 }
            if (r5 <= 0) goto L_0x007a
            java.lang.String r5 = r4.a     // Catch:{ all -> 0x0170 }
            r1.put(r5, r4)     // Catch:{ all -> 0x0170 }
            goto L_0x007a
        L_0x009a:
            zxq r12 = r10.b     // Catch:{ all -> 0x0170 }
            java.util.Map r12 = r12.b(r11)     // Catch:{ all -> 0x0170 }
            if (r12 == 0) goto L_0x0161
            boolean r13 = r12.isEmpty()     // Catch:{ all -> 0x0170 }
            if (r13 == 0) goto L_0x00aa
            goto L_0x0161
        L_0x00aa:
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0170 }
            java.util.Collection r12 = r12.values()     // Catch:{ all -> 0x0170 }
            r13.<init>(r12)     // Catch:{ all -> 0x0170 }
            java.util.List r12 = r10.a((java.util.List) r13)     // Catch:{ all -> 0x0170 }
            int r13 = r12.size()     // Catch:{ all -> 0x0170 }
            r1 = 0
            r4 = 0
        L_0x00bd:
            if (r1 < r13) goto L_0x00dc
            int r13 = r12.size()     // Catch:{ all -> 0x0170 }
            r0.a((int) r13, (int) r4)     // Catch:{ all -> 0x0170 }
            r13 = 2
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch:{ all -> 0x0170 }
            r13[r3] = r11     // Catch:{ all -> 0x0170 }
            int r11 = r12.size()     // Catch:{ all -> 0x0170 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x0170 }
            r13[r2] = r11     // Catch:{ all -> 0x0170 }
            com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity r11 = r10.a     // Catch:{ all -> 0x0170 }
            r11.a((java.util.List) r12)     // Catch:{ all -> 0x0170 }
            monitor-exit(r10)
            return
        L_0x00dc:
            java.lang.Object r5 = r12.get(r1)     // Catch:{ all -> 0x0170 }
            zyi r5 = (defpackage.zyi) r5     // Catch:{ all -> 0x0170 }
            boolean r6 = defpackage.azfh.c()     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x00ef
            boolean r6 = r5.a()     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x00ef
            goto L_0x00f3
        L_0x00ef:
            int r6 = r5.e     // Catch:{ all -> 0x0170 }
            if (r6 <= 0) goto L_0x00f5
        L_0x00f3:
            int r4 = r4 + 1
        L_0x00f5:
            boolean r6 = defpackage.azfh.c()     // Catch:{ all -> 0x0170 }
            r7 = 2131953811(0x7f130893, float:1.9544104E38)
            if (r6 == 0) goto L_0x0145
            boolean r6 = r5.a()     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x0129
            com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity r6 = r10.a     // Catch:{ all -> 0x0170 }
            android.content.Context r6 = r6.getApplicationContext()     // Catch:{ all -> 0x0170 }
            amri r6 = defpackage.zru.a((android.content.Context) r6)     // Catch:{ all -> 0x0170 }
            java.lang.Object r6 = r6.c()     // Catch:{ all -> 0x0170 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x011f
            long r8 = r6.longValue()     // Catch:{ all -> 0x0170 }
            java.lang.String r6 = java.lang.Long.toString(r8)     // Catch:{ all -> 0x0170 }
            goto L_0x0131
        L_0x011f:
            zsg r6 = c     // Catch:{ all -> 0x0170 }
            java.lang.String r8 = "Count not retrieve current device android Id"
            r6.d(r8)     // Catch:{ all -> 0x0170 }
            java.lang.String r6 = ""
            goto L_0x0131
        L_0x0129:
            java.lang.String r6 = defpackage.zru.a((java.lang.String) r11)     // Catch:{ all -> 0x0170 }
            java.lang.String r6 = defpackage.amrk.b(r6)     // Catch:{ all -> 0x0170 }
        L_0x0131:
            java.lang.String r8 = defpackage.zyk.a((defpackage.zyi) r5)     // Catch:{ all -> 0x0170 }
            boolean r6 = r6.equals(r8)     // Catch:{ all -> 0x0170 }
            if (r6 != 0) goto L_0x013c
            goto L_0x015d
        L_0x013c:
            com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity r6 = r10.a     // Catch:{ all -> 0x0170 }
            java.lang.String r6 = r6.getString(r7)     // Catch:{ all -> 0x0170 }
            r5.k = r6     // Catch:{ all -> 0x0170 }
            goto L_0x015d
        L_0x0145:
            java.lang.String r6 = defpackage.zru.a((java.lang.String) r11)     // Catch:{ all -> 0x0170 }
            java.lang.String r6 = defpackage.amrk.b(r6)     // Catch:{ all -> 0x0170 }
            java.lang.String r8 = r5.a     // Catch:{ all -> 0x0170 }
            boolean r6 = r6.equals(r8)     // Catch:{ all -> 0x0170 }
            if (r6 == 0) goto L_0x015d
            com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity r6 = r10.a     // Catch:{ all -> 0x0170 }
            java.lang.String r6 = r6.getString(r7)     // Catch:{ all -> 0x0170 }
            r5.k = r6     // Catch:{ all -> 0x0170 }
        L_0x015d:
            int r1 = r1 + 1
            goto L_0x00bd
        L_0x0161:
            com.google.android.gms.romanesco.restoresettings.ContactsRestoreSettingsChimeraActivity r12 = r10.a     // Catch:{ all -> 0x0170 }
            r13 = 0
            r12.a((java.util.List) r13)     // Catch:{ all -> 0x0170 }
            java.lang.Object[] r12 = new java.lang.Object[r2]     // Catch:{ all -> 0x0170 }
            r12[r3] = r11     // Catch:{ all -> 0x0170 }
            r0.a((int) r3, (int) r3)     // Catch:{ all -> 0x0170 }
            monitor-exit(r10)
            return
        L_0x0170:
            r11 = move-exception
            monitor-exit(r10)
            goto L_0x0174
        L_0x0173:
            throw r11
        L_0x0174:
            goto L_0x0173
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zyg.a(java.lang.String, java.util.List, java.util.List):void");
    }
}
