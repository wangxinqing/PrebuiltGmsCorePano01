package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.os.SystemClock;
import com.google.android.gms.org.conscrypt.PSKKeyManager;
import java.util.Arrays;
import java.util.List;

/* renamed from: ygu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class ygu extends nis {
    private static final jjg a = jjg.a(iyc.PHENOTYPE);
    private final avtj b;
    private final boolean c;

    public ygu(String str, avtj avtj) {
        this(str, avtj, true);
    }

    private final void a(Context context, long j, Exception exc) {
        aucd a2 = yfd.a(context);
        avst a3 = a();
        if (a3 != null) {
            aucd aucd = (aucd) a3.c(5);
            aucd.a((aucj) a3);
            avss avss = (avss) aucd;
            int elapsedRealtime = (int) (SystemClock.elapsedRealtime() - j);
            if (avss.c) {
                avss.c();
                avss.c = false;
            }
            avst avst = (avst) avss.b;
            avst.a |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            avst.l = elapsedRealtime;
            if (a2.c) {
                a2.c();
                a2.c = false;
            }
            avtk avtk = (avtk) a2.b;
            avst avst2 = (avst) avss.i();
            avtk avtk2 = avtk.k;
            avst2.getClass();
            avtk.c = avst2;
            avtk.a |= 2;
        }
        avst[] b2 = b();
        if (b2 != null) {
            List asList = Arrays.asList(b2);
            if (a2.c) {
                a2.c();
                a2.c = false;
            }
            avtk avtk3 = (avtk) a2.b;
            avtk avtk4 = avtk.k;
            if (!avtk3.d.a()) {
                avtk3.d = aucj.a(avtk3.d);
            }
            auab.a((Iterable) asList, (List) avtk3.d);
        }
        List d = d();
        if (d != null && !d.isEmpty()) {
            if (a2.c) {
                a2.c();
                a2.c = false;
            }
            avtk avtk5 = (avtk) a2.b;
            avtk avtk6 = avtk.k;
            avtk5.c();
            auab.a((Iterable) d, (List) avtk5.j);
        }
        avtd c2 = c();
        if (c2 != null) {
            if (a2.c) {
                a2.c();
                a2.c = false;
            }
            avtk avtk7 = (avtk) a2.b;
            avtk avtk8 = avtk.k;
            c2.getClass();
            avtk7.g = c2;
            avtk7.a |= 32;
        }
        if (exc != null) {
            aucd o = avti.d.o();
            String name = exc.getClass().getName();
            if (o.c) {
                o.c();
                o.c = false;
            }
            avti avti = (avti) o.b;
            name.getClass();
            int i = avti.a | 1;
            avti.a = i;
            avti.b = name;
            if (exc instanceof yfy) {
                int i2 = ((yfy) exc).a;
                avti.a = i | 2;
                avti.c = i2;
            }
            if (a2.c) {
                a2.c();
                a2.c = false;
            }
            avtk avtk9 = (avtk) a2.b;
            avti avti2 = (avti) o.i();
            avtk avtk10 = avtk.k;
            avti2.getClass();
            avtk9.e = avti2;
            avtk9.a |= 8;
            anih anih = (anih) a.b();
            anih.a((Throwable) exc);
            ((anih) anih.a("ygu", "a", 213, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Phenotype API error. Event %s, EventCode: %s", (Object) a2.i(), (Object) this.b);
        } else {
            a2.i();
        }
        hoi a4 = yfd.a().a(((avtk) a2.i()).k());
        a4.b(this.b.O);
        a4.b();
    }

    public abstract avst a();

    public abstract void b(Context context);

    public abstract void b(Context context, yfw yfw);

    public avst[] b() {
        return null;
    }

    public avtd c() {
        return null;
    }

    public List d() {
        return null;
    }

    public ygu(String str, avtj avtj, boolean z) {
        super(51, str);
        this.b = avtj;
        this.c = z;
    }

    public static void a(Context context, String str, SQLiteException sQLiteException) {
        aucd a2 = yfd.a(context);
        aucd o = avtl.f.o();
        String name = sQLiteException.getClass().getName();
        if (o.c) {
            o.c();
            o.c = false;
        }
        avtl avtl = (avtl) o.b;
        name.getClass();
        int i = avtl.a | 1;
        avtl.a = i;
        avtl.b = name;
        str.getClass();
        avtl.a = i | 2;
        avtl.c = str;
        String message = sQLiteException.getMessage();
        if (o.c) {
            o.c();
            o.c = false;
        }
        avtl avtl2 = (avtl) o.b;
        message.getClass();
        avtl2.a |= 4;
        avtl2.d = message;
        StringBuilder sb = new StringBuilder();
        if (yhe.a()) {
            yfg b2 = yfg.b(context);
            try {
                sb.append("Device-encrypted:");
                sb.append(yfw.b(b2.getWritableDatabase()));
                sb.append("\n");
            } catch (SQLiteException e) {
                anih anih = (anih) a.b();
                anih.a((Throwable) e);
                ((anih) anih.a("ygu", "a", 242, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Phenotype deDatabase integrity check failed");
            } catch (Throwable th) {
                b2.close();
                throw th;
            }
            b2.close();
        }
        if (aekv.b(context)) {
            yfg a3 = yfg.a(context);
            try {
                sb.append("Credential-encrypted:");
                sb.append(yfw.b(a3.getWritableDatabase()));
            } catch (SQLiteException e2) {
                anih anih2 = (anih) a.b();
                anih2.a((Throwable) e2);
                ((anih) anih2.a("ygu", "a", 255, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Phenotype ceDatabase integrity check failed");
            } catch (Throwable th2) {
                a3.close();
                throw th2;
            }
            a3.close();
        }
        String sb2 = sb.toString();
        if (o.c) {
            o.c();
            o.c = false;
        }
        avtl avtl3 = (avtl) o.b;
        sb2.getClass();
        avtl3.a |= 8;
        avtl3.e = sb2;
        if (a2.c) {
            a2.c();
            a2.c = false;
        }
        avtk avtk = (avtk) a2.b;
        avtl avtl4 = (avtl) o.i();
        avtk avtk2 = avtk.k;
        avtl4.getClass();
        avtk.f = avtl4;
        avtk.a |= 16;
        hoi a4 = yfd.a().a(((avtk) a2.i()).k());
        a4.b(31);
        a4.b();
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r9) {
        /*
            r8 = this;
            ayyo r0 = defpackage.ayyo.a
            ayyp r0 = r0.a()
            boolean r0 = r0.a()
            if (r0 != 0) goto L_0x001c
            yfg r0 = defpackage.yfg.a(r9)
            r8.a(r9, r0)     // Catch:{ all -> 0x0017 }
            r0.close()
            return
        L_0x0017:
            r9 = move-exception
            r0.close()
            throw r9
        L_0x001c:
            long r0 = android.os.SystemClock.elapsedRealtime()
            boolean r2 = defpackage.aekv.a(r9)
            if (r2 != 0) goto L_0x005a
            r2 = 0
            r8.b(r9)     // Catch:{ IOException -> 0x0043, yfy -> 0x0036, RuntimeException -> 0x0034, all -> 0x0032 }
            boolean r3 = r8.c
            if (r3 == 0) goto L_0x0031
            r8.a((android.content.Context) r9, (long) r0, (java.lang.Exception) r2)
        L_0x0031:
            return
        L_0x0032:
            r3 = move-exception
            goto L_0x0052
        L_0x0034:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0041 }
        L_0x0036:
            r2 = move-exception
            nja r3 = new nja     // Catch:{ all -> 0x0041 }
            int r4 = r2.a     // Catch:{ all -> 0x0041 }
            java.lang.String r5 = r2.b     // Catch:{ all -> 0x0041 }
            r3.<init>(r4, r5)     // Catch:{ all -> 0x0041 }
            throw r3     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r3 = move-exception
            goto L_0x0052
        L_0x0043:
            r3 = move-exception
            nja r4 = new nja     // Catch:{ all -> 0x004e }
            r5 = 29511(0x7347, float:4.1354E-41)
            java.lang.String r6 = "Operation failed"
            r4.<init>(r5, r6, r2, r3)     // Catch:{ all -> 0x004e }
            throw r4     // Catch:{ all -> 0x004e }
        L_0x004e:
            r2 = move-exception
            r7 = r3
            r3 = r2
            r2 = r7
        L_0x0052:
            boolean r4 = r8.c
            if (r4 == 0) goto L_0x0059
            r8.a((android.content.Context) r9, (long) r0, (java.lang.Exception) r2)
        L_0x0059:
            throw r3
        L_0x005a:
            nja r9 = new nja
            r0 = 29508(0x7344, float:4.135E-41)
            java.lang.String r1 = "API access is not supported in direct boot mode."
            r9.<init>(r0, r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ygu.a(android.content.Context):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r7, defpackage.yfw r8) {
        /*
            r6 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            boolean r2 = defpackage.aekv.a(r7)
            if (r2 != 0) goto L_0x005b
            r2 = 0
            r6.b(r7, r8)     // Catch:{ SQLiteException -> 0x0032, yfx -> 0x0025, yfy -> 0x001a, RuntimeException -> 0x0018 }
            boolean r8 = r6.c
            if (r8 == 0) goto L_0x004e
            r6.a((android.content.Context) r7, (long) r0, (java.lang.Exception) r2)
            return
        L_0x0016:
            r8 = move-exception
            goto L_0x0053
        L_0x0018:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x0030 }
        L_0x001a:
            r2 = move-exception
            nja r8 = new nja     // Catch:{ all -> 0x0030 }
            int r3 = r2.a     // Catch:{ all -> 0x0030 }
            java.lang.String r4 = r2.b     // Catch:{ all -> 0x0030 }
            r8.<init>(r3, r4)     // Catch:{ all -> 0x0030 }
            throw r8     // Catch:{ all -> 0x0030 }
        L_0x0025:
            r2 = move-exception
            nja r8 = new nja     // Catch:{ all -> 0x0030 }
            int r3 = r2.a     // Catch:{ all -> 0x0030 }
            java.lang.String r4 = r2.b     // Catch:{ all -> 0x0030 }
            r8.<init>(r3, r4)     // Catch:{ all -> 0x0030 }
            throw r8     // Catch:{ all -> 0x0030 }
        L_0x0030:
            r8 = move-exception
            goto L_0x0053
        L_0x0032:
            r8 = move-exception
            boolean r3 = r6.c     // Catch:{ all -> 0x0016 }
            if (r3 == 0) goto L_0x0042
            java.lang.Class r3 = r6.getClass()     // Catch:{ all -> 0x0016 }
            java.lang.String r3 = r3.getName()     // Catch:{ all -> 0x0016 }
            a((android.content.Context) r7, (java.lang.String) r3, (android.database.sqlite.SQLiteException) r8)     // Catch:{ all -> 0x0016 }
        L_0x0042:
            com.google.android.gms.common.api.Status r2 = com.google.android.gms.common.api.Status.c     // Catch:{ all -> 0x004f }
            r6.a((com.google.android.gms.common.api.Status) r2)     // Catch:{ all -> 0x004f }
            boolean r2 = r6.c
            if (r2 == 0) goto L_0x004e
            r6.a((android.content.Context) r7, (long) r0, (java.lang.Exception) r8)
        L_0x004e:
            return
        L_0x004f:
            r2 = move-exception
            r5 = r2
            r2 = r8
            r8 = r5
        L_0x0053:
            boolean r3 = r6.c
            if (r3 == 0) goto L_0x005a
            r6.a((android.content.Context) r7, (long) r0, (java.lang.Exception) r2)
        L_0x005a:
            throw r8
        L_0x005b:
            nja r7 = new nja
            r8 = 29508(0x7344, float:4.135E-41)
            java.lang.String r0 = "API access is not supported in direct boot mode."
            r7.<init>(r8, r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ygu.a(android.content.Context, yfw):void");
    }
}
