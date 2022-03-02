package com.google.android.gms.plus.audience;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.plus.service.v1whitelisted.models.ClientActionDataEntity;
import java.util.List;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class AclSelectionChimeraActivity extends yoz implements View.OnClickListener {
    private yny w;
    private View x;
    private boolean y;

    /* access modifiers changed from: protected */
    public final int e() {
        return R.string.plus_audience_selection_title_acl;
    }

    /* access modifiers changed from: protected */
    public final void f() {
        a(iax.h, n());
        super.f();
    }

    /* access modifiers changed from: protected */
    public final void h() {
        a(iax.g, (ClientActionDataEntity) null);
        super.h();
    }

    /* access modifiers changed from: protected */
    public final FavaDiagnosticsEntity i() {
        return iay.a;
    }

    /* access modifiers changed from: protected */
    public final iia j() {
        iia j = super.j();
        j.a(this.w.a);
        return j;
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 1) {
            a(iay.a, iay.f);
            if (i2 == -1) {
                yqd yqd = this.f;
                yqd.a(ixb.a(yqd.a, (AudienceMember) iia.f(intent).get(0)), this);
            }
        }
    }

    public void onClick(View view) {
        super.onClick(view);
        if (view == this.x) {
            onSearchRequested();
        }
    }

    public final boolean onSearchRequested() {
        iia iia = new iia(new Intent().setClassName(this, "com.google.android.gms.plus.audience.AudienceSearchActivity"));
        iia.a(this.a);
        iia.c(this.b);
        iia.d(this.d);
        iia.a.putExtra("com.google.android.gms.common.acl.EXTRA_TITLE_TEXT", getString(R.string.plus_audience_selection_title_search));
        iia.a.putExtra("EXTRA_SEARCH_DEVICE", this.y);
        startActivityForResult(iia.a, 1);
        a(iay.a, iay.f);
        return false;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ypk a(Intent intent, Fragment fragment) {
        AclSelectionChimeraActivity aclSelectionChimeraActivity;
        Intent intent2 = intent;
        Fragment fragment2 = fragment;
        this.y = iia.l(intent);
        if (fragment2 == null || !(fragment2 instanceof yny)) {
            String str = this.a;
            String str2 = this.b;
            boolean booleanExtra = intent2.getBooleanExtra("SHOULD_LOAD_SUGGESTED", false);
            boolean a = iia.a(intent2, true);
            boolean j = iia.j(intent);
            boolean k = iia.k(intent);
            Integer valueOf = Integer.valueOf(intent2.getIntExtra("LOAD_PEOPLE_TYPE", -1));
            String a2 = iia.a(intent);
            String b = iia.b(intent);
            String str3 = this.c;
            int i = iia.i(intent);
            boolean booleanExtra2 = intent2.getBooleanExtra("EXTRA_INCLUDE_SUGGESTIONS_WITH_PEOPLE", false);
            boolean z = a;
            boolean z2 = j;
            boolean z3 = k;
            Integer num = valueOf;
            String str4 = a2;
            String str5 = b;
            String str6 = str3;
            int i2 = i;
            boolean z4 = booleanExtra2;
            int intExtra = intent2.getIntExtra("EXTRA_MAX_SUGGESTED_IMAGES", 0);
            int intExtra2 = intent2.getIntExtra("EXTRA_MAX_SUGGESTED_LIST_ITEMS", 0);
            aclSelectionChimeraActivity = this;
            aclSelectionChimeraActivity.w = yny.a(str, str2, booleanExtra, z, z2, z3, num, str4, str5, str6, i2, z4, intExtra, intExtra2, intent2.getIntExtra("EXTRA_MAX_SUGGESTED_DEVICE", 0), (List) null);
        } else {
            this.w = (yny) fragment2;
            aclSelectionChimeraActivity = this;
        }
        return aclSelectionChimeraActivity.w;
    }

    /* access modifiers changed from: protected */
    public final void a(Bundle bundle) {
        View inflate = LayoutInflater.from(this).inflate(R.layout.plus_audience_selection_title_search, (ViewGroup) findViewById(R.id.title_frame), true);
        this.x = inflate;
        inflate.setOnClickListener(this);
        this.w.d = this.e;
    }

    /* access modifiers changed from: protected */
    public final void a(xaa xaa) {
        this.w.a(xaa);
    }
}
