package defpackage;

import java.security.Provider;
import java.security.Signature;

/* renamed from: apcm  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apcm implements apcn {
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        if (provider != null) {
            return Signature.getInstance(str, provider);
        }
        return Signature.getInstance(str);
    }
}
