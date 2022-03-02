package defpackage;

import android.view.View;
import com.google.android.gms.nearby.discovery.fastpair.HalfSheetChimeraActivity;

/* renamed from: tvv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tvv implements View.OnClickListener {
    private final HalfSheetChimeraActivity a;

    public tvv(HalfSheetChimeraActivity halfSheetChimeraActivity) {
        this.a = halfSheetChimeraActivity;
    }

    public void onClick(View view) {
        HalfSheetChimeraActivity halfSheetChimeraActivity = this.a;
        tzf tzf = halfSheetChimeraActivity.a;
        if (tzf == null) {
            ((anih) tsp.a.c()).a("HalfSheetActivity: No setup related information in half sheet");
            halfSheetChimeraActivity.c.setVisibility(4);
        } else if (halfSheetChimeraActivity.a(tvq.a(tzf.h), halfSheetChimeraActivity.a.i) != null) {
            halfSheetChimeraActivity.startActivity(halfSheetChimeraActivity.a(tvq.a(halfSheetChimeraActivity.a.h), halfSheetChimeraActivity.a.i));
        } else {
            ((anih) tsp.a.d()).a("HalfSheetActivity: No companion app info found");
        }
    }
}
