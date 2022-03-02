package defpackage;

import android.accounts.Account;

/* renamed from: qku  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class qku implements aora {
    final /* synthetic */ avwo a;
    final /* synthetic */ Account b;
    final /* synthetic */ boolean c;
    final /* synthetic */ qev d;
    final /* synthetic */ qkv e;

    public qku(qkv qkv, avwo avwo, Account account, boolean z, qev qev) {
        this.e = qkv;
        this.a = avwo;
        this.b = account;
        this.c = z;
        this.d = qev;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        arbi arbi = (arbi) obj;
        this.e.b.edit().putInt("optInStatus", this.a.a()).putString("optInAccount", this.b.name).putLong("optInLastSyncMillis", System.currentTimeMillis()).apply();
        qkv.a.a("Update complete: status=%s force=%s", this.a, Boolean.valueOf(this.c));
        this.d.a("UserPrefsUpdater.onSuccess");
    }

    public final void a(Throwable th) {
        String format = String.format("Failed updateUserPrefs: status=%s force=%s", new Object[]{this.a, Boolean.valueOf(this.c)});
        if (axuy.a.a().L() > this.e.f.nextDouble()) {
            qfp.a(this.e.e, format, th, qkv.a);
        } else {
            qkv.a.a(th, "%s", format);
        }
        this.d.a("UserPrefsUpdater.onFailure");
    }
}
