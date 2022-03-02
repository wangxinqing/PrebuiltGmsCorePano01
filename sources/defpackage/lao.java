package defpackage;

import java.util.Collection;

/* renamed from: lao  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class lao extends lbc {
    public lao(kym kym, boolean z, lcv lcv) {
        super(kym, z, lcv);
    }

    public final /* bridge */ /* synthetic */ String a(Object obj) {
        Collection collection = (Collection) obj;
        throw new UnsupportedOperationException("Cannot convert a collection metadata value directly to a database value.");
    }

    public abstract String a(Object obj, String str);
}
