package defpackage;

import com.google.android.gms.nearby.sharing.Attachment;
import com.google.android.gms.nearby.sharing.FileAttachment;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TextAttachment;
import com.google.android.gms.nearby.sharing.WifiCredentialsAttachment;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;

/* renamed from: vke  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vke {
    final /* synthetic */ ShareTarget a;
    final /* synthetic */ aosh b;
    final /* synthetic */ NearbySharingChimeraService c;

    public vke(NearbySharingChimeraService nearbySharingChimeraService, ShareTarget shareTarget, aosh aosh) {
        this.c = nearbySharingChimeraService;
        this.a = shareTarget;
        this.b = aosh;
    }

    public final void a(List list) {
        ((anih) vvj.a.d()).a("Download finished.");
        ShareTarget shareTarget = this.a;
        Charset charset = NearbySharingChimeraService.a;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Attachment attachment = (Attachment) it.next();
            if (attachment.d()) {
                shareTarget.a((TextAttachment) attachment);
            } else if (attachment.c()) {
                shareTarget.a((FileAttachment) attachment);
            } else if (attachment.e()) {
                shareTarget.a((WifiCredentialsAttachment) attachment);
            }
        }
        this.b.b((Object) 0);
    }
}
