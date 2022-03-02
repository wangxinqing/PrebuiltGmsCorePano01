package com.google.android.gms.auth.uiflows.minutemaid;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.gms.R;
import com.google.android.gms.auth.uiflows.addaccount.AccountDetail;
import com.google.android.setupcompat.internal.TemplateLayout;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class MinuteMaidChimeraActivity extends gnx implements gpx, gle, fyz {
    private static final fzk A = fzk.a("immersive_mode_requested");
    private static final fzk B = fzk.a("allowed_domains");
    private static final fzk C = fzk.a("purchaser_gaia_email");
    private static final fzk D = fzk.a("purchaser_name");
    private static final fzk E = fzk.a("package_name");
    private static final fzk F = fzk.a("login_template");
    private static final fzk G = fzk.a("is_frp_required");
    private static final fzk H = fzk.a("is_add_account_flow");
    private static final fzk I = fzk.a("resolve_frp_only");
    private static final fzk J = fzk.a("check_offers");
    private static final fzk K = fzk.a("add_account_frag");
    public static final iwd a = ehv.a("MinuteMaid", "MinuteMaidActivity");
    public static final fzk b = fzk.a("auth_code");
    public static final fzk c = fzk.a("obfuscated_gaia_id");
    public static final fzk d = fzk.a("account_name");
    public static final fzk e = fzk.a("account_password");
    public static final fzk f = fzk.a("new_account_created");
    public static final fzk g = fzk.a("terms_of_service_accepted");
    public static final fzk h = fzk.a("error_message");
    public static final fzk p = fzk.a("accounts");
    public static final fzk q = fzk.a("google_signin_url");
    private static final fzk v = fzk.a("account_name_in");
    private static final fzk w = fzk.a("account_type");
    private static final fzk x = fzk.a("is_reauth");
    private static final fzk y = fzk.a("is_setup_wizard");
    private static final fzk z = fzk.a("suppress_d2d");
    private Handler L;
    private gqa M;
    public ViewGroup r;
    fza s;
    public boolean t = false;
    public String u;

    public static Intent a(Context context, Account account, boolean z2, ijn ijn, String str) {
        Bundle bundle;
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidActivity");
        fzl fzl = new fzl();
        fzl.b(v, account.name);
        fzl.b(w, account.type);
        fzl.b(gmz.j, Boolean.valueOf(z2));
        fzk fzk = gmz.i;
        if (ijn != null) {
            bundle = ijn.a();
        } else {
            bundle = null;
        }
        fzl.b(fzk, bundle);
        fzl.b(q, str);
        return className.putExtras(fzl.a);
    }

    public static Intent b(Context context, Account account, boolean z2, ijn ijn, String str) {
        Intent a2 = a(context, account, z2, ijn, str);
        fzl fzl = new fzl();
        fzl.b(x, true);
        return a2.putExtras(fzl.a);
    }

    private final void q() {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (ekh.a.b(this)) {
            if (this.r.getChildCount() > 0) {
                ViewGroup viewGroup = this.r;
                viewGroup.removeView(viewGroup.getChildAt(0));
            }
            ViewGroup viewGroup2 = this.r;
            viewGroup2.addView(LayoutInflater.from(this).inflate(R.layout.auth_tv_suw_glif_activity, viewGroup2, false));
            a(4, (String) null);
            return;
        }
        fza fza = this.s;
        if (fza != null) {
            this.r.removeView((View) fza);
        }
        boolean a2 = ijm.a(g().a);
        LayoutInflater from = LayoutInflater.from(this);
        if (!a2) {
            i = R.layout.auth_generic_suw_activity;
        } else {
            i = R.layout.auth_generic_suw_glif_activity;
        }
        fza fza2 = (fza) from.inflate(i, (ViewGroup) null, false);
        this.s = fza2;
        fza2.a(getText(R.string.auth_gls_name_checking_info_title));
        this.s.b();
        if (!((Boolean) f().a(gmz.j, false)).booleanValue()) {
            this.s.a(jjd.a(awiw.b()));
        }
        this.s.a();
        this.s.a((fyz) this);
        if (awku.c()) {
            this.m = (fzd) this.s;
        } else if (((Boolean) f().a(gmz.j, false)).booleanValue()) {
            this.s.a(getWindow());
        } else {
            this.s.a(getWindow(), this);
        }
        this.r.addView((View) this.s);
        a(4, (String) null);
    }

    private final void r() {
        if (!((Boolean) f().a(gmz.j, false)).booleanValue() || !((Boolean) f().a(A, true)).booleanValue()) {
            Window window = getWindow();
            if (awku.c()) {
                fzd fzd = this.m;
                if (fzd != null) {
                    fzd.b(window, this);
                }
            } else if (!awku.b()) {
                fza fza = this.s;
                if (fza instanceof TemplateLayout) {
                    ((alhk) ((TemplateLayout) fza).a(alhk.class)).a(window, this);
                }
            } else {
                fza fza2 = this.s;
                if (fza2 != null) {
                    fza2.a(window, this);
                }
            }
        } else {
            Window window2 = getWindow();
            if (awku.c()) {
                fzd fzd2 = this.m;
                if (fzd2 != null) {
                    fzd2.b(window2);
                }
            } else if (!awku.b()) {
                fza fza3 = this.s;
                if (fza3 instanceof TemplateLayout) {
                    alhk alhk = (alhk) ((TemplateLayout) fza3).a(alhk.class);
                    alhk.a(window2);
                }
            } else {
                fza fza4 = this.s;
                if (fza4 != null) {
                    fza4.a(window2);
                }
            }
        }
    }

    private final void s() {
        a(1, (Intent) null);
    }

    private final void t() {
        a(0, (Intent) null);
    }

    private final void u() {
        Fragment findFragmentByTag = getSupportFragmentManager().findFragmentByTag("AddAccountFragment");
        if (findFragmentByTag != null) {
            getSupportFragmentManager().beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
        }
        f().b(K, false);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0058, code lost:
        if (r0.equals("material") != false) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void aI() {
        /*
            r5 = this;
            ekh r0 = defpackage.ekh.a
            boolean r0 = r0.b(r5)
            if (r0 == 0) goto L_0x000f
            ekh r0 = defpackage.ekh.a
            r1 = 0
            r0.a(r5, r1)
            return
        L_0x000f:
            ijn r0 = r5.g()
            boolean r0 = r0.c
            if (r0 == 0) goto L_0x001c
            super.aI()
            goto L_0x00c4
        L_0x001c:
            ijn r0 = r5.g()
            java.lang.String r0 = r0.a
            fzl r1 = r5.f()
            fzk r2 = defpackage.gmz.j
            r3 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r3)
            java.lang.Object r1 = r1.a(r2, r4)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            r4 = 2132018098(0x7f1403b2, float:1.9674493E38)
            if (r2 != 0) goto L_0x00b0
            int r2 = r0.hashCode()
            switch(r2) {
                case -2128555920: goto L_0x008d;
                case -1270463490: goto L_0x0083;
                case -1241052239: goto L_0x0079;
                case 3175618: goto L_0x006f;
                case 115650329: goto L_0x0065;
                case 115650330: goto L_0x005b;
                case 299066663: goto L_0x0052;
                case 767685465: goto L_0x0048;
                default: goto L_0x0047;
            }
        L_0x0047:
            goto L_0x0097
        L_0x0048:
            java.lang.String r2 = "glif_light"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0097
            r3 = 3
            goto L_0x0098
        L_0x0052:
            java.lang.String r2 = "material"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0097
            goto L_0x0098
        L_0x005b:
            java.lang.String r2 = "glif_v3"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0097
            r3 = 6
            goto L_0x0098
        L_0x0065:
            java.lang.String r2 = "glif_v2"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0097
            r3 = 4
            goto L_0x0098
        L_0x006f:
            java.lang.String r2 = "glif"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0097
            r3 = 2
            goto L_0x0098
        L_0x0079:
            java.lang.String r2 = "glif_v3_light"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0097
            r3 = 7
            goto L_0x0098
        L_0x0083:
            java.lang.String r2 = "material_light"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0097
            r3 = 1
            goto L_0x0098
        L_0x008d:
            java.lang.String r2 = "glif_v2_light"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L_0x0097
            r3 = 5
            goto L_0x0098
        L_0x0097:
            r3 = -1
        L_0x0098:
            switch(r3) {
                case 0: goto L_0x00ac;
                case 1: goto L_0x00ac;
                case 2: goto L_0x00a8;
                case 3: goto L_0x00a8;
                case 4: goto L_0x00a4;
                case 5: goto L_0x00a4;
                case 6: goto L_0x00a0;
                case 7: goto L_0x00a0;
                default: goto L_0x009b;
            }
        L_0x009b:
            int r3 = defpackage.ijm.b(r0)
            goto L_0x00b1
        L_0x00a0:
            r3 = 2132018095(0x7f1403af, float:1.9674487E38)
            goto L_0x00b1
        L_0x00a4:
            r3 = 2132018092(0x7f1403ac, float:1.967448E38)
            goto L_0x00b1
        L_0x00a8:
            r3 = 2132018089(0x7f1403a9, float:1.9674475E38)
            goto L_0x00b1
        L_0x00ac:
            r3 = 2132018098(0x7f1403b2, float:1.9674493E38)
            goto L_0x00b1
        L_0x00b0:
        L_0x00b1:
            if (r3 == 0) goto L_0x00b7
            r5.setTheme(r3)
            goto L_0x00bb
        L_0x00b7:
            r5.setTheme(r4)
        L_0x00bb:
            if (r1 == 0) goto L_0x00c4
            android.view.Window r0 = r5.getWindow()
            defpackage.alhs.a(r0)
        L_0x00c4:
            boolean r0 = defpackage.awku.c()
            if (r0 != 0) goto L_0x00cd
            r5.r()
        L_0x00cd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidChimeraActivity.aI():void");
    }

    /* access modifiers changed from: protected */
    public final String b() {
        return "MinuteMaidActivity";
    }

    public final void c() {
        throw new UnsupportedOperationException("To be implemented");
    }

    public final void e() {
        this.M.a(new gok("", 2));
        u();
    }

    public final void l() {
        if (!this.t) {
            runOnUiThread(new gow(this));
        }
    }

    public final void n() {
        t();
    }

    public final void o() {
        s();
    }

    public final void onBackPressed() {
        if (!this.M.c()) {
            t();
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.t) {
            q();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        Boolean bool;
        View view;
        int i;
        MinuteMaidChimeraActivity minuteMaidChimeraActivity = this;
        super.onCreate(bundle);
        goc goc = minuteMaidChimeraActivity.l;
        if (goc.c == null) {
            goc.c = anpp.f.o();
            aucd j = j();
            if (j.c) {
                j.c();
                j.c = false;
            }
            anon anon = (anon) j.b;
            anon anon2 = anon.v;
            anon.c = 15;
            anon.a |= 1;
            String str = (String) f().a(w);
            if ("com.google".equals(str)) {
                i = 2;
            } else if ("com.google.work".equals(str)) {
                i = 3;
            } else if (!"cn.google".equals(str)) {
                iwd iwd = a;
                String valueOf = String.valueOf(str);
                iwd.d(valueOf.length() == 0 ? new String("Unknown account type: ") : "Unknown account type: ".concat(valueOf), new Object[0]);
                i = 1;
            } else {
                i = 4;
            }
            aucd aucd = minuteMaidChimeraActivity.l.c;
            if (aucd.c) {
                aucd.c();
                aucd.c = false;
            }
            anpp anpp = (anpp) aucd.b;
            anpp.b = i - 1;
            anpp.a |= 1;
            if (((Boolean) f().a(y, false)).booleanValue()) {
                aucd aucd2 = minuteMaidChimeraActivity.l.c;
                if (aucd2.c) {
                    aucd2.c();
                    aucd2.c = false;
                }
                anpp anpp2 = (anpp) aucd2.b;
                anpp2.e = 1;
                anpp2.a |= 8;
            }
        }
        minuteMaidChimeraActivity.u = getTitle().toString();
        minuteMaidChimeraActivity.L = new qvr();
        minuteMaidChimeraActivity.setContentView((int) R.layout.auth_minute_maid_activity);
        minuteMaidChimeraActivity.r = (ViewGroup) minuteMaidChimeraActivity.findViewById(R.id.interstitial_layout);
        View findViewById = minuteMaidChimeraActivity.findViewById(R.id.minute_maid);
        q();
        gqa gqa = (gqa) getSupportFragmentManager().findFragmentByTag("mm");
        minuteMaidChimeraActivity.M = gqa;
        if (gqa == null) {
            boolean z2 = g().c;
            boolean booleanValue = ((Boolean) f().a(x, false)).booleanValue();
            boolean booleanValue2 = ((Boolean) f().a(y, false)).booleanValue();
            boolean booleanValue3 = ((Boolean) f().a(gmz.j, false)).booleanValue();
            String str2 = g().a;
            view = findViewById;
            boolean booleanValue4 = ((Boolean) f().a(H, false)).booleanValue();
            bool = false;
            gqa gqa2 = new gqa();
            fzl fzl = new fzl();
            fzl.b(gqa.e, (String) f().a(v));
            fzl.b(gqa.f, (String) f().a(w));
            fzl.b(gqa.j, Boolean.valueOf(z2));
            fzl.b(gqa.g, Boolean.valueOf(booleanValue));
            fzl.b(gqa.h, Boolean.valueOf(booleanValue2));
            fzl.b(gqa.k, Boolean.valueOf(booleanValue3));
            fzl.b(gqa.l, (String[]) f().a(B));
            fzl.b(gqa.m, (String) f().a(C, (Object) null));
            fzl.b(gqa.n, (String) f().a(D, (Object) null));
            fzl.b(gqa.i, str2);
            fzl.b(gqa.o, (String) f().a(E, (Object) null));
            fzl.b(gqa.p, (String) f().a(F, (Object) null));
            fzl.b(gqa.q, Boolean.valueOf(booleanValue4));
            fzl.b(gqa.r, (String) f().a(q, (Object) null));
            gqa gqa3 = gqa2;
            gqa3.setArguments(fzl.a);
            minuteMaidChimeraActivity = this;
            minuteMaidChimeraActivity.M = gqa3;
            getSupportFragmentManager().beginTransaction().add(R.id.minute_maid, minuteMaidChimeraActivity.M, "mm").commit();
        } else {
            view = findViewById;
            bool = false;
        }
        minuteMaidChimeraActivity.findViewById(R.id.container).setOnApplyWindowInsetsListener(new got(minuteMaidChimeraActivity, view));
        if (((Boolean) f().a(gmz.j, bool)).booleanValue()) {
            new gqe(minuteMaidChimeraActivity).b.add(new goy(minuteMaidChimeraActivity));
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        this.L.removeCallbacksAndMessages((Object) null);
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        if (!this.t) {
            this.L.postDelayed(new gou(this), ent.T());
        }
    }

    public final void p() {
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage("com.google.android.androidforwork");
        if (launchIntentForPackage != null) {
            a.c("Starting Android for Work", new Object[0]);
            launchIntentForPackage.putExtra("com.google.android.androidforwork.PROVISIONING_TYPE", "device_owner");
            launchIntentForPackage.setFlags(33554432);
            startActivity(launchIntentForPackage);
            finish();
            return;
        }
        a.e("Could not find intent for Android for Work!", new Object[0]);
        aucd aucd = this.l.c;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anpp anpp = (anpp) aucd.b;
        anpp anpp2 = anpp.f;
        anpp.d = 3;
        anpp.a |= 4;
        a(2, (Intent) null);
    }

    public final void m() {
        AccountDetail[] accountDetailArr = (AccountDetail[]) f().a(p);
        if (accountDetailArr == null || accountDetailArr.length == 0) {
            a.d("No accounts on finish", new Object[0]);
            a(1, (Intent) null);
            return;
        }
        Intent intent = new Intent();
        fzl fzl = new fzl();
        fzl.b(p, accountDetailArr);
        a(3, intent.putExtras(fzl.a));
    }

    public final void b(boolean z2) {
        runOnUiThread(new gox(this, z2));
    }

    public static Intent a(Context context, String str, boolean z2, boolean z3, boolean z4, ijn ijn, String[] strArr, String str2, String str3, String str4, String str5, String str6, boolean z5, boolean z6, boolean z7, boolean z8, String str7) {
        Bundle bundle;
        Context context2 = context;
        Intent className = new Intent().setClassName(context, "com.google.android.gms.auth.uiflows.minutemaid.MinuteMaidActivity");
        fzl fzl = new fzl();
        String str8 = str;
        fzl.b(w, str);
        fzl.b(y, Boolean.valueOf(z2));
        fzl.b(z, Boolean.valueOf(z3));
        fzl.b(gmz.j, Boolean.valueOf(z4));
        fzk fzk = gmz.i;
        if (ijn != null) {
            bundle = ijn.a();
        } else {
            bundle = null;
        }
        fzl.b(fzk, bundle);
        String[] strArr2 = strArr;
        fzl.b(B, strArr);
        String str9 = str2;
        fzl.b(v, str2);
        String str10 = str3;
        fzl.b(C, str3);
        String str11 = str4;
        fzl.b(D, str4);
        String str12 = str5;
        fzl.b(E, str5);
        String str13 = str6;
        fzl.b(F, str6);
        fzl.b(G, Boolean.valueOf(z5));
        fzl.b(I, Boolean.valueOf(z6));
        fzl.b(J, Boolean.valueOf(z7));
        fzl.b(H, Boolean.valueOf(z8));
        fzl.b(q, str7);
        return className.putExtras(fzl.a);
    }

    public final void a() {
        s();
    }

    public final void a(int i) {
        throw new UnsupportedOperationException("To be implemented");
    }

    public final void a(int i, String str) {
        findViewById(R.id.minute_maid).setImportantForAccessibility(i);
        setTitle((CharSequence) str);
    }

    public final void a(Account account, String str, boolean z2, Intent intent, boolean z3, String str2) {
        AccountDetail[] accountDetailArr;
        Account account2 = account;
        iwd iwd = a;
        String valueOf = String.valueOf(account);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 14);
        sb.append("Account added:");
        sb.append(valueOf);
        iwd.a(sb.toString(), new Object[0]);
        AccountDetail accountDetail = new AccountDetail(account2.name, account2.type, ((Boolean) f().a(f, false)).booleanValue(), str, z2, intent, str2, z3);
        AccountDetail[] accountDetailArr2 = (AccountDetail[]) f().a(p);
        int i = 1;
        if (accountDetailArr2 != null) {
            int length = accountDetailArr2.length;
            accountDetailArr = (AccountDetail[]) Arrays.copyOf(accountDetailArr2, length + 1);
            accountDetailArr[length] = accountDetail;
        } else {
            accountDetailArr = new AccountDetail[]{accountDetail};
        }
        f().b(p, accountDetailArr);
        if (str != null) {
            i = 3;
        }
        this.M.a(new gok(account2.name, i));
        u();
    }

    public final void a(goz goz, String str, String str2, boolean z2, boolean z3, boolean z4) {
        goz goz2 = goz;
        String str3 = str;
        aucd aucd = this.l.c;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anpp anpp = (anpp) aucd.b;
        anpp anpp2 = anpp.f;
        anpp.a |= 2;
        anpp.c = z2;
        if (isFinishing()) {
            a.a("finishing early - onCredentialsAvailable called twice", new Object[0]);
        } else if (z4) {
            f().b(b, goz2.a);
            f().b(c, goz2.b);
            f().b(f, Boolean.valueOf(z2));
            f().b(g, Boolean.valueOf(z3));
            f().b(d, str);
            f().b(K, true);
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag("AddAccountFragment");
            if (findFragmentByTag != null) {
                a.a("AddAccountFragment already exists before adding account", new Object[0]);
                supportFragmentManager.beginTransaction().remove(findFragmentByTag).commitAllowingStateLoss();
            }
            glf.a(this, true, ((Boolean) f().a(I, false)).booleanValue(), (String) f().a(w), goz2.a, goz2.b, (String) f().a(d), z3, ((Boolean) f().a(J, false)).booleanValue(), g().c);
        } else {
            Intent intent = new Intent();
            fzl fzl = new fzl();
            fzl.b(b, goz2.a);
            fzl.b(c, goz2.b);
            fzl.b(d, str);
            String str4 = str2;
            fzl.b(e, str2);
            fzl.b(f, Boolean.valueOf(z2));
            fzl.b(g, Boolean.valueOf(z3));
            a(-1, intent.putExtras(fzl.a));
        }
    }

    public final void a(String str, String str2) {
        iwd iwd = a;
        String valueOf = String.valueOf(str2);
        iwd.e(valueOf.length() == 0 ? new String("Error from MinuteMaidFragment: ") : "Error from MinuteMaidFragment: ".concat(valueOf), new Object[0]);
        aucd aucd = this.l.c;
        if (aucd.c) {
            aucd.c();
            aucd.c = false;
        }
        anpp anpp = (anpp) aucd.b;
        anpp anpp2 = anpp.f;
        anpp.d = 1;
        anpp.a |= 4;
        Intent intent = new Intent();
        fzl fzl = new fzl();
        fzl.b(h, str);
        a(2, intent.putExtras(fzl.a));
    }

    public final void a(boolean z2) {
        f().b(A, Boolean.valueOf(z2));
        r();
    }
}
