package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Objects;

/* renamed from: wbo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wbo {
    private final Context a;
    private final String b;
    private String c;
    private wbn d;

    public wbo(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    private final boolean a(Account account, vhi vhi) {
        FileOutputStream fileOutputStream;
        File a2 = who.a(this.a, account, "nearby_sharing_account_metadata");
        if (!a2.exists()) {
            try {
                if (!a2.createNewFile()) {
                    ((anih) ((anih) vvj.a.c()).a("wbo", "a", 238, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to save account metadata to disk.");
                    return false;
                }
            } catch (IOException e) {
                anih anih = (anih) vvj.a.c();
                anih.a((Throwable) e);
                ((anih) anih.a("wbo", "a", 242, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to save account metadata to disk.");
                return false;
            }
        }
        try {
            fileOutputStream = new FileOutputStream(a2);
            vhi.a(fileOutputStream);
            fileOutputStream.close();
            return true;
        } catch (IOException e2) {
            anih anih2 = (anih) vvj.a.c();
            anih2.a((Throwable) e2);
            ((anih) anih2.a("wbo", "a", 251, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to save account metadata to disk.");
            return false;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    private final vhi b(Account account) {
        FileInputStream fileInputStream;
        File a2 = who.a(this.a, account, "nearby_sharing_account_metadata");
        if (!a2.exists()) {
            return vhi.e;
        }
        try {
            fileInputStream = new FileInputStream(a2);
            vhi vhi = (vhi) aucj.a((aucj) vhi.e, (InputStream) fileInputStream, aubs.c());
            fileInputStream.close();
            return vhi;
        } catch (IOException e) {
            anih anih = (anih) vvj.a.c();
            anih.a((Throwable) e);
            ((anih) anih.a("wbo", "b", 222, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to load metadata for %s", (Object) account);
            return vhi.e;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    public final synchronized String a() {
        return this.b;
    }

    public final synchronized Account b() {
        wbn wbn = this.d;
        if (wbn == null) {
            return null;
        }
        return ((wbr) wbn).a;
    }

    public final synchronized String c() {
        wbn wbn = this.d;
        if (wbn == null) {
            return null;
        }
        return ((wbr) wbn).b;
    }

    public final synchronized void c(String str) {
        this.c = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String d() {
        /*
            r3 = this;
            monitor-enter(r3)
            android.accounts.Account r0 = r3.b()     // Catch:{ all -> 0x001a }
            r1 = 0
            if (r0 == 0) goto L_0x0018
            vhi r0 = r3.b((android.accounts.Account) r0)     // Catch:{ all -> 0x001a }
            java.lang.String r2 = r0.c     // Catch:{ all -> 0x001a }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x001a }
            if (r2 != 0) goto L_0x0018
            java.lang.String r0 = r0.c     // Catch:{ all -> 0x001a }
            monitor-exit(r3)
            return r0
        L_0x0018:
            monitor-exit(r3)
            return r1
        L_0x001a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wbo.d():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String e() {
        /*
            r3 = this;
            monitor-enter(r3)
            android.accounts.Account r0 = r3.b()     // Catch:{ all -> 0x001a }
            r1 = 0
            if (r0 == 0) goto L_0x0018
            vhi r0 = r3.b((android.accounts.Account) r0)     // Catch:{ all -> 0x001a }
            java.lang.String r2 = r0.d     // Catch:{ all -> 0x001a }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x001a }
            if (r2 != 0) goto L_0x0018
            java.lang.String r0 = r0.d     // Catch:{ all -> 0x001a }
            monitor-exit(r3)
            return r0
        L_0x0018:
            monitor-exit(r3)
            return r1
        L_0x001a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wbo.e():java.lang.String");
    }

    public final synchronized String f() {
        return this.c;
    }

    public final synchronized void g() {
        a((Account) null);
        this.c = null;
        who.b(this.a, "nearby_sharing_account_metadata");
        ((anih) ((anih) vvj.a.d()).a("wbo", "g", 204, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Reset AccountManager.");
    }

    static boolean a(Context context, Account account, vhi vhi) {
        FileOutputStream fileOutputStream;
        File a2 = who.a(context, account, "nearby_sharing_account_metadata");
        if (!a2.exists()) {
            try {
                if (!a2.createNewFile()) {
                    ((anih) ((anih) vvj.a.c()).a("wbo", "a", 238, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to save account metadata to disk.");
                    return false;
                }
            } catch (IOException e) {
                anih anih = (anih) vvj.a.c();
                anih.a((Throwable) e);
                ((anih) anih.a("wbo", "a", 242, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to save account metadata to disk.");
                return false;
            }
        }
        try {
            fileOutputStream = new FileOutputStream(a2);
            vhi.a(fileOutputStream);
            fileOutputStream.close();
            return true;
        } catch (IOException e2) {
            anih anih2 = (anih) vvj.a.c();
            anih2.a((Throwable) e2);
            ((anih) anih2.a("wbo", "a", 251, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to save account metadata to disk.");
            return false;
        } catch (Throwable th) {
            apev.a(th, th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void b(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.accounts.Account r0 = r4.b()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0044
            vhi r1 = r4.b((android.accounts.Account) r0)     // Catch:{ all -> 0x0046 }
            java.lang.String r2 = r1.d     // Catch:{ all -> 0x0046 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0046 }
            if (r2 != 0) goto L_0x0044
            r2 = 5
            java.lang.Object r2 = r1.c(r2)     // Catch:{ all -> 0x0046 }
            aucd r2 = (defpackage.aucd) r2     // Catch:{ all -> 0x0046 }
            r2.a((defpackage.aucj) r1)     // Catch:{ all -> 0x0046 }
            boolean r1 = r2.c     // Catch:{ all -> 0x0046 }
            if (r1 != 0) goto L_0x0022
            goto L_0x0028
        L_0x0022:
            r2.c()     // Catch:{ all -> 0x0046 }
            r1 = 0
            r2.c = r1     // Catch:{ all -> 0x0046 }
        L_0x0028:
            aucj r1 = r2.b     // Catch:{ all -> 0x0046 }
            vhi r1 = (defpackage.vhi) r1     // Catch:{ all -> 0x0046 }
            vhi r3 = defpackage.vhi.e     // Catch:{ all -> 0x0046 }
            r5.getClass()     // Catch:{ all -> 0x0046 }
            int r3 = r1.a     // Catch:{ all -> 0x0046 }
            r3 = r3 | 4
            r1.a = r3     // Catch:{ all -> 0x0046 }
            r1.d = r5     // Catch:{ all -> 0x0046 }
            aucj r5 = r2.i()     // Catch:{ all -> 0x0046 }
            vhi r5 = (defpackage.vhi) r5     // Catch:{ all -> 0x0046 }
            r4.a(r0, r5)     // Catch:{ all -> 0x0046 }
            monitor-exit(r4)
            return
        L_0x0044:
            monitor-exit(r4)
            return
        L_0x0046:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wbo.b(java.lang.String):void");
    }

    public final synchronized void a(PrintWriter printWriter) {
        String str;
        printWriter.write(String.format("%s\n", new Object[]{"com.google.android.gms.nearby.sharing.provider.AccountManager"}));
        printWriter.write(String.format("  Device Id: %s\n", new Object[]{this.b}));
        Object[] objArr = new Object[1];
        wbn wbn = this.d;
        if (wbn != null) {
            str = ((wbr) wbn).a.name;
        } else {
            str = null;
        }
        objArr[0] = str;
        printWriter.write(String.format("  Account Name: %s\n", objArr));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(java.lang.String r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            android.accounts.Account r0 = r4.b()     // Catch:{ all -> 0x0046 }
            if (r0 == 0) goto L_0x0044
            vhi r1 = r4.b((android.accounts.Account) r0)     // Catch:{ all -> 0x0046 }
            java.lang.String r2 = r1.c     // Catch:{ all -> 0x0046 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0046 }
            if (r2 != 0) goto L_0x0044
            r2 = 5
            java.lang.Object r2 = r1.c(r2)     // Catch:{ all -> 0x0046 }
            aucd r2 = (defpackage.aucd) r2     // Catch:{ all -> 0x0046 }
            r2.a((defpackage.aucj) r1)     // Catch:{ all -> 0x0046 }
            boolean r1 = r2.c     // Catch:{ all -> 0x0046 }
            if (r1 != 0) goto L_0x0022
            goto L_0x0028
        L_0x0022:
            r2.c()     // Catch:{ all -> 0x0046 }
            r1 = 0
            r2.c = r1     // Catch:{ all -> 0x0046 }
        L_0x0028:
            aucj r1 = r2.b     // Catch:{ all -> 0x0046 }
            vhi r1 = (defpackage.vhi) r1     // Catch:{ all -> 0x0046 }
            vhi r3 = defpackage.vhi.e     // Catch:{ all -> 0x0046 }
            r5.getClass()     // Catch:{ all -> 0x0046 }
            int r3 = r1.a     // Catch:{ all -> 0x0046 }
            r3 = r3 | 2
            r1.a = r3     // Catch:{ all -> 0x0046 }
            r1.c = r5     // Catch:{ all -> 0x0046 }
            aucj r5 = r2.i()     // Catch:{ all -> 0x0046 }
            vhi r5 = (defpackage.vhi) r5     // Catch:{ all -> 0x0046 }
            r4.a(r0, r5)     // Catch:{ all -> 0x0046 }
            monitor-exit(r4)
            return
        L_0x0044:
            monitor-exit(r4)
            return
        L_0x0046:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wbo.a(java.lang.String):void");
    }

    public final synchronized boolean a(Account account) {
        String str;
        String str2 = null;
        if (account == null) {
            this.d = null;
            ((anih) ((anih) vvj.a.d()).a("wbo", "a", 76, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Removed active account");
            return true;
        } else if (account.equals(b())) {
            return true;
        } else {
            vhi b2 = b(account);
            if ((b2.a & 1) != 0) {
                str = b2.b;
            } else {
                try {
                    str2 = eig.c(this.a, account.name);
                } catch (eif | IOException e) {
                    anih anih = (anih) vvj.a.b();
                    anih.a(e);
                    ((anih) anih.a("who", "a", 96, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to find obfuscated Gaia id for %s.", Objects.hashCode(account));
                }
                if (!TextUtils.isEmpty(str2)) {
                    aucd aucd = (aucd) b2.c(5);
                    aucd.a((aucj) b2);
                    if (aucd.c) {
                        aucd.c();
                        aucd.c = false;
                    }
                    vhi vhi = (vhi) aucd.b;
                    vhi vhi2 = vhi.e;
                    str2.getClass();
                    vhi.a |= 1;
                    vhi.b = str2;
                    if (!a(account, (vhi) aucd.i())) {
                        ((anih) ((anih) vvj.a.d()).a("wbo", "a", 97, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Failed to set account %s", (Object) account);
                        return false;
                    }
                    str = str2;
                } else {
                    ((anih) ((anih) vvj.a.d()).a("wbo", "a", 91, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Account %s does not have account id, Failed to set as active account", (Object) account);
                    return false;
                }
            }
            wbm wbm = new wbm();
            wbm.a = account;
            if (str != null) {
                wbm.b = str;
                String str3 = "";
                if (wbm.a == null) {
                    str3 = " account";
                }
                if (wbm.b == null) {
                    str3 = str3.concat(" accountId");
                }
                if (!str3.isEmpty()) {
                    String valueOf = String.valueOf(str3);
                    throw new IllegalStateException(valueOf.length() == 0 ? new String("Missing required properties:") : "Missing required properties:".concat(valueOf));
                }
                this.d = new wbr(wbm.a, wbm.b);
                jjg jjg = vvj.a;
                return true;
            }
            throw new NullPointerException("Null accountId");
        }
    }
}
