package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.SetupWizardLayout;

/* renamed from: ijo  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public final class ijo {
    private SetupWizardLayout a;
    private GlifLayout b;

    public ijo(GlifLayout glifLayout) {
        this.b = glifLayout;
    }

    public static ijo a(Context context, int i) {
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null, false);
        if (inflate instanceof SetupWizardLayout) {
            return new ijo((SetupWizardLayout) inflate);
        }
        if (inflate instanceof GlifLayout) {
            return new ijo((GlifLayout) inflate);
        }
        throw new ClassCastException("SetupWizardLayoutHelper must contain either SetupWizardLayout or GlifLayout");
    }

    public final ViewGroup a() {
        GlifLayout glifLayout = this.b;
        return glifLayout == null ? this.a : glifLayout;
    }

    public final void b() {
        SetupWizardLayout setupWizardLayout = this.a;
        if (setupWizardLayout != null) {
            setupWizardLayout.c().a.setVisibility(8);
        }
    }

    public final void c(boolean z) {
        int i;
        SetupWizardLayout setupWizardLayout = this.a;
        if (setupWizardLayout != null) {
            Button button = setupWizardLayout.c().b;
            if (!z) {
                i = 8;
            } else {
                i = 0;
            }
            button.setVisibility(i);
        }
    }

    public ijo(SetupWizardLayout setupWizardLayout) {
        this.a = setupWizardLayout;
    }

    public final void b(boolean z) {
        SetupWizardLayout setupWizardLayout = this.a;
        if (setupWizardLayout != null) {
            setupWizardLayout.c().a.setEnabled(z);
        }
    }

    public final void a(CharSequence charSequence) {
        GlifLayout glifLayout = this.b;
        if (glifLayout == null) {
            this.a.a(charSequence);
        } else {
            glifLayout.a(charSequence);
        }
    }

    public final void a(boolean z) {
        GlifLayout glifLayout = this.b;
        if (glifLayout == null) {
            this.a.b(z);
        } else {
            glifLayout.b(z);
        }
    }
}
