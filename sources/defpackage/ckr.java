package defpackage;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.gms.contextmanager.internal.ContextDataFilterImpl;
import com.google.android.gms.contextmanager.internal.TimeFilterImpl;
import com.google.android.gms.location.reporting.Deletion;
import java.util.ArrayList;

/* renamed from: ckr  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ckr {
    public static final String a = jkq.a("com.google.android.gms.contextmanager");
    public final cla b = new cla();
    public final cky c = new ckp();

    private final void a(Intent intent) {
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("deletions");
        bsx y = cbi.y();
        int size = parcelableArrayListExtra.size();
        for (int i = 0; i < size; i++) {
            Deletion deletion = (Deletion) parcelableArrayListExtra.get(i);
            Account account = deletion.a;
            cbi.y();
            bsz b2 = bsx.b(account.name);
            y.c();
            if (y.a.contains(b2)) {
                ((anih) ((anih) bxk.a.d()).a("ckr", "a", 136, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("[SystemStateManager] Deleting location history data for account: %s", (Object) account);
                cjd p = cbi.p();
                jtm jtm = new jtm();
                juu juu = new juu();
                juu.a(deletion.b, deletion.c);
                TimeFilterImpl a2 = juu.a();
                for (int a3 : bta.a) {
                    jtm.a(a3, a2);
                }
                p.b((ContextDataFilterImpl) jtm.a(), cbi.a(b2, "SystemStateManager"));
            }
        }
    }

    public final void a(ckq ckq, but but) {
        this.b.a(ckq, but);
    }
}
