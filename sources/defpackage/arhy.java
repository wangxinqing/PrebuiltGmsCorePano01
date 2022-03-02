package defpackage;

import com.google.android.chimera.FragmentTransaction;

/* renamed from: arhy  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class arhy implements arhz {
    private static final arhy h = new arhy();
    public arib a;
    public aria b;
    public aizy c;
    public final arhs d = new arhs();
    public final long e = 86400000;
    public final long f = 604800000;
    public long g = 0;

    public static arhy a(aizy aizy, byte[] bArr) {
        arhy arhy = h;
        arhy.c = aizy;
        arib arib = arib.a;
        arhx arhx = new arhx();
        arib.b = new arhv(arhx, argb.a((int) FragmentTransaction.TRANSIT_ENTER_MASK, arhx.c)).a();
        arib.a.g = arie.a;
        arib.a.e = arhy;
        arhy.a = arib.a;
        arhy arhy2 = h;
        aria.a.f = aizy;
        aiab.a(bArr, (ajrh) null);
        aria.a.e = arhy2;
        aria.a.i = 0;
        aria.a.j = 0;
        aria.a.k = 0;
        aria.a.l = 0;
        arhy2.b = aria.a;
        return h;
    }
}
