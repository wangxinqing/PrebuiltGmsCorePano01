package defpackage;

import android.content.ContentResolver;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.R;

/* renamed from: xtg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class xtg implements ax {
    private final xtl a;
    private final String b;
    private final int c;

    public xtg(xtl xtl, String str, int i) {
        this.a = xtl;
        this.b = str;
        this.c = i;
    }

    public final void a(Object obj) {
        xtl xtl = this.a;
        String str = this.b;
        int i = this.c;
        acwa acwa = (acwa) obj;
        xtl.a(2, acwa);
        if (acwa.b()) {
            if (ayqr.b()) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("force", true);
                bundle.putString("REQUESTER", "SYNC_CORE_SHEEPDOG_UI");
                ContentResolver.requestSync(xus.a(str), "com.android.contacts", bundle);
            }
            if (i != 1) {
                xtl.a(10, true);
                if (xtl.d.getVisibility() == 0) {
                    xtl.d.setText(R.string.people_backup_sync_will_sync_button);
                }
            } else {
                xtl.b(5);
            }
            xtl.b.a(str).a(xtl, new xth(xtl));
            return;
        }
        if (ayqs.e()) {
            xtl.c();
        }
        Log.e("BackupAndSyncFragment", "Error opting into backup and sync", acwa.e());
    }
}
