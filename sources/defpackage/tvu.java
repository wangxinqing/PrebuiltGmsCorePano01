package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.google.android.gms.nearby.discovery.fastpair.HalfSheetChimeraActivity;

/* renamed from: tvu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tvu implements View.OnClickListener {
    private final HalfSheetChimeraActivity a;

    public tvu(HalfSheetChimeraActivity halfSheetChimeraActivity) {
        this.a = halfSheetChimeraActivity;
    }

    public void onClick(View view) {
        HalfSheetChimeraActivity halfSheetChimeraActivity = this.a;
        thp.a((Context) halfSheetChimeraActivity, new Intent("com.google.android.gms.nearby.ACTION_FAST_PAIR_HALF_SHEET_CANCEL").putExtra("com.google.android.gms.nearby.discovery.fastpair.halfsheet:ADDRESS", halfSheetChimeraActivity.a.i));
        halfSheetChimeraActivity.finish();
    }
}
