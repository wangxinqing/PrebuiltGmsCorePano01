package defpackage;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;
import com.google.android.gms.common.download.DownloadDetails;
import com.google.android.gms.common.download.DownloadIntentOperation;
import com.google.android.gms.common.download.DownloadServiceSettingsChimeraActivity;
import java.io.File;

/* renamed from: ips  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ips implements MenuItem.OnMenuItemClickListener {
    private final DownloadServiceSettingsChimeraActivity a;

    public ips(DownloadServiceSettingsChimeraActivity downloadServiceSettingsChimeraActivity) {
        this.a = downloadServiceSettingsChimeraActivity;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        DownloadDetails e = DownloadServiceSettingsChimeraActivity.e();
        int itemId = menuItem.getItemId();
        if (itemId == 1) {
            DownloadServiceSettingsChimeraActivity downloadServiceSettingsChimeraActivity = this.a;
            downloadServiceSettingsChimeraActivity.startService(ipu.a(downloadServiceSettingsChimeraActivity));
            return true;
        } else if (itemId == 2) {
            if (DownloadIntentOperation.c((Context) this.a, e.a)) {
                Toast.makeText(this.a, "Already enabled", 0).show();
            } else if (!DownloadIntentOperation.c((Context) this.a, e)) {
                Log.e("DownloadSvcSettingsActv", "Failed to enable file!");
            } else {
                this.a.f();
            }
            return true;
        } else if (itemId == 3) {
            if (DownloadIntentOperation.c((Context) this.a, e.a)) {
                File b = DownloadIntentOperation.b((Context) this.a, e.a);
                if (b != null && b.exists()) {
                    b.delete();
                }
                DownloadIntentOperation.d(this.a, e.a);
            } else {
                Toast.makeText(this.a, "Already disabled", 0).show();
            }
            return true;
        } else if (itemId != 4) {
            return false;
        } else {
            if (!DownloadIntentOperation.c((Context) this.a, e.a)) {
                Toast.makeText(this.a, "Not enabled.", 0).show();
            } else if (!DownloadIntentOperation.a((Context) this.a, e.a)) {
                Toast.makeText(this.a, "Not downloaded.", 0).show();
            } else {
                new ipr().show(this.a.getSupportFragmentManager(), "image");
            }
            return true;
        }
    }
}
