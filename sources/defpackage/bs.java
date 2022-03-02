package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: bs  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class bs {
    public final HashMap a = new HashMap();

    public final void a() {
        for (bl blVar : this.a.values()) {
            blVar.b = true;
            synchronized (blVar.a) {
                for (Object next : blVar.a.values()) {
                    if (next instanceof Closeable) {
                        try {
                            ((Closeable) next).close();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                    }
                }
            }
            blVar.f();
        }
        this.a.clear();
    }
}
