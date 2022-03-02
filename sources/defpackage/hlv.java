package defpackage;

import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: hlv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class hlv {
    public final String a;
    public final Object b;

    protected hlv(String str, Object obj) {
        iva.c(str);
        this.a = str;
        this.b = obj;
    }

    public abstract amri a(Object obj);

    public abstract Object a(byte[] bArr);

    public final boolean equals(Object obj) {
        if (obj instanceof hlv) {
            hlv hlv = (hlv) obj;
            return TextUtils.equals(this.a, hlv.a) && ius.a(this.b, hlv.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }
}
