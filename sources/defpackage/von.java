package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.MenuItem;
import com.google.android.gms.nearby.sharing.ReceiveSurfaceChimeraActivity;

/* renamed from: von  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class von implements acvv {
    private final ReceiveSurfaceChimeraActivity a;
    private final MenuItem b;

    public von(ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity, MenuItem menuItem) {
        this.a = receiveSurfaceChimeraActivity;
        this.b = menuItem;
    }

    public final void a(Object obj) {
        ReceiveSurfaceChimeraActivity receiveSurfaceChimeraActivity = this.a;
        this.b.setIcon(whr.a((Context) receiveSurfaceChimeraActivity, (Bitmap) obj));
        receiveSurfaceChimeraActivity.a(false);
    }
}
