package com.google.android.gms.plus.audience;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import java.util.Comparator;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class FaclSelectionChimeraActivity extends CircleSelectionChimeraActivity {
    public static final Comparator w = new yqr();
    public boolean A;
    public boolean B;
    public boolean C;
    public String D;
    public boolean x;
    public boolean y;
    public boolean z;

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ypk a(Intent intent, Fragment fragment) {
        return r();
    }

    /* access modifiers changed from: protected */
    public final int e() {
        return R.string.plus_choose_facl_title;
    }

    /* access modifiers changed from: protected */
    public final FavaDiagnosticsEntity i() {
        return ial.a;
    }

    /* access modifiers changed from: protected */
    public final iia j() {
        iia j = super.j();
        j.a(this.B);
        j.b(this.A);
        return j;
    }

    /* access modifiers changed from: protected */
    public final boolean l() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("FaclSelectionActivity.HasShowCircles", this.x);
        bundle.putBoolean("FaclSelectionActivity.ShowContacts", this.y);
        bundle.putBoolean("FaclSelectionActivity.ShowCircles", this.z);
        bundle.putBoolean("FaclSelectionActivity.Contacts", this.A);
        bundle.putBoolean("FaclSelectionActivity.Circles", this.B);
        bundle.putBoolean("FaclSelectionActivity.CirclesHidden", this.C);
    }

    /* access modifiers changed from: protected */
    public final ypj r() {
        Bundle a = ypj.a(this.a, this.b, false, false, true, false, (Integer) null, true, (String) null, this.d, this.c, false, false, 0, 0, 0, (List) null);
        yqt yqt = new yqt();
        yqt.setArguments(a);
        return yqt;
    }

    /* access modifiers changed from: protected */
    public final void a(Bundle bundle) {
        Intent intent = getIntent();
        boolean z2 = true;
        if (bundle != null) {
            this.x = bundle.getBoolean("FaclSelectionActivity.HasShowCircles");
            this.y = bundle.getBoolean("FaclSelectionActivity.ShowContacts");
            this.z = bundle.getBoolean("FaclSelectionActivity.ShowCircles");
            this.A = bundle.getBoolean("FaclSelectionActivity.Contacts");
            this.B = bundle.getBoolean("FaclSelectionActivity.Circles");
            if (this.z && !bundle.getBoolean("FaclSelectionActivity.CirclesHidden")) {
                z2 = false;
            }
            this.C = z2;
        } else {
            this.x = intent.getBooleanExtra("HAS_SHOW_CIRCLES", false);
            this.y = intent.getBooleanExtra("SHOW_ALL_CONTACTS_CHECKBOX", false);
            this.z = intent.getBooleanExtra("SHOW_ALL_CIRCLES_CHECKBOX", false);
            this.A = iia.h(intent);
            boolean g = iia.g(intent);
            this.B = g;
            if (this.z && !g) {
                z2 = false;
            }
            this.C = z2;
        }
        String a = iia.a(intent);
        this.D = a;
        if (TextUtils.isEmpty(a)) {
            this.D = getString(R.string.plus_facl_default_description);
        }
    }
}
