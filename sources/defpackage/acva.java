package defpackage;

import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import com.google.android.chimera.Service;
import com.google.android.gms.auth.UserRecoverableAuthException;
import java.io.IOException;
import org.chromium.net.UrlRequest;

/* renamed from: acva  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class acva {
    static int a(Exception exc) {
        if (exc instanceof ein) {
            switch (((ein) exc).a) {
                case 0:
                    return 1;
                case 1:
                    return 208;
                case 2:
                    return 56;
                case 5:
                    return 26;
                case 6:
                    return 71;
                case 7:
                    return 11;
                case 8:
                case 10:
                    return 255;
                case UrlRequest.Status.WAITING_FOR_RESPONSE /*13*/:
                case UrlRequest.Status.READING_RESPONSE /*14*/:
                case Service.START_CONTINUATION_MASK:
                    return 121;
                case 16:
                    return 200;
                default:
                    return 32;
            }
        } else if (exc instanceof UserRecoverableAuthException) {
            return a(exc.getMessage(), true);
        } else {
            if (exc instanceof IOException) {
                String message = exc.getMessage();
                if (message != null && !message.isEmpty()) {
                    if (message.contains("Could not bind to service")) {
                        return 211;
                    }
                    int a = a(exc.getMessage(), false);
                    if (a != 255) {
                        return a;
                    }
                }
                return 11;
            } else if (exc instanceof eif) {
                String message2 = exc.getMessage();
                if (message2 == null || message2.isEmpty()) {
                    return 199;
                }
                return a(exc.getMessage(), false);
            } else if ((exc instanceof AuthenticatorException) || (exc instanceof SecurityException)) {
                return 211;
            } else {
                if (exc instanceof OperationCanceledException) {
                    return 121;
                }
                if (exc instanceof IllegalStateException) {
                    return 206;
                }
                return 255;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int a(java.lang.String r1, boolean r2) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1185112507: goto L_0x0059;
                case -605507559: goto L_0x004f;
                case -279783902: goto L_0x0045;
                case -262979598: goto L_0x003a;
                case 120785050: goto L_0x0030;
                case 314864744: goto L_0x0026;
                case 350741825: goto L_0x001c;
                case 1001684413: goto L_0x0012;
                case 1973990181: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0063
        L_0x0008:
            java.lang.String r0 = "NeedPermission"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0063
            r1 = 7
            goto L_0x0064
        L_0x0012:
            java.lang.String r0 = "BadAuthentication"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0063
            r1 = 3
            goto L_0x0064
        L_0x001c:
            java.lang.String r0 = "Timeout"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0063
            r1 = 2
            goto L_0x0064
        L_0x0026:
            java.lang.String r0 = "AppDownloadRequired"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0063
            r1 = 6
            goto L_0x0064
        L_0x0030:
            java.lang.String r0 = "NetworkError"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0063
            r1 = 4
            goto L_0x0064
        L_0x003a:
            java.lang.String r0 = "DeviceManagementRequiredOrSyncDisabled"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0063
            r1 = 8
            goto L_0x0064
        L_0x0045:
            java.lang.String r0 = "Interrupted"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0063
            r1 = 0
            goto L_0x0064
        L_0x004f:
            java.lang.String r0 = "CaptchaRequired"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0063
            r1 = 5
            goto L_0x0064
        L_0x0059:
            java.lang.String r0 = "UserCancel"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x0063
            r1 = 1
            goto L_0x0064
        L_0x0063:
            r1 = -1
        L_0x0064:
            r0 = 32
            switch(r1) {
                case 0: goto L_0x007e;
                case 1: goto L_0x007e;
                case 2: goto L_0x007e;
                case 3: goto L_0x007b;
                case 4: goto L_0x0078;
                case 5: goto L_0x0077;
                case 6: goto L_0x0074;
                case 7: goto L_0x0071;
                case 8: goto L_0x006e;
                default: goto L_0x0069;
            }
        L_0x0069:
            if (r2 != 0) goto L_0x0081
            r1 = 255(0xff, float:3.57E-43)
            return r1
        L_0x006e:
            r1 = 71
            return r1
        L_0x0071:
            r1 = 200(0xc8, float:2.8E-43)
            return r1
        L_0x0074:
            r1 = 208(0xd0, float:2.91E-43)
            return r1
        L_0x0077:
            return r0
        L_0x0078:
            r1 = 11
            return r1
        L_0x007b:
            r1 = 26
            return r1
        L_0x007e:
            r1 = 121(0x79, float:1.7E-43)
            return r1
        L_0x0081:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acva.a(java.lang.String, boolean):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cb A[Catch:{ Exception -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cc A[Catch:{ Exception -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e4 A[Catch:{ Exception -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0103 A[Catch:{ Exception -> 0x0123 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x017c  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01be A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r11, android.accounts.AccountManager r12, java.lang.String r13, defpackage.aucd r14) {
        /*
            android.accounts.Account[] r12 = r12.getAccountsByType(r13)
            int r13 = r12.length
            if (r13 == 0) goto L_0x01c9
            r0 = 0
            r1 = 0
        L_0x0009:
            if (r1 >= r13) goto L_0x01c9
            r2 = r12[r1]
            aoij r3 = defpackage.aoij.e
            aucd r3 = r3.o()
            aoii r4 = defpackage.aoii.d
            aucd r4 = r4.o()
            boolean r5 = r4.c
            if (r5 == 0) goto L_0x0022
            r4.c()
            r4.c = r0
        L_0x0022:
            aucj r5 = r4.b
            aoii r5 = (defpackage.aoii) r5
            r6 = 254(0xfe, float:3.56E-43)
            r5.b = r6
            int r6 = r5.a
            r7 = 1
            r6 = r6 | r7
            r5.a = r6
            java.lang.String r5 = r2.type
            int r6 = r5.hashCode()
            r8 = 816462108(0x30aa391c, float:1.2385359E-9)
            r9 = -1
            if (r6 == r8) goto L_0x004c
            r8 = 879034182(0x3464ff46, float:2.1327023E-7)
            if (r6 == r8) goto L_0x0042
            goto L_0x0056
        L_0x0042:
            java.lang.String r6 = "com.google"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0056
            r5 = 0
            goto L_0x0057
        L_0x004c:
            java.lang.String r6 = "cn.google"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0056
            r5 = 1
            goto L_0x0057
        L_0x0056:
            r5 = -1
        L_0x0057:
            r6 = 16
            r8 = 2
            if (r5 == 0) goto L_0x0063
            if (r5 == r7) goto L_0x0061
            r5 = 16
            goto L_0x0064
        L_0x0061:
            r5 = 2
            goto L_0x0064
        L_0x0063:
            r5 = 1
        L_0x0064:
            boolean r10 = r3.c
            if (r10 != 0) goto L_0x0069
            goto L_0x006e
        L_0x0069:
            r3.c()
            r3.c = r0
        L_0x006e:
            aucj r10 = r3.b
            aoij r10 = (defpackage.aoij) r10
            int r5 = r5 + r9
            r10.c = r5
            int r9 = r10.a
            r9 = r9 | 4
            r10.a = r9
            int r5 = defpackage.aoif.a(r5)
            r9 = 8
            if (r5 != 0) goto L_0x0084
            goto L_0x00a0
        L_0x0084:
            if (r5 != r6) goto L_0x00a0
            java.lang.String r5 = r2.type
            boolean r6 = r3.c
            if (r6 != 0) goto L_0x008d
            goto L_0x0092
        L_0x008d:
            r3.c()
            r3.c = r0
        L_0x0092:
            aucj r6 = r3.b
            aoij r6 = (defpackage.aoij) r6
            r5.getClass()
            int r10 = r6.a
            r10 = r10 | r9
            r6.a = r10
            r6.d = r5
        L_0x00a0:
            boolean r5 = r4.c
            if (r5 == 0) goto L_0x00a9
            r4.c()
            r4.c = r0
        L_0x00a9:
            aucj r5 = r4.b
            aoii r5 = (defpackage.aoii) r5
            r5.c = r7
            int r6 = r5.a
            r6 = r6 | r8
            r5.a = r6
            r5 = 0
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ Exception -> 0x0143 }
            r6.<init>()     // Catch:{ Exception -> 0x0143 }
            java.lang.String r10 = "UseCache"
            r6.putBoolean(r10, r7)     // Catch:{ Exception -> 0x0143 }
            java.lang.String r2 = r2.name     // Catch:{ Exception -> 0x0143 }
            java.lang.String r10 = "oauth2: email"
            java.lang.String r2 = defpackage.eig.a((android.content.Context) r11, (java.lang.String) r2, (java.lang.String) r10, (android.os.Bundle) r6)     // Catch:{ Exception -> 0x0143 }
            boolean r6 = r4.c     // Catch:{ Exception -> 0x0123 }
            if (r6 != 0) goto L_0x00cc
            goto L_0x00d1
        L_0x00cc:
            r4.c()     // Catch:{ Exception -> 0x0123 }
            r4.c = r0     // Catch:{ Exception -> 0x0123 }
        L_0x00d1:
            aucj r6 = r4.b     // Catch:{ Exception -> 0x0123 }
            aoii r6 = (defpackage.aoii) r6     // Catch:{ Exception -> 0x0123 }
            r6.c = r9     // Catch:{ Exception -> 0x0123 }
            int r9 = r6.a     // Catch:{ Exception -> 0x0123 }
            r9 = r9 | r8
            r6.a = r9     // Catch:{ Exception -> 0x0123 }
            if (r2 == 0) goto L_0x0103
            boolean r2 = r2.isEmpty()     // Catch:{ Exception -> 0x0123 }
            if (r2 != 0) goto L_0x0103
            boolean r2 = r4.c     // Catch:{ Exception -> 0x0123 }
            if (r2 != 0) goto L_0x00e9
            goto L_0x00ee
        L_0x00e9:
            r4.c()     // Catch:{ Exception -> 0x0123 }
            r4.c = r0     // Catch:{ Exception -> 0x0123 }
        L_0x00ee:
            aucj r2 = r4.b     // Catch:{ Exception -> 0x0123 }
            aoii r2 = (defpackage.aoii) r2     // Catch:{ Exception -> 0x0123 }
            r6 = 15
            r2.c = r6     // Catch:{ Exception -> 0x0123 }
            int r6 = r2.a     // Catch:{ Exception -> 0x0123 }
            r6 = r6 | r8
            r2.a = r6     // Catch:{ Exception -> 0x0123 }
            r2.b = r0     // Catch:{ Exception -> 0x0123 }
            r6 = r6 | 1
            r2.a = r6     // Catch:{ Exception -> 0x0123 }
            goto L_0x0177
        L_0x0103:
            boolean r2 = r4.c     // Catch:{ Exception -> 0x0123 }
            if (r2 != 0) goto L_0x0108
            goto L_0x010d
        L_0x0108:
            r4.c()     // Catch:{ Exception -> 0x0123 }
            r4.c = r0     // Catch:{ Exception -> 0x0123 }
        L_0x010d:
            aucj r2 = r4.b     // Catch:{ Exception -> 0x0123 }
            aoii r2 = (defpackage.aoii) r2     // Catch:{ Exception -> 0x0123 }
            r6 = 13
            r2.c = r6     // Catch:{ Exception -> 0x0123 }
            int r6 = r2.a     // Catch:{ Exception -> 0x0123 }
            r6 = r6 | r8
            r2.a = r6     // Catch:{ Exception -> 0x0123 }
            r8 = 230(0xe6, float:3.22E-43)
            r2.b = r8     // Catch:{ Exception -> 0x0123 }
            r6 = r6 | 1
            r2.a = r6     // Catch:{ Exception -> 0x0123 }
            goto L_0x0177
        L_0x0123:
            r2 = move-exception
            int r2 = a(r2)
            boolean r6 = r4.c
            if (r6 != 0) goto L_0x012d
            goto L_0x0132
        L_0x012d:
            r4.c()
            r4.c = r0
        L_0x0132:
            aucj r6 = r4.b
            aoii r6 = (defpackage.aoii) r6
            int r8 = r2 + -1
            if (r2 == 0) goto L_0x0142
            r6.b = r8
            int r2 = r6.a
            r2 = r2 | r7
            r6.a = r2
            goto L_0x0177
        L_0x0142:
            throw r5
        L_0x0143:
            r2 = move-exception
            boolean r6 = r4.c
            if (r6 != 0) goto L_0x0149
            goto L_0x014e
        L_0x0149:
            r4.c()
            r4.c = r0
        L_0x014e:
            aucj r6 = r4.b
            aoii r6 = (defpackage.aoii) r6
            r9 = 7
            r6.c = r9
            int r9 = r6.a
            r8 = r8 | r9
            r6.a = r8
            int r2 = a(r2)
            boolean r6 = r4.c
            if (r6 != 0) goto L_0x0163
            goto L_0x0168
        L_0x0163:
            r4.c()
            r4.c = r0
        L_0x0168:
            aucj r6 = r4.b
            aoii r6 = (defpackage.aoii) r6
            int r8 = r2 + -1
            if (r2 == 0) goto L_0x01c7
            r6.b = r8
            int r2 = r6.a
            r2 = r2 | r7
            r6.a = r2
        L_0x0177:
            boolean r2 = r3.c
            if (r2 != 0) goto L_0x017c
            goto L_0x0181
        L_0x017c:
            r3.c()
            r3.c = r0
        L_0x0181:
            aucj r2 = r3.b
            aoij r2 = (defpackage.aoij) r2
            aucj r4 = r4.i()
            aoii r4 = (defpackage.aoii) r4
            r4.getClass()
            r2.b = r4
            int r4 = r2.a
            r4 = r4 | r7
            r2.a = r4
            aucj r2 = r3.i()
            aoij r2 = (defpackage.aoij) r2
            boolean r3 = r14.c
            if (r3 != 0) goto L_0x01a0
            goto L_0x01a5
        L_0x01a0:
            r14.c()
            r14.c = r0
        L_0x01a5:
            aucj r3 = r14.b
            aoik r3 = (defpackage.aoik) r3
            aoik r4 = defpackage.aoik.b
            r2.getClass()
            aucx r4 = r3.a
            boolean r4 = r4.a()
            if (r4 != 0) goto L_0x01be
            aucx r4 = r3.a
            aucx r4 = defpackage.aucj.a((defpackage.aucx) r4)
            r3.a = r4
        L_0x01be:
            aucx r3 = r3.a
            r3.add(r2)
            int r1 = r1 + 1
            goto L_0x0009
        L_0x01c7:
            throw r5
        L_0x01c9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acva.a(android.content.Context, android.accounts.AccountManager, java.lang.String, aucd):void");
    }
}
