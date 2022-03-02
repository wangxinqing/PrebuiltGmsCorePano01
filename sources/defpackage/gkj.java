package defpackage;

import android.app.AlertDialog;
import android.os.AsyncTask;
import android.widget.Button;
import com.google.android.gms.auth.setup.d2d.SourceChimeraActivity;

/* renamed from: gkj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gkj implements Runnable {
    final /* synthetic */ SourceChimeraActivity a;

    public gkj(SourceChimeraActivity sourceChimeraActivity) {
        this.a = sourceChimeraActivity;
    }

    public final void run() {
        AlertDialog alertDialog;
        if (!this.a.isFinishing() && !this.a.g && (alertDialog = this.a.m) != null) {
            Button button = alertDialog.getButton(-2);
            if (button != null) {
                button.setEnabled(false);
            }
            SourceChimeraActivity sourceChimeraActivity = this.a;
            AsyncTask asyncTask = sourceChimeraActivity.r;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            sourceChimeraActivity.r = new gkk(sourceChimeraActivity).execute(new Void[0]);
        }
    }
}
