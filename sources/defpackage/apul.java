package defpackage;

import com.google.firebase.auth.ActionCodeSettings;

/* renamed from: apul  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apul implements aptv {
    public String a;
    public String b;
    public ActionCodeSettings c;
    public String d;
    private final String e;
    private String f;

    public apul(aqkx aqkx) {
        this.e = a(aqkx);
    }

    private static final String a(aqkx aqkx) {
        aqkx aqkx2 = aqkx.OOB_REQ_TYPE_UNSPECIFIED;
        int ordinal = aqkx.ordinal();
        if (ordinal == 1) {
            return "PASSWORD_RESET";
        }
        if (ordinal == 4) {
            return "VERIFY_EMAIL";
        }
        if (ordinal != 6) {
            return ordinal != 7 ? "REQUEST_TYPE_UNSET_ENUM_VALUE" : "VERIFY_BEFORE_UPDATE_EMAIL";
        }
        return "EMAIL_SIGNIN";
    }

    public apul(aqkx aqkx, ActionCodeSettings actionCodeSettings, String str, String str2) {
        iva.a((Object) aqkx);
        this.e = a(aqkx);
        iva.a((Object) actionCodeSettings);
        this.c = actionCodeSettings;
        this.a = null;
        this.f = str;
        this.b = str2;
        this.d = null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ defpackage.audx a() {
        /*
            r7 = this;
            almh r0 = defpackage.almh.o
            aucd r0 = r0.o()
            java.lang.String r1 = r7.e
            int r2 = r1.hashCode()
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r2) {
                case -1452371317: goto L_0x0032;
                case -1341836234: goto L_0x0028;
                case -1288726400: goto L_0x001e;
                case 870738373: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x003c
        L_0x0014:
            java.lang.String r2 = "EMAIL_SIGNIN"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003c
            r1 = 2
            goto L_0x003d
        L_0x001e:
            java.lang.String r2 = "VERIFY_BEFORE_UPDATE_EMAIL"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003c
            r1 = 3
            goto L_0x003d
        L_0x0028:
            java.lang.String r2 = "VERIFY_EMAIL"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003c
            r1 = 1
            goto L_0x003d
        L_0x0032:
            java.lang.String r2 = "PASSWORD_RESET"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x003c
            r1 = 0
            goto L_0x003d
        L_0x003c:
            r1 = -1
        L_0x003d:
            if (r1 == 0) goto L_0x0051
            if (r1 == r6) goto L_0x004e
            if (r1 == r5) goto L_0x004b
            if (r1 == r4) goto L_0x0048
            aqkx r1 = defpackage.aqkx.OOB_REQ_TYPE_UNSPECIFIED
            goto L_0x0053
        L_0x0048:
            aqkx r1 = defpackage.aqkx.VERIFY_AND_CHANGE_EMAIL
            goto L_0x0053
        L_0x004b:
            aqkx r1 = defpackage.aqkx.EMAIL_SIGNIN
            goto L_0x0053
        L_0x004e:
            aqkx r1 = defpackage.aqkx.VERIFY_EMAIL
            goto L_0x0053
        L_0x0051:
            aqkx r1 = defpackage.aqkx.PASSWORD_RESET
        L_0x0053:
            boolean r2 = r0.c
            if (r2 != 0) goto L_0x0058
            goto L_0x005d
        L_0x0058:
            r0.c()
            r0.c = r3
        L_0x005d:
            aucj r2 = r0.b
            almh r2 = (defpackage.almh) r2
            int r1 = r1.j
            r2.b = r1
            int r1 = r2.a
            r1 = r1 | r6
            r2.a = r1
            java.lang.String r3 = r7.a
            if (r3 == 0) goto L_0x0077
            r3.getClass()
            r1 = r1 | 2
            r2.a = r1
            r2.c = r3
        L_0x0077:
            java.lang.String r3 = r7.f
            if (r3 == 0) goto L_0x0084
            r3.getClass()
            r1 = r1 | 32
            r2.a = r1
            r2.d = r3
        L_0x0084:
            java.lang.String r3 = r7.b
            if (r3 == 0) goto L_0x0091
            r3.getClass()
            r1 = r1 | 64
            r2.a = r1
            r2.e = r3
        L_0x0091:
            com.google.firebase.auth.ActionCodeSettings r3 = r7.c
            if (r3 == 0) goto L_0x00f5
            boolean r4 = r3.e
            r1 = r1 | 2048(0x800, float:2.87E-42)
            r2.a = r1
            r2.j = r4
            boolean r4 = r3.g
            r1 = r1 | 8192(0x2000, float:1.14794E-41)
            r2.a = r1
            r2.l = r4
            java.lang.String r4 = r3.a
            if (r4 == 0) goto L_0x00b2
            r4.getClass()
            r1 = r1 | 128(0x80, float:1.794E-43)
            r2.a = r1
            r2.f = r4
        L_0x00b2:
            java.lang.String r4 = r3.b
            if (r4 == 0) goto L_0x00bf
            r4.getClass()
            r1 = r1 | 256(0x100, float:3.59E-43)
            r2.a = r1
            r2.g = r4
        L_0x00bf:
            java.lang.String r4 = r3.c
            if (r4 == 0) goto L_0x00cc
            r4.getClass()
            r1 = r1 | 512(0x200, float:7.175E-43)
            r2.a = r1
            r2.h = r4
        L_0x00cc:
            java.lang.String r4 = r3.d
            if (r4 == 0) goto L_0x00d9
            r4.getClass()
            r1 = r1 | 1024(0x400, float:1.435E-42)
            r2.a = r1
            r2.i = r4
        L_0x00d9:
            java.lang.String r4 = r3.f
            if (r4 == 0) goto L_0x00e6
            r4.getClass()
            r1 = r1 | 4096(0x1000, float:5.74E-42)
            r2.a = r1
            r2.k = r4
        L_0x00e6:
            java.lang.String r3 = r3.j
            if (r3 == 0) goto L_0x00f5
            r3.getClass()
            r4 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 | r4
            r2.a = r1
            r2.n = r3
        L_0x00f5:
            java.lang.String r3 = r7.d
            if (r3 == 0) goto L_0x0102
            r3.getClass()
            r1 = r1 | 16384(0x4000, float:2.2959E-41)
            r2.a = r1
            r2.m = r3
        L_0x0102:
            aucj r0 = r0.i()
            almh r0 = (defpackage.almh) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apul.a():audx");
    }

    public final void a(ActionCodeSettings actionCodeSettings) {
        iva.a((Object) actionCodeSettings);
        this.c = actionCodeSettings;
    }
}
