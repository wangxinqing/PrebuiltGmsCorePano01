package defpackage;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: amul  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class amul extends amup implements Serializable, amtr {
    private static final long serialVersionUID = 1;
    transient amtr a;

    public amul(amvo amvo) {
        super(amvo);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a = a().a(this.m);
    }

    private Object readResolve() {
        return this.a;
    }

    public final Object a(Object obj) {
        return ((amun) this.a).d(obj);
    }

    public final Object d(Object obj) {
        throw null;
    }
}
