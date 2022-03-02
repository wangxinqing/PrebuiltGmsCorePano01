package defpackage;

import java.io.ObjectOutputStream;
import java.io.Serializable;

/* renamed from: anhb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
class anhb implements Serializable {
    private static final long serialVersionUID = 0;
    final Object f;
    final Object g;

    public anhb(Object obj, Object obj2) {
        amrl.a(obj);
        this.f = obj;
        this.g = obj2 == null ? this : obj2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        synchronized (this.g) {
            objectOutputStream.defaultWriteObject();
        }
    }

    public final String toString() {
        String obj;
        synchronized (this.g) {
            obj = this.f.toString();
        }
        return obj;
    }
}
