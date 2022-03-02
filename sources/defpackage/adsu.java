package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.RemoteException;
import android.util.Base64;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.usagereporting.ConsentInformation;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: adsu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class adsu extends bhw implements adsv {
    private final isq a;
    private final adti b;
    private final Context c;

    public adsu() {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingService");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0057, code lost:
        r1 = com.google.android.gms.usagereporting.UsageReportingOptInOptions.a();
        r1.a = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0063, code lost:
        if (defpackage.aekv.b(r0.c) != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0066, code lost:
        if (r3 != 1) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006f, code lost:
        if (((long) r2) < defpackage.azuf.c()) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0071, code lost:
        r1.b = true;
        r0 = r0.c;
        r0 = defpackage.jgu.d(r0, r0.getPackageName()).iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0085, code lost:
        if (r0.hasNext() == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0087, code lost:
        r1.c.add(((android.accounts.Account) r0.next()).name);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0095, code lost:
        r9.a(com.google.android.gms.common.api.Status.a, r1.a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002b, code lost:
        if (((android.os.UserManager) r0.c.getSystemService("user")).getUserCount() <= 1) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.adsp r9) {
        /*
            r8 = this;
            adtm r0 = defpackage.adtm.a()
            java.lang.Object r1 = r0.a
            monitor-enter(r1)
            android.content.SharedPreferences r2 = r0.b()     // Catch:{ all -> 0x00b0 }
            r3 = 2
            if (r2 == 0) goto L_0x009f
            aztw r4 = defpackage.aztw.a     // Catch:{ all -> 0x00b0 }
            aztx r4 = r4.a()     // Catch:{ all -> 0x00b0 }
            boolean r4 = r4.a()     // Catch:{ all -> 0x00b0 }
            r5 = 1
            if (r4 == 0) goto L_0x002d
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00b0 }
            android.content.Context r4 = r0.c     // Catch:{ all -> 0x00b0 }
            java.lang.String r6 = "user"
            java.lang.Object r4 = r4.getSystemService(r6)     // Catch:{ all -> 0x00b0 }
            android.os.UserManager r4 = (android.os.UserManager) r4     // Catch:{ all -> 0x00b0 }
            int r4 = r4.getUserCount()     // Catch:{ all -> 0x00b0 }
            if (r4 > r5) goto L_0x004e
        L_0x002d:
            boolean r4 = defpackage.aztt.e()     // Catch:{ all -> 0x00b0 }
            if (r4 == 0) goto L_0x0046
            boolean r4 = defpackage.adtm.b((android.content.SharedPreferences) r2)     // Catch:{ all -> 0x00b0 }
            if (r4 != 0) goto L_0x0046
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x00b0 }
            android.content.Context r4 = r0.c     // Catch:{ all -> 0x00b0 }
            boolean r4 = defpackage.adtl.a(r4)     // Catch:{ all -> 0x00b0 }
            if (r4 == 0) goto L_0x0045
            r3 = 1
            goto L_0x004f
        L_0x0045:
            goto L_0x004f
        L_0x0046:
            boolean r4 = defpackage.adtm.a((android.content.SharedPreferences) r2)     // Catch:{ all -> 0x00b0 }
            if (r4 == 0) goto L_0x004e
            r3 = 1
            goto L_0x004f
        L_0x004e:
        L_0x004f:
            java.lang.String r4 = "OptInGMSCoreVersion"
            r6 = -1
            int r2 = r2.getInt(r4, r6)     // Catch:{ all -> 0x00b0 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b0 }
            adsl r1 = com.google.android.gms.usagereporting.UsageReportingOptInOptions.a()
            r1.a = r3
            android.content.Context r4 = r0.c
            boolean r4 = defpackage.aekv.b(r4)
            if (r4 != 0) goto L_0x0066
            goto L_0x0095
        L_0x0066:
            if (r3 != r5) goto L_0x0095
            long r2 = (long) r2
            long r6 = defpackage.azuf.c()
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 < 0) goto L_0x0095
            r1.b = r5
            android.content.Context r0 = r0.c
            java.lang.String r2 = r0.getPackageName()
            java.util.List r0 = defpackage.jgu.d(r0, r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0081:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0095
            java.lang.Object r2 = r0.next()
            android.accounts.Account r2 = (android.accounts.Account) r2
            java.lang.String r2 = r2.name
            java.util.List r3 = r1.c
            r3.add(r2)
            goto L_0x0081
        L_0x0095:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.a
            com.google.android.gms.usagereporting.UsageReportingOptInOptions r1 = r1.a()
            r9.a((com.google.android.gms.common.api.Status) r0, (com.google.android.gms.usagereporting.UsageReportingOptInOptions) r1)
            return
        L_0x009f:
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.c     // Catch:{ all -> 0x00b0 }
            adsl r2 = com.google.android.gms.usagereporting.UsageReportingOptInOptions.a()     // Catch:{ all -> 0x00b0 }
            r2.a = r3     // Catch:{ all -> 0x00b0 }
            com.google.android.gms.usagereporting.UsageReportingOptInOptions r2 = r2.a()     // Catch:{ all -> 0x00b0 }
            r9.a((com.google.android.gms.common.api.Status) r0, (com.google.android.gms.usagereporting.UsageReportingOptInOptions) r2)     // Catch:{ all -> 0x00b0 }
            monitor-exit(r1)     // Catch:{ all -> 0x00b0 }
            return
        L_0x00b0:
            r9 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00b0 }
            goto L_0x00b4
        L_0x00b3:
            throw r9
        L_0x00b4:
            goto L_0x00b3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adsu.a(adsp):void");
    }

    public final void b(adss adss, adsp adsp) {
        adtm a2 = adtm.a();
        synchronized (a2.b) {
            a2.b.remove(adss);
        }
        adsp.c(Status.a);
    }

    public final void c(adss adss, adsp adsp) {
        adtm a2 = adtm.a();
        synchronized (a2.b) {
            Iterator it = a2.b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((adss) it.next()).asBinder() == adss.asBinder()) {
                        it.remove();
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        adsp.c(Status.a);
    }

    public adsu(String str, Context context) {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingService");
        this.a = new isq(str);
        this.b = new adti(str);
        this.c = context;
    }

    public final void a(adss adss, adsp adsp) {
        adtm a2 = adtm.a();
        synchronized (a2.b) {
            a2.b.add(adss);
        }
        adsp.b(Status.a);
    }

    public final void a(UsageReportingOptInOptions usageReportingOptInOptions, adsp adsp) {
        boolean z;
        if (aekv.a(this.c)) {
            adsp.a(Status.c);
            return;
        }
        this.a.b();
        this.b.a(azuf.b(), "setOptInOptions");
        adtm a2 = adtm.a();
        adti adti = this.b;
        iva.a(aekv.b(a2.c), (Object) "User is not unlocked.");
        if (a2.a(usageReportingOptInOptions, adti)) {
            int i = usageReportingOptInOptions.a;
            boolean z2 = true;
            if (i == 0) {
                z = false;
            } else {
                boolean z3 = i == 1;
                synchronized (a2.a) {
                    SharedPreferences b2 = a2.b();
                    irk.a((Object) b2, (Object) "Unexpected null from getPrefs.");
                    SharedPreferences.Editor edit = b2.edit();
                    if (!z3) {
                        edit.remove("OptInGMSCoreVersion");
                    } else {
                        edit.putInt("OptInGMSCoreVersion", jhg.d(a2.c));
                    }
                    if (usageReportingOptInOptions.f) {
                        adti.a(azuf.a.a().b(), "setting CbFromSetupWizard to true");
                    }
                    edit.putBoolean("CbFromSetupWizard", usageReportingOptInOptions.f);
                    boolean a3 = adtm.a(b2);
                    if (adtm.b(b2)) {
                        if (z3 == a3) {
                            edit.apply();
                            z = false;
                        }
                    }
                    edit.putBoolean("OptInUsageReporting", z3);
                    edit.apply();
                    z = z3 != a3;
                }
            }
            adsp.a(Status.a);
            if (z) {
                if (aztt.e()) {
                    int i2 = Build.VERSION.SDK_INT;
                    if (!adtl.a()) {
                        Context context = a2.c;
                        if (usageReportingOptInOptions.a != 1) {
                            z2 = false;
                        }
                        adtl.a(context, z2);
                    } else {
                        a2.a(a2.c);
                    }
                }
                synchronized (a2.b) {
                    Iterator it = a2.b.iterator();
                    while (it.hasNext()) {
                        try {
                            ((adss) it.next()).b();
                        } catch (RemoteException e) {
                            it.remove();
                        }
                    }
                }
                if (usageReportingOptInOptions.a == 2) {
                    SharedPreferences.Editor edit2 = a2.c.getSharedPreferences("CheckinLogging", 0).edit();
                    edit2.remove("logging_id");
                    edit2.commit();
                    return;
                }
                return;
            }
            return;
        }
        adsp.a(Status.c);
    }

    public final void a(String str, adsp adsp) {
        if (aekv.a(this.c)) {
            adsp.a(Status.c, false, ConsentInformation.a);
            return;
        }
        adtk adtk = new adtk(adtm.a());
        Context context = this.c;
        iva.a((Object) str, (Object) "Log source cannot be null");
        try {
            aupq aupq = (aupq) aucj.a((aucj) aupq.b, Base64.decode(aztt.a.a().a(), 0));
            str.getClass();
            if (aupq.a.containsKey(str)) {
                str.getClass();
                audr audr = aupq.a;
                if (audr.containsKey(str)) {
                    adtk.a(context, (aupo) audr.get(str), adsp);
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException("Consent Rules did not contain the given log source");
        } catch (auda e) {
            adsp.a(Status.c, false, ConsentInformation.a);
        } catch (IllegalArgumentException e2) {
            adsp.a(Status.c, false, ConsentInformation.a);
        }
    }

    public final void a(String str, ConsentInformation consentInformation, adsp adsp) {
        ConsentInformation consentInformation2;
        String str2 = str;
        ConsentInformation consentInformation3 = consentInformation;
        adtk adtk = new adtk(adtm.a());
        if (str2 == null) {
            adrs b2 = ConsentInformation.b();
            b2.a = consentInformation3.b;
            if (aztt.b()) {
                b2.b = consentInformation3.c;
            }
            amzy h = amzy.h();
            List a2 = consentInformation.a();
            int size = a2.size();
            for (int i = 0; i < size; i++) {
                ConsentInformation.AccountConsentInformation accountConsentInformation = (ConsentInformation.AccountConsentInformation) a2.get(i);
                b2.a(new ConsentInformation.AccountConsentInformation(accountConsentInformation.a, accountConsentInformation.b, h));
            }
            consentInformation2 = b2.a();
        } else {
            adrs b3 = ConsentInformation.b();
            b3.a = consentInformation3.b;
            if (aztt.b()) {
                b3.b = consentInformation3.c;
            }
            HashMap hashMap = new HashMap();
            List a3 = consentInformation.a();
            int size2 = a3.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ConsentInformation.AccountConsentInformation accountConsentInformation2 = (ConsentInformation.AccountConsentInformation) a3.get(i2);
                amzt j = amzy.j();
                List a4 = accountConsentInformation2.a();
                int size3 = a4.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    Integer num = (Integer) a4.get(i3);
                    if (num.intValue() == aups.NO_WHITELIST.d) {
                        j.c(num);
                    } else if (!hashMap.containsKey(num)) {
                        List a5 = adtk.b.a(num.intValue());
                        if (a5 == null || !a5.contains(str2)) {
                            hashMap.put(num, false);
                        } else {
                            j.c(num);
                            hashMap.put(num, true);
                        }
                    } else if (((Boolean) hashMap.get(num)).booleanValue()) {
                        j.c(num);
                    }
                }
                amzy a6 = j.a();
                if (!a6.isEmpty()) {
                    b3.a(new ConsentInformation.AccountConsentInformation(accountConsentInformation2.a, accountConsentInformation2.b, a6));
                }
            }
            consentInformation2 = b3.a();
        }
        adsp.a(Status.a, consentInformation2);
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v2, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r6v3, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r6v4, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r1v6, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r0v19, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r1v8, types: [android.os.IInterface] */
    /* JADX WARNING: type inference failed for: r6v17, types: [android.os.IInterface] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 8 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r5, android.os.Parcel r6, android.os.Parcel r7) {
        /*
            r4 = this;
            java.lang.String r0 = "com.google.android.gms.usagereporting.internal.IUsageReportingOptInOptionsChangedListener"
            java.lang.String r1 = "com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks"
            r2 = 0
            switch(r5) {
                case 2: goto L_0x0199;
                case 3: goto L_0x0174;
                case 4: goto L_0x013f;
                case 5: goto L_0x0109;
                case 6: goto L_0x00d5;
                case 7: goto L_0x008c;
                case 8: goto L_0x006a;
                case 9: goto L_0x0040;
                case 10: goto L_0x000a;
                default: goto L_0x0008;
            }
        L_0x0008:
            r5 = 0
            return r5
        L_0x000a:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0021
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r3 = r0 instanceof defpackage.adss
            if (r3 == 0) goto L_0x001b
            adss r0 = (defpackage.adss) r0
            goto L_0x0022
        L_0x001b:
            adsq r0 = new adsq
            r0.<init>(r5)
            goto L_0x0022
        L_0x0021:
            r0 = r2
        L_0x0022:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x003a
            android.os.IInterface r6 = r5.queryLocalInterface(r1)
            boolean r1 = r6 instanceof defpackage.adsp
            if (r1 == 0) goto L_0x0034
            r2 = r6
            adsp r2 = (defpackage.adsp) r2
            goto L_0x003b
        L_0x0034:
            adsn r2 = new adsn
            r2.<init>(r5)
            goto L_0x003b
        L_0x003a:
        L_0x003b:
            r4.c(r0, r2)
            goto L_0x01b5
        L_0x0040:
            java.lang.String r5 = r6.readString()
            android.os.Parcelable$Creator r0 = com.google.android.gms.usagereporting.ConsentInformation.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r0)
            com.google.android.gms.usagereporting.ConsentInformation r0 = (com.google.android.gms.usagereporting.ConsentInformation) r0
            android.os.IBinder r6 = r6.readStrongBinder()
            if (r6 == 0) goto L_0x0064
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.adsp
            if (r2 == 0) goto L_0x005e
            r2 = r1
            adsp r2 = (defpackage.adsp) r2
            goto L_0x0065
        L_0x005e:
            adsn r2 = new adsn
            r2.<init>(r6)
            goto L_0x0065
        L_0x0064:
        L_0x0065:
            r4.a((java.lang.String) r5, (com.google.android.gms.usagereporting.ConsentInformation) r0, (defpackage.adsp) r2)
            goto L_0x01b5
        L_0x006a:
            java.lang.String r5 = r6.readString()
            android.os.IBinder r6 = r6.readStrongBinder()
            if (r6 == 0) goto L_0x0086
            android.os.IInterface r0 = r6.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.adsp
            if (r1 == 0) goto L_0x0080
            r2 = r0
            adsp r2 = (defpackage.adsp) r2
            goto L_0x0087
        L_0x0080:
            adsn r2 = new adsn
            r2.<init>(r6)
            goto L_0x0087
        L_0x0086:
        L_0x0087:
            r4.a((java.lang.String) r5, (defpackage.adsp) r2)
            goto L_0x01b5
        L_0x008c:
            int r5 = r6.readInt()
            java.util.ArrayList r0 = r6.createStringArrayList()
            android.os.IBinder r6 = r6.readStrongBinder()
            if (r6 == 0) goto L_0x00ac
            android.os.IInterface r1 = r6.queryLocalInterface(r1)
            boolean r2 = r1 instanceof defpackage.adsp
            if (r2 == 0) goto L_0x00a6
            r2 = r1
            adsp r2 = (defpackage.adsp) r2
            goto L_0x00ad
        L_0x00a6:
            adsn r2 = new adsn
            r2.<init>(r6)
            goto L_0x00ad
        L_0x00ac:
        L_0x00ad:
            android.content.Context r6 = r4.c
            boolean r6 = defpackage.aekv.a(r6)
            if (r6 == 0) goto L_0x00bc
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.common.api.Status.c
            r2.d(r5)
            goto L_0x01b5
        L_0x00bc:
            isq r6 = r4.a
            r6.b()
            adti r6 = r4.b
            java.lang.String r1 = defpackage.azuf.b()
            java.lang.String r3 = "setAppWhitelist"
            r6.a(r1, r3)
            adtm r6 = defpackage.adtm.a()
            r6.a(r5, r0, r2)
            goto L_0x01b5
        L_0x00d5:
            int r5 = r6.readInt()
            android.os.IBinder r6 = r6.readStrongBinder()
            if (r6 == 0) goto L_0x00f0
            android.os.IInterface r0 = r6.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.adsp
            if (r1 == 0) goto L_0x00ea
            adsp r0 = (defpackage.adsp) r0
            goto L_0x00f1
        L_0x00ea:
            adsn r0 = new adsn
            r0.<init>(r6)
            goto L_0x00f1
        L_0x00f0:
            r0 = r2
        L_0x00f1:
            android.content.Context r6 = r4.c
            boolean r6 = defpackage.aekv.a(r6)
            if (r6 == 0) goto L_0x0100
            com.google.android.gms.common.api.Status r5 = com.google.android.gms.common.api.Status.c
            r0.a((com.google.android.gms.common.api.Status) r5, (java.util.List) r2)
            goto L_0x01b5
        L_0x0100:
            adtm r6 = defpackage.adtm.a()
            r6.a((int) r5, (defpackage.adsp) r0)
            goto L_0x01b5
        L_0x0109:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0120
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r3 = r0 instanceof defpackage.adss
            if (r3 == 0) goto L_0x011a
            adss r0 = (defpackage.adss) r0
            goto L_0x0121
        L_0x011a:
            adsq r0 = new adsq
            r0.<init>(r5)
            goto L_0x0121
        L_0x0120:
            r0 = r2
        L_0x0121:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0139
            android.os.IInterface r6 = r5.queryLocalInterface(r1)
            boolean r1 = r6 instanceof defpackage.adsp
            if (r1 == 0) goto L_0x0133
            r2 = r6
            adsp r2 = (defpackage.adsp) r2
            goto L_0x013a
        L_0x0133:
            adsn r2 = new adsn
            r2.<init>(r5)
            goto L_0x013a
        L_0x0139:
        L_0x013a:
            r4.b(r0, r2)
            goto L_0x01b5
        L_0x013f:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x0156
            android.os.IInterface r0 = r5.queryLocalInterface(r0)
            boolean r3 = r0 instanceof defpackage.adss
            if (r3 == 0) goto L_0x0150
            adss r0 = (defpackage.adss) r0
            goto L_0x0157
        L_0x0150:
            adsq r0 = new adsq
            r0.<init>(r5)
            goto L_0x0157
        L_0x0156:
            r0 = r2
        L_0x0157:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x016f
            android.os.IInterface r6 = r5.queryLocalInterface(r1)
            boolean r1 = r6 instanceof defpackage.adsp
            if (r1 == 0) goto L_0x0169
            r2 = r6
            adsp r2 = (defpackage.adsp) r2
            goto L_0x0170
        L_0x0169:
            adsn r2 = new adsn
            r2.<init>(r5)
            goto L_0x0170
        L_0x016f:
        L_0x0170:
            r4.a((defpackage.adss) r0, (defpackage.adsp) r2)
            goto L_0x01b5
        L_0x0174:
            android.os.Parcelable$Creator r5 = com.google.android.gms.usagereporting.UsageReportingOptInOptions.CREATOR
            android.os.Parcelable r5 = defpackage.bhx.a((android.os.Parcel) r6, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.usagereporting.UsageReportingOptInOptions r5 = (com.google.android.gms.usagereporting.UsageReportingOptInOptions) r5
            android.os.IBinder r6 = r6.readStrongBinder()
            if (r6 == 0) goto L_0x0194
            android.os.IInterface r0 = r6.queryLocalInterface(r1)
            boolean r1 = r0 instanceof defpackage.adsp
            if (r1 == 0) goto L_0x018e
            r2 = r0
            adsp r2 = (defpackage.adsp) r2
            goto L_0x0195
        L_0x018e:
            adsn r2 = new adsn
            r2.<init>(r6)
            goto L_0x0195
        L_0x0194:
        L_0x0195:
            r4.a((com.google.android.gms.usagereporting.UsageReportingOptInOptions) r5, (defpackage.adsp) r2)
            goto L_0x01b5
        L_0x0199:
            android.os.IBinder r5 = r6.readStrongBinder()
            if (r5 == 0) goto L_0x01b1
            android.os.IInterface r6 = r5.queryLocalInterface(r1)
            boolean r0 = r6 instanceof defpackage.adsp
            if (r0 == 0) goto L_0x01ab
            r2 = r6
            adsp r2 = (defpackage.adsp) r2
            goto L_0x01b2
        L_0x01ab:
            adsn r2 = new adsn
            r2.<init>(r5)
            goto L_0x01b2
        L_0x01b1:
        L_0x01b2:
            r4.a(r2)
        L_0x01b5:
            r7.writeNoException()
            r5 = 1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.adsu.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
