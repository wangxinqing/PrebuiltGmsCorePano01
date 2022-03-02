package defpackage;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDoneException;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import com.google.android.gms.people.api.bg.PeoplePeriodicSyncChimeraGcmTask;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: xej  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class xej {
    private static xej f;
    public final Context a;
    public final wss b;
    public final ycw c;
    private final Object d = new Object();
    private final jiq e;

    public xej(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.e = ycm.a(applicationContext);
        this.b = wss.a(this.a);
        this.c = ybx.a;
    }

    public static Bundle a(boolean z, boolean z2) {
        return a(z, z2, false);
    }

    public static final int b(Bundle bundle) {
        String a2 = ybj.a(bundle);
        if ("plusfeed".equals(a2)) {
            return 1;
        }
        if (!"pluspageadmin".equals(a2)) {
            return (a2 == null || !a2.startsWith("profile")) ? 0 : 4;
        }
        return 2;
    }

    public static final boolean d() {
        xdu.a();
        return ContentResolver.getMasterSyncAutomatically();
    }

    /* access modifiers changed from: package-private */
    public final long c() {
        long cK = aywy.a.a().cK();
        if (cK > 0) {
            long j = this.b.a.getLong("last_known_mutation_time", 0);
            if (j != 0) {
                long a2 = this.e.a();
                long j2 = (cK * 1000) + j;
                if (j <= a2) {
                    return Math.max(0, j2 - a2);
                }
                wss wss = this.b;
                iva.b((String) null);
                wss.a.edit().putLong("last_known_mutation_time", a2).commit();
                return c();
            }
        }
        return 0;
    }

    public final void e(String str, String str2) {
        wus.a(this.a, "PeopleSync", str, str2.length() == 0 ? new String("Contacts sync requested. reason=") : "Contacts sync requested. reason=".concat(str2));
        Bundle a2 = a(false, false);
        a2.putBoolean("gms.people.contacts_sync", true);
        if (!TextUtils.isEmpty(str2)) {
            a2.putString("gms.people.sync_reason", str2);
        }
        Account a3 = this.c.a(this.a, str);
        if (a3 != null) {
            a(a3, "com.google.android.gms.people", a2);
        }
    }

    public static Bundle a(boolean z, boolean z2, boolean z3) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("ignore_settings", true);
        if (ayws.b() && z3) {
            bundle.putBoolean("container_update", true);
        }
        if (z) {
            bundle.putBoolean("ignore_backoff", true);
        }
        if (z2) {
            bundle.putBoolean("expedited", true);
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public final long d(String str, String str2) {
        long a2 = wtw.a(this.a).a(str, str2);
        wtx b2 = wtz.a(this.a).b();
        if (b2 != null) {
            try {
                return b2.b("SELECT last_successful_sync_time FROM owners WHERE _id=?", new String[]{String.valueOf(a2)});
            } catch (SQLiteDoneException e2) {
            }
        }
        return -1;
    }

    static Bundle b() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("periodic_sync", true);
        return bundle;
    }

    private static final boolean b(Account account, String str) {
        xdu.a();
        return ContentResolver.getSyncAutomatically(account, str);
    }

    public final boolean d(String str) {
        Account a2 = this.c.a(this.a, str);
        if (a2 != null) {
            return b(a2, "com.google.android.gms.people");
        }
        return false;
    }

    public final List b(String str) {
        wtx b2 = wtz.a(this.a).b();
        ArrayList arrayList = new ArrayList();
        if (b2 == null) {
            return arrayList;
        }
        Cursor a2 = b2.a("SELECT owner_sync_requests.page_gaia_id,last_sync_start_time FROM owner_sync_requests JOIN owners ON owner_sync_requests.account_name=owners.account_name AND ((owner_sync_requests.page_gaia_id IS NULL AND owners.page_gaia_id IS NULL ) OR owner_sync_requests.page_gaia_id=owners.page_gaia_id) WHERE owner_sync_requests.account_name=? AND owner_sync_requests.page_gaia_id IS NOT NULL AND owner_sync_requests.sync_requested_time>last_sync_start_time ORDER BY owner_sync_requests.sync_requested_time", new String[]{str});
        while (a2.moveToNext()) {
            try {
                arrayList.add(a2.getString(0));
            } finally {
                a2.close();
            }
        }
        return arrayList;
    }

    public static synchronized xej a(Context context) {
        xej xej;
        synchronized (xej.class) {
            if (f == null) {
                f = new xej(context);
            }
            xej = f;
        }
        return xej;
    }

    public final void c(String str) {
        iva.a((Object) str);
        this.b.b(str, 0);
    }

    public static final void a(Account account, String str, int i) {
        xdu.a();
        ContentResolver.setIsSyncable(account, str, i);
    }

    public final boolean c(String str, String str2) {
        if (!d() || !d(str)) {
            return false;
        }
        if (str2 != null) {
            return a(str);
        }
        return true;
    }

    public static final void a(Account account, String str, Bundle bundle) {
        xdu.a();
        ContentResolver.requestSync(account, str, bundle);
    }

    public final boolean b(String str, String str2) {
        return str2 == null && d() && d(str);
    }

    public static final void a(Account account, String str, boolean z) {
        xdu.a();
        ContentResolver.setSyncAutomatically(account, str, z);
    }

    public static boolean a(int i) {
        return i == 1 || (aywp.c() && i == 8);
    }

    public static boolean a(Bundle bundle) {
        return bundle != null && bundle.getBoolean("periodic_gcm", false);
    }

    private final boolean a(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, String str5, boolean z4) {
        boolean z5;
        boolean z6;
        Cursor a2;
        String str6 = str;
        String str7 = str2;
        long j2 = j;
        String str8 = str3;
        String str9 = str4;
        boolean z7 = z3;
        String str10 = str5;
        if (z7) {
            z5 = b(str, str2);
        } else {
            z5 = false;
        }
        boolean z8 = j2 == 0 || !a(str, str2, j);
        wus.a(this.a, "PeopleSync", str6, str7, String.format(Locale.US, "###Sync requested: allowance=%d, needFreshData=%d, ignoreBackoff=%d, skipBecauseOfBackgroundSync=%d, isDisabledByBackgroundSync=%d, client=%s/%s, reason=%s responseMasking=%s", new Object[]{Long.valueOf(j), Integer.valueOf(z8 ? 1 : 0), Integer.valueOf(z ? 1 : 0), Integer.valueOf(z5 ? 1 : 0), Integer.valueOf(z3 ? 1 : 0), str8, str9, str10, Boolean.valueOf(aywy.p())}));
        wml a3 = wml.a();
        Context context = this.a;
        boolean p = aywy.p();
        boolean z9 = z5;
        if (((double) ycm.f.nextFloat()) < aywy.a.a().cU()) {
            aucd o = xmw.l.o();
            xoa a4 = wml.a(context, str6, str7);
            if (o.c) {
                o.c();
                o.c = false;
            }
            xmw xmw = (xmw) o.b;
            a4.getClass();
            xmw.b = a4;
            xmw.a |= 1;
            int b2 = wml.b(str3);
            if (o.c) {
                o.c();
                o.c = false;
            }
            xmw xmw2 = (xmw) o.b;
            xmw2.a |= 2;
            xmw2.c = b2;
            String b3 = ycm.b(str4);
            if (o.c) {
                o.c();
                o.c = false;
            }
            xmw xmw3 = (xmw) o.b;
            b3.getClass();
            int i = xmw3.a | PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            xmw3.a = i;
            xmw3.j = b3;
            int i2 = i | 4;
            xmw3.a = i2;
            xmw3.d = j2;
            int i3 = i2 | 8;
            xmw3.a = i3;
            xmw3.e = z;
            int i4 = i3 | 16;
            xmw3.a = i4;
            xmw3.f = z2;
            int i5 = i4 | 32;
            xmw3.a = i5;
            xmw3.g = z7;
            int i6 = i5 | 64;
            xmw3.a = i6;
            xmw3.h = z8;
            int i7 = i6 | 128;
            xmw3.a = i7;
            z6 = z9;
            xmw3.i = z6;
            xmw3.a = i7 | 512;
            xmw3.k = p;
            xmw xmw4 = (xmw) o.i();
            aucd o2 = xol.w.o();
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            xol xol = (xol) o2.b;
            xmw4.getClass();
            xol.c = xmw4;
            xol.a |= 2;
            boolean b4 = jgu.b(context);
            if (o2.c) {
                o2.c();
                o2.c = false;
            }
            xol xol2 = (xol) o2.b;
            int i8 = xol2.a | 8;
            xol2.a = i8;
            xol2.e = b4;
            xol2.f = 1;
            xol2.a = i8 | 32;
            a3.a(context, o2);
            wmm.a(str6, o2);
        } else {
            boolean z10 = z;
            boolean z11 = z2;
            z6 = z9;
        }
        if (!z8 || z6) {
            return false;
        }
        wtx c2 = wtz.a(this.a).c();
        if (c2 != null) {
            c2.a();
            try {
                String b5 = wtw.a(this.a).b(str6, str7);
                if (!TextUtils.isEmpty(b5)) {
                    a2 = c2.a("SELECT COUNT(*)  FROM owner_sync_requests JOIN owners ON owner_sync_requests.account_name=owners.account_name AND ((owner_sync_requests.page_gaia_id IS NULL AND owners.page_gaia_id IS NULL ) OR owner_sync_requests.page_gaia_id=owners.page_gaia_id) WHERE owners._id=? AND owner_sync_requests.sync_requested_time>owners.last_sync_start_time", new String[]{b5});
                    if (!a2.moveToFirst() || a2.getLong(0) <= 0) {
                        a2.close();
                    } else {
                        c2.b();
                        a2.close();
                        c2.d();
                    }
                }
                c2.a("REPLACE INTO owner_sync_requests (account_name ,page_gaia_id ,sync_requested_time) VALUES (?,?,?)", (Object[]) new String[]{str6, str7, String.valueOf(this.e.a())});
                c2.b();
                c2.d();
            } catch (Throwable th) {
                c2.d();
                throw th;
            }
        }
        Bundle a5 = a(z, z2);
        if (!TextUtils.isEmpty(str3)) {
            a5.putString("gms.people.request_app_id", str8);
        }
        if (!TextUtils.isEmpty(str4)) {
            a5.putString("gms.people.request_package", str9);
        }
        if (!TextUtils.isEmpty(str5)) {
            a5.putString("gms.people.sync_reason", str5);
        }
        a5.putBoolean("page_only", !TextUtils.isEmpty(str2));
        if (z4) {
            a5.putBoolean("user_or_self_requested", true);
        }
        Account a6 = this.c.a(this.a, str6);
        if (a6 == null) {
            return false;
        }
        a(a6, "com.google.android.gms.people", a5);
        return true;
    }

    public final List a(String str, long j) {
        wtx b2 = wtz.a(this.a).b();
        ArrayList arrayList = new ArrayList();
        if (b2 == null) {
            return arrayList;
        }
        Cursor a2 = b2.a("SELECT page_gaia_id FROM owners WHERE account_name=? AND page_gaia_id IS NOT NULL  AND last_successful_sync_time<? ORDER BY last_successful_sync_time", new String[]{str, String.valueOf(this.e.a() - (j * 1000))});
        while (a2.moveToNext()) {
            try {
                arrayList.add(a2.getString(0));
            } finally {
                a2.close();
            }
        }
        return arrayList;
    }

    public final void a() {
        Bundle b2 = b();
        b2.putBoolean("periodic_gcm", true);
        if (d()) {
            anhj a2 = this.c.d(this.a).iterator();
            boolean z = false;
            while (a2.hasNext()) {
                Account account = (Account) a2.next();
                if (b(account, "com.google.android.gms.people")) {
                    String str = account.name;
                    a(account, "com.google.android.gms.people", b2);
                    z = true;
                }
            }
            if (z) {
                return;
            }
        }
        PeoplePeriodicSyncChimeraGcmTask.a(this.a);
        wss wss = this.b;
        iva.b((String) null);
        wss.a.edit().remove("periodic_sync_gcm_flex_seconds").remove("periodic_sync_interval_seconds").remove("periodic_sync_require_charging").remove("periodic_sync_required_network").commit();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0092, code lost:
        if (r0.b.a.getInt("periodic_sync_required_network", 2) == r13) goto L_0x018f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.accounts.Account r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            defpackage.iva.a((java.lang.Object) r21)
            boolean r2 = defpackage.aywp.c()
            if (r2 == 0) goto L_0x0012
            android.os.Bundle r2 = b()
            goto L_0x0014
        L_0x0012:
            android.os.Bundle r2 = android.os.Bundle.EMPTY
        L_0x0014:
            defpackage.xdu.a()
            android.content.Context r3 = r0.a
            ild r4 = new ild
            r4.<init>(r3)
            java.lang.String r3 = "com.google.android.gms.people"
            defpackage.ild.a(r1, r3, r2)
            aywy r2 = defpackage.aywy.a
            ayxk r2 = r2.a()
            boolean r2 = r2.dd()
            java.lang.String r5 = "PeopleSync"
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L_0x0149
            long r8 = defpackage.aywy.f()
            long r10 = defpackage.aywy.g()
            boolean r2 = defpackage.aywy.h()
            long r12 = defpackage.aywy.i()
            int r13 = (int) r12
            r14 = 0
            int r12 = (r10 > r14 ? 1 : (r10 == r14 ? 0 : -1))
            if (r12 > 0) goto L_0x0059
            java.lang.Object[] r2 = new java.lang.Object[r7]
            java.lang.Long r8 = java.lang.Long.valueOf(r10)
            r2[r6] = r8
            java.lang.String r8 = "Invalid periodic sync interval=%d"
            defpackage.xdt.b(r5, r8, r2)
            goto L_0x018f
        L_0x0059:
            wss r12 = r0.b
            android.content.SharedPreferences r12 = r12.a
            java.lang.String r7 = "periodic_sync_gcm_flex_seconds"
            long r16 = r12.getLong(r7, r14)
            java.lang.String r12 = "periodic_sync_required_network"
            java.lang.String r4 = "periodic_sync_require_charging"
            java.lang.String r6 = "periodic_sync_interval_seconds"
            int r18 = (r16 > r8 ? 1 : (r16 == r8 ? 0 : -1))
            if (r18 != 0) goto L_0x0095
            wss r14 = r0.b
            android.content.SharedPreferences r14 = r14.a
            r18 = r8
            r9 = r7
            r7 = 0
            long r7 = r14.getLong(r6, r7)
            int r14 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r14 != 0) goto L_0x0098
            wss r7 = r0.b
            android.content.SharedPreferences r7 = r7.a
            r8 = 0
            boolean r7 = r7.getBoolean(r4, r8)
            if (r7 != r2) goto L_0x0098
            wss r7 = r0.b
            android.content.SharedPreferences r7 = r7.a
            r8 = 2
            int r7 = r7.getInt(r12, r8)
            if (r7 == r13) goto L_0x018f
            goto L_0x0098
        L_0x0095:
            r18 = r8
            r9 = r7
        L_0x0098:
            wss r7 = r0.b
            r8 = 0
            defpackage.iva.b((java.lang.String) r8)
            android.content.SharedPreferences r7 = r7.a
            android.content.SharedPreferences$Editor r7 = r7.edit()
            r14 = r18
            android.content.SharedPreferences$Editor r7 = r7.putLong(r9, r14)
            r7.commit()
            wss r7 = r0.b
            defpackage.iva.b((java.lang.String) r8)
            android.content.SharedPreferences r7 = r7.a
            android.content.SharedPreferences$Editor r7 = r7.edit()
            android.content.SharedPreferences$Editor r6 = r7.putLong(r6, r10)
            r6.commit()
            wss r6 = r0.b
            defpackage.iva.b((java.lang.String) r8)
            android.content.SharedPreferences r6 = r6.a
            android.content.SharedPreferences$Editor r6 = r6.edit()
            android.content.SharedPreferences$Editor r2 = r6.putBoolean(r4, r2)
            r2.commit()
            wss r2 = r0.b
            defpackage.iva.b((java.lang.String) r8)
            android.content.SharedPreferences r2 = r2.a
            android.content.SharedPreferences$Editor r2 = r2.edit()
            android.content.SharedPreferences$Editor r2 = r2.putInt(r12, r13)
            r2.commit()
            android.content.Context r2 = r0.a
            com.google.android.gms.people.api.bg.PeoplePeriodicSyncChimeraGcmTask.a((android.content.Context) r2)
            android.content.Context r2 = r0.a
            qwq r4 = defpackage.wna.a(r2)
            java.util.Random r2 = defpackage.ycm.b((android.content.Context) r2)
            double r6 = r2.nextDouble()
            long r8 = defpackage.aywy.g()
            double r8 = (double) r8
            java.lang.Double.isNaN(r8)
            double r6 = r6 * r8
            long r6 = java.lang.Math.round(r6)
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            long r6 = r2.longValue()
            qxf r2 = new qxf
            r2.<init>()
            java.lang.String r8 = "PeopleOneoffSyncGcmTask"
            r2.k = r8
            java.lang.String r8 = "com.google.android.gms.people.service.bg.PeopleOneoffSyncGcmTask"
            r2.i = r8
            long r8 = defpackage.aywy.i()
            int r9 = (int) r8
            r2.a((int) r9)
            boolean r8 = defpackage.aywy.h()
            boolean r9 = defpackage.axcc.b()
            if (r9 != 0) goto L_0x0133
            boolean r9 = defpackage.aywy.h()
            if (r9 != 0) goto L_0x0133
            r9 = 0
            goto L_0x0134
        L_0x0133:
            r9 = 1
        L_0x0134:
            r2.a(r8, r9)
            r8 = 1
            long r8 = r8 + r6
            r2.a(r6, r8)
            r6 = 1
            r2.b((int) r6)
            qxg r2 = r2.b()
            r4.a((defpackage.qxx) r2)
            goto L_0x018f
        L_0x0149:
            android.content.Context r2 = r0.a
            com.google.android.gms.people.api.bg.PeoplePeriodicSyncChimeraGcmTask.a((android.content.Context) r2)
            aywv r2 = defpackage.aywv.a
            ayww r2 = r2.a()
            boolean r2 = r2.b()
            if (r2 == 0) goto L_0x0161
            android.content.Context r2 = r0.a
            anax r2 = defpackage.ycx.b(r2)
            goto L_0x0169
        L_0x0161:
            ycw r2 = r0.c
            android.content.Context r4 = r0.a
            anax r2 = r2.d(r4)
        L_0x0169:
            anhj r2 = r2.iterator()
        L_0x016d:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x018f
            java.lang.Object r4 = r2.next()
            android.accounts.Account r4 = (android.accounts.Account) r4
            android.os.Bundle r6 = b()
            long r7 = defpackage.aywy.g()
            defpackage.xdu.a()
            android.content.Context r9 = r0.a
            ild r10 = new ild
            r10.<init>(r9)
            defpackage.ild.a(r4, r3, r6, r7)
            goto L_0x016d
        L_0x018f:
            android.content.Context r2 = r0.a
            android.content.ContentResolver r2 = r2.getContentResolver()
            boolean r4 = defpackage.aywp.b()
            java.lang.String r6 = "plusupdates"
            if (r4 != 0) goto L_0x01b2
            defpackage.xdu.a()
            r4 = 2
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.String r7 = "plusfeed"
            r8 = 0
            r4[r8] = r7
            java.lang.String r7 = "pluspageadmin"
            r8 = 1
            r4[r8] = r7
            boolean r1 = defpackage.acup.a(r2, r1, r3, r6, r4)
            goto L_0x01c8
        L_0x01b2:
            aywp r4 = defpackage.aywp.a
            aywq r4 = r4.a()
            boolean r4 = r4.a()
            if (r4 == 0) goto L_0x01cc
            defpackage.xdu.a()
            r4 = 0
            java.lang.String[] r4 = new java.lang.String[r4]
            boolean r1 = defpackage.acup.a(r2, r1, r3, r6, r4)
        L_0x01c8:
            if (r1 != 0) goto L_0x01cb
            goto L_0x01cc
        L_0x01cb:
            return
        L_0x01cc:
            java.lang.String r1 = "Unable to subscribe to feed."
            r0.a((java.lang.String) r5, (java.lang.String) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xej.a(android.accounts.Account):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x02f3: MOVE  (r1v15 java.lang.Exception) = (r35v0 java.lang.Exception)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void a(android.accounts.Account r31, int r32, android.os.Bundle r33, int r34, java.lang.Exception r35, java.util.List r36, long r37, boolean r39, boolean r40, defpackage.amri r41) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            r10 = r35
            r2 = r36
            r3 = 2
            r9 = 0
            r7 = 1
            r4 = r34
            if (r4 != r7) goto L_0x0010
            goto L_0x0078
        L_0x0010:
            android.content.Context r5 = r0.a
            wss r5 = defpackage.wss.a((android.content.Context) r5)
            int r5 = r5.c()
            if (r5 == 0) goto L_0x001f
            if (r5 == r7) goto L_0x0078
            goto L_0x002b
        L_0x001f:
            aywy r5 = defpackage.aywy.a
            ayxk r5 = r5.a()
            boolean r5 = r5.cD()
            if (r5 == 0) goto L_0x0078
        L_0x002b:
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            android.content.Context r6 = r0.a
            java.lang.String r8 = "com.google.android.gms.people.settings.PeopleInternalSettingsActivity"
            android.content.Intent r5 = r5.setClassName(r6, r8)
            android.content.Context r6 = r0.a
            r8 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r5 = android.app.PendingIntent.getActivity(r6, r7, r5, r8)
            je r6 = new je
            android.content.Context r8 = r0.a
            r6.<init>(r8)
            r8 = 17301624(0x1080078, float:2.497959E-38)
            r6.b((int) r8)
            java.lang.String r8 = "People Details sync failed"
            r6.e(r8)
            java.util.Locale r8 = java.util.Locale.US
            java.lang.Object[] r11 = new java.lang.Object[r3]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r34)
            r11[r9] = r12
            java.lang.String r12 = r1.name
            r11[r7] = r12
            java.lang.String r12 = "[%d] %s"
            java.lang.String r8 = java.lang.String.format(r8, r12, r11)
            r6.b((java.lang.CharSequence) r8)
            r6.f = r5
            android.app.Notification r5 = r6.b()
            android.content.Context r6 = r0.a
            iwq r6 = defpackage.iwq.a((android.content.Context) r6)
            r6.a((int) r7, (android.app.Notification) r5)
        L_0x0078:
            wml r8 = defpackage.wml.a()
            android.content.Context r6 = r0.a
            java.lang.String r5 = r1.name
            int r17 = defpackage.ybj.b(r33)
            int r18 = b((android.os.Bundle) r33)
            java.lang.String r16 = defpackage.xen.a((android.os.Bundle) r33)
            int r26 = defpackage.ybi.a(r35)
            wss r11 = r0.b
            java.lang.String r12 = r1.name
            int r27 = r11.f(r12)
            wss r11 = r0.b
            java.lang.String r1 = r1.name
            int r1 = r11.e(r1)
            long r14 = (long) r1
            java.security.SecureRandom r1 = defpackage.ycm.f
            float r1 = r1.nextFloat()
            double r11 = (double) r1
            double r19 = defpackage.aywy.o()
            int r1 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
            if (r1 >= 0) goto L_0x0362
            xny r1 = defpackage.xny.w
            aucd r1 = r1.o()
            r24 = 0
            r11 = r1
            r12 = r6
            r13 = r5
            r28 = r14
            r14 = r41
            r15 = r32
            r19 = r34
            r20 = r37
            r22 = r39
            r23 = r40
            r25 = r36
            defpackage.wml.a(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r23, r24, r25)
            defpackage.xip.a()
            xfs r11 = defpackage.xhm.a
            java.lang.Object r11 = r11.a()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            xfs r12 = defpackage.xhn.a
            java.lang.Object r12 = r12.a()
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            wmn r13 = new wmn
            r13.<init>()
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r16 = r6
            if (r2 == 0) goto L_0x01fe
            int r15 = r36.size()
            r6 = 0
        L_0x00fc:
            if (r6 >= r15) goto L_0x01fe
            java.lang.Object r18 = r2.get(r6)
            r7 = r18
            wmn r7 = (defpackage.wmn) r7
            if (r11 == 0) goto L_0x015a
            long r9 = r13.x
            long r3 = r7.x
            long r9 = r9 + r3
            r13.x = r9
            long r3 = r7.y
            r9 = 0
            r13.y = r9
            long r3 = r7.z
            r13.z = r9
            long r3 = r7.A
            r13.A = r9
            long r3 = r7.B
            r13.B = r9
            long r3 = r7.C
            r13.C = r9
            long r3 = r13.D
            long r9 = r7.D
            long r3 = r3 + r9
            r13.D = r3
            long r3 = r7.E
            r9 = 0
            r13.E = r9
            long r3 = r7.F
            r13.F = r9
            long r3 = r13.H
            long r9 = r7.H
            long r3 = r3 + r9
            r13.H = r3
            long r3 = r7.I
            r9 = 0
            r13.I = r9
            long r3 = r7.J
            r13.J = r9
            long r3 = r7.K
            r13.K = r9
            long r3 = r7.L
            r13.L = r9
            long r3 = r7.M
            r13.M = r9
            long r3 = r13.N
            long r9 = r7.N
            long r3 = r3 + r9
            r13.N = r3
        L_0x015a:
            if (r12 == 0) goto L_0x01f1
            android.util.SparseIntArray r3 = r7.u
            android.util.SparseIntArray r4 = r7.v
            android.util.SparseArray r7 = r7.t
            xnt r9 = defpackage.xnt.f
            aucd r9 = r9.o()
            boolean r10 = r9.c
            if (r10 != 0) goto L_0x016d
            goto L_0x0173
        L_0x016d:
            r9.c()
            r10 = 0
            r9.c = r10
        L_0x0173:
            aucj r10 = r9.b
            xnt r10 = (defpackage.xnt) r10
            r0 = 1
            r10.b = r0
            int r2 = r10.a
            r2 = r2 | r0
            r10.a = r2
            int r2 = r3.get(r0)
            long r2 = (long) r2
            boolean r0 = r9.c
            if (r0 != 0) goto L_0x0189
            goto L_0x018f
        L_0x0189:
            r9.c()
            r0 = 0
            r9.c = r0
        L_0x018f:
            aucj r0 = r9.b
            xnt r0 = (defpackage.xnt) r0
            int r10 = r0.a
            r17 = 2
            r10 = r10 | 2
            r0.a = r10
            r0.c = r2
            r0 = 1
            int r2 = r4.get(r0)
            boolean r0 = r9.c
            if (r0 != 0) goto L_0x01a7
            goto L_0x01ad
        L_0x01a7:
            r9.c()
            r0 = 0
            r9.c = r0
        L_0x01ad:
            aucj r0 = r9.b
            xnt r0 = (defpackage.xnt) r0
            int r3 = r0.a
            r4 = 4
            r3 = r3 | r4
            r0.a = r3
            r0.d = r2
            r0 = 1
            java.lang.Object r2 = r7.get(r0)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x01e7
            java.lang.Object r2 = r7.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r9.c
            if (r3 != 0) goto L_0x01d1
            goto L_0x01d7
        L_0x01d1:
            r9.c()
            r3 = 0
            r9.c = r3
        L_0x01d7:
            aucj r3 = r9.b
            xnt r3 = (defpackage.xnt) r3
            r2.getClass()
            int r4 = r3.a
            r7 = 8
            r4 = r4 | r7
            r3.a = r4
            r3.e = r2
        L_0x01e7:
            aucj r2 = r9.i()
            xnt r2 = (defpackage.xnt) r2
            r14.add(r2)
            goto L_0x01f2
        L_0x01f1:
            r0 = 1
        L_0x01f2:
            int r6 = r6 + 1
            r0 = r30
            r10 = r35
            r2 = r36
            r7 = 1
            r9 = 0
            goto L_0x00fc
        L_0x01fe:
            r0 = 1
            if (r11 == 0) goto L_0x0299
            r2 = r37
            r4 = 2
            xnv r2 = defpackage.wml.c(r4, r2)
            r1.a((defpackage.xnv) r2)
            long r2 = r13.x
            r4 = 3
            xnv r2 = defpackage.wml.c(r4, r2)
            r1.a((defpackage.xnv) r2)
            r2 = 4
            r6 = 0
            xnv r3 = defpackage.wml.c(r2, r6)
            r1.a((defpackage.xnv) r3)
            r2 = 5
            xnv r3 = defpackage.wml.c(r2, r6)
            r1.a((defpackage.xnv) r3)
            r3 = 6
            xnv r9 = defpackage.wml.c(r3, r6)
            r1.a((defpackage.xnv) r9)
            r9 = 7
            xnv r10 = defpackage.wml.c(r9, r6)
            r1.a((defpackage.xnv) r10)
            r10 = 8
            xnv r11 = defpackage.wml.c(r10, r6)
            r1.a((defpackage.xnv) r11)
            r10 = 9
            long r2 = r13.D
            xnv r2 = defpackage.wml.c(r10, r2)
            r1.a((defpackage.xnv) r2)
            r2 = 10
            xnv r2 = defpackage.wml.c(r2, r6)
            r1.a((defpackage.xnv) r2)
            r2 = 11
            xnv r2 = defpackage.wml.c(r2, r6)
            r1.a((defpackage.xnv) r2)
            long r2 = r13.H
            r10 = 2
            xns r2 = defpackage.wml.d(r10, r2)
            r1.a((defpackage.xns) r2)
            xns r2 = defpackage.wml.d(r4, r6)
            r1.a((defpackage.xns) r2)
            r10 = 4
            xns r2 = defpackage.wml.d(r10, r6)
            r1.a((defpackage.xns) r2)
            r2 = 5
            xns r2 = defpackage.wml.d(r2, r6)
            r1.a((defpackage.xns) r2)
            r2 = 6
            xns r2 = defpackage.wml.d(r2, r6)
            r1.a((defpackage.xns) r2)
            xns r2 = defpackage.wml.d(r9, r6)
            r1.a((defpackage.xns) r2)
            long r2 = r13.N
            r4 = 8
            xns r2 = defpackage.wml.d(r4, r2)
            r1.a((defpackage.xns) r2)
            goto L_0x029a
        L_0x0299:
            r10 = 4
        L_0x029a:
            if (r12 != 0) goto L_0x029e
            r9 = 0
            goto L_0x02c3
        L_0x029e:
            boolean r2 = r1.c
            if (r2 != 0) goto L_0x02a4
            r9 = 0
            goto L_0x02aa
        L_0x02a4:
            r1.c()
            r9 = 0
            r1.c = r9
        L_0x02aa:
            aucj r2 = r1.b
            xny r2 = (defpackage.xny) r2
            aucx r3 = r2.v
            boolean r3 = r3.a()
            if (r3 != 0) goto L_0x02be
            aucx r3 = r2.v
            aucx r3 = defpackage.aucj.a((defpackage.aucx) r3)
            r2.v = r3
        L_0x02be:
            aucx r2 = r2.v
            defpackage.auab.a((java.lang.Iterable) r14, (java.util.List) r2)
        L_0x02c3:
            r6 = 0
            r11 = 0
            r12 = r1
            r2 = r34
            r3 = r26
            r4 = r35
            r13 = r5
            r5 = r27
            r10 = r16
            r14 = 4
            r0 = r8
            r15 = 1
            r7 = r28
            r15 = 0
            r9 = r11
            defpackage.wml.a(r1, r2, r3, r4, r5, r6, r7, r9)
            defpackage.xip.a()
            aywy r1 = defpackage.aywy.a
            ayxk r1 = r1.a()
            boolean r1 = r1.bU()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x02f3
            goto L_0x0315
        L_0x02f3:
            r1 = r35
            if (r1 == 0) goto L_0x0315
            yde r2 = defpackage.yde.a
            ydd r2 = r2.a(r10)
            defpackage.xip.a()
            aywy r3 = defpackage.aywy.a
            ayxk r3 = r3.a()
            double r3 = r3.bV()
            java.lang.Double r3 = java.lang.Double.valueOf(r3)
            double r3 = r3.doubleValue()
            r2.a(r1, r3)
        L_0x0315:
            xol r1 = defpackage.xol.w
            aucd r1 = r1.o()
            boolean r2 = r1.c
            if (r2 != 0) goto L_0x0320
            goto L_0x0325
        L_0x0320:
            r1.c()
            r1.c = r15
        L_0x0325:
            aucj r2 = r1.b
            xol r2 = (defpackage.xol) r2
            aucj r3 = r12.i()
            xny r3 = (defpackage.xny) r3
            r3.getClass()
            r2.d = r3
            int r3 = r2.a
            r3 = r3 | r14
            r2.a = r3
            boolean r2 = defpackage.jgu.b((android.content.Context) r10)
            boolean r3 = r1.c
            if (r3 != 0) goto L_0x0342
            goto L_0x0347
        L_0x0342:
            r1.c()
            r1.c = r15
        L_0x0347:
            aucj r3 = r1.b
            xol r3 = (defpackage.xol) r3
            int r4 = r3.a
            r5 = 8
            r4 = r4 | r5
            r3.a = r4
            r3.e = r2
            r2 = 1
            r3.f = r2
            r2 = r4 | 32
            r3.a = r2
            r0.a((android.content.Context) r10, (defpackage.aucd) r1)
            defpackage.wmm.a(r13, r1)
            return
        L_0x0362:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xej.a(android.accounts.Account, int, android.os.Bundle, int, java.lang.Exception, java.util.List, long, boolean, boolean, amri):void");
    }

    public final void a(Account account, String str) {
        a(account != null ? account.name : null, str);
    }

    public final void a(String str, String str2) {
        wus.a(this.a, "PeopleSync", str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.d
            monitor-enter(r0)
            wss r1 = r6.b     // Catch:{ all -> 0x0081 }
            android.content.SharedPreferences r1 = r1.a     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = "is_first_sync"
            r3 = 1
            boolean r1 = r1.getBoolean(r2, r3)     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x007f
            java.lang.String r1 = "First sync"
            r2 = 0
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0081 }
            r6.a((java.lang.String) r2, (java.lang.String) r1)     // Catch:{ all -> 0x0081 }
            ycw r1 = r6.c     // Catch:{ all -> 0x0081 }
            android.content.Context r2 = r6.a     // Catch:{ all -> 0x0081 }
            anax r1 = r1.d(r2)     // Catch:{ all -> 0x0081 }
            anhj r1 = r1.iterator()     // Catch:{ all -> 0x0081 }
        L_0x0024:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0081 }
            if (r2 == 0) goto L_0x0046
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0081 }
            android.accounts.Account r2 = (android.accounts.Account) r2     // Catch:{ all -> 0x0081 }
            java.lang.String r4 = "com.google.android.gms.people"
            a((android.accounts.Account) r2, (java.lang.String) r4, (int) r3)     // Catch:{ all -> 0x0081 }
            java.lang.String r4 = "com.android.contacts"
            boolean r4 = b((android.accounts.Account) r2, (java.lang.String) r4)     // Catch:{ all -> 0x0081 }
            java.lang.String r5 = "com.google.android.gms.people"
            a((android.accounts.Account) r2, (java.lang.String) r5, (boolean) r4)     // Catch:{ all -> 0x0081 }
            if (r4 == 0) goto L_0x0024
            r6.a((android.accounts.Account) r2)     // Catch:{ all -> 0x0081 }
            goto L_0x0024
        L_0x0046:
            wss r1 = r6.b     // Catch:{ all -> 0x0081 }
            r1.a()     // Catch:{ all -> 0x0081 }
            if (r7 == 0) goto L_0x007d
            android.content.Context r7 = r6.a     // Catch:{ all -> 0x0081 }
            java.lang.String r1 = "PeopleSync"
            java.lang.String r2 = "requestAllFullSyncForContainerUpgrade"
            defpackage.wus.b(r7, r1, r2)     // Catch:{ all -> 0x0081 }
            ycw r7 = r6.c     // Catch:{ all -> 0x0081 }
            android.content.Context r1 = r6.a     // Catch:{ all -> 0x0081 }
            anax r7 = r7.d(r1)     // Catch:{ all -> 0x0081 }
            anhj r7 = r7.iterator()     // Catch:{ all -> 0x0081 }
        L_0x0062:
            boolean r1 = r7.hasNext()     // Catch:{ all -> 0x0081 }
            if (r1 == 0) goto L_0x007d
            java.lang.Object r1 = r7.next()     // Catch:{ all -> 0x0081 }
            android.accounts.Account r1 = (android.accounts.Account) r1     // Catch:{ all -> 0x0081 }
            java.lang.String r2 = "com.google.android.gms.people"
            boolean r3 = defpackage.ayws.b()     // Catch:{ all -> 0x0081 }
            r4 = 0
            android.os.Bundle r3 = a((boolean) r4, (boolean) r4, (boolean) r3)     // Catch:{ all -> 0x0081 }
            a((android.accounts.Account) r1, (java.lang.String) r2, (android.os.Bundle) r3)     // Catch:{ all -> 0x0081 }
            goto L_0x0062
        L_0x007d:
            monitor-exit(r0)     // Catch:{ all -> 0x0081 }
            return
        L_0x007f:
            monitor-exit(r0)     // Catch:{ all -> 0x0081 }
            return
        L_0x0081:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0081 }
            goto L_0x0085
        L_0x0084:
            throw r7
        L_0x0085:
            goto L_0x0084
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xej.a(boolean):void");
    }

    public final boolean a(String str) {
        wtx b2 = wtz.a(this.a).b();
        if (b2 != null) {
            if (b2.a("SELECT count(1) FROM owners WHERE account_name=? AND page_gaia_id IS NOT NULL", new String[]{str}, 0) <= aywy.a.a().cm()) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(String str, String str2, long j) {
        long d2 = d(str, str2);
        if (d2 == -1) {
            Log.w("PeopleSync", "requestSync: Owner doesn't exist");
            return true;
        } else if (d2 < this.e.a() - (j * 1000)) {
            return false;
        } else {
            return true;
        }
    }

    public final boolean a(String str, String str2, long j, String str3, String str4, boolean z, String str5) {
        return a(str, str2, Math.max(j, aywy.a.a().au()), str3, str4, false, false, z, str5, false);
    }

    public final boolean a(String str, String str2, String str3, String str4, boolean z, String str5) {
        return a(str, str2, 0, str3, str4, true, true, z, str5, true);
    }
}
