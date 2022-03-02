package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import java.util.Random;

/* renamed from: eqw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class eqw extends nis {
    private final epe a;
    private final fze b;
    private final Account c;
    private final String d;
    private final int e;
    private final boolean f;
    private final fyi g;
    private final jnh h;
    private final iwd i = ehv.a("RemoveAccountOperation");
    private final ekq j;
    private Bundle k;
    private String l;

    public eqw(epe epe, fze fze, Account account, String str, Bundle bundle, fyi fyi, jnh jnh, ekq ekq, int i2, boolean z) {
        super(224, "GetTokenWithDetails");
        this.a = epe;
        this.b = fze;
        this.c = account;
        this.d = str;
        this.k = bundle;
        this.g = fyi;
        this.h = jnh;
        this.j = ekq;
        this.e = i2;
        this.f = z;
    }

    private static Bundle a(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("Error", str);
        return bundle;
    }

    private static void a(anpd anpd, Context context) {
        Random random = new Random();
        long a2 = jhg.a(context);
        if (a2 != 0) {
            random.setSeed(a2);
        }
        if (random.nextDouble() < awkm.a.a().a() || awlv.b()) {
            aucd o = anon.v.o();
            if (o.c) {
                o.c();
                o.c = false;
            }
            anon anon = (anon) o.b;
            anon.c = 1;
            int i2 = 1 | anon.a;
            anon.a = i2;
            anpd.getClass();
            anon.d = anpd;
            anon.a = i2 | 2;
            new goj(context).b((anon) o.i());
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x031a A[SYNTHETIC, Splitter:B:114:0x031a] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0339  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0352  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0377  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0393  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x03cb  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x024e A[Catch:{ all -> 0x0331 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r21) {
        /*
            r20 = this;
            r1 = r20
            r2 = r21
            java.lang.String r3 = "sync_extras"
            java.lang.String r4 = "callback_intent"
            java.lang.String r5 = "handle_notification"
            anpd r0 = defpackage.anpd.q
            aucd r13 = r0.o()
            android.os.Bundle r0 = r1.k
            java.lang.String r6 = "service_connection_start_time_millis"
            r7 = -1
            long r6 = r0.getLong(r6, r7)
            r14 = 0
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x003c
            long r8 = android.os.SystemClock.elapsedRealtime()
            long r8 = r8 - r6
            boolean r0 = r13.c
            if (r0 != 0) goto L_0x002b
            goto L_0x0030
        L_0x002b:
            r13.c()
            r13.c = r14
        L_0x0030:
            aucj r0 = r13.b
            anpd r0 = (defpackage.anpd) r0
            int r6 = r0.a
            r6 = r6 | 64
            r0.a = r6
            r0.h = r8
        L_0x003c:
            anpy r0 = defpackage.anpy.f
            aucd r15 = r0.o()
            fze r0 = r1.b
            java.lang.Object r0 = r0.a(r2)
            biv r0 = (defpackage.biv) r0
            fyk r11 = new fyk
            r11.<init>(r2)
            long r16 = android.os.SystemClock.elapsedRealtime()
            r12 = 1
            android.os.Bundle r6 = r1.k     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            java.lang.String r7 = defpackage.eig.b     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            java.lang.String r6 = r6.getString(r7)     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            r1.l = r6     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            android.os.Bundle r6 = r1.k     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            java.lang.String r7 = defpackage.eig.a     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            int r6 = r6.getInt(r7, r14)     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            jnh r7 = r1.h     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            int r8 = r1.e     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            java.lang.String[] r7 = r7.a((int) r8)     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            java.lang.String r8 = r1.l     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            if (r8 != 0) goto L_0x007b
            if (r7 == 0) goto L_0x007b
            int r8 = r7.length     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            if (r8 <= 0) goto L_0x007b
            r8 = r7[r14]     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            r1.l = r8     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
        L_0x007b:
            if (r6 != 0) goto L_0x0085
            java.lang.String r6 = r1.l     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            int r6 = r11.a((java.lang.String) r6)     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            r10 = r6
            goto L_0x0086
        L_0x0085:
            r10 = r6
        L_0x0086:
            int r6 = r1.e     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            if (r10 != r6) goto L_0x008b
            goto L_0x0094
        L_0x008b:
            if (r7 == 0) goto L_0x0094
            java.util.List r6 = java.util.Arrays.asList(r7)     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            r15.aj(r6)     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
        L_0x0094:
            android.os.Bundle r6 = r1.k     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            eie r6 = defpackage.eie.a(r6)     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            aqll r7 = r6.a()     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            if (r7 == 0) goto L_0x00a1
            goto L_0x00a3
        L_0x00a1:
            aqll r7 = defpackage.aqll.k     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
        L_0x00a3:
            r8 = 5
            java.lang.Object r8 = r7.c(r8)     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            aucd r8 = (defpackage.aucd) r8     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            r8.a((defpackage.aucj) r7)     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            boolean r7 = r8.c     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            if (r7 != 0) goto L_0x00b2
            goto L_0x00b7
        L_0x00b2:
            r8.c()     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            r8.c = r14     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
        L_0x00b7:
            aucj r7 = r8.b     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            aqll r7 = (defpackage.aqll) r7     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            r7.i = r12     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            int r9 = r7.a     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            r9 = r9 | 512(0x200, float:7.175E-43)
            r7.a = r9     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            aucj r7 = r8.i()     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            aqll r7 = (defpackage.aqll) r7     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            eid r8 = new eid     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            android.os.Bundle r9 = r1.k     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            r8.<init>(r9)     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            r8.a(r7)     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            eie r7 = r8.a()     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            android.os.Bundle r7 = r7.a     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            r1.k = r7     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            com.google.android.gms.auth.firstparty.shared.ApplicationInformation r6 = r6.b()     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            if (r6 != 0) goto L_0x010b
            ekq r6 = r1.j     // Catch:{ ekp -> 0x00ec }
            java.lang.String r7 = r1.l     // Catch:{ ekp -> 0x00ec }
            eko r6 = r6.a(r7)     // Catch:{ ekp -> 0x00ec }
            java.lang.String r6 = r6.b     // Catch:{ ekp -> 0x00ec }
            goto L_0x0111
        L_0x00ec:
            r0 = move-exception
            java.lang.SecurityException r6 = new java.lang.SecurityException     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            java.lang.String r7 = "Invalid consumer package - "
            java.lang.String r8 = r1.l     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            int r9 = r8.length()     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            if (r9 != 0) goto L_0x0103
            java.lang.String r8 = new java.lang.String     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            r8.<init>(r7)     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            goto L_0x0107
        L_0x0103:
            java.lang.String r8 = r7.concat(r8)     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
        L_0x0107:
            r6.<init>(r8, r0)     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            throw r6     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
        L_0x010b:
            java.lang.String r7 = r6.b     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            r1.l = r7     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            java.lang.String r6 = r6.c     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
        L_0x0111:
            if (r6 == 0) goto L_0x012d
            boolean r7 = r15.c     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            if (r7 != 0) goto L_0x0118
        L_0x0117:
            goto L_0x011e
        L_0x0118:
            r15.c()     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            r15.c = r14     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            goto L_0x0117
        L_0x011e:
            aucj r7 = r15.b     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            anpy r7 = (defpackage.anpy) r7     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            r6.getClass()     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            int r8 = r7.a     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            r8 = r8 | 4
            r7.a = r8     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            r7.d = r6     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
        L_0x012d:
            java.lang.String r6 = r1.l     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            if (r6 != 0) goto L_0x0132
            goto L_0x014a
        L_0x0132:
            boolean r7 = r15.c     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            if (r7 != 0) goto L_0x0137
            goto L_0x013c
        L_0x0137:
            r15.c()     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            r15.c = r14     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
        L_0x013c:
            aucj r7 = r15.b     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            anpy r7 = (defpackage.anpy) r7     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            r6.getClass()     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            int r8 = r7.a     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            r8 = r8 | r12
            r7.a = r8     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            r7.b = r6     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
        L_0x014a:
            fyi r6 = r1.g     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            int r7 = r11.f     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            int r8 = r1.e     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            java.lang.String r9 = r1.l     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            com.google.android.gms.auth.firstparty.shared.AppDescription r18 = r6.a(r7, r8, r9, r10, r11)     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            java.lang.String r6 = "^^_account_id_^^"
            java.lang.String r7 = r1.d     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            boolean r6 = r6.equals(r7)     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            if (r6 != 0) goto L_0x018c
            android.accounts.Account r7 = r1.c     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            java.lang.String r8 = r1.d     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            android.os.Bundle r9 = r1.k     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            boolean r11 = r1.f     // Catch:{ RuntimeException -> 0x0244, all -> 0x023f }
            r6 = r0
            r10 = r18
            r19 = 1
            r12 = r13
            com.google.android.gms.auth.firstparty.dataservice.TokenResponse r11 = r6.a((android.accounts.Account) r7, (java.lang.String) r8, (android.os.Bundle) r9, (com.google.android.gms.auth.firstparty.shared.AppDescription) r10, (boolean) r11, (defpackage.aucd) r12)     // Catch:{ RuntimeException -> 0x023d }
            if (r11 == 0) goto L_0x0183
            android.accounts.Account r7 = r1.c     // Catch:{ RuntimeException -> 0x023d }
            java.lang.String r8 = r1.d     // Catch:{ RuntimeException -> 0x023d }
            android.os.Bundle r9 = r1.k     // Catch:{ RuntimeException -> 0x023d }
            r6 = r0
            r10 = r18
            r12 = r13
            android.os.Bundle r0 = r6.a((android.accounts.Account) r7, (java.lang.String) r8, (android.os.Bundle) r9, (com.google.android.gms.auth.firstparty.shared.AppDescription) r10, (com.google.android.gms.auth.firstparty.dataservice.TokenResponse) r11, (defpackage.aucd) r12)     // Catch:{ RuntimeException -> 0x023d }
            goto L_0x019c
        L_0x0183:
            gei r0 = defpackage.gei.UNKNOWN_ERROR     // Catch:{ RuntimeException -> 0x023d }
            java.lang.String r0 = r0.ac     // Catch:{ RuntimeException -> 0x023d }
            android.os.Bundle r0 = a((java.lang.String) r0)     // Catch:{ RuntimeException -> 0x023d }
            goto L_0x019c
        L_0x018c:
            r19 = 1
            android.accounts.Account r7 = r1.c     // Catch:{ RuntimeException -> 0x023d }
            android.os.Bundle r8 = r1.k     // Catch:{ RuntimeException -> 0x023d }
            boolean r10 = r1.f     // Catch:{ RuntimeException -> 0x023d }
            r6 = r0
            r9 = r18
            r11 = r13
            android.os.Bundle r0 = r6.a(r7, r8, r9, r10, r11)     // Catch:{ RuntimeException -> 0x023d }
        L_0x019c:
            java.lang.String r6 = r1.d
            boolean r7 = r15.c
            if (r7 != 0) goto L_0x01a3
            goto L_0x01a8
        L_0x01a3:
            r15.c()
            r15.c = r14
        L_0x01a8:
            aucj r7 = r15.b
            anpy r7 = (defpackage.anpy) r7
            r6.getClass()
            int r8 = r7.a
            r8 = r8 | 2
            r7.a = r8
            r7.c = r6
            boolean r6 = r13.c
            if (r6 != 0) goto L_0x01bc
            goto L_0x01c1
        L_0x01bc:
            r13.c()
            r13.c = r14
        L_0x01c1:
            aucj r6 = r13.b
            anpd r6 = (defpackage.anpd) r6
            aucj r7 = r15.i()
            anpy r7 = (defpackage.anpy) r7
            r7.getClass()
            r6.g = r7
            int r7 = r6.a
            r7 = r7 | 32
            r6.a = r7
            android.os.Bundle r6 = r1.k
            boolean r5 = r6.getBoolean(r5)
            boolean r6 = r13.c
            if (r6 != 0) goto L_0x01e1
            goto L_0x01e6
        L_0x01e1:
            r13.c()
            r13.c = r14
        L_0x01e6:
            aucj r6 = r13.b
            anpd r6 = (defpackage.anpd) r6
            int r7 = r6.a
            r7 = r7 | 2
            r6.a = r7
            r6.c = r5
            android.os.Bundle r5 = r1.k
            boolean r4 = r5.containsKey(r4)
            boolean r5 = r13.c
            if (r5 != 0) goto L_0x01fd
            goto L_0x0202
        L_0x01fd:
            r13.c()
            r13.c = r14
        L_0x0202:
            aucj r5 = r13.b
            anpd r5 = (defpackage.anpd) r5
            int r6 = r5.a
            r6 = r6 | 4
            r5.a = r6
            r5.d = r4
            android.os.Bundle r4 = r1.k
            boolean r3 = r4.containsKey(r3)
            boolean r4 = r13.c
            if (r4 != 0) goto L_0x0219
            goto L_0x021e
        L_0x0219:
            r13.c()
            r13.c = r14
        L_0x021e:
            aucj r4 = r13.b
            anpd r4 = (defpackage.anpd) r4
            int r5 = r4.a
            r5 = r5 | 8
            r4.a = r5
            r4.e = r3
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r16
            boolean r5 = r13.c
            if (r5 != 0) goto L_0x0236
            goto L_0x02f7
        L_0x0236:
            r13.c()
            r13.c = r14
            goto L_0x02fd
        L_0x023d:
            r0 = move-exception
            goto L_0x0247
        L_0x023f:
            r0 = move-exception
            r19 = 1
            goto L_0x0332
        L_0x0244:
            r0 = move-exception
            r19 = 1
        L_0x0247:
            defpackage.biv.a((java.lang.RuntimeException) r0, (defpackage.aucd) r13)     // Catch:{ all -> 0x0331 }
            boolean r6 = r0 instanceof java.lang.SecurityException     // Catch:{ all -> 0x0331 }
            if (r6 != 0) goto L_0x031a
            iwd r6 = r1.i     // Catch:{ all -> 0x0331 }
            java.lang.String r7 = "Exception while trying to get token."
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ all -> 0x0331 }
            r6.d(r7, r0, r8)     // Catch:{ all -> 0x0331 }
            gei r0 = defpackage.gei.INTNERNAL_ERROR     // Catch:{ all -> 0x0331 }
            java.lang.String r0 = r0.ac     // Catch:{ all -> 0x0331 }
            android.os.Bundle r0 = a((java.lang.String) r0)     // Catch:{ all -> 0x0331 }
            java.lang.String r6 = r1.d
            boolean r7 = r15.c
            if (r7 != 0) goto L_0x0266
            goto L_0x026b
        L_0x0266:
            r15.c()
            r15.c = r14
        L_0x026b:
            aucj r7 = r15.b
            anpy r7 = (defpackage.anpy) r7
            r6.getClass()
            int r8 = r7.a
            r8 = r8 | 2
            r7.a = r8
            r7.c = r6
            boolean r6 = r13.c
            if (r6 != 0) goto L_0x027f
            goto L_0x0284
        L_0x027f:
            r13.c()
            r13.c = r14
        L_0x0284:
            aucj r6 = r13.b
            anpd r6 = (defpackage.anpd) r6
            aucj r7 = r15.i()
            anpy r7 = (defpackage.anpy) r7
            r7.getClass()
            r6.g = r7
            int r7 = r6.a
            r7 = r7 | 32
            r6.a = r7
            android.os.Bundle r6 = r1.k
            boolean r5 = r6.getBoolean(r5)
            boolean r6 = r13.c
            if (r6 != 0) goto L_0x02a4
            goto L_0x02a9
        L_0x02a4:
            r13.c()
            r13.c = r14
        L_0x02a9:
            aucj r6 = r13.b
            anpd r6 = (defpackage.anpd) r6
            int r7 = r6.a
            r7 = r7 | 2
            r6.a = r7
            r6.c = r5
            android.os.Bundle r5 = r1.k
            boolean r4 = r5.containsKey(r4)
            boolean r5 = r13.c
            if (r5 != 0) goto L_0x02c0
            goto L_0x02c5
        L_0x02c0:
            r13.c()
            r13.c = r14
        L_0x02c5:
            aucj r5 = r13.b
            anpd r5 = (defpackage.anpd) r5
            int r6 = r5.a
            r6 = r6 | 4
            r5.a = r6
            r5.d = r4
            android.os.Bundle r4 = r1.k
            boolean r3 = r4.containsKey(r3)
            boolean r4 = r13.c
            if (r4 != 0) goto L_0x02dc
            goto L_0x02e1
        L_0x02dc:
            r13.c()
            r13.c = r14
        L_0x02e1:
            aucj r4 = r13.b
            anpd r4 = (defpackage.anpd) r4
            int r5 = r4.a
            r5 = r5 | 8
            r4.a = r5
            r4.e = r3
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r16
            boolean r5 = r13.c
            if (r5 != 0) goto L_0x02f8
        L_0x02f7:
            goto L_0x02fd
        L_0x02f8:
            r13.c()
            r13.c = r14
        L_0x02fd:
            aucj r5 = r13.b
            anpd r5 = (defpackage.anpd) r5
            int r6 = r5.a
            r6 = r6 | 1
            r5.a = r6
            r5.b = r3
            aucj r3 = r13.i()
            anpd r3 = (defpackage.anpd) r3
            a(r3, r2)
            epe r2 = r1.a
            com.google.android.gms.common.api.Status r3 = com.google.android.gms.common.api.Status.a
            r2.a(r3, r0)
            return
        L_0x031a:
            iwd r6 = r1.i     // Catch:{ all -> 0x0331 }
            java.lang.String r7 = "Exception while trying to get token for security reasons."
            java.lang.Object[] r8 = new java.lang.Object[r14]     // Catch:{ all -> 0x0331 }
            r6.d(r7, r0, r8)     // Catch:{ all -> 0x0331 }
            eqj r6 = new eqj     // Catch:{ all -> 0x0331 }
            r7 = 10
            r6.<init>(r7)     // Catch:{ all -> 0x0331 }
            r6.a = r0     // Catch:{ all -> 0x0331 }
            nja r0 = r6.a()     // Catch:{ all -> 0x0331 }
            throw r0     // Catch:{ all -> 0x0331 }
        L_0x0331:
            r0 = move-exception
        L_0x0332:
            java.lang.String r6 = r1.d
            boolean r7 = r15.c
            if (r7 != 0) goto L_0x0339
            goto L_0x033e
        L_0x0339:
            r15.c()
            r15.c = r14
        L_0x033e:
            aucj r7 = r15.b
            anpy r7 = (defpackage.anpy) r7
            r6.getClass()
            int r8 = r7.a
            r8 = r8 | 2
            r7.a = r8
            r7.c = r6
            boolean r6 = r13.c
            if (r6 != 0) goto L_0x0352
            goto L_0x0357
        L_0x0352:
            r13.c()
            r13.c = r14
        L_0x0357:
            aucj r6 = r13.b
            anpd r6 = (defpackage.anpd) r6
            aucj r7 = r15.i()
            anpy r7 = (defpackage.anpy) r7
            r7.getClass()
            r6.g = r7
            int r7 = r6.a
            r7 = r7 | 32
            r6.a = r7
            android.os.Bundle r6 = r1.k
            boolean r5 = r6.getBoolean(r5)
            boolean r6 = r13.c
            if (r6 != 0) goto L_0x0377
            goto L_0x037c
        L_0x0377:
            r13.c()
            r13.c = r14
        L_0x037c:
            aucj r6 = r13.b
            anpd r6 = (defpackage.anpd) r6
            int r7 = r6.a
            r7 = r7 | 2
            r6.a = r7
            r6.c = r5
            android.os.Bundle r5 = r1.k
            boolean r4 = r5.containsKey(r4)
            boolean r5 = r13.c
            if (r5 != 0) goto L_0x0393
            goto L_0x0398
        L_0x0393:
            r13.c()
            r13.c = r14
        L_0x0398:
            aucj r5 = r13.b
            anpd r5 = (defpackage.anpd) r5
            int r6 = r5.a
            r6 = r6 | 4
            r5.a = r6
            r5.d = r4
            android.os.Bundle r4 = r1.k
            boolean r3 = r4.containsKey(r3)
            boolean r4 = r13.c
            if (r4 != 0) goto L_0x03af
            goto L_0x03b4
        L_0x03af:
            r13.c()
            r13.c = r14
        L_0x03b4:
            aucj r4 = r13.b
            anpd r4 = (defpackage.anpd) r4
            int r5 = r4.a
            r5 = r5 | 8
            r4.a = r5
            r4.e = r3
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r16
            boolean r5 = r13.c
            if (r5 != 0) goto L_0x03cb
            goto L_0x03d0
        L_0x03cb:
            r13.c()
            r13.c = r14
        L_0x03d0:
            aucj r5 = r13.b
            anpd r5 = (defpackage.anpd) r5
            int r6 = r5.a
            r6 = r6 | 1
            r5.a = r6
            r5.b = r3
            aucj r3 = r13.i()
            anpd r3 = (defpackage.anpd) r3
            a(r3, r2)
            goto L_0x03e7
        L_0x03e6:
            throw r0
        L_0x03e7:
            goto L_0x03e6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqw.a(android.content.Context):void");
    }

    public final void a(Status status) {
        this.a.a(status, (Bundle) null);
    }
}
