package com.google.android.gms.common.account;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class SimpleDialogAccountPickerChimeraActivity extends qcd {
    public static final iwd a = new iwd("CommonAccount", "SimpleAccountPicker");
    public String b;
    public String c;
    public iae d;
    public pzp e;
    public ListView f;
    public int g = -1;

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.e.a(i, i2, intent);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        iae iae = new iae(getIntent(), 3);
        this.d = iae;
        setTheme(iae.i);
        setTitle((CharSequence) null);
        super.onCreate(bundle);
        if (bundle != null) {
            this.g = bundle.getInt("key-selected-item", -1);
        }
        this.c = this.d.g;
        this.b = iaf.b(getApplication(), this.c);
        pzn pzn = new pzn(getApplicationContext(), this.c);
        iae iae2 = this.d;
        pzn.f = iae2.d;
        pzn.a((List) iae2.a);
        iae iae3 = this.d;
        pzn.c = iae3.b;
        pzn.e = iae3.m;
        pzn.d = iae3.l;
        pzp pzp = (pzp) qck.a(this, pzn).a(pzp.class);
        this.e = pzp;
        pzp.h.a(this, new hzl(this));
        this.e.i.a(this, new hzm(this));
        this.e.g.a(this, new hzn(this));
        this.e.a();
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        this.e.b();
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("key-selected-item", this.g);
    }
}
