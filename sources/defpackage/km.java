package defpackage;

import android.content.Context;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: km  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class km {
    private int a;
    private kl b;
    private kk c;
    private final Context d;
    private boolean e = false;
    private boolean f = false;
    private boolean g = true;
    private boolean h = false;
    private boolean i = false;

    public km(Context context) {
        this.d = context.getApplicationContext();
    }

    public void abandon() {
        this.f = true;
        onAbandon();
    }

    public boolean cancelLoad() {
        return onCancelLoad();
    }

    public void commitContentChanged() {
        this.i = false;
    }

    public String dataToString(Object obj) {
        StringBuilder sb = new StringBuilder(64);
        if (obj == null) {
            sb.append("null");
        } else {
            sb.append(obj.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
            sb.append("}");
        }
        return sb.toString();
    }

    public void deliverCancellation() {
        kk kkVar = this.c;
        if (kkVar != null) {
            kkVar.onLoadCanceled(this);
        }
    }

    public void deliverResult(Object obj) {
        kl klVar = this.b;
        if (klVar != null) {
            klVar.onLoadComplete(this, obj);
        }
    }

    @Deprecated
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mId=");
        printWriter.print(this.a);
        printWriter.print(" mListener=");
        printWriter.println(this.b);
        if (this.e || this.h || this.i) {
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.print(this.e);
            printWriter.print(" mContentChanged=");
            printWriter.print(this.h);
            printWriter.print(" mProcessingChange=");
            printWriter.println(this.i);
        }
        if (this.f || this.g) {
            printWriter.print(str);
            printWriter.print("mAbandoned=");
            printWriter.print(this.f);
            printWriter.print(" mReset=");
            printWriter.println(this.g);
        }
    }

    public void forceLoad() {
        onForceLoad();
    }

    public Context getContext() {
        return this.d;
    }

    public int getId() {
        return this.a;
    }

    public boolean isAbandoned() {
        return this.f;
    }

    public boolean isReset() {
        return this.g;
    }

    public boolean isStarted() {
        return this.e;
    }

    /* access modifiers changed from: protected */
    public void onAbandon() {
    }

    /* access modifiers changed from: protected */
    public boolean onCancelLoad() {
        return false;
    }

    public void onContentChanged() {
        if (!this.e) {
            this.h = true;
        } else {
            forceLoad();
        }
    }

    /* access modifiers changed from: protected */
    public void onForceLoad() {
    }

    /* access modifiers changed from: protected */
    public void onReset() {
    }

    /* access modifiers changed from: protected */
    public void onStartLoading() {
    }

    /* access modifiers changed from: protected */
    public void onStopLoading() {
    }

    public void registerListener(int i2, kl klVar) {
        if (this.b == null) {
            this.b = klVar;
            this.a = i2;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public void registerOnLoadCanceledListener(kk kkVar) {
        if (this.c == null) {
            this.c = kkVar;
            return;
        }
        throw new IllegalStateException("There is already a listener registered");
    }

    public void reset() {
        onReset();
        this.g = true;
        this.e = false;
        this.f = false;
        this.h = false;
        this.i = false;
    }

    public void rollbackContentChanged() {
        if (this.i) {
            onContentChanged();
        }
    }

    public final void startLoading() {
        this.e = true;
        this.g = false;
        this.f = false;
        onStartLoading();
    }

    public void stopLoading() {
        this.e = false;
        onStopLoading();
    }

    public boolean takeContentChanged() {
        boolean z = this.h;
        this.h = false;
        this.i |= z;
        return z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" id=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public void unregisterListener(kl klVar) {
        kl klVar2 = this.b;
        if (klVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (klVar2 == klVar) {
            this.b = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }

    public void unregisterOnLoadCanceledListener(kk kkVar) {
        kk kkVar2 = this.c;
        if (kkVar2 == null) {
            throw new IllegalStateException("No listener register");
        } else if (kkVar2 == kkVar) {
            this.c = null;
        } else {
            throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
    }
}
