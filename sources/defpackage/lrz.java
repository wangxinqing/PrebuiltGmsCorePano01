package defpackage;

import com.google.android.gms.drive.internal.model.Permission;
import java.util.Date;

/* renamed from: lrz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class lrz {
    private static final ith a = new ith("PermissionHelper", "");

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a(com.google.android.gms.drive.internal.model.Permission r7) {
        /*
            java.lang.String r0 = r7.h
            int r1 = r0.hashCode()
            r2 = -934979389(0xffffffffc84558c3, float:-202083.05)
            r3 = -1
            r4 = 0
            r5 = 2
            r6 = 1
            if (r1 == r2) goto L_0x002e
            r2 = -779574157(0xffffffffd188a473, float:-7.3359319E10)
            if (r1 == r2) goto L_0x0024
            r2 = 106164915(0x653f2b3, float:3.9862997E-35)
            if (r1 == r2) goto L_0x001a
            goto L_0x0038
        L_0x001a:
            java.lang.String r1 = "owner"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            r0 = 0
            goto L_0x0039
        L_0x0024:
            java.lang.String r1 = "writer"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            r0 = 1
            goto L_0x0039
        L_0x002e:
            java.lang.String r1 = "reader"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0038
            r0 = 2
            goto L_0x0039
        L_0x0038:
            r0 = -1
        L_0x0039:
            if (r0 == 0) goto L_0x005c
            if (r0 == r6) goto L_0x005b
            if (r0 == r5) goto L_0x004d
            ith r0 = a
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r7 = r7.h
            r1[r4] = r7
            java.lang.String r7 = "Unknown permission role received: %s"
            r0.b((java.lang.String) r7, (java.lang.Object[]) r1)
            return r3
        L_0x004d:
            java.util.List r7 = r7.b
            if (r7 == 0) goto L_0x005a
            java.lang.String r0 = "commenter"
            boolean r7 = r7.contains(r0)
            if (r7 == 0) goto L_0x005a
            return r6
        L_0x005a:
            return r4
        L_0x005b:
            return r5
        L_0x005c:
            r7 = 3
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lrz.a(com.google.android.gms.drive.internal.model.Permission):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(com.google.android.gms.drive.internal.model.Permission r7) {
        /*
            java.lang.String r0 = r7.i
            int r1 = r0.hashCode()
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = -1
            r6 = 1
            switch(r1) {
                case -1412637446: goto L_0x002d;
                case -1326197564: goto L_0x0023;
                case 3599307: goto L_0x0019;
                case 98629247: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0037
        L_0x000f:
            java.lang.String r1 = "group"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0037
            r0 = 1
            goto L_0x0038
        L_0x0019:
            java.lang.String r1 = "user"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0037
            r0 = 0
            goto L_0x0038
        L_0x0023:
            java.lang.String r1 = "domain"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0037
            r0 = 2
            goto L_0x0038
        L_0x002d:
            java.lang.String r1 = "anyone"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0037
            r0 = 3
            goto L_0x0038
        L_0x0037:
            r0 = -1
        L_0x0038:
            if (r0 == 0) goto L_0x0054
            if (r0 == r6) goto L_0x0054
            if (r0 == r4) goto L_0x0051
            if (r0 == r3) goto L_0x004e
            ith r0 = a
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r7 = r7.i
            r1[r2] = r7
            java.lang.String r7 = "Unknown permission type received: %s"
            r0.b((java.lang.String) r7, (java.lang.Object[]) r1)
            return r5
        L_0x004e:
            r7 = 258(0x102, float:3.62E-43)
            return r7
        L_0x0051:
            r7 = 257(0x101, float:3.6E-43)
            return r7
        L_0x0054:
            r7 = 256(0x100, float:3.59E-43)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lrz.b(com.google.android.gms.drive.internal.model.Permission):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c(com.google.android.gms.drive.internal.model.Permission r6) {
        /*
            java.lang.String r0 = r6.i
            int r1 = r0.hashCode()
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case -1412637446: goto L_0x002c;
                case -1326197564: goto L_0x0022;
                case 3599307: goto L_0x0018;
                case 98629247: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0036
        L_0x000e:
            java.lang.String r1 = "group"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 1
            goto L_0x0037
        L_0x0018:
            java.lang.String r1 = "user"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 0
            goto L_0x0037
        L_0x0022:
            java.lang.String r1 = "domain"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 2
            goto L_0x0037
        L_0x002c:
            java.lang.String r1 = "anyone"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0036
            r0 = 3
            goto L_0x0037
        L_0x0036:
            r0 = -1
        L_0x0037:
            if (r0 == 0) goto L_0x0051
            if (r0 == r5) goto L_0x0051
            if (r0 == r4) goto L_0x004e
            r1 = 0
            if (r0 == r3) goto L_0x004d
            ith r0 = a
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.String r6 = r6.i
            r3[r2] = r6
            java.lang.String r6 = "Unknown permission type received: %s"
            r0.b((java.lang.String) r6, (java.lang.Object[]) r3)
        L_0x004d:
            return r1
        L_0x004e:
            java.lang.String r6 = r6.c
            return r6
        L_0x0051:
            java.lang.String r6 = r6.d
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lrz.c(com.google.android.gms.drive.internal.model.Permission):java.lang.String");
    }

    public static void a(kkz kkz, kmp kmp, String str, int i, int i2, int i3) {
        if (kmp.ai()) {
            throw new nja(10, "Cannot modify permissions of App Folder or files inside App Folder.");
        } else if (kmp.j() && kkz.a.equals(str)) {
            throw new nja(10, "Owner cannot modify their own permission.");
        } else if (kmp.k() && !kmp.Y()) {
            throw new nja(1509, "User is not authorized to modify permissions to the Drive resource.");
        } else if (!"reader".equals(kmp.a.Q)) {
            if (i == 3) {
                if (i3 != 256) {
                    throw new nja(10, "Only an account of type user can be set as an owner of Drive resource.");
                } else if (!kmp.j()) {
                    throw new nja(1509, "User is not authorized to set owner of the Drive resource.");
                }
            }
            if (i2 == 3) {
                throw new nja(10, "Permission of the owner cannot be modified.");
            }
        } else {
            throw new nja(1509, "User is not authorized to modify permissions to the Drive resource.");
        }
    }

    public static void a(kmp kmp, knl knl, long j) {
        kns e = knl.e();
        if (e.a()) {
            e.a(j);
        } else {
            e.a((Object) kmp.Z(), j);
        }
        kmp.j("reader");
        lrt.a(kmp, knl, false, j);
    }

    public static void a(kmp kmp, knl knl, long j, String str) {
        kns e = knl.e();
        if (e.a()) {
            e.a(j);
        } else {
            e.a((Object) kmp.Z(), j);
        }
        kmp.j("writer");
        kns kns = knl.d;
        if (kns.a()) {
            kns.a(j);
        } else {
            kns.a((Object) kmp.V(), j);
        }
        kmp.c(0);
        kns m = knl.m();
        if (m.a()) {
            m.a(j);
        } else {
            m.a((Object) kmp.F(), j);
        }
        kmp.d(new Date());
        kns kns2 = knl.e;
        if (kns2.a()) {
            kns2.a(j);
        } else {
            kns2.a((Object) kmp.S(), j);
        }
        kmp.a(amzy.a((Object) str));
    }

    public static void a(lsm lsm, kkz kkz, knc knc, long j, String str, Permission permission) {
        kkf kkf = lsm.d;
        iva.a(!kkf.b());
        kkf.d();
        try {
            kmp a2 = kkf.a(khq.a(kkz), knc);
            kmu a3 = kkf.a(a2, str);
            if (a3 == null) {
                a.b("PermissionHelper", "Permission removed before actionId: %d was completed.", Long.valueOf(j));
            } else {
                if (permission == null) {
                    a3.a((kke) kkf);
                    if (kkz.a.equals(str)) {
                        a2.L();
                    }
                } else {
                    a3.a((kke) kkf, permission);
                }
                kkf.f();
            }
        } catch (kcs e) {
        } catch (Throwable th) {
            kkf.e();
            throw th;
        }
        kkf.e();
        lrt.a(kkf, kkz, j, false);
    }
}
