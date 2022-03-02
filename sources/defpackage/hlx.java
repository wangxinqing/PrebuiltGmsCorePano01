package defpackage;

/* renamed from: hlx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hlx extends hlv {
    public hlx(String str, Long l) {
        super(str, l);
    }

    public final /* bridge */ /* synthetic */ amri a(Object obj) {
        return amri.b(String.valueOf((Long) obj).getBytes());
    }

    public final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        return Long.valueOf(new String(bArr));
    }
}
