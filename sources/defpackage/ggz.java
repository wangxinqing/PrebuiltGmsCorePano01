package defpackage;

import android.text.LoginFilter;
import com.google.android.gms.auth.login.UsernamePasswordChimeraActivity;

/* renamed from: ggz  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ggz extends LoginFilter.UsernameFilterGeneric {
    final /* synthetic */ UsernamePasswordChimeraActivity a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ggz(UsernamePasswordChimeraActivity usernamePasswordChimeraActivity) {
        super(true);
        this.a = usernamePasswordChimeraActivity;
    }

    public final boolean isAllowed(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        }
        if (c < 'a' || c > 'z') {
            return (c >= 'A' && c <= 'Z') || "@_-+.'".indexOf(c) != -1;
        }
        return true;
    }

    public final void onInvalidCharacter(char c) {
        this.a.n = true;
    }

    public final void onStart() {
        this.a.n = false;
    }
}
