package defpackage;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

/* renamed from: ix  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ix extends is {
    public final iw a;
    private final aj b;

    public ix(aj ajVar, bs bsVar) {
        this.b = ajVar;
        this.a = (iw) new br(bsVar, iw.c).a(iw.class);
    }

    /* JADX INFO: finally extract failed */
    private final km a(int i, Bundle bundle, ir irVar, km kmVar) {
        try {
            this.a.e = true;
            km a2 = irVar.a(i, bundle);
            if (a2 != null) {
                if (a2.getClass().isMemberClass()) {
                    if (!Modifier.isStatic(a2.getClass().getModifiers())) {
                        throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + a2);
                    }
                }
                it itVar = new it(i, bundle, a2, kmVar);
                if (c(3)) {
                    "  Created new loader " + itVar;
                }
                this.a.d.b(i, itVar);
                this.a.a();
                return itVar.a(this.b, irVar);
            }
            throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
        } catch (Throwable th) {
            this.a.a();
            throw th;
        }
    }

    static boolean c(int i) {
        return Log.isLoggable("LoaderManager", i);
    }

    public final km b(int i) {
        iw iwVar = this.a;
        if (!iwVar.e) {
            it a2 = iwVar.a(i);
            if (a2 != null) {
                return a2.i;
            }
            return null;
        }
        throw new IllegalStateException("Called while creating a loader");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        sb.append(this.b.getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this.b)));
        sb.append("}}");
        return sb.toString();
    }

    public final km b(int i, Bundle bundle, ir irVar) {
        km kmVar;
        if (this.a.e) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            if (c(2)) {
                "restartLoader in " + this + ": args=" + bundle;
            }
            it a2 = this.a.a(i);
            if (a2 != null) {
                kmVar = a2.a(false);
            } else {
                kmVar = null;
            }
            return a(i, bundle, irVar, kmVar);
        } else {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
    }

    public final km a(int i, Bundle bundle, ir irVar) {
        if (this.a.e) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            it a2 = this.a.a(i);
            if (c(2)) {
                "initLoader in " + this + ": args=" + bundle;
            }
            if (a2 == null) {
                return a(i, bundle, irVar, (km) null);
            }
            if (c(3)) {
                "  Re-using existing loader " + a2;
            }
            return a2.a(this.b, irVar);
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    public final void a(int i) {
        if (this.a.e) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            if (c(2)) {
                "destroyLoader in " + this + " of " + i;
            }
            it a2 = this.a.a(i);
            if (a2 != null) {
                a2.a(true);
                this.a.d.b(i);
            }
        } else {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
    }

    @Deprecated
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        iw iwVar = this.a;
        if (iwVar.d.c() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            for (int i = 0; i < iwVar.d.c(); i++) {
                it itVar = (it) iwVar.d.d(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(iwVar.d.c(i));
                printWriter.print(": ");
                printWriter.println(itVar.toString());
                printWriter.print(str2);
                printWriter.print("mId=");
                printWriter.print(itVar.a);
                printWriter.print(" mArgs=");
                printWriter.println(itVar.h);
                printWriter.print(str2);
                printWriter.print("mLoader=");
                printWriter.println(itVar.i);
                itVar.i.dump(str2 + "  ", fileDescriptor, printWriter, strArr);
                if (itVar.j != null) {
                    printWriter.print(str2);
                    printWriter.print("mCallbacks=");
                    printWriter.println(itVar.j);
                    iu iuVar = itVar.j;
                    printWriter.print(str2 + "  ");
                    printWriter.print("mDeliveredData=");
                    printWriter.println(iuVar.c);
                }
                printWriter.print(str2);
                printWriter.print("mData=");
                printWriter.println(itVar.i.dataToString(itVar.b()));
                printWriter.print(str2);
                printWriter.print("mStarted=");
                printWriter.println(itVar.d());
            }
        }
    }

    public final boolean a() {
        iu iuVar;
        iw iwVar = this.a;
        int c = iwVar.d.c();
        for (int i = 0; i < c; i++) {
            it itVar = (it) iwVar.d.d(i);
            if (itVar.d() && (iuVar = itVar.j) != null && !iuVar.c) {
                return true;
            }
        }
        return false;
    }
}
