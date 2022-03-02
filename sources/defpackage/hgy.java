package defpackage;

import android.view.View;
import com.google.android.gms.chimera.container.ui.ModuleDownloadChimeraActivity;

/* renamed from: hgy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class hgy implements View.OnClickListener {
    private final ModuleDownloadChimeraActivity a;

    public hgy(ModuleDownloadChimeraActivity moduleDownloadChimeraActivity) {
        this.a = moduleDownloadChimeraActivity;
    }

    public void onClick(View view) {
        ModuleDownloadChimeraActivity moduleDownloadChimeraActivity = this.a;
        int i = moduleDownloadChimeraActivity.b;
        if (i == 0 || i == 2 || i == 3 || i == 4) {
            moduleDownloadChimeraActivity.onBackPressed();
        } else if (i == 5) {
            moduleDownloadChimeraActivity.a(0);
        } else {
            StringBuilder sb = new StringBuilder(32);
            sb.append(i);
            sb.append(" is not a valid state");
            throw new IllegalArgumentException(sb.toString());
        }
    }
}
