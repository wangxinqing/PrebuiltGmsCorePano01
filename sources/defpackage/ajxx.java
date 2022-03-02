package defpackage;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* renamed from: ajxx  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ajxx {
    public final TextPaint a = new TextPaint(1);
    public final ajyr b = new ajxv(this);
    public WeakReference c = new WeakReference((Object) null);
    public ajyq d;
    private float e;
    /* access modifiers changed from: private */
    public boolean f = true;

    public ajxx(ajxw ajxw) {
        this.c = new WeakReference(ajxw);
    }

    public final void a() {
        this.f = true;
    }

    public final float a(String str) {
        if (!this.f) {
            return this.e;
        }
        float measureText = str != null ? this.a.measureText(str, 0, str.length()) : 0.0f;
        this.e = measureText;
        this.f = false;
        return measureText;
    }

    public final void a(ajyq ajyq, Context context) {
        if (this.d != ajyq) {
            this.d = ajyq;
            if (ajyq != null) {
                ajyq.b(context, this.a, this.b);
                ajxw ajxw = (ajxw) this.c.get();
                if (ajxw != null) {
                    this.a.drawableState = ajxw.getState();
                }
                ajyq.a(context, this.a, this.b);
                this.f = true;
            }
            ajxw ajxw2 = (ajxw) this.c.get();
            if (ajxw2 != null) {
                ajxw2.c();
                ajxw2.onStateChange(ajxw2.getState());
            }
        }
    }
}
