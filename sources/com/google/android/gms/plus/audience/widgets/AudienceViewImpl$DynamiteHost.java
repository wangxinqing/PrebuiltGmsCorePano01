package com.google.android.gms.plus.audience.widgets;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.common.people.data.Audience;

/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class AudienceViewImpl$DynamiteHost extends iii {
    private yrp a;

    private final void a() {
        iva.b(this.a != null, "call initialize() first");
    }

    public mby getView() {
        a();
        return mbz.a((Object) this.a);
    }

    public void initialize(mby mby, mby mby2, iim iim) {
        this.a = new yrp((Context) mbz.a(mby), (Context) mbz.a(mby2), iim);
    }

    public void onRestoreInstanceState(Bundle bundle) {
        a();
        this.a.onRestoreInstanceState(bundle.getParcelable("state"));
    }

    public Bundle onSaveInstanceState() {
        a();
        Bundle bundle = new Bundle();
        bundle.putParcelable("state", this.a.onSaveInstanceState());
        return bundle;
    }

    public void setAudience(Audience audience) {
        a();
        this.a.a(audience);
    }

    public void setEditMode(int i) {
        a();
        yrp yrp = this.a;
        yrp.e = i;
        yrp.a();
    }

    public void setIsUnderageAccount(boolean z) {
        a();
        yrp yrp = this.a;
        if (yrp.f != z) {
            yrp.f = z;
            yrp.b();
        }
    }

    public void setShowEmptyText(boolean z) {
        a();
        yrp yrp = this.a;
        yrp.c = z;
        if (z) {
            Audience audience = yrp.d;
            if (audience == null || audience.b.size() > 0) {
                yrp.a.setText(R.string.common_chips_label_empty_circles);
            }
        }
    }
}
