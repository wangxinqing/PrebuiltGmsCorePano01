package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.gms.auth.frp.FrpSnapshot;
import com.google.android.gms.auth.frp.PersistentDeviceOwnerState;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/* renamed from: eli  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eli {
    public static final iwd a = ehv.a("FactoryResetProtectionManager");
    private static WeakReference e = new WeakReference((Object) null);
    public final Context b;
    public final elk c;
    public final Object d = new Object();
    private final int f;
    private final Random g;
    private final boolean h;

    private eli(Context context, int i, elk elk) {
        boolean f2 = jgu.f(context);
        SecureRandom secureRandom = new SecureRandom();
        iva.a((Object) context);
        this.b = context;
        this.f = i;
        this.c = elk;
        iva.a((Object) secureRandom);
        this.g = secureRandom;
        this.h = f2;
    }

    public static synchronized eli a(Context context) {
        synchronized (eli.class) {
            eli eli = (eli) e.get();
            if (eli != null) {
                awkh.c();
                return eli;
            }
            eli eli2 = new eli(context, context.getApplicationInfo().uid, ell.a(context));
            e = new WeakReference(eli2);
            return eli2;
        }
    }

    private static final boolean c(String str) {
        if (str.matches("[0-9]+")) {
            return true;
        }
        iwd iwd = a;
        String valueOf = String.valueOf(str);
        iwd.d(valueOf.length() == 0 ? new String("factoryResetProtectionAdmin app restriction contains unsupported value: ") : "factoryResetProtectionAdmin app restriction contains unsupported value: ".concat(valueOf), new Object[0]);
        return false;
    }

    public final FrpSnapshot b() {
        boolean z;
        if (!a()) {
            a.d("Factory reset protection is not supported!", new Object[0]);
            return FrpSnapshot.a();
        } else if (!ent.P()) {
            a.d("Factory reset protection is disabled by GservicesFlag!", new Object[0]);
            return FrpSnapshot.a();
        } else {
            synchronized (this.d) {
                fyw b2 = this.c.b();
                if (b2 == null) {
                    a.d("DataBlockContainer is null.", new Object[0]);
                    FrpSnapshot b3 = FrpSnapshot.b();
                    return b3;
                }
                if (c()) {
                    if ((b2.a & 1) != 0) {
                        if (Settings.Global.getInt(this.b.getContentResolver(), "device_provisioned", 0) == 0) {
                            if (!d()) {
                                PersistentDeviceOwnerState f2 = f();
                                if (!a()) {
                                    a.d("Factory reset protection is not supported!", new Object[0]);
                                    z = false;
                                } else if (!ent.P()) {
                                    a.d("Factory reset protection is disabled by GservicesFlag!", new Object[0]);
                                    z = false;
                                } else {
                                    synchronized (this.d) {
                                        fyw b4 = this.c.b();
                                        if (b4 != null) {
                                            Iterator it = b4.b.iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    if (((fyy) it.next()).e.size() > 0) {
                                                        a.c("Factory Reset Protection challenge found!", new Object[0]);
                                                        z = true;
                                                        break;
                                                    }
                                                } else {
                                                    z = false;
                                                    break;
                                                }
                                            }
                                        } else {
                                            z = false;
                                        }
                                    }
                                }
                                FrpSnapshot frpSnapshot = new FrpSnapshot(1, true, true, false, f2, z);
                                return frpSnapshot;
                            }
                        }
                        FrpSnapshot b5 = FrpSnapshot.b();
                        return b5;
                    }
                }
                if (b2.b.size() <= 0) {
                    a.d("DataBlockContainer doesn't contain any ProfileBlocks.", new Object[0]);
                    FrpSnapshot b6 = FrpSnapshot.b();
                    return b6;
                }
                for (fyy fyy : b2.b) {
                    if (fyy.e.size() > 0) {
                        a.c("Factory Reset Protection challenge found!", new Object[0]);
                        elm.b(this.b);
                        if (!fyy.f) {
                            FrpSnapshot frpSnapshot2 = new FrpSnapshot(true, true, false);
                            return frpSnapshot2;
                        }
                        FrpSnapshot frpSnapshot3 = new FrpSnapshot(true, true, true);
                        return frpSnapshot3;
                    }
                }
                a.d("Searched through %s profiles, no FRP challenges found.", Integer.valueOf(b2.b.size()));
                FrpSnapshot b7 = FrpSnapshot.b();
                return b7;
            }
        }
    }

    public final boolean d() {
        return new ivk(this.b, "frp_preferences_storage", true, true).getBoolean("persistent_device_owner_restored", false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.auth.frp.PersistentDeviceOwnerState f() {
        /*
            r4 = this;
            boolean r0 = r4.c()
            r1 = 0
            if (r0 == 0) goto L_0x003a
            java.lang.Object r0 = r4.d
            monitor-enter(r0)
            elk r2 = r4.c     // Catch:{ all -> 0x0037 }
            fyw r2 = r2.b()     // Catch:{ all -> 0x0037 }
            if (r2 == 0) goto L_0x0035
            int r3 = r2.a     // Catch:{ all -> 0x0037 }
            r3 = r3 & 1
            if (r3 == 0) goto L_0x0035
            com.google.android.gms.auth.frp.PersistentDeviceOwnerState r1 = new com.google.android.gms.auth.frp.PersistentDeviceOwnerState     // Catch:{ all -> 0x0037 }
            fyx r3 = r2.c     // Catch:{ all -> 0x0037 }
            if (r3 == 0) goto L_0x001f
            goto L_0x0021
        L_0x001f:
            fyx r3 = defpackage.fyx.d     // Catch:{ all -> 0x0037 }
        L_0x0021:
            java.lang.String r3 = r3.b     // Catch:{ all -> 0x0037 }
            android.content.ComponentName r3 = android.content.ComponentName.unflattenFromString(r3)     // Catch:{ all -> 0x0037 }
            fyx r2 = r2.c     // Catch:{ all -> 0x0037 }
            if (r2 == 0) goto L_0x002c
            goto L_0x002e
        L_0x002c:
            fyx r2 = defpackage.fyx.d     // Catch:{ all -> 0x0037 }
        L_0x002e:
            java.lang.String r2 = r2.c     // Catch:{ all -> 0x0037 }
            r1.<init>(r3, r2)     // Catch:{ all -> 0x0037 }
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return r1
        L_0x0035:
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            return r1
        L_0x0037:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0037 }
            throw r1
        L_0x003a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eli.f():com.google.android.gms.auth.frp.PersistentDeviceOwnerState");
    }

    public final List e() {
        int i = Build.VERSION.SDK_INT;
        Bundle applicationRestrictions = ((UserManager) this.b.getSystemService("user")).getApplicationRestrictions(this.b.getPackageName());
        List list = null;
        if (applicationRestrictions == null) {
            return null;
        }
        try {
            if (applicationRestrictions.getBoolean("disableFactoryResetProtectionAdmin", false)) {
                return Collections.emptyList();
            }
            Object obj = applicationRestrictions.get("factoryResetProtectionAdmin");
            if (obj instanceof String[]) {
                List<String> asList = Arrays.asList((String[]) obj);
                for (String c2 : asList) {
                    if (!c(c2)) {
                        return null;
                    }
                }
                if (asList.isEmpty()) {
                    return null;
                }
                return asList;
            }
            if (obj instanceof String) {
                String str = (String) obj;
                if (c(str)) {
                    list = Collections.singletonList(str);
                }
            }
            return list;
        } catch (Exception e2) {
            a.e("Failed to read application restriction.", e2, new Object[0]);
            return null;
        }
    }

    public static final boolean a(fyy fyy, String str) {
        if (fyy.e.size() == 0) {
            a.e("Invalid ProfileBlock.", new Object[0]);
            return false;
        } else if ((fyy.a & 4) == 0 || fyy.d.a() != fyy.e.size() * fyy.c) {
            a.e("Invalid SALT.", new Object[0]);
            return false;
        } else {
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-256");
                byte[] a2 = a(str);
                int size = fyy.e.size();
                for (int i = 0; i < size; i++) {
                    instance.reset();
                    byte[] k = fyy.d.k();
                    int i2 = fyy.c;
                    instance.update(k, i * i2, i2);
                    instance.update(a2);
                    if (Arrays.equals(((auay) fyy.e.get(i)).k(), instance.digest())) {
                        a.c(String.format("Check successful for account: %s!", new Object[]{str}), new Object[0]);
                        return true;
                    }
                }
                a.d("Check failed! Account %s was not among the %s accounts on the profile.", str, Integer.valueOf(size));
            } catch (NoSuchAlgorithmException e2) {
                a.e("Error when checking account presence.", e2, new Object[0]);
            }
            a.c(String.format("Check failed for account: %s.", new Object[]{str}), new Object[0]);
            return false;
        }
    }

    public final boolean c() {
        if (!a() || !jkr.f()) {
            a.d("Persistent device owner state is not supported!", new Object[0]);
            return false;
        } else if (ent.Q()) {
            return true;
        } else {
            a.d("Persistent device owner state is disabled by GservicesFlag!", new Object[0]);
            return false;
        }
    }

    static byte[] a(String str) {
        return str.getBytes(StandardCharsets.UTF_8);
    }

    public final void a(fyx fyx) {
        fyw fyw;
        iva.b(fyx == null || !TextUtils.isEmpty(fyx.b), "device owner's component name cannot be empty");
        iwd iwd = a;
        String valueOf = String.valueOf(fyx);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55);
        sb.append("Updating data block with persistent device owner state ");
        sb.append(valueOf);
        iwd.c(sb.toString(), new Object[0]);
        if (!c()) {
            a.c("Update failed! Persistent device owner state not enabled.", new Object[0]);
            return;
        }
        synchronized (this.d) {
            try {
                fyw b2 = this.c.b();
                if (b2 == null || b2.b.size() == 0) {
                    if (fyx == null) {
                        fyw = null;
                        a.c(String.format("Write complete, result: %d.", new Object[]{Long.valueOf(this.c.a(fyw))}), new Object[0]);
                    }
                }
                if (b2 == null) {
                    b2 = fyw.d;
                }
                if (fyx != null) {
                    aucd aucd = (aucd) b2.c(5);
                    aucd.a((aucj) b2);
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    fyw fyw2 = (fyw) aucd.b;
                    fyw fyw3 = fyw.d;
                    fyx.getClass();
                    fyw2.c = fyx;
                    fyw2.a |= 1;
                    fyw = (fyw) aucd.i();
                } else {
                    a.d("DeviceOwnerBlock is null", new Object[0]);
                    fyw = b2;
                }
                a.c(String.format("Write complete, result: %d.", new Object[]{Long.valueOf(this.c.a(fyw))}), new Object[0]);
            } catch (IOException e2) {
                a.e("Update failed!", e2, new Object[0]);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final String b(String str) {
        try {
            return eim.f(this.b, str);
        } catch (eif | IOException e2) {
            a.e("Cannot get accountId.", e2, new Object[0]);
            return null;
        }
    }

    /* JADX WARNING: type inference failed for: r14v14, types: [aucj] */
    /* JADX WARNING: type inference failed for: r14v23, types: [aucj] */
    /* JADX WARNING: type inference failed for: r14v24, types: [aucj] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List r14, boolean r15) {
        /*
            r13 = this;
            boolean r0 = defpackage.ent.R()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x000a
            r15 = 0
            goto L_0x000f
        L_0x000a:
            if (r15 == 0) goto L_0x000e
            r15 = 1
            goto L_0x000f
        L_0x000e:
            r15 = 0
        L_0x000f:
            iwd r0 = a
            if (r14 == 0) goto L_0x0018
            int r3 = r14.size()
            goto L_0x0019
        L_0x0018:
            r3 = 0
        L_0x0019:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r5 = 77
            r4.<init>(r5)
            java.lang.String r5 = "Updating data block with "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = " account ids. Lockscreen supported? "
            r4.append(r3)
            r4.append(r15)
            java.lang.String r3 = r4.toString()
            java.lang.Object[] r4 = new java.lang.Object[r2]
            r0.c(r3, r4)
            boolean r0 = r13.a()
            if (r0 != 0) goto L_0x0049
            iwd r14 = a
            java.lang.Object[] r15 = new java.lang.Object[r2]
            java.lang.String r0 = "Update failed! FactoryResetProtection is unsupported."
            r14.c(r0, r15)
            return
        L_0x0049:
            java.lang.Object r0 = r13.d
            monitor-enter(r0)
            elk r3 = r13.c     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            fyw r3 = r3.b()     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r4 = 0
            r5 = 5
            if (r14 == 0) goto L_0x01b3
            boolean r6 = r14.isEmpty()     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            if (r6 != 0) goto L_0x01b3
            if (r3 == 0) goto L_0x005f
            goto L_0x0061
        L_0x005f:
            fyw r3 = defpackage.fyw.d     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
        L_0x0061:
            java.lang.String r4 = "SHA-256"
            java.security.MessageDigest r4 = java.security.MessageDigest.getInstance(r4)     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r6.<init>(r14)     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            int r14 = r6.size()     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            int r7 = r14 * 32
            byte[] r7 = new byte[r7]     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            java.util.Random r8 = r13.g     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r8.nextBytes(r7)     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            fyy r8 = defpackage.fyy.g     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            aucd r8 = r8.o()     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            int r9 = r13.f     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            boolean r10 = r8.c     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            if (r10 != 0) goto L_0x0086
            goto L_0x008b
        L_0x0086:
            r8.c()     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r8.c = r2     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
        L_0x008b:
            aucj r10 = r8.b     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            fyy r10 = (defpackage.fyy) r10     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            int r11 = r10.a     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r11 = r11 | r1
            r10.a = r11     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r10.b = r9     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r9 = r11 | 2
            r10.a = r9     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r9 = 32
            r10.c = r9     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            auay r7 = defpackage.auay.a((byte[]) r7)     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            boolean r10 = r8.c     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            if (r10 != 0) goto L_0x00a7
            goto L_0x00ac
        L_0x00a7:
            r8.c()     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r8.c = r2     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
        L_0x00ac:
            aucj r10 = r8.b     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            fyy r10 = (defpackage.fyy) r10     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r7.getClass()     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            int r11 = r10.a     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r11 = r11 | 4
            r10.a = r11     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r10.d = r7     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r7 = 0
        L_0x00bc:
            if (r7 >= r14) goto L_0x010e
            r4.reset()     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            aucj r10 = r8.b     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            fyy r10 = (defpackage.fyy) r10     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            auay r10 = r10.d     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            byte[] r10 = r10.k()     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            int r11 = r7 * 32
            r4.update(r10, r11, r9)     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            java.lang.Object r10 = r6.get(r7)     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            byte[] r10 = a((java.lang.String) r10)     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r4.update(r10)     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            byte[] r10 = r4.digest()     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            auay r10 = defpackage.auay.a((byte[]) r10)     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            boolean r11 = r8.c     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            if (r11 != 0) goto L_0x00ea
            goto L_0x00ef
        L_0x00ea:
            r8.c()     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r8.c = r2     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
        L_0x00ef:
            aucj r11 = r8.b     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            fyy r11 = (defpackage.fyy) r11     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r10.getClass()     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            aucx r12 = r11.e     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            boolean r12 = r12.a()     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            if (r12 != 0) goto L_0x0106
            aucx r12 = r11.e     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            aucx r12 = defpackage.aucj.a((defpackage.aucx) r12)     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r11.e = r12     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
        L_0x0106:
            aucx r11 = r11.e     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r11.add(r10)     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            int r7 = r7 + 1
            goto L_0x00bc
        L_0x010e:
            aucj r14 = r8.i()     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            fyy r14 = (defpackage.fyy) r14     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            java.lang.Object r4 = r14.c(r5)     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            aucd r4 = (defpackage.aucd) r4     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r4.a((defpackage.aucj) r14)     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            boolean r14 = r4.c     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            if (r14 != 0) goto L_0x0122
            goto L_0x0127
        L_0x0122:
            r4.c()     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r4.c = r2     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
        L_0x0127:
            aucj r14 = r4.b     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            fyy r14 = (defpackage.fyy) r14     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            int r6 = r14.a     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r6 = r6 | 8
            r14.a = r6     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r14.f = r15     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            aucj r14 = r4.i()     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            fyy r14 = (defpackage.fyy) r14     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            aucx r15 = r3.b     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            int r15 = r15.size()     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            if (r15 != 0) goto L_0x0156
            java.lang.Object r15 = r3.c(r5)     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            aucd r15 = (defpackage.aucd) r15     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r15.a((defpackage.aucj) r3)     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r15.a((defpackage.fyy) r14)     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            aucj r14 = r15.i()     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r4 = r14
            fyw r4 = (defpackage.fyw) r4     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            goto L_0x01e0
        L_0x0156:
            r15 = 0
        L_0x0157:
            aucx r4 = r3.b     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            int r4 = r4.size()     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            if (r15 >= r4) goto L_0x019b
            aucx r4 = r3.b     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            java.lang.Object r4 = r4.get(r15)     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            fyy r4 = (defpackage.fyy) r4     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            int r4 = r4.b     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            int r6 = r13.f     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            if (r4 != r6) goto L_0x0198
            java.lang.Object r4 = r3.c(r5)     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            aucd r4 = (defpackage.aucd) r4     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r4.a((defpackage.aucj) r3)     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            boolean r3 = r4.c     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            if (r3 != 0) goto L_0x017b
            goto L_0x0180
        L_0x017b:
            r4.c()     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r4.c = r2     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
        L_0x0180:
            aucj r3 = r4.b     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            fyw r3 = (defpackage.fyw) r3     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r14.getClass()     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r3.a()     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            aucx r3 = r3.b     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r3.set(r15, r14)     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            aucj r15 = r4.i()     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            fyw r15 = (defpackage.fyw) r15     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r4 = r15
            r15 = 1
            goto L_0x019d
        L_0x0198:
            int r15 = r15 + 1
            goto L_0x0157
        L_0x019b:
            r4 = r3
            r15 = 0
        L_0x019d:
            if (r15 != 0) goto L_0x01e0
            java.lang.Object r15 = r4.c(r5)     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            aucd r15 = (defpackage.aucd) r15     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r15.a((defpackage.aucj) r4)     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r15.a((defpackage.fyy) r14)     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            aucj r14 = r15.i()     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r4 = r14
            fyw r4 = (defpackage.fyw) r4     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            goto L_0x01e0
        L_0x01b3:
            if (r3 == 0) goto L_0x01df
            int r14 = r3.a     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r14 = r14 & r1
            if (r14 == 0) goto L_0x01df
            java.lang.Object r14 = r3.c(r5)     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            aucd r14 = (defpackage.aucd) r14     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r14.a((defpackage.aucj) r3)     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            boolean r15 = r14.c     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            if (r15 != 0) goto L_0x01c8
            goto L_0x01cd
        L_0x01c8:
            r14.c()     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r14.c = r2     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
        L_0x01cd:
            aucj r15 = r14.b     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            fyw r15 = (defpackage.fyw) r15     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            aucx r3 = defpackage.aucj.s()     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r15.b = r3     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            aucj r14 = r14.i()     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r4 = r14
            fyw r4 = (defpackage.fyw) r4     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            goto L_0x01e0
        L_0x01df:
        L_0x01e0:
            elk r14 = r13.c     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            long r14 = r14.a(r4)     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            iwd r3 = a     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            java.lang.Long r14 = java.lang.Long.valueOf(r14)     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r1[r2] = r14     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            java.lang.String r14 = "Write complete, result: %d."
            java.lang.String r14 = java.lang.String.format(r14, r1)     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            java.lang.Object[] r15 = new java.lang.Object[r2]     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            r3.c(r14, r15)     // Catch:{ NoSuchAlgorithmException -> 0x0201, IOException -> 0x01ff }
            monitor-exit(r0)     // Catch:{ all -> 0x01fd }
            return
        L_0x01fd:
            r14 = move-exception
            goto L_0x020d
        L_0x01ff:
            r14 = move-exception
            goto L_0x0202
        L_0x0201:
            r14 = move-exception
        L_0x0202:
            iwd r15 = a     // Catch:{ all -> 0x01fd }
            java.lang.String r1 = "Update failed!"
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x01fd }
            r15.e(r1, r14, r2)     // Catch:{ all -> 0x01fd }
            monitor-exit(r0)     // Catch:{ all -> 0x01fd }
            return
        L_0x020d:
            monitor-exit(r0)     // Catch:{ all -> 0x01fd }
            goto L_0x0210
        L_0x020f:
            throw r14
        L_0x0210:
            goto L_0x020f
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eli.a(java.util.List, boolean):void");
    }

    public final boolean a() {
        return this.c.a() && this.h && ent.O();
    }
}
