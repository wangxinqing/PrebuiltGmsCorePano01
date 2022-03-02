package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import com.google.android.gms.R;
import java.util.Arrays;

/* renamed from: jnb  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public class jnb extends jmt implements jmc {
    public final Context d;
    public Drawable e;
    public Intent f;
    public jmb g;
    public boolean h = true;
    private CharSequence i;
    private jmw j;

    public jnb(Context context) {
        this.d = context;
    }

    public void a(int i2) {
        this.a = i2;
        h();
    }

    public void a(jmw jmw) {
        this.j = jmw;
    }

    public final void b(int i2) {
        a(this.d.getText(i2));
    }

    public final void c(int i2) {
        b(this.d.getText(i2));
    }

    public void d(int i2) {
        this.b = i2;
        h();
    }

    public int e() {
        return R.layout.common_settings_item;
    }

    public boolean equals(Object obj) {
        return (obj instanceof jnb) && hashCode() == obj.hashCode();
    }

    public jms f() {
        return jmq.a();
    }

    public CharSequence g() {
        return this.i;
    }

    public final void h() {
        int indexOf;
        jmw jmw = this.j;
        if (jmw != null && (indexOf = jmw.d.indexOf(this)) >= 0) {
            jlz jlz = jmw.e;
            if (jlz != null) {
                jlz.d(indexOf);
            }
            boolean z = false;
            if (indexOf > 0 && jlx.a((jly) jmw.d.get(indexOf - 1), this) > 0) {
                z = true;
            }
            if ((indexOf < jmw.d.size() - 1 && jlx.a((jly) jmw.d.get(indexOf + 1), this) < 0) || z) {
                jmw.d.remove(indexOf);
                int c = jmw.c(this);
                jlz jlz2 = jmw.e;
                if (jlz2 != null) {
                    jlz2.a(indexOf, c);
                }
            }
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.i, this.e, Integer.valueOf(a()), b()});
    }

    public void onClick(View view) {
        jmb jmb = this.g;
        if (jmb != null) {
            jmb.a(view, this);
        }
        if (this.f != null) {
            try {
                view.getContext().startActivity(this.f);
            } catch (ActivityNotFoundException e2) {
                Log.d("DefaultSimpleSettingItem", "Failed to start activity", e2);
            }
        }
    }

    public final void a(Intent intent) {
        this.f = intent;
        h();
    }

    public void b(CharSequence charSequence) {
        this.i = charSequence;
        h();
    }

    public final void a(Drawable drawable) {
        this.e = drawable;
        h();
    }

    public void a(CharSequence charSequence) {
        this.c = charSequence;
        h();
    }

    public final void a(jmb jmb) {
        this.g = jmb;
        h();
    }

    public final void a(boolean z) {
        this.h = z;
        h();
    }
}
