package com.google.android.gms.auth.uiflows.addaccount;

import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.UserManager;
import com.google.android.gms.R;
import com.google.android.gms.auth.account.be.UpdateHideDmNotificationsIntentOperation;
import com.google.android.gms.auth.firstparty.shared.D2dOptions;
import com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions;
import com.google.android.gms.auth.setup.d2d.SmartDeviceChimeraActivity;
import com.google.android.gms.auth.uiflows.controller.Controller;
import com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AddAccountController implements Controller {
    public static final Parcelable.Creator CREATOR = new gla();
    static final fzk a = fzk.a("intentionally_canceled");
    private static final iwd c = ehv.a("AddAccount", "AddAccountController");
    private static final int d = R.anim.sud_slide_next_in;
    private static final int e = R.anim.sud_slide_next_out;
    private static final int f = R.anim.sud_slide_back_in;
    private static final int g = R.anim.sud_slide_back_out;
    private static final List h = Arrays.asList(new String[]{"com.android.settings", "com.android.vending"});
    private static final fzk i = fzk.a("token_handle");
    private final boolean A;
    private final boolean B;
    private final boolean C;
    private final ManagedAuthOptions D;
    private final D2dOptions E;
    private boolean F;
    private Intent G;
    private Account H;
    private boolean I;
    private Intent J;
    private String K = null;
    private boolean L;
    private boolean M;
    private boolean N;
    private String O;
    boolean b;
    private final Context j = ihs.b();
    private final fzo k;
    private final glm l;
    private final AccountAuthenticatorResponse m;
    private final String n;
    private final String o;
    private final boolean p;
    private final boolean q;
    private final ijn r;
    private final boolean s;
    private final boolean t;
    private final String u;
    private final String v;
    private final String w;
    private final String[] x;
    private final boolean y;
    private final String z;

    public AddAccountController(fzo fzo, glm glm, AccountAuthenticatorResponse accountAuthenticatorResponse, String str, boolean z2, boolean z3, ijn ijn, boolean z4, String str2, String str3, String str4, String[] strArr, String str5, String str6, boolean z5, boolean z6, Intent intent, Account account, boolean z7, Intent intent2, String str7, boolean z8, boolean z9, boolean z10, String str8, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, ManagedAuthOptions managedAuthOptions, D2dOptions d2dOptions) {
        this.k = fzo;
        this.l = glm;
        this.m = accountAuthenticatorResponse;
        this.n = str;
        this.p = z2;
        this.r = ijn;
        this.q = z3;
        this.s = z4;
        this.u = str2;
        this.v = str3;
        this.w = str4;
        this.x = strArr;
        this.o = str5;
        this.z = str6;
        this.A = z12;
        this.t = z13;
        this.y = z5;
        this.F = z6;
        this.G = intent;
        this.H = account;
        this.I = z7;
        this.J = intent2;
        this.K = str7;
        this.L = z8;
        this.M = z9;
        this.N = z10;
        this.O = str8;
        this.b = z11;
        this.B = z14;
        this.C = z15;
        this.D = managedAuthOptions;
        this.E = d2dOptions;
    }

    private final Intent a(String str) {
        Bundle bundle;
        fzl fzl = new fzl();
        fzl.b(gmz.j, Boolean.valueOf(this.q));
        fzk fzk = gmz.i;
        ijn ijn = this.r;
        if (ijn != null) {
            bundle = ijn.a();
        } else {
            bundle = null;
        }
        fzl.b(fzk, bundle);
        if (this.p) {
            fzl.b(ErrorChimeraActivity.e, true);
        } else if (!jjd.a(awiw.b())) {
            fzl.b(ErrorChimeraActivity.c, 4);
        }
        return ErrorChimeraActivity.a(this.j, str).putExtras(fzl.a);
    }

    private final gnw b(int i2) {
        return b(70, RemoveAccountChimeraActivity.a(this.j, this.H, i2, this.q, this.r));
    }

    private final Intent c(int i2) {
        return a(this.j.getString(i2));
    }

    private final Intent d() {
        String str;
        D2dOptions d2dOptions = this.E;
        boolean z2 = d2dOptions != null && d2dOptions.a && d2dOptions.b;
        if ((this.F && !z2) || this.s || !this.p || !jkr.c()) {
            return null;
        }
        Context context = this.j;
        String str2 = this.r.a;
        boolean z3 = this.q;
        boolean z4 = this.p;
        D2dOptions d2dOptions2 = this.E;
        if (!((Boolean) SmartDeviceChimeraActivity.h.c()).booleanValue()) {
            SmartDeviceChimeraActivity.e.c("Skipping TargetActivity. Reason: Tap & Go V2 disabled through gservices", new Object[0]);
            return null;
        }
        int i2 = Build.VERSION.SDK_INT;
        if (BluetoothAdapter.getDefaultAdapter() == null) {
            SmartDeviceChimeraActivity.e.d("Skipping TargetActivity. Reason: Bluetooth not available.", new Object[0]);
            return null;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (((UserManager) context.getSystemService("user")).getSerialNumberForUser(Process.myUserHandle()) != 0) {
            SmartDeviceChimeraActivity.e.d("Skipping TargetActivity. Reason: Not primary user.", new Object[0]);
            return null;
        } else if (acqb.a(context)) {
            SmartDeviceChimeraActivity.e.d("Skipping TargetActivity. Reason: Cannot copy restricted profile", new Object[0]);
            return null;
        } else {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.setup.d2d.SmartDeviceActivity");
            fzl fzl = new fzl();
            fzl.b(gjx.a, str2);
            fzl.b(gjx.b, Boolean.valueOf(z3));
            fzk fzk = SmartDeviceChimeraActivity.f;
            if (!z4) {
                str = "auth";
            } else {
                str = "suw";
            }
            fzl.b(fzk, str);
            fzl.b(SmartDeviceChimeraActivity.g, ivy.a(d2dOptions2));
            return className.putExtras(fzl.a);
        }
    }

    private final gnw e() {
        Intent d2 = d();
        if (d2 != null) {
            return c(20, d2);
        }
        return f();
    }

    private final gnw f() {
        Context context = this.j;
        String str = this.n;
        boolean z2 = this.p;
        return c(30, MinuteMaidChimeraActivity.a(context, str, z2, this.s, this.q, this.r, this.x, this.u, this.v, this.w, this.o, this.z, this.F, this.A, k(), true, glk.a(this.j, false, this.n, this.r, true)));
    }

    private final gnw g() {
        Intent a2;
        if (!gmn.a(this.L, this.t, this.p) || (a2 = gmn.a(this.j, this.H, this.I, this.p, this.q, this.C, this.r)) == null) {
            return h();
        }
        return c(41, WrapperControlledChimeraActivity.a(this.j, this.q, this.r, a2));
    }

    private final gnw h() {
        Intent a2;
        if (!gll.a(this.p, this.K, this.N) || (a2 = gll.a(this.j, this.H, this.I, this.p, this.q, this.r)) == null) {
            return i();
        }
        return c(42, WrapperControlledChimeraActivity.a(this.j, this.q, this.r, a2));
    }

    private final gnw i() {
        Bundle bundle;
        ManagedAuthOptions managedAuthOptions;
        if (ijk.a(this.K)) {
            c.c("afterAppPicker with dmRequired", new Object[0]);
            Context context = this.j;
            Account account = this.H;
            boolean z2 = this.p;
            boolean z3 = this.q;
            ijn ijn = this.r;
            Bundle a2 = ijn != null ? ijn.a() : Bundle.EMPTY;
            boolean z4 = this.B;
            String str = this.o;
            boolean z5 = this.y;
            String str2 = this.K;
            boolean z6 = this.N;
            if (awlj.b() && (managedAuthOptions = this.D) != null) {
                bundle = managedAuthOptions.a();
            } else {
                bundle = Bundle.EMPTY;
            }
            Intent a3 = ijk.a(context, account, z2, z3, a2, z4, str, z5, str2, z6, 0, bundle);
            if (a3 != null) {
                return gnw.a(60, WrapperControlledChimeraActivity.a(this.j, this.q, this.r, a3), 0, 0);
            }
        }
        return a(4);
    }

    private final gnw j() {
        if (this.J == null || !k()) {
            return l();
        }
        return b(50, WrapperControlledChimeraActivity.a(this.j, this.q, this.r, this.J));
    }

    private final boolean k() {
        return this.p || h.contains(this.o);
    }

    private final gnw l() {
        String str;
        if (!this.p) {
            return m();
        }
        glm glm = this.l;
        if (!jkr.e()) {
            str = "android.intent.action.ACTION_CARRIER_SETUP";
        } else {
            str = "android.intent.action.CARRIER_SETUP";
        }
        Intent intent = new Intent(str);
        boolean z2 = true;
        intent.putExtra("device_setup", true);
        List carrierPackageNamesForIntent = glm.b.getCarrierPackageNamesForIntent(intent);
        if (carrierPackageNamesForIntent == null || carrierPackageNamesForIntent.isEmpty()) {
            intent = null;
        } else {
            if (carrierPackageNamesForIntent.size() != 1) {
                glm.a.d("Multiple matching carrier apps found, launching the first.", new Object[0]);
            }
            intent.setPackage((String) carrierPackageNamesForIntent.get(0));
            intent.putExtra("disable_back", true);
            if (glm.c.a("com.google").length <= 0) {
                z2 = false;
            }
            intent.putExtra("has_account", z2);
        }
        if (intent != null) {
            return gnw.a(90, WrapperControlledChimeraActivity.a(this.j, this.q, this.r, intent));
        }
        return m();
    }

    private final gnw m() {
        Intent intent;
        Intent intent2 = this.G;
        int i2 = -1;
        if (intent2 != null) {
            i2 = intent2.getIntExtra("tap_and_go_result_code", -1);
            this.G.removeExtra("tap_and_go_result_code");
            intent = this.G;
        } else {
            intent = null;
        }
        if (!q()) {
            Bundle bundle = new Bundle();
            bundle.putString("authAccount", this.H.name);
            bundle.putString("accountType", this.H.type);
            bundle.putBoolean(MinuteMaidChimeraActivity.f.a, this.I);
            String str = this.O;
            if (str != null) {
                bundle.putString("accountStatusToken", str);
            }
            intent = new Intent().putExtras(bundle);
        }
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.m;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onResult(intent.getExtras());
        }
        return d(i2, intent);
    }

    private final gnw n() {
        int i2;
        Intent intent;
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.m;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(4, "skipped or error");
        }
        if (this.F) {
            intent = new Intent().putExtras(p().a);
            i2 = 0;
        } else {
            Intent intent2 = this.G;
            if (intent2 != null) {
                i2 = intent2.getIntExtra("tap_and_go_result_code", -1);
                this.G.removeExtra("tap_and_go_result_code");
                intent = this.G;
            } else {
                i2 = 1;
                intent = null;
            }
        }
        return d(i2, intent);
    }

    private final gnw o() {
        return a((Bundle) null);
    }

    private final fzl p() {
        fzl fzl = new fzl();
        if (ent.k()) {
            this.b = true;
        }
        fzl.b(a, Boolean.valueOf(this.b));
        return fzl;
    }

    private final boolean q() {
        Intent intent = this.G;
        if (intent != null) {
            return (intent.getStringExtra("authAccount") == null || this.G.getStringExtra("accountType") == null) ? false : true;
        }
    }

    public final String b() {
        return "AddAccountController";
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        Bundle bundle;
        byte[] bArr;
        parcel.writeParcelable(this.m, 0);
        parcel.writeString(this.n);
        parcel.writeByte(this.p ? (byte) 1 : 0);
        parcel.writeByte(this.q ? (byte) 1 : 0);
        ijn ijn = this.r;
        byte[] bArr2 = null;
        if (ijn != null) {
            bundle = ijn.a();
        } else {
            bundle = null;
        }
        parcel.writeParcelable(bundle, 0);
        parcel.writeByte(this.s ? (byte) 1 : 0);
        parcel.writeString(this.u);
        parcel.writeString(this.v);
        parcel.writeString(this.w);
        parcel.writeStringArray(this.x);
        parcel.writeString(this.o);
        parcel.writeString(this.z);
        parcel.writeByte(this.F ? (byte) 1 : 0);
        parcel.writeParcelable(this.G, 0);
        parcel.writeParcelable(this.H, 0);
        parcel.writeByte(this.I ? (byte) 1 : 0);
        parcel.writeParcelable(this.J, 0);
        parcel.writeString(this.K);
        parcel.writeByte(this.L ? (byte) 1 : 0);
        parcel.writeByte(this.M ? (byte) 1 : 0);
        parcel.writeByte(this.N ? (byte) 1 : 0);
        parcel.writeString(this.O);
        parcel.writeByte(this.b ? (byte) 1 : 0);
        parcel.writeByte(this.A ? (byte) 1 : 0);
        parcel.writeByte(this.t ? (byte) 1 : 0);
        parcel.writeByte(this.B ? (byte) 1 : 0);
        parcel.writeByte(this.C ? (byte) 1 : 0);
        ManagedAuthOptions managedAuthOptions = this.D;
        if (managedAuthOptions != null) {
            bArr = ivy.a(managedAuthOptions);
        } else {
            bArr = null;
        }
        parcel.writeByteArray(bArr);
        D2dOptions d2dOptions = this.E;
        if (d2dOptions != null) {
            bArr2 = ivy.a(d2dOptions);
        }
        parcel.writeByteArray(bArr2);
    }

    private final gnw c() {
        Bundle bundle;
        Context context = this.j;
        boolean z2 = this.q;
        boolean z3 = this.p;
        ijn ijn = this.r;
        Intent intent = new Intent();
        intent.setAction("com.google.android.gms.auth.addaccount.PRE_ADD_ACCOUNT");
        Intent a2 = glz.a(context, intent);
        if (a2 != null) {
            Intent putExtra = a2.putExtra("is_setup_wizard", z3).putExtra("use_immersive_mode", z2);
            if (ijn != null) {
                bundle = ijn.a();
            } else {
                bundle = null;
            }
            putExtra.putExtra("ui_parameters", bundle);
        }
        if (a2 != null) {
            return gnw.a(10, WrapperControlledChimeraActivity.a(this.j, this.q, this.r, a2));
        }
        return gnw.a(39, c(R.string.auth_error_generic_server_error));
    }

    private static gnw b(int i2, Intent intent) {
        return gnw.a(i2, intent, d, e);
    }

    public static boolean b(boolean z2) {
        return z2 && ent.B();
    }

    public static glb a() {
        return new glb();
    }

    private final gnw a(int i2) {
        if (this.M) {
            return b(i2);
        }
        return j();
    }

    private static gnw a(int i2, Intent intent) {
        return gnw.a(i2, intent, f, g);
    }

    private static gnw c(int i2, Intent intent) {
        return gnw.a(i2, intent, 17432576, 17432577);
    }

    private final gnw a(Bundle bundle) {
        AccountAuthenticatorResponse accountAuthenticatorResponse = this.m;
        if (accountAuthenticatorResponse != null) {
            accountAuthenticatorResponse.onError(4, "canceled");
        }
        Intent putExtras = new Intent().putExtras(p().a);
        if (bundle != null) {
            putExtras.putExtras(bundle);
        }
        return gnw.b(0, putExtras, f, g);
    }

    private static gnw d(int i2, Intent intent) {
        return gnw.b(i2, intent, d, e);
    }

    private final gnw a(AccountDetail accountDetail) {
        this.H = new Account(accountDetail.a, accountDetail.b);
        this.I = accountDetail.c;
        this.N = accountDetail.e;
        c.a("Main account from minute maid:%s", iwd.a((Object) this.H));
        this.O = accountDetail.g;
        Intent intent = accountDetail.f;
        this.J = intent;
        if (intent != null) {
            intent.putExtra("theme", this.r.a);
            this.J.putExtra("useImmersiveMode", this.q);
        }
        this.K = accountDetail.d;
        this.N = accountDetail.e;
        if (ijk.a(this.K)) {
            this.M = b(this.N);
            this.L = a(this.N);
            a(this.j, this.H);
        }
        return g();
    }

    public static void a(Context context, Account account) {
        context.startService(UpdateHideDmNotificationsIntentOperation.a(context, account));
    }

    public static boolean a(boolean z2) {
        return z2 && ent.A();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:241:0x04b1, code lost:
        if (r2 != 103) goto L_0x051e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.gnw a(defpackage.gny r29) {
        /*
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = 39
            r3 = 1
            if (r1 == 0) goto L_0x0557
            iwd r4 = c
            r5 = 2
            java.lang.Object[] r6 = new java.lang.Object[r5]
            int r7 = r1.a
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r8 = 0
            r6[r8] = r7
            int r7 = r1.b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r6[r3] = r7
            java.lang.String r7 = "Result with id=%d and resultCode=%d"
            java.lang.String r6 = java.lang.String.format(r7, r6)
            java.lang.Object[] r7 = new java.lang.Object[r8]
            r4.b(r6, r7)
            fzl r4 = new fzl
            android.content.Intent r6 = r1.c
            if (r6 != 0) goto L_0x0036
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            goto L_0x003a
        L_0x0036:
            android.os.Bundle r6 = r6.getExtras()
        L_0x003a:
            r4.<init>(r6)
            int r6 = r1.a
            r7 = 2131951874(0x7f130102, float:1.9540175E38)
            r9 = -1
            if (r6 == r3) goto L_0x0509
            r10 = 20
            if (r6 == r10) goto L_0x04a2
            if (r6 == r2) goto L_0x048d
            r11 = 50
            if (r6 == r11) goto L_0x0488
            r11 = 60
            r12 = 5
            r13 = 4
            r14 = 62
            r15 = 3
            if (r6 == r11) goto L_0x0411
            if (r6 == r14) goto L_0x040c
            r11 = 70
            if (r6 == r11) goto L_0x03a8
            r11 = 90
            if (r6 == r11) goto L_0x03a3
            r11 = 100
            if (r6 == r11) goto L_0x039e
            r14 = 10
            r3 = 11
            r2 = 31
            if (r6 == r14) goto L_0x02b7
            if (r6 == r3) goto L_0x0295
            r3 = 30
            if (r6 == r3) goto L_0x01a9
            if (r6 == r2) goto L_0x00f7
            r2 = 41
            if (r6 == r2) goto L_0x00c9
            r3 = 42
            if (r6 != r3) goto L_0x051e
            int r3 = r1.b
            if (r3 == r9) goto L_0x00c4
            if (r3 == 0) goto L_0x0085
            goto L_0x00c9
        L_0x0085:
            boolean r1 = r0.L
            boolean r3 = r0.t
            boolean r4 = r0.p
            boolean r1 = defpackage.gmn.a(r1, r3, r4)
            if (r1 == 0) goto L_0x00b5
            android.content.Context r3 = r0.j
            android.accounts.Account r4 = r0.H
            boolean r5 = r0.I
            boolean r6 = r0.p
            boolean r7 = r0.q
            boolean r8 = r0.C
            ijn r9 = r0.r
            android.content.Intent r1 = defpackage.gmn.a(r3, r4, r5, r6, r7, r8, r9)
            if (r1 != 0) goto L_0x00a6
            goto L_0x00b5
        L_0x00a6:
            android.content.Context r3 = r0.j
            boolean r4 = r0.q
            ijn r5 = r0.r
            android.content.Intent r1 = com.google.android.gms.auth.uiflows.addaccount.WrapperControlledChimeraActivity.a(r3, r4, r5, r1)
            gnw r1 = a((int) r2, (android.content.Intent) r1)
            goto L_0x00c3
        L_0x00b5:
            android.content.Context r1 = r0.j
            boolean r2 = r0.q
            ijn r3 = r0.r
            android.content.Intent r1 = com.google.android.gms.auth.uiflows.addaccount.AccountAddedChimeraActivity.a(r1, r2, r3)
            gnw r1 = a((int) r11, (android.content.Intent) r1)
        L_0x00c3:
            return r1
        L_0x00c4:
            gnw r1 = r28.i()
            return r1
        L_0x00c9:
            int r2 = r1.b
            if (r2 == r9) goto L_0x00f2
            if (r2 == 0) goto L_0x00d1
            goto L_0x0411
        L_0x00d1:
            fzk r1 = a
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
            java.lang.Object r1 = r4.a(r1, r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.b = r1
            android.content.Context r1 = r0.j
            boolean r2 = r0.q
            ijn r3 = r0.r
            android.content.Intent r1 = com.google.android.gms.auth.uiflows.addaccount.AccountAddedChimeraActivity.a(r1, r2, r3)
            gnw r1 = a((int) r11, (android.content.Intent) r1)
            return r1
        L_0x00f2:
            gnw r1 = r28.h()
            return r1
        L_0x00f7:
            int r2 = r1.b
            if (r2 == r9) goto L_0x013b
            if (r2 == 0) goto L_0x0133
            if (r2 == r5) goto L_0x0127
            if (r2 == r15) goto L_0x0122
            if (r2 == r13) goto L_0x0112
            if (r2 != r12) goto L_0x051e
            r0.F = r8
            android.content.Intent r1 = r28.d()
            if (r1 == 0) goto L_0x013b
            gnw r1 = c(r10, r1)
            return r1
        L_0x0112:
            r0.F = r8
            boolean r1 = r0.A
            if (r1 == 0) goto L_0x011d
            gnw r1 = r28.n()
            return r1
        L_0x011d:
            gnw r1 = r28.e()
            return r1
        L_0x0122:
            gnw r1 = r28.f()
            return r1
        L_0x0127:
            android.content.Intent r1 = r0.c(r7)
            r2 = 39
            gnw r1 = b(r2, r1)
            return r1
        L_0x0133:
            r1 = 1
            r0.b = r1
            gnw r1 = r28.o()
            return r1
        L_0x013b:
            fzk r1 = com.google.android.gms.auth.uiflows.addaccount.AddAccountChimeraActivity.a
            java.lang.Object r1 = r4.a(r1)
            android.accounts.Account r1 = (android.accounts.Account) r1
            r0.H = r1
            fzk r1 = i
            java.lang.Object r1 = r4.a(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.O = r1
            fzk r1 = com.google.android.gms.auth.uiflows.addaccount.AddAccountChimeraActivity.b
            java.lang.Object r1 = r4.a(r1)
            android.content.Intent r1 = (android.content.Intent) r1
            r0.J = r1
            if (r1 == 0) goto L_0x016d
            ijn r2 = r0.r
            java.lang.String r2 = r2.a
            java.lang.String r3 = "theme"
            r1.putExtra(r3, r2)
            android.content.Intent r1 = r0.J
            boolean r2 = r0.q
            java.lang.String r3 = "useImmersiveMode"
            r1.putExtra(r3, r2)
        L_0x016d:
            fzk r1 = com.google.android.gms.auth.uiflows.addaccount.AddAccountChimeraActivity.c
            java.lang.Object r1 = r4.a(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.K = r1
            fzk r1 = com.google.android.gms.auth.uiflows.addaccount.AddAccountChimeraActivity.d
            java.lang.Object r1 = r4.a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.N = r1
            java.lang.String r1 = r0.K
            boolean r1 = defpackage.ijk.a((java.lang.String) r1)
            if (r1 == 0) goto L_0x01a4
            boolean r1 = r0.N
            boolean r1 = b((boolean) r1)
            r0.M = r1
            boolean r1 = r0.N
            boolean r1 = a((boolean) r1)
            r0.L = r1
            android.content.Context r1 = r0.j
            android.accounts.Account r2 = r0.H
            a((android.content.Context) r1, (android.accounts.Account) r2)
        L_0x01a4:
            gnw r1 = r28.g()
            return r1
        L_0x01a9:
            int r3 = r1.b
            if (r3 == r9) goto L_0x0227
            if (r3 == 0) goto L_0x0214
            r2 = 1
            if (r3 == r2) goto L_0x020f
            if (r3 == r5) goto L_0x01f3
            if (r3 != r15) goto L_0x051e
            fzk r1 = com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity.p
            java.lang.Object r1 = r4.a(r1)
            com.google.android.gms.auth.uiflows.addaccount.AccountDetail[] r1 = (com.google.android.gms.auth.uiflows.addaccount.AccountDetail[]) r1
            if (r1 != 0) goto L_0x01c1
            goto L_0x01e5
        L_0x01c1:
            int r2 = r1.length
            if (r2 == 0) goto L_0x01e5
            r3 = 1
            if (r2 == r3) goto L_0x01dd
            r3 = r1[r8]
            int r2 = r2 + r9
        L_0x01ca:
            if (r2 <= 0) goto L_0x01d7
            r4 = r1[r2]
            java.lang.String r5 = r4.d
            if (r5 != 0) goto L_0x01d5
            int r2 = r2 + -1
            goto L_0x01ca
        L_0x01d5:
            r3 = r4
            goto L_0x01d8
        L_0x01d7:
        L_0x01d8:
            gnw r1 = r0.a((com.google.android.gms.auth.uiflows.addaccount.AccountDetail) r3)
            goto L_0x01f2
        L_0x01dd:
            r1 = r1[r8]
            gnw r1 = r0.a((com.google.android.gms.auth.uiflows.addaccount.AccountDetail) r1)
            goto L_0x01f2
        L_0x01e5:
            iwd r1 = c
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r3 = "Accounts returned are null are 0 from multi add account"
            r1.f(r3, r2)
            gnw r1 = r28.o()
        L_0x01f2:
            return r1
        L_0x01f3:
            fzk r1 = com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity.h
            java.lang.Object r1 = r4.a(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0203
            android.content.Context r1 = r0.j
            java.lang.String r1 = r1.getString(r7)
        L_0x0203:
            android.content.Intent r1 = r0.a((java.lang.String) r1)
            r2 = 39
            gnw r1 = b(r2, r1)
            return r1
        L_0x020f:
            gnw r1 = r28.n()
            return r1
        L_0x0214:
            android.content.Intent r1 = r28.d()
            if (r1 == 0) goto L_0x021f
            gnw r1 = a((int) r10, (android.content.Intent) r1)
            return r1
        L_0x021f:
            r1 = 1
            r0.b = r1
            gnw r1 = r28.o()
            return r1
        L_0x0227:
            fzk r1 = com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity.b
            java.lang.Object r1 = r4.a(r1)
            r19 = r1
            java.lang.String r19 = (java.lang.String) r19
            fzk r1 = com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity.c
            java.lang.Object r1 = r4.a(r1)
            r20 = r1
            java.lang.String r20 = (java.lang.String) r20
            fzk r1 = com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity.d
            java.lang.Object r1 = r4.a(r1)
            r21 = r1
            java.lang.String r21 = (java.lang.String) r21
            fzk r1 = com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity.g
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)
            java.lang.Object r1 = r4.a(r1, r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r22 = r1.booleanValue()
            fzk r1 = com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity.f
            java.lang.Object r1 = r4.a(r1, r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.I = r1
            com.google.android.gms.auth.firstparty.shared.D2dOptions r1 = r0.E
            if (r1 == 0) goto L_0x026e
            boolean r1 = r1.a
            if (r1 == 0) goto L_0x026e
            r27 = 1
            goto L_0x0270
        L_0x026e:
            r27 = 0
        L_0x0270:
            android.content.Context r1 = r0.j
            java.lang.String r3 = r0.n
            boolean r4 = r0.p
            boolean r23 = r28.k()
            boolean r5 = r0.q
            boolean r6 = r0.A
            ijn r7 = r0.r
            r16 = r1
            r17 = r3
            r18 = r4
            r24 = r5
            r25 = r6
            r26 = r7
            android.content.Intent r1 = com.google.android.gms.auth.uiflows.addaccount.AddAccountChimeraActivity.a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            gnw r1 = c(r2, r1)
            return r1
        L_0x0295:
            int r2 = r1.b
            if (r2 == r9) goto L_0x02b2
            if (r2 != 0) goto L_0x051e
            fzk r1 = a
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
            java.lang.Object r1 = r4.a(r1, r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.b = r1
            gnw r1 = r28.o()
            return r1
        L_0x02b2:
            gnw r1 = r28.e()
            return r1
        L_0x02b7:
            int r10 = r1.b
            if (r10 == r9) goto L_0x0312
            if (r10 == 0) goto L_0x02fb
            if (r10 == r5) goto L_0x02ef
            if (r10 == r15) goto L_0x02df
            if (r10 == r2) goto L_0x02ce
            r2 = 111(0x6f, float:1.56E-43)
            if (r10 != r2) goto L_0x051e
            r1 = 0
            gnw r1 = d(r2, r1)
            return r1
        L_0x02ce:
            fzk r1 = com.google.android.gms.auth.uiflows.addaccount.AddAccountChimeraActivity.a
            java.lang.Object r1 = r4.a(r1)
            android.accounts.Account r1 = (android.accounts.Account) r1
            r0.H = r1
            if (r1 == 0) goto L_0x02ef
            gnw r1 = r28.m()
            return r1
        L_0x02df:
            iwd r2 = c
            java.lang.Object[] r3 = new java.lang.Object[r8]
            java.lang.String r4 = "Launching ZT managed provisioning."
            r2.c(r4, r3)
            android.content.Intent r1 = r1.c
            gnw r1 = b(r15, r1)
            return r1
        L_0x02ef:
            android.content.Intent r1 = r0.c(r7)
            r2 = 39
            gnw r1 = c(r2, r1)
            return r1
        L_0x02fb:
            fzk r1 = a
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
            java.lang.Object r1 = r4.a(r1, r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.b = r1
            gnw r1 = r28.o()
            return r1
        L_0x0312:
            fzk r1 = com.google.android.gms.auth.uiflows.addaccount.PreAddAccountChimeraActivity.b
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
            java.lang.Object r1 = r4.a(r1, r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.F = r1
            if (r1 == 0) goto L_0x0327
            goto L_0x033c
        L_0x0327:
            boolean r1 = r0.A
            if (r1 == 0) goto L_0x033c
            awme r1 = defpackage.awme.a
            awmf r1 = r1.a()
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x033c
            gnw r1 = r28.n()
            return r1
        L_0x033c:
            awke r1 = defpackage.awke.a
            awkf r1 = r1.a()
            boolean r1 = r1.a()
            if (r1 != 0) goto L_0x0349
            goto L_0x0399
        L_0x0349:
            boolean r1 = r0.F
            if (r1 != 0) goto L_0x0399
            android.content.Context r1 = r0.j
            boolean r2 = r0.q
            boolean r4 = r0.p
            ijn r5 = r0.r
            android.content.Intent r6 = new android.content.Intent
            r6.<init>()
            java.lang.String r7 = "com.google.android.gms.auth.addaccount.POST_PRE_ADD_ACCOUNT"
            r6.setAction(r7)
            android.content.Intent r1 = defpackage.glz.a(r1, r6)
            if (r1 == 0) goto L_0x037f
            java.lang.String r6 = "is_setup_wizard"
            android.content.Intent r4 = r1.putExtra(r6, r4)
            java.lang.String r6 = "use_immersive_mode"
            android.content.Intent r2 = r4.putExtra(r6, r2)
            if (r5 == 0) goto L_0x0378
            android.os.Bundle r14 = r5.a()
            goto L_0x0379
        L_0x0378:
            r14 = 0
        L_0x0379:
            java.lang.String r4 = "ui_parameters"
            r2.putExtra(r4, r14)
        L_0x037f:
            if (r1 == 0) goto L_0x0399
            iwd r2 = c
            java.lang.Object[] r4 = new java.lang.Object[r8]
            java.lang.String r5 = "Launching post pre add account hook activity."
            r2.c(r5, r4)
            android.content.Context r2 = r0.j
            boolean r4 = r0.q
            ijn r5 = r0.r
            android.content.Intent r1 = com.google.android.gms.auth.uiflows.addaccount.WrapperControlledChimeraActivity.a(r2, r4, r5, r1)
            gnw r1 = defpackage.gnw.a(r3, r1)
            goto L_0x039d
        L_0x0399:
            gnw r1 = r28.e()
        L_0x039d:
            return r1
        L_0x039e:
            gnw r1 = r28.g()
            return r1
        L_0x03a3:
            gnw r1 = r28.m()
            return r1
        L_0x03a8:
            int r1 = r1.b
            if (r1 == r9) goto L_0x03b8
            if (r1 == 0) goto L_0x03b0
            goto L_0x0488
        L_0x03b0:
            r1 = 1
            r0.b = r1
            gnw r1 = r28.n()
            return r1
        L_0x03b8:
            r1 = 1
            r0.b = r8
            r0.F = r1
            r1 = 0
            r0.G = r1
            r0.H = r1
            r0.I = r8
            r0.J = r1
            r0.K = r1
            r0.L = r8
            r0.M = r8
            r0.N = r8
            android.content.Context r1 = r0.j
            boolean r2 = r0.q
            boolean r3 = r0.p
            ijn r4 = r0.r
            if (r4 == 0) goto L_0x03dd
            android.os.Bundle r4 = r4.a()
            goto L_0x03df
        L_0x03dd:
            android.os.Bundle r4 = android.os.Bundle.EMPTY
        L_0x03df:
            boolean r5 = defpackage.awlj.b()
            if (r5 != 0) goto L_0x03e6
            goto L_0x03ef
        L_0x03e6:
            com.google.android.gms.auth.firstparty.shared.ManagedAuthOptions r5 = r0.D
            if (r5 == 0) goto L_0x03ef
            android.os.Bundle r5 = r5.a()
            goto L_0x03f1
        L_0x03ef:
            android.os.Bundle r5 = android.os.Bundle.EMPTY
        L_0x03f1:
            android.content.Intent r1 = defpackage.ijk.a(r1, r2, r3, r4, r5)
            if (r1 == 0) goto L_0x0407
            android.content.Context r2 = r0.j
            boolean r3 = r0.q
            ijn r4 = r0.r
            android.content.Intent r1 = com.google.android.gms.auth.uiflows.addaccount.WrapperControlledChimeraActivity.a(r2, r3, r4, r1)
            r2 = 1
            gnw r1 = defpackage.gnw.a(r2, r1)
            goto L_0x040b
        L_0x0407:
            gnw r1 = r28.c()
        L_0x040b:
            return r1
        L_0x040c:
            gnw r1 = r28.j()
            return r1
        L_0x0411:
            int r1 = r1.b
            switch(r1) {
                case -1: goto L_0x0470;
                case 0: goto L_0x0457;
                case 1: goto L_0x0416;
                case 2: goto L_0x0450;
                case 3: goto L_0x044a;
                case 4: goto L_0x0416;
                case 5: goto L_0x0437;
                case 6: goto L_0x044a;
                case 7: goto L_0x0416;
                case 8: goto L_0x0431;
                case 9: goto L_0x041d;
                case 10: goto L_0x0417;
                default: goto L_0x0416;
            }
        L_0x0416:
            goto L_0x0482
        L_0x0417:
            gnw r1 = r0.b((int) r5)
            return r1
        L_0x041d:
            android.content.Context r1 = r0.j
            android.accounts.Account r2 = r0.H
            r3 = 6
            boolean r4 = r0.q
            ijn r5 = r0.r
            android.content.Intent r1 = com.google.android.gms.auth.uiflows.addaccount.RemoveAccountChimeraActivity.a(r1, r2, r3, r4, r5)
            r2 = 62
            gnw r1 = b(r2, r1)
            return r1
        L_0x0431:
            gnw r1 = r0.a((int) r13)
            return r1
        L_0x0437:
            android.content.Context r1 = r0.j
            android.accounts.Account r2 = r0.H
            boolean r3 = r0.q
            ijn r4 = r0.r
            android.content.Intent r1 = com.google.android.gms.auth.uiflows.addaccount.RemoveAccountChimeraActivity.a(r1, r2, r12, r3, r4)
            r2 = 62
            gnw r1 = b(r2, r1)
            return r1
        L_0x044a:
            gnw r1 = r0.a((int) r5)
            return r1
        L_0x0450:
            r1 = 1
            gnw r1 = r0.a((int) r1)
            return r1
        L_0x0457:
            fzk r1 = a
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
            java.lang.Object r1 = r4.a(r1, r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.b = r1
            if (r1 != 0) goto L_0x0482
            gnw r1 = r28.o()
            return r1
        L_0x0470:
            android.content.Context r1 = r0.j
            boolean r1 = defpackage.ijk.a((android.content.Context) r1)
            if (r1 == 0) goto L_0x047d
            gnw r1 = r28.m()
            return r1
        L_0x047d:
            gnw r1 = r28.j()
            return r1
        L_0x0482:
            gnw r1 = r0.a((int) r15)
            return r1
        L_0x0488:
            gnw r1 = r28.l()
            return r1
        L_0x048d:
            int r2 = r1.b
            if (r2 == r9) goto L_0x049d
            if (r2 != 0) goto L_0x051e
            r1 = 1
            r0.b = r1
            android.os.Bundle r1 = r4.a
            gnw r1 = r0.a((android.os.Bundle) r1)
            return r1
        L_0x049d:
            gnw r1 = r28.n()
            return r1
        L_0x04a2:
            int r2 = r1.b
            if (r2 == r9) goto L_0x04d0
            if (r2 == 0) goto L_0x04b9
            r3 = 1
            if (r2 == r3) goto L_0x04b4
            r3 = 102(0x66, float:1.43E-43)
            if (r2 == r3) goto L_0x04d0
            r3 = 103(0x67, float:1.44E-43)
            if (r2 != r3) goto L_0x051e
            goto L_0x04d0
        L_0x04b4:
            gnw r1 = r28.f()
            return r1
        L_0x04b9:
            fzk r1 = a
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
            java.lang.Object r1 = r4.a(r1, r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.b = r1
            gnw r1 = r28.o()
            return r1
        L_0x04d0:
            android.content.Intent r1 = r1.c
            r0.G = r1
            java.lang.String r3 = "tap_and_go_result_code"
            r1.putExtra(r3, r2)
            boolean r1 = r28.q()
            if (r1 != 0) goto L_0x04ed
            iwd r1 = c
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.String r3 = "Tap & Go finished without account transfer, launching MinuteMaid."
            r1.c(r3, r2)
            gnw r1 = r28.f()
            return r1
        L_0x04ed:
            android.accounts.Account r1 = new android.accounts.Account
            android.content.Intent r2 = r0.G
            java.lang.String r3 = "authAccount"
            java.lang.String r2 = r2.getStringExtra(r3)
            android.content.Intent r3 = r0.G
            java.lang.String r4 = "accountType"
            java.lang.String r3 = r3.getStringExtra(r4)
            r1.<init>(r2, r3)
            r0.H = r1
            gnw r1 = r28.g()
            return r1
        L_0x0509:
            int r2 = r1.b
            if (r2 == r9) goto L_0x0552
            if (r2 == 0) goto L_0x053b
            r3 = 1
            if (r2 != r3) goto L_0x051e
            android.content.Intent r1 = r0.c(r7)
            r2 = 39
            gnw r1 = c(r2, r1)
            return r1
        L_0x051e:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.Object[] r3 = new java.lang.Object[r5]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r6)
            r3[r8] = r4
            int r1 = r1.b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4 = 1
            r3[r4] = r1
            java.lang.String r1 = "Result not handled with id %d and resultCode %d."
            java.lang.String r1 = java.lang.String.format(r1, r3)
            r2.<init>(r1)
            throw r2
        L_0x053b:
            fzk r1 = a
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
            java.lang.Object r1 = r4.a(r1, r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.b = r1
            gnw r1 = r28.o()
            return r1
        L_0x0552:
            gnw r1 = r28.c()
            return r1
        L_0x0557:
            fzo r1 = r0.k
            boolean r1 = r1.a()
            if (r1 == 0) goto L_0x058d
            android.content.Context r1 = r0.j
            boolean r2 = r0.q
            boolean r3 = r0.p
            ijn r4 = r0.r
            if (r4 == 0) goto L_0x056e
            android.os.Bundle r4 = r4.a()
            goto L_0x0570
        L_0x056e:
            android.os.Bundle r4 = android.os.Bundle.EMPTY
        L_0x0570:
            android.os.Bundle r5 = android.os.Bundle.EMPTY
            android.content.Intent r1 = defpackage.ijk.a(r1, r2, r3, r4, r5)
            if (r1 == 0) goto L_0x0588
            android.content.Context r2 = r0.j
            boolean r3 = r0.q
            ijn r4 = r0.r
            android.content.Intent r1 = com.google.android.gms.auth.uiflows.addaccount.WrapperControlledChimeraActivity.a(r2, r3, r4, r1)
            r2 = 1
            gnw r1 = defpackage.gnw.a(r2, r1)
            return r1
        L_0x0588:
            gnw r1 = r28.c()
            return r1
        L_0x058d:
            r1 = 2131951878(0x7f130106, float:1.9540183E38)
            android.content.Intent r1 = r0.c(r1)
            r2 = 39
            gnw r1 = defpackage.gnw.a(r2, r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.uiflows.addaccount.AddAccountController.a(gny):gnw");
    }
}
