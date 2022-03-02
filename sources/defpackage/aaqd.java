package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.Menu;
import com.google.android.gms.R;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.Map;

/* renamed from: aaqd  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class aaqd extends hde {
    /* access modifiers changed from: protected */
    public final Drawable a(int i) {
        return ma.f(yu.b().a((Context) this, i));
    }

    public final void i() {
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.security_settings, menu);
        return super.onCreateOptionsMenu(menu);
    }

    /* access modifiers changed from: protected */
    public final Drawable a(int i, int i2) {
        try {
            Drawable a = a(i);
            if (a == null) {
                return a;
            }
            Drawable mutate = a.mutate();
            ma.a(mutate, kf.b(this, i2));
            return mutate;
        } catch (Exception e) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(Map map, ThemeSettings themeSettings) {
        GoogleHelp a = GoogleHelp.a("android_security");
        a.a((Context) this);
        a.s = themeSettings;
        a.q = Uri.parse((String) ((amsz) iks.g).a);
        a.a(map);
        new nyw(this).a(a.a());
    }
}
