package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;

/* renamed from: wni  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class wni extends xqg {
    protected wmi a;
    private final wzv b;
    private final String c;
    private final xpp d;
    private amsn e;
    private final boolean f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wni(Context context, String str, int i, wzv wzv, String str2) {
        super(str, i, str2, "GetMe");
        xpp xpp = new xpp(context, 5400);
        this.b = wzv;
        this.c = str2;
        this.d = xpp;
        xip.a();
        boolean booleanValue = Boolean.valueOf(aywy.a.a().ba()).booleanValue();
        this.f = booleanValue;
        if (booleanValue) {
            this.a = new wmi("GetMe");
            this.e = amsn.b(ampt.a);
        }
    }

    private final void a(int i, int i2) {
        if (this.f) {
            this.a.a(wml.b(2, this.e.a(TimeUnit.MICROSECONDS)));
            this.e.e();
            wmi wmi = this.a;
            wmi.b = this.c;
            wmi.c = this.i;
            wmi.a(i2, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01b1, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b2, code lost:
        android.util.Log.e("BasePeopleOperation", "Operation failed remotely.", r0);
        a(0, 10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01bc, code lost:
        if (r4 != false) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01be, code lost:
        a(r2, (java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01c1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01c2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01c3, code lost:
        android.util.Log.e("BasePeopleOperation", "Operation exception when loading info from server.", r0);
        a(0, 9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01cd, code lost:
        if (r4 != false) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01cf, code lost:
        a(r2, (java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01d2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01d3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01d4, code lost:
        android.util.Log.e("BasePeopleOperation", "Auth exception when fetching info from server.", r0);
        a(0, 3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01dd, code lost:
        if (r4 != false) goto L_0x01df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01df, code lost:
        a(r2, (java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b1 A[ExcHandler: RemoteException (r0v4 'e' android.os.RemoteException A[CUSTOM_DECLARE]), Splitter:B:1:0x0037] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b(android.content.Context r20) {
        /*
            r19 = this;
            r1 = r19
            r2 = r20
            java.lang.String r3 = "BasePeopleOperation"
            java.lang.String r0 = r1.c
            com.google.android.gms.common.internal.ClientContext r0 = defpackage.xqw.a(r2, r0)
            defpackage.xip.a()
            aywy r4 = defpackage.aywy.a
            ayxk r4 = r4.a()
            boolean r4 = r4.bc()
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            boolean r4 = r4.booleanValue()
            defpackage.xip.a()
            aywy r5 = defpackage.aywy.a
            ayxk r5 = r5.a()
            boolean r5 = r5.S()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            boolean r5 = r5.booleanValue()
            r6 = 0
            boolean r7 = r1.f     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            if (r7 == 0) goto L_0x0044
            amsn r7 = r1.e     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            long r7 = r7.a((java.util.concurrent.TimeUnit) r8)     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            goto L_0x0046
        L_0x0044:
            r7 = 0
        L_0x0046:
            xpp r9 = r1.d     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            r10 = 1
            java.lang.String[] r11 = new java.lang.String[r10]     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            java.lang.String r12 = "me"
            r11[r6] = r12     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            java.lang.String r12 = "GMS PEOPLE GETME"
            aqvp r13 = defpackage.aqvp.g     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            aucd r13 = r13.o()     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            aqvo r13 = (defpackage.aqvo) r13     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            java.util.List r11 = java.util.Arrays.asList(r11)     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            boolean r14 = r13.c     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            if (r14 != 0) goto L_0x0062
            goto L_0x0067
        L_0x0062:
            r13.c()     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            r13.c = r6     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
        L_0x0067:
            aucj r14 = r13.b     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            aqvp r14 = (defpackage.aqvp) r14     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            r14.a()     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            aucx r14 = r14.a     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            defpackage.auab.a((java.lang.Iterable) r11, (java.util.List) r14)     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            boolean r11 = r13.c     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            if (r11 != 0) goto L_0x0078
            goto L_0x007d
        L_0x0078:
            r13.c()     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            r13.c = r6     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
        L_0x007d:
            aucj r11 = r13.b     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            aqvp r11 = (defpackage.aqvp) r11     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            r14 = 4
            int r14 = defpackage.aqvn.a(r14)     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            r11.e = r14     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            ayxc r11 = defpackage.ayxc.a     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            ayxd r11 = r11.a()     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            boolean r11 = r11.a()     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            if (r11 != 0) goto L_0x0095
            goto L_0x0101
        L_0x0095:
            aqwp r11 = defpackage.aqwp.d     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            aucd r11 = r11.o()     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            aqur r14 = defpackage.aqur.c     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            aucd r14 = r14.o()     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            boolean r15 = r14.c     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            if (r15 != 0) goto L_0x00a6
            goto L_0x00ab
        L_0x00a6:
            r14.c()     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            r14.c = r6     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
        L_0x00ab:
            aucj r15 = r14.b     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            aqur r15 = (defpackage.aqur) r15     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            r12.getClass()     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            r15.a = r12     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            ihs r12 = defpackage.ihs.b()     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            java.lang.String r12 = defpackage.jhg.e((android.content.Context) r12)     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            boolean r15 = r14.c     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            if (r15 != 0) goto L_0x00c1
            goto L_0x00c6
        L_0x00c1:
            r14.c()     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            r14.c = r6     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
        L_0x00c6:
            aucj r15 = r14.b     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            aqur r15 = (defpackage.aqur) r15     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            r12.getClass()     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            r15.b = r12     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            boolean r12 = r11.c     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            if (r12 != 0) goto L_0x00d4
            goto L_0x00d9
        L_0x00d4:
            r11.c()     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            r11.c = r6     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
        L_0x00d9:
            aucj r12 = r11.b     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            aqwp r12 = (defpackage.aqwp) r12     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            aucj r14 = r14.i()     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            aqur r14 = (defpackage.aqur) r14     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            r14.getClass()     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            r12.a = r14     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            boolean r12 = r13.c     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            if (r12 != 0) goto L_0x00ed
            goto L_0x00f2
        L_0x00ed:
            r13.c()     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            r13.c = r6     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
        L_0x00f2:
            aucj r12 = r13.b     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            aqvp r12 = (defpackage.aqvp) r12     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            aucj r11 = r11.i()     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            aqwp r11 = (defpackage.aqwp) r11     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            r11.getClass()     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            r12.d = r11     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
        L_0x0101:
            xpo r9 = r9.b     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            aucj r11 = r13.i()     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            aqvp r11 = (defpackage.aqvp) r11     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            aqvr r0 = r9.a(r0, r11)     // Catch:{ eif -> 0x01a8, babk -> 0x01a6, RemoteException -> 0x01b1 }
            boolean r9 = r1.f     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            if (r9 == 0) goto L_0x0124
            wmi r9 = r1.a     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            amsn r11 = r1.e     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            long r11 = r11.a((java.util.concurrent.TimeUnit) r12)     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            long r11 = r11 - r7
            r7 = 5
            xmc r7 = defpackage.wml.b(r7, r11)     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            r9.a((defpackage.xmc) r7)     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
        L_0x0124:
            r7 = 8
            if (r5 != 0) goto L_0x0129
            goto L_0x014d
        L_0x0129:
            if (r0 != 0) goto L_0x0134
            java.lang.String r0 = "Get people response is null."
            android.util.Log.e(r3, r0)     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            r1.a((int) r6, (int) r7)     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            return
        L_0x0134:
            aucx r8 = r0.a     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            int r8 = r8.size()     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            if (r8 == 0) goto L_0x019d
            aucx r8 = r0.a     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            java.lang.Object r8 = r8.get(r6)     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            aqwr r8 = (defpackage.aqwr) r8     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            aqwr r9 = defpackage.aqwr.c     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            boolean r8 = r8.equals(r9)     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            if (r8 == 0) goto L_0x014d
            goto L_0x019d
        L_0x014d:
            aucx r0 = r0.a     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            aqwr r0 = (defpackage.aqwr) r0     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            amgi r0 = r0.a     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            if (r0 == 0) goto L_0x015a
            goto L_0x015c
        L_0x015a:
            amgi r0 = defpackage.amgi.D     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
        L_0x015c:
            com.google.android.gms.people.protomodel.Person r0 = defpackage.ycq.a((defpackage.amgi) r0)     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            if (r5 != 0) goto L_0x0163
            goto L_0x016e
        L_0x0163:
            if (r0 != 0) goto L_0x016e
            java.lang.String r0 = "Merged person object is null."
            android.util.Log.e(r3, r0)     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            r1.a((int) r6, (int) r7)     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            return
        L_0x016e:
            com.google.android.gms.people.protomodel.PersonEntity r5 = new com.google.android.gms.people.protomodel.PersonEntity     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            r7 = r0
            com.google.android.gms.people.protomodel.PersonEntity r7 = (com.google.android.gms.people.protomodel.PersonEntity) r7     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            java.lang.String r12 = r7.a     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            java.util.List r13 = r0.b()     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            java.util.List r14 = r0.c()     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            java.util.List r15 = r0.d()     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            java.util.List r16 = r0.e()     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            java.util.List r17 = r0.f()     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            r18 = 0
            r11 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            wzv r0 = r1.b     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            xqy r7 = defpackage.xqy.c     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            int r7 = r7.a     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            r0.a((int) r7, (com.google.android.gms.people.protomodel.PersonEntity) r5)     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            r0 = 2
            r1.a((int) r10, (int) r0)     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            return
        L_0x019d:
            java.lang.String r0 = "Not able to get the person object from the get people response."
            android.util.Log.e(r3, r0)     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            r1.a((int) r6, (int) r7)     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            return
        L_0x01a6:
            r0 = move-exception
            goto L_0x01a9
        L_0x01a8:
            r0 = move-exception
        L_0x01a9:
            java.lang.String r5 = "InternalPeopleServiceGrpcClient"
            java.lang.String r7 = "Error making Grpc request."
            android.util.Log.e(r5, r7, r0)     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
            throw r0     // Catch:{ eif -> 0x01d3, babk -> 0x01c2, RemoteException -> 0x01b1 }
        L_0x01b1:
            r0 = move-exception
            java.lang.String r5 = "Operation failed remotely."
            android.util.Log.e(r3, r5, r0)
            r3 = 10
            r1.a((int) r6, (int) r3)
            if (r4 == 0) goto L_0x01e3
            a((android.content.Context) r2, (java.lang.Throwable) r0)
            return
        L_0x01c2:
            r0 = move-exception
            java.lang.String r5 = "Operation exception when loading info from server."
            android.util.Log.e(r3, r5, r0)
            r3 = 9
            r1.a((int) r6, (int) r3)
            if (r4 == 0) goto L_0x01e3
            a((android.content.Context) r2, (java.lang.Throwable) r0)
            return
        L_0x01d3:
            r0 = move-exception
            java.lang.String r5 = "Auth exception when fetching info from server."
            android.util.Log.e(r3, r5, r0)
            r3 = 3
            r1.a((int) r6, (int) r3)
            if (r4 == 0) goto L_0x01e3
            a((android.content.Context) r2, (java.lang.Throwable) r0)
            return
        L_0x01e3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wni.b(android.content.Context):void");
    }

    private static final void a(Context context, Throwable th) {
        ydd a2 = yde.a.a(context);
        xip.a();
        a2.a(th, Double.valueOf(aywy.a.a().bd()).doubleValue());
    }
}
