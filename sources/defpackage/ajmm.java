package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.android.location.reporting.service.ReportingSyncChimeraService;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.reporting.state.update.ReportingConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: ajmm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajmm implements SharedPreferences.OnSharedPreferenceChangeListener {
    public static boolean e = false;
    public static final Object f = new Object();
    private static WeakReference g = new WeakReference((Object) null);
    public final ajmr a;
    public final ajmp b;
    public final ahya c;
    public final ajmx d;
    private final Random h;
    private final Map i;
    private final Map j;
    private final Context k;
    private final ajnm l;
    private List m = null;

    private ajmm(ajmr ajmr, ajmp ajmp, ajmx ajmx, ahya ahya, Random random, Context context, ajnm ajnm) {
        this.a = ajmr;
        this.b = ajmp;
        this.d = ajmx;
        this.c = ahya;
        this.h = random;
        this.i = new HashMap();
        this.j = new HashMap();
        this.k = context;
        this.l = ajnm;
        ajmr.b.registerOnSharedPreferenceChangeListener(this);
        ajmp.a.registerOnSharedPreferenceChangeListener(this);
        this.m = new ArrayList();
        for (Account ajmu : ((ahxz) this.c).b) {
            this.m.add(new ajmu(ajmu, this.b));
        }
        if (this.b.a.getInt("disable_ulr_key", -1) == -1) {
            c();
        }
    }

    public static ajmm a(Context context) {
        ajmm ajmm;
        synchronized (f) {
            ajmm = (ajmm) g.get();
            if (ajmm == null) {
                ajnm ajnm = new ajnm(context);
                ahxz a2 = ahxz.a(context);
                ajmx ajmx = new ajmx(context);
                ajmm = new ajmm(new ajmr(context, context.getSharedPreferences("ULR_USER_PREFS", 0), ajmx, a2), ajmp.a(context), ajmx, a2, new Random(), context, ajnm);
                g = new WeakReference(ajmm);
            }
            ajmm.b(context);
        }
        return ajmm;
    }

    private final boolean h(Account account) {
        boolean z;
        synchronized (f) {
            z = true;
            if (!this.a.q(account)) {
                ajmp ajmp = this.b;
                if (!ajmp.a.contains(ajmp.c(account)) && !ajmp.a.contains(ajmp.b(account)) && !ajmp.a.contains(ajmp.e(account))) {
                    if (!ajmp.a.contains(ajmp.f(account))) {
                        z = false;
                    }
                }
            }
        }
        return z;
    }

    public final boolean a(boolean z) {
        return this.b.a(z ? 1 : 0, "wifi_enabled_key");
    }

    public final int b(Account account) {
        int intValue;
        d(account);
        synchronized (f) {
            Integer a2 = this.b.a(account);
            if (a2 == null) {
                a2 = Integer.valueOf(this.h.nextInt());
                if (!e) {
                    String valueOf = String.valueOf(a2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47);
                    sb.append("Create new device tag of ");
                    sb.append(valueOf);
                    sb.append(" without device reboot");
                    ajix.b("GCoreUlr", 65538, sb.toString());
                } else {
                    String valueOf2 = String.valueOf(a2);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 46);
                    sb2.append("Create new device tag of ");
                    sb2.append(valueOf2);
                    sb2.append(" after device reboot.");
                    ajix.b("GCoreUlr", 65537, sb2.toString());
                    e = false;
                }
                ajmp ajmp = this.b;
                int intValue2 = a2.intValue();
                if (ajmp.a(account) != null) {
                    String a3 = rmp.a(account);
                    StringBuilder sb3 = new StringBuilder(String.valueOf(a3).length() + 62);
                    sb3.append("Assigning new device tag to account ");
                    sb3.append(a3);
                    sb3.append(" with existing device tag.");
                    ajix.c("GCoreUlr", 22, sb3.toString());
                }
                String c2 = ajmp.c(account);
                SharedPreferences.Editor edit = ajmp.a.edit();
                edit.putInt(c2, intValue2);
                edit.apply();
                c(account);
                if (this.b.a(account) != null) {
                    if (this.b.a(account).intValue() == a2.intValue()) {
                    }
                }
                String valueOf3 = String.valueOf(rmp.a(account));
                ajix.b("GCoreUlr", 65536, valueOf3.length() == 0 ? new String("GcmId shared preference save error for account ") : "GcmId shared preference save error for account ".concat(valueOf3));
            }
            intValue = a2.intValue();
        }
        return intValue;
    }

    public final void c(Account account) {
        synchronized (f) {
            ajmp ajmp = this.b;
            String e2 = ajmp.e(account);
            if (ajmp.a.contains(e2)) {
                SharedPreferences.Editor edit = ajmp.a.edit();
                edit.remove(e2);
                edit.apply();
                String valueOf = String.valueOf(rmp.a(account));
                ajix.a("GCoreUlr", valueOf.length() == 0 ? new String("Cleared GCM upload time for ") : "Cleared GCM upload time for ".concat(valueOf));
            }
            ReportingSyncChimeraService.a(account, "GcmIdChanged", this.k);
        }
    }

    public final boolean e(Account account) {
        return this.a.b.getBoolean(ajmr.s(account), false);
    }

    public final int f(Account account) {
        ajmu ajmu;
        if (account == null) {
            return -1;
        }
        List list = this.m;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                ajmu = null;
                break;
            }
            ajmu = (ajmu) list.get(i2);
            i2++;
            if (account.equals(ajmu.c)) {
                break;
            }
        }
        if (ajmu == null) {
            ajmu = new ajmu(account, this.b);
            this.m.add(ajmu);
        }
        if (ajmu.b == 0) {
            ajmp ajmp = ajmu.d;
            int i3 = ajmp.a.getInt(ajmp.d(ajmu.c), 0);
            ajmu.b = i3;
            int i4 = i3 + 1;
            ajmu.b = i4;
            synchronized (ajmu.e) {
                ajmp ajmp2 = ajmu.d;
                String d2 = ajmp.d(ajmu.c);
                SharedPreferences.Editor edit = ajmp2.a.edit();
                edit.putInt(d2, i4);
                edit.apply();
            }
        }
        return ajmu.b;
    }

    public final int g(Account account) {
        ajmu ajmu;
        List list = this.m;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                ajmu = null;
                break;
            }
            ajmu = (ajmu) list.get(i2);
            i2++;
            if (account.equals(ajmu.c)) {
                break;
            }
        }
        if (ajmu == null) {
            ajmu = new ajmu(account, this.b);
            this.m.add(ajmu);
        }
        int i3 = ajmu.a;
        ajmu.a = i3 + 1;
        return i3;
    }

    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        synchronized (f) {
            Object obj = sharedPreferences.getAll().get(str);
            if (this.i.containsKey(str)) {
                Object obj2 = this.i.get(str);
                if (obj2 != obj) {
                    if (obj2 != null) {
                        if (obj2.equals(obj)) {
                        }
                        this.i.put(str, obj);
                        this.j.clear();
                    }
                }
            }
            this.i.put(str, obj);
            this.j.clear();
        }
    }

    public final void d(Account account) {
        int i2 = Build.VERSION.SDK_INT;
        synchronized (f) {
            if (!h(account)) {
                ahya ahya = this.c;
                int i3 = Build.VERSION.SDK_INT;
                qub qub = ((ahxz) ahya).a;
                amkr a2 = amlv.a("AccountManager.getPreviousName");
                try {
                    String previousName = qub.a.getPreviousName(account);
                    if (a2 != null) {
                        a2.close();
                    }
                    if (previousName != null) {
                        Account account2 = new Account(previousName, account.type);
                        if (h(account2)) {
                            String a3 = rmp.a(account2);
                            String a4 = rmp.a(account);
                            StringBuilder sb = new StringBuilder(String.valueOf(a3).length() + 21 + String.valueOf(a4).length());
                            sb.append("Renaming account ");
                            sb.append(a3);
                            sb.append(" to ");
                            sb.append(a4);
                            ajix.b("GCoreUlr", sb.toString());
                            synchronized (f) {
                                ajmr ajmr = this.a;
                                SharedPreferences.Editor edit = ajmr.b.edit();
                                ajnw.b(ajmr.b, ajmr.a(account2), ajmr.a(account), edit);
                                ajnw.b(ajmr.b, ajmr.g(account2), ajmr.g(account), edit);
                                ajnw.a(ajmr.b, ajmr.j(account2), ajmr.j(account), edit);
                                ajnw.b(ajmr.b, ajmr.k(account2), ajmr.k(account), edit);
                                ajnw.a(ajmr.b, ajmr.n(account2), ajmr.n(account), edit);
                                ajnw.d(ajmr.b, ajmr.b(account2), ajmr.b(account), edit);
                                ajnw.d(ajmr.b, ajmr.c(account2), ajmr.c(account), edit);
                                ajnw.c(ajmr.b, ajmr.e(account2), ajmr.e(account), edit);
                                ajnw.b(ajmr.b, ajmr.o(account2), ajmr.o(account), edit);
                                ajnw.c(ajmr.b, ajmr.f(account2), ajmr.f(account), edit);
                                edit.apply();
                                ajmq.b(account2);
                                ajnw.a(ajmr.b, account2);
                                ajmp ajmp = this.b;
                                SharedPreferences.Editor edit2 = ajmp.a.edit();
                                ajnw.c(ajmp.a, ajmp.c(account2), ajmp.c(account), edit2);
                                ajnw.d(ajmp.a, ajmp.b(account2), ajmp.b(account), edit2);
                                ajnw.d(ajmp.a, ajmp.e(account2), ajmp.e(account), edit2);
                                ajnw.d(ajmp.a, ajmp.f(account2), ajmp.f(account), edit2);
                                ajnw.b(ajmp.a, ajmp.g(account2), ajmp.g(account), edit2);
                                edit2.apply();
                                ajmq.b(account2);
                                ajnw.a(ajmp.a, account2);
                            }
                        }
                    }
                } catch (Throwable th) {
                    apev.a(th, th);
                }
            }
        }
        return;
        throw th;
    }

    public final void c(Account account, boolean z) {
        ajmr ajmr = this.a;
        String u = ajmr.u(account);
        SharedPreferences.Editor edit = ajmr.b.edit();
        edit.putBoolean(u, z);
        edit.apply();
    }

    public final boolean c() {
        return this.b.a(aztb.m() ? 1 : 0, "disable_ulr_key");
    }

    public final AccountConfig a(Account account) {
        AccountConfig accountConfig;
        Long l2;
        d(account);
        int b2 = b(account);
        synchronized (f) {
            Map map = this.j;
            Integer valueOf = Integer.valueOf(b2);
            accountConfig = (AccountConfig) map.get(valueOf);
            if (accountConfig != null) {
                ajmr ajmr = this.a;
                if (accountConfig.d == ajmr.d.a(accountConfig.a) && accountConfig.m.equals(ajmr.c.a())) {
                }
            }
            ajms a2 = AccountConfig.a(account);
            this.a.a(account, a2);
            ajmp ajmp = this.b;
            String e2 = ajmp.e(account);
            Long l3 = null;
            if (ajmp.a.contains(e2)) {
                l2 = Long.valueOf(ajmp.a.getLong(e2, 0));
            } else {
                l2 = null;
            }
            a2.p = l2;
            String f2 = ajmp.f(account);
            if (ajmp.a.contains(f2)) {
                l3 = Long.valueOf(ajmp.a.getLong(f2, 0));
            }
            a2.q = l3;
            a2.a(ajmp.a.getBoolean(ajmp.g(account), true));
            a2.a(b2);
            accountConfig = a2.a();
            this.j.put(valueOf, accountConfig);
        }
        return accountConfig;
    }

    public final void b() {
        for (Account d2 : ((ahxz) this.c).b) {
            d(d2);
        }
    }

    public final void b(Account account, boolean z) {
        ajmr ajmr = this.a;
        String t = ajmr.t(account);
        SharedPreferences.Editor edit = ajmr.b.edit();
        edit.putBoolean(t, z);
        edit.apply();
    }

    public final boolean b(Context context) {
        return this.b.a(rns.c(context), "location_enabled_key");
    }

    public final boolean b(boolean z) {
        return this.b.a(z ? 1 : 0, "Location_airplane_mode_enabled_key");
    }

    public final ReportingConfig a() {
        ReportingConfig reportingConfig;
        b();
        synchronized (f) {
            ArrayList arrayList = new ArrayList();
            for (Account a2 : ((ahxz) this.c).b) {
                arrayList.add(a(a2));
            }
            reportingConfig = new ReportingConfig(arrayList, this.d.a());
        }
        return reportingConfig;
    }

    public final void a(Account account, long j2) {
        ajmp ajmp = this.b;
        String f2 = ajmp.f(account);
        SharedPreferences.Editor edit = ajmp.a.edit();
        edit.putLong(f2, j2);
        edit.apply();
    }

    public final void a(Account account, boolean z) {
        ajmr ajmr = this.a;
        String s = ajmr.s(account);
        SharedPreferences.Editor edit = ajmr.b.edit();
        edit.putBoolean(s, z);
        edit.apply();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x01e3, code lost:
        if (r9.i != null) goto L_0x01e5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(java.lang.String r18, defpackage.ajna r19, java.lang.String r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            r9 = r19
            android.accounts.Account r2 = r9.a
            r1.d(r2)
            boolean r2 = defpackage.aztb.A()
            if (r2 == 0) goto L_0x004d
            java.lang.Boolean r2 = r9.i
            if (r2 == 0) goto L_0x002f
            java.lang.Boolean r3 = r9.h
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x004d
            java.lang.Boolean r2 = r9.i
            boolean r2 = r2.booleanValue()
            r9.a(r2)
            r19.a()
            java.lang.String r2 = "UlrLhLrMerge"
            defpackage.ajjb.a((java.lang.String) r2)
            goto L_0x004d
        L_0x002f:
            java.lang.Boolean r2 = r9.h
            if (r2 == 0) goto L_0x004d
            android.accounts.Account r2 = r9.a
            com.google.android.location.reporting.state.update.AccountConfig r2 = r1.a((android.accounts.Account) r2)
            if (r2 == 0) goto L_0x004d
            boolean r3 = r2.g
            java.lang.Boolean r4 = r9.h
            boolean r4 = r4.booleanValue()
            if (r3 == r4) goto L_0x004d
            boolean r2 = r2.g
            r9.a(r2)
            r19.a()
        L_0x004d:
            boolean r2 = defpackage.aztb.m()
            r10 = 1
            if (r2 != 0) goto L_0x0055
            goto L_0x0067
        L_0x0055:
            boolean r2 = r9.d
            if (r2 == 0) goto L_0x0067
            java.lang.Boolean r2 = r9.h
            if (r2 == 0) goto L_0x005e
            goto L_0x0062
        L_0x005e:
            java.lang.Boolean r2 = r9.i
            if (r2 == 0) goto L_0x0067
        L_0x0062:
            android.accounts.Account r2 = r9.a
            r1.a((android.accounts.Account) r2, (boolean) r10)
        L_0x0067:
            java.lang.Object r11 = f
            monitor-enter(r11)
            ajmr r8 = r1.a     // Catch:{ all -> 0x054a }
            android.accounts.Account r2 = r9.a     // Catch:{ all -> 0x054a }
            com.google.android.location.reporting.state.update.AccountConfig r2 = r8.p(r2)     // Catch:{ all -> 0x054a }
            boolean r3 = r2.f()     // Catch:{ all -> 0x054a }
            r12 = 2
            r13 = 0
            if (r3 != 0) goto L_0x00dc
            java.lang.String r3 = java.lang.String.valueOf(r19)     // Catch:{ all -> 0x054a }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x054a }
            java.lang.String r4 = java.lang.String.valueOf(r18)     // Catch:{ all -> 0x054a }
            int r4 = r4.length()     // Catch:{ all -> 0x054a }
            java.lang.String r5 = java.lang.String.valueOf(r20)     // Catch:{ all -> 0x054a }
            int r5 = r5.length()     // Catch:{ all -> 0x054a }
            java.lang.String r6 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x054a }
            int r6 = r6.length()     // Catch:{ all -> 0x054a }
            java.lang.String r7 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x054a }
            int r7 = r7.length()     // Catch:{ all -> 0x054a }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x054a }
            int r4 = r4 + 18
            int r4 = r4 + r5
            int r4 = r4 + r6
            int r4 = r4 + r7
            r8.<init>(r4)     // Catch:{ all -> 0x054a }
            java.lang.String r4 = "GCoreUlr"
            java.lang.String r5 = "Blocking "
            r8.append(r5)     // Catch:{ all -> 0x054a }
            r8.append(r0)     // Catch:{ all -> 0x054a }
            java.lang.String r0 = " ("
            r8.append(r0)     // Catch:{ all -> 0x054a }
            r6 = r20
            r8.append(r6)     // Catch:{ all -> 0x054a }
            java.lang.String r0 = ") "
            r8.append(r0)     // Catch:{ all -> 0x054a }
            r8.append(r3)     // Catch:{ all -> 0x054a }
            java.lang.String r0 = " for "
            r8.append(r0)     // Catch:{ all -> 0x054a }
            r8.append(r2)     // Catch:{ all -> 0x054a }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x054a }
            r2 = 24
            defpackage.ajix.a((java.lang.String) r4, (int) r2, (java.lang.String) r0)     // Catch:{ all -> 0x054a }
            r0 = 0
            goto L_0x03b9
        L_0x00dc:
            r6 = r20
            boolean r3 = r2.b     // Catch:{ all -> 0x054a }
            if (r3 == 0) goto L_0x015d
            boolean r3 = r9.c     // Catch:{ all -> 0x054a }
            if (r3 != 0) goto L_0x015d
            java.lang.Long r3 = r9.b     // Catch:{ all -> 0x054a }
            java.lang.String r4 = java.lang.String.valueOf(r19)     // Catch:{ all -> 0x054a }
            java.lang.String r5 = java.lang.String.valueOf(r18)     // Catch:{ all -> 0x054a }
            int r5 = r5.length()     // Catch:{ all -> 0x054a }
            java.lang.String r7 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x054a }
            int r7 = r7.length()     // Catch:{ all -> 0x054a }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x054a }
            int r5 = r5 + 45
            int r5 = r5 + r7
            r14.<init>(r5)     // Catch:{ all -> 0x054a }
            java.lang.String r5 = "update("
            r14.append(r5)     // Catch:{ all -> 0x054a }
            r14.append(r0)     // Catch:{ all -> 0x054a }
            java.lang.String r5 = ", "
            r14.append(r5)     // Catch:{ all -> 0x054a }
            r14.append(r4)     // Catch:{ all -> 0x054a }
            java.lang.String r4 = ") must provide referenceUpdateNumber"
            r14.append(r4)     // Catch:{ all -> 0x054a }
            java.lang.String r4 = r14.toString()     // Catch:{ all -> 0x054a }
            defpackage.iva.a((java.lang.Object) r3, (java.lang.Object) r4)     // Catch:{ all -> 0x054a }
            java.lang.Long r3 = r9.b     // Catch:{ all -> 0x054a }
            long r3 = r3.longValue()     // Catch:{ all -> 0x054a }
            long r14 = r2.c     // Catch:{ all -> 0x054a }
            int r5 = (r3 > r14 ? 1 : (r3 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x015d
            java.lang.String r0 = java.lang.String.valueOf(r19)     // Catch:{ all -> 0x054a }
            long r2 = r2.c     // Catch:{ all -> 0x054a }
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x054a }
            int r4 = r4.length()     // Catch:{ all -> 0x054a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x054a }
            int r4 = r4 + 89
            r5.<init>(r4)     // Catch:{ all -> 0x054a }
            java.lang.String r4 = "GCoreUlr"
            java.lang.String r6 = "UserPreferences.updateEditor("
            r5.append(r6)     // Catch:{ all -> 0x054a }
            r5.append(r0)     // Catch:{ all -> 0x054a }
            java.lang.String r0 = "): aborting to preserve local change at "
            r5.append(r0)     // Catch:{ all -> 0x054a }
            r5.append(r2)     // Catch:{ all -> 0x054a }
            java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x054a }
            defpackage.ajix.a((java.lang.String) r4, (java.lang.String) r0)     // Catch:{ all -> 0x054a }
            r0 = 0
            goto L_0x03b9
        L_0x015d:
            boolean r3 = r9.d     // Catch:{ all -> 0x054a }
            r4 = 25
            if (r3 != 0) goto L_0x0164
            goto L_0x018f
        L_0x0164:
            int r2 = r2.s     // Catch:{ all -> 0x054a }
            if (r2 != r12) goto L_0x018f
            java.lang.String r0 = java.lang.String.valueOf(r19)     // Catch:{ all -> 0x054a }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x054a }
            int r2 = r2.length()     // Catch:{ all -> 0x054a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x054a }
            int r2 = r2 + 60
            r3.<init>(r2)     // Catch:{ all -> 0x054a }
            java.lang.String r2 = "GCoreUlr"
            java.lang.String r5 = "Attempted to change settings for Unicorn read-only account: "
            r3.append(r5)     // Catch:{ all -> 0x054a }
            r3.append(r0)     // Catch:{ all -> 0x054a }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x054a }
            defpackage.ajix.b((java.lang.String) r2, (int) r4, (java.lang.String) r0)     // Catch:{ all -> 0x054a }
            r0 = 0
            goto L_0x03b9
        L_0x018f:
            java.lang.String r2 = java.lang.String.valueOf(r19)     // Catch:{ all -> 0x054a }
            java.lang.String r3 = java.lang.String.valueOf(r18)     // Catch:{ all -> 0x054a }
            int r3 = r3.length()     // Catch:{ all -> 0x054a }
            java.lang.String r5 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x054a }
            int r5 = r5.length()     // Catch:{ all -> 0x054a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x054a }
            int r3 = r3 + r4
            int r3 = r3 + r5
            r7.<init>(r3)     // Catch:{ all -> 0x054a }
            java.lang.String r3 = "UserPreferences.update("
            r7.append(r3)     // Catch:{ all -> 0x054a }
            r7.append(r0)     // Catch:{ all -> 0x054a }
            java.lang.String r3 = ", "
            r7.append(r3)     // Catch:{ all -> 0x054a }
            r7.append(r2)     // Catch:{ all -> 0x054a }
            r7.toString()     // Catch:{ all -> 0x054a }
            android.content.SharedPreferences r2 = r8.b     // Catch:{ all -> 0x054a }
            android.content.SharedPreferences$Editor r3 = r2.edit()     // Catch:{ all -> 0x054a }
            android.accounts.Account r2 = r9.a     // Catch:{ all -> 0x054a }
            long r4 = r8.d(r2)     // Catch:{ all -> 0x054a }
            java.lang.String r7 = defpackage.ajmr.c(r2)     // Catch:{ all -> 0x054a }
            r14 = 1
            long r4 = r4 + r14
            r3.putLong(r7, r4)     // Catch:{ all -> 0x054a }
            ajmq r4 = defpackage.ajmq.a((android.accounts.Account) r2)     // Catch:{ all -> 0x054a }
            java.lang.String r4 = r4.l     // Catch:{ all -> 0x054a }
            r3.remove(r4)     // Catch:{ all -> 0x054a }
            java.lang.Boolean r4 = r9.h     // Catch:{ all -> 0x054a }
            if (r4 == 0) goto L_0x01e1
            goto L_0x01e5
        L_0x01e1:
            java.lang.Boolean r4 = r9.i     // Catch:{ all -> 0x054a }
            if (r4 == 0) goto L_0x01ea
        L_0x01e5:
            java.lang.String r4 = "defined"
            r3.putBoolean(r4, r10)     // Catch:{ all -> 0x054a }
        L_0x01ea:
            ajmq r4 = defpackage.ajmq.a((android.accounts.Account) r2)     // Catch:{ all -> 0x054a }
            java.lang.String r4 = r4.h     // Catch:{ all -> 0x054a }
            r3.remove(r4)     // Catch:{ all -> 0x054a }
            java.lang.Boolean r4 = r9.n     // Catch:{ all -> 0x054a }
            if (r4 == 0) goto L_0x0204
            java.lang.String r4 = defpackage.ajmr.a(r2)     // Catch:{ all -> 0x054a }
            java.lang.Boolean r5 = r9.n     // Catch:{ all -> 0x054a }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x054a }
            r3.putBoolean(r4, r5)     // Catch:{ all -> 0x054a }
        L_0x0204:
            java.lang.Long r4 = r9.l     // Catch:{ all -> 0x054a }
            if (r4 == 0) goto L_0x0215
            java.lang.String r4 = defpackage.ajmr.b(r2)     // Catch:{ all -> 0x054a }
            java.lang.Long r5 = r9.l     // Catch:{ all -> 0x054a }
            long r14 = r5.longValue()     // Catch:{ all -> 0x054a }
            r3.putLong(r4, r14)     // Catch:{ all -> 0x054a }
        L_0x0215:
            java.lang.Integer r4 = r9.m     // Catch:{ all -> 0x054a }
            if (r4 == 0) goto L_0x0226
            java.lang.String r4 = defpackage.ajmr.e(r2)     // Catch:{ all -> 0x054a }
            java.lang.Integer r5 = r9.m     // Catch:{ all -> 0x054a }
            int r5 = r5.intValue()     // Catch:{ all -> 0x054a }
            r3.putInt(r4, r5)     // Catch:{ all -> 0x054a }
        L_0x0226:
            java.lang.Boolean r4 = r9.p     // Catch:{ all -> 0x054a }
            if (r4 == 0) goto L_0x0237
            java.lang.String r4 = defpackage.ajmr.o(r2)     // Catch:{ all -> 0x054a }
            java.lang.Boolean r5 = r9.p     // Catch:{ all -> 0x054a }
            boolean r5 = r5.booleanValue()     // Catch:{ all -> 0x054a }
            r3.putBoolean(r4, r5)     // Catch:{ all -> 0x054a }
        L_0x0237:
            java.lang.Integer r4 = r9.q     // Catch:{ all -> 0x054a }
            if (r4 == 0) goto L_0x0248
            java.lang.String r2 = defpackage.ajmr.f(r2)     // Catch:{ all -> 0x054a }
            java.lang.Integer r4 = r9.q     // Catch:{ all -> 0x054a }
            int r4 = r4.intValue()     // Catch:{ all -> 0x054a }
            r3.putInt(r2, r4)     // Catch:{ all -> 0x054a }
        L_0x0248:
            android.accounts.Account r2 = r9.a     // Catch:{ all -> 0x054a }
            java.lang.Boolean r4 = r9.h     // Catch:{ all -> 0x054a }
            if (r4 == 0) goto L_0x0269
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x054a }
            boolean r5 = r8.h(r2)     // Catch:{ all -> 0x054a }
            if (r5 == 0) goto L_0x0260
            boolean r5 = r8.i(r2)     // Catch:{ all -> 0x054a }
            if (r5 != r4) goto L_0x0260
            r5 = 0
            goto L_0x0261
        L_0x0260:
            r5 = 1
        L_0x0261:
            java.lang.String r7 = defpackage.ajmr.g(r2)     // Catch:{ all -> 0x054a }
            r3.putBoolean(r7, r4)     // Catch:{ all -> 0x054a }
            goto L_0x026a
        L_0x0269:
            r5 = 0
        L_0x026a:
            boolean r4 = r9.k     // Catch:{ all -> 0x054a }
            if (r4 == 0) goto L_0x0278
            java.lang.String r2 = defpackage.ajmr.j(r2)     // Catch:{ all -> 0x054a }
            java.lang.String r4 = "com.google.android.gms+not-dirty"
            r3.putString(r2, r4)     // Catch:{ all -> 0x054a }
            goto L_0x02ba
        L_0x0278:
            if (r5 == 0) goto L_0x02ba
            java.lang.String r2 = defpackage.ajmr.j(r2)     // Catch:{ all -> 0x054a }
            java.lang.String r4 = r9.j     // Catch:{ all -> 0x054a }
            r3.putString(r2, r4)     // Catch:{ all -> 0x054a }
            java.lang.String r2 = r9.j     // Catch:{ all -> 0x054a }
            boolean r2 = defpackage.jlh.d(r2)     // Catch:{ all -> 0x054a }
            if (r2 == 0) goto L_0x02ba
            boolean r2 = defpackage.aztb.L()     // Catch:{ all -> 0x054a }
            if (r2 == 0) goto L_0x02ba
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x054a }
            java.lang.Boolean r4 = r9.h     // Catch:{ all -> 0x054a }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x054a }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x054a }
            int r5 = r5.length()     // Catch:{ all -> 0x054a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x054a }
            int r5 = r5 + 29
            r7.<init>(r5)     // Catch:{ all -> 0x054a }
            java.lang.String r5 = "null source for LR switch to "
            r7.append(r5)     // Catch:{ all -> 0x054a }
            r7.append(r4)     // Catch:{ all -> 0x054a }
            java.lang.String r4 = r7.toString()     // Catch:{ all -> 0x054a }
            r2.<init>(r4)     // Catch:{ all -> 0x054a }
            defpackage.ajjf.a(r2)     // Catch:{ all -> 0x054a }
        L_0x02ba:
            android.accounts.Account r2 = r9.a     // Catch:{ all -> 0x054a }
            java.lang.Boolean r4 = r9.i     // Catch:{ all -> 0x054a }
            if (r4 == 0) goto L_0x02db
            boolean r4 = r4.booleanValue()     // Catch:{ all -> 0x054a }
            boolean r5 = r8.l(r2)     // Catch:{ all -> 0x054a }
            if (r5 == 0) goto L_0x02d2
            boolean r5 = r8.m(r2)     // Catch:{ all -> 0x054a }
            if (r5 != r4) goto L_0x02d2
            r5 = 0
            goto L_0x02d3
        L_0x02d2:
            r5 = 1
        L_0x02d3:
            java.lang.String r7 = defpackage.ajmr.k(r2)     // Catch:{ all -> 0x054a }
            r3.putBoolean(r7, r4)     // Catch:{ all -> 0x054a }
            goto L_0x02dc
        L_0x02db:
            r5 = 0
        L_0x02dc:
            boolean r4 = r9.k     // Catch:{ all -> 0x054a }
            if (r4 == 0) goto L_0x02ea
            java.lang.String r2 = defpackage.ajmr.n(r2)     // Catch:{ all -> 0x054a }
            java.lang.String r4 = "com.google.android.gms+not-dirty"
            r3.putString(r2, r4)     // Catch:{ all -> 0x054a }
            goto L_0x032c
        L_0x02ea:
            if (r5 == 0) goto L_0x032c
            java.lang.String r2 = defpackage.ajmr.n(r2)     // Catch:{ all -> 0x054a }
            java.lang.String r4 = r9.j     // Catch:{ all -> 0x054a }
            r3.putString(r2, r4)     // Catch:{ all -> 0x054a }
            java.lang.String r2 = r9.j     // Catch:{ all -> 0x054a }
            boolean r2 = defpackage.jlh.d(r2)     // Catch:{ all -> 0x054a }
            if (r2 == 0) goto L_0x032c
            boolean r2 = defpackage.aztb.L()     // Catch:{ all -> 0x054a }
            if (r2 == 0) goto L_0x032c
            java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x054a }
            java.lang.Boolean r4 = r9.h     // Catch:{ all -> 0x054a }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x054a }
            java.lang.String r5 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x054a }
            int r5 = r5.length()     // Catch:{ all -> 0x054a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x054a }
            int r5 = r5 + 29
            r7.<init>(r5)     // Catch:{ all -> 0x054a }
            java.lang.String r5 = "null source for LH switch to "
            r7.append(r5)     // Catch:{ all -> 0x054a }
            r7.append(r4)     // Catch:{ all -> 0x054a }
            java.lang.String r4 = r7.toString()     // Catch:{ all -> 0x054a }
            r2.<init>(r4)     // Catch:{ all -> 0x054a }
            defpackage.ajjf.a(r2)     // Catch:{ all -> 0x054a }
        L_0x032c:
            boolean r4 = r9.d     // Catch:{ all -> 0x054a }
            boolean r7 = r9.o     // Catch:{ all -> 0x054a }
            r2 = r8
            r5 = r18
            r6 = r20
            r2.a(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x054a }
            boolean r2 = r9.g     // Catch:{ all -> 0x054a }
            if (r2 != 0) goto L_0x03b8
            android.accounts.Account r4 = r9.a     // Catch:{ all -> 0x054a }
            java.lang.Boolean r2 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x054a }
            java.lang.Boolean r3 = r9.n     // Catch:{ all -> 0x054a }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x054a }
            if (r2 == 0) goto L_0x03b8
            ahya r2 = r8.d     // Catch:{ all -> 0x054a }
            boolean r2 = r2.a((android.accounts.Account) r4)     // Catch:{ all -> 0x054a }
            if (r2 == 0) goto L_0x03b8
            boolean r2 = r9.d     // Catch:{ all -> 0x054a }
            if (r2 == 0) goto L_0x0355
            goto L_0x035f
        L_0x0355:
            boolean r2 = r9.f     // Catch:{ all -> 0x054a }
            if (r2 != 0) goto L_0x035f
            android.content.Context r2 = r8.a     // Catch:{ all -> 0x054a }
            com.google.android.location.reporting.service.ReportingSyncChimeraService.a(r4, r0, r2)     // Catch:{ all -> 0x054a }
            goto L_0x03b8
        L_0x035f:
            android.content.Context r14 = r8.a     // Catch:{ all -> 0x054a }
            java.lang.Boolean r5 = r9.h     // Catch:{ all -> 0x054a }
            java.lang.Boolean r6 = r9.i     // Catch:{ all -> 0x054a }
            java.lang.String r8 = r9.r     // Catch:{ all -> 0x054a }
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r13)     // Catch:{ all -> 0x054a }
            java.lang.String r2 = defpackage.rmp.a((android.accounts.Account) r4)     // Catch:{ all -> 0x054a }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x054a }
            int r3 = r3.length()     // Catch:{ all -> 0x054a }
            java.lang.String r15 = java.lang.String.valueOf(r18)     // Catch:{ all -> 0x054a }
            int r15 = r15.length()     // Catch:{ all -> 0x054a }
            java.lang.String r16 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x054a }
            int r16 = r16.length()     // Catch:{ all -> 0x054a }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x054a }
            int r3 = r3 + 45
            int r3 = r3 + r15
            int r3 = r3 + r16
            r12.<init>(r3)     // Catch:{ all -> 0x054a }
            java.lang.String r3 = "Requesting insistent sync for "
            r12.append(r3)     // Catch:{ all -> 0x054a }
            r12.append(r2)     // Catch:{ all -> 0x054a }
            java.lang.String r2 = ": "
            r12.append(r2)     // Catch:{ all -> 0x054a }
            r12.append(r0)     // Catch:{ all -> 0x054a }
            java.lang.String r2 = ", auditToken="
            r12.append(r2)     // Catch:{ all -> 0x054a }
            r12.append(r8)     // Catch:{ all -> 0x054a }
            r12.toString()     // Catch:{ all -> 0x054a }
            r2 = r14
            r3 = r18
            android.content.Intent r0 = defpackage.ajls.a(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x054a }
            defpackage.ajnw.a((android.content.Context) r14, (android.content.Intent) r0)     // Catch:{ all -> 0x054a }
            r0 = 1
            goto L_0x03b9
        L_0x03b8:
            r0 = 1
        L_0x03b9:
            monitor-exit(r11)     // Catch:{ all -> 0x054a }
            if (r0 == 0) goto L_0x0549
            boolean r2 = r9.s
            if (r2 == 0) goto L_0x0549
            ajnm r2 = r1.l
            android.accounts.Account r3 = r9.a
            java.lang.String r0 = r9.r
            java.lang.String r4 = r9.j
            java.lang.Boolean r5 = r9.i
            java.lang.Boolean r6 = r9.h
            boolean r7 = defpackage.aztb.p()
            if (r7 == 0) goto L_0x0548
            boolean r7 = defpackage.amrk.a((java.lang.String) r0)
            r8 = 0
            if (r7 != 0) goto L_0x03f4
            r7 = 8
            byte[] r8 = android.util.Base64.decode(r0, r7)     // Catch:{ IllegalArgumentException -> 0x03e0 }
            goto L_0x03f5
        L_0x03e0:
            r0 = move-exception
            r7 = r0
            r0 = 6
            java.lang.String r9 = "GCoreUlr"
            boolean r0 = android.util.Log.isLoggable(r9, r0)
            if (r0 == 0) goto L_0x03f3
            java.lang.String r0 = "GCoreUlr"
            java.lang.String r9 = "Failed to parse AuditToken"
            android.util.Log.e(r0, r9, r7)
            goto L_0x03f5
        L_0x03f3:
            goto L_0x03f5
        L_0x03f4:
        L_0x03f5:
            aqnl r0 = defpackage.aqnl.g
            aucd r0 = r0.o()
            aqnk r0 = (defpackage.aqnk) r0
            aqnu r7 = defpackage.aqnu.d
            aucd r7 = r7.o()
            boolean r9 = r7.c
            if (r9 != 0) goto L_0x0408
            goto L_0x040d
        L_0x0408:
            r7.c()
            r7.c = r13
        L_0x040d:
            aucj r9 = r7.b
            aqnu r9 = (defpackage.aqnu) r9
            r11 = 21
            r9.b = r11
            int r11 = r9.a
            r11 = r11 | r10
            r9.a = r11
            aqne r9 = defpackage.aqne.e
            aucd r9 = r9.o()
            r11 = 3
            if (r5 == 0) goto L_0x0467
            aqoa r12 = defpackage.aqoa.c
            aucd r12 = r12.o()
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x0431
            r5 = 3
            goto L_0x0432
        L_0x0431:
            r5 = 2
        L_0x0432:
            boolean r14 = r12.c
            if (r14 != 0) goto L_0x0437
            goto L_0x043c
        L_0x0437:
            r12.c()
            r12.c = r13
        L_0x043c:
            aucj r14 = r12.b
            aqoa r14 = (defpackage.aqoa) r14
            int r5 = r5 + -1
            r14.b = r5
            int r5 = r14.a
            r5 = r5 | r10
            r14.a = r5
            boolean r5 = r9.c
            if (r5 != 0) goto L_0x044e
            goto L_0x0453
        L_0x044e:
            r9.c()
            r9.c = r13
        L_0x0453:
            aucj r5 = r9.b
            aqne r5 = (defpackage.aqne) r5
            aucj r12 = r12.i()
            aqoa r12 = (defpackage.aqoa) r12
            r12.getClass()
            r5.b = r12
            int r12 = r5.a
            r12 = r12 | r10
            r5.a = r12
        L_0x0467:
            if (r6 == 0) goto L_0x04ad
            aqoa r5 = defpackage.aqoa.c
            aucd r5 = r5.o()
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L_0x0476
            goto L_0x0477
        L_0x0476:
            r11 = 2
        L_0x0477:
            boolean r6 = r5.c
            if (r6 != 0) goto L_0x047c
            goto L_0x0481
        L_0x047c:
            r5.c()
            r5.c = r13
        L_0x0481:
            aucj r6 = r5.b
            aqoa r6 = (defpackage.aqoa) r6
            int r11 = r11 + -1
            r6.b = r11
            int r11 = r6.a
            r11 = r11 | r10
            r6.a = r11
            boolean r6 = r9.c
            if (r6 != 0) goto L_0x0493
            goto L_0x0498
        L_0x0493:
            r9.c()
            r9.c = r13
        L_0x0498:
            aucj r6 = r9.b
            aqne r6 = (defpackage.aqne) r6
            aucj r5 = r5.i()
            aqoa r5 = (defpackage.aqoa) r5
            r5.getClass()
            r6.c = r5
            int r5 = r6.a
            r11 = 2
            r5 = r5 | r11
            r6.a = r5
        L_0x04ad:
            boolean r5 = r9.c
            if (r5 != 0) goto L_0x04b2
            goto L_0x04b7
        L_0x04b2:
            r9.c()
            r9.c = r13
        L_0x04b7:
            aucj r5 = r9.b
            aqne r5 = (defpackage.aqne) r5
            r4.getClass()
            int r6 = r5.a
            r6 = r6 | 4
            r5.a = r6
            r5.d = r4
            aqnv r4 = defpackage.aqnv.f
            aucd r4 = r4.o()
            boolean r5 = r4.c
            if (r5 != 0) goto L_0x04d1
            goto L_0x04d6
        L_0x04d1:
            r4.c()
            r4.c = r13
        L_0x04d6:
            aucj r5 = r4.b
            aqnv r5 = (defpackage.aqnv) r5
            aucj r6 = r9.i()
            aqne r6 = (defpackage.aqne) r6
            r6.getClass()
            r5.b = r6
            int r6 = r5.a
            r9 = 2
            r6 = r6 | r9
            r5.a = r6
            boolean r5 = r7.c
            if (r5 != 0) goto L_0x04f0
            goto L_0x04f5
        L_0x04f0:
            r7.c()
            r7.c = r13
        L_0x04f5:
            aucj r5 = r7.b
            aqnu r5 = (defpackage.aqnu) r5
            aucj r4 = r4.i()
            aqnv r4 = (defpackage.aqnv) r4
            r4.getClass()
            r5.c = r4
            int r4 = r5.a
            r6 = 2
            r4 = r4 | r6
            r5.a = r4
            boolean r4 = r0.c
            if (r4 != 0) goto L_0x050f
            goto L_0x0514
        L_0x050f:
            r0.c()
            r0.c = r13
        L_0x0514:
            aucj r4 = r0.b
            aqnl r4 = (defpackage.aqnl) r4
            aucj r5 = r7.i()
            aqnu r5 = (defpackage.aqnu) r5
            r5.getClass()
            r4.e = r5
            int r5 = r4.a
            r5 = r5 | 4
            r4.a = r5
            android.content.Context r2 = r2.a
            acwd r4 = new acwd
            r4.<init>()
            ajnl r5 = new ajnl
            r5.<init>(r4, r2, r3)
            r5.start()
            acwi r4 = r4.a
            ajnk r5 = new ajnk
            r5.<init>(r2, r0, r8, r3)
            acwa r0 = r4.b(r5)
            acvp r2 = defpackage.ajnj.a
            r0.a((defpackage.acvp) r2)
        L_0x0548:
            return r10
        L_0x0549:
            return r0
        L_0x054a:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x054a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajmm.a(java.lang.String, ajna, java.lang.String):boolean");
    }
}
