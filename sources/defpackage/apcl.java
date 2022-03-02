package defpackage;

import java.security.MessageDigest;
import java.security.Provider;

/* renamed from: apcl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class apcl implements apcn {
    public final /* bridge */ /* synthetic */ Object a(String str, Provider provider) {
        if (provider != null) {
            return MessageDigest.getInstance(str, provider);
        }
        return MessageDigest.getInstance(str);
    }
}
