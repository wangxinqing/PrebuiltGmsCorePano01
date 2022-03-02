package defpackage;

/* renamed from: bagv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class bagv implements azyy {
    public final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        if (bArr.length >= 3) {
            return Integer.valueOf(((bArr[0] - 48) * 100) + ((bArr[1] - 48) * 10) + (bArr[2] - 48));
        }
        String str = new String(bArr, azyz.a);
        throw new NumberFormatException(str.length() == 0 ? new String("Malformed status code ") : "Malformed status code ".concat(str));
    }

    public final /* bridge */ /* synthetic */ byte[] a(Object obj) {
        Integer num = (Integer) obj;
        throw new UnsupportedOperationException();
    }
}
