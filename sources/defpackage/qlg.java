package defpackage;

import android.accounts.Account;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: qlg  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class qlg {
    private static final long c = TimeUnit.DAYS.toSeconds(7);
    public final qlc a;
    public final SharedPreferences b;
    private final List d = new ArrayList();

    static {
        new qfn("OptInPreferences");
    }

    private final int b() {
        return this.a.d().length > 0 ? 2 : 3;
    }

    public final int a() {
        long j;
        int i = this.b.getInt("optInState", 2);
        int i2 = this.b.getInt("optInLanguageVersion", 0);
        if (i == 0) {
            return 0;
        }
        if (i != 1) {
            long currentTimeMillis = System.currentTimeMillis();
            if (this.b.contains("optInLastDeclineMillisSinceEpoch") || !this.b.contains("optInNextPromptSecondsSinceEpoch")) {
                j = this.b.getLong("optInLastDeclineMillisSinceEpoch", 0);
            } else {
                j = TimeUnit.SECONDS.toMillis(this.b.getLong("optInNextPromptSecondsSinceEpoch", 0) - c);
            }
            long M = j + axuy.a.a().M();
            Object[] objArr = {Long.valueOf(M), Long.valueOf(currentTimeMillis)};
            if (currentTimeMillis >= M) {
                return b();
            }
            return 3;
        } else if (this.a.a() == null) {
            return b();
        } else {
            return i2 >= 0 ? 1 : 2;
        }
    }

    public qlg(qlc qlc, SharedPreferences sharedPreferences) {
        this.a = qlc;
        this.b = sharedPreferences;
    }

    public final synchronized void a(Account account, int i, int i2) {
        List list = this.d;
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            ((qlf) list.get(i3)).a(account, i, i2);
        }
    }

    public final void a(String str) {
        if (str != null) {
            this.a.a(str);
        }
        int a2 = a();
        this.b.edit().putInt("optInState", 0).remove("optInNextPromptSecondsSinceEpoch").remove("optInOneMoreChance").remove("optInLastDeclineMillisSinceEpoch").remove("optInNumDeclines").apply();
        a(this.a.a(), a2, 0);
    }

    public final synchronized void a(qlf qlf) {
        this.d.add(qlf);
    }
}
