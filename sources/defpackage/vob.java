package defpackage;

import android.view.View;
import com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity;

/* renamed from: vob  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vob implements View.OnClickListener {
    private final ReceiveSurfaceChimeraActivity a;

    public vob(ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity) {
        this.a = receiveSurfaceChimeraActivity;
    }

    public void onClick(View view) {
        this.a.finish();
    }
}
