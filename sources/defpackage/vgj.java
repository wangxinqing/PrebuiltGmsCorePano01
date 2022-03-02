package defpackage;

import android.content.Context;
import com.google.android.gms.nearby.messages.settings.ButtonLayout;

/* renamed from: vgj  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class vgj {
    public final int a;
    public final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final float h;
    private final boolean i;

    public vgj(Context context, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.c = i2;
        this.a = i3;
        this.b = i4;
        this.d = i5;
        this.e = i6;
        this.f = i7;
        this.g = i8;
        this.h = context.getResources().getDisplayMetrics().density;
        this.i = ButtonLayout.a(context);
    }

    public final int a() {
        return (int) (((float) this.c) * this.h);
    }

    public final int b() {
        return (int) (((float) this.d) * this.h);
    }

    public final int c() {
        return (int) (((float) this.e) * this.h);
    }

    public final int d() {
        return (int) (((float) (!this.i ? this.f : this.g)) * this.h);
    }

    public final int e() {
        return (int) (((float) (!this.i ? this.g : this.f)) * this.h);
    }
}
