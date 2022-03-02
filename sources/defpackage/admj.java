package defpackage;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.HashMap;

/* renamed from: admj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class admj extends adlq {
    public static final adro e = new adro("file_path", "");
    public static final adra f = new adra("package_processed", false);
    public static final adrk g = new adrk("boot_token", -1L);
    public static final adra h = new adra("reboot_prepared", false);
    private static final iwd j = adnt.e("NonAbRebootAction");
    private static final anax k = anax.a((Object) 20, (Object) 23);
    private static final adro l = new adro("installation_success_message", "");
    private static final adro m = new adro("installation_failure_message", "");
    private static final adra n = new adra("install_in_progress", false);
    public final Context i;
    private final adkm o = ((adkm) adkm.c.b());
    private final adkt p = ((adkt) adkt.e.b());
    private final adla q = ((adla) adla.h.b());
    private final adns r;

    public admj(Context context, adre adre) {
        super("non-ab-reboot", adre);
        this.i = context;
        this.r = adns.a(context);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b2, code lost:
        if (r10.equals("source_build") != false) goto L_0x00e8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.util.Map r17) {
        /*
            r16 = this;
            anqe r0 = defpackage.anqe.l
            aucd r0 = r0.o()
            java.util.Set r1 = r17.entrySet()
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r4 = r2
        L_0x0011:
            boolean r6 = r1.hasNext()
            r7 = 6
            r8 = 1
            r9 = 0
            if (r6 == 0) goto L_0x01b2
            java.lang.Object r6 = r1.next()
            java.util.Map$Entry r6 = (java.util.Map.Entry) r6
            java.lang.Object r10 = r6.getKey()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = "bytes_stashed"
            boolean r10 = r10.startsWith(r11)
            if (r10 == 0) goto L_0x003b
            java.lang.Object r6 = r6.getValue()
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            long r2 = r2 + r6
            goto L_0x01b0
        L_0x003b:
            java.lang.Object r10 = r6.getKey()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.String r11 = "bytes_written"
            boolean r10 = r10.startsWith(r11)
            if (r10 == 0) goto L_0x0056
            java.lang.Object r6 = r6.getValue()
            java.lang.Long r6 = (java.lang.Long) r6
            long r6 = r6.longValue()
            long r4 = r4 + r6
            goto L_0x01b0
        L_0x0056:
            java.lang.Object r10 = r6.getValue()
            java.lang.Long r10 = (java.lang.Long) r10
            long r10 = r10.longValue()
            r12 = 2147483647(0x7fffffff, double:1.060997895E-314)
            r14 = 2
            int r15 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r15 <= 0) goto L_0x007f
            iwd r7 = j
            java.lang.Object[] r10 = new java.lang.Object[r14]
            java.lang.Object r11 = r6.getKey()
            r10[r9] = r11
            java.lang.Object r6 = r6.getValue()
            r10[r8] = r6
            java.lang.String r6 = "Number overflow: %s = %d."
            r7.e(r6, r10)
            goto L_0x01b0
        L_0x007f:
            java.lang.Object r10 = r6.getKey()
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r6 = r6.getValue()
            java.lang.Long r6 = (java.lang.Long) r6
            int r6 = r6.intValue()
            int r11 = r10.hashCode()
            r12 = 4
            switch(r11) {
                case -826341929: goto L_0x00dd;
                case 94434409: goto L_0x00d3;
                case 96784904: goto L_0x00c9;
                case 115402327: goto L_0x00bf;
                case 1136755538: goto L_0x00b5;
                case 1654837578: goto L_0x00ac;
                case 2077336464: goto L_0x00a2;
                case 2077343769: goto L_0x0098;
                default: goto L_0x0097;
            }
        L_0x0097:
            goto L_0x00e7
        L_0x0098:
            java.lang.String r7 = "temperature_max"
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x00e7
            r7 = 2
            goto L_0x00e8
        L_0x00a2:
            java.lang.String r7 = "temperature_end"
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x00e7
            r7 = 1
            goto L_0x00e8
        L_0x00ac:
            java.lang.String r11 = "source_build"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L_0x00e7
            goto L_0x00e8
        L_0x00b5:
            java.lang.String r7 = "time_total"
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x00e7
            r7 = 3
            goto L_0x00e8
        L_0x00bf:
            java.lang.String r7 = "uncrypt_time"
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x00e7
            r7 = 7
            goto L_0x00e8
        L_0x00c9:
            java.lang.String r7 = "error"
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x00e7
            r7 = 5
            goto L_0x00e8
        L_0x00d3:
            java.lang.String r7 = "cause"
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x00e7
            r7 = 4
            goto L_0x00e8
        L_0x00dd:
            java.lang.String r7 = "temperature_start"
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x00e7
            r7 = 0
            goto L_0x00e8
        L_0x00e7:
            r7 = -1
        L_0x00e8:
            switch(r7) {
                case 0: goto L_0x019b;
                case 1: goto L_0x0185;
                case 2: goto L_0x016e;
                case 3: goto L_0x0157;
                case 4: goto L_0x0140;
                case 5: goto L_0x0128;
                case 6: goto L_0x0110;
                case 7: goto L_0x00f8;
                default: goto L_0x00eb;
            }
        L_0x00eb:
            iwd r6 = j
            java.lang.Object[] r7 = new java.lang.Object[r8]
            r7[r9] = r10
            java.lang.String r8 = "Unrecognized proto name: %s"
            r6.d(r8, r7)
            goto L_0x01b0
        L_0x00f8:
            boolean r7 = r0.c
            if (r7 != 0) goto L_0x00fd
            goto L_0x0102
        L_0x00fd:
            r0.c()
            r0.c = r9
        L_0x0102:
            aucj r7 = r0.b
            anqe r7 = (defpackage.anqe) r7
            int r8 = r7.a
            r8 = r8 | 512(0x200, float:7.175E-43)
            r7.a = r8
            r7.k = r6
            goto L_0x01b0
        L_0x0110:
            boolean r7 = r0.c
            if (r7 != 0) goto L_0x0115
            goto L_0x011a
        L_0x0115:
            r0.c()
            r0.c = r9
        L_0x011a:
            aucj r7 = r0.b
            anqe r7 = (defpackage.anqe) r7
            int r8 = r7.a
            r8 = r8 | 256(0x100, float:3.59E-43)
            r7.a = r8
            r7.j = r6
            goto L_0x01b0
        L_0x0128:
            boolean r7 = r0.c
            if (r7 != 0) goto L_0x012d
            goto L_0x0132
        L_0x012d:
            r0.c()
            r0.c = r9
        L_0x0132:
            aucj r7 = r0.b
            anqe r7 = (defpackage.anqe) r7
            int r8 = r7.a
            r8 = r8 | 128(0x80, float:1.794E-43)
            r7.a = r8
            r7.i = r6
            goto L_0x01b0
        L_0x0140:
            boolean r7 = r0.c
            if (r7 != 0) goto L_0x0145
            goto L_0x014a
        L_0x0145:
            r0.c()
            r0.c = r9
        L_0x014a:
            aucj r7 = r0.b
            anqe r7 = (defpackage.anqe) r7
            int r8 = r7.a
            r8 = r8 | 64
            r7.a = r8
            r7.h = r6
            goto L_0x01b0
        L_0x0157:
            boolean r7 = r0.c
            if (r7 != 0) goto L_0x015c
            goto L_0x0161
        L_0x015c:
            r0.c()
            r0.c = r9
        L_0x0161:
            aucj r7 = r0.b
            anqe r7 = (defpackage.anqe) r7
            int r8 = r7.a
            r8 = r8 | 16
            r7.a = r8
            r7.f = r6
            goto L_0x01b0
        L_0x016e:
            boolean r7 = r0.c
            if (r7 != 0) goto L_0x0173
            goto L_0x0178
        L_0x0173:
            r0.c()
            r0.c = r9
        L_0x0178:
            aucj r7 = r0.b
            anqe r7 = (defpackage.anqe) r7
            int r8 = r7.a
            r8 = r8 | 8
            r7.a = r8
            r7.e = r6
            goto L_0x01b0
        L_0x0185:
            boolean r7 = r0.c
            if (r7 != 0) goto L_0x018a
            goto L_0x018f
        L_0x018a:
            r0.c()
            r0.c = r9
        L_0x018f:
            aucj r7 = r0.b
            anqe r7 = (defpackage.anqe) r7
            int r8 = r7.a
            r8 = r8 | r12
            r7.a = r8
            r7.d = r6
            goto L_0x01b0
        L_0x019b:
            boolean r7 = r0.c
            if (r7 != 0) goto L_0x01a0
            goto L_0x01a5
        L_0x01a0:
            r0.c()
            r0.c = r9
        L_0x01a5:
            aucj r7 = r0.b
            anqe r7 = (defpackage.anqe) r7
            int r8 = r7.a
            r8 = r8 | r14
            r7.a = r8
            r7.c = r6
        L_0x01b0:
            goto L_0x0011
        L_0x01b2:
            boolean r1 = r0.c
            if (r1 != 0) goto L_0x01b7
            goto L_0x01bc
        L_0x01b7:
            r0.c()
            r0.c = r9
        L_0x01bc:
            aucj r1 = r0.b
            anqe r1 = (defpackage.anqe) r1
            int r6 = r1.a
            r6 = r6 | r8
            r1.a = r6
            r1.b = r2
            r2 = r6 | 32
            r1.a = r2
            r1.g = r4
            r1 = r16
            adns r2 = r1.r
            aucj r0 = r0.i()
            anqe r0 = (defpackage.anqe) r0
            aucd r3 = r2.a((int) r7)
            boolean r4 = r3.c
            if (r4 != 0) goto L_0x01e0
            goto L_0x01e5
        L_0x01e0:
            r3.c()
            r3.c = r9
        L_0x01e5:
            aucj r4 = r3.b
            anqb r4 = (defpackage.anqb) r4
            anqb r5 = defpackage.anqb.l
            r0.getClass()
            r4.i = r0
            int r0 = r4.a
            r0 = r0 | 128(0x80, float:1.794E-43)
            r4.a = r0
            aucj r0 = r3.i()
            anqb r0 = (defpackage.anqb) r0
            r2.a((defpackage.anqb) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.admj.a(java.util.Map):void");
    }

    private final boolean e() {
        return ((Boolean) a(h)).booleanValue() && ((Long) a(g)).longValue() != this.p.d();
    }

    private static amri f() {
        try {
            String a = anne.a(new File("/cache/recovery/last_install"), amqn.c).a();
            HashMap hashMap = new HashMap();
            for (String str : amsk.a(10).b().a().a((CharSequence) a)) {
                String[] split = str.split(":");
                if (split.length == 2) {
                    try {
                        hashMap.put(split[0].trim(), Long.valueOf(Long.parseLong(split[1].trim())));
                    } catch (NumberFormatException e2) {
                        j.e("Failed to parse numbers in %s", str, e2);
                    }
                }
            }
            return amri.b(hashMap);
        } catch (IOException e3) {
            j.e("Failed to read installation status in %s.", "/cache/recovery/last_install");
            return ampu.a;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00db, code lost:
        if (k.contains(java.lang.Integer.valueOf(r0.intValue())) != false) goto L_0x0110;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.adll c() {
        /*
            r11 = this;
            adkm r0 = r11.o
            r0.d()
            adla r0 = r11.q
            adrn r0 = r0.k
            adra r1 = defpackage.adla.g
            java.lang.Object r0 = r0.b(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            java.lang.String r1 = "finished-execution"
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r4 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r4)
            if (r0 == 0) goto L_0x0033
            adla r0 = r11.q
            r5 = 1031(0x407, float:1.445E-42)
            r0.a((int) r5, (double) r2)
            adll r0 = new adll
            adrc[] r2 = new defpackage.adrc[r4]
            adre r2 = defpackage.adre.a((defpackage.adrc[]) r2)
            r0.<init>(r1, r2)
            return r0
        L_0x0033:
            adqw r0 = defpackage.admx.a()
            boolean r6 = defpackage.ayox.b()
            if (r6 == 0) goto L_0x0054
            boolean r6 = defpackage.adkb.b(r0)
            if (r6 == 0) goto L_0x0054
            boolean r6 = r11.e()
            if (r6 == 0) goto L_0x004a
            goto L_0x0054
        L_0x004a:
            iwd r6 = j
            java.lang.Object[] r7 = new java.lang.Object[r4]
            java.lang.String r8 = "Bypassing the self-update check."
            r6.c(r8, r7)
            goto L_0x009e
        L_0x0054:
            boolean r6 = defpackage.adkb.b(r0)
            if (r6 == 0) goto L_0x009e
            adro r0 = l
            java.lang.Object r0 = r11.a(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0079
            android.content.Context r0 = r11.i
            adro r5 = l
            java.lang.Object r5 = r11.a(r5)
            java.lang.String r5 = (java.lang.String) r5
            android.content.Intent r5 = defpackage.adkk.a(r5)
            r0.startActivity(r5)
        L_0x0079:
            amri r0 = f()
            boolean r5 = r0.a()
            if (r5 == 0) goto L_0x008c
            java.lang.Object r0 = r0.b()
            java.util.Map r0 = (java.util.Map) r0
            r11.a((java.util.Map) r0)
        L_0x008c:
            adla r0 = r11.q
            r5 = 5
            r0.a((int) r5, (double) r2)
            adll r0 = new adll
            adrc[] r2 = new defpackage.adrc[r4]
            adre r2 = defpackage.adre.a((defpackage.adrc[]) r2)
            r0.<init>(r1, r2)
            return r0
        L_0x009e:
            boolean r6 = r11.e()
            if (r6 == 0) goto L_0x0110
            boolean r0 = defpackage.adkb.b(r0)
            if (r0 != 0) goto L_0x0110
            amri r0 = f()
            boolean r6 = r0.a()
            if (r6 == 0) goto L_0x00de
            java.lang.Object r6 = r0.b()
            java.util.Map r6 = (java.util.Map) r6
            r11.a((java.util.Map) r6)
            java.lang.Object r0 = r0.b()
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String r6 = "error"
            java.lang.Object r0 = r0.get(r6)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 == 0) goto L_0x00de
            anax r6 = k
            int r0 = r0.intValue()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r6.contains(r0)
            if (r0 == 0) goto L_0x00de
            goto L_0x0110
        L_0x00de:
            adla r0 = r11.q
            r5 = 775(0x307, float:1.086E-42)
            r0.a((int) r5, (double) r2)
            adro r0 = m
            java.lang.Object r0 = r11.a(r0)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0104
            android.content.Context r0 = r11.i
            adro r2 = m
            java.lang.Object r2 = r11.a(r2)
            java.lang.String r2 = (java.lang.String) r2
            android.content.Intent r2 = defpackage.adkk.a(r2)
            r0.startActivity(r2)
        L_0x0104:
            adll r0 = new adll
            adrc[] r2 = new defpackage.adrc[r4]
            adre r2 = defpackage.adre.a((defpackage.adrc[]) r2)
            r0.<init>(r1, r2)
            return r0
        L_0x0110:
            adla r0 = r11.q
            com.google.android.gms.update.SystemUpdateStatus r0 = r0.d()
            java.lang.String r6 = r0.a
            boolean r6 = defpackage.amrk.a((java.lang.String) r6)
            if (r6 == 0) goto L_0x012f
            adla r0 = r11.q
            r0.a((int) r4, (double) r2)
            adll r0 = new adll
            adrc[] r2 = new defpackage.adrc[r4]
            adre r2 = defpackage.adre.a((defpackage.adrc[]) r2)
            r0.<init>(r1, r2)
            return r0
        L_0x012f:
            android.content.Context r6 = r11.i     // Catch:{ adju -> 0x02b6 }
            adjv r1 = defpackage.adka.b(r6, r0)     // Catch:{ adju -> 0x02b6 }
            int r6 = r1.a
            r7 = 784(0x310, float:1.099E-42)
            java.lang.String r8 = "non-ab-reboot"
            if (r6 != r7) goto L_0x028a
            boolean r1 = r0.j
            r6 = 0
            r9 = 1
            if (r1 != 0) goto L_0x020c
            android.content.Context r1 = r11.i
            adra r10 = f
            java.lang.Object r10 = r11.a(r10)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            boolean r1 = defpackage.adki.a(r1, r0, r10)
            if (r1 != 0) goto L_0x019e
            android.content.Context r1 = r11.i
            adra r4 = f
            java.lang.Object r4 = r11.a(r4)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            boolean r0 = defpackage.adki.b(r1, r0, r4)
            if (r0 != 0) goto L_0x016d
            goto L_0x020c
        L_0x016d:
            adla r0 = r11.q
            r1 = 272(0x110, float:3.81E-43)
            r0.a((int) r1, (double) r2)
            admd r0 = defpackage.adme.f()
            aypa r1 = defpackage.aypa.a
            aypb r1 = r1.a()
            long r1 = r1.c()
            r0.a(r1)
            adre r1 = r11.a()
            adrd r1 = r1.b()
            adra r2 = h
            r1.a(r2, r5)
            adre r1 = r1.a()
            r0.a(r8, r1)
            adll r0 = r0.b()
            return r0
        L_0x019e:
            boolean r0 = defpackage.jkr.c()
            if (r0 == 0) goto L_0x01c1
            android.content.Context r0 = r11.i     // Catch:{ IOException -> 0x01b7 }
            java.io.File r1 = new java.io.File     // Catch:{ IOException -> 0x01b7 }
            adro r5 = e     // Catch:{ IOException -> 0x01b7 }
            java.lang.Object r5 = r11.a(r5)     // Catch:{ IOException -> 0x01b7 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ IOException -> 0x01b7 }
            r1.<init>(r5)     // Catch:{ IOException -> 0x01b7 }
            defpackage.adne.a(r0, r1)     // Catch:{ IOException -> 0x01b7 }
            goto L_0x01c1
        L_0x01b7:
            r0 = move-exception
            iwd r1 = j
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "Failed to execute RecoverySystemDelegate.scheduleUpdateOnBoot()."
            r1.e(r5, r0, r4)
        L_0x01c1:
            adla r0 = r11.q
            r1 = 528(0x210, float:7.4E-43)
            r0.a((int) r1, (double) r2)
            adll r0 = new adll
            adre r1 = r11.a()
            adrd r1 = r1.b()
            adrk r2 = g
            adkt r3 = r11.p
            long r3 = r3.d()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.a(r2, r3)
            adro r2 = l
            adjz r3 = defpackage.adke.e
            java.lang.Object r3 = r3.a()
            java.lang.String r3 = (java.lang.String) r3
            r1.a(r2, r3)
            adro r2 = m
            adjz r3 = defpackage.adke.f
            java.lang.Object r3 = r3.a()
            java.lang.String r3 = (java.lang.String) r3
            r1.a(r2, r3)
            adra r2 = h
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r9)
            r1.a(r2, r3)
            adre r1 = r1.a()
            r0.<init>(r8, r1, r6)
            return r0
        L_0x020c:
            adra r0 = n
            java.lang.Object r0 = r11.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x023b
            boolean r0 = defpackage.jkr.c()
            if (r0 == 0) goto L_0x0235
            adra r0 = f
            java.lang.Object r0 = r11.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x022f
            goto L_0x0235
        L_0x022f:
            admi r6 = new admi
            r6.<init>(r11)
            goto L_0x023c
        L_0x0235:
            admh r6 = new admh
            r6.<init>(r11)
            goto L_0x023c
        L_0x023b:
        L_0x023c:
            adla r0 = r11.q
            r0.a((int) r7, (double) r2)
            adll r0 = new adll
            adre r1 = r11.a()
            adrd r1 = r1.b()
            adrk r2 = g
            adkt r3 = r11.p
            long r3 = r3.d()
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1.a(r2, r3)
            adro r2 = l
            adjz r3 = defpackage.adke.e
            java.lang.Object r3 = r3.a()
            java.lang.String r3 = (java.lang.String) r3
            r1.a(r2, r3)
            adro r2 = m
            adjz r3 = defpackage.adke.f
            java.lang.Object r3 = r3.a()
            java.lang.String r3 = (java.lang.String) r3
            r1.a(r2, r3)
            adra r2 = h
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r9)
            r1.a(r2, r3)
            adra r2 = n
            r1.a(r2, r3)
            adre r1 = r1.a()
            r0.<init>(r8, r1, r9, r6)
            return r0
        L_0x028a:
            adla r0 = r11.q
            r0.a((int) r6, (double) r2)
            adkm r0 = r11.o
            r0.c()
            admd r0 = defpackage.adme.f()
            long r1 = r1.b
            r0.a(r1)
            adre r1 = r11.a()
            adrd r1 = r1.b()
            adra r2 = h
            r1.a(r2, r5)
            adre r1 = r1.a()
            r0.a(r8, r1)
            adll r0 = r0.b()
            return r0
        L_0x02b6:
            r0 = move-exception
            iwd r5 = j
            java.lang.Object[] r6 = new java.lang.Object[r4]
            java.lang.String r7 = "Unable to continue due to invalid config."
            r5.e(r7, r0, r6)
            adla r0 = r11.q
            r5 = 519(0x207, float:7.27E-43)
            r0.a((int) r5, (double) r2)
            adll r0 = new adll
            adrc[] r2 = new defpackage.adrc[r4]
            adre r2 = defpackage.adre.a((defpackage.adrc[]) r2)
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.admj.c():adll");
    }

    public final void a(Exception exc) {
        if ((exc instanceof IOException) || (exc instanceof GeneralSecurityException)) {
            j.e("Failed to execute RecoverySystem.installPackage().", exc, new Object[0]);
            adla adla = this.q;
            adla.k.a(adla.g.b(true));
            adla.k.a(adla.d);
            this.q.a(1031, -1.0d);
            return;
        }
        j.f("Failed to execute RecoverySystem.installPackage() with unexpected exception.", exc, new Object[0]);
        throw exc;
    }
}
