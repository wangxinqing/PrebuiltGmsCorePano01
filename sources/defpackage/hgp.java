package defpackage;

import android.content.Context;
import com.google.android.chimera.config.InvalidConfigException;
import com.google.android.gms.phenotype.RegistrationInfo;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: hgp  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hgp {
    public static final agvx a;
    private static final agvw b;

    static {
        agvw b2 = new agvw(yef.a("com.google.android.gms.chimera")).a().b("OptionalModules__");
        b = b2;
        a = agvx.a(b2, "module_set_list", heh.a);
    }

    public static Long a(Context context) {
        try {
            return (Long) acws.a(yef.a(context).a(), awxp.a.a().n(), TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r3 = r4.moduleVersion;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0051, code lost:
        r2 = r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] b(android.content.Context r9) {
        /*
            java.lang.String r0 = "com.google.android.gms.phenotype.registration.proto"
            com.google.android.chimera.config.ModuleManager r1 = com.google.android.chimera.config.ModuleManager.get(r9)     // Catch:{ InvalidConfigException -> 0x00cf }
            java.util.Collection r1 = r1.getAllModulesWithMetadata(r0)     // Catch:{ InvalidConfigException -> 0x00cf }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ InvalidConfigException -> 0x00cf }
            r2 = 0
            r3 = -1
        L_0x0010:
            boolean r4 = r1.hasNext()     // Catch:{ InvalidConfigException -> 0x00cf }
            if (r4 == 0) goto L_0x0094
            java.lang.Object r4 = r1.next()     // Catch:{ InvalidConfigException -> 0x00cf }
            com.google.android.chimera.config.ModuleManager$ModuleInfo r4 = (com.google.android.chimera.config.ModuleManager.ModuleInfo) r4     // Catch:{ InvalidConfigException -> 0x00cf }
            android.os.Bundle r5 = r4.getMetadata(r9)     // Catch:{ InvalidConfigException -> 0x00cf }
            byte[] r5 = r5.getByteArray(r0)     // Catch:{ InvalidConfigException -> 0x00cf }
            defpackage.amtf.a((java.lang.Object) r5)     // Catch:{ InvalidConfigException -> 0x00cf }
            aubs r6 = defpackage.aubs.b()     // Catch:{ auda -> 0x0057 }
            nim r7 = defpackage.nim.b     // Catch:{ auda -> 0x0057 }
            aucj r5 = defpackage.aucj.a((defpackage.aucj) r7, (byte[]) r5, (defpackage.aubs) r6)     // Catch:{ auda -> 0x0057 }
            nim r5 = (defpackage.nim) r5     // Catch:{ auda -> 0x0057 }
            aucx r5 = r5.a     // Catch:{ auda -> 0x0057 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ auda -> 0x0057 }
        L_0x0039:
            boolean r6 = r5.hasNext()     // Catch:{ auda -> 0x0057 }
            if (r6 == 0) goto L_0x0055
            java.lang.Object r6 = r5.next()     // Catch:{ auda -> 0x0057 }
            nil r6 = (defpackage.nil) r6     // Catch:{ auda -> 0x0057 }
            java.lang.String r7 = "com.google.android.gms"
            java.lang.String r8 = r6.b     // Catch:{ auda -> 0x0057 }
            boolean r7 = r7.equals(r8)     // Catch:{ auda -> 0x0057 }
            if (r7 == 0) goto L_0x0039
            int r3 = r4.moduleVersion     // Catch:{ auda -> 0x0053 }
            r2 = r6
            goto L_0x0092
        L_0x0053:
            r2 = move-exception
            goto L_0x005a
        L_0x0055:
            goto L_0x0092
        L_0x0057:
            r5 = move-exception
            r6 = r2
            r2 = r5
        L_0x005a:
            java.lang.String r5 = "ChimeraPhHelper"
            java.lang.String r4 = r4.moduleId     // Catch:{ InvalidConfigException -> 0x00cf }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ InvalidConfigException -> 0x00cf }
            java.lang.String r7 = java.lang.String.valueOf(r4)     // Catch:{ InvalidConfigException -> 0x00cf }
            int r7 = r7.length()     // Catch:{ InvalidConfigException -> 0x00cf }
            int r7 = r7 + 18
            java.lang.String r8 = java.lang.String.valueOf(r2)     // Catch:{ InvalidConfigException -> 0x00cf }
            int r8 = r8.length()     // Catch:{ InvalidConfigException -> 0x00cf }
            int r7 = r7 + r8
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ InvalidConfigException -> 0x00cf }
            r8.<init>(r7)     // Catch:{ InvalidConfigException -> 0x00cf }
            java.lang.String r7 = "Skipping module "
            r8.append(r7)     // Catch:{ InvalidConfigException -> 0x00cf }
            r8.append(r4)     // Catch:{ InvalidConfigException -> 0x00cf }
            java.lang.String r4 = ": "
            r8.append(r4)     // Catch:{ InvalidConfigException -> 0x00cf }
            r8.append(r2)     // Catch:{ InvalidConfigException -> 0x00cf }
            java.lang.String r2 = r8.toString()     // Catch:{ InvalidConfigException -> 0x00cf }
            android.util.Log.w(r5, r2)     // Catch:{ InvalidConfigException -> 0x00cf }
            r2 = r6
        L_0x0092:
            goto L_0x0010
        L_0x0094:
            if (r2 == 0) goto L_0x00c7
            yey r0 = defpackage.yef.a((android.content.Context) r9)
            a(r9, r0, r2, r3)
            r9 = 0
        L_0x009e:
            long r0 = (long) r9
            long r2 = defpackage.awxp.c()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x00c1
            agvx r0 = defpackage.heh.d
            java.lang.Object r0 = r0.c()
            byte[] r0 = (byte[]) r0
            byte[] r1 = defpackage.heh.a
            if (r0 != r1) goto L_0x00c0
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x00bb }
            int r9 = r9 + 1
            goto L_0x009e
        L_0x00bb:
            r9 = move-exception
            java.lang.Thread.interrupted()
            goto L_0x00c1
        L_0x00c0:
            return r0
        L_0x00c1:
            hgo r9 = new hgo
            r9.<init>()
            throw r9
        L_0x00c7:
            hgo r9 = new hgo
            java.lang.String r0 = "unable to find registration info"
            r9.<init>(r0)
            throw r9
        L_0x00cf:
            r9 = move-exception
            hgo r0 = new hgo
            r1 = 1
            r0.<init>(r1, r9)
            goto L_0x00d8
        L_0x00d7:
            throw r0
        L_0x00d8:
            goto L_0x00d7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hgp.b(android.content.Context):byte[]");
    }

    public static void a(Context context, int i) {
        yey a2 = yef.a(context);
        aucd o = nil.j.o();
        if (o.c) {
            o.c();
            o.c = false;
        }
        nil nil = (nil) o.b;
        "com.google.android.gms.chimera".getClass();
        nil.a |= 1;
        nil.b = "com.google.android.gms.chimera";
        "chimera".getClass();
        if (!nil.c.a()) {
            nil.c = aucj.a(nil.c);
        }
        nil.c.add("chimera");
        aucd o2 = haa.y.o();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        haa haa = (haa) o2.b;
        haa.b = 0;
        int i2 = haa.a | 1;
        haa.a = i2;
        haa.c = 0;
        int i3 = i2 | 2;
        haa.a = i3;
        haa.d = 0;
        int i4 = i3 | 4;
        haa.a = i4;
        haa.e = 0;
        int i5 = i4 | 8;
        haa.a = i5;
        int i6 = i5 | 32;
        haa.a = i6;
        haa.g = false;
        int i7 = i6 | 64;
        haa.a = i7;
        haa.h = false;
        int i8 = i7 | 128;
        haa.a = i8;
        haa.i = 0;
        haa.a = i8 | 1024;
        haa.l = 0;
        jiw.a(context, o2);
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ((haa) o2.b).m = aucj.s();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ((haa) o2.b).o = aucj.s();
        if (o2.c) {
            o2.c();
            o2.c = false;
        }
        ((haa) o2.b).r = aucj.s();
        aucd o3 = apgg.e.o();
        long j = (long) i;
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        apgg apgg = (apgg) o3.b;
        apgg.a |= 4;
        apgg.d = j;
        String i9 = jlo.i();
        if (o3.c) {
            o3.c();
            o3.c = false;
        }
        apgg apgg2 = (apgg) o3.b;
        i9.getClass();
        apgg2.a |= 2;
        apgg2.c = i9;
        haa haa2 = (haa) o2.i();
        haa2.getClass();
        apgg2.b = haa2;
        apgg2.a |= 1;
        auay au = ((apgg) o3.i()).au();
        if (o.c) {
            o.c();
            o.c = false;
        }
        nil nil2 = (nil) o.b;
        au.getClass();
        nil2.a |= 2;
        nil2.e = au;
        a(context, a2, (nil) o.i(), 0);
        try {
            acws.a(a2.a("com.google.android.gms.chimera", ""), axcu.a.a().c(), TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException e) {
            throw new hgo(4, e);
        } catch (TimeoutException e2) {
            throw new hgo(5, e2);
        }
    }

    private static void a(Context context, yey yey, nil nil, int i) {
        try {
            aucd o = nim.b.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            nim nim = (nim) o.b;
            nil.getClass();
            if (!nim.a.a()) {
                nim.a = aucj.a(nim.a);
            }
            nim.a.add(nil);
            List a2 = ilc.a(context, (nim) o.i(), i);
            if (a2.size() == 1) {
                RegistrationInfo registrationInfo = (RegistrationInfo) a2.get(0);
                try {
                    acws.a(yey.a(registrationInfo.a, registrationInfo.b, registrationInfo.c, registrationInfo.d, ""), awxo.a.a().K(), TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException e) {
                    throw new hgo(2, e);
                } catch (TimeoutException e2) {
                    throw new hgo(3, e2);
                }
            } else {
                int size = a2.size();
                StringBuilder sb = new StringBuilder(43);
                sb.append("Wrong number of registrations (");
                sb.append(size);
                sb.append(")");
                throw new hgo(sb.toString());
            }
        } catch (InvalidConfigException e3) {
            String valueOf = String.valueOf(e3);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 38);
            sb2.append("Failed to process registration proto: ");
            sb2.append(valueOf);
            throw new hgo(sb2.toString());
        }
    }
}
