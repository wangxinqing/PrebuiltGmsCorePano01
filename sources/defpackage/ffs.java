package defpackage;

import com.google.android.gms.auth.api.credentials.internal.AccountCredentialSettings;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ffs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ffs {
    public boolean a;
    public boolean b;
    public ArrayList c = new ArrayList();
    public boolean d;

    public ffs() {
    }

    public final AccountCredentialSettings a() {
        return new AccountCredentialSettings(this.a, this.b, this.c, this.d);
    }

    public final void a(List list) {
        this.c.addAll(list);
    }

    public ffs(AccountCredentialSettings accountCredentialSettings) {
        this.a = accountCredentialSettings.a;
        this.b = accountCredentialSettings.b;
        this.c = new ArrayList(accountCredentialSettings.c);
        this.d = accountCredentialSettings.d;
    }
}
