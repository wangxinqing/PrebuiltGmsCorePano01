package defpackage;

import java.security.KeyPairGenerator;
import java.security.Provider;

/* renamed from: apcj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apcj implements apcn {
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        if (provider != null) {
            return KeyPairGenerator.getInstance(str, provider);
        }
        return KeyPairGenerator.getInstance(str);
    }
}
