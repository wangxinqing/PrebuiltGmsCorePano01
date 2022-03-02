package defpackage;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: akcl  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
public abstract class akcl {
    final TextInputLayout k;
    final Context l;
    final CheckableImageButton m;

    public akcl(TextInputLayout textInputLayout) {
        this.k = textInputLayout;
        this.l = textInputLayout.getContext();
        this.m = textInputLayout.l;
    }

    public abstract void a();

    public void a(boolean z) {
    }

    public boolean a(int i) {
        return true;
    }

    public boolean b() {
        return false;
    }
}
