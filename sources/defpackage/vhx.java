package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.widget.ImageView;
import com.google.android.gms.nearby.sharing.ConsentsChimeraActivity;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: vhx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final /* synthetic */ class vhx implements acvv {
    private final ConsentsChimeraActivity a;

    public vhx(ConsentsChimeraActivity consentsChimeraActivity) {
        this.a = consentsChimeraActivity;
    }

    public final void a(Object obj) {
        ConsentsChimeraActivity consentsChimeraActivity = this.a;
        Account account = (Account) obj;
        if (account != null) {
            consentsChimeraActivity.k.setText(account.name);
            acwa c = who.c(consentsChimeraActivity, account);
            ImageView imageView = consentsChimeraActivity.j;
            imageView.getClass();
            c.a((acvv) new vhz(imageView));
            c.a(via.a);
            acwa b = who.b((Context) consentsChimeraActivity, account);
            b.a((acvv) new vib(consentsChimeraActivity));
            b.a(vic.a);
            vvq vvq = new vvq(consentsChimeraActivity);
            aoru b2 = tid.b();
            acwa a2 = acws.a((Executor) b2, (Callable) new vvo(vvq, account));
            b2.shutdown();
            a2.a((acvv) new vhs(consentsChimeraActivity));
            a2.a((acvs) new vht(consentsChimeraActivity));
            return;
        }
        ((anih) vvj.a.c()).a("Unable to enable device contacts: account is null.");
        consentsChimeraActivity.i();
    }
}
