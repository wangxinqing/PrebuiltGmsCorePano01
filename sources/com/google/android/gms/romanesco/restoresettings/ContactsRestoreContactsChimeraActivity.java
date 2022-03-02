package com.google.android.gms.romanesco.restoresettings;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.R;
import com.google.android.gms.common.Feature;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.romanesco.protomodel.RawContactEntity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ContactsRestoreContactsChimeraActivity extends bjs {
    public zsi a;
    public zwn b;
    public zwl c;
    public akax d;
    amsn e;
    public zsl f;
    public FastScroller g;
    public RecyclerView h;
    public SwipeRefreshLayout i;
    public String j;
    public String k;
    public String[] l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p = 2;
    private final zsg q = zsg.a("CRCCActivity");
    private abk r;
    private boolean s;

    public final void a(String str, String str2, String[] strArr, int i2) {
        zsi.a().a(true, 0, i2, 2, false);
        if (!zyk.a((Context) this)) {
            this.d.c();
            return;
        }
        if (this.d.e()) {
            this.d.d();
        }
        this.i.a(true);
        if (!this.s) {
            acwa a2 = zrc.a(getApplicationContext()).a((ihb) new zri(str, str2, strArr));
            a2.a((acvv) new zws(this));
            a2.a((acvs) new zwr(this));
        } else if (azfh.c()) {
            zrq a3 = zrc.a(getApplicationContext());
            iha b2 = ihb.b();
            b2.b = new Feature[]{zrb.c};
            b2.a = new zrf(str, str2, strArr);
            acwa a4 = a3.a(b2.a());
            a4.a((acvv) new zws(this));
            a4.a((acvs) new zwr(this));
        } else {
            this.q.d("Preview contacts for android backup not enabled");
        }
    }

    public final void e() {
        this.i.a(false);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (configuration.orientation == 2) {
            this.g.setVisibility(4);
            this.g.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        String str;
        String[] strArr;
        super.onCreate(bundle);
        setContentView((int) R.layout.romanesco_contacts_activity);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        this.h = recyclerView;
        boolean z = true;
        recyclerView.setHasFixedSize(true);
        this.o = azfa.c();
        this.n = azfh.a.a().i();
        this.m = azfh.d();
        this.g = (FastScroller) findViewById(R.id.fast_scroller);
        if (this.o) {
            if (azfa.e()) {
                this.f = zsj.a(getApplicationContext(), getApplication());
            } else {
                this.f = zsk.a(getApplicationContext(), getApplication());
            }
            this.e = amsn.a();
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh);
        this.i = swipeRefreshLayout;
        if (this.n) {
            swipeRefreshLayout.setEnabled(true);
        }
        this.i.a(R.color.material_google_blue_500);
        this.b = new zwn();
        zwo zwo = new zwo(this);
        this.r = zwo;
        this.h.setLayoutManager(zwo);
        this.h.setAdapter(this.b);
        FastScroller fastScroller = this.g;
        zwn zwn = this.b;
        abk abk = this.r;
        fastScroller.a = zwn;
        fastScroller.b = abk;
        fastScroller.c = azfh.d();
        if (Build.VERSION.SDK_INT >= 23) {
            this.h.setOnScrollChangeListener(new zwp(this));
        }
        this.i.a = new zwu(this);
        this.i.a(true);
        this.c = zwl.a();
        this.a = zsi.a();
        Intent intent = getIntent();
        if (bundle == null && (intent == null || intent.getExtras() == null)) {
            this.a.a("error:restore_contacts_activity:no_data");
            finish();
            return;
        }
        this.d = akax.a(findViewById(16908290), (int) R.string.common_no_network, -2);
        Bundle extras = intent.getExtras();
        int i2 = extras.getInt("type");
        int i3 = 2;
        if (i2 != 0) {
            i3 = i2 != 1 ? i2 != 2 ? 0 : 4 : 3;
        }
        this.p = i3;
        if (i3 == 3) {
            setTitle((int) R.string.romanesco_device_contacts_settings_title);
        } else if (i3 == 4) {
            setTitle((int) R.string.romanesco_sim_contacts_settings_title);
        }
        this.j = extras.getString("account_name");
        this.k = extras.getString("device_id");
        this.l = extras.getStringArray("sources");
        if (!intent.hasExtra("is_android_backup") || !extras.getBoolean("is_android_backup")) {
            z = false;
        }
        this.s = z;
        String str2 = this.j;
        if (str2 == null || (str = this.k) == null || (strArr = this.l) == null) {
            this.a.a("error:restore_contacts_activity:null_data");
            finish();
            return;
        }
        if (!zyk.a((Context) this)) {
            this.d.c();
            this.i.a(false);
        } else if (this.d.e()) {
            this.d.d();
        }
        int i4 = this.p;
        if (i4 == 3) {
            if (this.c.d) {
                this.i.a(false);
                a(this.c.b);
                return;
            }
        } else if (i4 == 4 && this.c.c) {
            this.i.a(false);
            a(this.c.a);
            return;
        }
        if (zyk.a((Context) this)) {
            a(str2, str, strArr, 3);
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        if (this.n) {
            menuInflater.inflate(R.menu.romanesco_restoresettings_menu_refresh, menu);
        } else {
            menuInflater.inflate(R.menu.romanesco_restoresettings_menu, menu);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.o) {
            this.f.a(this.e.a(TimeUnit.MILLISECONDS));
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        GoogleHelp googleHelp;
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            finish();
            return true;
        } else if (itemId == R.id.settings_help) {
            Uri parse = Uri.parse("https://support.google.com/nexus?p=contacts_restore");
            ThemeSettings themeSettings = new ThemeSettings();
            themeSettings.a = 1;
            if (azfh.f()) {
                googleHelp = new GoogleHelp("contacts_restore");
                googleHelp.q = parse;
                mwc mwc = new mwc((Context) this);
                mwc.c = "com.google.android.gms.contacts_restore.USER_INITIATED_FEEDBACK_REPORT";
                mwc.b(iby.a(getContainerActivity()));
                googleHelp.a(mwc.a(), getCacheDir());
                googleHelp.s = themeSettings;
            } else {
                googleHelp = new GoogleHelp("contacts_restore");
                googleHelp.q = parse;
                googleHelp.s = themeSettings;
            }
            new nyw(this).a(googleHelp.a());
            return true;
        } else if (!this.n || itemId != R.id.refresh) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            if (zyk.a((Context) this)) {
                if (this.d.e()) {
                    this.d.d();
                }
                a(this.j, this.k, this.l, 5);
            } else {
                this.d.c();
                e();
            }
            return true;
        }
    }

    public final void onPause() {
        super.onPause();
        if (this.o) {
            this.e.e();
        }
    }

    public final void onResume() {
        super.onResume();
        if (this.o) {
            this.e.d();
        }
    }

    public final void a(List list) {
        amri amri;
        int i2;
        char charAt;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            int i3 = 0;
            if (!it.hasNext()) {
                break;
            }
            String str = ((RawContactEntity) it.next()).a;
            if (!TextUtils.isEmpty(str)) {
                zyj zyj = new zyj(getApplicationContext().getResources());
                if (str != null && str.length() > 0) {
                    while (true) {
                        Integer valueOf = Integer.valueOf(i3);
                        if (valueOf.intValue() < str.length()) {
                            if (TextUtils.isGraphic(str.charAt(valueOf.intValue()))) {
                                amri = amri.b(valueOf);
                                break;
                            }
                            i3 = valueOf.intValue() + 1;
                        } else {
                            break;
                        }
                    }
                }
                amri = ampu.a;
                if (!amri.a() || (((charAt = str.charAt(((Integer) amri.b()).intValue())) < 'A' || charAt > 'Z') && (charAt < 'a' || charAt > 'z'))) {
                    zyj.d = null;
                } else {
                    zyj.d = Character.valueOf(Character.toUpperCase(str.charAt(((Integer) amri.b()).intValue())));
                }
                if (!TextUtils.isEmpty(str)) {
                    i2 = zyj.a.getColor(Math.abs(str.hashCode()) % zyj.a.length(), zyj.b);
                } else {
                    i2 = zyj.b;
                }
                zyj.c = i2;
                arrayList.add(new zwg(str, zyj));
            }
        }
        Collections.sort(arrayList, new zwq());
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int size = arrayList.size();
        char c2 = 0;
        int i4 = -1;
        for (int i5 = 0; i5 < size; i5++) {
            char charAt2 = ((zwk) arrayList.get(i5)).a().charAt(0);
            if (charAt2 == c2) {
                i4++;
            } else {
                if (i4 != -1) {
                    arrayList3.add(Integer.valueOf(i4));
                }
                arrayList2.add(Character.valueOf(charAt2));
                c2 = charAt2;
                i4 = 1;
            }
        }
        if (!arrayList.isEmpty()) {
            arrayList3.add(Integer.valueOf(i4));
        }
        zwn zwn = this.b;
        zwn.a.clear();
        zwn.a.addAll(arrayList);
        zwn.as();
    }
}
