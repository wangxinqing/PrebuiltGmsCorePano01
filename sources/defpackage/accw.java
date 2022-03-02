package defpackage;

import com.google.android.gms.smartdevice.d2d.ui.SourceDirectTransferChimeraActivity;
import java.util.List;

/* renamed from: accw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class accw implements acvp {
    private final SourceDirectTransferChimeraActivity a;

    public accw(SourceDirectTransferChimeraActivity sourceDirectTransferChimeraActivity) {
        this.a = sourceDirectTransferChimeraActivity;
    }

    public final void a(acwa acwa) {
        SourceDirectTransferChimeraActivity sourceDirectTransferChimeraActivity = this.a;
        List<acwa> list = (List) acwa.d();
        if (list != null) {
            for (acwa acwa2 : list) {
                if (acwa2.b() && ((Boolean) acwa2.d()).booleanValue()) {
                    return;
                }
            }
        }
        SourceDirectTransferChimeraActivity.c.d("Transfer no longer in progress.", new Object[0]);
        acpg.a(sourceDirectTransferChimeraActivity);
    }
}
