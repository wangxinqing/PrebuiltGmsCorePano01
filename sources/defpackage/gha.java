package defpackage;

import android.text.LoginFilter;
import com.google.android.gms.auth.login.UsernamePasswordChimeraActivity;

/* renamed from: gha  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class gha extends LoginFilter.PasswordFilterGMail {
    final /* synthetic */ UsernamePasswordChimeraActivity a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gha(UsernamePasswordChimeraActivity usernamePasswordChimeraActivity) {
        super(true);
        this.a = usernamePasswordChimeraActivity;
    }

    public final void onInvalidCharacter(char c) {
        this.a.o = true;
    }

    public final void onStart() {
        this.a.o = false;
    }
}
