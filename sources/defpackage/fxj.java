package defpackage;

import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.HashSet;
import java.util.Set;

/* renamed from: fxj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class fxj {
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.anon a(java.lang.String r11, int r12, java.lang.Integer r13, com.google.android.gms.auth.api.signin.GoogleSignInOptions r14) {
        /*
            anph r0 = defpackage.anph.g
            aucd r0 = r0.o()
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x000f
            goto L_0x0027
        L_0x000f:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x0014
            goto L_0x0019
        L_0x0014:
            r0.c()
            r0.c = r3
        L_0x0019:
            aucj r1 = r0.b
            anph r1 = (defpackage.anph) r1
            r11.getClass()
            int r4 = r1.a
            r4 = r4 | r2
            r1.a = r4
            r1.b = r11
        L_0x0027:
            boolean r11 = r0.c
            if (r11 != 0) goto L_0x002c
            goto L_0x0031
        L_0x002c:
            r0.c()
            r0.c = r3
        L_0x0031:
            aucj r11 = r0.b
            anph r11 = (defpackage.anph) r11
            r1 = -1
            int r12 = r12 + r1
            r11.c = r12
            int r12 = r11.a
            r4 = 2
            r12 = r12 | r4
            r11.a = r12
            int r11 = r13.intValue()
            boolean r12 = r0.c
            if (r12 != 0) goto L_0x0048
            goto L_0x004d
        L_0x0048:
            r0.c()
            r0.c = r3
        L_0x004d:
            aucj r12 = r0.b
            anph r12 = (defpackage.anph) r12
            int r13 = r12.a
            r13 = r13 | 4
            r12.a = r13
            r12.d = r11
            r11 = 16
            if (r14 == 0) goto L_0x019d
            anpi r12 = defpackage.anpi.j
            aucd r12 = r12.o()
            boolean r13 = r12.c
            if (r13 != 0) goto L_0x0068
            goto L_0x006d
        L_0x0068:
            r12.c()
            r12.c = r3
        L_0x006d:
            aucj r13 = r12.b
            anpi r13 = (defpackage.anpi) r13
            int r5 = r13.a
            r5 = r5 | r4
            r13.a = r5
            r13.c = r3
            r5 = r5 | 4
            r13.a = r5
            r13.d = r3
            r5 = r5 | r2
            r13.a = r5
            r13.b = r3
            java.util.ArrayList r13 = r14.a()
            int r5 = r13.size()
            r6 = 0
            r7 = 0
        L_0x008d:
            if (r6 >= r5) goto L_0x0119
            java.lang.Object r8 = r13.get(r6)
            com.google.android.gms.common.api.Scope r8 = (com.google.android.gms.common.api.Scope) r8
            java.lang.String r8 = r8.b
            int r9 = r8.hashCode()
            r10 = -1010579227(0xffffffffc3c3c8e5, float:-391.5695)
            if (r9 == r10) goto L_0x00bf
            r10 = -309425751(0xffffffffed8e89a9, float:-5.5141615E27)
            if (r9 == r10) goto L_0x00b5
            r10 = 96619420(0x5c24b9c, float:1.8271447E-35)
            if (r9 == r10) goto L_0x00ab
            goto L_0x00c9
        L_0x00ab:
            java.lang.String r9 = "email"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x00c9
            r8 = 0
            goto L_0x00ca
        L_0x00b5:
            java.lang.String r9 = "profile"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x00c9
            r8 = 1
            goto L_0x00ca
        L_0x00bf:
            java.lang.String r9 = "openid"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x00c9
            r8 = 2
            goto L_0x00ca
        L_0x00c9:
            r8 = -1
        L_0x00ca:
            if (r8 == 0) goto L_0x0100
            if (r8 == r2) goto L_0x00e9
            if (r8 == r4) goto L_0x00d3
            int r7 = r7 + 1
            goto L_0x0115
        L_0x00d3:
            boolean r8 = r12.c
            if (r8 != 0) goto L_0x00d8
            goto L_0x00dd
        L_0x00d8:
            r12.c()
            r12.c = r3
        L_0x00dd:
            aucj r8 = r12.b
            anpi r8 = (defpackage.anpi) r8
            int r9 = r8.a
            r9 = r9 | r2
            r8.a = r9
            r8.b = r2
            goto L_0x0115
        L_0x00e9:
            boolean r8 = r12.c
            if (r8 != 0) goto L_0x00ee
            goto L_0x00f3
        L_0x00ee:
            r12.c()
            r12.c = r3
        L_0x00f3:
            aucj r8 = r12.b
            anpi r8 = (defpackage.anpi) r8
            int r9 = r8.a
            r9 = r9 | 4
            r8.a = r9
            r8.d = r2
            goto L_0x0115
        L_0x0100:
            boolean r8 = r12.c
            if (r8 != 0) goto L_0x0105
            goto L_0x010a
        L_0x0105:
            r12.c()
            r12.c = r3
        L_0x010a:
            aucj r8 = r12.b
            anpi r8 = (defpackage.anpi) r8
            int r9 = r8.a
            r9 = r9 | r4
            r8.a = r9
            r8.c = r2
        L_0x0115:
            int r6 = r6 + 1
            goto L_0x008d
        L_0x0119:
            boolean r13 = r12.c
            if (r13 != 0) goto L_0x011e
            goto L_0x0123
        L_0x011e:
            r12.c()
            r12.c = r3
        L_0x0123:
            aucj r13 = r12.b
            anpi r13 = (defpackage.anpi) r13
            int r1 = r13.a
            r1 = r1 | 8
            r13.a = r1
            r13.e = r7
            boolean r4 = r14.j
            r1 = r1 | r11
            r13.a = r1
            r13.f = r4
            boolean r4 = r14.k
            r1 = r1 | 32
            r13.a = r1
            r13.g = r4
            boolean r4 = r14.l
            r1 = r1 | 64
            r13.a = r1
            r13.h = r4
            java.util.ArrayList r13 = r14.o
            int r14 = r13.size()
            r1 = 0
        L_0x014d:
            if (r1 >= r14) goto L_0x017e
            java.lang.Object r4 = r13.get(r1)
            com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable r4 = (com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable) r4
            int r4 = r4.b
            boolean r5 = r12.c
            if (r5 != 0) goto L_0x015c
            goto L_0x0161
        L_0x015c:
            r12.c()
            r12.c = r3
        L_0x0161:
            aucj r5 = r12.b
            anpi r5 = (defpackage.anpi) r5
            aucs r6 = r5.i
            boolean r6 = r6.a()
            if (r6 == 0) goto L_0x016e
            goto L_0x0176
        L_0x016e:
            aucs r6 = r5.i
            aucs r6 = defpackage.aucj.a((defpackage.aucs) r6)
            r5.i = r6
        L_0x0176:
            aucs r5 = r5.i
            r5.d(r4)
            int r1 = r1 + 1
            goto L_0x014d
        L_0x017e:
            aucj r12 = r12.i()
            anpi r12 = (defpackage.anpi) r12
            boolean r13 = r0.c
            if (r13 != 0) goto L_0x0189
            goto L_0x018e
        L_0x0189:
            r0.c()
            r0.c = r3
        L_0x018e:
            aucj r13 = r0.b
            anph r13 = (defpackage.anph) r13
            r12.getClass()
            r13.e = r12
            int r12 = r13.a
            r12 = r12 | 8
            r13.a = r12
        L_0x019d:
            aucj r12 = r0.b
            anph r12 = (defpackage.anph) r12
            int r13 = r12.a
            r13 = r13 | r11
            r12.a = r13
            r12.f = r3
            anon r12 = defpackage.anon.v
            aucd r12 = r12.o()
            boolean r13 = r12.c
            if (r13 != 0) goto L_0x01b3
            goto L_0x01b8
        L_0x01b3:
            r12.c()
            r12.c = r3
        L_0x01b8:
            aucj r13 = r12.b
            anon r13 = (defpackage.anon) r13
            r13.c = r11
            int r11 = r13.a
            r11 = r11 | r2
            r13.a = r11
            aucj r11 = r0.i()
            anph r11 = (defpackage.anph) r11
            r11.getClass()
            r13.n = r11
            int r11 = r13.a
            r14 = 262144(0x40000, float:3.67342E-40)
            r11 = r11 | r14
            r13.a = r11
            aucj r11 = r12.i()
            anon r11 = (defpackage.anon) r11
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxj.a(java.lang.String, int, java.lang.Integer, com.google.android.gms.auth.api.signin.GoogleSignInOptions):anon");
    }

    public static Set a(Set set) {
        HashSet hashSet = new HashSet(set);
        if (hashSet.remove(nlj.a)) {
            hashSet.add(nlj.b);
        }
        return hashSet;
    }

    public static boolean a(GoogleSignInOptions googleSignInOptions) {
        if (!((Boolean) fvx.e.c()).booleanValue() || jhx.a((Object[]) googleSignInOptions.b(), (Object) new Scope("https://www.googleapis.com/auth/plus.login"))) {
            return false;
        }
        return true;
    }
}
