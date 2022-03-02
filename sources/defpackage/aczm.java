package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.ClientContext;

/* renamed from: aczm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aczm extends nis {
    private long a;
    protected final Context c;
    protected final adbx d;
    protected final ClientContext e;
    protected final String f;
    protected final Account g;
    protected final String h;
    protected boolean i;
    protected final adhv j;

    public aczm(Context context, adbx adbx, ClientContext clientContext, String str, String str2) {
        super(35, str2);
        String str3;
        iva.a((Object) context);
        this.c = context;
        iva.a((Object) adbx);
        this.d = adbx;
        iva.a((Object) clientContext);
        this.e = clientContext;
        Account account = clientContext.c;
        this.g = account;
        adhv adhv = null;
        if (account != null) {
            str3 = account.name;
        } else {
            str3 = null;
        }
        this.f = str3;
        this.h = str;
        this.j = str3 != null ? new adhv(this.c, str3) : adhv;
        this.i = false;
    }

    /* access modifiers changed from: protected */
    public final void a(int i2) {
        a(i2, i2 <= 0);
    }

    /* access modifiers changed from: protected */
    public final void b() {
        this.a = SystemClock.elapsedRealtime();
    }

    /* access modifiers changed from: protected */
    public final String c() {
        return eim.f(this.c, this.f);
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, boolean z) {
        if (this.j == null) {
            return;
        }
        if (!this.i || Math.random() < azqy.a.a().a()) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.a;
            if (!z) {
                this.j.a(this.h, this.m, elapsedRealtime, i2, false);
            } else {
                this.j.a(this.h, this.m, elapsedRealtime, i2, true);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(Context context) {
        if (this.g == null || this.f == null) {
            throw new nja(8, "No account provided");
        }
    }
}
