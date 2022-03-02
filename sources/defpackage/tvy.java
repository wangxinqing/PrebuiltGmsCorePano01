package defpackage;

import android.view.View;
import com.google.android.gms.R;
import com.google.android.gms.nearby.discovery.fastpair.HalfSheetChimeraActivity;

/* renamed from: tvy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tvy implements View.OnClickListener {
    private final HalfSheetChimeraActivity a;

    public tvy(HalfSheetChimeraActivity halfSheetChimeraActivity) {
        this.a = halfSheetChimeraActivity;
    }

    public void onClick(View view) {
        HalfSheetChimeraActivity halfSheetChimeraActivity = this.a;
        if (halfSheetChimeraActivity.a != null) {
            halfSheetChimeraActivity.b.setVisibility(4);
            halfSheetChimeraActivity.d.setText(halfSheetChimeraActivity.getString(R.string.common_connecting));
            halfSheetChimeraActivity.startService(tzb.a(halfSheetChimeraActivity, 0, halfSheetChimeraActivity.a));
            return;
        }
        ((anih) tsp.a.c()).a("HalfSheetActivity: No pairing related information in half sheet");
    }
}
