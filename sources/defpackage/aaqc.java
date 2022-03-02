package defpackage;

import android.content.Context;
import com.google.android.gms.R;
import java.util.Arrays;
import java.util.List;

/* renamed from: aaqc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class aaqc extends jnb {
    public final Context i;
    public final aapx j;
    public CharSequence k;
    public List l;
    public boolean m;

    public aaqc(Context context, aapx aapx) {
        super(context);
        this.i = context;
        this.j = aapx;
    }

    public final void a(int i2) {
        super.a(i2);
        h();
    }

    public final void b(CharSequence charSequence) {
        this.k = charSequence;
        h();
    }

    public final void d(int i2) {
        super.d(i2);
        h();
    }

    public final int e() {
        return R.layout.scanned_apps_settings_item;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aaqc) {
            aaqc aaqc = (aaqc) obj;
            return this.b == aaqc.b && ius.a(this.c, aaqc.c) && ius.a(this.k, aaqc.k);
        }
    }

    public final jms f() {
        return aapy.a;
    }

    public final CharSequence g() {
        return this.k;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.k, Integer.valueOf(this.b), this.c});
    }

    public final void a(CharSequence charSequence) {
        super.a(charSequence);
        h();
    }
}
