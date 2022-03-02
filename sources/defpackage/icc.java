package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

@Deprecated
/* renamed from: icc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class icc {
    public static final Set a = Collections.newSetFromMap(new WeakHashMap());

    public static Set a() {
        Set set;
        synchronized (a) {
            set = a;
        }
        return set;
    }

    public abstract ConnectionResult a(long j, TimeUnit timeUnit);

    public abstract void a(ica ica);

    public abstract void a(icb icb);

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public Context b() {
        throw new UnsupportedOperationException();
    }

    public abstract void b(ica ica);

    public abstract boolean b(ibq ibq);

    public Looper c() {
        throw new UnsupportedOperationException();
    }

    public void d() {
        throw new UnsupportedOperationException();
    }

    public abstract void e();

    public abstract ConnectionResult f();

    public abstract void g();

    public abstract void h();

    public abstract boolean i();

    public abstract boolean j();

    public ibo a(ibg ibg) {
        throw new UnsupportedOperationException();
    }

    public idf b(idf idf) {
        throw new UnsupportedOperationException();
    }

    public idf a(idf idf) {
        throw new UnsupportedOperationException();
    }

    public ige a(Object obj) {
        throw new UnsupportedOperationException();
    }

    public boolean a(fwa fwa) {
        throw new UnsupportedOperationException();
    }

    public boolean a(ibq ibq) {
        throw new UnsupportedOperationException();
    }
}
