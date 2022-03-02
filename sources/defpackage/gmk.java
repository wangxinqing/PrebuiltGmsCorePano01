package defpackage;

import android.app.KeyguardManager;
import android.content.Intent;
import com.google.android.gms.auth.uiflows.addaccount.PreAddAccountChimeraActivity;

/* renamed from: gmk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gmk {
    private final KeyguardManager a;
    private final CharSequence b;

    public gmk(KeyguardManager keyguardManager, CharSequence charSequence) {
        this.a = keyguardManager;
        this.b = charSequence;
    }

    public final Intent a() {
        try {
            return this.a.createConfirmFactoryResetCredentialIntent((CharSequence) null, (CharSequence) null, this.b);
        } catch (IllegalStateException | UnsupportedOperationException e) {
            iwd iwd = PreAddAccountChimeraActivity.a;
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54);
            sb.append("Error while createConfirmFactoryResetCredentialIntent:");
            sb.append(valueOf);
            iwd.d(sb.toString(), new Object[0]);
            return null;
        }
    }
}
