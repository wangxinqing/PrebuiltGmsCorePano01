package defpackage;

import java.security.SecureRandom;

/* renamed from: apcv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class apcv extends ThreadLocal {
    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object initialValue() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
