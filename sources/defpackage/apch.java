package defpackage;

import java.security.Provider;
import javax.crypto.KeyAgreement;

/* renamed from: apch  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apch implements apcn {
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        if (provider != null) {
            return KeyAgreement.getInstance(str, provider);
        }
        return KeyAgreement.getInstance(str);
    }
}
