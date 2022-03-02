package defpackage;

import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: is  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class is {
    public static is a(aj ajVar) {
        return new ix(ajVar, ((bt) ajVar).getViewModelStore());
    }

    public abstract km a(int i, Bundle bundle, ir irVar);

    public abstract void a(int i);

    @Deprecated
    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public boolean a() {
        throw null;
    }

    public abstract km b(int i);

    public abstract km b(int i, Bundle bundle, ir irVar);
}
