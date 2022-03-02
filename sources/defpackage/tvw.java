package defpackage;

import android.view.View;
import com.google.android.gms.nearby.discovery.fastpair.HalfSheetChimeraActivity;

/* renamed from: tvw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tvw implements View.OnClickListener {
    private final HalfSheetChimeraActivity a;

    public tvw(HalfSheetChimeraActivity halfSheetChimeraActivity) {
        this.a = halfSheetChimeraActivity;
    }

    public void onClick(View view) {
        this.a.finish();
    }
}
