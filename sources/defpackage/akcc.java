package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: akcc  reason: default package */
/* compiled from: :com.google.android.gms@201216073@20.12.16 (080306-306753009) */
final class akcc extends akdb {
    final /* synthetic */ akck b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public akcc(akck akck, TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.b = akck;
    }

    public final void a(View view, qs qsVar) {
        super.a(view, qsVar);
        qsVar.a((CharSequence) Spinner.class.getName());
        if (Build.VERSION.SDK_INT < 26) {
            Bundle j = qsVar.j();
            if (j == null || (j.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & 4) != 4) {
                return;
            }
        } else if (!qsVar.a.isShowingHintText()) {
            return;
        }
        qsVar.e((CharSequence) null);
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        akck akck = this.b;
        EditText editText = akck.k.a;
        int i = akck.j;
        AutoCompleteTextView a = akck.a(editText);
        if (accessibilityEvent.getEventType() == 1 && this.b.h.isTouchExplorationEnabled()) {
            this.b.a(a);
        }
    }
}
