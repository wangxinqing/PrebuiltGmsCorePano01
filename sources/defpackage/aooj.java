package defpackage;

import java.io.Serializable;

/* renamed from: aooj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aooj extends amqt implements Serializable {
    public static final aooj a = new aooj();
    private static final long serialVersionUID = 1;

    private aooj() {
    }

    private Object readResolve() {
        return a;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        return ((Long) obj).toString();
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ Object c(Object obj) {
        return Long.decode((String) obj);
    }

    public final String toString() {
        return "Longs.stringConverter()";
    }
}
