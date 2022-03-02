package defpackage;

import android.accounts.Account;
import android.database.Cursor;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: afdt  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class afdt implements afeb {
    private static final String[] a = {"app_id", "account", "channel", "value"};
    private final Object b = new Object();
    private final awdn c;
    private final awdn d;
    private final afgs e;
    private final Map f;
    private final awdn g;
    private final awdn h;
    private final aeri i;
    private final afcx j;

    public afdt(awdn awdn, awdn awdn2, afgs afgs, afcx afcx, Map map, awdn awdn3, awdn awdn4, aeri aeri) {
        this.c = awdn;
        this.d = awdn2;
        this.e = afgs;
        this.j = afcx;
        this.f = map;
        this.g = awdn3;
        this.h = awdn4;
        this.i = aeri;
    }

    private final afdx a(String str, Account account, aukh aukh, afdr afdr) {
        aump aump;
        aukf aukf;
        afdr afdr2 = afdr;
        try {
            Cursor query = this.j.a().query("subscription", new String[]{"value"}, "app_id = ? AND account = ? AND channel = ?", new String[]{str, account.name, a(aukh)}, (String) null, (String) null, (String) null);
            afdx afdx = null;
            if (query == null) {
                return null;
            }
            try {
                query.moveToFirst();
                if (query.isAfterLast()) {
                    pia pia = (pia) this.c.a();
                    if (!this.i.I()) {
                        pia.c("No subscription found for %s", str);
                    } else {
                        if (afdr2 == afdr.GET) {
                            ((aetj) this.d.a()).a(10021, afgq.a(aukh));
                        }
                        pia.c("No subscription found for %s from %s", str, afdr2);
                    }
                } else {
                    aumj aumj = (aumj) aucj.a((aucj) aumj.h, query.getBlob(0));
                    aump aump2 = aumj.b;
                    if (aump2 != null) {
                        aump = aump2;
                    } else {
                        aump = aump.h;
                    }
                    aukf aukf2 = aumj.c;
                    if (aukf2 != null) {
                        aukf = aukf2;
                    } else {
                        aukf = aukf.c;
                    }
                    afdx = afdx.a(str, account, aukh, aump, aukf, aumj.e, aumj.f, aumj.g);
                }
                query.close();
                return afdx;
            } catch (auda e2) {
                throw new afdy("Couldn't parse SubscriptionValue.", e2);
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        } catch (afdm e3) {
            throw new afdy("Error accessing subscription database", e3);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d8 A[Catch:{ all -> 0x0109 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f2 A[SYNTHETIC, Splitter:B:33:0x00f2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.afdx b(java.lang.String r19, android.accounts.Account r20, defpackage.aukh r21, defpackage.aump r22, defpackage.aukf r23) {
        /*
            r18 = this;
            r1 = r18
            r2 = r19
            r3 = r20
            r4 = r21
            afcx r0 = r1.j     // Catch:{ afdm -> 0x010e }
            android.database.sqlite.SQLiteDatabase r0 = r0.c()     // Catch:{ afdm -> 0x010e }
            java.lang.String r5 = "INSERT OR REPLACE INTO subscription VALUES (?,?,?,?)"
            android.database.sqlite.SQLiteStatement r12 = r0.compileStatement(r5)     // Catch:{ afdm -> 0x010e }
            aumj r0 = defpackage.aumj.h     // Catch:{ all -> 0x0109 }
            aucd r5 = r0.o()     // Catch:{ all -> 0x0109 }
            boolean r0 = r5.c     // Catch:{ all -> 0x0109 }
            r6 = 0
            if (r0 != 0) goto L_0x0020
            goto L_0x0025
        L_0x0020:
            r5.c()     // Catch:{ all -> 0x0109 }
            r5.c = r6     // Catch:{ all -> 0x0109 }
        L_0x0025:
            aucj r0 = r5.b     // Catch:{ all -> 0x0109 }
            aumj r0 = (defpackage.aumj) r0     // Catch:{ all -> 0x0109 }
            r22.getClass()     // Catch:{ all -> 0x0109 }
            r7 = r22
            r0.b = r7     // Catch:{ all -> 0x0109 }
            int r8 = r0.a     // Catch:{ all -> 0x0109 }
            r9 = 1
            r8 = r8 | r9
            r0.a = r8     // Catch:{ all -> 0x0109 }
            r23.getClass()     // Catch:{ all -> 0x0109 }
            r10 = r23
            r0.c = r10     // Catch:{ all -> 0x0109 }
            r11 = 2
            r8 = r8 | r11
            r0.a = r8     // Catch:{ all -> 0x0109 }
            r21.getClass()     // Catch:{ all -> 0x0109 }
            r0.d = r4     // Catch:{ all -> 0x0109 }
            r13 = 4
            r8 = r8 | r13
            r0.a = r8     // Catch:{ all -> 0x0109 }
            aelh r0 = defpackage.pba.af     // Catch:{ all -> 0x0109 }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x0109 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0109 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0109 }
            if (r0 != 0) goto L_0x0059
            goto L_0x00b0
        L_0x0059:
            long r14 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0109 }
            boolean r0 = r5.c     // Catch:{ all -> 0x0109 }
            if (r0 != 0) goto L_0x0062
            goto L_0x0067
        L_0x0062:
            r5.c()     // Catch:{ all -> 0x0109 }
            r5.c = r6     // Catch:{ all -> 0x0109 }
        L_0x0067:
            aucj r0 = r5.b     // Catch:{ all -> 0x0109 }
            aumj r0 = (defpackage.aumj) r0     // Catch:{ all -> 0x0109 }
            int r8 = r0.a     // Catch:{ all -> 0x0109 }
            r8 = r8 | 32
            r0.a = r8     // Catch:{ all -> 0x0109 }
            r0.g = r14     // Catch:{ all -> 0x0109 }
            afgs r0 = r1.e     // Catch:{ IOException -> 0x00a2 }
            java.lang.Object r0 = r0.a()     // Catch:{ IOException -> 0x00a2 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ IOException -> 0x00a2 }
            int r0 = r0.intValue()     // Catch:{ IOException -> 0x00a2 }
            long r14 = android.os.SystemClock.elapsedRealtime()     // Catch:{ IOException -> 0x00a0 }
            boolean r8 = r5.c     // Catch:{ IOException -> 0x00a0 }
            if (r8 != 0) goto L_0x0088
            goto L_0x008d
        L_0x0088:
            r5.c()     // Catch:{ IOException -> 0x00a0 }
            r5.c = r6     // Catch:{ IOException -> 0x00a0 }
        L_0x008d:
            aucj r8 = r5.b     // Catch:{ IOException -> 0x00a0 }
            aumj r8 = (defpackage.aumj) r8     // Catch:{ IOException -> 0x00a0 }
            int r6 = r8.a     // Catch:{ IOException -> 0x00a0 }
            r6 = r6 | 16
            r8.a = r6     // Catch:{ IOException -> 0x00a0 }
            r8.f = r0     // Catch:{ IOException -> 0x00a0 }
            r0 = r6 | 8
            r8.a = r0     // Catch:{ IOException -> 0x00a0 }
            r8.e = r14     // Catch:{ IOException -> 0x00a0 }
            goto L_0x00b0
        L_0x00a0:
            r0 = move-exception
            goto L_0x00a3
        L_0x00a2:
            r0 = move-exception
        L_0x00a3:
            awdn r6 = r1.g     // Catch:{ all -> 0x0109 }
            java.lang.Object r6 = r6.a()     // Catch:{ all -> 0x0109 }
            pdg r6 = (defpackage.pdg) r6     // Catch:{ all -> 0x0109 }
            java.lang.String r8 = "Failed to retrieve boot count"
            r6.a(r8, r0)     // Catch:{ all -> 0x0109 }
        L_0x00b0:
            r12.bindString(r9, r2)     // Catch:{ all -> 0x0109 }
            java.lang.String r0 = r3.name     // Catch:{ all -> 0x0109 }
            r12.bindString(r11, r0)     // Catch:{ all -> 0x0109 }
            java.lang.String r0 = r1.a(r4)     // Catch:{ all -> 0x0109 }
            r6 = 3
            r12.bindString(r6, r0)     // Catch:{ all -> 0x0109 }
            aucj r0 = r5.i()     // Catch:{ all -> 0x0109 }
            aumj r0 = (defpackage.aumj) r0     // Catch:{ all -> 0x0109 }
            byte[] r0 = r0.k()     // Catch:{ all -> 0x0109 }
            r12.bindBlob(r13, r0)     // Catch:{ all -> 0x0109 }
            long r13 = r12.executeInsert()     // Catch:{ all -> 0x0109 }
            r16 = -1
            int r0 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r0 == 0) goto L_0x00f2
            r8 = -1
            r0 = -1
            r13 = -1
            r2 = r19
            r3 = r20
            r4 = r21
            r5 = r22
            r6 = r23
            r7 = r8
            r9 = r0
            r10 = r13
            afdx r0 = defpackage.afdx.a(r2, r3, r4, r5, r6, r7, r9, r10)     // Catch:{ all -> 0x0109 }
            r12.close()
            return r0
        L_0x00f2:
            afdy r0 = new afdy     // Catch:{ all -> 0x0109 }
            java.util.Locale r5 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x0109 }
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ all -> 0x0109 }
            r7 = 0
            r6[r7] = r2     // Catch:{ all -> 0x0109 }
            r6[r9] = r3     // Catch:{ all -> 0x0109 }
            r6[r11] = r4     // Catch:{ all -> 0x0109 }
            java.lang.String r2 = "Failed to set subscription for app=%s, account=%s, channel=%s"
            java.lang.String r2 = java.lang.String.format(r5, r2, r6)     // Catch:{ all -> 0x0109 }
            r0.<init>(r2)     // Catch:{ all -> 0x0109 }
            throw r0     // Catch:{ all -> 0x0109 }
        L_0x0109:
            r0 = move-exception
            r12.close()
            throw r0
        L_0x010e:
            r0 = move-exception
            afdy r2 = new afdy
            java.lang.String r3 = "Error accessing subscription database"
            r2.<init>(r3, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afdt.b(java.lang.String, android.accounts.Account, aukh, aump, aukf):afdx");
    }

    private final String a(aukh aukh) {
        return ((aerh) this.f.get(aukg.a(aukh.a))).a(aukh);
    }

    public final List a() {
        try {
            Cursor query = this.j.a().query("subscription", a, (String) null, (String[]) null, (String) null, (String) null, (String) null);
            if (query == null) {
                return Collections.emptyList();
            }
            amzt j2 = amzy.j();
            try {
                query.moveToFirst();
                while (!query.isAfterLast()) {
                    String string = query.getString(0);
                    String string2 = query.getString(1);
                    aumj aumj = (aumj) aucj.a((aucj) aumj.h, query.getBlob(3));
                    Account account = new Account(string2, "com.google");
                    aukh aukh = aumj.d;
                    if (aukh == null) {
                        aukh = aukh.c;
                    }
                    aump aump = aumj.b;
                    if (aump == null) {
                        aump = aump.h;
                    }
                    aukf aukf = aumj.c;
                    if (aukf == null) {
                        aukf = aukf.c;
                    }
                    j2.c(afdx.a(string, account, aukh, aump, aukf, aumj.e, aumj.f, aumj.g));
                    query.moveToNext();
                }
                query.close();
                return j2.a();
            } catch (auda e2) {
                throw new afdy("Couldn't parse SubscriptionValue.", e2);
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        } catch (afdm e3) {
            throw new afdy("Error accessing subscription database", e3);
        }
    }

    public final afdx b(String str, Account account, aukh aukh) {
        return a(str, account, aukh, afdr.GET);
    }

    public final List a(Account account, aukh aukh) {
        aukf aukf;
        try {
            Cursor query = this.j.a().query("subscription", new String[]{"app_id", "value"}, "account = ? AND channel = ?", new String[]{account.name, a(aukh)}, (String) null, (String) null, (String) null);
            if (query == null) {
                return Collections.emptyList();
            }
            amzt j2 = amzy.j();
            try {
                query.moveToFirst();
                while (!query.isAfterLast()) {
                    String string = query.getString(0);
                    aumj aumj = (aumj) aucj.a((aucj) aumj.h, query.getBlob(1));
                    aump aump = aumj.b;
                    if (aump == null) {
                        aump = aump.h;
                    }
                    aukf aukf2 = aumj.c;
                    if (aukf2 != null) {
                        aukf = aukf2;
                    } else {
                        aukf = aukf.c;
                    }
                    j2.c(afdx.a(string, account, aukh, aump, aukf, aumj.e, aumj.f, aumj.g));
                    query.moveToNext();
                    aukh aukh2 = aukh;
                }
                query.close();
                return j2.a();
            } catch (auda e2) {
                throw new afdy("Couldn't parse SubscriptionValue.", e2);
            } catch (Throwable th) {
                query.close();
                throw th;
            }
        } catch (afdm e3) {
            throw new afdy("Error accessing subscription database", e3);
        }
    }

    public final void a(Account account, afdz afdz) {
        if (this.i.I() && afdz != null) {
            pia pia = (pia) this.c.a();
            ((pia) this.c.a()).c("Deleting user subscriptions (reason=%s)", afdz);
        }
        synchronized (this.b) {
            try {
                this.j.c().delete("subscription", "account = ?", new String[]{account.name});
            } catch (afdm e2) {
                throw new afdy("Error accessing subscription database", e2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(String str, afdz afdz) {
        if (this.i.I() && afdz != null) {
            ((pia) this.c.a()).c("Deleting app subscriptions (app=%s, reason=%s)", str, afdz);
        }
        synchronized (this.b) {
            try {
                this.j.c().delete("subscription", "app_id = ?", new String[]{str});
            } catch (afdm e2) {
                throw new afdy("Error accessing subscription database", e2);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a(String str, Account account, aukh aukh) {
        if ("com.google".equals(account.type)) {
            synchronized (this.b) {
                afdx a2 = a(str, account, aukh, afdr.REFRESH);
                if (a2 != null) {
                    b(str, account, aukh, a2.d(), a2.e());
                }
            }
            return;
        }
        throw new IllegalArgumentException("Only Google account subscriptions allowed.");
    }

    public final void a(String str, Account account, aukh aukh, afdz afdz) {
        afdx a2;
        if (this.i.I() && afdz != null) {
            pia pia = (pia) this.c.a();
            ((pia) this.c.a()).c("Deleting subscription (app=%s, reason=%s)", str, afdz);
        }
        synchronized (this.b) {
            try {
                a2 = a(str, account, aukh, afdr.DELETE);
                this.j.c().delete("subscription", "app_id = ? AND account = ? AND channel = ?", new String[]{str, account.name, a(aukh)});
            } catch (afdm e2) {
                throw new afdy("Error accessing subscription database", e2);
            }
        }
        if (!axtl.a.a().a() || a2 != null) {
            for (afea a3 : (Set) this.h.a()) {
                a3.a(a2);
            }
        }
    }

    public final void a(String str, Account account, aukh aukh, aump aump, aukf aukf) {
        afdx a2;
        afdx afdx;
        if ("com.google".equals(account.type)) {
            synchronized (this.b) {
                a2 = a(str, account, aukh, afdr.SUBSCRIBE);
                if (a2 != null && a2.e().equals(aukf)) {
                    if (a2.d().equals(aump)) {
                        afdx = a2;
                    }
                }
                afdx = b(str, account, aukh, aump, aukf);
            }
            for (afea a3 : (Set) this.h.a()) {
                a3.a(a2, afdx);
            }
            return;
        }
        throw new IllegalArgumentException("Only Google account subscriptions allowed.");
    }
}
