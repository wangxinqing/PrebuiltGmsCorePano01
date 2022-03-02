package defpackage;

import com.google.android.gms.auth.cryptauth.SignCryptedBlob;
import com.google.android.gms.smartdevice.setup.accounts.Assertion;
import com.google.android.gms.smartdevice.setup.accounts.Challenge;

/* renamed from: achk  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class achk implements acvf {
    private final Challenge a;
    private final byte[] b;

    public achk(Challenge challenge, byte[] bArr) {
        this.a = challenge;
        this.b = bArr;
    }

    public final Object a(acwa acwa) {
        Challenge challenge = this.a;
        byte[] bArr = this.b;
        iwd iwd = achr.a;
        return new Assertion(challenge.c, bArr, ((SignCryptedBlob) acwa.d()).c, challenge.f, challenge.e);
    }
}
