package com.google.android.gms.plus.apps;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.chimera.FragmentManager;
import com.google.android.chimera.FragmentTransaction;
import com.google.android.gms.R;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.people.data.Audience;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.internal.model.apps.AppAclsEntity;
import com.google.android.gms.plus.internal.model.apps.ApplicationEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ManageAppChimeraActivity extends bjs implements View.OnClickListener, AccountManagerCallback, ica, icb, yuk, yuj, yul, ynb, ynd, ynk, yum, ymv {
    private static final List a = Collections.emptyList();
    private Account b;
    private String c;
    private String d;
    private String e;
    private String f;
    private ApplicationEntity g;
    private AppAclsEntity h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private View o;
    private TextView p;
    private View q;
    private TextView r;
    private AppAclsEntity s;
    private AppAclsEntity t;
    private boolean u;
    private boolean v;
    private yne w;
    private final yui x;
    private yuv y;
    private String z;

    public ManageAppChimeraActivity() {
        this(yuv.a);
    }

    private static final AppAclsEntity a(AppAclsEntity appAclsEntity, Audience audience, ArrayList arrayList, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str, String str2, Integer num) {
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i2;
        ywo ywo = new ywo();
        if (audience == null) {
            audience = appAclsEntity.c;
        }
        ywo.b = audience;
        if (arrayList == null) {
            arrayList = appAclsEntity.d;
        }
        ywo.c = arrayList;
        if (bool == null) {
            z2 = appAclsEntity.e;
        } else {
            z2 = bool.booleanValue();
        }
        ywo.d = z2;
        if (bool2 == null) {
            z3 = appAclsEntity.f;
        } else {
            z3 = bool2.booleanValue();
        }
        ywo.e = z3;
        if (bool3 == null) {
            z4 = appAclsEntity.g;
        } else {
            z4 = bool3.booleanValue();
        }
        ywo.f = z4;
        if (bool4 == null) {
            z5 = appAclsEntity.h;
        } else {
            z5 = bool4.booleanValue();
        }
        ywo.g = z5;
        if (str == null) {
            str = appAclsEntity.j;
        }
        ywo.i = str;
        if (str2 == null) {
            str2 = appAclsEntity.k;
        }
        ywo.j = str2;
        if (num == null) {
            i2 = appAclsEntity.i;
        } else {
            i2 = num.intValue();
        }
        ywo.h = i2;
        ywo.a = appAclsEntity.b;
        return ywo.a();
    }

    private final void b(boolean z2) {
        this.q.setEnabled(z2);
    }

    private final void e() {
        findViewById(R.id.loading_spinner).setVisibility(8);
        findViewById(R.id.content_view).setVisibility(0);
    }

    private final ApplicationEntity f() {
        boolean booleanExtra = getIntent().getBooleanExtra("com.google.android.gms.plus.APP_IS_ASPEN", true);
        boolean booleanExtra2 = getIntent().getBooleanExtra("com.google.android.gms.plus.APP_HAS_CONN_READ", false);
        boolean booleanExtra3 = getIntent().getBooleanExtra("com.google.android.gms.plus.APP_IS_FITNESS", false);
        String stringExtra = getIntent().getStringExtra("com.google.android.gms.plus.APP_PACKAGE");
        String stringExtra2 = getIntent().getStringExtra("com.google.android.gms.plus.APP_REVOKE_MESSAGE");
        if (stringExtra != null) {
            PackageManager packageManager = getPackageManager();
            try {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(stringExtra, 0);
                if (applicationInfo != null) {
                    return new ApplicationEntity(packageManager.getApplicationLabel(applicationInfo).toString(), (String) null, this.c, applicationInfo, booleanExtra, this.e, this.f, booleanExtra2, booleanExtra3, stringExtra2);
                }
            } catch (PackageManager.NameNotFoundException e2) {
            }
        }
        String stringExtra3 = getIntent().getStringExtra("com.google.android.gms.plus.APP_NAME");
        if (!TextUtils.isEmpty(stringExtra3)) {
            return new ApplicationEntity(stringExtra3, getIntent().getStringExtra("com.google.android.gms.plus.APP_ICON_URL"), this.c, (ApplicationInfo) null, booleanExtra, this.e, this.f, booleanExtra2, booleanExtra3, stringExtra2);
        } else if (!Log.isLoggable("AppSettings", 5)) {
            return null;
        } else {
            Log.w("AppSettings", "Missing required EXTRA_APP_NAME");
            return null;
        }
    }

    private final void h() {
        znf znf = (znf) getSupportFragmentManager().findFragmentByTag("progress_dialog");
        if (znf != null) {
            znf.dismissAllowingStateLoss();
        }
    }

    private final void i() {
        if ((this.i && this.g.g) || this.g.j) {
            aE().b((int) R.drawable.plus_icon_red_32);
            View findViewById = findViewById(R.id.pacl_layout);
            this.o = findViewById;
            findViewById.setOnClickListener(this);
            this.p = (TextView) findViewById(R.id.pacl_label);
            this.q = findViewById(R.id.facl_layout);
            this.r = (TextView) findViewById(R.id.facl_label);
        }
        j();
        k();
    }

    private final void j() {
        if (this.e != null) {
            ((TextView) findViewById(R.id.scopes_label)).setText(this.e);
            findViewById(R.id.scopes_layout).setVisibility(0);
            findViewById(R.id.scopes_divider).setVisibility(0);
        }
    }

    private final void k() {
        if (this.f != null) {
            findViewById(R.id.disconnect_divider).setVisibility(0);
            View findViewById = findViewById(R.id.disconnect_layout);
            findViewById.setVisibility(0);
            findViewById.setOnClickListener(this);
            ((TextView) findViewById(R.id.disconnect_label)).setText(R.string.plus_manage_app_disconnect_label);
            return;
        }
        findViewById(R.id.disconnect_divider).setVisibility(8);
        findViewById(R.id.disconnect_layout).setVisibility(8);
    }

    private final void l() {
        setResult(1);
        finish();
    }

    public final void a(int i2) {
    }

    public final void g(Bundle bundle) {
        ymx.a();
        if (!ymx.b(this, 3)) {
            if ((!this.i || !this.g.g) && !this.g.j) {
                e();
            } else if (this.h == null && !this.l) {
                this.l = true;
                this.m = false;
                this.y.a((yuk) this, this.c, this.g);
            } else {
                AppAclsEntity appAclsEntity = this.s;
                if (appAclsEntity != null) {
                    this.y.a((yuj) this, this.c, appAclsEntity.c);
                } else {
                    AppAclsEntity appAclsEntity2 = this.t;
                    if (appAclsEntity2 != null) {
                        this.y.a(this, this.c, this.g, appAclsEntity2.d, appAclsEntity2.e, appAclsEntity2.f, appAclsEntity2.g, appAclsEntity2.h);
                    }
                }
            }
            if (this.f == null && !this.n) {
                this.n = true;
                this.y.a((yum) this, ((Integer) ysu.y.c()).intValue(), this.z);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        Audience audience;
        if (i2 == 0) {
            a(true);
            if (i3 == -1) {
                AppAclsEntity appAclsEntity = this.h;
                if (appAclsEntity != null) {
                    audience = appAclsEntity.c;
                } else {
                    audience = null;
                }
                if (audience == null) {
                    audience = new iww().a();
                }
                ArrayList f2 = iia.f(intent);
                iww iww = new iww(audience);
                iww.a((Collection) f2);
                Audience a2 = iww.a();
                a(getString(R.string.plus_manage_app_updating_acl));
                ywo ywo = new ywo();
                ywo.b = a2;
                this.s = ywo.a();
            }
        } else if (i2 == 1) {
            b(true);
            if (i3 != -1) {
                return;
            }
            if (this.u || this.v) {
                a(getString(R.string.plus_manage_app_updating_acl));
                iia a3 = iig.a(intent);
                ywo ywo2 = new ywo();
                ywo2.c = a3.c();
                ywo2.d = a3.a();
                ywo2.e = a3.b();
                ywo2.f = this.u;
                ywo2.g = this.v;
                this.t = ywo2.a();
            }
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.pacl_layout) {
            a(false);
            List list = this.h.c.b;
            if (list == null) {
                list = a;
            }
            iia a2 = ihz.a();
            a2.a(this.b.name);
            a2.b(list);
            a2.b(getString(R.string.plus_manage_app_pacl_sub_label));
            a2.d(String.valueOf(auuv.GOOGLE_SETTINGS.iZ));
            startActivityForResult(a2.a, 0);
            a(iak.b);
        } else if (id == R.id.facl_layout) {
            b(false);
            AppAclsEntity appAclsEntity = this.h;
            List list2 = appAclsEntity.d;
            boolean z2 = appAclsEntity.e;
            boolean z3 = appAclsEntity.f;
            boolean z4 = appAclsEntity.g;
            boolean z5 = appAclsEntity.h;
            String str = appAclsEntity.i != 0 ? "GOOGLE_PLUS" : "GOOGLE";
            String str2 = appAclsEntity.j;
            if (list2 == null) {
                list2 = a;
            }
            iia a3 = iig.a();
            a3.a(this.b.name);
            a3.b(list2);
            a3.a(z2);
            a3.b(z3);
            a3.c(true);
            a3.d(z4);
            a3.e(z5);
            a3.a.putExtra("TITLE_LOGO", str);
            a3.b(str2);
            a3.d(String.valueOf(auuv.GOOGLE_SETTINGS.iZ));
            startActivityForResult(a3.a, 1);
            a(iak.a);
        } else if (id != R.id.disconnect_layout) {
            throw new IllegalArgumentException();
        } else if (this.k) {
            Account account = this.b;
            ApplicationEntity applicationEntity = this.g;
            String a4 = jhg.a((Activity) this);
            boolean z6 = this.i;
            Bundle bundle = new Bundle();
            bundle.putParcelable("account", account);
            bundle.putParcelable("application", ApplicationEntity.a(applicationEntity));
            bundle.putString("calling_package_name", a4);
            bundle.putBoolean("signed_up", z6);
            ync ync = new ync();
            ync.setArguments(bundle);
            ync.show(getSupportFragmentManager(), "disconnect_source_dialog");
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (jgu.e(this)) {
            Log.w("AppSettings", "This activity is not available for restricted profile.");
            setResult(0);
            finish();
            return;
        }
        String a2 = jhg.a((Activity) this);
        this.d = a2;
        if (a2 == null || !hya.a((Context) this).b(this.d)) {
            setResult(0);
            finish();
            return;
        }
        if (bundle != null) {
            this.b = (Account) bundle.getParcelable("account");
            this.c = bundle.getString("app_id");
            this.g = (ApplicationEntity) bundle.getParcelable("app_entity");
            this.h = (AppAclsEntity) bundle.getParcelable("app_acls");
            this.l = bundle.getBoolean("app_acls_loading");
            this.m = bundle.getBoolean("app_acls_loaded");
            this.s = (AppAclsEntity) bundle.getParcelable("pacl_to_write");
            this.t = (AppAclsEntity) bundle.getParcelable("facl_to_write");
            this.u = bundle.getBoolean("facl_show_circles");
            this.v = bundle.getBoolean("facl_show_contacts");
            this.e = bundle.getString("scopes");
            this.f = bundle.getString("revoke_handle");
            if (bundle.containsKey("is_signed_up")) {
                this.i = bundle.getBoolean("is_signed_up");
                this.j = true;
            }
        }
        if (this.b == null || this.c == null) {
            this.b = (Account) getIntent().getParcelableExtra("com.google.android.gms.plus.ACCOUNT");
            this.c = getIntent().getStringExtra("com.google.android.gms.plus.APP_ID");
            this.e = getIntent().getStringExtra("com.google.android.gms.plus.APP_SCOPES");
            this.f = getIntent().getStringExtra("com.google.android.gms.plus.APP_REVOKE_HANDLE");
        }
        Account account = this.b;
        if (account == null || this.c == null) {
            if (Log.isLoggable("AppSettings", 5)) {
                Log.w("AppSettings", String.format("Missing required extra(s): account=%s appId=%s", new Object[]{this.b, this.c}));
            }
            l();
            return;
        }
        iws.a(this, account.name, new String[]{"service_googleme"}, this);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        yne yne = (yne) supportFragmentManager.findFragmentByTag("disconnect_source_fragment");
        this.w = yne;
        if (yne == null) {
            Account account2 = this.b;
            yui yui = yuv.a;
            yne yne2 = new yne();
            yne2.a = yui;
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("account", account2);
            yne2.setArguments(bundle2);
            this.w = yne2;
            FragmentTransaction beginTransaction = supportFragmentManager.beginTransaction();
            beginTransaction.add((Fragment) this.w, "disconnect_source_fragment");
            beginTransaction.commit();
        }
        ApplicationEntity f2 = f();
        this.g = f2;
        if (f2 == null) {
            l();
            return;
        }
        yls a3 = ylt.a((Context) this).a((yxi) this.g);
        if (a3.c && this.g.c != null) {
            ynl a4 = ynl.a((Context) this);
            a4.a((ynk) this);
            ApplicationEntity applicationEntity = this.g;
            a4.a(applicationEntity, applicationEntity.c);
        }
        setContentView((int) R.layout.plus_manage_app_activity);
        if (this.m) {
            e();
        }
        sg aE = aE();
        if (this.g.g) {
            aE.c((int) R.string.plus_manage_aspen_app_label);
        } else {
            aE.c((int) R.string.plus_manage_app_label);
        }
        aE.b(true);
        ((TextView) findViewById(R.id.app_name)).setText(a3.a);
        ((ImageView) findViewById(R.id.app_icon)).setImageDrawable(a3.b);
        i();
        ymx.a();
        if (ymx.b(this, 3)) {
            FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            if (supportFragmentManager2.findFragmentByTag("disabled_dialog") == null) {
                CharSequence a5 = ymx.a(this, 3);
                Bundle bundle3 = new Bundle();
                bundle3.putCharSequence("message", a5);
                ymw ymw = new ymw();
                ymw.setArguments(bundle3);
                ymw.show(supportFragmentManager2, "disabled_dialog");
            }
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, 1, 0, R.string.common_list_apps_menu_help);
        return super.onCreateOptionsMenu(menu);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 1) {
            return super.onOptionsItemSelected(menuItem);
        }
        Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse((String) ysu.s.c()));
        if (!jhg.a((Context) this, data)) {
            iah.a(this, data, 2);
        } else {
            startActivity(data);
        }
        return true;
    }

    public final void onPause() {
        super.onPause();
        yuv yuv = this.y;
        if (yuv != null && (yuv.l() || this.y.m())) {
            this.y.j();
        }
        this.k = false;
    }

    public final void onResumeFragments() {
        super.onResumeFragments();
        yuv yuv = this.y;
        if (yuv != null && !yuv.l() && !this.y.m()) {
            this.y.t();
        }
        this.k = true;
        yne yne = this.w;
        if (yne.h) {
            yne.b(yne.g);
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("account", this.b);
        bundle.putString("app_id", this.c);
        bundle.putParcelable("app_entity", this.g);
        bundle.putParcelable("app_acls", this.h);
        bundle.putBoolean("app_acls_loading", this.l);
        bundle.putBoolean("app_acls_loaded", this.m);
        bundle.putParcelable("pacl_to_write", this.s);
        bundle.putParcelable("facl_to_write", this.t);
        bundle.putBoolean("facl_show_circles", this.u);
        bundle.putBoolean("facl_show_contacts", this.v);
        if (this.j) {
            bundle.putBoolean("is_signed_up", this.i);
        }
    }

    public final void run(AccountManagerFuture accountManagerFuture) {
        this.j = true;
        try {
            this.i = ((Boolean) accountManagerFuture.getResult()).booleanValue();
        } catch (Exception e2) {
        }
        i();
        if (this.i) {
            this.y = ymb.a(this.x, this, this, this, this.b.name);
        } else {
            this.y = ymb.b(this.x, this, this, this, this.b.name);
        }
        if (this.k) {
            this.y.t();
        }
    }

    public ManageAppChimeraActivity(yui yui) {
        this.x = yui;
    }

    public final boolean aF() {
        setResult(0);
        finish();
        return true;
    }

    public final void b(ConnectionResult connectionResult) {
        String str;
        h();
        if (!connectionResult.b()) {
            Toast.makeText(this, R.string.plus_manage_app_acl_error, 0).show();
            this.s = null;
            this.t = null;
            return;
        }
        AppAclsEntity appAclsEntity = this.s;
        if (appAclsEntity != null) {
            this.h = a(this.h, appAclsEntity.c, (ArrayList) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, (String) null, (Integer) null);
            Audience audience = this.s.c;
            if (audience != null) {
                TextView textView = this.p;
                List list = audience.b;
                if (list == null || list.isEmpty()) {
                    str = getString(R.string.plus_manage_app_only_you_label);
                } else if (list.size() == 1) {
                    str = ((AudienceMember) list.get(0)).f;
                    if (TextUtils.isEmpty(str)) {
                        str = getString(R.string.plus_manage_app_limited_label);
                    }
                } else {
                    AudienceMember audienceMember = null;
                    AudienceMember audienceMember2 = null;
                    AudienceMember audienceMember3 = null;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        AudienceMember audienceMember4 = (AudienceMember) list.get(i2);
                        int i3 = audienceMember4.b;
                        if (i3 == 1 && audienceMember4.c == 1) {
                            audienceMember = audienceMember4;
                        } else if (i3 == 1 && audienceMember4.c == 4) {
                            audienceMember2 = audienceMember4;
                        } else if (i3 == 1 && audienceMember4.c == 2) {
                            audienceMember3 = audienceMember4;
                        }
                    }
                    str = audienceMember != null ? a(audienceMember.f, (int) R.string.common_chips_label_public) : audienceMember2 != null ? a(audienceMember2.f, (int) R.string.plus_manage_app_extended_circles_label) : (audience.c == 1 && audienceMember3 != null) ? a(audienceMember3.f, (int) R.string.plus_manage_app_domain_label) : getString(R.string.plus_manage_app_limited_label);
                }
                textView.setText(str);
            } else {
                this.p.setVisibility(8);
            }
            a(iak.d, ian.a(this.s.c));
            this.s = null;
        }
    }

    private final String a(String str, int i2) {
        return TextUtils.isEmpty(str) ? getString(i2) : str;
    }

    private final void a(FavaDiagnosticsEntity favaDiagnosticsEntity) {
        a(favaDiagnosticsEntity, (ClientActionDataEntity) null);
    }

    private final void a(FavaDiagnosticsEntity favaDiagnosticsEntity, ClientActionDataEntity clientActionDataEntity) {
        izq izq = new izq((Context) this);
        izq.a(this.b.name);
        izq.a(favaDiagnosticsEntity);
        izq.c(this.g.g ? ial.e : ial.f);
        izq.b(this.d);
        if (clientActionDataEntity != null) {
            izq.a(clientActionDataEntity);
        }
        izr.a(this, izq);
    }

    private final void a(String str) {
        znf a2 = znf.a((CharSequence) str);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.add((Fragment) a2, "progress_dialog");
        beginTransaction.commitAllowingStateLoss();
    }

    private final void a(boolean z2) {
        this.o.setEnabled(z2);
        this.q.setEnabled(z2);
    }

    public final void b(ConnectionResult connectionResult, AppAclsEntity appAclsEntity) {
        this.l = false;
        this.m = true;
        if (connectionResult.b()) {
            this.h = appAclsEntity;
            this.u = appAclsEntity.g;
            this.v = appAclsEntity.h;
        } else if (Log.isLoggable("AppSettings", 5)) {
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("Failed to load application ACLs: ");
            sb.append(valueOf);
            Log.w("AppSettings", sb.toString());
        }
        e();
    }

    public final void a() {
        finish();
    }

    public final void a(ConnectionResult connectionResult) {
        l();
    }

    public final void a(ConnectionResult connectionResult, AppAclsEntity appAclsEntity) {
        h();
        if (connectionResult.b()) {
            AppAclsEntity a2 = a(this.h, (Audience) null, appAclsEntity.d, Boolean.valueOf(appAclsEntity.e), Boolean.valueOf(appAclsEntity.f), Boolean.valueOf(appAclsEntity.g), Boolean.valueOf(appAclsEntity.h), appAclsEntity.j, appAclsEntity.k, Integer.valueOf(appAclsEntity.i));
            this.h = a2;
            if (a2.a()) {
                this.r.setText(a2.k);
            } else {
                this.r.setVisibility(8);
            }
            a(iak.c, ian.a(appAclsEntity.d, appAclsEntity.e, appAclsEntity.f));
        } else {
            Toast.makeText(this, R.string.plus_manage_app_acl_error, 0).show();
        }
        this.t = null;
    }

    public final void a(ConnectionResult connectionResult, yxj yxj, String str) {
        int i2 = 0;
        this.n = false;
        if (yxj != null && connectionResult.b()) {
            int a2 = yxj.a();
            while (true) {
                if (i2 >= a2) {
                    break;
                }
                yxi b2 = yxj.a(i2);
                if (this.c.equals(b2.c())) {
                    this.e = b2.g();
                    this.f = b2.h();
                    this.g = f();
                    j();
                    k();
                    break;
                }
                i2++;
            }
            if (this.f == null && str != null) {
                this.n = true;
                this.z = str;
                this.y.a((yum) this, ((Integer) ysu.y.c()).intValue(), str);
            }
        }
    }

    public final void a(yxi yxi, Drawable drawable) {
        if (drawable != null) {
            ((ImageView) findViewById(R.id.app_icon)).setImageDrawable(drawable);
            ylt.a((Context) this).a(yxi, drawable);
        }
    }

    public final void a(yxi yxi, boolean z2) {
        yne yne = this.w;
        if (!yne.d) {
            yne.d = true;
            yne.e = ApplicationEntity.a(yxi);
            yne.f = z2;
            if (yne.b.l()) {
                yne.g(Bundle.EMPTY);
            } else if (!yne.c) {
                yne.b.t();
                yne.c = true;
            }
            a(getString(R.string.plus_disconnect_source_progress_dialog_message, new Object[]{ylt.a((Context) this).a(yxi).a}));
            return;
        }
        if (Log.isLoggable("DisconnectSource", 5)) {
            Log.w("DisconnectSource", "Can only disconnect one app at a time.");
        }
        znd.a(getString(R.string.plus_disconnect_source_failed_dialog_message, new Object[]{yxi.a()})).show(getSupportFragmentManager(), "error_dialog");
    }

    public final boolean a(ConnectionResult connectionResult, yxi yxi) {
        ApplicationInfo d2;
        if (this.k) {
            h();
            if (connectionResult == null || !connectionResult.b()) {
                znd a2 = znd.a(getString(R.string.plus_disconnect_source_failed_dialog_message, new Object[]{yxi.a()}));
                try {
                    FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
                    beginTransaction.add((Fragment) a2, "error_dialog");
                    beginTransaction.commit();
                } catch (IllegalStateException e2) {
                }
            } else {
                if (yxi.f() && (d2 = yxi.d()) != null && !TextUtils.isEmpty(d2.packageName)) {
                    Intent b2 = itg.b(d2.packageName, this.b.name);
                    String valueOf = String.valueOf(b2);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
                    sb.append("Broadcasting Fitness app disconnected intent: ");
                    sb.append(valueOf);
                    sb.toString();
                    sendBroadcast(b2);
                }
                Intent intent = new Intent();
                intent.putExtra("com.google.android.gms.plus.DISCONNECTED_APP_ID", yxi.c());
                setResult(-1, intent);
                finish();
            }
            return true;
        }
        return false;
    }
}
