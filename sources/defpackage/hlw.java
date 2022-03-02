package defpackage;

/* renamed from: hlw  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hlw extends hlv {
    public hlw(String str, Boolean bool) {
        super(str, bool);
    }

    public final /* bridge */ /* synthetic */ amri a(Object obj) {
        return amri.b(String.valueOf((Boolean) obj).getBytes());
    }

    public final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        return Boolean.valueOf(new String(bArr));
    }
}
