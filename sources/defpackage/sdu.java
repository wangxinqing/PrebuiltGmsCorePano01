package defpackage;

/* renamed from: sdu  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class sdu {
    public static audx a(agvx agvx, afsb afsb, auef auef) {
        byte[] bArr = (byte[]) agvx.c();
        if (bArr.length == 0) {
            return null;
        }
        try {
            return (audx) auef.b(bArr, aubs.b());
        } catch (auda e) {
            afsb.b(1004);
            afsh.a("%s: Unable to read %s from phenotype.", (Object) "MDDUtil", (Object) auef.getClass().getName());
            return null;
        }
    }
}
