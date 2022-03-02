package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.io.ByteArrayInputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ddd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class ddd {
    final /* synthetic */ ddf a;
    private int b = 0;

    public ddd(ddf ddf, JSONObject jSONObject) {
        this.a = ddf;
        try {
            this.b = jSONObject.getInt("op") - jSONObject.getInt("ip");
            ddf.g.a(aus.a(new ByteArrayInputStream(jSONObject.toString().getBytes())));
        } catch (JSONException e) {
            this.b = 0;
        }
    }

    public final float a(int i) {
        int i2 = this.b;
        if (i2 != 0) {
            return ((float) i) / ((float) i2);
        }
        return 0.0f;
    }

    public final void a(aqpw aqpw, AnimatorListenerAdapter animatorListenerAdapter) {
        if (this.b != 0) {
            float a2 = a(aqpw.a);
            float a3 = a(aqpw.b);
            this.a.g.d();
            this.a.g.a(a2, a3);
            this.a.g.a(a2);
            this.a.g.a((Animator.AnimatorListener) animatorListenerAdapter);
            this.a.g.a();
        }
    }
}
