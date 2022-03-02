package defpackage;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.icing.nativeindex.NativeIndex;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: psw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class psw {
    private static agod a(Context context, Account account, int i) {
        if (!axsp.a.a().q()) {
            aoqm aoqm = aoqm.a;
            Context applicationContext = context.getApplicationContext();
            return new pbf(account, new quk(new izd(applicationContext, axsp.f(), (int) axsp.g(), applicationContext.getApplicationInfo().uid, i)), applicationContext.getApplicationInfo().uid, applicationContext.getPackageName(), aoqm);
        }
        apyb a = rbx.a(i);
        amri b = amri.b(aonv.a(axsp.f(), (int) axsp.g()));
        return new agon((atwa) ((atwa) ((atwa) baos.a(new atvz(), a.a(atxu.h))).a(apyq.a, (Object) apyq.a(account.name))).a(apyj.a, (Object) ((aonv) ((amrt) b).a).toString()));
    }

    private static Account a(Context context, String str) {
        if (!str.isEmpty()) {
            Account account = new Account(str, "com.google");
            if (jgu.a(context, account)) {
                return account;
            }
            throw new psv("Signed-in account does not exist");
        }
        throw new psv("Not signed in");
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.psr a(android.content.Context r16, defpackage.pas r17, defpackage.orf r18, com.google.android.gms.icing.nativeindex.NativeIndex r19, defpackage.ozs r20, defpackage.oyq r21, defpackage.agpk r22) {
        /*
            r0 = r16
            r1 = r22
            java.lang.String r2 = r17.a()
            android.accounts.Account r2 = a(r0, r2)
            java.io.File r3 = new java.io.File
            java.io.File r4 = defpackage.psu.a(r16)
            java.lang.String r5 = "deletions"
            r3.<init>(r4, r5)
            r4 = 12804(0x3204, float:1.7942E-41)
            agod r4 = a(r0, r2, r4)
            agpi r5 = new agpi
            r5.<init>()
            r5.a = r3
            java.lang.String r3 = "icing-user-actions"
            agny r0 = defpackage.agny.a((android.content.Context) r0, (java.lang.String) r3)
            if (r0 == 0) goto L_0x01b5
            r5.b = r0
            r5.c = r2
            r0 = 2099(0x833, float:2.941E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.d = r0
            r0 = 220671791(0xd272f2f, float:5.1517643E-31)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.e = r0
            int r0 = defpackage.ozq.a
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.f = r0
            r0 = 10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.g = r0
            r0 = 7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.h = r0
            java.io.File r0 = r5.a
            if (r0 != 0) goto L_0x005f
            java.lang.String r0 = " storageDirectory"
            goto L_0x0061
        L_0x005f:
            java.lang.String r0 = ""
        L_0x0061:
            agny r2 = r5.b
            if (r2 != 0) goto L_0x006b
            java.lang.String r2 = " applicationId"
            java.lang.String r0 = r0.concat(r2)
        L_0x006b:
            android.accounts.Account r2 = r5.c
            if (r2 != 0) goto L_0x0079
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = " account"
            java.lang.String r0 = r0.concat(r2)
        L_0x0079:
            java.lang.Integer r2 = r5.d
            if (r2 != 0) goto L_0x0087
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = " corpus"
            java.lang.String r0 = r0.concat(r2)
        L_0x0087:
            java.lang.Integer r2 = r5.e
            if (r2 != 0) goto L_0x0095
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = " datatype"
            java.lang.String r0 = r0.concat(r2)
        L_0x0095:
            java.lang.Integer r2 = r5.f
            if (r2 != 0) goto L_0x00a3
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = " deviceTtlSec"
            java.lang.String r0 = r0.concat(r2)
        L_0x00a3:
            java.lang.Integer r2 = r5.g
            if (r2 != 0) goto L_0x00b1
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = " pushPayloadMaxCount"
            java.lang.String r0 = r0.concat(r2)
        L_0x00b1:
            java.lang.Integer r2 = r5.h
            if (r2 != 0) goto L_0x00bf
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = " pushPayloadMaxAgeDays"
            java.lang.String r0 = r0.concat(r2)
        L_0x00bf:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x00e1
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Missing required properties:"
            int r3 = r0.length()
            if (r3 != 0) goto L_0x00d9
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            goto L_0x00dd
        L_0x00d9:
            java.lang.String r0 = r2.concat(r0)
        L_0x00dd:
            r1.<init>(r0)
            throw r1
        L_0x00e1:
            agou r0 = new agou
            java.io.File r6 = r5.a
            agny r7 = r5.b
            android.accounts.Account r8 = r5.c
            java.lang.Integer r2 = r5.d
            int r9 = r2.intValue()
            java.lang.Integer r2 = r5.e
            int r10 = r2.intValue()
            java.lang.Integer r2 = r5.f
            int r11 = r2.intValue()
            java.lang.Integer r2 = r5.g
            int r12 = r2.intValue()
            java.lang.Integer r2 = r5.h
            int r13 = r2.intValue()
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            java.io.File r2 = r0.a
            r3 = 0
            boolean r5 = r2.exists()     // Catch:{ Exception -> 0x01ab }
            if (r5 != 0) goto L_0x0124
            boolean r5 = r2.mkdir()     // Catch:{ Exception -> 0x01ab }
            if (r5 == 0) goto L_0x011c
            r3 = 1
            goto L_0x0125
        L_0x011c:
            agog r0 = new agog     // Catch:{ Exception -> 0x01ab }
            java.lang.String r1 = "Could not create storage directory."
            r0.<init>((java.lang.String) r1)     // Catch:{ Exception -> 0x01ab }
            throw r0     // Catch:{ Exception -> 0x01ab }
        L_0x0124:
        L_0x0125:
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x01a9 }
            java.io.File r6 = r0.a     // Catch:{ Exception -> 0x01a9 }
            java.lang.String r7 = "deletions.db"
            r5.<init>(r6, r7)     // Catch:{ Exception -> 0x01a9 }
            android.accounts.Account r6 = r0.c     // Catch:{ agsx -> 0x01a2 }
            int r7 = r0.g     // Catch:{ agsx -> 0x01a2 }
            int r8 = r0.h     // Catch:{ agsx -> 0x01a2 }
            long r8 = (long) r8     // Catch:{ agsx -> 0x01a2 }
            java.util.concurrent.TimeUnit r10 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ agsx -> 0x01a2 }
            aekn r11 = r1.b     // Catch:{ agsx -> 0x01a2 }
            agqr r12 = defpackage.agqr.a(r5, r6, r7, r8, r10)     // Catch:{ agsx -> 0x01a2 }
            agqm r15 = new agqm     // Catch:{ Exception -> 0x01a9 }
            agny r6 = r0.b     // Catch:{ Exception -> 0x01a9 }
            int r7 = r0.d     // Catch:{ Exception -> 0x01a9 }
            int r8 = r0.e     // Catch:{ Exception -> 0x01a9 }
            int r9 = r0.f     // Catch:{ Exception -> 0x01a9 }
            agpe r5 = new agpe     // Catch:{ Exception -> 0x01a9 }
            r5.<init>(r1, r2)     // Catch:{ Exception -> 0x01a9 }
            amsv r10 = defpackage.amta.a((defpackage.amsv) r5)     // Catch:{ Exception -> 0x01a9 }
            agot r11 = new agot     // Catch:{ Exception -> 0x01a9 }
            agop r5 = r1.f     // Catch:{ Exception -> 0x01a9 }
            r5.getClass()     // Catch:{ Exception -> 0x01a9 }
            agpf r13 = new agpf     // Catch:{ Exception -> 0x01a9 }
            r13.<init>(r5)     // Catch:{ Exception -> 0x01a9 }
            osj r5 = r1.e     // Catch:{ Exception -> 0x01a9 }
            r5.getClass()     // Catch:{ Exception -> 0x01a9 }
            agpg r5 = new agpg     // Catch:{ Exception -> 0x01a9 }
            r5.<init>()     // Catch:{ Exception -> 0x01a9 }
            agny r14 = r0.b     // Catch:{ Exception -> 0x01a9 }
            r11.<init>(r13, r5, r14)     // Catch:{ Exception -> 0x01a9 }
            aekn r5 = r1.b     // Catch:{ Exception -> 0x01a9 }
            java.util.concurrent.Executor r14 = r1.c     // Catch:{ Exception -> 0x01a9 }
            r5 = r15
            r13 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14)     // Catch:{ Exception -> 0x01a9 }
            long r5 = defpackage.axsp.c()     // Catch:{ Exception -> 0x01a9 }
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x0190
            agph r5 = new agph     // Catch:{ Exception -> 0x01a9 }
            r5.<init>(r1, r0)     // Catch:{ Exception -> 0x01a9 }
            amsv r0 = defpackage.amta.a((defpackage.amsv) r5)     // Catch:{ Exception -> 0x01a9 }
            agow r5 = new agow     // Catch:{ Exception -> 0x01a9 }
            java.util.concurrent.Executor r1 = r1.c     // Catch:{ Exception -> 0x01a9 }
            r5.<init>(r15, r0, r1)     // Catch:{ Exception -> 0x01a9 }
            r10 = r5
            goto L_0x0191
        L_0x0190:
            r10 = r15
        L_0x0191:
            psr r0 = new psr
            aoqm r12 = defpackage.aoqm.a
            r6 = r0
            r7 = r20
            r8 = r18
            r9 = r19
            r11 = r21
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r0
        L_0x01a2:
            r0 = move-exception
            agog r1 = new agog     // Catch:{ Exception -> 0x01a9 }
            r1.<init>((java.lang.Throwable) r0)     // Catch:{ Exception -> 0x01a9 }
            throw r1     // Catch:{ Exception -> 0x01a9 }
        L_0x01a9:
            r0 = move-exception
            goto L_0x01ac
        L_0x01ab:
            r0 = move-exception
        L_0x01ac:
            if (r3 == 0) goto L_0x01b1
            r2.delete()
        L_0x01b1:
            r4.close()
            throw r0
        L_0x01b5:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Null applicationId"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.psw.a(android.content.Context, pas, orf, com.google.android.gms.icing.nativeindex.NativeIndex, ozs, oyq, agpk):psr");
    }

    public static ptb a(Context context, ozb ozb, pas pas, prp prp, ozs ozs, orf orf, NativeIndex nativeIndex, oyq oyq, agtt agtt) {
        Context context2 = context;
        agtt agtt2 = agtt;
        psl psl = new psl(ozb, pas, prp);
        Account a = a(context2, psl.a());
        pss.a(a.name, context, ozs, orf, nativeIndex, oyq);
        agod a2 = a(context2, a, 12803);
        File file = new File(psu.a(context), "upload");
        agny a3 = agny.a(context2, "icing-user-actions");
        int i = ozq.a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        int b = aoog.b(axsp.a.a().p());
        long j = (long) i;
        aguv aguv = new aguv(agtt2.b);
        boolean z = true;
        amrl.a(b >= 0);
        if (file.exists() || !file.mkdir()) {
            z = false;
        }
        aorr a4 = aorl.a((Callable) new agut(aguv, a, new File(file, "footprints_queue.db")), aguv.a);
        if (z) {
            a4 = aooz.a(a4, agsx.class, (aoqb) new agtl(file), agtt2.b);
        }
        Account account = a;
        psl psl2 = psl;
        int i2 = b;
        agtt agtt3 = agtt2;
        aorr a5 = aopr.a(a4, (amqy) new agtm(agtt, a2, a3, timeUnit, j, i2, file), agtt3.b);
        if (axsp.h() > 0) {
            a5 = aopr.a(a5, (amqy) new agto(agtt3, amta.a((amsv) new agtn(agtt3, a3, account))), (Executor) aoqm.a);
        }
        a5.a(new agtp(a5, a2), agtt3.b);
        Context context3 = context;
        return new ptb(context3, psl2, new ptc(context3), a5);
    }
}
