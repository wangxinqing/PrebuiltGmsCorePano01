package com.google.android.gms.plus.audience;

import android.content.Intent;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class CircleSelectionChimeraActivity extends yoz {
    /* access modifiers changed from: protected */
    public /* bridge */ /* synthetic */ ypk a(Intent intent, Fragment fragment) {
        return r();
    }

    /* access modifiers changed from: protected */
    public int e() {
        return R.string.plus_audience_selection_title_update_circles;
    }

    /* access modifiers changed from: protected */
    public FavaDiagnosticsEntity i() {
        return ylq.b;
    }

    /* access modifiers changed from: protected */
    public final ypl q() {
        return (ypl) getSupportFragmentManager().findFragmentByTag("audienceSelectionList");
    }

    /* access modifiers changed from: protected */
    public ypj r() {
        return ypj.a(this.a, this.b, this.d, this.c);
    }
}
