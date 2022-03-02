package defpackage;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: zq  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class zq extends lg {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ WeakReference c;
    final /* synthetic */ zr d;

    public zq(zr zrVar, int i, int i2, WeakReference weakReference) {
        this.d = zrVar;
        this.a = i;
        this.b = i2;
        this.c = weakReference;
    }

    public final void a(int i) {
    }

    public final void a(Typeface typeface) {
        int i;
        boolean z;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.a) != -1) {
            if ((this.b & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            typeface = Typeface.create(typeface, i, z);
        }
        zr zrVar = this.d;
        WeakReference weakReference = this.c;
        if (zrVar.c) {
            zrVar.b = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, zrVar.a);
            }
        }
    }
}
