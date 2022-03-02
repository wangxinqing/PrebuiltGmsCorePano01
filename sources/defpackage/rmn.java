package defpackage;

import android.accounts.Account;
import com.google.android.gms.location.reporting.OptInRequest;
import com.google.android.gms.location.reporting.ReportingState;
import com.google.android.location.reporting.service.ReportingAndroidChimeraService;
import com.google.android.location.reporting.state.update.AccountConfig;

/* renamed from: rmn  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class rmn extends bhw implements rmo {
    final /* synthetic */ ReportingAndroidChimeraService a;
    private final String b;
    private final String c;

    public rmn() {
        super("com.google.android.gms.location.reporting.internal.IReportingService");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r1.equals(r2) == false) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0128 A[Catch:{ RuntimeException -> 0x0138 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0130 A[Catch:{ RuntimeException -> 0x0138 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int a(com.google.android.gms.location.reporting.OptInRequest r10, boolean r11) {
        /*
            r9 = this;
            com.google.android.location.reporting.service.ReportingAndroidChimeraService r0 = r9.a
            r0.a()
            com.google.android.location.reporting.service.ReportingAndroidChimeraService r0 = r9.a     // Catch:{ RuntimeException -> 0x0138 }
            java.lang.String r1 = r9.b     // Catch:{ RuntimeException -> 0x0138 }
            java.lang.String r2 = r9.c     // Catch:{ RuntimeException -> 0x0138 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ RuntimeException -> 0x0138 }
            java.lang.String r4 = "+"
            if (r3 == 0) goto L_0x0014
            goto L_0x0052
        L_0x0014:
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ RuntimeException -> 0x0138 }
            if (r3 == 0) goto L_0x001b
            goto L_0x0021
        L_0x001b:
            boolean r1 = r1.equals(r2)     // Catch:{ RuntimeException -> 0x0138 }
            if (r1 != 0) goto L_0x0052
        L_0x0021:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0138 }
            r1.<init>()     // Catch:{ RuntimeException -> 0x0138 }
            java.lang.String r3 = r10.b     // Catch:{ RuntimeException -> 0x0138 }
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ RuntimeException -> 0x0138 }
            if (r5 == 0) goto L_0x0034
            java.lang.String r3 = "notag"
            r1.append(r3)     // Catch:{ RuntimeException -> 0x0138 }
            goto L_0x0037
        L_0x0034:
            r1.append(r3)     // Catch:{ RuntimeException -> 0x0138 }
        L_0x0037:
            r1.append(r4)     // Catch:{ RuntimeException -> 0x0138 }
            r1.append(r2)     // Catch:{ RuntimeException -> 0x0138 }
            android.accounts.Account r2 = r10.a     // Catch:{ RuntimeException -> 0x0138 }
            rlx r2 = com.google.android.gms.location.reporting.OptInRequest.a(r2)     // Catch:{ RuntimeException -> 0x0138 }
            java.lang.String r1 = r1.toString()     // Catch:{ RuntimeException -> 0x0138 }
            r2.b = r1     // Catch:{ RuntimeException -> 0x0138 }
            java.lang.String r10 = r10.c     // Catch:{ RuntimeException -> 0x0138 }
            r2.c = r10     // Catch:{ RuntimeException -> 0x0138 }
            com.google.android.gms.location.reporting.OptInRequest r10 = r2.a()     // Catch:{ RuntimeException -> 0x0138 }
        L_0x0052:
            ajnd r0 = defpackage.ajnd.a(r0)     // Catch:{ RuntimeException -> 0x0138 }
            java.lang.String r1 = r9.b     // Catch:{ RuntimeException -> 0x0138 }
            java.lang.String r2 = "com.google.android.gms"
            boolean r2 = r2.equals(r1)     // Catch:{ RuntimeException -> 0x0138 }
            if (r2 == 0) goto L_0x0063
            java.lang.String r2 = "com.google.android.gms+opt-in"
            goto L_0x0064
        L_0x0063:
            r2 = r1
        L_0x0064:
            java.lang.String r3 = r10.b     // Catch:{ RuntimeException -> 0x0138 }
            r5 = 1
            if (r3 != 0) goto L_0x006a
            goto L_0x009c
        L_0x006a:
            int r3 = r3.length()     // Catch:{ RuntimeException -> 0x0138 }
            r6 = 100
            if (r3 > r6) goto L_0x0124
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ RuntimeException -> 0x0138 }
            java.lang.String r3 = r10.b     // Catch:{ RuntimeException -> 0x0138 }
            java.lang.String r6 = java.lang.String.valueOf(r2)     // Catch:{ RuntimeException -> 0x0138 }
            int r6 = r6.length()     // Catch:{ RuntimeException -> 0x0138 }
            java.lang.String r7 = java.lang.String.valueOf(r3)     // Catch:{ RuntimeException -> 0x0138 }
            int r7 = r7.length()     // Catch:{ RuntimeException -> 0x0138 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0138 }
            int r6 = r6 + r5
            int r6 = r6 + r7
            r8.<init>(r6)     // Catch:{ RuntimeException -> 0x0138 }
            r8.append(r2)     // Catch:{ RuntimeException -> 0x0138 }
            r8.append(r4)     // Catch:{ RuntimeException -> 0x0138 }
            r8.append(r3)     // Catch:{ RuntimeException -> 0x0138 }
            java.lang.String r2 = r8.toString()     // Catch:{ RuntimeException -> 0x0138 }
        L_0x009c:
            java.lang.String r3 = r10.c     // Catch:{ RuntimeException -> 0x0138 }
            aztb r4 = defpackage.aztb.a     // Catch:{ RuntimeException -> 0x0138 }
            aztc r4 = r4.a()     // Catch:{ RuntimeException -> 0x0138 }
            boolean r4 = r4.aD()     // Catch:{ RuntimeException -> 0x0138 }
            if (r4 != 0) goto L_0x00ab
            goto L_0x00b5
        L_0x00ab:
            boolean r4 = defpackage.amrk.a((java.lang.String) r3)     // Catch:{ RuntimeException -> 0x0138 }
            if (r4 == 0) goto L_0x00b5
            r5 = 12
            goto L_0x0126
        L_0x00b5:
            android.accounts.Account r4 = r10.a     // Catch:{ RuntimeException -> 0x0138 }
            if (r4 == 0) goto L_0x00c4
            ajmm r6 = r0.a     // Catch:{ RuntimeException -> 0x0138 }
            com.google.android.location.reporting.state.update.AccountConfig r4 = r6.a((android.accounts.Account) r4)     // Catch:{ RuntimeException -> 0x0138 }
            int r4 = r0.b(r4, r1)     // Catch:{ RuntimeException -> 0x0138 }
            goto L_0x00c5
        L_0x00c4:
            r4 = 2
        L_0x00c5:
            if (r4 != 0) goto L_0x0122
            android.accounts.Account r10 = r10.a     // Catch:{ RuntimeException -> 0x0138 }
            ajmz r10 = defpackage.ajna.a(r10, r2)     // Catch:{ RuntimeException -> 0x0138 }
            r10.d()     // Catch:{ RuntimeException -> 0x0138 }
            r10.q = r3     // Catch:{ RuntimeException -> 0x0138 }
            r10.e()     // Catch:{ RuntimeException -> 0x0138 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)     // Catch:{ RuntimeException -> 0x0138 }
            r10.g = r3     // Catch:{ RuntimeException -> 0x0138 }
            r10.h = r3     // Catch:{ RuntimeException -> 0x0138 }
            ajna r10 = r10.a()     // Catch:{ RuntimeException -> 0x0138 }
            java.lang.String r3 = "opt_in:"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ RuntimeException -> 0x0138 }
            int r4 = r1.length()     // Catch:{ RuntimeException -> 0x0138 }
            if (r4 != 0) goto L_0x00f3
            java.lang.String r1 = new java.lang.String     // Catch:{ RuntimeException -> 0x0138 }
            r1.<init>(r3)     // Catch:{ RuntimeException -> 0x0138 }
            goto L_0x00f7
        L_0x00f3:
            java.lang.String r1 = r3.concat(r1)     // Catch:{ RuntimeException -> 0x0138 }
        L_0x00f7:
            ajmm r0 = r0.a     // Catch:{ RuntimeException -> 0x0138 }
            java.lang.String r3 = java.lang.String.valueOf(r2)     // Catch:{ RuntimeException -> 0x0138 }
            int r3 = r3.length()     // Catch:{ RuntimeException -> 0x0138 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0138 }
            int r3 = r3 + 10
            r4.<init>(r3)     // Catch:{ RuntimeException -> 0x0138 }
            java.lang.String r3 = "tryOptIn("
            r4.append(r3)     // Catch:{ RuntimeException -> 0x0138 }
            r4.append(r2)     // Catch:{ RuntimeException -> 0x0138 }
            java.lang.String r2 = ")"
            r4.append(r2)     // Catch:{ RuntimeException -> 0x0138 }
            java.lang.String r2 = r4.toString()     // Catch:{ RuntimeException -> 0x0138 }
            boolean r10 = r0.a(r2, r10, r1)     // Catch:{ RuntimeException -> 0x0138 }
            if (r10 != 0) goto L_0x0120
            goto L_0x0126
        L_0x0120:
            r5 = 0
            goto L_0x0126
        L_0x0122:
            r5 = r4
            goto L_0x0126
        L_0x0124:
            r5 = 11
        L_0x0126:
            if (r11 != 0) goto L_0x0130
            java.lang.String r10 = r9.b     // Catch:{ RuntimeException -> 0x0138 }
            java.lang.String r0 = r9.c     // Catch:{ RuntimeException -> 0x0138 }
            defpackage.ajjd.c(r10, r0, r5)     // Catch:{ RuntimeException -> 0x0138 }
            goto L_0x0137
        L_0x0130:
            java.lang.String r10 = r9.b     // Catch:{ RuntimeException -> 0x0138 }
            java.lang.String r0 = r9.c     // Catch:{ RuntimeException -> 0x0138 }
            defpackage.ajjd.b(r10, r0, r5)     // Catch:{ RuntimeException -> 0x0138 }
        L_0x0137:
            return r5
        L_0x0138:
            r10 = move-exception
            java.lang.String r0 = "GCoreUlr"
            java.lang.String r1 = "original tryOptIn() exception (before parcelling)"
            defpackage.ajix.b((java.lang.String) r0, (java.lang.String) r1, (java.lang.Throwable) r10)
            r0 = -10000000(0xffffffffff676980, float:-3.0759945E38)
            if (r11 == 0) goto L_0x014d
            java.lang.String r11 = r9.b
            java.lang.String r1 = r9.c
            defpackage.ajjd.b(r11, r1, r0)
            goto L_0x0154
        L_0x014d:
            java.lang.String r11 = r9.b
            java.lang.String r1 = r9.c
            defpackage.ajjd.c(r11, r1, r0)
        L_0x0154:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rmn.a(com.google.android.gms.location.reporting.OptInRequest, boolean):int");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rmn(ReportingAndroidChimeraService reportingAndroidChimeraService, String str, String str2) {
        super("com.google.android.gms.location.reporting.internal.IReportingService");
        this.a = reportingAndroidChimeraService;
        this.b = str;
        this.c = str2;
    }

    public final int a(OptInRequest optInRequest) {
        return a(optInRequest, false);
    }

    public final ReportingState a(Account account) {
        this.a.a();
        try {
            ReportingAndroidChimeraService reportingAndroidChimeraService = this.a;
            AccountConfig a2 = reportingAndroidChimeraService.a.a(account);
            ajnd a3 = ajnd.a(reportingAndroidChimeraService);
            ReportingState a4 = a2.a(a3.b(a2, this.b), a3.a(a2, this.b), ajnw.a(aztb.a.a().W()).contains(this.b), ajnw.a(aztb.a.a().bJ()).contains(this.b));
            ajjd.a(this.b, this.c, 0);
            return a4;
        } catch (Exception e) {
            ajjd.a(this.b, this.c, -10000000);
            if (e instanceof RuntimeException) {
                ajix.b("GCoreUlr", "original getReportingState() exception (before parcelling)", (Throwable) e);
                throw e;
            }
            ajjf.a(e);
            throw new RuntimeException("bad internal state");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:163:0x063a A[Catch:{ RuntimeException -> 0x06e1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x064b A[Catch:{ RuntimeException -> 0x06e1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(int r22, android.os.Parcel r23, android.os.Parcel r24) {
        /*
            r21 = this;
            r1 = r21
            r0 = r23
            r2 = r24
            r3 = 5
            r4 = -10000000(0xffffffffff676980, float:-3.0759945E38)
            r5 = 4
            switch(r22) {
                case 1: goto L_0x071b;
                case 2: goto L_0x06ff;
                case 3: goto L_0x0474;
                case 4: goto L_0x03ae;
                case 5: goto L_0x020d;
                case 6: goto L_0x01f9;
                case 7: goto L_0x00a7;
                case 8: goto L_0x0010;
                default: goto L_0x000e;
            }
        L_0x000e:
            r0 = 0
            return r0
        L_0x0010:
            android.os.Parcelable$Creator r3 = com.google.android.gms.location.reporting.UlrPrivateModeRequest.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r0, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.location.reporting.UlrPrivateModeRequest r0 = (com.google.android.gms.location.reporting.UlrPrivateModeRequest) r0
            com.google.android.location.reporting.service.ReportingAndroidChimeraService r3 = r1.a
            r3.a()
            com.google.android.location.reporting.service.ReportingAndroidChimeraService r3 = r1.a
            ajne r4 = defpackage.ajne.a(r3)
            java.lang.String r5 = r1.b
            int r3 = r4.a(r3, r5, r0)
            java.lang.String r4 = r1.b
            java.lang.String r5 = r1.c
            boolean r0 = r0.b
            ajjc r6 = defpackage.ajjd.a
            if (r0 != 0) goto L_0x0036
            java.lang.String r6 = "Off"
            goto L_0x0038
        L_0x0036:
            java.lang.String r6 = "On"
        L_0x0038:
            int r8 = r6.length()
            java.lang.String r9 = java.lang.String.valueOf(r4)
            int r9 = r9.length()
            java.lang.String r10 = java.lang.String.valueOf(r5)
            int r10 = r10.length()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r8 = r8 + 64
            int r8 = r8 + r9
            int r8 = r8 + r10
            r11.<init>(r8)
            java.lang.String r8 = "UlrClearcutEvents.logApiCallPrivateModeToggle"
            r11.append(r8)
            r11.append(r6)
            java.lang.String r6 = "("
            r11.append(r6)
            r11.append(r4)
            java.lang.String r6 = "', '"
            r11.append(r6)
            r11.append(r5)
            java.lang.String r6 = ", "
            r11.append(r6)
            r11.append(r3)
            java.lang.String r6 = ")"
            r11.append(r6)
            r11.toString()
            ajjc r6 = defpackage.ajjd.a
            if (r6 == 0) goto L_0x009f
            azsj r6 = defpackage.azsj.a
            azsk r6 = r6.a()
            boolean r6 = r6.b()
            if (r6 != 0) goto L_0x008e
            goto L_0x009f
        L_0x008e:
            if (r0 != 0) goto L_0x0098
            ajjc r0 = defpackage.ajjd.a
            atev r6 = defpackage.atev.AC_PRIVATE_MODE_TOGGLE_OFF
            r0.a((defpackage.atev) r6, (java.lang.String) r4, (java.lang.String) r5, (int) r3)
            goto L_0x009f
        L_0x0098:
            ajjc r0 = defpackage.ajjd.a
            atev r6 = defpackage.atev.AC_PRIVATE_MODE_TOGGLE_ON
            r0.a((defpackage.atev) r6, (java.lang.String) r4, (java.lang.String) r5, (int) r3)
        L_0x009f:
            r24.writeNoException()
            r2.writeInt(r3)
            goto L_0x072d
        L_0x00a7:
            android.os.Parcelable$Creator r3 = android.accounts.Account.CREATOR
            android.os.Parcelable r3 = defpackage.bhx.a((android.os.Parcel) r0, (android.os.Parcelable.Creator) r3)
            android.accounts.Account r3 = (android.accounts.Account) r3
            android.os.Parcelable$Creator r5 = com.google.android.gms.location.reporting.SendDataRequest.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r0, (android.os.Parcelable.Creator) r5)
            com.google.android.gms.location.reporting.SendDataRequest r0 = (com.google.android.gms.location.reporting.SendDataRequest) r0
            com.google.android.location.reporting.service.ReportingAndroidChimeraService r5 = r1.a
            r5.a()
            com.google.android.location.reporting.service.ReportingAndroidChimeraService r5 = r1.a     // Catch:{ RuntimeException -> 0x01e9 }
            defpackage.ajnw.a((android.content.Context) r5)     // Catch:{ RuntimeException -> 0x01e9 }
            ajmm r6 = defpackage.ajmm.a((android.content.Context) r5)     // Catch:{ RuntimeException -> 0x01e9 }
            aztb r9 = defpackage.aztb.a     // Catch:{ RuntimeException -> 0x01e9 }
            aztc r9 = r9.a()     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.String r9 = r9.bG()     // Catch:{ RuntimeException -> 0x01e9 }
            java.util.List r9 = defpackage.ajnw.a((java.lang.String) r9)     // Catch:{ RuntimeException -> 0x01e9 }
            ajng r10 = new ajng     // Catch:{ RuntimeException -> 0x01e9 }
            r10.<init>(r5, r6, r9)     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.String r5 = r1.b     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.String r9 = java.lang.String.valueOf(r5)     // Catch:{ RuntimeException -> 0x01e9 }
            int r9 = r9.length()     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.String r11 = java.lang.String.valueOf(r6)     // Catch:{ RuntimeException -> 0x01e9 }
            int r11 = r11.length()     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x01e9 }
            int r9 = r9 + 12
            int r9 = r9 + r11
            r12.<init>(r9)     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.String r9 = "sendData("
            r12.append(r9)     // Catch:{ RuntimeException -> 0x01e9 }
            r12.append(r5)     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.String r9 = ", "
            r12.append(r9)     // Catch:{ RuntimeException -> 0x01e9 }
            r12.append(r6)     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.String r6 = ")"
            r12.append(r6)     // Catch:{ RuntimeException -> 0x01e9 }
            r12.toString()     // Catch:{ RuntimeException -> 0x01e9 }
            ajmm r6 = r10.b     // Catch:{ RuntimeException -> 0x01e9 }
            com.google.android.location.reporting.state.update.AccountConfig r6 = r6.a((android.accounts.Account) r3)     // Catch:{ RuntimeException -> 0x01e9 }
            boolean r9 = defpackage.azth.b()     // Catch:{ RuntimeException -> 0x01e9 }
            r11 = 3504(0xdb0, float:4.91E-42)
            if (r9 == 0) goto L_0x0133
            android.content.Context r9 = r10.a     // Catch:{ RuntimeException -> 0x01e9 }
            ajmp r9 = defpackage.ajmp.a((android.content.Context) r9)     // Catch:{ RuntimeException -> 0x01e9 }
            boolean r9 = r9.b()     // Catch:{ RuntimeException -> 0x01e9 }
            if (r9 == 0) goto L_0x0133
            java.lang.String r0 = "GCoreUlr"
            java.lang.String r3 = "Ulr is in private mode. sendData is disabled temporarily!"
            defpackage.ajix.a((java.lang.String) r0, (java.lang.String) r3)     // Catch:{ RuntimeException -> 0x01e9 }
            r8 = 3504(0xdb0, float:4.91E-42)
            goto L_0x01da
        L_0x0133:
            boolean r9 = r6.j()     // Catch:{ RuntimeException -> 0x01e9 }
            if (r9 != 0) goto L_0x013a
            goto L_0x01aa
        L_0x013a:
            boolean r9 = r6.g     // Catch:{ RuntimeException -> 0x01e9 }
            if (r9 == 0) goto L_0x01aa
            if (r5 != 0) goto L_0x014b
            java.lang.String r0 = "GCoreUlr"
            java.lang.String r3 = "calling package not specified"
            android.util.Log.w(r0, r3)     // Catch:{ RuntimeException -> 0x01e9 }
            r8 = 8
            goto L_0x01da
        L_0x014b:
            java.util.List r6 = r10.c     // Catch:{ RuntimeException -> 0x01e9 }
            boolean r6 = r6.contains(r5)     // Catch:{ RuntimeException -> 0x01e9 }
            if (r6 != 0) goto L_0x018e
            java.util.List r0 = r10.c     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ RuntimeException -> 0x01e9 }
            int r3 = r5.length()     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ RuntimeException -> 0x01e9 }
            int r6 = r6.length()     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x01e9 }
            int r3 = r3 + 75
            int r3 = r3 + r6
            r8.<init>(r3)     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.String r3 = "GCoreUlr"
            java.lang.String r6 = "package '"
            r8.append(r6)     // Catch:{ RuntimeException -> 0x01e9 }
            r8.append(r5)     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.String r5 = "' not in "
            r8.append(r5)     // Catch:{ RuntimeException -> 0x01e9 }
            r8.append(r0)     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.String r0 = "; contact gcore-ulr-eng@ to get your package whitelisted."
            r8.append(r0)     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.String r0 = r8.toString()     // Catch:{ RuntimeException -> 0x01e9 }
            android.util.Log.w(r3, r0)     // Catch:{ RuntimeException -> 0x01e9 }
            r8 = 3500(0xdac, float:4.905E-42)
            goto L_0x01da
        L_0x018e:
            android.content.Context r6 = r10.a     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.String r9 = "com.google.android.location.reporting.ACTION_SEND_DATA"
            android.content.Intent r9 = defpackage.ajme.a((android.content.Context) r6, (java.lang.String) r9)     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.String r10 = "account"
            r9.putExtra(r10, r3)     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.String r3 = "caller"
            r9.putExtra(r3, r5)     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.String r3 = "request"
            defpackage.ivy.a((com.google.android.gms.common.internal.safeparcel.SafeParcelable) r0, (android.content.Intent) r9, (java.lang.String) r3)     // Catch:{ RuntimeException -> 0x01e9 }
            defpackage.ajnw.a((android.content.Context) r6, (android.content.Intent) r9)     // Catch:{ RuntimeException -> 0x01e9 }
            r8 = 0
            goto L_0x01da
        L_0x01aa:
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.String r3 = java.lang.String.valueOf(r6)     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch:{ RuntimeException -> 0x01e9 }
            int r5 = r5.length()     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.String r6 = java.lang.String.valueOf(r3)     // Catch:{ RuntimeException -> 0x01e9 }
            int r6 = r6.length()     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x01e9 }
            int r5 = r5 + 22
            int r5 = r5 + r6
            r8.<init>(r5)     // Catch:{ RuntimeException -> 0x01e9 }
            r8.append(r0)     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.String r0 = " for inactive account "
            r8.append(r0)     // Catch:{ RuntimeException -> 0x01e9 }
            r8.append(r3)     // Catch:{ RuntimeException -> 0x01e9 }
            r8.toString()     // Catch:{ RuntimeException -> 0x01e9 }
            r8 = 3504(0xdb0, float:4.91E-42)
        L_0x01da:
            java.lang.String r0 = r1.b     // Catch:{ RuntimeException -> 0x01e9 }
            java.lang.String r3 = r1.c     // Catch:{ RuntimeException -> 0x01e9 }
            defpackage.ajjd.e(r0, r3, r8)     // Catch:{ RuntimeException -> 0x01e9 }
            r24.writeNoException()
            r2.writeInt(r8)
            goto L_0x072d
        L_0x01e9:
            r0 = move-exception
            java.lang.String r2 = "GCoreUlr"
            java.lang.String r3 = "original sendData() exception (before parcelling)"
            defpackage.ajix.b((java.lang.String) r2, (java.lang.String) r3, (java.lang.Throwable) r0)
            java.lang.String r2 = r1.b
            java.lang.String r3 = r1.c
            defpackage.ajjd.e(r2, r3, r4)
            throw r0
        L_0x01f9:
            android.os.Parcelable$Creator r3 = com.google.android.gms.location.reporting.OptInRequest.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r0, (android.os.Parcelable.Creator) r3)
            com.google.android.gms.location.reporting.OptInRequest r0 = (com.google.android.gms.location.reporting.OptInRequest) r0
            int r0 = r1.a((com.google.android.gms.location.reporting.OptInRequest) r0)
            r24.writeNoException()
            r2.writeInt(r0)
            goto L_0x072d
        L_0x020d:
            android.os.Parcelable$Creator r4 = android.accounts.Account.CREATOR
            android.os.Parcelable r4 = defpackage.bhx.a((android.os.Parcel) r0, (android.os.Parcelable.Creator) r4)
            android.accounts.Account r4 = (android.accounts.Account) r4
            android.os.Parcelable$Creator r9 = com.google.android.gms.location.places.PlaceReport.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r0, (android.os.Parcelable.Creator) r9)
            com.google.android.gms.location.places.PlaceReport r0 = (com.google.android.gms.location.places.PlaceReport) r0
            com.google.android.location.reporting.service.ReportingAndroidChimeraService r9 = r1.a
            r9.a()
            com.google.android.location.reporting.service.ReportingAndroidChimeraService r9 = r1.a
            defpackage.ajnw.a((android.content.Context) r9)
            ajmm r10 = defpackage.ajmm.a((android.content.Context) r9)
            aztb r11 = defpackage.aztb.a
            aztc r11 = r11.a()
            java.lang.String r11 = r11.bC()
            java.util.List r11 = defpackage.ajnw.a((java.lang.String) r11)
            ajln r12 = new ajln
            r12.<init>(r9, r10, r11)
            java.lang.String r9 = r1.b
            java.lang.String r10 = java.lang.String.valueOf(r0)
            java.lang.String r11 = java.lang.String.valueOf(r9)
            int r11 = r11.length()
            java.lang.String r13 = java.lang.String.valueOf(r10)
            int r13 = r13.length()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            int r11 = r11 + 23
            int r11 = r11 + r13
            r14.<init>(r11)
            java.lang.String r11 = "reportDeviceAtPlace("
            r14.append(r11)
            r14.append(r9)
            java.lang.String r11 = ", "
            r14.append(r11)
            r14.append(r10)
            java.lang.String r10 = ")"
            r14.append(r10)
            r14.toString()
            ajmm r10 = r12.b
            com.google.android.location.reporting.state.update.AccountConfig r10 = r10.a((android.accounts.Account) r4)
            boolean r11 = defpackage.azth.b()
            if (r11 == 0) goto L_0x0298
            android.content.Context r11 = r12.a
            ajmp r11 = defpackage.ajmp.a((android.content.Context) r11)
            boolean r11 = r11.b()
            if (r11 != 0) goto L_0x028d
            goto L_0x0298
        L_0x028d:
            java.lang.String r0 = "GCoreUlr"
            java.lang.String r3 = "Ulr is in private mode and reportPlace is disabled temporarily!"
            defpackage.ajix.a((java.lang.String) r0, (java.lang.String) r3)
            r5 = 1
            goto L_0x035c
        L_0x0298:
            boolean r11 = r10.j()
            if (r11 != 0) goto L_0x02a0
            goto L_0x032d
        L_0x02a0:
            boolean r11 = r10.g
            if (r11 == 0) goto L_0x032d
            aztb r10 = defpackage.aztb.a
            aztc r10 = r10.a()
            boolean r10 = r10.as()
            if (r10 != 0) goto L_0x02b1
            goto L_0x0311
        L_0x02b1:
            if (r9 != 0) goto L_0x02c7
            java.lang.String r0 = "GCoreUlr"
            boolean r0 = android.util.Log.isLoggable(r0, r3)
            if (r0 == 0) goto L_0x02c3
            java.lang.String r0 = "GCoreUlr"
            java.lang.String r3 = "calling package not specified"
            android.util.Log.w(r0, r3)
            goto L_0x02c4
        L_0x02c3:
        L_0x02c4:
            r5 = 3
            goto L_0x035c
        L_0x02c7:
            java.util.List r6 = r12.c
            boolean r6 = r6.contains(r9)
            if (r6 != 0) goto L_0x0311
            java.lang.String r0 = "GCoreUlr"
            boolean r0 = android.util.Log.isLoggable(r0, r3)
            if (r0 == 0) goto L_0x0310
            java.util.List r0 = r12.c
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r3 = r9.length()
            java.lang.String r4 = java.lang.String.valueOf(r0)
            int r4 = r4.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r3 = r3 + 75
            int r3 = r3 + r4
            r6.<init>(r3)
            java.lang.String r3 = "package '"
            r6.append(r3)
            r6.append(r9)
            java.lang.String r3 = "' not in "
            r6.append(r3)
            r6.append(r0)
            java.lang.String r0 = "; contact gcore-ulr-eng@ to get your package whitelisted."
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            java.lang.String r3 = "GCoreUlr"
            android.util.Log.w(r3, r0)
            goto L_0x035c
        L_0x0310:
            goto L_0x035c
        L_0x0311:
            android.content.Context r3 = r12.a
            java.lang.String r5 = "com.google.android.location.reporting.ACTION_REPORT_PLACE"
            android.content.Intent r5 = defpackage.ajme.a((android.content.Context) r3, (java.lang.String) r5)
            java.lang.String r6 = "account"
            r5.putExtra(r6, r4)
            java.lang.String r4 = "placeReport"
            r5.putExtra(r4, r0)
            java.lang.String r0 = "placeReportCaller"
            r5.putExtra(r0, r9)
            defpackage.ajnw.a((android.content.Context) r3, (android.content.Intent) r5)
            r5 = 0
            goto L_0x035c
        L_0x032d:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r3 = java.lang.String.valueOf(r10)
            java.lang.String r4 = java.lang.String.valueOf(r0)
            int r4 = r4.length()
            java.lang.String r5 = java.lang.String.valueOf(r3)
            int r5 = r5.length()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            int r4 = r4 + 22
            int r4 = r4 + r5
            r6.<init>(r4)
            r6.append(r0)
            java.lang.String r0 = " for inactive account "
            r6.append(r0)
            r6.append(r3)
            r6.toString()
            r5 = 1
        L_0x035c:
            java.lang.String r0 = r1.b
            java.lang.String r3 = r1.c
            java.lang.String r4 = java.lang.String.valueOf(r0)
            int r4 = r4.length()
            java.lang.String r6 = java.lang.String.valueOf(r3)
            int r6 = r6.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            int r4 = r4 + 58
            int r4 = r4 + r6
            r8.<init>(r4)
            java.lang.String r4 = "UlrClearcutEvents.logApiCallReportPlace('"
            r8.append(r4)
            r8.append(r0)
            java.lang.String r4 = "', '"
            r8.append(r4)
            r8.append(r3)
            java.lang.String r4 = ", "
            r8.append(r4)
            r8.append(r5)
            r8.toString()
            boolean r4 = defpackage.ajjd.a()
            if (r4 == 0) goto L_0x03a6
            boolean r4 = defpackage.ajjd.b()
            if (r4 == 0) goto L_0x03a6
            ajjc r4 = defpackage.ajjd.a
            atev r6 = defpackage.atev.AC_REPORT_PLACE
            r4.a((defpackage.atev) r6, (java.lang.String) r0, (java.lang.String) r3, (int) r5)
        L_0x03a6:
            r24.writeNoException()
            r2.writeInt(r5)
            goto L_0x072d
        L_0x03ae:
            long r9 = r23.readLong()
            com.google.android.location.reporting.service.ReportingAndroidChimeraService r0 = r1.a
            r0.a()
            ajmk r0 = new ajmk     // Catch:{ RuntimeException -> 0x0464 }
            com.google.android.location.reporting.service.ReportingAndroidChimeraService r3 = r1.a     // Catch:{ RuntimeException -> 0x0464 }
            ajmm r6 = r3.a     // Catch:{ RuntimeException -> 0x0464 }
            ajmo r11 = r3.b     // Catch:{ RuntimeException -> 0x0464 }
            r0.<init>(r3, r6, r11)     // Catch:{ RuntimeException -> 0x0464 }
            java.lang.String r3 = r1.b     // Catch:{ RuntimeException -> 0x0464 }
            java.lang.String r6 = defpackage.aztb.j()     // Catch:{ RuntimeException -> 0x0464 }
            java.util.List r6 = defpackage.ajnw.a((java.lang.String) r6)     // Catch:{ RuntimeException -> 0x0464 }
            boolean r11 = r6.contains(r3)     // Catch:{ RuntimeException -> 0x0464 }
            if (r11 != 0) goto L_0x0405
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ RuntimeException -> 0x0464 }
            java.lang.String r6 = java.lang.String.valueOf(r3)     // Catch:{ RuntimeException -> 0x0464 }
            int r6 = r6.length()     // Catch:{ RuntimeException -> 0x0464 }
            java.lang.String r8 = java.lang.String.valueOf(r0)     // Catch:{ RuntimeException -> 0x0464 }
            int r8 = r8.length()     // Catch:{ RuntimeException -> 0x0464 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x0464 }
            int r6 = r6 + 43
            int r6 = r6 + r8
            r11.<init>(r6)     // Catch:{ RuntimeException -> 0x0464 }
            r11.append(r3)     // Catch:{ RuntimeException -> 0x0464 }
            java.lang.String r3 = " not in "
            r11.append(r3)     // Catch:{ RuntimeException -> 0x0464 }
            r11.append(r0)     // Catch:{ RuntimeException -> 0x0464 }
            java.lang.String r0 = ", can't cancel "
            r11.append(r0)     // Catch:{ RuntimeException -> 0x0464 }
            r11.append(r9)     // Catch:{ RuntimeException -> 0x0464 }
            r11.toString()     // Catch:{ RuntimeException -> 0x0464 }
            goto L_0x044f
        L_0x0405:
            ajmo r0 = r0.c     // Catch:{ RuntimeException -> 0x0464 }
            java.lang.Object r3 = defpackage.ajmo.a     // Catch:{ RuntimeException -> 0x0464 }
            monitor-enter(r3)     // Catch:{ RuntimeException -> 0x0464 }
            double r5 = (double) r9
            java.lang.Object r9 = defpackage.ajmo.a     // Catch:{ all -> 0x0461 }
            monitor-enter(r9)     // Catch:{ all -> 0x0461 }
            ob r10 = new ob     // Catch:{ all -> 0x045e }
            r10.<init>()     // Catch:{ all -> 0x045e }
            java.util.List r11 = r0.c()     // Catch:{ all -> 0x045e }
            r10.addAll(r11)     // Catch:{ all -> 0x045e }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x045e }
        L_0x041e:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x045e }
            if (r11 == 0) goto L_0x0433
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x045e }
            ajnb r11 = (defpackage.ajnb) r11     // Catch:{ all -> 0x045e }
            long r12 = r11.a     // Catch:{ all -> 0x045e }
            double r12 = (double) r12     // Catch:{ all -> 0x045e }
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 != 0) goto L_0x041e
            monitor-exit(r9)     // Catch:{ all -> 0x045e }
            goto L_0x0435
        L_0x0433:
            monitor-exit(r9)     // Catch:{ all -> 0x045e }
            r11 = 0
        L_0x0435:
            if (r11 == 0) goto L_0x0448
            java.util.List r5 = java.util.Collections.singletonList(r11)     // Catch:{ all -> 0x0461 }
            boolean r5 = r0.a((java.util.Collection) r5)     // Catch:{ all -> 0x0461 }
            if (r5 == 0) goto L_0x0448
            android.content.Context r0 = r0.b     // Catch:{ all -> 0x0461 }
            java.lang.String r5 = "LocationReportingPreferences.removeUploadRequest"
            defpackage.ajme.b(r0, r5)     // Catch:{ all -> 0x0461 }
        L_0x0448:
            monitor-exit(r3)     // Catch:{ all -> 0x0461 }
            if (r11 != 0) goto L_0x044e
            r5 = 100
            goto L_0x044f
        L_0x044e:
            r5 = 0
        L_0x044f:
            java.lang.String r0 = r1.b     // Catch:{ RuntimeException -> 0x0464 }
            java.lang.String r3 = r1.c     // Catch:{ RuntimeException -> 0x0464 }
            defpackage.ajjd.d(r0, r3, r5)     // Catch:{ RuntimeException -> 0x0464 }
            r24.writeNoException()
            r2.writeInt(r5)
            goto L_0x072d
        L_0x045e:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x045e }
            throw r0     // Catch:{ all -> 0x0461 }
        L_0x0461:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0461 }
            throw r0     // Catch:{ RuntimeException -> 0x0464 }
        L_0x0464:
            r0 = move-exception
            java.lang.String r2 = "GCoreUlr"
            java.lang.String r3 = "original cancelUploadRequest() exception (before parcelling)"
            defpackage.ajix.b((java.lang.String) r2, (java.lang.String) r3, (java.lang.Throwable) r0)
            java.lang.String r2 = r1.b
            java.lang.String r3 = r1.c
            defpackage.ajjd.d(r2, r3, r4)
            throw r0
        L_0x0474:
            android.os.Parcelable$Creator r9 = com.google.android.gms.location.reporting.UploadRequest.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r0, (android.os.Parcelable.Creator) r9)
            r9 = r0
            com.google.android.gms.location.reporting.UploadRequest r9 = (com.google.android.gms.location.reporting.UploadRequest) r9
            com.google.android.location.reporting.service.ReportingAndroidChimeraService r0 = r1.a
            r0.a()
            r10 = -1
            ajmk r0 = new ajmk     // Catch:{ RuntimeException -> 0x06e5 }
            com.google.android.location.reporting.service.ReportingAndroidChimeraService r12 = r1.a     // Catch:{ RuntimeException -> 0x06e5 }
            ajmm r13 = r12.a     // Catch:{ RuntimeException -> 0x06e5 }
            ajmo r14 = r12.b     // Catch:{ RuntimeException -> 0x06e5 }
            r0.<init>(r12, r13, r14)     // Catch:{ RuntimeException -> 0x06e5 }
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ RuntimeException -> 0x06e5 }
            java.lang.String r14 = r1.b     // Catch:{ RuntimeException -> 0x06e5 }
            java.lang.String r15 = java.lang.String.valueOf(r9)     // Catch:{ RuntimeException -> 0x06e5 }
            java.lang.String r16 = java.lang.String.valueOf(r14)     // Catch:{ RuntimeException -> 0x06e5 }
            int r16 = r16.length()     // Catch:{ RuntimeException -> 0x06e5 }
            java.lang.String r17 = java.lang.String.valueOf(r15)     // Catch:{ RuntimeException -> 0x06e5 }
            int r17 = r17.length()     // Catch:{ RuntimeException -> 0x06e5 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x06e5 }
            int r16 = r16 + 38
            int r4 = r16 + r17
            r7.<init>(r4)     // Catch:{ RuntimeException -> 0x06e5 }
            java.lang.String r4 = "requestUpload("
            r7.append(r4)     // Catch:{ RuntimeException -> 0x06e5 }
            r7.append(r14)     // Catch:{ RuntimeException -> 0x06e5 }
            java.lang.String r4 = ", "
            r7.append(r4)     // Catch:{ RuntimeException -> 0x06e5 }
            r7.append(r15)     // Catch:{ RuntimeException -> 0x06e5 }
            java.lang.String r4 = ","
            r7.append(r4)     // Catch:{ RuntimeException -> 0x06e5 }
            r7.append(r12)     // Catch:{ RuntimeException -> 0x06e5 }
            java.lang.String r4 = ")"
            r7.append(r4)     // Catch:{ RuntimeException -> 0x06e5 }
            java.lang.String r4 = "GCoreUlr"
            java.lang.String r7 = r7.toString()     // Catch:{ RuntimeException -> 0x06e5 }
            defpackage.ajix.a((java.lang.String) r4, (java.lang.String) r7)     // Catch:{ RuntimeException -> 0x06e5 }
            java.lang.String r4 = defpackage.aztb.j()     // Catch:{ RuntimeException -> 0x06e5 }
            java.util.List r4 = defpackage.ajnw.a((java.lang.String) r4)     // Catch:{ RuntimeException -> 0x06e5 }
            boolean r7 = r4.contains(r14)     // Catch:{ RuntimeException -> 0x06e5 }
            if (r7 != 0) goto L_0x052c
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ RuntimeException -> 0x06e5 }
            java.lang.String r3 = java.lang.String.valueOf(r4)     // Catch:{ RuntimeException -> 0x06e5 }
            java.lang.String r4 = java.lang.String.valueOf(r0)     // Catch:{ RuntimeException -> 0x06e5 }
            int r4 = r4.length()     // Catch:{ RuntimeException -> 0x06e5 }
            java.lang.String r6 = java.lang.String.valueOf(r14)     // Catch:{ RuntimeException -> 0x06e5 }
            int r6 = r6.length()     // Catch:{ RuntimeException -> 0x06e5 }
            java.lang.String r7 = java.lang.String.valueOf(r3)     // Catch:{ RuntimeException -> 0x06e5 }
            int r7 = r7.length()     // Catch:{ RuntimeException -> 0x06e5 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x06e5 }
            int r4 = r4 + 13
            int r4 = r4 + r6
            int r4 = r4 + r7
            r8.<init>(r4)     // Catch:{ RuntimeException -> 0x06e5 }
            r8.append(r0)     // Catch:{ RuntimeException -> 0x06e5 }
            java.lang.String r0 = " for "
            r8.append(r0)     // Catch:{ RuntimeException -> 0x06e5 }
            r8.append(r14)     // Catch:{ RuntimeException -> 0x06e5 }
            java.lang.String r0 = " not in "
            r8.append(r0)     // Catch:{ RuntimeException -> 0x06e5 }
            r8.append(r3)     // Catch:{ RuntimeException -> 0x06e5 }
            r8.toString()     // Catch:{ RuntimeException -> 0x06e5 }
            com.google.android.gms.location.reporting.UploadRequestResult r0 = new com.google.android.gms.location.reporting.UploadRequestResult     // Catch:{ RuntimeException -> 0x06e5 }
            r0.<init>(r5, r10)     // Catch:{ RuntimeException -> 0x06e5 }
            goto L_0x06cf
        L_0x052c:
            long r4 = r9.d     // Catch:{ RuntimeException -> 0x06e5 }
            r15 = 0
            int r7 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r7 >= 0) goto L_0x0536
        L_0x0534:
            goto L_0x06aa
        L_0x0536:
            long r4 = r9.e     // Catch:{ RuntimeException -> 0x06e5 }
            int r7 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r7 < 0) goto L_0x0534
            long r4 = r9.c     // Catch:{ RuntimeException -> 0x06e1 }
            int r7 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r7 < 0) goto L_0x0534
            long r3 = defpackage.aztb.E()     // Catch:{ RuntimeException -> 0x06e1 }
            long r6 = r9.c     // Catch:{ RuntimeException -> 0x06e1 }
            int r17 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r17 <= 0) goto L_0x057a
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ RuntimeException -> 0x06e5 }
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch:{ RuntimeException -> 0x06e5 }
            int r5 = r5.length()     // Catch:{ RuntimeException -> 0x06e5 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x06e5 }
            int r5 = r5 + 61
            r6.<init>(r5)     // Catch:{ RuntimeException -> 0x06e5 }
            r6.append(r0)     // Catch:{ RuntimeException -> 0x06e5 }
            java.lang.String r0 = " duration too long, maximum allowed is "
            r6.append(r0)     // Catch:{ RuntimeException -> 0x06e5 }
            r6.append(r3)     // Catch:{ RuntimeException -> 0x06e5 }
            java.lang.String r0 = "ms"
            r6.append(r0)     // Catch:{ RuntimeException -> 0x06e5 }
            r6.toString()     // Catch:{ RuntimeException -> 0x06e5 }
            com.google.android.gms.location.reporting.UploadRequestResult r0 = new com.google.android.gms.location.reporting.UploadRequestResult     // Catch:{ RuntimeException -> 0x06e5 }
            r3 = 2
            r0.<init>(r3, r10)     // Catch:{ RuntimeException -> 0x06e5 }
            goto L_0x06cf
        L_0x057a:
            ajmo r3 = r0.c     // Catch:{ RuntimeException -> 0x06e1 }
            java.util.List r3 = r3.c()     // Catch:{ RuntimeException -> 0x06e1 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ RuntimeException -> 0x06e1 }
            r4 = 0
        L_0x0585:
            boolean r6 = r3.hasNext()     // Catch:{ RuntimeException -> 0x06e1 }
            if (r6 == 0) goto L_0x059c
            java.lang.Object r6 = r3.next()     // Catch:{ RuntimeException -> 0x06e5 }
            ajnb r6 = (defpackage.ajnb) r6     // Catch:{ RuntimeException -> 0x06e5 }
            java.lang.String r6 = r6.d     // Catch:{ RuntimeException -> 0x06e5 }
            boolean r6 = r14.equals(r6)     // Catch:{ RuntimeException -> 0x06e5 }
            if (r6 == 0) goto L_0x0585
            int r4 = r4 + 1
            goto L_0x0585
        L_0x059c:
            long r3 = (long) r4
            aztb r6 = defpackage.aztb.a     // Catch:{ RuntimeException -> 0x06e1 }
            aztc r6 = r6.a()     // Catch:{ RuntimeException -> 0x06e1 }
            long r6 = r6.bh()     // Catch:{ RuntimeException -> 0x06e1 }
            int r17 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r17 < 0) goto L_0x05b3
            com.google.android.gms.location.reporting.UploadRequestResult r0 = new com.google.android.gms.location.reporting.UploadRequestResult     // Catch:{ RuntimeException -> 0x06e5 }
            r3 = 6
            r0.<init>(r3, r10)     // Catch:{ RuntimeException -> 0x06e5 }
            goto L_0x06cf
        L_0x05b3:
            long r3 = r9.c     // Catch:{ RuntimeException -> 0x06e1 }
            int r6 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r6 == 0) goto L_0x061e
            aztb r3 = defpackage.aztb.a     // Catch:{ RuntimeException -> 0x06e1 }
            aztc r3 = r3.a()     // Catch:{ RuntimeException -> 0x06e1 }
            long r3 = r3.bm()     // Catch:{ RuntimeException -> 0x06e1 }
            long r6 = r9.d     // Catch:{ RuntimeException -> 0x06e1 }
            long r10 = r9.e     // Catch:{ RuntimeException -> 0x06e1 }
            int r15 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r15 >= 0) goto L_0x05cc
            goto L_0x05d1
        L_0x05cc:
            int r15 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r15 < 0) goto L_0x05d1
            goto L_0x061e
        L_0x05d1:
            java.lang.String r15 = java.lang.String.valueOf(r9)     // Catch:{ RuntimeException -> 0x06e1 }
            java.lang.String r16 = java.lang.String.valueOf(r15)     // Catch:{ RuntimeException -> 0x06e1 }
            int r16 = r16.length()     // Catch:{ RuntimeException -> 0x06e1 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x06e1 }
            int r8 = r16 + 106
            r5.<init>(r8)     // Catch:{ RuntimeException -> 0x06e1 }
            java.lang.String r8 = "Burst request accepted but latency is too low to be honored, it will be capped at "
            r5.append(r8)     // Catch:{ RuntimeException -> 0x06e1 }
            r5.append(r3)     // Catch:{ RuntimeException -> 0x06e1 }
            java.lang.String r8 = "ms: "
            r5.append(r8)     // Catch:{ RuntimeException -> 0x06e1 }
            r5.append(r15)     // Catch:{ RuntimeException -> 0x06e1 }
            java.lang.String r8 = "GCoreUlr"
            java.lang.String r5 = r5.toString()     // Catch:{ RuntimeException -> 0x06e1 }
            defpackage.ajix.c(r8, r5)     // Catch:{ RuntimeException -> 0x06e1 }
            android.accounts.Account r5 = r9.a     // Catch:{ RuntimeException -> 0x06e1 }
            java.lang.String r8 = r9.b     // Catch:{ RuntimeException -> 0x06e1 }
            long r1 = r9.c     // Catch:{ RuntimeException -> 0x06e1 }
            rmj r15 = new rmj     // Catch:{ RuntimeException -> 0x06e1 }
            r15.<init>(r5, r8, r1)     // Catch:{ RuntimeException -> 0x06e1 }
            long r1 = java.lang.Math.max(r3, r6)     // Catch:{ RuntimeException -> 0x06e1 }
            r15.d = r1     // Catch:{ RuntimeException -> 0x06e1 }
            long r1 = java.lang.Math.max(r3, r10)     // Catch:{ RuntimeException -> 0x06e1 }
            r15.e = r1     // Catch:{ RuntimeException -> 0x06e1 }
            java.lang.String r1 = r9.f     // Catch:{ RuntimeException -> 0x06e1 }
            r15.f = r1     // Catch:{ RuntimeException -> 0x06e1 }
            com.google.android.gms.location.reporting.UploadRequest r1 = new com.google.android.gms.location.reporting.UploadRequest     // Catch:{ RuntimeException -> 0x06e1 }
            r1.<init>(r15)     // Catch:{ RuntimeException -> 0x06e1 }
            goto L_0x0620
        L_0x061e:
            r1 = r9
        L_0x0620:
            android.accounts.Account r2 = r1.a     // Catch:{ RuntimeException -> 0x06e1 }
            ajmm r3 = r0.b     // Catch:{ RuntimeException -> 0x06e1 }
            com.google.android.location.reporting.state.update.AccountConfig r2 = r3.a((android.accounts.Account) r2)     // Catch:{ RuntimeException -> 0x06e1 }
            boolean r3 = defpackage.azth.b()     // Catch:{ RuntimeException -> 0x06e1 }
            if (r3 == 0) goto L_0x064b
            android.content.Context r3 = r0.a     // Catch:{ RuntimeException -> 0x06e1 }
            ajmp r3 = defpackage.ajmp.a((android.content.Context) r3)     // Catch:{ RuntimeException -> 0x06e1 }
            boolean r3 = r3.b()     // Catch:{ RuntimeException -> 0x06e1 }
            if (r3 == 0) goto L_0x064b
            java.lang.String r0 = "GCoreUlr"
            java.lang.String r1 = "Ulr is in private mode. requestUpload is disabled temporarily!"
            defpackage.ajix.a((java.lang.String) r0, (java.lang.String) r1)     // Catch:{ RuntimeException -> 0x06e1 }
            com.google.android.gms.location.reporting.UploadRequestResult r0 = new com.google.android.gms.location.reporting.UploadRequestResult     // Catch:{ RuntimeException -> 0x06e1 }
            r1 = 3
            r2 = -1
            r0.<init>(r1, r2)     // Catch:{ RuntimeException -> 0x06e1 }
            goto L_0x06cf
        L_0x064b:
            boolean r3 = r2.j()     // Catch:{ RuntimeException -> 0x06e1 }
            if (r3 != 0) goto L_0x0688
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ RuntimeException -> 0x06e1 }
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ RuntimeException -> 0x06e1 }
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch:{ RuntimeException -> 0x06e1 }
            int r2 = r2.length()     // Catch:{ RuntimeException -> 0x06e1 }
            java.lang.String r3 = java.lang.String.valueOf(r1)     // Catch:{ RuntimeException -> 0x06e1 }
            int r3 = r3.length()     // Catch:{ RuntimeException -> 0x06e1 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x06e1 }
            int r2 = r2 + 22
            int r2 = r2 + r3
            r4.<init>(r2)     // Catch:{ RuntimeException -> 0x06e1 }
            r4.append(r0)     // Catch:{ RuntimeException -> 0x06e1 }
            java.lang.String r0 = " for inactive account "
            r4.append(r0)     // Catch:{ RuntimeException -> 0x06e1 }
            r4.append(r1)     // Catch:{ RuntimeException -> 0x06e1 }
            r4.toString()     // Catch:{ RuntimeException -> 0x06e1 }
            com.google.android.gms.location.reporting.UploadRequestResult r0 = new com.google.android.gms.location.reporting.UploadRequestResult     // Catch:{ RuntimeException -> 0x06e1 }
            r1 = 3
            r2 = -1
            r0.<init>(r1, r2)     // Catch:{ RuntimeException -> 0x06e1 }
            goto L_0x06cf
        L_0x0688:
            ajmo r15 = r0.c     // Catch:{ RuntimeException -> 0x06e1 }
            r17 = 0
            r16 = r1
            r18 = r12
            r20 = r14
            ajnb r1 = r15.a(r16, r17, r18, r20)     // Catch:{ RuntimeException -> 0x06e1 }
            android.content.Context r0 = r0.a     // Catch:{ RuntimeException -> 0x06e1 }
            java.lang.String r2 = "com.google.android.location.reporting.ACTION_APPLY_UPLOAD_REQUESTS"
            android.content.Intent r2 = defpackage.ajme.a((android.content.Context) r0, (java.lang.String) r2)     // Catch:{ RuntimeException -> 0x06e1 }
            defpackage.ajnw.a((android.content.Context) r0, (android.content.Intent) r2)     // Catch:{ RuntimeException -> 0x06e1 }
            com.google.android.gms.location.reporting.UploadRequestResult r0 = new com.google.android.gms.location.reporting.UploadRequestResult     // Catch:{ RuntimeException -> 0x06e1 }
            long r1 = r1.a     // Catch:{ RuntimeException -> 0x06e1 }
            r3 = 0
            r0.<init>(r3, r1)     // Catch:{ RuntimeException -> 0x06e1 }
            goto L_0x06cf
        L_0x06aa:
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ RuntimeException -> 0x06e1 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ RuntimeException -> 0x06e1 }
            int r1 = r1.length()     // Catch:{ RuntimeException -> 0x06e1 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ RuntimeException -> 0x06e1 }
            int r1 = r1 + 47
            r2.<init>(r1)     // Catch:{ RuntimeException -> 0x06e1 }
            java.lang.String r1 = "Burst request latency or duration is negative: "
            r2.append(r1)     // Catch:{ RuntimeException -> 0x06e1 }
            r2.append(r0)     // Catch:{ RuntimeException -> 0x06e1 }
            r2.toString()     // Catch:{ RuntimeException -> 0x06e1 }
            com.google.android.gms.location.reporting.UploadRequestResult r0 = new com.google.android.gms.location.reporting.UploadRequestResult     // Catch:{ RuntimeException -> 0x06e1 }
            r1 = -1
            r0.<init>(r3, r1)     // Catch:{ RuntimeException -> 0x06e1 }
        L_0x06cf:
            r1 = r21
            java.lang.String r2 = r1.b     // Catch:{ RuntimeException -> 0x06e5 }
            java.lang.String r3 = r1.c     // Catch:{ RuntimeException -> 0x06e5 }
            defpackage.ajjd.a((java.lang.String) r2, (java.lang.String) r3, (com.google.android.gms.location.reporting.UploadRequest) r9, (com.google.android.gms.location.reporting.UploadRequestResult) r0)     // Catch:{ RuntimeException -> 0x06e5 }
            r24.writeNoException()
            r2 = r24
            defpackage.bhx.b(r2, r0)
            goto L_0x072d
        L_0x06e1:
            r0 = move-exception
            r1 = r21
            goto L_0x06e6
        L_0x06e5:
            r0 = move-exception
        L_0x06e6:
            java.lang.String r2 = "GCoreUlr"
            java.lang.String r3 = "original requestUpload() exception (before parcelling)"
            defpackage.ajix.b((java.lang.String) r2, (java.lang.String) r3, (java.lang.Throwable) r0)
            java.lang.String r2 = r1.b
            java.lang.String r3 = r1.c
            com.google.android.gms.location.reporting.UploadRequestResult r4 = new com.google.android.gms.location.reporting.UploadRequestResult
            r5 = -10000000(0xffffffffff676980, float:-3.0759945E38)
            r6 = -1
            r4.<init>(r5, r6)
            defpackage.ajjd.a((java.lang.String) r2, (java.lang.String) r3, (com.google.android.gms.location.reporting.UploadRequest) r9, (com.google.android.gms.location.reporting.UploadRequestResult) r4)
            throw r0
        L_0x06ff:
            android.os.Parcelable$Creator r3 = android.accounts.Account.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r0, (android.os.Parcelable.Creator) r3)
            android.accounts.Account r0 = (android.accounts.Account) r0
            rlx r0 = com.google.android.gms.location.reporting.OptInRequest.a(r0)
            com.google.android.gms.location.reporting.OptInRequest r0 = r0.a()
            r3 = 1
            int r0 = r1.a(r0, r3)
            r24.writeNoException()
            r2.writeInt(r0)
            goto L_0x072d
        L_0x071b:
            android.os.Parcelable$Creator r3 = android.accounts.Account.CREATOR
            android.os.Parcelable r0 = defpackage.bhx.a((android.os.Parcel) r0, (android.os.Parcelable.Creator) r3)
            android.accounts.Account r0 = (android.accounts.Account) r0
            com.google.android.gms.location.reporting.ReportingState r0 = r1.a((android.accounts.Account) r0)
            r24.writeNoException()
            defpackage.bhx.b(r2, r0)
        L_0x072d:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rmn.a(int, android.os.Parcel, android.os.Parcel):boolean");
    }
}
