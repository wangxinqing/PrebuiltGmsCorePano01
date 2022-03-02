package defpackage;

import android.app.UiModeManager;
import android.content.Context;
import android.content.IntentFilter;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.UserManager;
import android.telephony.TelephonyManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebSettings;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Loader;
import com.google.android.chimera.LoaderManager;
import com.google.android.gms.R;
import com.google.android.gms.auth.login.CustomWebView;
import com.google.android.gms.auth.login.MinuteMaidAuthSmsReceiver;
import com.google.android.gms.auth.uiflows.minutemaid.GlifMinuteMaidLayout;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.u2f.api.StateUpdate;
import com.google.android.gms.fido.u2f.api.common.BrowserSignRequestParams;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import org.json.JSONObject;

/* renamed from: gqa  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gqa extends gmx implements LoaderManager.LoaderCallbacks, gqb, fzb {
    public static final iwd d = ehv.a("MinuteMaid", "MinuteMaidFragment");
    public static final fzk e = fzk.a("account_name");
    public static final fzk f = fzk.a("account_type");
    public static final fzk g = fzk.a("is_reauth");
    public static final fzk h = fzk.a("is_setup_wizard");
    public static final fzk i = fzk.a("theme");
    public static final fzk j = fzk.a("use_clamshell_endpoint");
    public static final fzk k = fzk.a("use_immersive_mode");
    public static final fzk l = fzk.a("allowed_domains");
    public static final fzk m = fzk.a("purchaser_gaia_email");
    public static final fzk n = fzk.a("purchaser_name");
    public static final fzk o = fzk.a("package_name");
    public static final fzk p = fzk.a("login_template");
    public static final fzk q = fzk.a("is_add_account_flow");
    public static final fzk r = fzk.a("google_signin_url");
    public volatile boolean A;
    public volatile boolean B;
    public volatile ncl C;
    public gpz D;
    public mzc E;
    public BrowserSignRequestParams F;
    public boolean G;
    public nbg H;
    public GlifMinuteMaidLayout I;
    public gpq J;
    private fzq K;
    private boolean L;
    private MinuteMaidAuthSmsReceiver M;
    private gqc N;
    private volatile boolean O;
    private final ekh P = ekh.a;
    private boolean Q;
    public Handler s;
    public gpx t;
    public InputMethodManager u;
    public CustomWebView v;
    public String w;
    public gop x;
    public volatile String y;
    public volatile String z;

    private final void e() {
        nbg nbg = this.H;
        if (nbg != null) {
            nbg.a(StateUpdate.c).a(gpb.a);
        }
    }

    private final void g(String str) {
        Uri parse;
        this.w = str;
        boolean b = this.K.b(str);
        if (b != this.O) {
            if (b) {
                this.v.addJavascriptInterface(this.N, "mm");
            } else {
                this.v.removeJavascriptInterface("mm");
            }
            this.O = b;
        }
        if (!b || (parse = Uri.parse(str)) == null || parse.getPath() == null || !parse.getPath().startsWith("/embedded")) {
            this.t.a(false);
        } else {
            this.t.a(true);
        }
    }

    public final void a() {
        d.b("onNativePrimaryActionHit", new Object[0]);
        f("window.nativePrimaryActionHit()");
    }

    /* access modifiers changed from: protected */
    public final void c(String str) {
        this.t.a((String) null, str);
    }

    public final void d() {
        mzc mzc = this.E;
        if (mzc != null) {
            mzc.a(com.google.android.gms.fido.fido2.api.StateUpdate.d);
            this.E = null;
        }
    }

    public final void f(String str) {
        CustomWebView customWebView = this.c;
        if (customWebView != null) {
            this.s.post(new gpl(str, customWebView));
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.t = (gpx) activity;
    }

    public final void onCreate(Bundle bundle) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        super.onCreate(bundle);
        boolean z6 = true;
        if (!ijm.a((String) b().a(i)) || getActivity().getResources().getConfiguration().smallestScreenWidthDp >= 600) {
            jix.g(getActivity());
            z2 = true;
        } else {
            z2 = false;
        }
        this.Q = z2;
        if (!awld.a.a().a() || this.Q) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.G = z3;
        iwd iwd = d;
        boolean z7 = this.Q;
        StringBuilder sb = new StringBuilder(65);
        sb.append("shouldDrawStatusBarInWebview: ");
        sb.append(z7);
        sb.append(" useNativeNavigationBar: ");
        sb.append(z3);
        iwd.b(sb.toString(), new Object[0]);
        this.s = new qvr();
        this.u = (InputMethodManager) getActivity().getSystemService("input_method");
        this.K = fzq.a(ent.aH());
        UiModeManager uiModeManager = (UiModeManager) getActivity().getSystemService("uimode");
        if (jni.b(getActivity()).a("android.permission.READ_PHONE_STATE") == 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (jni.b(getActivity()).a("android.permission.RECEIVE_SMS") == 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (!z4 || !z5) {
            d.c("READ_PHONE_STATE: %s RECEIVE_SMS: %s", Boolean.valueOf(z4), Boolean.valueOf(z5));
            z6 = false;
        } else if (((UserManager) getActivity().getSystemService("user")).hasUserRestriction("no_sms")) {
            d.c("SMS disallowed for this user", new Object[0]);
            z6 = false;
        }
        this.L = z6;
        Activity activity = getActivity();
        boolean z8 = this.L;
        this.N = new gqc(this, activity, qub.a((Context) activity), (TelephonyManager) activity.getSystemService("phone"), (String) b().a(f), z8, jgu.f(activity));
    }

    public final Loader onCreateLoader(int i2, Bundle bundle) {
        return new gpn(this, getActivity());
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.Q) {
            return onCreateView;
        }
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.auth_minutemaid_container_with_status_bar, viewGroup, false);
        viewGroup2.addView(onCreateView);
        this.I = (GlifMinuteMaidLayout) viewGroup2;
        return viewGroup2;
    }

    public final void onDestroy() {
        gpz gpz = this.D;
        if (gpz != null) {
            gpz.cancel(true);
        }
        if (this.M != null) {
            getActivity().unregisterReceiver(this.M);
            this.M = null;
        }
        e();
        super.onDestroy();
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x028a  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x02fd  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x030c  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0317  */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0329  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:130:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x035a  */
    /* JADX WARNING: Removed duplicated region for block: B:136:0x0360  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01d0  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01e9  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01fd  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x020a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0240  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x024b  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x026c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onLoadFinished(com.google.android.chimera.Loader r26, java.lang.Object r27) {
        /*
            r25 = this;
            r1 = r25
            r0 = r27
            android.util.Pair r0 = (android.util.Pair) r0
            com.google.android.chimera.Activity r2 = r25.getActivity()
            java.lang.String r3 = "phone"
            java.lang.Object r2 = r2.getSystemService(r3)
            android.telephony.TelephonyManager r2 = (android.telephony.TelephonyManager) r2
            r3 = 0
            if (r2 != 0) goto L_0x0018
            r2 = r3
            r4 = r2
            goto L_0x0027
        L_0x0018:
            boolean r4 = r1.L
            if (r4 == 0) goto L_0x0025
            java.lang.String r4 = r2.getLine1Number()
            java.lang.String r2 = r2.getSubscriberId()
            goto L_0x0027
        L_0x0025:
            r2 = r3
            r4 = r2
        L_0x0027:
            com.google.android.chimera.Activity r5 = r25.getActivity()
            java.lang.String r6 = "device_country"
            java.lang.String r6 = defpackage.iqi.a(r5, r6, r3)
            android.content.res.Configuration r7 = new android.content.res.Configuration
            r7.<init>()
            android.content.ContentResolver r8 = r5.getContentResolver()
            android.provider.Settings.System.getConfiguration(r8, r7)
            int r7 = r7.mcc
            java.lang.Object r8 = r0.first
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            java.lang.Object r0 = r0.second
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r9 = r0.booleanValue()
            awjj r0 = defpackage.awjj.a
            awjk r0 = r0.a()
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x008a
            android.bluetooth.BluetoothAdapter r0 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            com.google.android.chimera.Activity r12 = r25.getActivity()
            android.content.Context r12 = r12.getApplicationContext()
            android.nfc.NfcAdapter r12 = android.nfc.NfcAdapter.getDefaultAdapter(r12)
            com.google.android.chimera.Activity r13 = r25.getActivity()
            android.content.Context r13 = r13.getApplicationContext()
            android.content.pm.PackageManager r13 = r13.getPackageManager()
            java.lang.String r14 = "android.hardware.usb.host"
            boolean r13 = r13.hasSystemFeature(r14)
            if (r0 == 0) goto L_0x0081
            r12 = 1
            goto L_0x00a2
        L_0x0081:
            if (r12 == 0) goto L_0x0085
        L_0x0083:
            r12 = 1
            goto L_0x00a2
        L_0x0085:
            if (r13 == 0) goto L_0x0088
            goto L_0x0083
        L_0x0088:
            r12 = 0
            goto L_0x00a2
        L_0x008a:
            android.bluetooth.BluetoothAdapter r0 = android.bluetooth.BluetoothAdapter.getDefaultAdapter()
            if (r0 != 0) goto L_0x00a1
            com.google.android.chimera.Activity r0 = r25.getActivity()
            android.content.Context r0 = r0.getApplicationContext()
            android.nfc.NfcAdapter r0 = android.nfc.NfcAdapter.getDefaultAdapter(r0)
            if (r0 == 0) goto L_0x009f
            goto L_0x00a1
        L_0x009f:
            r12 = 0
            goto L_0x00a2
        L_0x00a1:
            r12 = 1
        L_0x00a2:
            java.lang.String r0 = "device_policy"
            java.lang.Object r0 = r5.getSystemService(r0)
            android.app.admin.DevicePolicyManager r0 = (android.app.admin.DevicePolicyManager) r0
            boolean r13 = defpackage.jkr.a()
            if (r13 != 0) goto L_0x00b3
            r13 = r3
            goto L_0x00d0
        L_0x00b3:
            if (r0 == 0) goto L_0x00cf
            android.content.ComponentName r0 = r0.getProfileOwner()
            if (r0 == 0) goto L_0x00cf
            hya r13 = defpackage.hya.a((android.content.Context) r5)
            java.lang.String r14 = r0.getPackageName()
            boolean r13 = r13.b((java.lang.String) r14)
            if (r13 == 0) goto L_0x00cf
            java.lang.String r0 = r0.flattenToString()
            r13 = r0
            goto L_0x00d0
        L_0x00cf:
            r13 = r3
        L_0x00d0:
            fzl r0 = r25.b()
            fzk r14 = r
            java.lang.Object r0 = r0.a(r14, r3)
            r14 = r0
            java.lang.String r14 = (java.lang.String) r14
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x0366
            fzl r0 = r25.b()
            fzk r15 = e
            java.lang.Object r0 = r0.a(r15)
            r15 = r0
            java.lang.String r15 = (java.lang.String) r15
            fzl r0 = r25.b()
            fzk r10 = l
            java.lang.Object r0 = r0.a(r10)
            r10 = r0
            java.lang.String[] r10 = (java.lang.String[]) r10
            java.lang.String r11 = defpackage.ent.S()
            java.lang.String r3 = defpackage.ent.U()
            fzl r0 = r25.b()
            r17 = r13
            fzk r13 = m
            r18 = r7
            r7 = 0
            java.lang.Object r0 = r0.a(r13, r7)
            r13 = r0
            java.lang.String r13 = (java.lang.String) r13
            fzl r0 = r25.b()
            r19 = r6
            fzk r6 = n
            java.lang.Object r0 = r0.a(r6, r7)
            r6 = r0
            java.lang.String r6 = (java.lang.String) r6
            com.google.android.chimera.Activity r0 = r25.getActivity()     // Catch:{ NameNotFoundException -> 0x0169 }
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0169 }
            java.lang.String r7 = "com.google.android.androidforwork"
            r20 = r12
            r12 = 0
            android.content.pm.ApplicationInfo r7 = r0.getApplicationInfo(r7, r12)     // Catch:{ NameNotFoundException -> 0x0165 }
            boolean r7 = r7.enabled     // Catch:{ NameNotFoundException -> 0x0165 }
            if (r7 != 0) goto L_0x014a
            iwd r0 = d     // Catch:{ NameNotFoundException -> 0x0165 }
            java.lang.String r7 = "com.google.android.androidforwork is DISABLED on the system."
            r21 = r8
            r12 = 0
            java.lang.Object[] r8 = new java.lang.Object[r12]     // Catch:{ NameNotFoundException -> 0x0163 }
            r0.d(r7, r8)     // Catch:{ NameNotFoundException -> 0x0163 }
            r0 = 0
            r12 = 0
            goto L_0x0179
        L_0x014a:
            r21 = r8
            java.lang.String r7 = "android.software.device_admin"
            boolean r0 = r0.hasSystemFeature(r7)     // Catch:{ NameNotFoundException -> 0x0163 }
            if (r0 != 0) goto L_0x0160
            iwd r0 = d     // Catch:{ NameNotFoundException -> 0x0163 }
            java.lang.String r7 = "Device does not support Admin Feature needed by com.google.android.androidforwork"
            r8 = 0
            java.lang.Object[] r12 = new java.lang.Object[r8]     // Catch:{ NameNotFoundException -> 0x0163 }
            r0.d(r7, r12)     // Catch:{ NameNotFoundException -> 0x0163 }
            r0 = 0
            goto L_0x0161
        L_0x0160:
            r0 = 1
        L_0x0161:
            r12 = 0
            goto L_0x0179
        L_0x0163:
            r0 = move-exception
            goto L_0x016e
        L_0x0165:
            r0 = move-exception
            r21 = r8
            goto L_0x016e
        L_0x0169:
            r0 = move-exception
            r21 = r8
            r20 = r12
        L_0x016e:
            iwd r0 = d
            r12 = 0
            java.lang.Object[] r7 = new java.lang.Object[r12]
            java.lang.String r8 = "com.google.android.androidforwork is not installed on system."
            r0.d(r8, r7)
            r0 = 0
        L_0x0179:
            fzl r7 = r25.b()
            fzk r8 = h
            r27 = r0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r12)
            java.lang.Object r7 = r7.a(r8, r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            fzl r8 = r25.b()
            fzk r12 = k
            java.lang.Object r8 = r8.a(r12, r0)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            fzl r12 = r25.b()
            r23 = r8
            fzk r8 = o
            r24 = r7
            r7 = 0
            java.lang.Object r8 = r12.a(r8, r7)
            java.lang.String r8 = (java.lang.String) r8
            fzl r12 = r25.b()
            r16 = r3
            fzk r3 = p
            java.lang.Object r3 = r12.a(r3, r7)
            java.lang.String r3 = (java.lang.String) r3
            fzl r7 = r25.b()
            fzk r12 = q
            java.lang.Object r0 = r7.a(r12, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01df
            boolean r0 = defpackage.ent.ao()
            if (r0 != 0) goto L_0x01d9
            r22 = 0
            goto L_0x01e1
        L_0x01d9:
            if (r9 == 0) goto L_0x01dc
            goto L_0x01df
        L_0x01dc:
            r22 = 1
            goto L_0x01e1
        L_0x01df:
            r22 = 0
        L_0x01e1:
            boolean r0 = r1.Q
            boolean r7 = r1.G
            java.lang.String r12 = "1"
            if (r7 != 0) goto L_0x01ec
            java.lang.String r7 = "0"
            goto L_0x01ed
        L_0x01ec:
            r7 = r12
        L_0x01ed:
            int r5 = defpackage.aljh.a((android.content.Context) r5)
            android.net.Uri r14 = android.net.Uri.parse(r14)
            android.net.Uri$Builder r14 = r14.buildUpon()
            java.lang.String r1 = "source"
            if (r8 == 0) goto L_0x0201
            r14.appendQueryParameter(r1, r8)
            goto L_0x0207
        L_0x0201:
            java.lang.String r8 = "android"
            r14.appendQueryParameter(r1, r8)
        L_0x0207:
            if (r3 != 0) goto L_0x020a
            goto L_0x0210
        L_0x020a:
            java.lang.String r1 = "ltmpl"
            r14.appendQueryParameter(r1, r3)
        L_0x0210:
            java.lang.String r1 = "xoauth_display_name"
            java.lang.String r3 = "Android Phone"
            r14.appendQueryParameter(r1, r3)
            if (r15 == 0) goto L_0x021f
            java.lang.String r1 = "Email"
            r14.appendQueryParameter(r1, r15)
        L_0x021f:
            if (r10 == 0) goto L_0x022f
            int r1 = r10.length
            if (r1 <= 0) goto L_0x022f
            java.lang.String r1 = ","
            java.lang.String r1 = android.text.TextUtils.join(r1, r10)
            java.lang.String r3 = "domains"
            r14.appendQueryParameter(r3, r1)
        L_0x022f:
            boolean r1 = android.text.TextUtils.isEmpty(r13)
            if (r1 != 0) goto L_0x023a
            java.lang.String r1 = "pEmail"
            r14.appendQueryParameter(r1, r13)
        L_0x023a:
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L_0x0245
            java.lang.String r1 = "pName"
            r14.appendQueryParameter(r1, r6)
        L_0x0245:
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L_0x0250
            java.lang.String r1 = "ph"
            r14.appendQueryParameter(r1, r4)
        L_0x0250:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x025b
            java.lang.String r1 = "imsi"
            r14.appendQueryParameter(r1, r2)
        L_0x025b:
            boolean r1 = android.text.TextUtils.isEmpty(r11)
            if (r1 != 0) goto L_0x0266
            java.lang.String r1 = "d"
            r14.appendQueryParameter(r1, r11)
        L_0x0266:
            boolean r1 = android.text.TextUtils.isEmpty(r16)
            if (r1 != 0) goto L_0x0273
            java.lang.String r1 = "gae"
            r2 = r16
            r14.appendQueryParameter(r1, r2)
        L_0x0273:
            if (r21 == 0) goto L_0x027a
            java.lang.String r1 = "canFrp"
            r14.appendQueryParameter(r1, r12)
        L_0x027a:
            if (r9 == 0) goto L_0x0288
            java.lang.String r1 = "is_frp"
            r14.appendQueryParameter(r1, r12)
            java.lang.String r1 = "return_user_id"
            java.lang.String r2 = "true"
            r14.appendQueryParameter(r1, r2)
        L_0x0288:
            if (r20 == 0) goto L_0x028f
            java.lang.String r1 = "canSk"
            r14.appendQueryParameter(r1, r12)
        L_0x028f:
            if (r24 == 0) goto L_0x02a3
            java.lang.String r1 = "is_setup_wizard"
            r14.appendQueryParameter(r1, r12)
            if (r27 == 0) goto L_0x02a3
            boolean r1 = defpackage.ent.C()
            if (r1 != 0) goto L_0x02a3
            java.lang.String r1 = "afw"
            r14.appendQueryParameter(r1, r12)
        L_0x02a3:
            if (r23 != 0) goto L_0x02a6
            goto L_0x02ac
        L_0x02a6:
            java.lang.String r1 = "use_immersive_mode"
            r14.appendQueryParameter(r1, r12)
        L_0x02ac:
            java.util.Locale r1 = java.util.Locale.getDefault()
            java.lang.String r2 = r1.toLanguageTag()
            java.lang.String r3 = r1.getLanguage()
            java.lang.String r4 = "lang"
            r14.appendQueryParameter(r4, r3)
            java.lang.String r3 = r1.getLanguage()
            java.lang.String r1 = r1.getCountry()
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r1 = r1.toLowerCase(r4)
            java.lang.String r4 = java.lang.String.valueOf(r3)
            int r4 = r4.length()
            java.lang.String r6 = java.lang.String.valueOf(r1)
            int r6 = r6.length()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r9 = 1
            int r4 = r4 + r9
            int r4 = r4 + r6
            r8.<init>(r4)
            r8.append(r3)
            java.lang.String r3 = "_"
            r8.append(r3)
            r8.append(r1)
            java.lang.String r1 = r8.toString()
            java.lang.String r3 = "langCountry"
            r14.appendQueryParameter(r3, r1)
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0302
            java.lang.String r1 = "hl"
            r14.appendQueryParameter(r1, r2)
        L_0x0302:
            java.lang.String r1 = "cc"
            r2 = r19
            r14.appendQueryParameter(r1, r2)
            if (r18 == 0) goto L_0x0315
            java.lang.String r1 = java.lang.Integer.toString(r18)
            java.lang.String r2 = "mcc"
            r14.appendQueryParameter(r2, r1)
        L_0x0315:
            if (r22 == 0) goto L_0x031c
            java.lang.String r1 = "multilogin"
            r14.appendQueryParameter(r1, r12)
        L_0x031c:
            if (r0 != 0) goto L_0x0323
            java.lang.String r0 = "hide_status_bar"
            r14.appendQueryParameter(r0, r12)
        L_0x0323:
            boolean r0 = android.text.TextUtils.isEmpty(r17)
            if (r0 != 0) goto L_0x0330
            java.lang.String r0 = "profile_owner"
            r3 = r17
            r14.appendQueryParameter(r0, r3)
        L_0x0330:
            java.lang.String r0 = "use_native_navigation"
            r14.appendQueryParameter(r0, r7)
            r0 = 8388611(0x800003, float:1.1754948E-38)
            java.lang.String r1 = "alignment"
            if (r5 != r0) goto L_0x0343
            java.lang.String r0 = "start"
            r14.appendQueryParameter(r1, r0)
            goto L_0x034c
        L_0x0343:
            r0 = 17
            if (r5 != r0) goto L_0x034c
            java.lang.String r0 = "center"
            r14.appendQueryParameter(r1, r0)
        L_0x034c:
            android.net.Uri r0 = r14.build()
            java.lang.String r0 = r0.toString()
            boolean r1 = defpackage.ent.V()
            if (r1 == 0) goto L_0x0360
            r1 = r25
            r1.g(r0)
            goto L_0x0362
        L_0x0360:
            r1 = r25
        L_0x0362:
            r1.a((java.lang.String) r0)
            return
        L_0x0366:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Google sign-in endpoint URL is empty or null!"
            r0.<init>(r2)
            goto L_0x036f
        L_0x036e:
            throw r0
        L_0x036f:
            goto L_0x036e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gqa.onLoadFinished(com.google.android.chimera.Loader, java.lang.Object):void");
    }

    public final void onLoaderReset(Loader loader) {
    }

    public final void onPause() {
        mzc mzc;
        nbg nbg = this.H;
        if (nbg == null) {
            d.a("No FIDO API call to pause because the api client is null.", new Object[0]);
        } else {
            nbg.a(StateUpdate.a).a(gpc.a);
        }
        if (awmh.b() && (mzc = this.E) != null) {
            mzc.a(com.google.android.gms.fido.fido2.api.StateUpdate.b);
        }
        super.onPause();
    }

    public final void onResume() {
        mzc mzc;
        super.onResume();
        this.x = (gop) getLoaderManager().initLoader(1, (Bundle) null, new gpm(this));
        nbg nbg = this.H;
        if (nbg != null) {
            nbg.a(StateUpdate.b).a(gpa.a);
        } else {
            d.a("No FIDO API call to resume because the api client is null.", new Object[0]);
        }
        if (awmh.b() && (mzc = this.E) != null) {
            mzc.a(com.google.android.gms.fido.fido2.api.StateUpdate.c);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(SslError sslError) {
        String host = Uri.parse(sslError.getUrl()).getHost();
        d.d("SSL error while trying to connect to %s", host);
        this.t.a(getString(R.string.auth_minutemaid_ssl_error, host), "SSL error");
    }

    public final boolean c() {
        if (!this.v.canGoBack()) {
            return false;
        }
        this.v.goBack();
        return true;
    }

    public final void e(String str) {
        this.C = null;
        iwd iwd = d;
        String valueOf = String.valueOf(str);
        iwd.a(valueOf.length() == 0 ? new String("Sending result ") : "Sending result ".concat(valueOf), new Object[0]);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
        sb.append("window.setSkResult(");
        sb.append(str);
        sb.append(");");
        f(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final void a(CustomWebView customWebView) {
        this.v = customWebView;
        WebSettings settings = customWebView.getSettings();
        settings.setUserAgentString(String.valueOf(settings.getUserAgentString()).concat(" MinuteMaid"));
        if ("cn.google".equals(b().a(f))) {
            String userAgentString = settings.getUserAgentString();
            String a = jli.a("gms.auth.useragent", "");
            StringBuilder sb = new StringBuilder(String.valueOf(userAgentString).length() + 1 + String.valueOf(a).length());
            sb.append(userAgentString);
            sb.append(" ");
            sb.append(a);
            settings.setUserAgentString(sb.toString());
        }
        if (this.L) {
            d.a("Registering sms receiver...", new Object[0]);
            this.M = new MinuteMaidAuthSmsReceiver(this.v);
            getActivity().registerReceiver(this.M, new IntentFilter("android.provider.Telephony.SMS_RECEIVED"));
        }
        if (ijm.a((String) b().a(i))) {
            jix.g(getActivity());
            this.v.setSystemUiVisibility(1024);
            if (this.P.b(getActivity())) {
                this.v.setBackgroundColor(0);
                if (ent.W()) {
                    this.v.b = true;
                }
            }
            ((View) customWebView.getParent()).setOnApplyWindowInsetsListener(new gpw());
        }
        getLoaderManager().initLoader(0, (Bundle) null, this);
    }

    /* access modifiers changed from: protected */
    public final void a(CustomWebView customWebView, String str) {
        if (!ent.V()) {
            g(str);
        }
    }

    public final void a(ErrorCode errorCode) {
        d();
        mzm mzm = new mzm();
        iva.a((Object) errorCode);
        mzm.a = errorCode;
        a(new AuthenticatorErrorResponse(mzm.a.m, (String) null).a());
    }

    public final void a(com.google.android.gms.fido.u2f.api.common.ErrorCode errorCode) {
        JSONObject jSONObject;
        if (this.C == null) {
            nch nch = new nch();
            nch.a(new ErrorResponseData(errorCode));
            jSONObject = nch.a().a();
        } else {
            e();
            jSONObject = this.C.a(new ErrorResponseData(errorCode)).a();
        }
        e(jSONObject.toString());
    }

    public final void a(gok gok) {
        String a = gqc.a(gok);
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 22);
        sb.append("window.onAccountAdd(");
        sb.append(a);
        sb.append(");");
        f(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final void a(gol gol) {
        String str = gol.a;
        if (str != null) {
            this.t.a(new goz(str, gol.b), this.y, this.z, this.A, this.B, false);
        }
    }

    public final void a(JSONObject jSONObject) {
        String jSONObject2 = jSONObject.toString();
        iwd iwd = d;
        String valueOf = String.valueOf(jSONObject2);
        iwd.a(valueOf.length() == 0 ? new String("Sending fido2 result ") : "Sending fido2 result ".concat(valueOf), new Object[0]);
        StringBuilder sb = new StringBuilder(String.valueOf(jSONObject2).length() + 26);
        sb.append("window.setFido2SkResult(");
        sb.append(jSONObject2);
        sb.append(");");
        f(sb.toString());
    }
}
