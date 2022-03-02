package defpackage;

import com.google.android.gms.smartdevice.setup.accounts.Challenge;

/* renamed from: achi  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class achi implements acvs {
    private final Challenge a;

    public achi(Challenge challenge) {
        this.a = challenge;
    }

    public final void a(Exception exc) {
        Challenge challenge = this.a;
        iwd iwd = achr.a;
        String valueOf = String.valueOf(challenge.c);
        iwd.d(valueOf.length() == 0 ? new String("Could not create assertion for account: ") : "Could not create assertion for account: ".concat(valueOf), exc, new Object[0]);
    }
}
