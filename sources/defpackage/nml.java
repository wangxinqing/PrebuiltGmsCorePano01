package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.view.Display;
import android.view.View;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;

/* renamed from: nml  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class nml implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final nme a;
    public final nmk b;
    public WeakReference c;
    private boolean d = false;

    public nml(nme nme) {
        this.a = nme;
        this.b = new nmk();
    }

    public final void a() {
        boolean z;
        nmk nmk = this.b;
        IBinder iBinder = nmk.a;
        if (iBinder != null) {
            nme nme = this.a;
            Bundle a2 = nmk.a();
            if (nme.l()) {
                try {
                    nmi nmi = (nmi) nme.x();
                    Parcel aQ = nmi.aQ();
                    aQ.writeStrongBinder(iBinder);
                    bhx.a(aQ, (Parcelable) a2);
                    nmi.b(5005, aQ);
                } catch (RemoteException e) {
                    nme.a(e);
                }
            }
            z = false;
        } else {
            z = true;
        }
        this.d = z;
    }

    public final void onGlobalLayout() {
        View view;
        WeakReference weakReference = this.c;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            a(view);
        }
    }

    public final void onViewAttachedToWindow(View view) {
        a(view);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.a.A();
        view.removeOnAttachStateChangeListener(this);
    }

    public final void a(View view) {
        int i;
        int i2 = Build.VERSION.SDK_INT;
        Display display = view.getDisplay();
        if (display != null) {
            i = display.getDisplayId();
        } else {
            i = -1;
        }
        IBinder windowToken = view.getWindowToken();
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int width = view.getWidth();
        int height = view.getHeight();
        nmk nmk = this.b;
        nmk.b = i;
        nmk.a = windowToken;
        int i3 = iArr[0];
        nmk.c = i3;
        int i4 = iArr[1];
        nmk.d = i4;
        nmk.e = i3 + width;
        nmk.f = i4 + height;
        if (this.d) {
            a();
        }
    }
}
