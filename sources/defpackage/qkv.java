package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.Random;

/* renamed from: qkv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qkv implements qlf {
    public static final qfn a = new qfn("UserPrefsUpdater");
    public final SharedPreferences b;
    public final qlg c;
    public final qlc d;
    public final Context e;
    public final Random f;
    private final qei g;
    private final qex h;

    public qkv(SharedPreferences sharedPreferences, qlg qlg, qei qei, qlc qlc, Context context, qex qex, Random random) {
        this.b = sharedPreferences;
        this.c = qlg;
        this.g = qei;
        this.d = qlc;
        this.e = context;
        this.h = qex;
        this.f = random;
        qlg.a((qlf) this);
    }

    public final void a(Account account, int i, int i2) {
        a(account, i2, true);
    }

    public final void a(Account account, int i, boolean z) {
        avwo avwo;
        qev a2 = this.h.a();
        if (account == null) {
            a2.a("UserPrefsUpdater.noAccount");
            return;
        }
        if (i == 0) {
            avwo = avwo.OPT_IN_REJECTED;
        } else if (i == 1) {
            avwo = avwo.OPTED_IN;
        } else if (i != 3) {
            avwo = avwo.UNSET;
        } else {
            avwo = avwo.OPT_IN_SNOOZED;
        }
        if (!z) {
            if (System.currentTimeMillis() - this.b.getLong("optInLastSyncMillis", 0) > axuj.a.a().d()) {
                a2.a("UserPrefsUpdater.tooLongSinceLastSync");
            } else if (this.b.contains("optInStatus") && avwo.a(this.b.getInt("optInStatus", 0)) == avwo && this.b.getString("optInAccount", "").equals(account.name)) {
                a2.a("UserPrefsUpdater.willNotUpdate");
                Object[] objArr = {avwo, account.name, false};
                return;
            }
        }
        aorl.a(this.g.a(avwo, account), new qku(this, avwo, account, z, a2), aoqm.a);
    }
}
