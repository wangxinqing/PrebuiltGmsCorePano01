package defpackage;

import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.chimera.Fragment;
import com.google.android.gms.R;

/* renamed from: adpo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class adpo extends Fragment {
    public adpq a;

    public abstract void a();

    public final void a(int i) {
        a(getString(i));
    }

    public void a(boolean z) {
    }

    public abstract TextView b();

    public final void b(int i) {
        if (c() != null && !amrk.a(getString(i))) {
            c().setText(getString(i));
            c().setVisibility(0);
        }
    }

    public abstract void b(boolean z);

    public abstract TextView c();

    public final void c(int i) {
        c(getString(i));
    }

    public abstract void c(boolean z);

    public abstract TextView d();

    public final void d(int i) {
        if (g() == null) {
            return;
        }
        if (i == 0 || i == 4) {
            g().setVisibility(i);
        }
    }

    public abstract ProgressBar e();

    public abstract TextView f();

    public abstract void f(int i);

    /* access modifiers changed from: protected */
    public abstract TextView g();

    public abstract void g(int i);

    public abstract View h();

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.a = (adpq) activity;
        } catch (ClassCastException e) {
            String valueOf = String.valueOf(activity);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
            sb.append(valueOf);
            sb.append(" must implement OtaUiCallback");
            throw new ClassCastException(sb.toString());
        }
    }

    public static Spanned e(String str) {
        if (amrk.a(str)) {
            return new SpannedString("");
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return Html.fromHtml(str, 63);
        }
        return Html.fromHtml(str);
    }

    public final void c(String str) {
        if (g() == null) {
            return;
        }
        if (amrk.a(str)) {
            d(4);
        } else if (TextUtils.equals(str, g().getText())) {
            d(0);
        } else {
            g().setText(str);
            d(0);
        }
    }

    public final void a(String str) {
        if (amrk.a(str)) {
            str = getString(R.string.system_update_default_title);
        }
        if (b() != null) {
            b().setText(str);
            b().setVisibility(0);
        }
    }

    public final void d(String str) {
        if (f() == null) {
            return;
        }
        if (amrk.a(str)) {
            f().setVisibility(4);
            return;
        }
        f().setText(str);
        f().setVisibility(0);
    }

    public final void b(String str) {
        if (amrk.a(str)) {
            str = getString(R.string.system_update_default_downloading_description);
        }
        if (c() != null) {
            c().setText(e(str));
            c().setVisibility(0);
        }
    }

    public final void e(int i) {
        if (e() != null) {
            if (i == Integer.MIN_VALUE) {
                e().setIndeterminate(false);
                e().setProgress(0);
            } else if (i <= 0) {
                e().setIndeterminate(true);
            } else if (i <= 100) {
                e().setIndeterminate(false);
                e().setProgress(i);
            } else {
                e().setIndeterminate(true);
            }
            e().setVisibility(0);
        }
    }
}
