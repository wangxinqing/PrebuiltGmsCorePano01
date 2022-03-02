package defpackage;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

/* renamed from: atj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class atj extends ObjectInputStream {
    public atj(InputStream inputStream) {
        super(inputStream);
    }

    /* access modifiers changed from: protected */
    public final Class resolveClass(ObjectStreamClass objectStreamClass) {
        Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
        return cls == null ? super.resolveClass(objectStreamClass) : cls;
    }
}
