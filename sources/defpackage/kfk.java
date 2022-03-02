package defpackage;

import android.accounts.Account;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.drive.api.ApiChimeraService;

/* renamed from: kfk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kfk extends nis {
    private static final ith a = new ith("ClientConnectOperation", "");
    private final ApiChimeraService b;
    private final nix c;
    private final kee d;
    private final int e;
    private final String f;
    private final String g;
    private final Account h;
    private final Account i;
    private final String[] j;
    private final nit k;
    private final int l;
    private final lfq o;
    private final int p;
    private final boolean q;
    private final String r;
    private final long s = SystemClock.uptimeMillis();
    private final krg t;
    private final boolean u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kfk(ApiChimeraService apiChimeraService, nix nix, kee kee, int i2, String str, String str2, Account account, Account account2, String[] strArr, nit nit, int i3, lfq lfq, int i4, boolean z, String str3) {
        super(11, "ClientConnectOperation");
        boolean z2;
        int i5;
        nit nit2 = nit;
        int i6 = i4;
        this.b = apiChimeraService;
        this.c = nix;
        this.d = kee;
        iva.c(str);
        this.f = str;
        this.g = str2;
        this.h = account;
        this.i = account2;
        this.j = strArr;
        this.k = nit2;
        this.l = i3;
        this.o = lfq;
        this.p = i6;
        this.q = z;
        this.r = str3;
        this.t = new krg();
        if (!hya.a(lsm.a().b).b(this.f) || TextUtils.isEmpty(this.g) || this.f.equals(this.g)) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.u = z2;
        if (z2) {
            try {
                i5 = jni.b(lsm.a().b).b(str2, 0).applicationInfo.uid;
            } catch (PackageManager.NameNotFoundException e2) {
                nit2.a(8, (Bundle) null);
                String valueOf = String.valueOf(str2);
                throw new kfj(valueOf.length() == 0 ? new String("Bad package name: ") : "Bad package name: ".concat(valueOf), e2);
            }
        } else {
            i5 = i2;
        }
        this.e = i5;
        if (!this.u) {
            if (i6 != 0) {
                this.k.a(10, (Bundle) null);
                StringBuilder sb = new StringBuilder(76);
                sb.append("Proxied package name has not been provided but proxyType is set: ");
                sb.append(i6);
                throw new kfj(sb.toString());
            }
        } else if (i6 == 0) {
            this.k.a(10, (Bundle) null);
            String valueOf2 = String.valueOf(str2);
            throw new kfj(valueOf2.length() == 0 ? new String("ProxyType is NO_PROXY but proxied package name has been provided: ") : "ProxyType is NO_PROXY but proxied package name has been provided: ".concat(valueOf2));
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x040d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0416, code lost:
        throw new defpackage.khk("See https://developers.google.com/drive/android/auth for details on authorizing an application.", (java.lang.Exception) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0417, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0418, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0422, code lost:
        throw new defpackage.khk((java.lang.Exception) r2, r2.a());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0423, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0425, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0426, code lost:
        r16 = "pendingIntent";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0428, code lost:
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x044f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0462, code lost:
        r2 = new android.os.Bundle();
        r2.putParcelable(r16, android.app.PendingIntent.getActivity(r6, 0, r7, r7.getFlags()));
        r1.k.a(4, r2);
        r8 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0481, code lost:
        if (r2.getCause() == null) goto L_0x049c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0493, code lost:
        r1.k.a(7, (android.os.Bundle) null);
        r8 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x049c, code lost:
        r1.k.a(8, (android.os.Bundle) null);
        r8 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        if (defpackage.axeb.a.a().c() != false) goto L_0x0060;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x029c A[Catch:{ khk -> 0x0425, kfj -> 0x0454 }] */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x029d A[Catch:{ khk -> 0x0425, kfj -> 0x0454 }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x032c A[Catch:{ khk -> 0x0425, kfj -> 0x0454 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x032d A[Catch:{ khk -> 0x0425, kfj -> 0x0454 }] */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x034d A[Catch:{ khk -> 0x0425, kfj -> 0x0454 }] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0350 A[Catch:{ khk -> 0x0425, kfj -> 0x0454 }] */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x0454 A[ExcHandler: kfj (e kfj), Splitter:B:67:0x01ad] */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0462 A[Catch:{ all -> 0x0451 }] */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x047d A[Catch:{ all -> 0x0451 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0087 A[Catch:{ khk -> 0x004b, kfj -> 0x0454 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0089 A[Catch:{ khk -> 0x004b, kfj -> 0x0454 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x008f A[Catch:{ khk -> 0x004b, kfj -> 0x0454 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0093 A[Catch:{ khk -> 0x004b, kfj -> 0x0454 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012b A[Catch:{ khk -> 0x004b, kfj -> 0x0454 }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x015b A[Catch:{ khk -> 0x004b, kfj -> 0x0454 }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01b5 A[SYNTHETIC, Splitter:B:71:0x01b5] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0203 A[SYNTHETIC, Splitter:B:93:0x0203] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.content.Context r28) {
        /*
            r27 = this;
            r1 = r27
            r2 = r28
            java.lang.String r3 = "pendingIntent"
            lfq r4 = r1.o
            lfm r4 = r4.d()
            lfq r5 = r1.o
            lfj r5 = r5.b()
            int r6 = r1.p
            r5.a((int) r6)
            boolean r6 = r1.u
            if (r6 != 0) goto L_0x001e
            java.lang.String r6 = r1.f
            goto L_0x0020
        L_0x001e:
            java.lang.String r6 = r1.g
        L_0x0020:
            r5.a((java.lang.String) r6)
            r10 = 1
            r11 = 0
            krg r12 = r1.t     // Catch:{ khk -> 0x0457, kfj -> 0x0454 }
            java.lang.String r13 = r1.f     // Catch:{ khk -> 0x0457, kfj -> 0x0454 }
            java.lang.String r14 = r1.g     // Catch:{ khk -> 0x0457, kfj -> 0x0454 }
            java.lang.String r15 = "com.google.android.gms"
            boolean r15 = r15.equals(r13)     // Catch:{ khk -> 0x0457, kfj -> 0x0454 }
            r8 = 16
            if (r15 != 0) goto L_0x0052
            krf r12 = r12.a(r13)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            if (r12 != 0) goto L_0x0046
            axeb r12 = defpackage.axeb.a     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            axec r12 = r12.a()     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            boolean r12 = r12.g()     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            goto L_0x0048
        L_0x0046:
            boolean r12 = r12.a     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
        L_0x0048:
            if (r12 == 0) goto L_0x01ad
            goto L_0x0060
        L_0x004b:
            r0 = move-exception
            r2 = r0
            r16 = r3
        L_0x004f:
            r3 = 1
            goto L_0x045c
        L_0x0052:
            if (r14 == 0) goto L_0x01ad
            axeb r12 = defpackage.axeb.a     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            axec r12 = r12.a()     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            boolean r12 = r12.c()     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            if (r12 == 0) goto L_0x01ad
        L_0x0060:
            krg r12 = r1.t     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            nit r13 = r1.k     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            java.lang.String r14 = r1.f     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            krf r12 = r12.a(r14)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            if (r12 == 0) goto L_0x0196
            boolean r8 = r12.b     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            if (r8 == 0) goto L_0x0080
            boolean r8 = r12.d     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            if (r8 != 0) goto L_0x007e
            java.util.Set r8 = defpackage.krg.a     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            boolean r8 = r8.add(r14)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            if (r8 == 0) goto L_0x0080
            r8 = 1
            goto L_0x0081
        L_0x007e:
            r8 = 1
            goto L_0x0081
        L_0x0080:
            r8 = 0
        L_0x0081:
            if (r8 == 0) goto L_0x0089
            boolean r6 = r12.c     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            if (r6 == 0) goto L_0x0089
            r6 = 1
            goto L_0x008a
        L_0x0089:
            r6 = 0
        L_0x008a:
            r7 = 2131952524(0x7f13038c, float:1.9541493E38)
            if (r8 != 0) goto L_0x0093
            r19 = r6
            goto L_0x0121
        L_0x0093:
            if (r6 != 0) goto L_0x011f
            java.lang.String r8 = defpackage.krg.a(r14, r2)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            if (r8 == 0) goto L_0x011c
            android.content.res.Resources r15 = r28.getResources()     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            java.lang.Object[] r9 = new java.lang.Object[r10]     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r9[r11] = r8     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            java.lang.String r9 = r15.getString(r7, r9)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            boolean r7 = r12.e     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            if (r7 == 0) goto L_0x00b7
            java.lang.Object[] r7 = new java.lang.Object[r10]     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r7[r11] = r8     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r8 = 2131952522(0x7f13038a, float:1.954149E38)
            java.lang.String r7 = r15.getString(r8, r7)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            goto L_0x00c2
        L_0x00b7:
            java.lang.Object[] r7 = new java.lang.Object[r10]     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r7[r11] = r8     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r8 = 2131952521(0x7f130389, float:1.9541487E38)
            java.lang.String r7 = r15.getString(r8, r7)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
        L_0x00c2:
            r8 = 2131952523(0x7f13038b, float:1.9541491E38)
            java.lang.String r8 = r15.getString(r8)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            android.content.Intent r15 = defpackage.itg.b(r14)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            android.app.PendingIntent r15 = android.app.PendingIntent.getActivity(r2, r11, r15, r11)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            iwq r11 = defpackage.iwq.a((android.content.Context) r28)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            if (r11 == 0) goto L_0x0119
            je r10 = new je     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r19 = r6
            java.lang.String r6 = "updateDialogNotificationChannelId"
            r10.<init>(r2, r6)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r10.e(r9)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r10.b((java.lang.CharSequence) r7)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            jd r6 = new jd     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r6.<init>()     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r6.a((java.lang.CharSequence) r7)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r10.a((defpackage.jh) r6)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r6 = 2131232048(0x7f080530, float:1.8080194E38)
            int r6 = defpackage.hdg.a(r2, r6)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r10.b((int) r6)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r6 = 2131232041(0x7f080529, float:1.808018E38)
            r10.a((int) r6, (java.lang.CharSequence) r8, (android.app.PendingIntent) r15)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r10.f = r15     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r6 = 1
            r10.a((boolean) r6)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r10.c()     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r6 = 0
            r10.j = r6     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            android.app.Notification r6 = r10.b()     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            int r7 = r14.hashCode()     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r11.a((int) r7, (android.app.Notification) r6)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            goto L_0x0121
        L_0x0119:
            r19 = r6
            goto L_0x0121
        L_0x011c:
            r19 = r6
            goto L_0x0121
        L_0x011f:
            r19 = r6
        L_0x0121:
            java.lang.String r6 = defpackage.krg.a(r14, r2)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            android.content.res.Resources r7 = r28.getResources()     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            if (r6 == 0) goto L_0x015b
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r8 = 0
            r9[r8] = r6     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r8 = 2131952524(0x7f13038c, float:1.9541493E38)
            java.lang.String r8 = r7.getString(r8, r9)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            boolean r9 = r12.e     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            if (r9 == 0) goto L_0x014a
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r9 = 0
            r10[r9] = r6     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r6 = 2131952522(0x7f13038a, float:1.954149E38)
            java.lang.String r6 = r7.getString(r6, r10)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            goto L_0x0157
        L_0x014a:
            r9 = 1
            java.lang.Object[] r10 = new java.lang.Object[r9]     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r9 = 0
            r10[r9] = r6     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r6 = 2131952521(0x7f130389, float:1.9541487E38)
            java.lang.String r6 = r7.getString(r6, r10)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
        L_0x0157:
            r7 = r6
            r6 = r19
            goto L_0x015e
        L_0x015b:
            r6 = 0
            r7 = 0
            r8 = 0
        L_0x015e:
            android.content.Intent r9 = new android.content.Intent     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r9.<init>()     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            java.lang.String r10 = "com.google.android.gms.drive.deprecation.UpgradeDialogActivity"
            android.content.Intent r9 = r9.setClassName(r2, r10)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            java.lang.String r10 = "callingPackage"
            android.content.Intent r9 = r9.putExtra(r10, r14)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            java.lang.String r10 = "dialogTitle"
            android.content.Intent r8 = r9.putExtra(r10, r8)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            java.lang.String r9 = "dialogMessage"
            android.content.Intent r7 = r8.putExtra(r9, r7)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            java.lang.String r8 = "showDialog"
            android.content.Intent r6 = r7.putExtra(r8, r6)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r7 = 134217728(0x8000000, float:3.85186E-34)
            r8 = 0
            android.app.PendingIntent r2 = android.app.PendingIntent.getActivity(r2, r8, r6, r7)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r6.<init>()     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r6.putParcelable(r3, r2)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r2 = 6
            r13.a((int) r2, (android.os.Bundle) r6)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r8 = 6
            goto L_0x019b
        L_0x0196:
            r2 = 0
            r13.a((int) r8, (android.os.Bundle) r2)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
        L_0x019b:
            r4.b(r8)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
        L_0x019e:
            r4.a()
            r5.a()
            lfq r2 = r1.o
            r2.h()
            r2.a()
            return
        L_0x01ad:
            boolean r2 = defpackage.jix.a((android.content.Context) r28)     // Catch:{ khk -> 0x0457, kfj -> 0x0454 }
            java.lang.String r6 = "ClientConnectOperation"
            if (r2 == 0) goto L_0x01ff
            android.accounts.Account r2 = r1.i     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            if (r2 == 0) goto L_0x01ff
            java.lang.String r7 = "cn.google"
            java.lang.String r2 = r2.type     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            boolean r2 = r7.equals(r2)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            if (r2 == 0) goto L_0x01ff
            java.lang.String[] r2 = r1.j     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            java.lang.String r7 = "https://www.googleapis.com/auth/drive.appdata"
            boolean r2 = defpackage.jhx.a((java.lang.String[]) r2, (java.lang.String) r7)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            if (r2 != 0) goto L_0x01ce
            goto L_0x01f1
        L_0x01ce:
            r2 = 0
        L_0x01cf:
            java.lang.String[] r7 = r1.j     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            int r9 = r7.length     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            if (r2 >= r9) goto L_0x01ff
            r7 = r7[r2]     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            java.lang.String r9 = "https://www.googleapis.com/auth/drive.apps"
            boolean r9 = r9.equalsIgnoreCase(r7)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            if (r9 != 0) goto L_0x01f1
            java.lang.String r9 = "https://www.googleapis.com/auth/drive.file"
            boolean r9 = r9.equalsIgnoreCase(r7)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            if (r9 != 0) goto L_0x01f1
            java.lang.String r9 = "https://www.googleapis.com/auth/drive"
            boolean r7 = r9.equalsIgnoreCase(r7)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            if (r7 != 0) goto L_0x01f1
            int r2 = r2 + 1
            goto L_0x01cf
        L_0x01f1:
            ith r2 = a     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            java.lang.String r7 = "Blocking Sidewinder in Drive connection"
            r2.c((java.lang.String) r6, (java.lang.String) r7)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            nit r2 = r1.k     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r6 = 0
            r2.a((int) r8, (android.os.Bundle) r6)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            goto L_0x019e
        L_0x01ff:
            java.lang.String r2 = r1.r     // Catch:{ khk -> 0x0457, kfj -> 0x0454 }
            if (r2 == 0) goto L_0x0283
            java.io.File r2 = new java.io.File     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            java.io.File r7 = android.os.Environment.getExternalStorageDirectory()     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            java.lang.String r8 = java.lang.String.valueOf(r7)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            int r8 = r8.length()     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r9 = 7
            int r8 = r8 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r9.<init>(r8)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r9.append(r7)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            java.lang.String r7 = "/traces"
            r9.append(r7)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            java.lang.String r7 = r9.toString()     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r2.<init>(r7)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            boolean r7 = r2.exists()     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            if (r7 == 0) goto L_0x0232
            goto L_0x024a
        L_0x0232:
            boolean r7 = r2.mkdir()     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            if (r7 != 0) goto L_0x024a
            ith r7 = a     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r8 = 1
            java.lang.Object[] r9 = new java.lang.Object[r8]     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r8 = 0
            r9[r8] = r2     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            java.lang.String r2 = "Tried to start method trace but was unable to create file: %s"
            r7.b((java.lang.String) r6, (java.lang.String) r2, (java.lang.Object[]) r9)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            goto L_0x0283
        L_0x024a:
            int r7 = android.os.Build.VERSION.SDK_INT     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            java.lang.String r2 = r2.getAbsolutePath()     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            java.lang.String r7 = r1.r     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            java.lang.String r8 = java.lang.String.valueOf(r2)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            int r8 = r8.length()     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r9 = 1
            int r8 = r8 + r9
            java.lang.String r9 = java.lang.String.valueOf(r7)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            int r9 = r9.length()     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            int r8 = r8 + r9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r9.<init>(r8)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r9.append(r2)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            java.lang.String r2 = "/"
            r9.append(r2)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r9.append(r7)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            java.lang.String r2 = r9.toString()     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r7 = 67108864(0x4000000, float:1.5046328E-36)
            r8 = 1000(0x3e8, float:1.401E-42)
            android.os.Debug.startMethodTracingSampling(r2, r7, r8)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r26 = 1
            goto L_0x0285
        L_0x0283:
            r26 = 0
        L_0x0285:
            long r7 = android.os.SystemClock.uptimeMillis()     // Catch:{ khk -> 0x0457, kfj -> 0x0454 }
            com.google.android.gms.drive.api.ApiChimeraService r2 = r1.b     // Catch:{ InterruptedException -> 0x042b }
            boolean r2 = defpackage.jzk.b(r2)     // Catch:{ InterruptedException -> 0x042b }
            r4.a((boolean) r2)     // Catch:{ InterruptedException -> 0x042b }
            long r9 = android.os.SystemClock.uptimeMillis()     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            android.accounts.Account r2 = r1.i     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            r6 = 2
            r11 = 5
            if (r2 == 0) goto L_0x029d
            goto L_0x030b
        L_0x029d:
            boolean r2 = r1.u     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            if (r2 != 0) goto L_0x02a4
            java.lang.String r2 = r1.f     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            goto L_0x02a6
        L_0x02a4:
            java.lang.String r2 = r1.g     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
        L_0x02a6:
            android.accounts.Account r12 = r1.h     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            lsm r13 = defpackage.lsm.a()     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            android.content.Context r13 = r13.b     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            android.accounts.Account r12 = defpackage.jgu.a((android.content.Context) r13, (android.accounts.Account) r12, (java.lang.String) r2)     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            if (r12 != 0) goto L_0x030a
            android.accounts.Account r7 = r1.h     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            if (r7 == 0) goto L_0x02bb
            java.lang.String r7 = r7.name     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            goto L_0x02bc
        L_0x02bb:
            r7 = 0
        L_0x02bc:
            java.lang.String r8 = "<<default account>>"
            boolean r7 = r8.equals(r7)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            if (r7 == 0) goto L_0x02f9
            java.lang.String[] r6 = r1.j     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            java.util.Set r6 = defpackage.jkx.a((java.lang.String[]) r6)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            java.lang.String[] r7 = r1.j     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            int r7 = r7.length     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            com.google.android.gms.common.api.Scope[] r7 = new com.google.android.gms.common.api.Scope[r7]     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            java.lang.Object[] r6 = r6.toArray(r7)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            com.google.android.gms.common.api.Scope[] r6 = (com.google.android.gms.common.api.Scope[]) r6     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r7 = 1
            android.content.Intent r2 = defpackage.itg.a((java.lang.String) r2, (com.google.android.gms.common.api.Scope[]) r6, (boolean) r7)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            com.google.android.gms.drive.api.ApiChimeraService r6 = r1.b     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            android.content.Context r6 = r6.getApplicationContext()     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r7 = 134217728(0x8000000, float:3.85186E-34)
            r8 = 0
            android.app.PendingIntent r2 = android.app.PendingIntent.getActivity(r6, r8, r2, r7)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r6.<init>()     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r6.putParcelable(r3, r2)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            nit r2 = r1.k     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r7 = 4
            r2.a((int) r7, (android.os.Bundle) r6)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r4.b(r7)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            goto L_0x0302
        L_0x02f9:
            nit r2 = r1.k     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r7 = 0
            r2.a((int) r11, (android.os.Bundle) r7)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            r4.b(r6)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
        L_0x0302:
            kfj r2 = new kfj     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            java.lang.String r6 = "Unable to resolve account name."
            r2.<init>(r6)     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
            throw r2     // Catch:{ khk -> 0x004b, kfj -> 0x0454 }
        L_0x030a:
            r2 = r12
        L_0x030b:
            lfq r12 = r1.o     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            java.lang.String r13 = r2.name     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            r12.a((java.lang.String) r13)     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            int r13 = r1.l     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            r12.a((int) r13)     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            long r12 = android.os.SystemClock.uptimeMillis()     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            com.google.android.gms.common.internal.ClientContext r14 = new com.google.android.gms.common.internal.ClientContext     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            r14.<init>()     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            int r15 = r1.e     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            r14.b = r15     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            java.lang.String r15 = r1.f     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            r14.e = r15     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            boolean r11 = r1.u     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            if (r11 != 0) goto L_0x032d
            goto L_0x032f
        L_0x032d:
            java.lang.String r15 = r1.g     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
        L_0x032f:
            r14.f = r15     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            android.accounts.Account r11 = r1.h     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            r14.d = r11     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            r14.c = r2     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            java.lang.String[] r2 = r1.j     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            r14.a((java.lang.String[]) r2)     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            kec r2 = new kec     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            int r11 = r1.l     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            int r15 = r1.p     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            lsm r6 = defpackage.lsm.a()     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            r2.<init>(r14, r11, r15, r6)     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            boolean r6 = r1.q     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            if (r6 == 0) goto L_0x0350
            r16 = r3
            goto L_0x0391
        L_0x0350:
            lsm r6 = defpackage.lsm.a()     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            kkf r6 = r6.d     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            lsm r11 = defpackage.lsm.a()     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            ley r11 = r11.j     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            khq r14 = r2.d     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            java.util.Set r15 = r14.e     // Catch:{ khk -> 0x0425, kfj -> 0x0454 }
            r16 = r3
            jzl r3 = defpackage.jzl.APPDATA     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            boolean r3 = r15.contains(r3)     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            r15 = 101(0x65, float:1.42E-43)
            if (r3 == 0) goto L_0x0380
            kmd r3 = r6.c((defpackage.khq) r14)     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            java.lang.String r6 = "Connected App does not exist"
            defpackage.iva.a((java.lang.Object) r3, (java.lang.Object) r6)     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            java.lang.Boolean r3 = r3.e     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            boolean r3 = r3.booleanValue()     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            if (r3 == 0) goto L_0x0380
            r15 = 102(0x66, float:1.43E-43)
            goto L_0x0381
        L_0x0380:
        L_0x0381:
            kkz r3 = r14.a     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            java.lang.String r3 = r3.a     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            com.google.android.gms.drive.auth.AppIdentity r6 = r14.c     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            java.lang.String r6 = r6.b     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            java.util.List r6 = java.util.Collections.singletonList(r6)     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            r14 = 2
            r11.a((java.lang.String) r3, (int) r15, (int) r14, (java.util.List) r6)     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
        L_0x0391:
            kee r3 = r1.d     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            com.google.android.gms.drive.api.ApiChimeraService r6 = r1.b     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            nix r11 = r1.c     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            nit r14 = r1.k     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            kef r15 = new kef     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            r17 = r12
            kdx r12 = r3.a     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            kei r3 = r3.b     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            r19 = r15
            r20 = r6
            r21 = r11
            r22 = r2
            r23 = r12
            r24 = r3
            r25 = r14
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            isv r3 = r14.a     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            android.os.IBinder r3 = r3.asBinder()     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            r6 = 0
            r3.linkToDeath(r15, r6)     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            nit r3 = r1.k     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            android.os.Bundle r6 = new android.os.Bundle     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            r6.<init>()     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            java.lang.String r11 = "com.google.android.gms.drive.root_id"
            com.google.android.gms.drive.DriveId r12 = r2.b()     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            r6.putParcelable(r11, r12)     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            java.lang.String r11 = "com.google.android.gms.drive.appdata_id"
            com.google.android.gms.drive.DriveId r12 = r2.c()     // Catch:{ UserRecoverableAuthException -> 0x0417, eif -> 0x040d }
            r6.putParcelable(r11, r12)     // Catch:{ UserRecoverableAuthException -> 0x0417, eif -> 0x040d }
            r3.a((defpackage.niz) r15, (android.os.Bundle) r6)     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            khq r3 = r2.d     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            java.lang.String r6 = r3.b     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            r5.b(r6)     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            long r11 = android.os.SystemClock.uptimeMillis()     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            java.util.Set r3 = r3.e     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            r4.a((java.util.Set) r3)     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            khl r2 = r2.s     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            r4.a((defpackage.khl) r2)     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            long r2 = r1.s     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            long r2 = r7 - r2
            int r3 = (int) r2     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            r4.e(r3)     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            long r2 = r9 - r7
            int r3 = (int) r2     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            r4.d(r3)     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            long r2 = r17 - r9
            int r3 = (int) r2     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            r4.a((int) r3)     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            long r11 = r11 - r17
            int r2 = (int) r11     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            r4.c(r2)     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            r2 = 5
            r4.b(r2)     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            goto L_0x019e
        L_0x040d:
            r0 = move-exception
            r2 = r0
            khk r3 = new khk     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            java.lang.String r6 = "See https://developers.google.com/drive/android/auth for details on authorizing an application."
            r3.<init>((java.lang.String) r6, (java.lang.Exception) r2)     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            throw r3     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
        L_0x0417:
            r0 = move-exception
            r2 = r0
            khk r3 = new khk     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            android.content.Intent r6 = r2.a()     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            r3.<init>((java.lang.Exception) r2, (android.content.Intent) r6)     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
            throw r3     // Catch:{ khk -> 0x0423, kfj -> 0x0454 }
        L_0x0423:
            r0 = move-exception
            goto L_0x0428
        L_0x0425:
            r0 = move-exception
            r16 = r3
        L_0x0428:
            r2 = r0
            goto L_0x004f
        L_0x042b:
            r0 = move-exception
            r16 = r3
            r2 = r0
            ith r3 = a     // Catch:{ khk -> 0x044f, kfj -> 0x0454 }
            java.lang.String r7 = "Interrupted while awaiting initialization"
            r3.c((java.lang.String) r6, (java.lang.String) r7)     // Catch:{ khk -> 0x044f, kfj -> 0x0454 }
            nit r3 = r1.k     // Catch:{ khk -> 0x044f, kfj -> 0x0454 }
            r6 = 8
            r7 = 0
            r3.a((int) r6, (android.os.Bundle) r7)     // Catch:{ khk -> 0x044f, kfj -> 0x0454 }
            r3 = 1
            r4.a((boolean) r3)     // Catch:{ khk -> 0x044d, kfj -> 0x0454 }
            r4.b(r3)     // Catch:{ khk -> 0x044d, kfj -> 0x0454 }
            kfj r6 = new kfj     // Catch:{ khk -> 0x044d, kfj -> 0x0454 }
            java.lang.String r7 = "Unable to initialize Drive API."
            r6.<init>(r7, r2)     // Catch:{ khk -> 0x044d, kfj -> 0x0454 }
            throw r6     // Catch:{ khk -> 0x044d, kfj -> 0x0454 }
        L_0x044d:
            r0 = move-exception
            goto L_0x045b
        L_0x044f:
            r0 = move-exception
            goto L_0x045a
        L_0x0451:
            r0 = move-exception
            r2 = r0
            goto L_0x04aa
        L_0x0454:
            r0 = move-exception
            goto L_0x019e
        L_0x0457:
            r0 = move-exception
            r16 = r3
        L_0x045a:
            r3 = 1
        L_0x045b:
            r2 = r0
        L_0x045c:
            com.google.android.gms.drive.api.ApiChimeraService r6 = r1.b     // Catch:{ all -> 0x0451 }
            android.content.Intent r7 = r2.a     // Catch:{ all -> 0x0451 }
            if (r7 == 0) goto L_0x047d
            android.os.Bundle r2 = new android.os.Bundle     // Catch:{ all -> 0x0451 }
            r2.<init>()     // Catch:{ all -> 0x0451 }
            int r3 = r7.getFlags()     // Catch:{ all -> 0x0451 }
            r8 = 0
            android.app.PendingIntent r3 = android.app.PendingIntent.getActivity(r6, r8, r7, r3)     // Catch:{ all -> 0x0451 }
            r6 = r16
            r2.putParcelable(r6, r3)     // Catch:{ all -> 0x0451 }
            nit r3 = r1.k     // Catch:{ all -> 0x0451 }
            r6 = 4
            r3.a((int) r6, (android.os.Bundle) r2)     // Catch:{ all -> 0x0451 }
            r8 = 4
            goto L_0x04a5
        L_0x047d:
            java.lang.Throwable r6 = r2.getCause()     // Catch:{ all -> 0x0451 }
            if (r6 == 0) goto L_0x049c
            java.lang.Throwable r2 = r2.getCause()     // Catch:{ all -> 0x0451 }
            java.lang.Class r2 = r2.getClass()     // Catch:{ all -> 0x0451 }
            java.lang.Class<com.android.volley.VolleyError> r6 = com.android.volley.VolleyError.class
            boolean r2 = r2.equals(r6)     // Catch:{ all -> 0x0451 }
            if (r2 == 0) goto L_0x049c
            nit r2 = r1.k     // Catch:{ all -> 0x0451 }
            r3 = 7
            r6 = 0
            r2.a((int) r3, (android.os.Bundle) r6)     // Catch:{ all -> 0x0451 }
            r8 = 3
            goto L_0x04a5
        L_0x049c:
            nit r2 = r1.k     // Catch:{ all -> 0x0451 }
            r6 = 8
            r7 = 0
            r2.a((int) r6, (android.os.Bundle) r7)     // Catch:{ all -> 0x0451 }
            r8 = 1
        L_0x04a5:
            r4.b(r8)     // Catch:{ all -> 0x0451 }
            goto L_0x019e
        L_0x04aa:
            r4.a()
            r5.a()
            lfq r3 = r1.o
            r3.h()
            r3.a()
            goto L_0x04ba
        L_0x04b9:
            throw r2
        L_0x04ba:
            goto L_0x04b9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kfk.a(android.content.Context):void");
    }

    public final void a(Status status) {
        a.c("ClientConnectOperation", "Handling failure");
        this.k.a(status.i, (Bundle) null);
    }
}
