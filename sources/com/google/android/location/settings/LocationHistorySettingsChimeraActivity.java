package com.google.android.location.settings;

import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.Html;
import android.text.SpannableString;
import android.text.format.DateFormat;
import android.text.method.LinkMovementMethod;
import android.text.style.URLSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.location.LocationRequest;
import com.google.android.location.reporting.server.RemoteDevice;
import com.google.android.location.reporting.state.update.AccountConfig;
import com.google.android.location.ui.widget.DeviceSwitch;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class LocationHistorySettingsChimeraActivity extends ajol implements ajpk, ajoh {
    public Button e;
    public int f;
    private Button g;
    private boolean h;
    private UlrSettingsChangeReceiver i;
    private LayoutInflater j;
    private int k;
    private ConnectivityManager l;
    private View m;
    private View n;

    /* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
    class UlrSettingsChangeReceiver extends nla {
        public UlrSettingsChangeReceiver() {
            super("location");
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(android.content.Context r8, android.content.Intent r9) {
            /*
                r7 = this;
                java.lang.String r8 = r9.getAction()
                int r0 = r8.hashCode()
                r1 = 0
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                java.lang.String r6 = "com.google.android.gms.location.reporting.INITIALIZATION_CHANGED"
                switch(r0) {
                    case -1848594810: goto L_0x003b;
                    case -1239299127: goto L_0x0031;
                    case -1172645946: goto L_0x0027;
                    case -177095062: goto L_0x001d;
                    case 187057876: goto L_0x0013;
                    default: goto L_0x0012;
                }
            L_0x0012:
                goto L_0x0043
            L_0x0013:
                java.lang.String r0 = "com.google.android.location.settings.REMOTE_CHANGED"
                boolean r0 = r8.equals(r0)
                if (r0 == 0) goto L_0x0043
                r0 = 4
                goto L_0x0044
            L_0x001d:
                java.lang.String r0 = "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE"
                boolean r0 = r8.equals(r0)
                if (r0 == 0) goto L_0x0043
                r0 = 3
                goto L_0x0044
            L_0x0027:
                java.lang.String r0 = "android.net.conn.CONNECTIVITY_CHANGE"
                boolean r0 = r8.equals(r0)
                if (r0 == 0) goto L_0x0043
                r0 = 1
                goto L_0x0044
            L_0x0031:
                java.lang.String r0 = "com.google.android.gms.location.reporting.SETTINGS_CHANGED"
                boolean r0 = r8.equals(r0)
                if (r0 == 0) goto L_0x0043
                r0 = 2
                goto L_0x0044
            L_0x003b:
                boolean r0 = r8.equals(r6)
                if (r0 == 0) goto L_0x0043
                r0 = 0
                goto L_0x0044
            L_0x0043:
                r0 = -1
            L_0x0044:
                if (r0 == 0) goto L_0x009c
                if (r0 == r5) goto L_0x0099
                if (r0 == r4) goto L_0x0099
                if (r0 == r3) goto L_0x0092
                java.lang.String r1 = "GCoreLocationSettings"
                if (r0 == r2) goto L_0x006a
                java.lang.String r8 = java.lang.String.valueOf(r8)
                java.lang.String r9 = "Unexpected intent: "
                int r0 = r8.length()
                if (r0 != 0) goto L_0x0062
                java.lang.String r8 = new java.lang.String
                r8.<init>(r9)
                goto L_0x0066
            L_0x0062:
                java.lang.String r8 = r9.concat(r8)
            L_0x0066:
                android.util.Log.e(r1, r8)
                return
            L_0x006a:
                android.accounts.Account r8 = defpackage.ajmj.a(r9)
                if (r8 == 0) goto L_0x007a
                com.google.android.location.settings.LocationHistorySettingsChimeraActivity r9 = com.google.android.location.settings.LocationHistorySettingsChimeraActivity.this
                android.accounts.Account r9 = r9.c
                boolean r9 = r8.equals(r9)
                if (r9 == 0) goto L_0x008b
            L_0x007a:
                com.google.android.location.settings.LocationHistorySettingsChimeraActivity r9 = com.google.android.location.settings.LocationHistorySettingsChimeraActivity.this
                r9.j()
                if (r8 != 0) goto L_0x008b
                java.lang.Exception r8 = new java.lang.Exception
                r8.<init>()
                java.lang.String r9 = "REMOTE_CHANGED received without an account"
                android.util.Log.wtf(r1, r9, r8)
            L_0x008b:
                java.lang.String r8 = "UlrUiChangedDeviceSettingByRemote"
                defpackage.ajjb.a((java.lang.String) r8)
                return
            L_0x0092:
                com.google.android.location.settings.LocationHistorySettingsChimeraActivity r8 = com.google.android.location.settings.LocationHistorySettingsChimeraActivity.this
            L_0x0095:
                r8.j()
                return
            L_0x0099:
                com.google.android.location.settings.LocationHistorySettingsChimeraActivity r8 = com.google.android.location.settings.LocationHistorySettingsChimeraActivity.this
                goto L_0x0095
            L_0x009c:
                java.lang.String r8 = r9.getAction()
                boolean r8 = r6.equals(r8)
                r0 = 0
                if (r8 == 0) goto L_0x00b9
                java.lang.String r8 = "initialization"
                boolean r2 = r9.hasExtra(r8)
                if (r2 == 0) goto L_0x00b9
                int r8 = r9.getIntExtra(r8, r1)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
                goto L_0x00ba
            L_0x00b9:
            L_0x00ba:
                android.accounts.Account r8 = defpackage.ajmj.a(r9)
                if (r0 == 0) goto L_0x00d9
                if (r8 == 0) goto L_0x00d9
                com.google.android.location.settings.LocationHistorySettingsChimeraActivity r9 = com.google.android.location.settings.LocationHistorySettingsChimeraActivity.this
                android.accounts.Account r9 = r9.c
                boolean r8 = r8.equals(r9)
                if (r8 == 0) goto L_0x00d9
                com.google.android.location.settings.LocationHistorySettingsChimeraActivity r8 = com.google.android.location.settings.LocationHistorySettingsChimeraActivity.this
                int r9 = r0.intValue()
                r8.f = r9
                com.google.android.location.settings.LocationHistorySettingsChimeraActivity r8 = com.google.android.location.settings.LocationHistorySettingsChimeraActivity.this
                r8.j()
            L_0x00d9:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.location.settings.LocationHistorySettingsChimeraActivity.UlrSettingsChangeReceiver.a(android.content.Context, android.content.Intent):void");
        }
    }

    private final void a(Account account) {
        if (account != null) {
            ajls.a(this, "LocationHistorySettingsChimeraActivity", account);
        }
    }

    private final void d(String str) {
        startActivityForResult(new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", 227).putExtra("extra.accountName", str), 102);
    }

    private final void e(String str) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e2) {
            Log.e("GCoreLocationSettings", str.length() == 0 ? new String("can't show ") : "can't show ".concat(str), e2);
        }
    }

    private final void g(boolean z) {
        this.h = z;
        String a = ajnm.a();
        ajlk ajlk = this.b;
        if (ajlk != null) {
            ajlk.b(this.c, k(), this.h, a);
            ajjb.a("UlrUiChangedAccountSetting", this.h);
        }
    }

    private final void h(boolean z) {
        String str;
        try {
            g(z);
            j();
        } catch (RemoteException e2) {
            if (!z) {
                str = "Starting Location history";
            } else {
                str = "Pausing";
            }
            Log.wtf("GCoreLocationSettings", str, e2);
        }
    }

    private final void i(boolean z) {
        if (z && !rns.b(this)) {
            LocationRequest a = LocationRequest.a();
            a.c(100);
            rnt rnt = new rnt();
            rnt.a.add(a);
            rnt.b = true;
            startActivityForResult(rnt.a(), 0);
        }
    }

    private final String k() {
        Uri referrer;
        if (Build.VERSION.SDK_INT < 22 || (referrer = getReferrer()) == null) {
            return null;
        }
        return referrer.getHost();
    }

    private final AccountConfig l() {
        Account account;
        ajlk ajlk = this.b;
        if (ajlk == null || (account = this.c) == null) {
            return null;
        }
        try {
            AccountConfig a = ajlk.a(account);
            if (a.b) {
                this.f = 1;
            }
            return a;
        } catch (RemoteException e2) {
            ajjf.a(e2);
            Log.wtf("GCoreLocationSettings", e2);
            return null;
        }
    }

    private final void m() {
        AccountConfig l2 = l();
        if (l2 != null) {
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.this_device);
            linearLayout.removeAllViews();
            this.k = l2.n;
            boolean z = true;
            if (!l2.c() && l2.s != 2) {
                z = false;
            }
            boolean z2 = l2.e;
            ajky ajky = new ajky(this.k);
            ajky.b = l2.o;
            ajky.c = Boolean.valueOf(z);
            ajky.d = Boolean.valueOf(z2);
            ajky.e = l2.q;
            ajky.f = Long.valueOf(l2.i);
            RemoteDevice remoteDevice = new RemoteDevice(ajky);
            boolean z3 = l2.m.e;
            String str = null;
            if (z2 && !z3) {
                str = getString(R.string.location_ulr_settings_not_reporting_because_location_off);
            }
            a(linearLayout, remoteDevice, str);
        }
    }

    public final void b(String str) {
        if (((str.hashCode() == 1384328227 && str.equals("ConfirmHistoryOffDialog")) ? (char) 0 : 65535) == 0) {
            h(true);
            ajjb.a("UlrUiLHDialogButtonCancel");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void c(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            r1 = -1833605732(0xffffffff92b5659c, float:-1.1447755E-27)
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L_0x001b
            r1 = 1384328227(0x52832c23, float:2.81690604E11)
            if (r0 == r1) goto L_0x0011
            goto L_0x0025
        L_0x0011:
            java.lang.String r0 = "ConfirmHistoryOffDialog"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0025
            r5 = 0
            goto L_0x0026
        L_0x001b:
            java.lang.String r0 = "ConfirmDeleteLocationHistoryDialog"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0025
            r5 = 1
            goto L_0x0026
        L_0x0025:
            r5 = -1
        L_0x0026:
            if (r5 == 0) goto L_0x006a
            if (r5 == r2) goto L_0x002b
            return
        L_0x002b:
            android.widget.Button r5 = r4.e
            r0 = 2131953156(0x7f130604, float:1.9542775E38)
            r5.setText(r0)
            android.widget.Button r5 = r4.e
            r5.setEnabled(r3)
            ajoq r5 = new ajoq
            r5.<init>(r4, r4)
            android.os.Messenger r0 = new android.os.Messenger
            r0.<init>(r5)
            android.accounts.Account r5 = r4.c
            java.lang.Class<com.google.android.location.reporting.server.DeleteHistoryIntentOperation> r1 = com.google.android.location.reporting.server.DeleteHistoryIntentOperation.class
            java.lang.String r2 = "com.google.android.location.reporting.service.action.DELETE_HISTORY"
            android.content.Intent r1 = com.google.android.chimera.IntentOperation.getStartIntent((android.content.Context) r4, (java.lang.Class) r1, (java.lang.String) r2)
            if (r1 == 0) goto L_0x0064
            defpackage.iva.a((java.lang.Object) r5)
            java.lang.String r2 = "account"
            r1.putExtra(r2, r5)
            java.lang.String r5 = "messenger"
            r1.putExtra(r5, r0)
            defpackage.ajnw.a((android.content.Context) r4, (android.content.Intent) r1)
            java.lang.String r5 = "UlrUiHistoryDeleted"
            defpackage.ajjb.a((java.lang.String) r5)
            return
        L_0x0064:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            r5.<init>()
            throw r5
        L_0x006a:
            r4.h(r3)
            java.lang.String r5 = "UlrUiLHDialogButtonOk"
            defpackage.ajjb.a((java.lang.String) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.location.settings.LocationHistorySettingsChimeraActivity.c(java.lang.String):void");
    }

    /* access modifiers changed from: protected */
    public final void f(boolean z) {
        if (!z) {
            ajoi.a(R.string.location_settings_confirm_location_history_pause_title, R.string.location_settings_confirm_location_history_pause_body, 17039370, 17039360).show(getSupportFragmentManager(), "ConfirmHistoryOffDialog");
            return;
        }
        g(true);
        i(true);
    }

    public final void j() {
        if (!aztb.u()) {
            boolean z = false;
            if (((ahxz) this.a).b.length > 0) {
                if (this.m.getVisibility() != 0) {
                    this.m.setVisibility(0);
                    a(0);
                    this.n.setVisibility(8);
                }
                AccountConfig l2 = l();
                if (l2 != null) {
                    TextView textView = (TextView) findViewById(R.id.other_devices_status_text);
                    View findViewById = findViewById(R.id.devices_section);
                    View findViewById2 = findViewById(R.id.no_devices_section);
                    boolean z2 = true;
                    if (!ajnw.a((Context) this, l2)) {
                        b(false);
                        if (!l2.k && this.l.getActiveNetworkInfo() != null) {
                            z = true;
                        }
                        a(ajnw.a((Context) this, l2, this.f), z);
                        String valueOf = String.valueOf(rmp.a(this.c));
                        Log.i("GCoreLocationSettings", valueOf.length() == 0 ? new String("Location History unavailable for account ") : "Location History unavailable for account ".concat(valueOf));
                        return;
                    }
                    f();
                    b(true);
                    if (l2.s == 2) {
                        z2 = false;
                    }
                    this.e.setEnabled(z2);
                    this.g.setEnabled(z2);
                    if (!z2) {
                        TextView textView2 = (TextView) findViewById(R.id.summary_text_kids);
                        textView2.setVisibility(0);
                        textView2.setText(Html.fromHtml(getString(R.string.location_settings_location_history_learn_more_kids)));
                        textView2.setMovementMethod(LinkMovementMethod.getInstance());
                    } else {
                        findViewById(R.id.summary_text_kids).setVisibility(8);
                    }
                    if (this.h) {
                        textView.setText(R.string.common_loading);
                        findViewById.setVisibility(0);
                        findViewById2.setVisibility(8);
                        m();
                        new ajor(this).execute(new Void[0]);
                        return;
                    }
                    a((String) null, false);
                }
            } else if (this.n.getVisibility() != 0) {
                a(8);
                this.m.setVisibility(8);
                this.n.setVisibility(0);
                findViewById(R.id.add_account).setOnClickListener(new ajop(this));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        String stringExtra;
        if (i2 != 101) {
            if (i2 != 102) {
                StringBuilder sb = new StringBuilder(57);
                sb.append("onActivityResult received unknown requestCode ");
                sb.append(i2);
                Log.e("GCoreLocationSettings", sb.toString());
                finish();
                return;
            }
            if (i3 != -1) {
                StringBuilder sb2 = new StringBuilder(43);
                sb2.append("UDC activity failed, resultCode=");
                sb2.append(i3);
                Log.e("GCoreLocationSettings", sb2.toString());
            }
            finish();
        } else if (i3 != -1) {
            if (i3 == 0) {
                finish();
            }
        } else if (intent != null && (stringExtra = intent.getStringExtra("authAccount")) != null) {
            d(stringExtra);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ajjb.a((Context) this);
        ajjd.a((Context) this);
        if (!jjy.a(this)) {
            Log.wtf("GCoreLocationSettings", "LocationHistorySettingsChimeraActivity should not have been called", new Exception());
            finish();
        } else if (ajoz.a(this)) {
            finish();
        } else if (!aztb.u()) {
            setContentView((int) R.layout.location_history_reporting_settings);
            this.m = findViewById(R.id.account_settings);
            this.n = findViewById(R.id.no_accounts);
            this.e = (Button) findViewById(R.id.delete_location_history);
            this.g = (Button) findViewById(R.id.manage_activities);
            TextView textView = (TextView) findViewById(R.id.summary_text);
            URLSpan[] urls = textView.getUrls();
            if (urls.length > 0) {
                URLSpan uRLSpan = urls[0];
                SpannableString spannableString = new SpannableString(textView.getText());
                int spanStart = spannableString.getSpanStart(uRLSpan);
                int spanEnd = spannableString.getSpanEnd(uRLSpan);
                int spanFlags = spannableString.getSpanFlags(uRLSpan);
                spannableString.removeSpan(uRLSpan);
                spannableString.setSpan(new ajoo(this), spanStart, spanEnd, spanFlags);
                textView.setText(spannableString);
            }
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            this.i = null;
            this.f = 0;
            this.j = (LayoutInflater) getSystemService("layout_inflater");
            this.l = (ConnectivityManager) getSystemService("connectivity");
            ajjb.a("UlrUiShown");
        } else if (aztk.b()) {
            startActivityForResult(new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", 227), 102);
        } else {
            Account account = this.c;
            if (account == null || account.name == null) {
                String[] strArr = {"com.google"};
                startActivityForResult(hwy.a((Account) null, (ArrayList) null, strArr, false, getString(R.string.location_settings_location_history_activity_title), false, 1, 2, (String) null, false), 101);
                return;
            }
            d(this.c.name);
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.location_history, menu);
        return true;
    }

    public void onDeleteLocationHistoryClicked(View view) {
        ajoi a = ajoi.a(R.string.location_settings_confirm_deleting_location_history_title, R.string.location_settings_confirm_deleting_location_history_body, R.string.common_ui_confirm_deleting_button, 17039360);
        a.getArguments().putInt("enablingCheckbox", R.string.common_ui_confirm_deleting_checkbox);
        a.show(getSupportFragmentManager(), "ConfirmDeleteLocationHistoryDialog");
        ajjb.a("UlrUiHistoryDeleteClicked");
    }

    public void onManageActivitiesClicked(View view) {
        ajjb.a("UlrUiManageActivitiesClicked");
        Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("google.maps.timeline", "", (String) null));
        intent.setComponent(new ComponentName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity"));
        Account account = this.c;
        if (account != null) {
            intent.putExtra("account_name", account.name);
        } else {
            Log.wtf("GCoreLocationSettings", "Account null when timeline pressed", new Exception());
        }
        try {
            startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            ajjb.a("UlrUiCannotCallMaps");
            this.e.setVisibility(0);
            this.g.setVisibility(8);
            Log.wtf("GCoreLocationSettings", "Failed to call Maps", e2);
        }
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.view_manage) {
            e("https://www.google.com/locationhistory");
            return true;
        } else if (menuItem.getItemId() == R.id.help) {
            e("https://support.google.com/accounts/answer/3118687");
            return true;
        } else if (menuItem.getItemId() != 16908332) {
            return false;
        } else {
            finish();
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onPause() {
        UlrSettingsChangeReceiver ulrSettingsChangeReceiver = this.i;
        if (ulrSettingsChangeReceiver == null) {
            Log.e("GCoreLocationSettings", "cannot unregister UlrReceiver, it is null");
        } else {
            unregisterReceiver(ulrSettingsChangeReceiver);
            this.i = null;
        }
        ajjb.b();
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        int parseInt;
        super.onResume();
        if (!aztb.u()) {
            UlrSettingsChangeReceiver ulrSettingsChangeReceiver = new UlrSettingsChangeReceiver();
            this.i = ulrSettingsChangeReceiver;
            LocationHistorySettingsChimeraActivity locationHistorySettingsChimeraActivity = LocationHistorySettingsChimeraActivity.this;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.gms.location.reporting.SETTINGS_CHANGED");
            intentFilter.addAction("com.google.android.gms.location.reporting.INITIALIZATION_CHANGED");
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            intentFilter.addAction("com.google.android.location.settings.REMOTE_CHANGED");
            intentFilter.addAction("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE");
            intentFilter.addCategory("com.google.android.gms.auth.category.ACCOUNT_ADDED");
            intentFilter.addCategory("com.google.android.gms.auth.category.ACCOUNT_REMOVED");
            intentFilter.addCategory("com.google.android.gms.auth.category.ACCOUNT_MUTATED");
            locationHistorySettingsChimeraActivity.registerReceiver(ulrSettingsChangeReceiver, intentFilter);
            this.e.setVisibility(0);
            this.g.setVisibility(8);
            if (aztb.a.a().aw()) {
                try {
                    int applicationEnabledSetting = getPackageManager().getApplicationEnabledSetting("com.google.android.apps.maps");
                    if (applicationEnabledSetting == 1 || applicationEnabledSetting == 0) {
                        try {
                            String str = jni.b(this).b("com.google.android.apps.maps", 0).versionName;
                            if (!(str == null || str.length() == 0)) {
                                String[] split = str.split("\\.");
                                if (split.length >= 2 && ((parseInt = Integer.parseInt(split[0])) != 9 ? parseInt > 9 : Integer.parseInt(split[1]) >= 20)) {
                                    this.e.setVisibility(8);
                                    this.g.setVisibility(0);
                                }
                            }
                        } catch (PackageManager.NameNotFoundException | NumberFormatException e2) {
                        }
                    }
                } catch (IllegalArgumentException e3) {
                }
                ajjb.a("UlrUiMapsNotInstalled");
            }
            j();
            a(this.c);
        }
    }

    private final void a(ViewGroup viewGroup, RemoteDevice remoteDevice, String str) {
        String str2;
        if (remoteDevice != null) {
            DeviceSwitch deviceSwitch = (DeviceSwitch) this.j.inflate(R.layout.location_reporting_device_switch, viewGroup, false);
            deviceSwitch.a = remoteDevice;
            View findViewById = deviceSwitch.findViewById(R.id.location_device_switch);
            iva.a((Object) findViewById);
            deviceSwitch.b = (CompoundButton) findViewById;
            ProgressBar progressBar = (ProgressBar) deviceSwitch.findViewById(R.id.progress_bar);
            iva.a((Object) progressBar);
            deviceSwitch.c = progressBar;
            TextView textView = (TextView) deviceSwitch.findViewById(R.id.device_name);
            iva.a((Object) textView);
            deviceSwitch.d = textView;
            TextView textView2 = (TextView) deviceSwitch.findViewById(R.id.last_report_date);
            iva.a((Object) textView2);
            deviceSwitch.e = textView2;
            if (aztb.A()) {
                deviceSwitch.b.setVisibility(4);
            }
            deviceSwitch.d.setText(deviceSwitch.a.b);
            Long l2 = deviceSwitch.a.e;
            if (l2 != null) {
                str2 = deviceSwitch.getContext().getString(R.string.location_reporting_last_reported, new Object[]{DateFormat.getMediumDateFormat(deviceSwitch.getContext().getApplicationContext()).format(new Date(l2.longValue()))});
            } else {
                str2 = deviceSwitch.getContext().getString(R.string.location_reporting_last_reported_unknown);
            }
            if (str != null) {
                String valueOf = String.valueOf(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + str.length());
                sb.append(valueOf);
                sb.append(10);
                sb.append(str);
                str2 = sb.toString();
            }
            deviceSwitch.e.setText(str2);
            deviceSwitch.b.setChecked(deviceSwitch.a.d);
            boolean z = !deviceSwitch.a.c;
            deviceSwitch.setEnabled(z);
            deviceSwitch.d.setEnabled(z);
            deviceSwitch.e.setEnabled(z);
            deviceSwitch.b.setEnabled(z);
            if (deviceSwitch.isEnabled() && !aztb.A()) {
                deviceSwitch.setOnClickListener(deviceSwitch);
                deviceSwitch.b.setOnCheckedChangeListener(deviceSwitch);
            }
            deviceSwitch.f = this;
            viewGroup.addView(deviceSwitch);
        }
    }

    public final /* bridge */ /* synthetic */ ajok e() {
        return new ajov(this);
    }

    /* access modifiers changed from: protected */
    public final void h() {
        this.f = 0;
        a(this.c);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.other_devices);
        linearLayout.removeAllViewsInLayout();
        linearLayout.invalidate();
        j();
    }

    public final String i() {
        return getResources().getString(R.string.location_settings_location_history_summary_full);
    }

    private final void a(String str, boolean z) {
        View findViewById = findViewById(R.id.devices_section);
        View findViewById2 = findViewById(R.id.no_devices_section);
        View findViewById3 = findViewById(R.id.extra_status_section);
        int i2 = 8;
        findViewById.setVisibility(8);
        if (str != null) {
            TextView textView = (TextView) findViewById(R.id.extra_status_text);
            findViewById3.setVisibility(0);
            if (z) {
                str = getString(R.string.location_settings_ulr_summary_auth_error);
            }
            textView.setText(str);
            TextView textView2 = (TextView) findViewById(R.id.retry_view);
            textView2.setOnClickListener(new ajos(this));
            textView2.setClickable(true);
            textView2.setEnabled(true);
            if (z) {
                i2 = 0;
            }
            textView2.setVisibility(i2);
            findViewById(R.id.retry_view_divider).setVisibility(i2);
        } else {
            findViewById3.setVisibility(8);
        }
        TextView textView3 = (TextView) findViewById(R.id.full_text);
        textView3.setText(Html.fromHtml(i()));
        textView3.setMovementMethod(LinkMovementMethod.getInstance());
        findViewById2.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    public final int a(AccountConfig accountConfig) {
        int b = accountConfig.b();
        this.h = rma.a(b);
        return b;
    }

    public final void a(int i2, String str) {
        ajoi a = ajoi.a(0, i2, 17039370, 0);
        a.getArguments().putBoolean("process_html", true);
        a.show(getSupportFragmentManager(), str);
    }

    public final void a(RemoteDevice remoteDevice, boolean z) {
        if (this.b == null) {
            Log.w("GCoreLocationSettings", "Device switch changed but no preference service");
        } else if (this.k == remoteDevice.a) {
            try {
                this.b.a(this.c, k(), z, ajnm.a());
            } catch (RemoteException e2) {
                Log.wtf("GCoreLocationSettings", "Pref service failed for this device", e2);
            }
            i(z);
            m();
            ajjb.a("UlrUiChangedDeviceSettingForThis", z);
        } else {
            ajjb.a("UlrUiChangedDeviceSettingForRemote", z);
            new ajot(this, remoteDevice, z).execute(new Void[0]);
        }
    }

    public final void a(String str) {
        if (((str.hashCode() == 1384328227 && str.equals("ConfirmHistoryOffDialog")) ? (char) 0 : 65535) == 0) {
            h(true);
            ajjb.a("UlrUiLHDialogCancel");
        }
    }

    public final void a(List list) {
        int i2;
        View findViewById = findViewById(R.id.other_devices_section);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.other_devices);
        View findViewById2 = findViewById(R.id.other_devices_status);
        TextView textView = (TextView) findViewById(R.id.other_devices_status_text);
        linearLayout.setVisibility(8);
        linearLayout.removeAllViewsInLayout();
        if (list == null) {
            NetworkInfo activeNetworkInfo = this.l.getActiveNetworkInfo();
            int i3 = this.f;
            if (i3 != 1) {
                i2 = ajnp.a(i3);
            } else {
                i2 = activeNetworkInfo == null ? R.string.location_settings_ulr_summary_offline : R.string.location_settings_ulr_summary_error;
            }
            textView.setText(i2);
            findViewById2.setVisibility(0);
        } else if (list.isEmpty()) {
            findViewById.setVisibility(8);
        } else {
            findViewById2.setVisibility(8);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a(linearLayout, (RemoteDevice) it.next(), (String) null);
            }
            linearLayout.setVisibility(0);
            findViewById.setVisibility(0);
        }
    }
}
