package defpackage;

import javax.crypto.KeyAgreement;

/* renamed from: aegf  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final /* synthetic */ class aegf implements aegh {
    static final aegh a = new aegf();

    private aegf() {
    }

    public final Object a(String str) {
        int i = aegi.c;
        return KeyAgreement.getInstance("ECDH", str);
    }
}
