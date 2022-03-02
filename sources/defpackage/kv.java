package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* renamed from: kv  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class kv {
    public final Shader a;
    public int b;
    private final ColorStateList c;

    public kv(Shader shader, ColorStateList colorStateList, int i) {
        this.a = shader;
        this.c = colorStateList;
        this.b = i;
    }

    static kv a(int i) {
        return new kv((Shader) null, (ColorStateList) null, i);
    }

    public final boolean a() {
        return this.a != null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
            r1 = this;
            android.graphics.Shader r0 = r1.a
            if (r0 != 0) goto L_0x0010
            android.content.res.ColorStateList r0 = r1.c
            if (r0 == 0) goto L_0x0010
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L_0x0010
            r0 = 1
            return r0
        L_0x0010:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kv.b():boolean");
    }

    public final boolean c() {
        return a() || this.b != 0;
    }

    public final boolean a(int[] iArr) {
        if (!b()) {
            return false;
        }
        ColorStateList colorStateList = this.c;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.b) {
            return false;
        }
        this.b = colorForState;
        return true;
    }
}
