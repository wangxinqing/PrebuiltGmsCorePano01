package defpackage;

/* renamed from: hly  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class hly extends hlv {
    public hly(String str) {
        super(str, amzy.h());
    }

    public final /* bridge */ /* synthetic */ amri a(Object obj) {
        return amri.b(amre.a(',').a((Iterable) (amzy) obj).getBytes());
    }

    public final /* bridge */ /* synthetic */ Object a(byte[] bArr) {
        amzt j = amzy.j();
        for (String str : amsk.a(',').a().a((CharSequence) new String(bArr))) {
            if (!"!".equals(str)) {
                j.c(Long.valueOf(str));
            }
        }
        return j.a();
    }
}
