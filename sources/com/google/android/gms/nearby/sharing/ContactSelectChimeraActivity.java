package com.google.android.gms.nearby.sharing;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.common.Feature;
import com.google.android.gms.nearby.sharing.view.SelectionSlider;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class ContactSelectChimeraActivity extends bjs implements vug, vvw {
    public final Handler a = new qvr();
    public Runnable b;
    public SearchView c;
    public SelectionSlider d;
    public vus e;
    public View f;
    public vuk g;
    public View h;
    public vts i;
    private View j;
    private View k;
    private wir l;
    private wir m;
    private View n;
    private boolean o = false;
    private as p;
    private final BroadcastReceiver q = new nla("nearby") {
        public final void a(Context context, Intent intent) {
            ContactSelectChimeraActivity.this.e();
        }
    };

    public static Intent a(Context context) {
        return new Intent().addFlags(131072).setClassName(context, "com.google.android.gms.nearby.sharing.ContactSelectActivity");
    }

    private final boolean h() {
        if (getCallingActivity() != null) {
            return getCallingActivity().getClassName().equals("com.google.android.gms.nearby.sharing.SetupActivity");
        }
        return false;
    }

    public final void b(Contact contact) {
        vts vts = this.i;
        iha b2 = ihb.b();
        b2.a = new vsz(contact);
        b2.b = new Feature[]{tcm.a};
        vts.b(b2.a());
    }

    public final void e() {
        int i2;
        invalidateOptionsMenu();
        View findViewById = findViewById(R.id.nav_bar);
        if (!h()) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        findViewById.setVisibility(i2);
        this.f.setVisibility(8);
        this.h.setVisibility(8);
        this.n.setVisibility(0);
        this.i.r().a((acvv) new viu(this));
    }

    public final vts f() {
        if (this.i == null) {
            this.i = tcn.c(this);
        }
        return this.i;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i2, int i3, Intent intent) {
        if (i2 != 1004) {
            super.onActivityResult(i2, i3, intent);
            return;
        }
        if (i3 != -1) {
            this.i.a(0);
        }
        e();
    }

    public final void onBackPressed() {
        SearchView searchView = this.c;
        if (!searchView.p) {
            searchView.a(true);
        } else {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!ayni.p()) {
            this.o = true;
            finish();
            return;
        }
        setContentView((int) R.layout.sharing_activity_contact_select);
        this.j = findViewById(R.id.visibility_hidden_description);
        this.k = findViewById(R.id.contactbook_body);
        this.f = findViewById(R.id.contacts_view);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.contactbook_list);
        this.n = findViewById(R.id.loading_spinner);
        this.h = findViewById(R.id.no_contacts_view);
        a((Toolbar) findViewById(R.id.toolbar));
        boolean z = !h();
        aE().b(z);
        aE().a(z);
        aE().e((int) R.string.sharing_settings_home_as_up_description);
        this.i = f();
        findViewById(R.id.continue_button).setOnClickListener(new vio(this));
        recyclerView.setLayoutManager(new abk());
        vuk vuk = new vuk(this, this);
        vuk.a(true);
        this.g = vuk;
        recyclerView.setAdapter(vuk);
        wir wir = new wir(this, R.string.sharing_contact_select_recommended_contacts_header);
        this.l = wir;
        wir.a = -1;
        recyclerView.addItemDecoration(wir);
        wir wir2 = new wir(this, R.string.sharing_contact_select_alphabetical_contacts_header);
        this.m = wir2;
        wir2.a = 0;
        recyclerView.addItemDecoration(wir2);
        this.d = (SelectionSlider) findViewById(R.id.visibility_slider);
        vus vus = new vus(this, new viw(this));
        vus.a((Object) 1);
        vus.a((Object) 2);
        vus.a((Object) 0);
        this.e = vus;
        SelectionSlider selectionSlider = this.d;
        acg acg = selectionSlider.c;
        if (acg != null) {
            acg.b(selectionSlider.d);
        }
        selectionSlider.c = vus;
        if (vus != null) {
            vus.a(selectionSlider.d);
        }
        selectionSlider.a(false);
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.sharing_menu_contact_select, menu);
        SearchView searchView = new SearchView(aE().g());
        this.c = searchView;
        searchView.b(Integer.MAX_VALUE);
        LinearLayout linearLayout = (LinearLayout) this.c.findViewById(R.id.search_edit_frame);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) linearLayout.getLayoutParams();
        layoutParams.setMarginStart(0);
        linearLayout.setLayoutParams(layoutParams);
        ((TextView) this.c.findViewById(R.id.search_src_text)).setPadding(0, 0, 0, 0);
        this.c.m = new viy(this);
        this.c.w = new vis(this);
        menu.findItem(R.id.action_search).setActionView(this.c);
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() != R.id.action_search) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            return true;
        }
    }

    public final void onStart() {
        if (!this.o) {
            super.onStart();
            thp.a(this, this.q, new IntentFilter("com.google.android.gms.nearby.sharing.ACTION_CONTACTS_REFRESHED"));
            e();
            return;
        }
        super.onStart();
    }

    public final void onStop() {
        thp.a((Context) this, this.q);
        super.onStop();
    }

    public final void a(int i2) {
        vts vts = this.i;
        vik vik = new vik();
        vik.a(false);
        vts.a(vik.a).a((acvv) new viv(this));
        if (i2 == 0) {
            this.j.setVisibility(0);
            this.k.setVisibility(8);
            return;
        }
        this.j.setVisibility(8);
        this.k.setVisibility(0);
    }

    public final /* bridge */ /* synthetic */ void a(View view, Object obj) {
        Contact contact = (Contact) obj;
        view.findViewById(R.id.select_switch).performClick();
    }

    public final void a(Contact contact) {
        vts vts = this.i;
        iha b2 = ihb.b();
        b2.a = new vsy(contact);
        b2.b = new Feature[]{tcm.a};
        vts.b(b2.a());
    }

    public final void a(String str, boolean z) {
        if (z) {
            this.f.setVisibility(8);
            this.h.setVisibility(8);
            this.n.setVisibility(0);
        }
        as asVar = this.p;
        if (asVar != null) {
            asVar.a((aj) this);
        }
        if (TextUtils.isEmpty(str)) {
            vts vts = this.i;
            vik vik = new vik();
            vik.a(true);
            this.p = new ch(new cc(vts, vik.a, this), vvx.e).a();
        } else {
            vts vts2 = this.i;
            vik vik2 = new vik();
            vik2.a(true);
            ContactFilter contactFilter = vik2.a;
            contactFilter.d = str;
            this.p = new ch(new cc(vts2, contactFilter, this), vvx.e).a();
        }
        as asVar2 = this.p;
        vuk vuk = this.g;
        vuk.getClass();
        asVar2.a(this, new vit(vuk));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List r5, boolean r6) {
        /*
            r4 = this;
            r0 = 0
            if (r6 != 0) goto L_0x0004
            goto L_0x0020
        L_0x0004:
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L_0x0014
            wir r6 = r4.l
            r1 = -1
            r6.a = r1
            wir r6 = r4.m
            r6.a = r0
            goto L_0x0020
        L_0x0014:
            wir r6 = r4.l
            r6.a = r0
            wir r6 = r4.m
            int r1 = r5.size()
            r6.a = r1
        L_0x0020:
            boolean r6 = r5.isEmpty()
            r1 = 8
            if (r6 == 0) goto L_0x0046
            vuk r6 = r4.g
            bx r6 = r6.a
            ct r2 = r6.g
            if (r2 != 0) goto L_0x0033
            ct r2 = r6.f
            goto L_0x0034
        L_0x0033:
        L_0x0034:
            boolean r6 = r2.isEmpty()
            if (r6 != 0) goto L_0x003b
            goto L_0x0046
        L_0x003b:
            android.view.View r6 = r4.h
            r6.setVisibility(r0)
            android.view.View r6 = r4.f
            r6.setVisibility(r1)
            goto L_0x0050
        L_0x0046:
            android.view.View r6 = r4.h
            r6.setVisibility(r1)
            android.view.View r6 = r4.f
            r6.setVisibility(r0)
        L_0x0050:
            android.view.View r6 = r4.n
            r6.setVisibility(r1)
            vuk r6 = r4.g
            java.util.Iterator r5 = r5.iterator()
        L_0x005b:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0077
            java.lang.Object r0 = r5.next()
            com.google.android.gms.nearby.sharing.Contact r0 = (com.google.android.gms.nearby.sharing.Contact) r0
            boolean r1 = r0.e
            if (r1 == 0) goto L_0x005b
            java.util.Set r1 = r6.f
            long r2 = r0.a
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.add(r0)
            goto L_0x005b
        L_0x0077:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.sharing.ContactSelectChimeraActivity.a(java.util.List, boolean):void");
    }
}
