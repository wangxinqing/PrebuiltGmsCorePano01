package defpackage;

import android.accounts.Account;
import com.google.android.gms.nearby.sharing.Contact;
import java.util.concurrent.Callable;

/* renamed from: wer  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class wer implements Callable {
    private final wgu a;
    private final Contact b;

    public wer(wgu wgu, Contact contact) {
        this.a = wgu;
        this.b = contact;
    }

    public final Object call() {
        int i;
        wgu wgu = this.a;
        Contact contact = this.b;
        wcg wcg = wgu.n;
        Account b2 = wcg.c.b();
        if (b2 == null) {
            ((anih) ((anih) vvj.a.c()).a("wcg", "b", 120, ":com.google.android.gms@201216073@20.12.16 (080306-306753009)")).a("Unable to unmark contact %s: account is null.", contact.a);
            i = 35505;
        } else {
            wgx wgx = wcg.a;
            aucd o = vii.d.o();
            long j = contact.a;
            if (o.c) {
                o.c();
                o.c = false;
            }
            vii vii = (vii) o.b;
            int i2 = vii.a | 1;
            vii.a = i2;
            vii.b = j;
            String str = contact.b;
            str.getClass();
            vii.a = i2 | 2;
            vii.c = str;
            int b3 = wgx.b(b2, (vii) o.i());
            if (b3 == 0) {
                if (contact.g) {
                    wcg.b.b();
                }
                wcg.b.c();
            }
            i = b3;
        }
        if (i == 0) {
            wgu.n();
        }
        return Integer.valueOf(i);
    }
}
