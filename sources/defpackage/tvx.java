package defpackage;

import android.content.Intent;
import android.view.View;
import com.google.android.gms.nearby.discovery.fastpair.HalfSheetChimeraActivity;

/* renamed from: tvx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class tvx implements View.OnClickListener {
    private final HalfSheetChimeraActivity a;

    public tvx(HalfSheetChimeraActivity halfSheetChimeraActivity) {
        this.a = halfSheetChimeraActivity;
    }

    public void onClick(View view) {
        HalfSheetChimeraActivity halfSheetChimeraActivity = this.a;
        Intent intent = halfSheetChimeraActivity.e;
        halfSheetChimeraActivity.b.setVisibility(4);
        halfSheetChimeraActivity.startService(intent);
    }
}
