package defpackage;

import android.os.Handler;
import android.os.Message;
import com.google.android.gms.chimera.container.ui.ModuleDownloadChimeraActivity;

/* renamed from: hgx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class hgx implements Handler.Callback {
    private final ModuleDownloadChimeraActivity a;

    public hgx(ModuleDownloadChimeraActivity moduleDownloadChimeraActivity) {
        this.a = moduleDownloadChimeraActivity;
    }

    public final boolean handleMessage(Message message) {
        ModuleDownloadChimeraActivity moduleDownloadChimeraActivity = this.a;
        moduleDownloadChimeraActivity.a(message.arg1);
        moduleDownloadChimeraActivity.c.removeMessages(0);
        return true;
    }
}
